package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C6540C;

public final class TimestampAdjuster {
    public static final long DO_NOT_OFFSET = Long.MAX_VALUE;
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    private long firstSampleTimestampUs;
    private long lastSampleTimestampUs = C6540C.TIME_UNSET;
    private boolean sharedInitializationStarted;
    private long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        this.firstSampleTimestampUs = j;
    }

    public static long ptsToUs(long j) {
        return (j * 1000000) / 90000;
    }

    public static long usToNonWrappedPts(long j) {
        return (j * 90000) / 1000000;
    }

    public static long usToWrappedPts(long j) {
        return usToNonWrappedPts(j) % MAX_PTS_PLUS_ONE;
    }

    public synchronized long adjustSampleTimestamp(long j) {
        if (j == C6540C.TIME_UNSET) {
            return C6540C.TIME_UNSET;
        }
        if (this.lastSampleTimestampUs != C6540C.TIME_UNSET) {
            this.lastSampleTimestampUs = j;
        } else {
            long j2 = this.firstSampleTimestampUs;
            if (j2 != Long.MAX_VALUE) {
                this.timestampOffsetUs = j2 - j;
            }
            this.lastSampleTimestampUs = j;
            notifyAll();
        }
        return j + this.timestampOffsetUs;
    }

    public synchronized long adjustTsTimestamp(long j) {
        if (j == C6540C.TIME_UNSET) {
            return C6540C.TIME_UNSET;
        }
        long j2 = this.lastSampleTimestampUs;
        if (j2 != C6540C.TIME_UNSET) {
            long usToNonWrappedPts = usToNonWrappedPts(j2);
            long j3 = (4294967296L + usToNonWrappedPts) / MAX_PTS_PLUS_ONE;
            long j4 = ((j3 - 1) * MAX_PTS_PLUS_ONE) + j;
            j += j3 * MAX_PTS_PLUS_ONE;
            if (Math.abs(j4 - usToNonWrappedPts) < Math.abs(j - usToNonWrappedPts)) {
                j = j4;
            }
        }
        return adjustSampleTimestamp(ptsToUs(j));
    }

    public synchronized long getFirstSampleTimestampUs() {
        return this.firstSampleTimestampUs;
    }

    public synchronized long getLastAdjustedTimestampUs() {
        long j;
        long j2 = this.lastSampleTimestampUs;
        j = C6540C.TIME_UNSET;
        if (j2 != C6540C.TIME_UNSET) {
            j = this.timestampOffsetUs + j2;
        } else {
            long j3 = this.firstSampleTimestampUs;
            if (j3 != Long.MAX_VALUE) {
                j = j3;
            }
        }
        return j;
    }

    public synchronized long getTimestampOffsetUs() {
        long j;
        long j2 = this.firstSampleTimestampUs;
        j = C6540C.TIME_UNSET;
        if (j2 == Long.MAX_VALUE) {
            j = 0;
        } else if (this.lastSampleTimestampUs != C6540C.TIME_UNSET) {
            j = this.timestampOffsetUs;
        }
        return j;
    }

    public synchronized void reset(long j) {
        this.firstSampleTimestampUs = j;
        this.lastSampleTimestampUs = C6540C.TIME_UNSET;
        this.sharedInitializationStarted = false;
    }

    public synchronized void sharedInitializeOrWait(boolean z, long j) throws InterruptedException {
        if (z) {
            try {
                if (!this.sharedInitializationStarted) {
                    this.firstSampleTimestampUs = j;
                    this.sharedInitializationStarted = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || j != this.firstSampleTimestampUs) {
            while (this.lastSampleTimestampUs == C6540C.TIME_UNSET) {
                wait();
            }
        }
    }
}
