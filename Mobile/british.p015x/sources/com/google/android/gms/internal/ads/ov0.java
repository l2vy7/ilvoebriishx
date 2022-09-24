package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ov0 {

    /* renamed from: a */
    private final int f36605a;

    /* renamed from: b */
    public final int f36606b;

    /* renamed from: c */
    public final int f36607c;

    private ov0(int i, int i2, int i3) {
        this.f36605a = i;
        this.f36607c = i2;
        this.f36606b = i3;
    }

    /* renamed from: a */
    public static ov0 m35840a() {
        return new ov0(0, 0, 0);
    }

    /* renamed from: b */
    public static ov0 m35841b(int i, int i2) {
        return new ov0(1, i, i2);
    }

    /* renamed from: c */
    public static ov0 m35842c(zzbfi zzbfi) {
        if (zzbfi.f42967e) {
            return new ov0(3, 0, 0);
        }
        if (zzbfi.f42972j) {
            return new ov0(2, 0, 0);
        }
        if (zzbfi.f42971i) {
            return m35840a();
        }
        return m35841b(zzbfi.f42969g, zzbfi.f42966d);
    }

    /* renamed from: d */
    public static ov0 m35843d() {
        return new ov0(5, 0, 0);
    }

    /* renamed from: e */
    public static ov0 m35844e() {
        return new ov0(4, 0, 0);
    }

    /* renamed from: f */
    public final boolean mo34010f() {
        return this.f36605a == 0;
    }

    /* renamed from: g */
    public final boolean mo34011g() {
        return this.f36605a == 2;
    }

    /* renamed from: h */
    public final boolean mo34012h() {
        return this.f36605a == 5;
    }

    /* renamed from: i */
    public final boolean mo34013i() {
        return this.f36605a == 3;
    }

    /* renamed from: j */
    public final boolean mo34014j() {
        return this.f36605a == 4;
    }
}
