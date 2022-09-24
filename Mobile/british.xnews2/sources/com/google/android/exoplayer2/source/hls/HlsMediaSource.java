package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.SinglePeriodTimeline;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.FilteringHlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

public final class HlsMediaSource extends BaseMediaSource implements HlsPlaylistTracker.PrimaryPlaylistListener {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final boolean allowChunklessPreparation;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final HlsDataSourceFactory dataSourceFactory;
    private final DrmSessionManager drmSessionManager;
    private final long elapsedRealTimeOffsetMs;
    private final HlsExtractorFactory extractorFactory;
    private MediaItem.LiveConfiguration liveConfiguration;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final MediaItem mediaItem;
    private TransferListener mediaTransferListener;
    private final int metadataType;
    private final MediaItem.PlaybackProperties playbackProperties;
    private final HlsPlaylistTracker playlistTracker;
    private final boolean useSessionKeys;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MetadataType {
    }

    public static final class Factory implements MediaSourceFactory {
        private boolean allowChunklessPreparation;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private long elapsedRealTimeOffsetMs;
        private HlsExtractorFactory extractorFactory;
        private final HlsDataSourceFactory hlsDataSourceFactory;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private int metadataType;
        private HlsPlaylistParserFactory playlistParserFactory;
        private HlsPlaylistTracker.Factory playlistTrackerFactory;
        private List<StreamKey> streamKeys;
        private Object tag;
        private boolean useSessionKeys;
        private boolean usingCustomDrmSessionManagerProvider;

        public Factory(DataSource.Factory factory) {
            this((HlsDataSourceFactory) new DefaultHlsDataSourceFactory(factory));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ DrmSessionManager lambda$setDrmSessionManager$0(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
            return drmSessionManager;
        }

        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        public Factory setAllowChunklessPreparation(boolean z) {
            this.allowChunklessPreparation = z;
            return this;
        }

        public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory2) {
            if (compositeSequenceableLoaderFactory2 == null) {
                compositeSequenceableLoaderFactory2 = new DefaultCompositeSequenceableLoaderFactory();
            }
            this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory2;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Factory setElapsedRealTimeOffsetMs(long j) {
            this.elapsedRealTimeOffsetMs = j;
            return this;
        }

        public Factory setExtractorFactory(HlsExtractorFactory hlsExtractorFactory) {
            if (hlsExtractorFactory == null) {
                hlsExtractorFactory = HlsExtractorFactory.DEFAULT;
            }
            this.extractorFactory = hlsExtractorFactory;
            return this;
        }

        public Factory setMetadataType(int i) {
            this.metadataType = i;
            return this;
        }

        public Factory setPlaylistParserFactory(HlsPlaylistParserFactory hlsPlaylistParserFactory) {
            if (hlsPlaylistParserFactory == null) {
                hlsPlaylistParserFactory = new DefaultHlsPlaylistParserFactory();
            }
            this.playlistParserFactory = hlsPlaylistParserFactory;
            return this;
        }

        public Factory setPlaylistTrackerFactory(HlsPlaylistTracker.Factory factory) {
            if (factory == null) {
                factory = DefaultHlsPlaylistTracker.FACTORY;
            }
            this.playlistTrackerFactory = factory;
            return this;
        }

        @Deprecated
        public Factory setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Factory setUseSessionKeys(boolean z) {
            this.useSessionKeys = z;
            return this;
        }

        public Factory(HlsDataSourceFactory hlsDataSourceFactory2) {
            this.hlsDataSourceFactory = (HlsDataSourceFactory) Assertions.checkNotNull(hlsDataSourceFactory2);
            this.drmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            this.playlistParserFactory = new DefaultHlsPlaylistParserFactory();
            this.playlistTrackerFactory = DefaultHlsPlaylistTracker.FACTORY;
            this.extractorFactory = HlsExtractorFactory.DEFAULT;
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
            this.metadataType = 1;
            this.streamKeys = Collections.emptyList();
            this.elapsedRealTimeOffsetMs = C6540C.TIME_UNSET;
        }

        public Factory setDrmHttpDataSourceFactory(HttpDataSource.Factory factory) {
            if (!this.usingCustomDrmSessionManagerProvider) {
                ((DefaultDrmSessionManagerProvider) this.drmSessionManagerProvider).setDrmHttpDataSourceFactory(factory);
            }
            return this;
        }

        public Factory setDrmSessionManager(DrmSessionManager drmSessionManager) {
            if (drmSessionManager == null) {
                setDrmSessionManagerProvider((DrmSessionManagerProvider) null);
            } else {
                setDrmSessionManagerProvider((DrmSessionManagerProvider) new C6859a(drmSessionManager));
            }
            return this;
        }

        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider2) {
            if (drmSessionManagerProvider2 != null) {
                this.drmSessionManagerProvider = drmSessionManagerProvider2;
                this.usingCustomDrmSessionManagerProvider = true;
            } else {
                this.drmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
                this.usingCustomDrmSessionManagerProvider = false;
            }
            return this;
        }

