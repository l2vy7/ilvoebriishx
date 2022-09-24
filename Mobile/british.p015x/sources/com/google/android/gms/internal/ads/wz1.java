package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wz1 implements uu3<vz1> {

    /* renamed from: a */
    private final iv3<ScheduledExecutorService> f40964a;

    /* renamed from: b */
    private final iv3<nb3> f40965b;

    /* renamed from: c */
    private final iv3<n02> f40966c;

    /* renamed from: d */
    private final iv3<d22> f40967d;

    public wz1(iv3<ScheduledExecutorService> iv3, iv3<nb3> iv32, iv3<n02> iv33, iv3<d22> iv34) {
        this.f40964a = iv3;
        this.f40965b = iv32;
        this.f40966c = iv33;
        this.f40967d = iv34;
    }

    /* renamed from: a */
    public final vz1 zzb() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return new vz1(this.f40964a.zzb(), nb3, ((o02) this.f40966c).zzb(), tu3.m38016a(this.f40967d));
    }
}
