package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fz0 implements cr2 {

    /* renamed from: a */
    private final uz0 f32050a;

    /* renamed from: b */
    private final fz0 f32051b = this;

    /* renamed from: c */
    private final iv3<Context> f32052c;

    /* renamed from: d */
    private final iv3<vo2<ds1, yr1>> f32053d;

    /* renamed from: e */
    private final iv3<kq2> f32054e;

    /* renamed from: f */
    private final iv3<wr2> f32055f;

    /* renamed from: g */
    private final iv3<vq2> f32056g;

    /* renamed from: h */
    private final iv3<fr2> f32057h;

    /* renamed from: i */
    private final iv3<String> f32058i;

    /* renamed from: j */
    private final iv3<zq2> f32059j;

    /* synthetic */ fz0(uz0 uz0, Context context, String str, ez0 ez0) {
        this.f32050a = uz0;
        uu3 a = vu3.m38959a(context);
        this.f32052c = a;
        ap2 ap2 = new ap2(a, uz0.f40202v0, uz0.f40204w0);
        this.f32053d = ap2;
        iv3<kq2> b = tu3.m38017b(new lq2(uz0.f40202v0));
        this.f32054e = b;
        iv3<wr2> b2 = tu3.m38017b(yr2.m40005a());
        this.f32055f = b2;
        iv3<vq2> b3 = tu3.m38017b(new wq2(a, uz0.f40191q, uz0.f40149P, ap2, b, ds2.m31608a(), b2));
        this.f32056g = b3;
        this.f32057h = tu3.m38017b(new gr2(b3, b, b2));
        uu3 b4 = vu3.m38960b(str);
        this.f32058i = b4;
        this.f32059j = tu3.m38017b(new ar2(b4, b3, a, b, b2));
    }

    public final zq2 zza() {
        return this.f32059j.zzb();
    }

    public final fr2 zzb() {
        return this.f32057h.zzb();
    }
}
