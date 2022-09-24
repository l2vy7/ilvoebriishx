package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.C6871m;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.SinglePeriodTimeline;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.source.rtsp.RtspClient;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C4766t;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;

public final class RtspMediaSource extends BaseMediaSource {
    /* access modifiers changed from: private */
    public final MediaItem mediaItem;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    private RtspClient rtspClient;
    /* access modifiers changed from: private */
    public C4766t<RtspMediaTrack> rtspMediaTracks;
    /* access modifiers changed from: private */
    public IOException sourcePrepareException;

    public static final class Factory implements MediaSourceFactory {
        public /* synthetic */ MediaSource createMediaSource(Uri uri) {
            return C6871m.m28652a(this, uri);
        }

        public int[] getSupportedTypes() {
            return new int[]{3};
        }

        @Deprecated
        public Factory setDrmHttpDataSourceFactory(HttpDataSource.Factory factory) {
            return this;
        }

        @Deprecated
        public Factory setDrmSessionManager(DrmSessionManager drmSessionManager) {
            return this;
        }

        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Deprecated
        public Factory setDrmUserAgent(String str) {
            return this;
        }

        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        public /* synthetic */ MediaSourceFactory setStreamKeys(List list) {
            return C6871m.m28653b(this, list);
        }

        public RtspMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.playbackProperties);
            return new RtspMediaSource(mediaItem);
        }
    }

    public static final class RtspPlaybackException extends IOException {
        public RtspPlaybackException(String str) {
            super(str);
        }

        public RtspPlaybackException(Throwable th) {
            super(th);
        }

        public RtspPlaybackException(String str, Throwable th) {
            super(str, th);
        }
    }

    private final class SessionInfoListenerImpl implements RtspClient.SessionInfoListener {
        private SessionInfoListenerImpl() {
        }

        public void onSessionTimelineRequestFailed(String str, Throwable th) {
            if (th == null) {
                IOException unused = RtspMediaSource.this.sourcePrepareException = new RtspPlaybackException(str);
            } else {
                IOException unused2 = RtspMediaSource.this.sourcePrepareException = new RtspPlaybackException(str, (Throwable) Util.castNonNull(th));
            }
        }

        public void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, C4766t<RtspMediaTrack> tVar) {
            C4766t unused = RtspMediaSource.this.rtspMediaTracks = tVar;
            RtspMediaSource.this.refreshSourceInfo(new SinglePeriodTimeline(C6540C.msToUs(rtspSessionTiming.getDurationMs()), !rtspSessionTiming.isLive(), false, rtspSessionTiming.isLive(), (Object) null, RtspMediaSource.this.mediaItem));
        }
    }

    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return new RtspMediaPeriod(allocator, (List) Assertions.checkNotNull(this.rtspMediaTracks), (RtspClient) Assertions.checkNotNull(this.rtspClient), this.rtpDataChannelFactory);
    }

    public MediaItem getMediaItem() {
        return this.mediaItem;
    }

    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IOException iOException = this.sourcePrepareException;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* access modifiers changed from: protected */
    public void prepareSourceInternal(TransferListener transferListener) {
        Assertions.checkNotNull(this.mediaItem.playbackProperties);
        try {
            RtspClient rtspClient2 = new RtspClient(new SessionInfoListenerImpl(), ExoPlayerLibraryInfo.VERSION_SLASHY, this.mediaItem.playbackProperties.uri);
            this.rtspClient = rtspClient2;
            rtspClient2.start();
        } catch (IOException e) {
            this.sourcePrepareException = new RtspPlaybackException("RtspClient not opened.", e);
        }
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((RtspMediaPeriod) mediaPeriod).release();
    }

    /* access modifiers changed from: protected */
    public void releaseSourceInternal() {
        Util.closeQuietly((Closeable) this.rtspClient);
    }

    private RtspMediaSource(MediaItem mediaItem2) {
        this.mediaItem = mediaItem2;
        this.rtpDataChannelFactory = new UdpDataSourceRtpDataChannelFactory();
    }
}
