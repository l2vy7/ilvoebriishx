package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.source.rtsp.RtspClient;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C4766t;
import java.io.IOException;
import java.net.BindException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

final class RtspMediaPeriod implements MediaPeriod {
    private static final int PORT_BINDING_MAX_RETRY_COUNT = 3;
    /* access modifiers changed from: private */
    public final Allocator allocator;
    private MediaPeriod.Callback callback;
    /* access modifiers changed from: private */
    public final Handler handler = Util.createHandlerForCurrentLooper();
    /* access modifiers changed from: private */
    public boolean hasRetriedWithRtpTcp;
    /* access modifiers changed from: private */
    public final InternalListener internalListener;
    private boolean loadingFinished;
    /* access modifiers changed from: private */
    public long pendingSeekPositionUs;
    /* access modifiers changed from: private */
    public RtspMediaSource.RtspPlaybackException playbackException;
    private int portBindingRetryCount;
    /* access modifiers changed from: private */
    public IOException preparationError;
    /* access modifiers changed from: private */
    public boolean prepared;
    private boolean released;
    /* access modifiers changed from: private */
    public final RtspClient rtspClient;
    /* access modifiers changed from: private */
    public final List<RtspLoaderWrapper> rtspLoaderWrappers;
    /* access modifiers changed from: private */
    public final List<RtpLoadInfo> selectedLoadInfos;
    private C4766t<TrackGroup> trackGroups;
    private boolean trackSelected;

    private final class InternalListener implements ExtractorOutput, Loader.Callback<RtpDataLoadable>, SampleQueue.UpstreamFormatChangedListener, RtspClient.PlaybackEventListener {
        private InternalListener() {
        }

        private Loader.LoadErrorAction handleSocketTimeout(RtpDataLoadable rtpDataLoadable) {
            if (RtspMediaPeriod.this.getBufferedPositionUs() == Long.MIN_VALUE) {
                if (!RtspMediaPeriod.this.hasRetriedWithRtpTcp) {
                    RtspMediaPeriod.this.retryWithRtpTcp();
                    boolean unused = RtspMediaPeriod.this.hasRetriedWithRtpTcp = true;
                }
                return Loader.DONT_RETRY;
            }
            int i = 0;
            while (true) {
                if (i >= RtspMediaPeriod.this.rtspLoaderWrappers.size()) {
                    break;
                }
                RtspLoaderWrapper rtspLoaderWrapper = (RtspLoaderWrapper) RtspMediaPeriod.this.rtspLoaderWrappers.get(i);
                if (rtspLoaderWrapper.loadInfo.loadable == rtpDataLoadable) {
                    rtspLoaderWrapper.cancelLoad();
                    break;
                }
                i++;
            }
            RtspMediaSource.RtspPlaybackException unused2 = RtspMediaPeriod.this.playbackException = new RtspMediaSource.RtspPlaybackException("Unknown loadable timed out.");
            return Loader.DONT_RETRY;
        }

        public void endTracks() {
        }

        public void onLoadCanceled(RtpDataLoadable rtpDataLoadable, long j, long j2, boolean z) {
        }

        public void onLoadCompleted(RtpDataLoadable rtpDataLoadable, long j, long j2) {
        }

        public void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
            RtspMediaSource.RtspPlaybackException unused = RtspMediaPeriod.this.playbackException = rtspPlaybackException;
        }

        public void onPlaybackStarted(long j, C4766t<RtspTrackTiming> tVar) {
            ArrayList arrayList = new ArrayList(tVar.size());
            for (int i = 0; i < tVar.size(); i++) {
                arrayList.add(tVar.get(i).uri);
            }
            for (int i2 = 0; i2 < RtspMediaPeriod.this.selectedLoadInfos.size(); i2++) {
                RtpLoadInfo rtpLoadInfo = (RtpLoadInfo) RtspMediaPeriod.this.selectedLoadInfos.get(i2);
                if (!arrayList.contains(rtpLoadInfo.getTrackUri())) {
                    RtspMediaPeriod rtspMediaPeriod = RtspMediaPeriod.this;
                    String valueOf = String.valueOf(rtpLoadInfo.getTrackUri());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                    sb.append("Server did not provide timing for track ");
                    sb.append(valueOf);
                    RtspMediaSource.RtspPlaybackException unused = rtspMediaPeriod.playbackException = new RtspMediaSource.RtspPlaybackException(sb.toString());
                    return;
                }
            }
            for (int i3 = 0; i3 < tVar.size(); i3++) {
                RtspTrackTiming rtspTrackTiming = tVar.get(i3);
                RtpDataLoadable access$1200 = RtspMediaPeriod.this.getLoadableByTrackUri(rtspTrackTiming.uri);
                if (access$1200 != null) {
                    access$1200.setTimestamp(rtspTrackTiming.rtpTimestamp);
                    access$1200.setSequenceNumber(rtspTrackTiming.sequenceNumber);
                    if (RtspMediaPeriod.this.isSeekPending()) {
                        access$1200.seekToUs(j, rtspTrackTiming.rtpTimestamp);
                    }
                }
            }
            if (RtspMediaPeriod.this.isSeekPending()) {
                long unused2 = RtspMediaPeriod.this.pendingSeekPositionUs = C6540C.TIME_UNSET;
            }
        }

