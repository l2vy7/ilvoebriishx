package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.wl */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8302wl {

    /* renamed from: a */
    private int f40817a;

    /* renamed from: b */
    private long[] f40818b = new long[32];

    public C8302wl(int i) {
    }

    /* renamed from: a */
    public final int mo35644a() {
        return this.f40817a;
    }

    /* renamed from: b */
    public final long mo35645b(int i) {
        if (i >= 0 && i < this.f40817a) {
            return this.f40818b[i];
        }
        int i2 = this.f40817a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public final void mo35646c(long j) {
        int i = this.f40817a;
        long[] jArr = this.f40818b;
        if (i == jArr.length) {
            this.f40818b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f40818b;
        int i2 = this.f40817a;
        this.f40817a = i2 + 1;
        jArr2[i2] = j;
    }
}
