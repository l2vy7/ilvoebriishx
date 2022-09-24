package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaPeriod;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.util.List;

public final class ProgressiveMediaSource extends BaseMediaSource implements ProgressiveMediaPeriod.Listener {
    public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 1048576;
    private final int continueLoadingCheckIntervalBytes;
    private final DataSource.Factory dataSourceFactory;
    private final DrmSessionManager drmSessionManager;
    private final LoadErrorHandlingPolicy loadableLoadErrorHandlingPolicy;
    private final MediaItem mediaItem;
    private final MediaItem.PlaybackProperties playbackProperties;
    private final ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;
    private long timelineDurationUs;
    private boolean timelineIsLive;
    private boolean timelineIsPlaceholder;
    private boolean timelineIsSeekable;
    private TransferListener transferListener;

    public static final class Factory implements MediaSourceFactory {
        private int continueLoadingCheckIntervalBytes;
        private String customCacheKey;
        private final DataSource.Factory dataSourceFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private ProgressiveMediaExtractor.Factory progressiveMediaExtractorFactory;
        private Object tag;
        private boolean usingCustomDrmSessionManagerProvider;

        public Factory(DataSource.Factory factory) {
            this(factory, (ExtractorsFactory) new DefaultExtractorsFactory());
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ ProgressiveMediaExtractor lambda$new$0(ExtractorsFactory extractorsFactory) {
            return new BundledExtractorsAdapter(extractorsFactory);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ DrmSessionManager lambda$setDrmSessionManager$2(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
            return drmSessionManager;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ ProgressiveMediaExtractor lambda$setExtractorsFactory$1(ExtractorsFactory extractorsFactory) {
            if (extractorsFactory == null) {
                extractorsFactory = new DefaultExtractorsFactory();
            }
            return new BundledExtractorsAdapter(extractorsFactory);
        }

        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        public Factory setContinueLoadingCheckIntervalBytes(int i) {
            this.continueLoadingCheckIntervalBytes = i;
            return this;
        }

        @Deprecated
        public Factory setCustomCacheKey(String str) {
            this.customCacheKey = str;
            return this;
        }

        @Deprecated
        public Factory setExtractorsFactory(ExtractorsFactory extractorsFactory) {
            this.progressiveMediaExtractorFactory = new C6897s(extractorsFactory);
            return this;
        }

        public /* synthetic */ MediaSourceFactory setStreamKeys(List list) {
            return C6871m.m28653b(this, list);
        }

        @Deprecated
        public Factory setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Factory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
            this(factory, (ProgressiveMediaExtractor.Factory) new C6877r(extractorsFactory));
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
                setDrmSessionManagerProvider((DrmSessionManagerProvider) new C6876q(drmSessionManager));
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

        public Factory(DataSource.Factory factory, ProgressiveMediaExtractor.Factory factory2) {
            this.dataSourceFactory = factory;
            this.progressiveMediaExtractorFactory = factory2;
            this.drmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.continueLoadingCheckIntervalBytes = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        }

        @Deprecated
        public ProgressiveMediaSource createMediaSource(Uri uri) {
            return createMediaSource(new MediaItem.Builder().setUri(uri).build());
        }

        public ProgressiveMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.playbackProperties);
            MediaItem.PlaybackProperties playbackProperties = mediaItem.playbackProperties;
            boolean z = true;
            boolean z2 = playbackProperties.tag == null && this.tag != null;
            if (playbackProperties.customCacheKey != null || this.customCacheKey == null) {
                z = false;
            }
            if (z2 && z) {
                mediaItem = mediaItem.buildUpon().setTag(this.tag).setCustomCacheKey(this.customCacheKey).build();
            } else if (z2) {
                mediaItem = mediaItem.buildUpon().setTag(this.tag).build();
            } else if (z) {
                mediaItem = mediaItem.buildUpon().setCustomCacheKey(this.customCacheKey).build();
            }
            MediaItem mediaItem2 = mediaItem;
            return new ProgressiveMediaSource(mediaItem2, this.dataSourceFactory, this.progressiveMediaExtractorFactory, this.drmSessionManagerProvider.get(mediaItem2), this.loadErrorHandlingPolicy, this.continueLoadingCheckIntervalBytes);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.exoplayer2.source.ProgressiveMediaSource$1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void notifySourceInfoRefreshed() {
        /*
            r9 = this;
            com.google.android.exoplayer2.source.SinglePeriodTimeline r8 = new com.google.android.exoplayer2.source.SinglePeriodTimeline
            long r1 = r9.timelineDurationUs
            boolean r3 = r9.timelineIsSeekable
            boolean r5 = r9.timelineIsLive
            com.google.android.exoplayer2.MediaItem r7 = r9.mediaItem
            r4 = 0
            r6 = 0
            r0 = r8
            r0.<init>((long) r1, (boolean) r3, (boolean) r4, (boolean) r5, (java.lang.Object) r6, (com.google.android.exoplayer2.MediaItem) r7)
            boolean r0 = r9.timelineIsPlaceholder
            if (r0 == 0) goto L_0x001a
            com.google.android.exoplayer2.source.ProgressiveMediaSource$1 r0 = new com.google.android.exoplayer2.source.ProgressiveMediaSource$1
            r0.<init>(r9, r8)
            r8 = r0
        L_0x001a:
            r9.refreshSourceInfo(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ProgressiveMediaSource.notifySourceInfoRefreshed():void");
    }

    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        DataSource createDataSource = this.dataSourceFactory.createDataSource();
        TransferListener transferListener2 = this.transferListener;
        if (transferListener2 != null) {
            createDataSource.addTransferListener(transferListener2);
        }
        return new ProgressiveMediaPeriod(this.playbackProperties.uri, createDataSource, this.progressiveMediaExtractorFactory.createProgressiveMediaExtractor(), this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadableLoadErrorHandlingPolicy, createEventDispatcher(mediaPeriodId), this, allocator, this.playbackProperties.customCacheKey, this.continueLoadingCheckIntervalBytes);
    }

    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Deprecated
    public Object getTag() {
        return this.playbackProperties.tag;
    }

    public void maybeThrowSourceInfoRefreshError() {
    }

    public void onSourceInfoRefreshed(long j, boolean z, boolean z2) {
        if (j == C6540C.TIME_UNSET) {
            j = this.timelineDurationUs;
        }
        if (this.timelineIsPlaceholder || this.timelineDurationUs != j || this.timelineIsSeekable != z || this.timelineIsLive != z2) {
            this.timelineDurationUs = j;
            this.timelineIsSeekable = z;
            this.timelineIsLive = z2;
            this.timelineIsPlaceholder = false;
            notifySourceInfoRefreshed();
        }
    }

    /* access modifiers changed from: protected */
    public void prepareSourceInternal(TransferListener transferListener2) {
        this.transferListener = transferListener2;
        this.drmSessionManager.prepare();
        notifySourceInfoRefreshed();
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((ProgressiveMediaPeriod) mediaPeriod).release();
    }

    /* access modifiers changed from: protected */
    public void releaseSourceInternal() {
        this.drmSessionManager.release();
    }

    private ProgressiveMediaSource(MediaItem mediaItem2, DataSource.Factory factory, ProgressiveMediaExtractor.Factory factory2, DrmSessionManager drmSessionManager2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, int i) {
        this.playbackProperties = (MediaItem.PlaybackProperties) Assertions.checkNotNull(mediaItem2.playbackProperties);
        this.mediaItem = mediaItem2;
        this.dataSourceFactory = factory;
        this.progressiveMediaExtractorFactory = factory2;
        this.drmSessionManager = drmSessionManager2;
        this.loadableLoadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.continueLoadingCheckIntervalBytes = i;
        this.timelineIsPlaceholder = true;
        this.timelineDurationUs = C6540C.TIME_UNSET;
    }
}
