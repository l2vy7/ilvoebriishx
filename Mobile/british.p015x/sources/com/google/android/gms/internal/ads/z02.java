package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z02 implements uu3<y02> {

    /* renamed from: a */
    private final iv3<Map<String, iv3<a12>>> f42250a;

    /* renamed from: b */
    private final iv3<nb3> f42251b;

    /* renamed from: c */
    private final iv3<id1> f42252c;

    public z02(iv3<Map<String, iv3<a12>>> iv3, iv3<nb3> iv32, iv3<id1> iv33) {
        this.f42250a = iv3;
        this.f42251b = iv32;
        this.f42252c = iv33;
    }

    /* renamed from: a */
    public final y02 zzb() {
        Map c = ((bv3) this.f42250a).mo30805c();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new y02(c, nb3, ((jd1) this.f42252c).zzb());
    }
}
