package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gd2 {

    /* renamed from: a */
    private int f32245a;

    /* renamed from: b */
    private long[] f32246b = new long[32];

    public gd2(int i) {
    }

    /* renamed from: a */
    public final int mo32066a() {
        return this.f32245a;
    }

    /* renamed from: b */
    public final long mo32067b(int i) {
        if (i >= 0 && i < this.f32245a) {
            return this.f32246b[i];
        }
        int i2 = this.f32245a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public final void mo32068c(long j) {
        int i = this.f32245a;
        long[] jArr = this.f32246b;
        if (i == jArr.length) {
            this.f32246b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f32246b;
        int i2 = this.f32245a;
        this.f32245a = i2 + 1;
        jArr2[i2] = j;
    }
}