        public Factory setDrmUserAgent(String str) {
            if (!this.usingCustomDrmSessionManagerProvider) {
                ((DefaultDrmSessionManagerProvider) this.drmSessionManagerProvider).setDrmUserAgent(str);
            }
            return this;
        }

        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy2) {
            if (loadErrorHandlingPolicy2 == null) {
                loadErrorHandlingPolicy2 = new DefaultLoadErrorHandlingPolicy();
            }
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy2;
            return this;
        }

        @Deprecated
        public Factory setStreamKeys(List<StreamKey> list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.streamKeys = list;
            return this;
        }

        @Deprecated
        public HlsMediaSource createMediaSource(Uri uri) {
            return createMediaSource(new MediaItem.Builder().setUri(uri).setMimeType(MimeTypes.APPLICATION_M3U8).build());
        }

        public HlsMediaSource createMediaSource(MediaItem mediaItem) {
            List<StreamKey> list;
            MediaItem mediaItem2 = mediaItem;
            Assertions.checkNotNull(mediaItem2.playbackProperties);
            HlsPlaylistParserFactory hlsPlaylistParserFactory = this.playlistParserFactory;
            if (mediaItem2.playbackProperties.streamKeys.isEmpty()) {
                list = this.streamKeys;
            } else {
                list = mediaItem2.playbackProperties.streamKeys;
            }
            if (!list.isEmpty()) {
                hlsPlaylistParserFactory = new FilteringHlsPlaylistParserFactory(hlsPlaylistParserFactory, list);
            }
            MediaItem.PlaybackProperties playbackProperties = mediaItem2.playbackProperties;
            boolean z = true;
            boolean z2 = playbackProperties.tag == null && this.tag != null;
            if (!playbackProperties.streamKeys.isEmpty() || list.isEmpty()) {
                z = false;
            }
            if (z2 && z) {
                mediaItem2 = mediaItem.buildUpon().setTag(this.tag).setStreamKeys(list).build();
            } else if (z2) {
                mediaItem2 = mediaItem.buildUpon().setTag(this.tag).build();
            } else if (z) {
                mediaItem2 = mediaItem.buildUpon().setStreamKeys(list).build();
            }
            MediaItem mediaItem3 = mediaItem2;
            HlsDataSourceFactory hlsDataSourceFactory2 = this.hlsDataSourceFactory;
            HlsExtractorFactory hlsExtractorFactory = this.extractorFactory;
            CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory2 = this.compositeSequenceableLoaderFactory;
            DrmSessionManager drmSessionManager = this.drmSessionManagerProvider.get(mediaItem3);
            LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
            return new HlsMediaSource(mediaItem3, hlsDataSourceFactory2, hlsExtractorFactory, compositeSequenceableLoaderFactory2, drmSessionManager, loadErrorHandlingPolicy2, this.playlistTrackerFactory.createTracker(this.hlsDataSourceFactory, loadErrorHandlingPolicy2, hlsPlaylistParserFactory), this.elapsedRealTimeOffsetMs, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys);
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.hls");
    }

