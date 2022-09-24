package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amt */
/* compiled from: IMASDK */
final class amt {

    /* renamed from: a */
    private long f15333a;

    /* renamed from: b */
    private long f15334b;

    /* renamed from: c */
    private long f15335c;

    /* renamed from: d */
    private long f15336d;

    /* renamed from: e */
    private long f15337e;

    /* renamed from: f */
    private long f15338f;

    /* renamed from: g */
    private final boolean[] f15339g = new boolean[15];

    /* renamed from: h */
    private int f15340h;

    /* renamed from: g */
    private static int m14264g(long j) {
        return (int) (j % 15);
    }

    /* renamed from: a */
    public final void mo14012a() {
        this.f15336d = 0;
        this.f15337e = 0;
        this.f15338f = 0;
        this.f15340h = 0;
        Arrays.fill(this.f15339g, false);
    }

    /* renamed from: b */
    public final boolean mo14013b() {
        return this.f15336d > 15 && this.f15340h == 0;
    }

    /* renamed from: c */
    public final boolean mo14014c() {
        long j = this.f15336d;
        if (j == 0) {
            return false;
        }
        return this.f15339g[m14264g(j - 1)];
    }

    /* renamed from: d */
    public final long mo14015d() {
        return this.f15338f;
    }

    /* renamed from: e */
    public final long mo14016e() {
        long j = this.f15337e;
        if (j == 0) {
            return 0;
        }
        return this.f15338f / j;
    }

    /* renamed from: f */
    public final void mo14017f(long j) {
        long j2 = this.f15336d;
        if (j2 == 0) {
            this.f15333a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f15333a;
            this.f15334b = j3;
            this.f15338f = j3;
            this.f15337e = 1;
        } else {
            long j4 = j - this.f15335c;
            int g = m14264g(j2);
            if (Math.abs(j4 - this.f15334b) <= 1000000) {
                this.f15337e++;
                this.f15338f += j4;
                boolean[] zArr = this.f15339g;
                if (zArr[g]) {
                    zArr[g] = false;
                    this.f15340h--;
                }
            } else {
                boolean[] zArr2 = this.f15339g;
                if (!zArr2[g]) {
                    zArr2[g] = true;
                    this.f15340h++;
                }
            }
        }
        this.f15336d++;
        this.f15335c = j;
    }
}
