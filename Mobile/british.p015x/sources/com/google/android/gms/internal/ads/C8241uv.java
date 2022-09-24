package com.google.android.gms.internal.ads;

import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.uv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8241uv {

    /* renamed from: f */
    private static final C8241uv f39988f = new C8241uv();

    /* renamed from: a */
    private final vn0 f39989a;

    /* renamed from: b */
    private final C8169sv f39990b;

    /* renamed from: c */
    private final String f39991c;

    /* renamed from: d */
    private final zzcjf f39992d;

    /* renamed from: e */
    private final Random f39993e;

    protected C8241uv() {
        vn0 vn0 = new vn0();
        C8169sv svVar = new C8169sv(new C7991nu(), new C7917lu(), new C7592cz(), new r50(), new ok0(), new vg0(), new s50());
        String d = vn0.m38848d();
        zzcjf zzcjf = new zzcjf(0, 214106000, true, false, false);
        Random random = new Random();
        this.f39989a = vn0;
        this.f39990b = svVar;
        this.f39991c = d;
        this.f39992d = zzcjf;
        this.f39993e = random;
    }

    /* renamed from: a */
    public static C8169sv m38462a() {
        return f39988f.f39990b;
    }

    /* renamed from: b */
    public static vn0 m38463b() {
        return f39988f.f39989a;
    }

    /* renamed from: c */
    public static zzcjf m38464c() {
        return f39988f.f39992d;
    }

    /* renamed from: d */
    public static String m38465d() {
        return f39988f.f39991c;
    }

    /* renamed from: e */
    public static Random m38466e() {
        return f39988f.f39993e;
    }
}
