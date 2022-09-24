package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v74 {

    /* renamed from: a */
    private final String[] f40337a;

    /* renamed from: b */
    private final int[] f40338b;

    /* renamed from: c */
    private final cm0[] f40339c;

    /* renamed from: d */
    private final int[] f40340d;

    /* renamed from: e */
    private final int[][][] f40341e;

    /* renamed from: f */
    private final cm0 f40342f;

    v74(String[] strArr, int[] iArr, cm0[] cm0Arr, int[] iArr2, int[][][] iArr3, cm0 cm0) {
        this.f40337a = strArr;
        this.f40338b = iArr;
        this.f40339c = cm0Arr;
        this.f40341e = iArr3;
        this.f40340d = iArr2;
        this.f40342f = cm0;
    }

    /* renamed from: a */
    public final int mo35379a(int i) {
        return this.f40338b[i];
    }

    /* renamed from: b */
    public final int mo35380b(int i, int i2, int i3) {
        return this.f40341e[i][i2][0] & 7;
    }

    /* renamed from: c */
    public final cm0 mo35381c(int i) {
        return this.f40339c[i];
    }

    /* renamed from: d */
    public final cm0 mo35382d() {
        return this.f40342f;
    }
}
