package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vf */
/* compiled from: IMASDK */
final class C4418vf extends C4416vd {

    /* renamed from: a */
    private C4417ve f19151a;

    /* renamed from: b */
    private int f19152b;

    /* renamed from: c */
    private boolean f19153c;

    /* renamed from: d */
    private C4332sa f19154d;

    /* renamed from: e */
    private C4329ry f19155e;

    C4418vf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16689a(boolean z) {
        super.mo16689a(z);
        if (z) {
            this.f19151a = null;
            this.f19154d = null;
            this.f19155e = null;
        }
        this.f19152b = 0;
        this.f19153c = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo16690b(alw alw) {
        int i;
        int i2 = 0;
        if ((alw.mo13952j()[0] & 1) == 1) {
            return -1;
        }
        byte b = alw.mo13952j()[0];
        C4417ve veVar = this.f19151a;
        aup.m14889t(veVar);
        if (!veVar.f19149c[(b >> 1) & (255 >>> (8 - veVar.f19150d))].f18550a) {
            i = veVar.f19147a.f18555e;
        } else {
            i = veVar.f19147a.f18556f;
        }
        if (this.f19153c) {
            i2 = (this.f19152b + i) / 4;
        }
        long j = (long) i2;
        if (alw.mo13953k() < alw.mo13948f() + 4) {
            alw.mo13944b(Arrays.copyOf(alw.mo13952j(), alw.mo13948f() + 4));
        } else {
            alw.mo13949g(alw.mo13948f() + 4);
        }
        byte[] j2 = alw.mo13952j();
        j2[alw.mo13948f() - 4] = (byte) ((int) (j & 255));
        j2[alw.mo13948f() - 3] = (byte) ((int) ((j >>> 8) & 255));
        j2[alw.mo13948f() - 2] = (byte) ((int) ((j >>> 16) & 255));
        j2[alw.mo13948f() - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f19153c = true;
        this.f19152b = i;
        return j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0097 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16691c(com.google.ads.interactivemedia.p038v3.internal.alw r17, long r18, com.google.ads.interactivemedia.p038v3.internal.C4414vb r20) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r20
            com.google.ads.interactivemedia.v3.internal.ve r3 = r0.f19151a
            r4 = 0
            if (r3 != 0) goto L_0x00d1
            com.google.ads.interactivemedia.v3.internal.sa r3 = r0.f19154d
            r6 = -1
            r7 = 1
            if (r3 != 0) goto L_0x0064
            com.google.ads.interactivemedia.p038v3.internal.ajq.m13890d(r7, r1, r4)
            r17.mo13935D()
            int r9 = r17.mo13957o()
            int r10 = r17.mo13935D()
            int r3 = r17.mo13966x()
            if (r3 > 0) goto L_0x0027
            r11 = -1
            goto L_0x0028
        L_0x0027:
            r11 = r3
        L_0x0028:
            int r3 = r17.mo13966x()
            if (r3 > 0) goto L_0x0030
            r12 = -1
            goto L_0x0031
        L_0x0030:
            r12 = r3
        L_0x0031:
            r17.mo13966x()
            int r3 = r17.mo13957o()
            r4 = r3 & 15
            double r13 = (double) r4
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = java.lang.Math.pow(r5, r13)
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> 4
            double r3 = (double) r3
            double r3 = java.lang.Math.pow(r5, r3)
            r17.mo13957o()
            byte[] r5 = r17.mo13952j()
            int r1 = r17.mo13948f()
            byte[] r15 = java.util.Arrays.copyOf(r5, r1)
            com.google.ads.interactivemedia.v3.internal.sa r1 = new com.google.ads.interactivemedia.v3.internal.sa
            int r13 = (int) r13
            int r14 = (int) r3
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.f19154d = r1
            goto L_0x006e
        L_0x0064:
            com.google.ads.interactivemedia.v3.internal.ry r5 = r0.f19155e
            if (r5 != 0) goto L_0x0070
            com.google.ads.interactivemedia.v3.internal.ry r1 = com.google.ads.interactivemedia.p038v3.internal.ajq.m13889c(r1, r7, r7)
            r0.f19155e = r1
        L_0x006e:
            r5 = 0
            goto L_0x0093
        L_0x0070:
            int r5 = r17.mo13948f()
            byte[] r5 = new byte[r5]
            byte[] r8 = r17.mo13952j()
            int r9 = r17.mo13948f()
            java.lang.System.arraycopy(r8, r4, r5, r4, r9)
            int r4 = r3.f18551a
            com.google.ads.interactivemedia.v3.internal.rz[] r1 = com.google.ads.interactivemedia.p038v3.internal.ajq.m13891e(r1, r4)
            com.google.ads.interactivemedia.v3.internal.ve r4 = new com.google.ads.interactivemedia.v3.internal.ve
            int r8 = r1.length
            int r8 = r8 + r6
            int r6 = com.google.ads.interactivemedia.p038v3.internal.ajq.m13888b(r8)
            r4.<init>(r3, r5, r1, r6)
            r5 = r4
        L_0x0093:
            r0.f19151a = r5
            if (r5 != 0) goto L_0x0098
            return r7
        L_0x0098:
            com.google.ads.interactivemedia.v3.internal.sa r1 = r5.f19147a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            byte[] r4 = r1.f18557g
            r3.add(r4)
            byte[] r4 = r5.f19148b
            r3.add(r4)
            com.google.ads.interactivemedia.v3.internal.kd r4 = new com.google.ads.interactivemedia.v3.internal.kd
            r4.<init>()
            java.lang.String r5 = "audio/vorbis"
            r4.mo16120ae(r5)
            int r5 = r1.f18554d
            r4.mo16095G(r5)
            int r5 = r1.f18553c
            r4.mo16114Z(r5)
            int r5 = r1.f18551a
            r4.mo16096H(r5)
            int r1 = r1.f18552b
            r4.mo16121af(r1)
            r4.mo16108T(r3)
            com.google.ads.interactivemedia.v3.internal.ke r1 = r4.mo16115a()
            r2.f19132a = r1
            return r7
        L_0x00d1:
            com.google.ads.interactivemedia.v3.internal.ke r1 = r2.f19132a
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4418vf.mo16691c(com.google.ads.interactivemedia.v3.internal.alw, long, com.google.ads.interactivemedia.v3.internal.vb):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo16706j(long j) {
        super.mo16706j(j);
        int i = 0;
        this.f19153c = j != 0;
        C4332sa saVar = this.f19154d;
        if (saVar != null) {
            i = saVar.f18555e;
        }
        this.f19152b = i;
    }
}
