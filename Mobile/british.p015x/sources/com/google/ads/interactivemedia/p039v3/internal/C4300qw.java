package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qw */
/* compiled from: IMASDK */
public final class C4300qw implements C4324rt {

    /* renamed from: a */
    public final int f18456a;

    /* renamed from: b */
    public final int[] f18457b;

    /* renamed from: c */
    public final long[] f18458c;

    /* renamed from: d */
    public final long[] f18459d;

    /* renamed from: e */
    public final long[] f18460e;

    /* renamed from: f */
    private final long f18461f;

    public C4300qw(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f18457b = iArr;
        this.f18458c = jArr;
        this.f18459d = jArr2;
        this.f18460e = jArr3;
        int length = iArr.length;
        this.f18456a = length;
        if (length > 0) {
            int i = length - 1;
            this.f18461f = jArr2[i] + jArr3[i];
            return;
        }
        this.f18461f = 0;
    }

    /* renamed from: a */
    public final boolean mo16580a() {
        return true;
    }

    /* renamed from: b */
    public final C4322rr mo16581b(long j) {
        int d = mo16592d(j);
        C4325ru ruVar = new C4325ru(this.f18460e[d], this.f18458c[d]);
        if (ruVar.f18539b >= j || d == this.f18456a - 1) {
            return new C4322rr(ruVar, ruVar);
        }
        int i = d + 1;
        return new C4322rr(ruVar, new C4325ru(this.f18460e[i], this.f18458c[i]));
    }

    /* renamed from: c */
    public final long mo16582c() {
        return this.f18461f;
    }

    /* renamed from: d */
    public final int mo16592d(long j) {
        return amm.m14223am(this.f18460e, j, true);
    }

    public final String toString() {
        int i = this.f18456a;
        String arrays = Arrays.toString(this.f18457b);
        String arrays2 = Arrays.toString(this.f18458c);
        String arrays3 = Arrays.toString(this.f18460e);
        String arrays4 = Arrays.toString(this.f18459d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }
}
