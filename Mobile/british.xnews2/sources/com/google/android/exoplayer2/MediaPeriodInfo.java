package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Util;
import com.ironsource.mediationsdk.logger.IronSourceError;

final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;

    /* renamed from: id */
    public final MediaSource.MediaPeriodId f27196id;
    public final boolean isFinal;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.f27196id = mediaPeriodId;
        this.startPositionUs = j;
        this.requestedContentPositionUs = j2;
        this.endPositionUs = j3;
        this.durationUs = j4;
        this.isLastInTimelinePeriod = z;
        this.isLastInTimelineWindow = z2;
        this.isFinal = z3;
    }

    public MediaPeriodInfo copyWithRequestedContentPositionUs(long j) {
        if (j == this.requestedContentPositionUs) {
            return this;
        }
        return new MediaPeriodInfo(this.f27196id, this.startPositionUs, j, this.endPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public MediaPeriodInfo copyWithStartPositionUs(long j) {
        if (j == this.startPositionUs) {
            return this;
        }
        return new MediaPeriodInfo(this.f27196id, j, this.requestedContentPositionUs, this.endPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaPeriodInfo.class != obj.getClass()) {
            return false;
        }
        MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
        if (this.startPositionUs == mediaPeriodInfo.startPositionUs && this.requestedContentPositionUs == mediaPeriodInfo.requestedContentPositionUs && this.endPositionUs == mediaPeriodInfo.endPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isLastInTimelineWindow == mediaPeriodInfo.isLastInTimelineWindow && this.isFinal == mediaPeriodInfo.isFinal && Util.areEqual(this.f27196id, mediaPeriodInfo.f27196id)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f27196id.hashCode()) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
