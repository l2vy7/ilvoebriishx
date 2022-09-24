package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cy0 implements sn2 {

    /* renamed from: a */
    private final Context f30510a;

    /* renamed from: b */
    private final zzbfi f30511b;

    /* renamed from: c */
    private final String f30512c;

    /* renamed from: d */
    private final uz0 f30513d;

    /* renamed from: e */
    private final cy0 f30514e = this;

    /* renamed from: f */
    private final iv3<Context> f30515f;

    /* renamed from: g */
    private final iv3<zzbfi> f30516g;

    /* renamed from: h */
    private final iv3<cc2> f30517h;

    /* renamed from: i */
    private final iv3<hc2> f30518i;

    /* renamed from: j */
    private final iv3<nn2> f30519j;

    /* synthetic */ cy0(uz0 uz0, Context context, String str, zzbfi zzbfi, by0 by0) {
        this.f30513d = uz0;
        this.f30510a = context;
        this.f30511b = zzbfi;
        this.f30512c = str;
        uu3 a = vu3.m38959a(context);
        this.f30515f = a;
        uu3 a2 = vu3.m38959a(zzbfi);
        this.f30516g = a2;
        iv3<cc2> b = tu3.m38017b(new dc2(uz0.f40189p));
        this.f30517h = b;
        iv3<hc2> b2 = tu3.m38017b(jc2.m33590a());
        this.f30518i = b2;
        this.f30519j = tu3.m38017b(new on2(a, uz0.f40191q, a2, uz0.f40149P, b, b2, ds2.m31608a()));
    }

    public final jb2 zza() {
        return new jb2(this.f30510a, this.f30511b, this.f30512c, this.f30519j.zzb(), this.f30517h.zzb());
    }
}
