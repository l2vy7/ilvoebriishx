package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bz0 implements mp2 {

    /* renamed from: a */
    private final uz0 f30176a;

    /* renamed from: b */
    private final bz0 f30177b = this;

    /* renamed from: c */
    private final iv3<Context> f30178c;

    /* renamed from: d */
    private final iv3<zzbfi> f30179d;

    /* renamed from: e */
    private final iv3<String> f30180e;

    /* renamed from: f */
    private final iv3<cc2> f30181f;

    /* renamed from: g */
    private final iv3<kq2> f30182g;

    /* renamed from: h */
    private final iv3<jp2> f30183h;

    /* renamed from: i */
    private final iv3<lc2> f30184i;

    /* synthetic */ bz0(uz0 uz0, Context context, String str, zzbfi zzbfi, az0 az0) {
        this.f30176a = uz0;
        uu3 a = vu3.m38959a(context);
        this.f30178c = a;
        uu3 a2 = vu3.m38959a(zzbfi);
        this.f30179d = a2;
        uu3 a3 = vu3.m38959a(str);
        this.f30180e = a3;
        iv3<cc2> b = tu3.m38017b(new dc2(uz0.f40189p));
        this.f30181f = b;
        iv3<kq2> b2 = tu3.m38017b(new lq2(uz0.f40202v0));
        this.f30182g = b2;
        uu3 uu3 = a;
        iv3<jp2> b3 = tu3.m38017b(new kp2(uu3, uz0.f40191q, uz0.f40149P, b, b2, ds2.m31608a()));
        this.f30183h = b3;
        this.f30184i = tu3.m38017b(new mc2(uu3, a2, a3, b3, b, b2));
    }

    public final lc2 zza() {
        return this.f30184i.zzb();
    }
}
