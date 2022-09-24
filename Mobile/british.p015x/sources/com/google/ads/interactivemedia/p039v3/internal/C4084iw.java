package com.google.ads.interactivemedia.p039v3.internal;

import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.iw */
/* compiled from: IMASDK */
public final class C4084iw {

    /* renamed from: a */
    private final float f17466a = 0.97f;

    /* renamed from: b */
    private final float f17467b = 1.03f;

    /* renamed from: c */
    private final long f17468c = 1000;

    /* renamed from: d */
    private final float f17469d = 1.0E-7f;

    /* renamed from: e */
    private final long f17470e;

    /* renamed from: f */
    private final long f17471f;

    /* renamed from: g */
    private final float f17472g;

    /* renamed from: h */
    private long f17473h;

    /* renamed from: i */
    private long f17474i;

    /* renamed from: j */
    private long f17475j;

    /* renamed from: k */
    private long f17476k;

    /* renamed from: l */
    private long f17477l;

    /* renamed from: m */
    private long f17478m;

    /* renamed from: n */
    private float f17479n;

    /* renamed from: o */
    private float f17480o;

    /* renamed from: p */
    private float f17481p;

    /* renamed from: q */
    private long f17482q;

    /* renamed from: r */
    private long f17483r;

    /* renamed from: s */
    private long f17484s;

    /* synthetic */ C4084iw(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f17470e = j2;
        this.f17471f = j3;
        this.f17472g = 0.999f;
        this.f17473h = C6540C.TIME_UNSET;
        this.f17474i = C6540C.TIME_UNSET;
        this.f17476k = C6540C.TIME_UNSET;
        this.f17477l = C6540C.TIME_UNSET;
        this.f17480o = 0.97f;
        this.f17479n = 1.03f;
        this.f17481p = 1.0f;
        this.f17482q = C6540C.TIME_UNSET;
        this.f17475j = C6540C.TIME_UNSET;
        this.f17478m = C6540C.TIME_UNSET;
        this.f17483r = C6540C.TIME_UNSET;
        this.f17484s = C6540C.TIME_UNSET;
    }

    /* renamed from: f */
    private final void m17455f() {
        long j = this.f17473h;
        if (j != C6540C.TIME_UNSET) {
            long j2 = this.f17474i;
            if (j2 != C6540C.TIME_UNSET) {
                j = j2;
            }
            long j3 = this.f17476k;
            if (j3 != C6540C.TIME_UNSET && j < j3) {
                j = j3;
            }
            long j4 = this.f17477l;
            if (j4 != C6540C.TIME_UNSET && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f17475j != j) {
            this.f17475j = j;
            this.f17478m = j;
            this.f17483r = C6540C.TIME_UNSET;
            this.f17484s = C6540C.TIME_UNSET;
            this.f17482q = C6540C.TIME_UNSET;
        }
    }

    /* renamed from: g */
    private static long m17456g(long j, long j2, float f) {
        return (long) ((((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f));
    }

    /* renamed from: a */
    public final void mo15964a(C4127kl klVar) {
        this.f17473h = C4083iv.m17452b(klVar.f17715a);
        this.f17476k = C4083iv.m17452b(klVar.f17716b);
        this.f17477l = C4083iv.m17452b(klVar.f17717c);
        float f = klVar.f17718d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.f17480o = f;
        float f2 = klVar.f17719e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        this.f17479n = f2;
        m17455f();
    }

    /* renamed from: b */
    public final void mo15965b(long j) {
        this.f17474i = j;
        m17455f();
    }

    /* renamed from: c */
    public final void mo15966c() {
        long j = this.f17478m;
        if (j != C6540C.TIME_UNSET) {
            long j2 = j + this.f17471f;
            this.f17478m = j2;
            long j3 = this.f17477l;
            if (j3 != C6540C.TIME_UNSET && j2 > j3) {
                this.f17478m = j3;
            }
            this.f17482q = C6540C.TIME_UNSET;
        }
    }

    /* renamed from: d */
    public final float mo15967d(long j, long j2) {
        long j3;
        if (this.f17473h == C6540C.TIME_UNSET) {
            return 1.0f;
        }
        long j4 = j - j2;
        long j5 = this.f17483r;
        if (j5 == C6540C.TIME_UNSET) {
            this.f17483r = j4;
            this.f17484s = 0;
        } else {
            long max = Math.max(j4, m17456g(j5, j4, 0.999f));
            this.f17483r = max;
            this.f17484s = m17456g(this.f17484s, Math.abs(j4 - max), 0.999f);
        }
        if (this.f17482q != C6540C.TIME_UNSET && SystemClock.elapsedRealtime() - this.f17482q < 1000) {
            return this.f17481p;
        }
        this.f17482q = SystemClock.elapsedRealtime();
        long j6 = this.f17483r + (this.f17484s * 3);
        if (this.f17478m > j6) {
            long b = C4083iv.m17452b(1000);
            float f = (float) b;
            long[] jArr = {j6, this.f17475j, this.f17478m - (((long) ((this.f17481p - 4.0f) * f)) + ((long) ((this.f17479n - 4.0f) * f)))};
            ars.m14621a(true);
            j3 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j3) {
                    j3 = j7;
                }
            }
            this.f17478m = j3;
        } else {
            j3 = amm.m14192I(j - ((long) (Math.max(0.0f, this.f17481p - 4.0f) / 1.0E-7f)), this.f17478m, j6);
            this.f17478m = j3;
            long j8 = this.f17477l;
            if (j8 != C6540C.TIME_UNSET && j3 > j8) {
                this.f17478m = j8;
                j3 = j8;
            }
        }
        long j9 = j - j3;
        if (Math.abs(j9) < this.f17470e) {
            this.f17481p = 1.0f;
            return 1.0f;
        }
        float J = amm.m14193J((((float) j9) * 1.0E-7f) + 1.0f, this.f17480o, this.f17479n);
        this.f17481p = J;
        return J;
    }

    /* renamed from: e */
    public final long mo15968e() {
        return this.f17478m;
    }
}
