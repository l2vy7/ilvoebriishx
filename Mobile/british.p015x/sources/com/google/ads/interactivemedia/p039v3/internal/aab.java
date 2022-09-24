package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aab */
/* compiled from: IMASDK */
public final class aab implements aaz, aay {

    /* renamed from: a */
    public final aaz f13911a;

    /* renamed from: b */
    final long f13912b;

    /* renamed from: c */
    private aay f13913c;

    /* renamed from: d */
    private aaa[] f13914d = new aaa[0];

    /* renamed from: e */
    private long f13915e = 0;

    public aab(aaz aaz, long j) {
        this.f13911a = aaz;
        this.f13912b = j;
    }

    /* renamed from: a */
    public final void mo13228a(aay aay, long j) {
        this.f13913c = aay;
        this.f13911a.mo13228a(this, j);
    }

    /* renamed from: b */
    public final void mo13229b() throws IOException {
        this.f13911a.mo13229b();
    }

    /* renamed from: bd */
    public final void mo13230bd(long j) {
        this.f13911a.mo13230bd(j);
    }

    /* renamed from: c */
    public final acq mo13231c() {
        return this.f13911a.mo13231c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r3 > r6) goto L_0x004a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo13232d(com.google.ads.interactivemedia.p039v3.internal.aih[] r14, boolean[] r15, com.google.ads.interactivemedia.p039v3.internal.ach[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = 2
            com.google.ads.interactivemedia.v3.internal.aaa[] r2 = new com.google.ads.interactivemedia.p039v3.internal.aaa[r1]
            r0.f13914d = r2
            com.google.ads.interactivemedia.v3.internal.ach[] r2 = new com.google.ads.interactivemedia.p039v3.internal.ach[r1]
            r10 = 0
            r3 = 0
        L_0x000a:
            r11 = 0
            if (r3 >= r1) goto L_0x001e
            com.google.ads.interactivemedia.v3.internal.aaa[] r4 = r0.f13914d
            r5 = r16[r3]
            com.google.ads.interactivemedia.v3.internal.aaa r5 = (com.google.ads.interactivemedia.p039v3.internal.aaa) r5
            r4[r3] = r5
            if (r5 == 0) goto L_0x0019
            com.google.ads.interactivemedia.v3.internal.ach r11 = r5.f13908a
        L_0x0019:
            r2[r3] = r11
            int r3 = r3 + 1
            goto L_0x000a
        L_0x001e:
            com.google.ads.interactivemedia.v3.internal.aaz r3 = r0.f13911a
            r4 = r14
            r5 = r15
            r6 = r2
            r7 = r17
            r8 = r18
            long r3 = r3.mo13232d(r4, r5, r6, r7, r8)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f13915e = r5
            r5 = 1
            int r6 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r6 == 0) goto L_0x004b
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x004a
            long r6 = r0.f13912b
            r8 = -9223372036854775808
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x004b
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r5 = 0
        L_0x004b:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r5)
        L_0x004e:
            if (r10 >= r1) goto L_0x0073
            r5 = r2[r10]
            if (r5 != 0) goto L_0x0059
            com.google.ads.interactivemedia.v3.internal.aaa[] r5 = r0.f13914d
            r5[r10] = r11
            goto L_0x006a
        L_0x0059:
            com.google.ads.interactivemedia.v3.internal.aaa[] r6 = r0.f13914d
            r7 = r6[r10]
            if (r7 == 0) goto L_0x0063
            com.google.ads.interactivemedia.v3.internal.ach r7 = r7.f13908a
            if (r7 == r5) goto L_0x006a
        L_0x0063:
            com.google.ads.interactivemedia.v3.internal.aaa r7 = new com.google.ads.interactivemedia.v3.internal.aaa
            r7.<init>(r13, r5)
            r6[r10] = r7
        L_0x006a:
            com.google.ads.interactivemedia.v3.internal.aaa[] r5 = r0.f13914d
            r5 = r5[r10]
            r16[r10] = r5
            int r10 = r10 + 1
            goto L_0x004e
        L_0x0073:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aab.mo13232d(com.google.ads.interactivemedia.v3.internal.aih[], boolean[], com.google.ads.interactivemedia.v3.internal.ach[], boolean[], long):long");
    }

    /* renamed from: f */
    public final long mo13233f() {
        if (mo13242o()) {
            long j = this.f13915e;
            this.f13915e = C6540C.TIME_UNSET;
            long f = mo13233f();
            return f != C6540C.TIME_UNSET ? f : j;
        }
        long f2 = this.f13911a.mo13233f();
        if (f2 == C6540C.TIME_UNSET) {
            return C6540C.TIME_UNSET;
        }
        boolean z = false;
        aup.m14887r(f2 >= 0);
        long j2 = this.f13912b;
        if (j2 == Long.MIN_VALUE || f2 <= j2) {
            z = true;
        }
        aup.m14887r(z);
        return f2;
    }

    /* renamed from: g */
    public final long mo13234g() {
        long g = this.f13911a.mo13234g();
        if (g != Long.MIN_VALUE) {
            long j = this.f13912b;
            if (j == Long.MIN_VALUE || g < j) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r0 > r8) goto L_0x0036;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo13235h(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f13915e = r0
            com.google.ads.interactivemedia.v3.internal.aaa[] r0 = r7.f13914d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo13223a()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.google.ads.interactivemedia.v3.internal.aaz r0 = r7.f13911a
            long r0 = r0.mo13235h(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0035
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0036
            long r8 = r7.f13912b
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0035
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            com.google.ads.interactivemedia.p039v3.internal.aup.m14887r(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.aab.mo13235h(long):long");
    }

    /* renamed from: i */
    public final long mo13236i(long j, C4159lq lqVar) {
        if (j == 0) {
            return 0;
        }
        long I = amm.m14192I(lqVar.f17855c, 0, j);
        long j2 = lqVar.f17856d;
        long j3 = this.f13912b;
        long I2 = amm.m14192I(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (!(I == lqVar.f17855c && I2 == lqVar.f17856d)) {
            lqVar = new C4159lq(I, I2);
        }
        return this.f13911a.mo13236i(j, lqVar);
    }

    /* renamed from: j */
    public final void mo13237j(aaz aaz) {
        aay aay = this.f13913c;
        aup.m14890u(aay);
        aay.mo13237j(this);
    }

    /* renamed from: k */
    public final long mo13238k() {
        long k = this.f13911a.mo13238k();
        if (k != Long.MIN_VALUE) {
            long j = this.f13912b;
            if (j == Long.MIN_VALUE || k < j) {
                return k;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo13239l(acj acj) {
        aaz aaz = (aaz) acj;
        aay aay = this.f13913c;
        aup.m14890u(aay);
        aay.mo13239l(this);
    }

    /* renamed from: m */
    public final boolean mo13240m(long j) {
        return this.f13911a.mo13240m(j);
    }

    /* renamed from: n */
    public final boolean mo13241n() {
        return this.f13911a.mo13241n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo13242o() {
        return this.f13915e != C6540C.TIME_UNSET;
    }

    /* renamed from: p */
    public final void mo13243p(long j) {
        this.f13911a.mo13243p(j);
    }
}
