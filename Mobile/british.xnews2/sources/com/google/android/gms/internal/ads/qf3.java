package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qf3 {

    /* renamed from: a */
    private final long f38018a;

    /* renamed from: b */
    private final long f38019b;

    /* renamed from: c */
    private long f38020c = C6540C.TIME_UNSET;

    /* renamed from: d */
    private long f38021d = C6540C.TIME_UNSET;

    /* renamed from: e */
    private long f38022e = C6540C.TIME_UNSET;

    /* renamed from: f */
    private long f38023f = C6540C.TIME_UNSET;

    /* renamed from: g */
    private long f38024g = C6540C.TIME_UNSET;

    /* renamed from: h */
    private long f38025h = C6540C.TIME_UNSET;

    /* renamed from: i */
    private float f38026i = 1.03f;

    /* renamed from: j */
    private float f38027j = 0.97f;

    /* renamed from: k */
    private float f38028k = 1.0f;

    /* renamed from: l */
    private long f38029l = C6540C.TIME_UNSET;

    /* renamed from: m */
    private long f38030m = C6540C.TIME_UNSET;

    /* renamed from: n */
    private long f38031n = C6540C.TIME_UNSET;

    /* synthetic */ qf3(float f, float f2, long j, float f3, long j2, long j3, float f4, pe3 pe3) {
        this.f38018a = j2;
        this.f38019b = j3;
    }

    /* renamed from: f */
    private static long m36457f(long j, long j2, float f) {
        return (long) ((((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f));
    }

    /* renamed from: g */
    private final void m36458g() {
        long j = this.f38020c;
        if (j != C6540C.TIME_UNSET) {
            long j2 = this.f38021d;
            if (j2 != C6540C.TIME_UNSET) {
                j = j2;
            }
            long j3 = this.f38023f;
            if (j3 != C6540C.TIME_UNSET && j < j3) {
                j = j3;
            }
            long j4 = this.f38024g;
            if (j4 != C6540C.TIME_UNSET && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f38022e != j) {
            this.f38022e = j;
            this.f38025h = j;
            this.f38030m = C6540C.TIME_UNSET;
            this.f38031n = C6540C.TIME_UNSET;
            this.f38029l = C6540C.TIME_UNSET;
        }
    }

    /* renamed from: a */
    public final float mo34337a(long j, long j2) {
        long j3;
        if (this.f38020c == C6540C.TIME_UNSET) {
            return 1.0f;
        }
        long j4 = j - j2;
        long j5 = this.f38030m;
        if (j5 == C6540C.TIME_UNSET) {
            this.f38030m = j4;
            this.f38031n = 0;
        } else {
            long max = Math.max(j4, m36457f(j5, j4, 0.999f));
            this.f38030m = max;
            this.f38031n = m36457f(this.f38031n, Math.abs(j4 - max), 0.999f);
        }
        if (this.f38029l != C6540C.TIME_UNSET && SystemClock.elapsedRealtime() - this.f38029l < 1000) {
            return this.f38028k;
        }
        this.f38029l = SystemClock.elapsedRealtime();
        long j6 = this.f38030m + (this.f38031n * 3);
        if (this.f38025h > j6) {
            long c = xy3.m39691c(1000);
            float f = (float) c;
            long[] jArr = {j6, this.f38022e, this.f38025h - (((long) ((this.f38028k - 4.0f) * f)) + ((long) ((this.f38026i - 4.0f) * f)))};
            j3 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j3) {
                    j3 = j7;
                }
            }
            this.f38025h = j3;
        } else {
            j3 = d13.m20290U(j - ((long) (Math.max(0.0f, this.f38028k - 4.0f) / 1.0E-7f)), this.f38025h, j6);
            this.f38025h = j3;
            long j8 = this.f38024g;
            if (j8 != C6540C.TIME_UNSET && j3 > j8) {
                this.f38025h = j8;
                j3 = j8;
            }
        }
        long j9 = j - j3;
        if (Math.abs(j9) < this.f38018a) {
            this.f38028k = 1.0f;
            return 1.0f;
        }
        float A = d13.m20270A((((float) j9) * 1.0E-7f) + 1.0f, this.f38027j, this.f38026i);
        this.f38028k = A;
        return A;
    }

    /* renamed from: b */
    public final long mo34338b() {
        return this.f38025h;
    }

    /* renamed from: c */
    public final void mo34339c() {
        long j = this.f38025h;
        if (j != C6540C.TIME_UNSET) {
            long j2 = j + this.f38019b;
            this.f38025h = j2;
            long j3 = this.f38024g;
            if (j3 != C6540C.TIME_UNSET && j2 > j3) {
                this.f38025h = j3;
            }
            this.f38029l = C6540C.TIME_UNSET;
        }
    }

    /* renamed from: d */
    public final void mo34340d(C7831jh jhVar) {
        long j = jhVar.f33888a;
        this.f38020c = xy3.m39691c(C6540C.TIME_UNSET);
        this.f38023f = xy3.m39691c(C6540C.TIME_UNSET);
        this.f38024g = xy3.m39691c(C6540C.TIME_UNSET);
        this.f38027j = 0.97f;
        this.f38026i = 1.03f;
        m36458g();
    }

    /* renamed from: e */
    public final void mo34341e(long j) {
        this.f38021d = j;
        m36458g();
    }
}
