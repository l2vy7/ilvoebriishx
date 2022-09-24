package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.g3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7706g3 {

    /* renamed from: a */
    private final int f32118a;

    /* renamed from: b */
    private boolean f32119b;

    /* renamed from: c */
    private boolean f32120c;

    /* renamed from: d */
    public byte[] f32121d;

    /* renamed from: e */
    public int f32122e;

    public C7706g3(int i, int i2) {
        this.f32118a = i;
        byte[] bArr = new byte[131];
        this.f32121d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo31999a(byte[] bArr, int i, int i2) {
        if (this.f32119b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f32121d;
            int length = bArr2.length;
            int i4 = this.f32122e + i3;
            if (length < i4) {
                this.f32121d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f32121d, this.f32122e, i3);
            this.f32122e += i3;
        }
    }

    /* renamed from: b */
    public final void mo32000b() {
        this.f32119b = false;
        this.f32120c = false;
    }

    /* renamed from: c */
    public final void mo32001c(int i) {
        boolean z = true;
        nu1.m20747f(!this.f32119b);
        if (i != this.f32118a) {
            z = false;
        }
        this.f32119b = z;
        if (z) {
            this.f32122e = 3;
            this.f32120c = false;
        }
    }

    /* renamed from: d */
    public final boolean mo32002d(int i) {
        if (!this.f32119b) {
            return false;
        }
        this.f32122e -= i;
        this.f32119b = false;
        this.f32120c = true;
        return true;
    }

    /* renamed from: e */
    public final boolean mo32003e() {
        return this.f32120c;
    }
}
