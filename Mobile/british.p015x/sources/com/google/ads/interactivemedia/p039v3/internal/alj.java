package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alj */
/* compiled from: IMASDK */
public final class alj {

    /* renamed from: a */
    private int f15208a;

    /* renamed from: b */
    private long[] f15209b = new long[32];

    /* renamed from: a */
    public final void mo13909a(long j) {
        int i = this.f15208a;
        long[] jArr = this.f15209b;
        if (i == jArr.length) {
            this.f15209b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f15209b;
        int i2 = this.f15208a;
        this.f15208a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public final long mo13910b(int i) {
        if (i >= 0 && i < this.f15208a) {
            return this.f15209b[i];
        }
        int i2 = this.f15208a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public final int mo13911c() {
        return this.f15208a;
    }
}
