package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wi */
/* compiled from: IMASDK */
public final class C4448wi implements C4455wp {

    /* renamed from: a */
    private C4120ke f19423a;

    /* renamed from: b */
    private amk f19424b;

    /* renamed from: c */
    private C4327rw f19425c;

    public C4448wi(String str) {
        C4119kd kdVar = new C4119kd();
        kdVar.mo16120ae(str);
        this.f19423a = kdVar.mo16115a();
    }

    /* renamed from: a */
    public final void mo16746a(amk amk, C4309re reVar, C4469xc xcVar) {
        this.f19424b = amk;
        xcVar.mo16763a();
        C4327rw ba = reVar.mo13362ba(xcVar.mo16764b(), 5);
        this.f19425c = ba;
        ba.mo13403a(this.f19423a);
    }

    /* renamed from: b */
    public final void mo16747b(alw alw) {
        aup.m14889t(this.f19424b);
        int i = amm.f15298a;
        long d = this.f19424b.mo13996d();
        if (d != C6540C.TIME_UNSET) {
            C4120ke keVar = this.f19423a;
            if (d != keVar.f17685p) {
                C4119kd a = keVar.mo16126a();
                a.mo16124ai(d);
                C4120ke a2 = a.mo16115a();
                this.f19423a = a2;
                this.f19425c.mo13403a(a2);
            }
            int e = alw.mo13947e();
            this.f19425c.mo13406d(alw, e);
            this.f19425c.mo13404b(this.f19424b.mo13995c(), 1, e, 0, (C4326rv) null);
        }
    }
}
