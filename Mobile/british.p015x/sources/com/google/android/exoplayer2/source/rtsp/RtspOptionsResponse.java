package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.C4766t;
import java.util.List;

final class RtspOptionsResponse {
    public final int status;
    public final C4766t<Integer> supportedMethods;

    public RtspOptionsResponse(int i, List<Integer> list) {
        this.status = i;
        this.supportedMethods = C4766t.m21988y(list);
    }
}
