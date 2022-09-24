package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.C10389f0;
import com.google.common.collect.C10394k0;
import com.google.common.collect.C4706d0;
import com.google.common.collect.C4766t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final String TAG = "AdaptiveTrackSelection";
    private final C4766t<AdaptationCheckpoint> adaptationCheckpoints;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;
    private MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private final long maxDurationForQualityDecreaseUs;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public AdaptationCheckpoint(long j, long j2) {
            this.totalBandwidth = j;
            this.allocatedBandwidth = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            if (this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }
    }

    public static class Factory implements ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;

        public Factory() {
            this(10000, 25000, 25000, 0.7f, 0.75f, Clock.DEFAULT);
        }

        /* access modifiers changed from: protected */
        public AdaptiveTrackSelection createAdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i, BandwidthMeter bandwidthMeter, C4766t<AdaptationCheckpoint> tVar) {
            return new AdaptiveTrackSelection(trackGroup, iArr, i, bandwidthMeter, (long) this.minDurationForQualityIncreaseMs, (long) this.maxDurationForQualityDecreaseMs, (long) this.minDurationToRetainAfterDiscardMs, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, tVar, this.clock);
        }

        public final ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            ExoTrackSelection exoTrackSelection;
            C4766t access$000 = AdaptiveTrackSelection.getAdaptationCheckpoints(definitionArr);
            ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
            for (int i = 0; i < definitionArr.length; i++) {
                ExoTrackSelection.Definition definition = definitionArr[i];
                if (definition != null) {
                    int[] iArr = definition.tracks;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            exoTrackSelection = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                        } else {
                            exoTrackSelection = createAdaptiveTrackSelection(definition.group, iArr, definition.type, bandwidthMeter, (C4766t) access$000.get(i));
                        }
                        exoTrackSelectionArr[i] = exoTrackSelection;
                    }
                }
            }
            return exoTrackSelectionArr;
        }

        public Factory(int i, int i2, int i3, float f) {
            this(i, i2, i3, f, 0.75f, Clock.DEFAULT);
        }

        public Factory(int i, int i2, int i3, float f, float f2, Clock clock2) {
            this.minDurationForQualityIncreaseMs = i;
            this.maxDurationForQualityDecreaseMs = i2;
            this.minDurationToRetainAfterDiscardMs = i3;
            this.bandwidthFraction = f;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f2;
            this.clock = clock2;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter2) {
        this(trackGroup, iArr, 0, bandwidthMeter2, ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS, 25000, 25000, 0.7f, 0.75f, C4766t.m21978E(), Clock.DEFAULT);
    }

    private static void addCheckpoint(List<C4766t.C4768a<AdaptationCheckpoint>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            C4766t.C4768a aVar = list.get(i);
            if (aVar != null) {
                aVar.mo19883e(new AdaptationCheckpoint(j, jArr[i]));
            }
        }
    }

    private int determineIdealSelectedIndex(long j, long j2) {
        long allocatedBandwidth = getAllocatedBandwidth(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.length; i2++) {
            if (j == Long.MIN_VALUE || !isBlacklisted(i2, j)) {
                Format format = getFormat(i2);
                if (canSelectFormat(format, format.bitrate, allocatedBandwidth)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static C4766t<C4766t<AdaptationCheckpoint>> getAdaptationCheckpoints(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < definitionArr.length; i++) {
            if (definitionArr[i] == null || definitionArr[i].tracks.length <= 1) {
                arrayList.add((Object) null);
            } else {
                C4766t.C4768a v = C4766t.m21986v();
                v.mo19883e(new AdaptationCheckpoint(0, 0));
                arrayList.add(v);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(definitionArr);
        int[] iArr = new int[sortedTrackBitrates.length];
        long[] jArr = new long[sortedTrackBitrates.length];
        for (int i2 = 0; i2 < sortedTrackBitrates.length; i2++) {
            jArr[i2] = sortedTrackBitrates[i2].length == 0 ? 0 : sortedTrackBitrates[i2][0];
        }
        addCheckpoint(arrayList, jArr);
        C4766t<Integer> switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i3 = 0; i3 < switchOrder.size(); i3++) {
            int intValue = switchOrder.get(i3).intValue();
            int i4 = iArr[intValue] + 1;
            iArr[intValue] = i4;
            jArr[intValue] = sortedTrackBitrates[intValue][i4];
            addCheckpoint(arrayList, jArr);
        }
        for (int i5 = 0; i5 < definitionArr.length; i5++) {
            if (arrayList.get(i5) != null) {
                jArr[i5] = jArr[i5] * 2;
            }
        }
        addCheckpoint(arrayList, jArr);
        C4766t.C4768a v2 = C4766t.m21986v();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            C4766t.C4768a aVar = (C4766t.C4768a) arrayList.get(i6);
            v2.mo19883e(aVar == null ? C4766t.m21978E() : aVar.mo19884f());
        }
        return v2.mo19884f();
    }

    private long getAllocatedBandwidth(long j) {
        long totalAllocatableBandwidth = getTotalAllocatableBandwidth(j);
        if (this.adaptationCheckpoints.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i = 1;
        while (i < this.adaptationCheckpoints.size() - 1 && this.adaptationCheckpoints.get(i).totalBandwidth < totalAllocatableBandwidth) {
            i++;
        }
        AdaptationCheckpoint adaptationCheckpoint = this.adaptationCheckpoints.get(i - 1);
        AdaptationCheckpoint adaptationCheckpoint2 = this.adaptationCheckpoints.get(i);
        long j2 = adaptationCheckpoint.totalBandwidth;
        long j3 = adaptationCheckpoint.allocatedBandwidth;
        return j3 + ((long) ((((float) (totalAllocatableBandwidth - j2)) / ((float) (adaptationCheckpoint2.totalBandwidth - j2))) * ((float) (adaptationCheckpoint2.allocatedBandwidth - j3))));
    }

    private long getLastChunkDurationUs(List<? extends MediaChunk> list) {
        if (list.isEmpty()) {
            return C6540C.TIME_UNSET;
        }
        MediaChunk mediaChunk = (MediaChunk) C4706d0.m21756c(list);
        long j = mediaChunk.startTimeUs;
        if (j == C6540C.TIME_UNSET) {
            return C6540C.TIME_UNSET;
        }
        long j2 = mediaChunk.endTimeUs;
        if (j2 != C6540C.TIME_UNSET) {
            return j2 - j;
        }
        return C6540C.TIME_UNSET;
    }

    private long getNextChunkDurationUs(MediaChunkIterator[] mediaChunkIteratorArr, List<? extends MediaChunk> list) {
        int i = this.selectedIndex;
        if (i >= mediaChunkIteratorArr.length || !mediaChunkIteratorArr[i].next()) {
            for (MediaChunkIterator mediaChunkIterator : mediaChunkIteratorArr) {
                if (mediaChunkIterator.next()) {
                    return mediaChunkIterator.getChunkEndTimeUs() - mediaChunkIterator.getChunkStartTimeUs();
                }
            }
            return getLastChunkDurationUs(list);
        }
        MediaChunkIterator mediaChunkIterator2 = mediaChunkIteratorArr[this.selectedIndex];
        return mediaChunkIterator2.getChunkEndTimeUs() - mediaChunkIterator2.getChunkStartTimeUs();
    }

    private static long[][] getSortedTrackBitrates(ExoTrackSelection.Definition[] definitionArr) {
        long[][] jArr = new long[definitionArr.length][];
        for (int i = 0; i < definitionArr.length; i++) {
            ExoTrackSelection.Definition definition = definitionArr[i];
            if (definition == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[definition.tracks.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = definition.tracks;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    jArr[i][i2] = (long) definition.group.getFormat(iArr[i2]).bitrate;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    private static C4766t<Integer> getSwitchOrder(long[][] jArr) {
        double d;
        long[][] jArr2 = jArr;
        C10389f0<K, V> e = C10394k0.m47934c().mo41838a().mo41837e();
        for (int i = 0; i < jArr2.length; i++) {
            if (jArr2[i].length > 1) {
                int length = jArr2[i].length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    double d2 = 0.0d;
                    if (i2 >= jArr2[i].length) {
                        break;
                    }
                    if (jArr2[i][i2] != -1) {
                        d2 = Math.log((double) jArr2[i][i2]);
                    }
                    dArr[i2] = d2;
                    i2++;
                }
                int i3 = length - 1;
                double d3 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d4 = dArr[i4];
                    i4++;
                    double d5 = (d4 + dArr[i4]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d5 - dArr[0]) / d3;
                    }
                    e.put(Double.valueOf(d), Integer.valueOf(i));
                }
            }
        }
        return C4766t.m21988y(e.values());
    }

    private long getTotalAllocatableBandwidth(long j) {
        long bitrateEstimate = (long) (((float) this.bandwidthMeter.getBitrateEstimate()) * this.bandwidthFraction);
        long timeToFirstByteEstimateUs = this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == C6540C.TIME_UNSET || j == C6540C.TIME_UNSET) {
            return (long) (((float) bitrateEstimate) / this.playbackSpeed);
        }
        float f = (float) j;
        return (long) ((((float) bitrateEstimate) * Math.max((f / this.playbackSpeed) - ((float) timeToFirstByteEstimateUs), 0.0f)) / f);
    }

    private long minDurationForQualityIncreaseUs(long j) {
        if (j != C6540C.TIME_UNSET && j <= this.minDurationForQualityIncreaseUs) {
            return (long) (((float) j) * this.bufferedFractionToLiveEdgeForQualityIncrease);
        }
        return this.minDurationForQualityIncreaseUs;
    }

    /* access modifiers changed from: protected */
    public boolean canSelectFormat(Format format, int i, long j) {
        return ((long) i) <= j;
    }

    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    public void enable() {
        this.lastBufferEvaluationMs = C6540C.TIME_UNSET;
        this.lastBufferEvaluationMediaChunk = null;
    }

    public int evaluateQueueSize(long j, List<? extends MediaChunk> list) {
        int i;
        int i2;
        long elapsedRealtime = this.clock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(elapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = elapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (MediaChunk) C4706d0.m21756c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(((MediaChunk) list.get(size - 1)).startTimeUs - j, this.playbackSpeed);
        long minDurationToRetainAfterDiscardUs2 = getMinDurationToRetainAfterDiscardUs();
        if (playoutDurationForMediaDuration < minDurationToRetainAfterDiscardUs2) {
            return size;
        }
        Format format = getFormat(determineIdealSelectedIndex(elapsedRealtime, getLastChunkDurationUs(list)));
        for (int i3 = 0; i3 < size; i3++) {
            MediaChunk mediaChunk = (MediaChunk) list.get(i3);
            Format format2 = mediaChunk.trackFormat;
            if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j, this.playbackSpeed) >= minDurationToRetainAfterDiscardUs2 && format2.bitrate < format.bitrate && (i = format2.height) != -1 && i < 720 && (i2 = format2.width) != -1 && i2 < 1280 && i < format.height) {
                return i3;
            }
        }
        return size;
    }

    /* access modifiers changed from: protected */
    public long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    public Object getSelectionData() {
        return null;
    }

    public int getSelectionReason() {
        return this.reason;
    }

    public void onPlaybackSpeed(float f) {
        this.playbackSpeed = f;
    }

    /* access modifiers changed from: protected */
    public boolean shouldEvaluateQueueSize(long j, List<? extends MediaChunk> list) {
        long j2 = this.lastBufferEvaluationMs;
        return j2 == C6540C.TIME_UNSET || j - j2 >= 1000 || (!list.isEmpty() && !((MediaChunk) C4706d0.m21756c(list)).equals(this.lastBufferEvaluationMediaChunk));
    }

    public void updateSelectedTrack(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(mediaChunkIteratorArr, list);
        int i = this.reason;
        if (i == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i2 = this.selectedIndex;
        int indexOf = list.isEmpty() ? -1 : indexOf(((MediaChunk) C4706d0.m21756c(list)).trackFormat);
        if (indexOf != -1) {
            i = ((MediaChunk) C4706d0.m21756c(list)).trackSelectionReason;
            i2 = indexOf;
        }
        int determineIdealSelectedIndex = determineIdealSelectedIndex(elapsedRealtime, nextChunkDurationUs);
        if (!isBlacklisted(i2, elapsedRealtime)) {
            Format format = getFormat(i2);
            Format format2 = getFormat(determineIdealSelectedIndex);
            if ((format2.bitrate > format.bitrate && j2 < minDurationForQualityIncreaseUs(j3)) || (format2.bitrate < format.bitrate && j2 >= this.maxDurationForQualityDecreaseUs)) {
                determineIdealSelectedIndex = i2;
            }
        }
        if (determineIdealSelectedIndex != i2) {
            i = 3;
        }
        this.reason = i;
        this.selectedIndex = determineIdealSelectedIndex;
    }

    protected AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i, BandwidthMeter bandwidthMeter2, long j, long j2, long j3, float f, float f2, List<AdaptationCheckpoint> list, Clock clock2) {
        super(trackGroup, iArr, i);
        if (j3 < j) {
            Log.m19797w(TAG, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.bandwidthMeter = bandwidthMeter2;
        this.minDurationForQualityIncreaseUs = j * 1000;
        this.maxDurationForQualityDecreaseUs = j2 * 1000;
        this.minDurationToRetainAfterDiscardUs = j3 * 1000;
        this.bandwidthFraction = f;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f2;
        this.adaptationCheckpoints = C4766t.m21988y(list);
        this.clock = clock2;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = C6540C.TIME_UNSET;
    }
}
