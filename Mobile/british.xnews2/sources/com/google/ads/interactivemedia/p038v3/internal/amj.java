package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amj */
/* compiled from: IMASDK */
public final class amj<V> {

    /* renamed from: a */
    private long[] f15289a = new long[10];

    /* renamed from: b */
    private V[] f15290b = new Object[10];

    /* renamed from: c */
    private int f15291c;

    /* renamed from: d */
    private int f15292d;

    /* renamed from: f */
    private final V m14169f() {
        aup.m14887r(this.f15292d > 0);
        V[] vArr = this.f15290b;
        int i = this.f15291c;
        V v = vArr[i];
        vArr[i] = null;
        this.f15291c = (i + 1) % vArr.length;
        this.f15292d--;
        return v;
    }

    /* renamed from: a */
    public final synchronized void mo13988a(long j, V v) {
        int i = this.f15292d;
        if (i > 0) {
            if (j <= this.f15289a[((this.f15291c + i) - 1) % this.f15290b.length]) {
                mo13989b();
            }
        }
        int length = this.f15290b.length;
        if (this.f15292d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            V[] vArr = new Object[i2];
            int i3 = this.f15291c;
            int i4 = length - i3;
            System.arraycopy(this.f15289a, i3, jArr, 0, i4);
            System.arraycopy(this.f15290b, this.f15291c, vArr, 0, i4);
            int i5 = this.f15291c;
            if (i5 > 0) {
                System.arraycopy(this.f15289a, 0, jArr, i4, i5);
                System.arraycopy(this.f15290b, 0, vArr, i4, this.f15291c);
            }
            this.f15289a = jArr;
            this.f15290b = vArr;
            this.f15291c = 0;
        }
        int i6 = this.f15291c;
        int i7 = this.f15292d;
        V[] vArr2 = this.f15290b;
        int length2 = (i6 + i7) % vArr2.length;
        this.f15289a[length2] = j;
        vArr2[length2] = v;
        this.f15292d = i7 + 1;
    }

    /* renamed from: b */
    public final synchronized void mo13989b() {
        this.f15291c = 0;
        this.f15292d = 0;
        Arrays.fill(this.f15290b, (Object) null);
    }

    /* renamed from: c */
    public final synchronized int mo13990c() {
        return this.f15292d;
    }

    /* renamed from: d */
    public final synchronized V mo13991d() {
        if (this.f15292d == 0) {
            return null;
        }
        return m14169f();
    }

    /* renamed from: e */
    public final synchronized V mo13992e(long j) {
        V v;
        v = null;
        while (true) {
            if (this.f15292d <= 0) {
                break;
            } else if (j - this.f15289a[this.f15291c] < 0) {
                break;
            } else {
                v = m14169f();
            }
        }
        return v;
    }
}
