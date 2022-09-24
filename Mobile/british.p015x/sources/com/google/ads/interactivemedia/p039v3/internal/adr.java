package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adr */
/* compiled from: IMASDK */
final class adr {

    /* renamed from: a */
    public final int[] f14295a;

    /* renamed from: b */
    public final int f14296b;

    /* renamed from: c */
    public final int f14297c;

    /* renamed from: d */
    public final int f14298d;

    /* renamed from: e */
    public final int f14299e;

    /* renamed from: f */
    public final int f14300f;

    /* renamed from: g */
    public final int f14301g;

    private adr(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
        this.f14296b = i;
        this.f14295a = iArr;
        this.f14297c = i2;
        this.f14299e = i3;
        this.f14300f = i4;
        this.f14301g = i5;
        this.f14298d = i6;
    }

    /* renamed from: a */
    public static adr m13216a(int i, int[] iArr, int i2, int i3, int i4) {
        return new adr(i, 0, iArr, i2, i3, i4, -1);
    }

    /* renamed from: b */
    public static adr m13217b(int[] iArr, int i) {
        return new adr(5, 1, iArr, i, -1, -1, -1);
    }

    /* renamed from: c */
    public static adr m13218c(int[] iArr, int i) {
        return new adr(3, 1, iArr, i, -1, -1, -1);
    }

    /* renamed from: d */
    public static adr m13219d(int i) {
        return new adr(5, 2, new int[0], -1, -1, -1, i);
    }
}
