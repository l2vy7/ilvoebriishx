package com.google.android.exoplayer2.transformer;

import android.util.SparseLongArray;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.Util;

final class TransformerMediaClock implements MediaClock {
    private long minTrackTimeUs;
    private final SparseLongArray trackTypeToTimeUs = new SparseLongArray();

    public PlaybackParameters getPlaybackParameters() {
        return PlaybackParameters.DEFAULT;
    }

    public long getPositionUs() {
        return this.minTrackTimeUs;
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    public void updateTimeForTrackType(int i, long j) {
        long j2 = this.trackTypeToTimeUs.get(i, C6540C.TIME_UNSET);
        if (j2 == C6540C.TIME_UNSET || j > j2) {
            this.trackTypeToTimeUs.put(i, j);
            if (j2 == C6540C.TIME_UNSET || j2 == this.minTrackTimeUs) {
                this.minTrackTimeUs = Util.minValue(this.trackTypeToTimeUs);
            }
        }
    }
}