        public void onRtspSetupCompleted() {
            RtspMediaPeriod.this.rtspClient.startPlayback(0);
        }

        public void onUpstreamFormatChanged(Format format) {
            RtspMediaPeriod.this.handler.post(new C6889c(RtspMediaPeriod.this));
        }

        public void seekMap(SeekMap seekMap) {
        }

        public TrackOutput track(int i, int i2) {
            return ((RtspLoaderWrapper) Assertions.checkNotNull((RtspLoaderWrapper) RtspMediaPeriod.this.rtspLoaderWrappers.get(i))).sampleQueue;
        }

        public Loader.LoadErrorAction onLoadError(RtpDataLoadable rtpDataLoadable, long j, long j2, IOException iOException, int i) {
            if (!RtspMediaPeriod.this.prepared) {
                IOException unused = RtspMediaPeriod.this.preparationError = iOException;
            } else if (iOException.getCause() instanceof SocketTimeoutException) {
                return handleSocketTimeout(rtpDataLoadable);
            } else {
                if (!(iOException.getCause() instanceof BindException)) {
                    RtspMediaSource.RtspPlaybackException unused2 = RtspMediaPeriod.this.playbackException = new RtspMediaSource.RtspPlaybackException(rtpDataLoadable.rtspMediaTrack.uri.toString(), iOException);
                } else if (RtspMediaPeriod.access$708(RtspMediaPeriod.this) < 3) {
                    return Loader.RETRY;
                }
            }
            return Loader.DONT_RETRY;
        }
    }

    final class RtpLoadInfo {
        /* access modifiers changed from: private */
        public final RtpDataLoadable loadable;
        public final RtspMediaTrack mediaTrack;
        private String transport;

        public RtpLoadInfo(RtspMediaTrack rtspMediaTrack, int i, RtpDataChannel.Factory factory) {
            this.mediaTrack = rtspMediaTrack;
            this.loadable = new RtpDataLoadable(i, rtspMediaTrack, new C6890d(this), RtspMediaPeriod.this.internalListener, factory);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(String str, RtpDataChannel rtpDataChannel) {
            this.transport = str;
            if (rtpDataChannel.usesSidebandBinaryData()) {
                RtspMediaPeriod.this.rtspClient.registerInterleavedDataChannel(rtpDataChannel);
            }
            RtspMediaPeriod.this.maybeSetupTracks();
        }

        public Uri getTrackUri() {
            return this.loadable.rtspMediaTrack.uri;
        }

        public String getTransport() {
            Assertions.checkStateNotNull(this.transport);
            return this.transport;
        }

        public boolean isTransportReady() {
            return this.transport != null;
        }
    }

    private final class RtspLoaderWrapper {
        /* access modifiers changed from: private */
        public boolean canceled;
        public final RtpLoadInfo loadInfo;
        private final Loader loader;
        private boolean released;
        /* access modifiers changed from: private */
        public final SampleQueue sampleQueue;

        public RtspLoaderWrapper(RtspMediaTrack rtspMediaTrack, int i, RtpDataChannel.Factory factory) {
            this.loadInfo = new RtpLoadInfo(rtspMediaTrack, i, factory);
            StringBuilder sb = new StringBuilder(55);
            sb.append("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ");
            sb.append(i);
            this.loader = new Loader(sb.toString());
            SampleQueue createWithoutDrm = SampleQueue.createWithoutDrm(RtspMediaPeriod.this.allocator);
            this.sampleQueue = createWithoutDrm;
            createWithoutDrm.setUpstreamFormatChangeListener(RtspMediaPeriod.this.internalListener);
        }

        public void cancelLoad() {
            if (!this.canceled) {
                this.loadInfo.loadable.cancelLoad();
                this.canceled = true;
                RtspMediaPeriod.this.updateLoadingFinished();
            }
        }

        public boolean isSampleQueueReady() {
            return this.sampleQueue.isReady(this.canceled);
        }

        public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            return this.sampleQueue.read(formatHolder, decoderInputBuffer, i, this.canceled);
        }

        public void release() {
            if (!this.released) {
                this.loader.release();
                this.sampleQueue.release();
                this.released = true;
            }
        }

        public void seekTo(long j) {
            this.loadInfo.loadable.resetForSeek();
            this.sampleQueue.reset();
            this.sampleQueue.setStartTimeUs(j);
        }

        public void startLoading() {
            this.loader.startLoading(this.loadInfo.loadable, RtspMediaPeriod.this.internalListener, 0);
        }
    }

    private final class SampleStreamImpl implements SampleStream {
        private final int track;

        public SampleStreamImpl(int i) {
            this.track = i;
        }

        public boolean isReady() {
            return RtspMediaPeriod.this.isReady(this.track);
        }

        public void maybeThrowError() throws RtspMediaSource.RtspPlaybackException {
            if (RtspMediaPeriod.this.playbackException != null) {
                throw RtspMediaPeriod.this.playbackException;
            }
        }

        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            return RtspMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, i);
        }

        public int skipData(long j) {
            return 0;
        }
    }

    public RtspMediaPeriod(Allocator allocator2, List<RtspMediaTrack> list, RtspClient rtspClient2, RtpDataChannel.Factory factory) {
        this.allocator = allocator2;
        InternalListener internalListener2 = new InternalListener();
        this.internalListener = internalListener2;
        this.rtspLoaderWrappers = new ArrayList(list.size());
        this.rtspClient = rtspClient2;
        rtspClient2.setPlaybackEventListener(internalListener2);
        for (int i = 0; i < list.size(); i++) {
            this.rtspLoaderWrappers.add(new RtspLoaderWrapper(list.get(i), i, factory));
        }
        this.selectedLoadInfos = new ArrayList(list.size());
        this.pendingSeekPositionUs = C6540C.TIME_UNSET;
    }

    static /* synthetic */ int access$708(RtspMediaPeriod rtspMediaPeriod) {
        int i = rtspMediaPeriod.portBindingRetryCount;
        rtspMediaPeriod.portBindingRetryCount = i + 1;
        return i;
    }

    private static C4766t<TrackGroup> buildTrackGroups(C4766t<RtspLoaderWrapper> tVar) {
        C4766t.C4768a aVar = new C4766t.C4768a();
        for (int i = 0; i < tVar.size(); i++) {
            aVar.mo19883e(new TrackGroup((Format) Assertions.checkNotNull(tVar.get(i).sampleQueue.getUpstreamFormat())));
        }
        return aVar.mo19884f();
    }

    /* access modifiers changed from: private */
    public RtpDataLoadable getLoadableByTrackUri(Uri uri) {
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            RtpLoadInfo rtpLoadInfo = this.rtspLoaderWrappers.get(i).loadInfo;
            if (rtpLoadInfo.getTrackUri().equals(uri)) {
                return rtpLoadInfo.loadable;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public boolean isSeekPending() {
        return this.pendingSeekPositionUs != C6540C.TIME_UNSET;
    }

    /* access modifiers changed from: private */
    public void maybeFinishPrepare() {
        if (!this.released && !this.prepared) {
            int i = 0;
            while (i < this.rtspLoaderWrappers.size()) {
                if (this.rtspLoaderWrappers.get(i).sampleQueue.getUpstreamFormat() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.prepared = true;
            this.trackGroups = buildTrackGroups(C4766t.m21988y(this.rtspLoaderWrappers));
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
        }
    }

    /* access modifiers changed from: private */
    public void maybeSetupTracks() {
        boolean z = true;
        for (int i = 0; i < this.selectedLoadInfos.size(); i++) {
            z &= this.selectedLoadInfos.get(i).isTransportReady();
        }
        if (z && this.trackSelected) {
            this.rtspClient.setupSelectedTracks(this.selectedLoadInfos);
        }
    }

    /* access modifiers changed from: private */
    public void retryWithRtpTcp() {
        this.rtspClient.retryWithRtpTcp();
        TransferRtpDataChannelFactory transferRtpDataChannelFactory = new TransferRtpDataChannelFactory();
        ArrayList arrayList = new ArrayList(this.rtspLoaderWrappers.size());
        ArrayList arrayList2 = new ArrayList(this.selectedLoadInfos.size());
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            RtspLoaderWrapper rtspLoaderWrapper = this.rtspLoaderWrappers.get(i);
            RtspLoaderWrapper rtspLoaderWrapper2 = new RtspLoaderWrapper(rtspLoaderWrapper.loadInfo.mediaTrack, i, transferRtpDataChannelFactory);
            arrayList.add(rtspLoaderWrapper2);
            rtspLoaderWrapper2.startLoading();
            if (this.selectedLoadInfos.contains(rtspLoaderWrapper.loadInfo)) {
                arrayList2.add(rtspLoaderWrapper2.loadInfo);
            }
        }
        C4766t<RtspLoaderWrapper> y = C4766t.m21988y(this.rtspLoaderWrappers);
        this.rtspLoaderWrappers.clear();
        this.rtspLoaderWrappers.addAll(arrayList);
        this.selectedLoadInfos.clear();
        this.selectedLoadInfos.addAll(arrayList2);
        for (int i2 = 0; i2 < y.size(); i2++) {
            y.get(i2).cancelLoad();
        }
    }

    private boolean seekInsideBufferUs(long j) {
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            if (!this.rtspLoaderWrappers.get(i).sampleQueue.seekTo(j, false)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void updateLoadingFinished() {
        this.loadingFinished = true;
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            this.loadingFinished &= this.rtspLoaderWrappers.get(i).canceled;
        }
    }

    public boolean continueLoading(long j) {
        return isLoading();
    }

    public void discardBuffer(long j, boolean z) {
        if (!isSeekPending()) {
            for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
                RtspLoaderWrapper rtspLoaderWrapper = this.rtspLoaderWrappers.get(i);
                if (!rtspLoaderWrapper.canceled) {
                    rtspLoaderWrapper.sampleQueue.discardTo(j, z, true);
                }
            }
        }
    }

    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        return j;
    }

    public long getBufferedPositionUs() {
        if (this.loadingFinished || this.rtspLoaderWrappers.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (isSeekPending()) {
            return this.pendingSeekPositionUs;
        }
        long largestQueuedTimestampUs = this.rtspLoaderWrappers.get(0).sampleQueue.getLargestQueuedTimestampUs();
        for (int i = 1; i < this.rtspLoaderWrappers.size(); i++) {
            largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, ((RtspLoaderWrapper) Assertions.checkNotNull(this.rtspLoaderWrappers.get(i))).sampleQueue.getLargestQueuedTimestampUs());
        }
        return largestQueuedTimestampUs;
    }

    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    public TrackGroupArray getTrackGroups() {
        Assertions.checkState(this.prepared);
        return new TrackGroupArray((TrackGroup[]) ((C4766t) Assertions.checkNotNull(this.trackGroups)).toArray(new TrackGroup[0]));
    }

    public boolean isLoading() {
        return !this.loadingFinished;
    }

    /* access modifiers changed from: package-private */
    public boolean isReady(int i) {
        return this.rtspLoaderWrappers.get(i).isSampleQueueReady();
    }

    public void maybeThrowPrepareError() throws IOException {
        IOException iOException = this.preparationError;
        if (iOException != null) {
            throw iOException;
        }
    }

    public void prepare(MediaPeriod.Callback callback2, long j) {
        this.callback = callback2;
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            this.rtspLoaderWrappers.get(i).startLoading();
        }
    }

    /* access modifiers changed from: package-private */
    public int readData(int i, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        return this.rtspLoaderWrappers.get(i).read(formatHolder, decoderInputBuffer, i2);
    }

    public long readDiscontinuity() {
        return C6540C.TIME_UNSET;
    }

    public void reevaluateBuffer(long j) {
    }

    public void release() {
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            this.rtspLoaderWrappers.get(i).release();
        }
        this.released = true;
    }

    public long seekToUs(long j) {
        if (isSeekPending()) {
            return this.pendingSeekPositionUs;
        }
        if (seekInsideBufferUs(j)) {
            return j;
        }
        this.pendingSeekPositionUs = j;
        this.rtspClient.seekToUs(j);
        for (int i = 0; i < this.rtspLoaderWrappers.size(); i++) {
            this.rtspLoaderWrappers.get(i).seekTo(j);
        }
        return j;
    }

    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            if (sampleStreamArr[i] != null && (exoTrackSelectionArr[i] == null || !zArr[i])) {
                sampleStreamArr[i] = null;
            }
        }
        this.selectedLoadInfos.clear();
        for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
            if (exoTrackSelection != null) {
                TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                int indexOf = ((C4766t) Assertions.checkNotNull(this.trackGroups)).indexOf(trackGroup);
                this.selectedLoadInfos.add(((RtspLoaderWrapper) Assertions.checkNotNull(this.rtspLoaderWrappers.get(indexOf))).loadInfo);
                if (this.trackGroups.contains(trackGroup) && sampleStreamArr[i2] == null) {
                    sampleStreamArr[i2] = new SampleStreamImpl(indexOf);
                    zArr2[i2] = true;
                }
            }
        }
        for (int i3 = 0; i3 < this.rtspLoaderWrappers.size(); i3++) {
            RtspLoaderWrapper rtspLoaderWrapper = this.rtspLoaderWrappers.get(i3);
            if (!this.selectedLoadInfos.contains(rtspLoaderWrapper.loadInfo)) {
                rtspLoaderWrapper.cancelLoad();
            }
        }
        this.trackSelected = true;
        maybeSetupTracks();
        return j;
    }

    public C4766t<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return C4766t.m21978E();
    }
}
