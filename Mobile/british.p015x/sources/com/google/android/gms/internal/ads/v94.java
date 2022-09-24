package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v94 {

    /* renamed from: a */
    private long f40354a;

    /* renamed from: b */
    private long f40355b;

    /* renamed from: c */
    private long f40356c;

    /* renamed from: d */
    private long f40357d;

    /* renamed from: e */
    private long f40358e;

    /* renamed from: f */
    private long f40359f;

    /* renamed from: g */
    private final boolean[] f40360g = new boolean[15];

    /* renamed from: h */
    private int f40361h;

    /* renamed from: a */
    public final long mo35388a() {
        long j = this.f40358e;
        if (j == 0) {
            return 0;
        }
        return this.f40359f / j;
    }

    /* renamed from: b */
    public final long mo35389b() {
        return this.f40359f;
    }

    /* renamed from: c */
    public final void mo35390c(long j) {
        long j2 = this.f40357d;
        if (j2 == 0) {
            this.f40354a = j;
        } else if (j2 == 1) {
            long j3 = j - this.f40354a;
            this.f40355b = j3;
            this.f40359f = j3;
            this.f40358e = 1;
        } else {
            long j4 = j - this.f40356c;
            int i = (int) (j2 % 15);
            if (Math.abs(j4 - this.f40355b) <= 1000000) {
                this.f40358e++;
                this.f40359f += j4;
                boolean[] zArr = this.f40360g;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f40361h--;
                }
            } else {
                boolean[] zArr2 = this.f40360g;
                if (!zArr2[i]) {
                    zArr2[i] = true;
                    this.f40361h++;
                }
            }
        }
        this.f40357d++;
        this.f40356c = j;
    }

    /* renamed from: d */
    public final void mo35391d() {
        this.f40357d = 0;
        this.f40358e = 0;
        this.f40359f = 0;
        this.f40361h = 0;
        Arrays.fill(this.f40360g, false);
    }

    /* renamed from: e */
    public final boolean mo35392e() {
        long j = this.f40357d;
        if (j == 0) {
            return false;
        }
        return this.f40360g[(int) ((j - 1) % 15)];
    }

    /* renamed from: f */
    public final boolean mo35393f() {
        return this.f40357d > 15 && this.f40361h == 0;
    }
}