    private long getLiveEdgeOffsetUs(HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist.hasProgramDateTime) {
            return C6540C.msToUs(Util.getNowUnixTimeMs(this.elapsedRealTimeOffsetMs)) - hlsMediaPlaylist.getEndTimeUs();
        }
        return 0;
    }

    private static long getTargetLiveOffsetUs(HlsMediaPlaylist hlsMediaPlaylist, long j) {
        long j2;
        HlsMediaPlaylist.ServerControl serverControl = hlsMediaPlaylist.serverControl;
        long j3 = hlsMediaPlaylist.startOffsetUs;
        if (j3 != C6540C.TIME_UNSET) {
            j2 = hlsMediaPlaylist.durationUs - j3;
        } else {
            long j4 = serverControl.partHoldBackUs;
            if (j4 == C6540C.TIME_UNSET || hlsMediaPlaylist.partTargetDurationUs == C6540C.TIME_UNSET) {
                long j5 = serverControl.holdBackUs;
                if (j5 != C6540C.TIME_UNSET) {
                    j2 = j5;
                } else {
                    j2 = hlsMediaPlaylist.targetDurationUs * 3;
                }
            } else {
                j2 = j4;
            }
        }
        return j2 + j;
    }

    private long getWindowDefaultStartPosition(HlsMediaPlaylist hlsMediaPlaylist, long j) {
        List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
        int size = list.size() - 1;
        long msToUs = (hlsMediaPlaylist.durationUs + j) - C6540C.msToUs(this.liveConfiguration.targetOffsetMs);
        while (size > 0 && list.get(size).relativeStartTimeUs > msToUs) {
            size--;
        }
        return list.get(size).relativeStartTimeUs;
    }

    private void maybeUpdateMediaItem(long j) {
        long usToMs = C6540C.usToMs(j);
        if (usToMs != this.liveConfiguration.targetOffsetMs) {
            this.liveConfiguration = this.mediaItem.buildUpon().setLiveTargetOffsetMs(usToMs).build().liveConfiguration;
        }
    }

    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaSourceEventListener.EventDispatcher createEventDispatcher = createEventDispatcher(mediaPeriodId);
        return new HlsMediaPeriod(this.extractorFactory, this.playlistTracker, this.dataSourceFactory, this.mediaTransferListener, this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadErrorHandlingPolicy, createEventDispatcher, allocator, this.compositeSequenceableLoaderFactory, this.allowChunklessPreparation, this.metadataType, this.useSessionKeys);
    }

    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Deprecated
    public Object getTag() {
        return this.playbackProperties.tag;
    }

    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.playlistTracker.maybeThrowPrimaryPlaylistRefreshError();
    }

    public void onPrimaryPlaylistRefreshed(HlsMediaPlaylist hlsMediaPlaylist) {
        SinglePeriodTimeline singlePeriodTimeline;
        long j;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        long usToMs = hlsMediaPlaylist2.hasProgramDateTime ? C6540C.usToMs(hlsMediaPlaylist2.startTimeUs) : -9223372036854775807L;
        int i = hlsMediaPlaylist2.playlistType;
        long j2 = (i == 2 || i == 1) ? usToMs : -9223372036854775807L;
        long j3 = hlsMediaPlaylist2.startOffsetUs;
        HlsManifest hlsManifest = new HlsManifest((HlsMasterPlaylist) Assertions.checkNotNull(this.playlistTracker.getMasterPlaylist()), hlsMediaPlaylist2);
        if (this.playlistTracker.isLive()) {
            long liveEdgeOffsetUs = getLiveEdgeOffsetUs(hlsMediaPlaylist);
            long j4 = this.liveConfiguration.targetOffsetMs;
            if (j4 != C6540C.TIME_UNSET) {
                j = C6540C.msToUs(j4);
            } else {
                j = getTargetLiveOffsetUs(hlsMediaPlaylist2, liveEdgeOffsetUs);
            }
            maybeUpdateMediaItem(Util.constrainValue(j, liveEdgeOffsetUs, hlsMediaPlaylist2.durationUs + liveEdgeOffsetUs));
            long initialStartTimeUs = hlsMediaPlaylist2.startTimeUs - this.playlistTracker.getInitialStartTimeUs();
            singlePeriodTimeline = new SinglePeriodTimeline(j2, usToMs, (long) C6540C.TIME_UNSET, hlsMediaPlaylist2.hasEndTag ? initialStartTimeUs + hlsMediaPlaylist2.durationUs : -9223372036854775807L, hlsMediaPlaylist2.durationUs, initialStartTimeUs, !hlsMediaPlaylist2.segments.isEmpty() ? getWindowDefaultStartPosition(hlsMediaPlaylist2, liveEdgeOffsetUs) : j3 == C6540C.TIME_UNSET ? 0 : j3, true, !hlsMediaPlaylist2.hasEndTag, (Object) hlsManifest, this.mediaItem, this.liveConfiguration);
        } else {
            long j5 = j3 == C6540C.TIME_UNSET ? 0 : j3;
            long j6 = hlsMediaPlaylist2.durationUs;
            singlePeriodTimeline = new SinglePeriodTimeline(j2, usToMs, (long) C6540C.TIME_UNSET, j6, j6, 0, j5, true, false, (Object) hlsManifest, this.mediaItem, (MediaItem.LiveConfiguration) null);
        }
        refreshSourceInfo(singlePeriodTimeline);
    }

    /* access modifiers changed from: protected */
    public void prepareSourceInternal(TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.drmSessionManager.prepare();
        this.playlistTracker.start(this.playbackProperties.uri, createEventDispatcher((MediaSource.MediaPeriodId) null), this);
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((HlsMediaPeriod) mediaPeriod).release();
    }

    /* access modifiers changed from: protected */
    public void releaseSourceInternal() {
        this.playlistTracker.stop();
        this.drmSessionManager.release();
    }

    private HlsMediaSource(MediaItem mediaItem2, HlsDataSourceFactory hlsDataSourceFactory, HlsExtractorFactory hlsExtractorFactory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory2, DrmSessionManager drmSessionManager2, LoadErrorHandlingPolicy loadErrorHandlingPolicy2, HlsPlaylistTracker hlsPlaylistTracker, long j, boolean z, int i, boolean z2) {
        this.playbackProperties = (MediaItem.PlaybackProperties) Assertions.checkNotNull(mediaItem2.playbackProperties);
        this.mediaItem = mediaItem2;
        this.liveConfiguration = mediaItem2.liveConfiguration;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.extractorFactory = hlsExtractorFactory;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory2;
        this.drmSessionManager = drmSessionManager2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy2;
        this.playlistTracker = hlsPlaylistTracker;
        this.elapsedRealTimeOffsetMs = j;
        this.allowChunklessPreparation = z;
        this.metadataType = i;
        this.useSessionKeys = z2;
    }
}
