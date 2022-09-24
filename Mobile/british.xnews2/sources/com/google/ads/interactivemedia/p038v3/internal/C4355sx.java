package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sx */
/* compiled from: IMASDK */
final class C4355sx {

    /* renamed from: a */
    private final byte[] f18657a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<C4354sw> f18658b = new ArrayDeque<>();

    /* renamed from: c */
    private final C4364tf f18659c = new C4364tf();

    /* renamed from: d */
    private C4356sy f18660d;

    /* renamed from: e */
    private int f18661e;

    /* renamed from: f */
    private int f18662f;

    /* renamed from: g */
    private long f18663g;

    /* renamed from: d */
    private final long m18900d(C4307rc rcVar, int i) throws IOException {
        rcVar.mo16596c(this.f18657a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f18657a[i2] & 255));
        }
        return j;
    }

    /* renamed from: a */
    public final void mo16638a(C4356sy syVar) {
        this.f18660d = syVar;
    }

    /* renamed from: b */
    public final void mo16639b() {
        this.f18661e = 0;
        this.f18658b.clear();
        this.f18659c.mo16653a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r0 == 1) goto L_0x0093;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16640c(com.google.ads.interactivemedia.p038v3.internal.C4307rc r13) throws java.io.IOException {
        /*
            r12 = this;
            com.google.ads.interactivemedia.v3.internal.sy r0 = r12.f18660d
            com.google.ads.interactivemedia.p038v3.internal.aup.m14889t(r0)
        L_0x0005:
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.sw> r0 = r12.f18658b
            java.lang.Object r0 = r0.peek()
            com.google.ads.interactivemedia.v3.internal.sw r0 = (com.google.ads.interactivemedia.p038v3.internal.C4354sw) r0
            r1 = 1
            if (r0 == 0) goto L_0x0033
            long r2 = r13.mo16605l()
            long r4 = r0.f18656b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            goto L_0x0033
        L_0x001d:
            com.google.ads.interactivemedia.v3.internal.sy r13 = r12.f18660d
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.sw> r0 = r12.f18658b
            java.lang.Object r0 = r0.pop()
            com.google.ads.interactivemedia.v3.internal.sw r0 = (com.google.ads.interactivemedia.p038v3.internal.C4354sw) r0
            int r0 = r0.f18655a
            com.google.ads.interactivemedia.v3.internal.ta r13 = (com.google.ads.interactivemedia.p038v3.internal.C4359ta) r13
            com.google.ads.interactivemedia.v3.internal.td r13 = r13.f18674a
            r13.mo16647b(r0)
            return r1
        L_0x0033:
            int r0 = r12.f18661e
            r2 = 4
            r3 = 0
            if (r0 != 0) goto L_0x0091
            com.google.ads.interactivemedia.v3.internal.tf r0 = r12.f18659c
            long r4 = r0.mo16654b(r13, r1, r3, r2)
            r6 = -2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0084
            r13.mo16603j()
        L_0x0048:
            byte[] r0 = r12.f18657a
            r13.mo16600g(r0, r3, r2)
            byte[] r0 = r12.f18657a
            byte r0 = r0[r3]
            int r0 = com.google.ads.interactivemedia.p038v3.internal.C4364tf.m18951d(r0)
            r4 = -1
            if (r0 == r4) goto L_0x0080
            if (r0 > r2) goto L_0x0080
            byte[] r4 = r12.f18657a
            long r4 = com.google.ads.interactivemedia.p038v3.internal.C4364tf.m18952e(r4, r0, r3)
            int r5 = (int) r4
            com.google.ads.interactivemedia.v3.internal.sy r4 = r12.f18660d
            com.google.ads.interactivemedia.v3.internal.ta r4 = (com.google.ads.interactivemedia.p038v3.internal.C4359ta) r4
            com.google.ads.interactivemedia.v3.internal.td r4 = r4.f18674a
            r4 = 357149030(0x1549a966, float:4.072526E-26)
            if (r5 == r4) goto L_0x007b
            r4 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r5 == r4) goto L_0x007b
            r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r5 == r4) goto L_0x007b
            r4 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r5 != r4) goto L_0x0080
        L_0x007b:
            r13.mo16597d(r0)
            long r4 = (long) r5
            goto L_0x0084
        L_0x0080:
            r13.mo16597d(r1)
            goto L_0x0048
        L_0x0084:
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x008b
            return r3
        L_0x008b:
            int r0 = (int) r4
            r12.f18662f = r0
            r12.f18661e = r1
            goto L_0x0093
        L_0x0091:
            if (r0 != r1) goto L_0x00a0
        L_0x0093:
            com.google.ads.interactivemedia.v3.internal.tf r0 = r12.f18659c
            r4 = 8
            long r4 = r0.mo16654b(r13, r3, r1, r4)
            r12.f18663g = r4
            r0 = 2
            r12.f18661e = r0
        L_0x00a0:
            com.google.ads.interactivemedia.v3.internal.sy r0 = r12.f18660d
            int r4 = r12.f18662f
            com.google.ads.interactivemedia.v3.internal.ta r0 = (com.google.ads.interactivemedia.p038v3.internal.C4359ta) r0
            com.google.ads.interactivemedia.v3.internal.td r5 = r0.f18674a
            r6 = 8
            switch(r4) {
                case 131: goto L_0x0167;
                case 134: goto L_0x0123;
                case 136: goto L_0x0167;
                case 155: goto L_0x0167;
                case 159: goto L_0x0167;
                case 160: goto L_0x0100;
                case 161: goto L_0x00f7;
                case 163: goto L_0x00f7;
                case 165: goto L_0x00f7;
                case 166: goto L_0x0100;
                case 174: goto L_0x0100;
                case 176: goto L_0x0167;
                case 179: goto L_0x0167;
                case 181: goto L_0x00b7;
                case 183: goto L_0x0100;
                case 186: goto L_0x0167;
                case 187: goto L_0x0100;
                case 215: goto L_0x0167;
                case 224: goto L_0x0100;
                case 225: goto L_0x0100;
                case 231: goto L_0x0167;
                case 238: goto L_0x0167;
                case 241: goto L_0x0167;
                case 251: goto L_0x0167;
                case 16868: goto L_0x0100;
                case 16871: goto L_0x0167;
                case 16877: goto L_0x00f7;
                case 16980: goto L_0x0167;
                case 16981: goto L_0x00f7;
                case 17026: goto L_0x0123;
                case 17029: goto L_0x0167;
                case 17143: goto L_0x0167;
                case 17545: goto L_0x00b7;
                case 18401: goto L_0x0167;
                case 18402: goto L_0x00f7;
                case 18407: goto L_0x0100;
                case 18408: goto L_0x0167;
                case 19899: goto L_0x0100;
                case 20529: goto L_0x0167;
                case 20530: goto L_0x0167;
                case 20532: goto L_0x0100;
                case 20533: goto L_0x0100;
                case 21358: goto L_0x0123;
                case 21419: goto L_0x00f7;
                case 21420: goto L_0x0167;
                case 21432: goto L_0x0167;
                case 21680: goto L_0x0167;
                case 21682: goto L_0x0167;
                case 21690: goto L_0x0167;
                case 21930: goto L_0x0167;
                case 21936: goto L_0x0100;
                case 21945: goto L_0x0167;
                case 21946: goto L_0x0167;
                case 21947: goto L_0x0167;
                case 21948: goto L_0x0167;
                case 21949: goto L_0x0167;
                case 21968: goto L_0x0100;
                case 21969: goto L_0x00b7;
                case 21970: goto L_0x00b7;
                case 21971: goto L_0x00b7;
                case 21972: goto L_0x00b7;
                case 21973: goto L_0x00b7;
                case 21974: goto L_0x00b7;
                case 21975: goto L_0x00b7;
                case 21976: goto L_0x00b7;
                case 21977: goto L_0x00b7;
                case 21978: goto L_0x00b7;
                case 21998: goto L_0x0167;
                case 22186: goto L_0x0167;
                case 22203: goto L_0x0167;
                case 25152: goto L_0x0100;
                case 25188: goto L_0x0167;
                case 25506: goto L_0x00f7;
                case 28032: goto L_0x0100;
                case 30113: goto L_0x0100;
                case 30320: goto L_0x0100;
                case 30321: goto L_0x0167;
                case 30322: goto L_0x00f7;
                case 30323: goto L_0x00b7;
                case 30324: goto L_0x00b7;
                case 30325: goto L_0x00b7;
                case 2274716: goto L_0x0123;
                case 2352003: goto L_0x0167;
                case 2807729: goto L_0x0167;
                case 290298740: goto L_0x0100;
                case 357149030: goto L_0x0100;
                case 374648427: goto L_0x0100;
                case 408125543: goto L_0x0100;
                case 440786851: goto L_0x0100;
                case 475249515: goto L_0x0100;
                case 524531317: goto L_0x0100;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            long r0 = r12.f18663g
            int r1 = (int) r0
            r13.mo16597d(r1)
            r12.f18661e = r3
            goto L_0x0005
        L_0x00b7:
            long r8 = r12.f18663g
            r10 = 4
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00dd
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x00c4
            goto L_0x00dd
        L_0x00c4:
            com.google.ads.interactivemedia.v3.internal.lb r13 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Invalid float size: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r13.<init>((java.lang.String) r0)
            throw r13
        L_0x00dd:
            int r5 = (int) r8
            long r6 = r12.m18900d(r13, r5)
            if (r5 != r2) goto L_0x00eb
            int r13 = (int) r6
            float r13 = java.lang.Float.intBitsToFloat(r13)
            double r5 = (double) r13
            goto L_0x00ef
        L_0x00eb:
            double r5 = java.lang.Double.longBitsToDouble(r6)
        L_0x00ef:
            com.google.ads.interactivemedia.v3.internal.td r13 = r0.f18674a
            r13.mo16649i(r4, r5)
            r12.f18661e = r3
            return r1
        L_0x00f7:
            long r6 = r12.f18663g
            int r0 = (int) r6
            r5.mo16651k(r4, r0, r13)
            r12.f18661e = r3
            return r1
        L_0x0100:
            long r8 = r13.mo16605l()
            long r4 = r12.f18663g
            java.util.ArrayDeque<com.google.ads.interactivemedia.v3.internal.sw> r13 = r12.f18658b
            com.google.ads.interactivemedia.v3.internal.sw r0 = new com.google.ads.interactivemedia.v3.internal.sw
            int r2 = r12.f18662f
            long r4 = r4 + r8
            r0.<init>(r2, r4)
            r13.push(r0)
            com.google.ads.interactivemedia.v3.internal.sy r13 = r12.f18660d
            int r7 = r12.f18662f
            long r10 = r12.f18663g
            com.google.ads.interactivemedia.v3.internal.ta r13 = (com.google.ads.interactivemedia.p038v3.internal.C4359ta) r13
            com.google.ads.interactivemedia.v3.internal.td r6 = r13.f18674a
            r6.mo16646a(r7, r8, r10)
            r12.f18661e = r3
            return r1
        L_0x0123:
            long r5 = r12.f18663g
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x014e
            int r2 = (int) r5
            if (r2 != 0) goto L_0x0132
            java.lang.String r13 = ""
            goto L_0x0146
        L_0x0132:
            byte[] r5 = new byte[r2]
            r13.mo16596c(r5, r3, r2)
        L_0x0137:
            if (r2 <= 0) goto L_0x0141
            int r13 = r2 + -1
            byte r6 = r5[r13]
            if (r6 != 0) goto L_0x0141
            r2 = r13
            goto L_0x0137
        L_0x0141:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r5, r3, r2)
        L_0x0146:
            com.google.ads.interactivemedia.v3.internal.td r0 = r0.f18674a
            r0.mo16650j(r4, r13)
            r12.f18661e = r3
            return r1
        L_0x014e:
            com.google.ads.interactivemedia.v3.internal.lb r13 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 41
            r0.<init>(r1)
            java.lang.String r1 = "String element size: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r13.<init>((java.lang.String) r0)
            throw r13
        L_0x0167:
            long r8 = r12.f18663g
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x017a
            int r2 = (int) r8
            long r5 = r12.m18900d(r13, r2)
            com.google.ads.interactivemedia.v3.internal.td r13 = r0.f18674a
            r13.mo16648c(r4, r5)
            r12.f18661e = r3
            return r1
        L_0x017a:
            com.google.ads.interactivemedia.v3.internal.lb r13 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 42
            r0.<init>(r1)
            java.lang.String r1 = "Invalid integer size: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r13.<init>((java.lang.String) r0)
            goto L_0x0194
        L_0x0193:
            throw r13
        L_0x0194:
            goto L_0x0193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4355sx.mo16640c(com.google.ads.interactivemedia.v3.internal.rc):boolean");
    }
}
