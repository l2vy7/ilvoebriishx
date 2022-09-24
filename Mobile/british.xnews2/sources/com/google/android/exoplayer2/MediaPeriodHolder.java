package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ClippingMediaPeriod;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;

final class MediaPeriodHolder {
    private static final String TAG = "MediaPeriodHolder";
    public boolean allRenderersInCorrectState;
    public boolean hasEnabledTracks;
    public MediaPeriodInfo info;
    private final boolean[] mayRetainStreamFlags;
    public final MediaPeriod mediaPeriod;
    private final MediaSourceList mediaSourceList;
    private MediaPeriodHolder next;
    public boolean prepared;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionOffsetUs;
    public final SampleStream[] sampleStreams;
    private TrackGroupArray trackGroups = TrackGroupArray.EMPTY;
    private final TrackSelector trackSelector;
    private TrackSelectorResult trackSelectorResult;
    public final Object uid;

    public MediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, long j, TrackSelector trackSelector2, Allocator allocator, MediaSourceList mediaSourceList2, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult2) {
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.rendererPositionOffsetUs = j;
        this.trackSelector = trackSelector2;
        this.mediaSourceList = mediaSourceList2;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f27196id;
        this.uid = mediaPeriodId.periodUid;
        this.info = mediaPeriodInfo;
        this.trackSelectorResult = trackSelectorResult2;
        this.sampleStreams = new SampleStream[rendererCapabilitiesArr.length];
        this.mayRetainStreamFlags = new boolean[rendererCapabilitiesArr.length];
        this.mediaPeriod = createMediaPeriod(mediaPeriodId, mediaSourceList2, allocator, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.endPositionUs);
    }

    private void associateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i < rendererCapabilitiesArr.length) {
                if (rendererCapabilitiesArr[i].getTrackType() == 7 && this.trackSelectorResult.isRendererEnabled(i)) {
                    sampleStreamArr[i] = new EmptySampleStream();
                }
                i++;
            } else {
                return;
            }
        }
    }

    private static MediaPeriod createMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, MediaSourceList mediaSourceList2, Allocator allocator, long j, long j2) {
        MediaPeriod createPeriod = mediaSourceList2.createPeriod(mediaPeriodId, allocator, j);
        return (j2 == C6540C.TIME_UNSET || j2 == Long.MIN_VALUE) ? createPeriod : new ClippingMediaPeriod(createPeriod, true, 0, j2);
    }

    private void disableTrackSelectionsInResult() {
        if (isLoadingMediaPeriod()) {
            int i = 0;
            while (true) {
                TrackSelectorResult trackSelectorResult2 = this.trackSelectorResult;
                if (i < trackSelectorResult2.length) {
                    boolean isRendererEnabled = trackSelectorResult2.isRendererEnabled(i);
                    ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i];
                    if (isRendererEnabled && exoTrackSelection != null) {
                        exoTrackSelection.disable();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(SampleStream[] sampleStreamArr) {
        int i = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i < rendererCapabilitiesArr.length) {
                if (rendererCapabilitiesArr[i].getTrackType() == 7) {
                    sampleStreamArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void enableTrackSelectionsInResult() {
        if (isLoadingMediaPeriod()) {
            int i = 0;
            while (true) {
                TrackSelectorResult trackSelectorResult2 = this.trackSelectorResult;
                if (i < trackSelectorResult2.length) {
                    boolean isRendererEnabled = trackSelectorResult2.isRendererEnabled(i);
                    ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i];
                    if (isRendererEnabled && exoTrackSelection != null) {
                        exoTrackSelection.enable();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private boolean isLoadingMediaPeriod() {
        return this.next == null;
    }

    private static void releaseMediaPeriod(long j, MediaSourceList mediaSourceList2, MediaPeriod mediaPeriod2) {
        if (j == C6540C.TIME_UNSET || j == Long.MIN_VALUE) {
            mediaSourceList2.releasePeriod(mediaPeriod2);
            return;
        }
        try {
            mediaSourceList2.releasePeriod(((ClippingMediaPeriod) mediaPeriod2).mediaPeriod);
        } catch (RuntimeException e) {
            Log.m19794e(TAG, "Period release failed.", e);
        }
    }

    public long applyTrackSelection(TrackSelectorResult trackSelectorResult2, long j, boolean z) {
        return applyTrackSelection(trackSelectorResult2, j, z, new boolean[this.rendererCapabilities.length]);
    }

    public void continueLoading(long j) {
        Assertions.checkState(isLoadingMediaPeriod());
        this.mediaPeriod.continueLoading(toPeriodTime(j));
    }

    public long getBufferedPositionUs() {
        if (!this.prepared) {
            return this.info.startPositionUs;
        }
        long bufferedPositionUs = this.hasEnabledTracks ? this.mediaPeriod.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.info.durationUs : bufferedPositionUs;
    }

    public MediaPeriodHolder getNext() {
        return this.next;
    }

    public long getNextLoadPositionUs() {
        if (!this.prepared) {
            return 0;
        }
        return this.mediaPeriod.getNextLoadPositionUs();
    }

    public long getRendererOffset() {
        return this.rendererPositionOffsetUs;
    }

    public long getStartPositionRendererTime() {
        return this.info.startPositionUs + this.rendererPositionOffsetUs;
    }

    public TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    public TrackSelectorResult getTrackSelectorResult() {
        return this.trackSelectorResult;
    }

    public void handlePrepared(float f, Timeline timeline) throws ExoPlaybackException {
        this.prepared = true;
        this.trackGroups = this.mediaPeriod.getTrackGroups();
        TrackSelectorResult selectTracks = selectTracks(f, timeline);
        MediaPeriodInfo mediaPeriodInfo = this.info;
        long j = mediaPeriodInfo.startPositionUs;
        long j2 = mediaPeriodInfo.durationUs;
        if (j2 != C6540C.TIME_UNSET && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        long applyTrackSelection = applyTrackSelection(selectTracks, j, false);
        long j3 = this.rendererPositionOffsetUs;
        MediaPeriodInfo mediaPeriodInfo2 = this.info;
        this.rendererPositionOffsetUs = j3 + (mediaPeriodInfo2.startPositionUs - applyTrackSelection);
        this.info = mediaPeriodInfo2.copyWithStartPositionUs(applyTrackSelection);
    }

    public boolean isFullyBuffered() {
        return this.prepared && (!this.hasEnabledTracks || this.mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE);
    }

    public void reevaluateBuffer(long j) {
        Assertions.checkState(isLoadingMediaPeriod());
        if (this.prepared) {
            this.mediaPeriod.reevaluateBuffer(toPeriodTime(j));
        }
    }

    public void release() {
        disableTrackSelectionsInResult();
        releaseMediaPeriod(this.info.endPositionUs, this.mediaSourceList, this.mediaPeriod);
    }

    public TrackSelectorResult selectTracks(float f, Timeline timeline) throws ExoPlaybackException {
        TrackSelectorResult selectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, getTrackGroups(), this.info.f27196id, timeline);
        for (ExoTrackSelection exoTrackSelection : selectTracks.selections) {
            if (exoTrackSelection != null) {
                exoTrackSelection.onPlaybackSpeed(f);
            }
        }
        return selectTracks;
    }

    public void setNext(MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder != this.next) {
            disableTrackSelectionsInResult();
            this.next = mediaPeriodHolder;
            enableTrackSelectionsInResult();
        }
    }

    public void setRendererOffset(long j) {
        this.rendererPositionOffsetUs = j;
    }

    public long toPeriodTime(long j) {
        return j - getRendererOffset();
    }

    public long toRendererTime(long j) {
        return j + getRendererOffset();
    }

    public long applyTrackSelection(TrackSelectorResult trackSelectorResult2, long j, boolean z, boolean[] zArr) {
        TrackSelectorResult trackSelectorResult3 = trackSelectorResult2;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= trackSelectorResult3.length) {
                break;
            }
            boolean[] zArr2 = this.mayRetainStreamFlags;
            if (z || !trackSelectorResult2.isEquivalent(this.trackSelectorResult, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        disassociateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        disableTrackSelectionsInResult();
        this.trackSelectorResult = trackSelectorResult3;
        enableTrackSelectionsInResult();
        long selectTracks = this.mediaPeriod.selectTracks(trackSelectorResult3.selections, this.mayRetainStreamFlags, this.sampleStreams, zArr, j);
        associateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        this.hasEnabledTracks = false;
        int i2 = 0;
        while (true) {
            SampleStream[] sampleStreamArr = this.sampleStreams;
            if (i2 >= sampleStreamArr.length) {
                return selectTracks;
            }
            if (sampleStreamArr[i2] != null) {
                Assertions.checkState(trackSelectorResult2.isRendererEnabled(i2));
                if (this.rendererCapabilities[i2].getTrackType() != 7) {
                    this.hasEnabledTracks = true;
                }
            } else {
                Assertions.checkState(trackSelectorResult3.selections[i2] == null);
            }
            i2++;
        }
    }
}
