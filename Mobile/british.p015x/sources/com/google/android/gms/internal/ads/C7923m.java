package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* renamed from: com.google.android.gms.internal.ads.m */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7923m {

    /* renamed from: a */
    private final byte[] f35319a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<C7886l> f35320b = new ArrayDeque<>();

    /* renamed from: c */
    private final C8316x f35321c = new C8316x();

    /* renamed from: d */
    private C7961n f35322d;

    /* renamed from: e */
    private int f35323e;

    /* renamed from: f */
    private int f35324f;

    /* renamed from: g */
    private long f35325g;

    /* renamed from: d */
    private final long m34628d(wb4 wb4, int i) throws IOException {
        ((qb4) wb4).mo33310d(this.f35319a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f35319a[i2] & 255));
        }
        return j;
    }

    /* renamed from: a */
    public final void mo33443a(C7961n nVar) {
        this.f35322d = nVar;
    }

    /* renamed from: b */
    public final void mo33444b() {
        this.f35323e = 0;
        this.f35320b.clear();
        this.f35321c.mo35702e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (r0 == 1) goto L_0x0089;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33445c(com.google.android.gms.internal.ads.wb4 r13) throws java.io.IOException {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.n r0 = r12.f35322d
            com.google.android.gms.internal.ads.nu1.m20743b(r0)
        L_0x0005:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.l> r0 = r12.f35320b
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.l r0 = (com.google.android.gms.internal.ads.C7886l) r0
            r1 = 1
            if (r0 == 0) goto L_0x0033
            long r2 = r13.zze()
            long r4 = r0.f34754b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            goto L_0x0033
        L_0x001d:
            com.google.android.gms.internal.ads.n r13 = r12.f35322d
            java.util.ArrayDeque<com.google.android.gms.internal.ads.l> r0 = r12.f35320b
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.l r0 = (com.google.android.gms.internal.ads.C7886l) r0
            int r0 = r0.f34753a
            com.google.android.gms.internal.ads.q r13 = (com.google.android.gms.internal.ads.C8069q) r13
            com.google.android.gms.internal.ads.u r13 = r13.f37817a
            r13.mo18860h(r0)
            return r1
        L_0x0033:
            int r0 = r12.f35323e
            r2 = 2
            r3 = 4
            r4 = 0
            if (r0 != 0) goto L_0x0087
            com.google.android.gms.internal.ads.x r0 = r12.f35321c
            long r5 = r0.mo35701d(r13, r1, r4, r3)
            r7 = -2
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x007a
            r13.zzj()
        L_0x0049:
            byte[] r0 = r12.f35319a
            r5 = r13
            com.google.android.gms.internal.ads.qb4 r5 = (com.google.android.gms.internal.ads.qb4) r5
            r5.mo33311e(r0, r4, r3, r4)
            byte[] r0 = r12.f35319a
            byte r0 = r0[r4]
            int r0 = com.google.android.gms.internal.ads.C8316x.m39314b(r0)
            r6 = -1
            if (r0 == r6) goto L_0x0076
            if (r0 > r3) goto L_0x0076
            byte[] r6 = r12.f35319a
            long r6 = com.google.android.gms.internal.ads.C8316x.m39315c(r6, r0, r4)
            int r7 = (int) r6
            com.google.android.gms.internal.ads.n r6 = r12.f35322d
            com.google.android.gms.internal.ads.q r6 = (com.google.android.gms.internal.ads.C8069q) r6
            com.google.android.gms.internal.ads.u r6 = r6.f37817a
            boolean r6 = com.google.android.gms.internal.ads.C4626u.m21045o(r7)
            if (r6 == 0) goto L_0x0076
            r5.mo34305k(r0, r4)
            long r5 = (long) r7
            goto L_0x007a
        L_0x0076:
            r5.mo34305k(r1, r4)
            goto L_0x0049
        L_0x007a:
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            return r4
        L_0x0081:
            int r0 = (int) r5
            r12.f35324f = r0
            r12.f35323e = r1
            goto L_0x0089
        L_0x0087:
            if (r0 != r1) goto L_0x0095
        L_0x0089:
            com.google.android.gms.internal.ads.x r0 = r12.f35321c
            r5 = 8
            long r5 = r0.mo35701d(r13, r4, r1, r5)
            r12.f35325g = r5
            r12.f35323e = r2
        L_0x0095:
            com.google.android.gms.internal.ads.n r0 = r12.f35322d
            int r5 = r12.f35324f
            com.google.android.gms.internal.ads.q r0 = (com.google.android.gms.internal.ads.C8069q) r0
            com.google.android.gms.internal.ads.u r0 = r0.f37817a
            int r0 = com.google.android.gms.internal.ads.C4626u.m21044n(r5)
            if (r0 == 0) goto L_0x01a4
            r5 = 0
            if (r0 == r1) goto L_0x0181
            r6 = 8
            if (r0 == r2) goto L_0x0150
            r2 = 3
            if (r0 == r2) goto L_0x0105
            if (r0 == r3) goto L_0x00f4
            long r8 = r12.f35325g
            r10 = 4
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00d4
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            goto L_0x00d4
        L_0x00bc:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 40
            r13.<init>(r0)
            java.lang.String r0 = "Invalid float size: "
            r13.append(r0)
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            com.google.android.gms.internal.ads.iy r13 = com.google.android.gms.internal.ads.C7811iy.m33482a(r13, r5)
            throw r13
        L_0x00d4:
            com.google.android.gms.internal.ads.n r0 = r12.f35322d
            int r2 = r12.f35324f
            int r5 = (int) r8
            long r6 = r12.m34628d(r13, r5)
            if (r5 != r3) goto L_0x00e6
            int r13 = (int) r6
            float r13 = java.lang.Float.intBitsToFloat(r13)
            double r5 = (double) r13
            goto L_0x00ea
        L_0x00e6:
            double r5 = java.lang.Double.longBitsToDouble(r6)
        L_0x00ea:
            com.google.android.gms.internal.ads.q r0 = (com.google.android.gms.internal.ads.C8069q) r0
            com.google.android.gms.internal.ads.u r13 = r0.f37817a
            r13.mo18861i(r2, r5)
            r12.f35323e = r4
            return r1
        L_0x00f4:
            com.google.android.gms.internal.ads.n r0 = r12.f35322d
            int r2 = r12.f35324f
            long r5 = r12.f35325g
            com.google.android.gms.internal.ads.q r0 = (com.google.android.gms.internal.ads.C8069q) r0
            com.google.android.gms.internal.ads.u r0 = r0.f37817a
            int r3 = (int) r5
            r0.mo18859g(r2, r3, r13)
            r12.f35323e = r4
            return r1
        L_0x0105:
            long r2 = r12.f35325g
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0138
            com.google.android.gms.internal.ads.n r0 = r12.f35322d
            int r5 = r12.f35324f
            int r3 = (int) r2
            if (r3 != 0) goto L_0x0118
            java.lang.String r13 = ""
            goto L_0x012e
        L_0x0118:
            byte[] r2 = new byte[r3]
            com.google.android.gms.internal.ads.qb4 r13 = (com.google.android.gms.internal.ads.qb4) r13
            r13.mo33310d(r2, r4, r3, r4)
        L_0x011f:
            if (r3 <= 0) goto L_0x0129
            int r13 = r3 + -1
            byte r6 = r2[r13]
            if (r6 != 0) goto L_0x0129
            r3 = r13
            goto L_0x011f
        L_0x0129:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r2, r4, r3)
        L_0x012e:
            com.google.android.gms.internal.ads.q r0 = (com.google.android.gms.internal.ads.C8069q) r0
            com.google.android.gms.internal.ads.u r0 = r0.f37817a
            r0.mo18864l(r5, r13)
            r12.f35323e = r4
            return r1
        L_0x0138:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 41
            r13.<init>(r0)
            java.lang.String r0 = "String element size: "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            com.google.android.gms.internal.ads.iy r13 = com.google.android.gms.internal.ads.C7811iy.m33482a(r13, r5)
            throw r13
        L_0x0150:
            long r2 = r12.f35325g
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0169
            com.google.android.gms.internal.ads.n r0 = r12.f35322d
            int r5 = r12.f35324f
            int r3 = (int) r2
            long r2 = r12.m34628d(r13, r3)
            com.google.android.gms.internal.ads.q r0 = (com.google.android.gms.internal.ads.C8069q) r0
            com.google.android.gms.internal.ads.u r13 = r0.f37817a
            r13.mo18862j(r5, r2)
            r12.f35323e = r4
            return r1
        L_0x0169:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 42
            r13.<init>(r0)
            java.lang.String r0 = "Invalid integer size: "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            com.google.android.gms.internal.ads.iy r13 = com.google.android.gms.internal.ads.C7811iy.m33482a(r13, r5)
            throw r13
        L_0x0181:
            long r7 = r13.zze()
            long r2 = r12.f35325g
            java.util.ArrayDeque<com.google.android.gms.internal.ads.l> r13 = r12.f35320b
            com.google.android.gms.internal.ads.l r0 = new com.google.android.gms.internal.ads.l
            int r6 = r12.f35324f
            long r2 = r2 + r7
            r0.<init>(r6, r2, r5)
            r13.push(r0)
            com.google.android.gms.internal.ads.n r13 = r12.f35322d
            int r6 = r12.f35324f
            long r9 = r12.f35325g
            com.google.android.gms.internal.ads.q r13 = (com.google.android.gms.internal.ads.C8069q) r13
            com.google.android.gms.internal.ads.u r5 = r13.f37817a
            r5.mo18863k(r6, r7, r9)
            r12.f35323e = r4
            return r1
        L_0x01a4:
            long r0 = r12.f35325g
            r2 = r13
            com.google.android.gms.internal.ads.qb4 r2 = (com.google.android.gms.internal.ads.qb4) r2
            int r1 = (int) r0
            r2.mo34305k(r1, r4)
            r12.f35323e = r4
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7923m.mo33445c(com.google.android.gms.internal.ads.wb4):boolean");
    }
}
