package com.google.ads.interactivemedia.p038v3.internal;

import com.google.ads.interactivemedia.p038v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p038v3.impl.data.C3797bj;
import java.util.SortedSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dl */
/* compiled from: IMASDK */
final class C3938dl implements C3975ev {

    /* renamed from: a */
    private final ari f16926a;

    /* renamed from: b */
    private final SortedSet<Float> f16927b;

    /* renamed from: c */
    private final C3958ee f16928c;

    /* renamed from: d */
    private final String f16929d;

    /* renamed from: e */
    private long f16930e = 0;

    /* renamed from: f */
    private VideoProgressUpdate f16931f = new VideoProgressUpdate(0, 0);

    C3938dl(C3958ee eeVar, SortedSet<Float> sortedSet, String str) {
        arj arj = new arj();
        this.f16927b = sortedSet;
        this.f16926a = arj;
        this.f16928c = eeVar;
        this.f16929d = str;
    }

    /* renamed from: a */
    public final void mo15680a(VideoProgressUpdate videoProgressUpdate) {
        SortedSet<Float> sortedSet;
        if (videoProgressUpdate != null && videoProgressUpdate.getDuration() >= 0.0f && !videoProgressUpdate.equals(this.f16931f)) {
            float currentTime = this.f16931f.getCurrentTime();
            float currentTime2 = videoProgressUpdate.getCurrentTime();
            if (currentTime < currentTime2) {
                sortedSet = this.f16927b.subSet(Float.valueOf(currentTime), Float.valueOf(currentTime2));
            } else {
                sortedSet = this.f16927b.subSet(Float.valueOf(currentTime2), Float.valueOf(currentTime));
            }
            if (!sortedSet.isEmpty() || this.f16927b.contains(Float.valueOf(videoProgressUpdate.getCurrentTime())) || System.currentTimeMillis() - this.f16930e >= 1000) {
                this.f16930e = System.currentTimeMillis();
                this.f16931f = videoProgressUpdate;
                this.f16928c.mo15717o(new C3949dw(C3947du.contentTimeUpdate, C3948dv.contentTimeUpdate, this.f16929d, C3797bj.create(videoProgressUpdate)));
            }
        }
    }
}
