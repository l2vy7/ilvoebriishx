package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amk */
/* compiled from: IMASDK */
public final class amk {

    /* renamed from: a */
    private boolean f15293a;

    /* renamed from: b */
    private long f15294b;

    /* renamed from: c */
    private long f15295c;

    /* renamed from: d */
    private long f15296d = C6540C.TIME_UNSET;

    public amk(long j) {
        this.f15294b = j;
    }

    /* renamed from: h */
    public static long m14175h(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: i */
    public static long m14176i(long j) {
        return (j * 90000) / 1000000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r4 != r2.f15294b) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13993a(boolean r3, long r4) throws java.lang.InterruptedException {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0004
            goto L_0x0013
        L_0x0004:
            boolean r3 = r2.f15293a     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x000d
            r2.f15294b = r4     // Catch:{ all -> 0x0022 }
            r3 = 1
            r2.f15293a = r3     // Catch:{ all -> 0x0022 }
        L_0x000d:
            long r0 = r2.f15294b     // Catch:{ all -> 0x0022 }
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x0024
        L_0x0013:
            long r3 = r2.f15296d     // Catch:{ all -> 0x0022 }
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0024
            r2.wait()     // Catch:{ all -> 0x0022 }
            goto L_0x0013
        L_0x0022:
            r3 = move-exception
            goto L_0x0026
        L_0x0024:
            monitor-exit(r2)
            return
        L_0x0026:
            monitor-exit(r2)
            goto L_0x0029
        L_0x0028:
            throw r3
        L_0x0029:
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.amk.mo13993a(boolean, long):void");
    }

    /* renamed from: b */
    public final synchronized long mo13994b() {
        return this.f15294b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo13995c() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.f15296d     // Catch:{ all -> 0x001f }
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0010
            long r2 = r7.f15295c     // Catch:{ all -> 0x001f }
            long r2 = r2 + r0
            goto L_0x001b
        L_0x0010:
            long r0 = r7.f15294b     // Catch:{ all -> 0x001f }
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x001d
        L_0x001b:
            monitor-exit(r7)
            return r2
        L_0x001d:
            monitor-exit(r7)
            return r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.amk.mo13995c():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return r4;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo13996d() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.f15294b     // Catch:{ all -> 0x0020 }
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0014
            r4 = 0
            goto L_0x001a
        L_0x0014:
            long r0 = r7.f15296d     // Catch:{ all -> 0x0020 }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x001c
        L_0x001a:
            monitor-exit(r7)
            return r4
        L_0x001c:
            long r0 = r7.f15295c     // Catch:{ all -> 0x0020 }
            monitor-exit(r7)
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.amk.mo13996d():long");
    }

    /* renamed from: e */
    public final synchronized void mo13997e(long j) {
        this.f15294b = j;
        this.f15296d = C6540C.TIME_UNSET;
        this.f15293a = false;
    }

    /* renamed from: f */
    public final synchronized long mo13998f(long j) {
        if (j == C6540C.TIME_UNSET) {
            return C6540C.TIME_UNSET;
        }
        long j2 = this.f15296d;
        if (j2 != C6540C.TIME_UNSET) {
            long i = m14176i(j2);
            long j3 = (4294967296L + i) / 8589934592L;
            long j4 = ((-1 + j3) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - i) < Math.abs(j - i)) {
                j = j4;
            }
        }
        return mo13999g(m14175h(j));
    }

    /* renamed from: g */
    public final synchronized long mo13999g(long j) {
        if (j == C6540C.TIME_UNSET) {
            return C6540C.TIME_UNSET;
        }
        if (this.f15296d != C6540C.TIME_UNSET) {
            this.f15296d = j;
        } else {
            long j2 = this.f15294b;
            if (j2 != Long.MAX_VALUE) {
                this.f15295c = j2 - j;
            }
            this.f15296d = j;
            notifyAll();
        }
        return j + this.f15295c;
    }
}
