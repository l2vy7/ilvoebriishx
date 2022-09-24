package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.eh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7646eh {

    /* renamed from: a */
    private final byte[] f31378a = new byte[8];

    /* renamed from: b */
    private final Stack<C7609dh> f31379b = new Stack<>();

    /* renamed from: c */
    private final C7979nh f31380c = new C7979nh();

    /* renamed from: d */
    private int f31381d;

    /* renamed from: e */
    private int f31382e;

    /* renamed from: f */
    private long f31383f;

    /* renamed from: g */
    private C7757hh f31384g;

    C7646eh() {
    }

    /* renamed from: d */
    private final long m31838d(C8121rg rgVar, int i) throws IOException, InterruptedException {
        rgVar.mo34538h(this.f31378a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f31378a[i2] & 255));
        }
        return j;
    }

    /* renamed from: a */
    public final void mo31574a() {
        this.f31381d = 0;
        this.f31379b.clear();
        this.f31380c.mo33699d();
    }

    /* renamed from: b */
    public final void mo31575b(C7757hh hhVar) {
        this.f31384g = hhVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r0 == 1) goto L_0x008d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo31576c(com.google.android.gms.internal.ads.C8121rg r12) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.hh r0 = r11.f31384g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.C8195tl.m37900e(r0)
        L_0x000c:
            java.util.Stack<com.google.android.gms.internal.ads.dh> r0 = r11.f31379b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003d
            long r3 = r12.mo34534d()
            java.util.Stack<com.google.android.gms.internal.ads.dh> r0 = r11.f31379b
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.dh r0 = (com.google.android.gms.internal.ads.C7609dh) r0
            long r5 = r0.f30764b
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            com.google.android.gms.internal.ads.hh r12 = r11.f31384g
            java.util.Stack<com.google.android.gms.internal.ads.dh> r0 = r11.f31379b
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.dh r0 = (com.google.android.gms.internal.ads.C7609dh) r0
            int r0 = r0.f30763a
            com.google.android.gms.internal.ads.lh r12 = r12.f32729a
            r12.mo33329f(r0)
            return r1
        L_0x003d:
            int r0 = r11.f31381d
            r3 = 2
            r4 = 4
            if (r0 != 0) goto L_0x008b
            com.google.android.gms.internal.ads.nh r0 = r11.f31380c
            long r5 = r0.mo33700e(r12, r1, r2, r4)
            r7 = -2
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            r12.mo34535e()
        L_0x0052:
            byte[] r0 = r11.f31378a
            r12.mo34537g(r0, r2, r4, r2)
            byte[] r0 = r11.f31378a
            byte r0 = r0[r2]
            int r0 = com.google.android.gms.internal.ads.C7979nh.m35156b(r0)
            r5 = -1
            if (r0 == r5) goto L_0x007a
            if (r0 > r4) goto L_0x007a
            byte[] r5 = r11.f31378a
            long r5 = com.google.android.gms.internal.ads.C7979nh.m35157c(r5, r0, r2)
            int r6 = (int) r5
            com.google.android.gms.internal.ads.hh r5 = r11.f31384g
            com.google.android.gms.internal.ads.lh r5 = r5.f32729a
            boolean r5 = com.google.android.gms.internal.ads.C7904lh.m34448m(r6)
            if (r5 == 0) goto L_0x007a
            r12.mo34539i(r0, r2)
            long r5 = (long) r6
            goto L_0x007e
        L_0x007a:
            r12.mo34539i(r1, r2)
            goto L_0x0052
        L_0x007e:
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0085
            return r2
        L_0x0085:
            int r0 = (int) r5
            r11.f31382e = r0
            r11.f31381d = r1
            goto L_0x008d
        L_0x008b:
            if (r0 != r1) goto L_0x0099
        L_0x008d:
            com.google.android.gms.internal.ads.nh r0 = r11.f31380c
            r5 = 8
            long r5 = r0.mo33700e(r12, r2, r1, r5)
            r11.f31383f = r5
            r11.f31381d = r3
        L_0x0099:
            com.google.android.gms.internal.ads.hh r0 = r11.f31384g
            int r5 = r11.f31382e
            com.google.android.gms.internal.ads.lh r0 = r0.f32729a
            int r0 = com.google.android.gms.internal.ads.C7904lh.m34447l(r5)
            if (r0 == 0) goto L_0x0193
            if (r0 == r1) goto L_0x0171
            r5 = 8
            if (r0 == r3) goto L_0x0141
            r3 = 3
            if (r0 == r3) goto L_0x0103
            if (r0 == r4) goto L_0x00f4
            long r7 = r11.f31383f
            r9 = 4
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00d6
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00bd
            goto L_0x00d6
        L_0x00bd:
            com.google.android.gms.internal.ads.se r12 = new com.google.android.gms.internal.ads.se
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Invalid float size: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x00d6:
            com.google.android.gms.internal.ads.hh r0 = r11.f31384g
            int r3 = r11.f31382e
            int r5 = (int) r7
            long r6 = r11.m31838d(r12, r5)
            if (r5 != r4) goto L_0x00e8
            int r12 = (int) r6
            float r12 = java.lang.Float.intBitsToFloat(r12)
            double r4 = (double) r12
            goto L_0x00ec
        L_0x00e8:
            double r4 = java.lang.Double.longBitsToDouble(r6)
        L_0x00ec:
            com.google.android.gms.internal.ads.lh r12 = r0.f32729a
            r12.mo33330g(r3, r4)
            r11.f31381d = r2
            return r1
        L_0x00f4:
            com.google.android.gms.internal.ads.hh r0 = r11.f31384g
            int r3 = r11.f31382e
            long r4 = r11.f31383f
            com.google.android.gms.internal.ads.lh r0 = r0.f32729a
            int r5 = (int) r4
            r0.mo33334k(r3, r5, r12)
            r11.f31381d = r2
            return r1
        L_0x0103:
            long r3 = r11.f31383f
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0128
            com.google.android.gms.internal.ads.hh r0 = r11.f31384g
            int r5 = r11.f31382e
            int r4 = (int) r3
            if (r4 != 0) goto L_0x0116
            java.lang.String r12 = ""
            goto L_0x0120
        L_0x0116:
            byte[] r3 = new byte[r4]
            r12.mo34538h(r3, r2, r4, r2)
            java.lang.String r12 = new java.lang.String
            r12.<init>(r3)
        L_0x0120:
            com.google.android.gms.internal.ads.lh r0 = r0.f32729a
            r0.mo33333j(r5, r12)
            r11.f31381d = r2
            return r1
        L_0x0128:
            com.google.android.gms.internal.ads.se r12 = new com.google.android.gms.internal.ads.se
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 41
            r0.<init>(r1)
            java.lang.String r1 = "String element size: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x0141:
            long r3 = r11.f31383f
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0158
            com.google.android.gms.internal.ads.hh r0 = r11.f31384g
            int r5 = r11.f31382e
            int r4 = (int) r3
            long r3 = r11.m31838d(r12, r4)
            com.google.android.gms.internal.ads.lh r12 = r0.f32729a
            r12.mo33331h(r5, r3)
            r11.f31381d = r2
            return r1
        L_0x0158:
            com.google.android.gms.internal.ads.se r12 = new com.google.android.gms.internal.ads.se
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 42
            r0.<init>(r1)
            java.lang.String r1 = "Invalid integer size: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x0171:
            long r5 = r12.mo34534d()
            long r3 = r11.f31383f
            java.util.Stack<com.google.android.gms.internal.ads.dh> r12 = r11.f31379b
            com.google.android.gms.internal.ads.dh r0 = new com.google.android.gms.internal.ads.dh
            int r7 = r11.f31382e
            long r3 = r3 + r5
            r8 = 0
            r0.<init>(r7, r3, r8)
            r12.add(r0)
            com.google.android.gms.internal.ads.hh r12 = r11.f31384g
            int r4 = r11.f31382e
            long r7 = r11.f31383f
            com.google.android.gms.internal.ads.lh r3 = r12.f32729a
            r3.mo33332i(r4, r5, r7)
            r11.f31381d = r2
            return r1
        L_0x0193:
            long r3 = r11.f31383f
            int r0 = (int) r3
            r12.mo34539i(r0, r2)
            r11.f31381d = r2
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7646eh.mo31576c(com.google.android.gms.internal.ads.rg):boolean");
    }
}
