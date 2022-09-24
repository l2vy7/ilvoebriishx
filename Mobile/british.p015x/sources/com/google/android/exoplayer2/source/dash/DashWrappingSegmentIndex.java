package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;

public final class DashWrappingSegmentIndex implements DashSegmentIndex {
    private final ChunkIndex chunkIndex;
    private final long timeOffsetUs;

    public DashWrappingSegmentIndex(ChunkIndex chunkIndex2, long j) {
        this.chunkIndex = chunkIndex2;
        this.timeOffsetUs = j;
    }

    public long getAvailableSegmentCount(long j, long j2) {
        return (long) this.chunkIndex.length;
    }

    public long getDurationUs(long j, long j2) {
        return this.chunkIndex.durationsUs[(int) j];
    }

    public long getFirstAvailableSegmentNum(long j, long j2) {
        return 0;
    }

    public long getFirstSegmentNum() {
        return 0;
    }

    public long getNextSegmentAvailableTimeUs(long j, long j2) {
        return C6540C.TIME_UNSET;
    }

    public long getSegmentCount(long j) {
        return (long) this.chunkIndex.length;
    }

    public long getSegmentNum(long j, long j2) {
        return (long) this.chunkIndex.getChunkIndex(j + this.timeOffsetUs);
    }

    public RangedUri getSegmentUrl(long j) {
        ChunkIndex chunkIndex2 = this.chunkIndex;
        int i = (int) j;
        return new RangedUri((String) null, chunkIndex2.offsets[i], (long) chunkIndex2.sizes[i]);
    }

    public long getTimeUs(long j) {
        return this.chunkIndex.timesUs[(int) j] - this.timeOffsetUs;
    }

    public boolean isExplicit() {
        return true;
    }
}
