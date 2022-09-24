package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p038v3.internal.ark;

@ark(mo14242a = C3773am.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bj */
/* compiled from: IMASDK */
public abstract class C3797bj {
    private static final String DEFAULT_TIME_UNIT = "ms";

    public static C3797bj create(VideoProgressUpdate videoProgressUpdate) {
        return new C3773am(videoProgressUpdate.getCurrentTimeMs(), videoProgressUpdate.getDurationMs(), DEFAULT_TIME_UNIT);
    }

    public abstract long currentTime();

    public abstract long duration();

    public abstract String timeUnit();
}
