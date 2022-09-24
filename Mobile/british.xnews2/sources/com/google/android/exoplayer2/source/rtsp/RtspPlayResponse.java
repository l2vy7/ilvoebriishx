package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.C4766t;
import java.util.List;

final class RtspPlayResponse {
    public final RtspSessionTiming sessionTiming;
    public final int status;
    public final C4766t<RtspTrackTiming> trackTimingList;

    public RtspPlayResponse(int i, RtspSessionTiming rtspSessionTiming, List<RtspTrackTiming> list) {
        this.status = i;
        this.sessionTiming = rtspSessionTiming;
        this.trackTimingList = C4766t.m21988y(list);
    }
}
