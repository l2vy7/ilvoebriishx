package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zw2<V> {

    /* renamed from: a */
    private long[] f42815a = new long[10];

    /* renamed from: b */
    private V[] f42816b = new Object[10];

    /* renamed from: c */
    private int f42817c;

    /* renamed from: d */
    private int f42818d;

    public zw2(int i) {
    }

    /* renamed from: f */
    private final V m40570f() {
        nu1.m20747f(this.f42818d > 0);
        V[] vArr = this.f42816b;
        int i = this.f42817c;
        V v = vArr[i];
        vArr[i] = null;
        this.f42817c = (i + 1) % vArr.length;
        this.f42818d--;
        return v;
    }

    /* renamed from: a */
    public final synchronized int mo36137a() {
        return this.f42818d;
    }

    /* renamed from: b */
    public final synchronized V mo36138b() {
        if (this.f42818d == 0) {
            return null;
        }
        return m40570f();
    }

    /* renamed from: c */
    public final synchronized V mo36139c(long j) {
        V v;
        v = null;
        while (true) {
            if (this.f42818d <= 0) {
                break;
            } else if (j - this.f42815a[this.f42817c] < 0) {
                break;
            } else {
                v = m40570f();
            }
        }
        return v;
    }

    /* renamed from: d */
    public final synchronized void mo36140d(long j, V v) {
        int i = this.f42818d;
        if (i > 0) {
            if (j <= this.f42815a[((this.f42817c + i) - 1) % this.f42816b.length]) {
                mo36141e();
            }
        }
        int length = this.f42816b.length;
        if (this.f42818d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            V[] vArr = new Object[i2];
            int i3 = this.f42817c;
            int i4 = length - i3;
            System.arraycopy(this.f42815a, i3, jArr, 0, i4);
            System.arraycopy(this.f42816b, this.f42817c, vArr, 0, i4);
            int i5 = this.f42817c;
            if (i5 > 0) {
                System.arraycopy(this.f42815a, 0, jArr, i4, i5);
                System.arraycopy(this.f42816b, 0, vArr, i4, this.f42817c);
            }
            this.f42815a = jArr;
            this.f42816b = vArr;
            this.f42817c = 0;
        }
        int i6 = this.f42817c;
        int i7 = this.f42818d;
        V[] vArr2 = this.f42816b;
        int length2 = (i6 + i7) % vArr2.length;
        this.f42815a[length2] = j;
        vArr2[length2] = v;
        this.f42818d = i7 + 1;
    }

    /* renamed from: e */
    public final synchronized void mo36141e() {
        this.f42817c = 0;
        this.f42818d = 0;
        Arrays.fill(this.f42816b, (Object) null);
    }
}
