package com.google.ads.interactivemedia.p038v3.internal;

import java.io.IOException;
import java.util.BitSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bic */
/* compiled from: IMASDK */
final class bic extends bfi<BitSet> {
    bic() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r8.mo15097l() != 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (java.lang.Integer.parseInt(r1) != 0) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object read(com.google.ads.interactivemedia.p038v3.internal.biw r8) throws java.io.IOException {
        /*
            r7 = this;
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r8.mo15085a()
            int r1 = r8.mo15101p()
            r2 = 0
            r3 = 0
        L_0x000e:
            r4 = 2
            if (r1 == r4) goto L_0x0082
            int r4 = r1 + -1
            r5 = 5
            r6 = 1
            if (r4 == r5) goto L_0x0050
            r5 = 6
            if (r4 == r5) goto L_0x0047
            r5 = 7
            if (r4 != r5) goto L_0x0022
            boolean r6 = r8.mo15093h()
            goto L_0x005a
        L_0x0022:
            java.lang.String r8 = com.google.ads.interactivemedia.p038v3.internal.bix.m15972a(r1)
            com.google.ads.interactivemedia.v3.internal.bff r0 = new com.google.ads.interactivemedia.v3.internal.bff
            java.lang.String r1 = java.lang.String.valueOf(r8)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 27
            r2.<init>(r1)
            java.lang.String r1 = "Invalid bitset value type: "
            r2.append(r1)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r0.<init>((java.lang.String) r8)
            throw r0
        L_0x0047:
            int r1 = r8.mo15097l()
            if (r1 == 0) goto L_0x004e
            goto L_0x005a
        L_0x004e:
            r6 = 0
            goto L_0x005a
        L_0x0050:
            java.lang.String r1 = r8.mo15092g()
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0066 }
            if (r1 == 0) goto L_0x004e
        L_0x005a:
            if (r6 == 0) goto L_0x005f
            r0.set(r3)
        L_0x005f:
            int r3 = r3 + 1
            int r1 = r8.mo15101p()
            goto L_0x000e
        L_0x0066:
            com.google.ads.interactivemedia.v3.internal.bff r8 = new com.google.ads.interactivemedia.v3.internal.bff
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Error: Expecting: bitset number value (1, 0), Found: "
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0079
            java.lang.String r0 = r1.concat(r0)
            goto L_0x007e
        L_0x0079:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x007e:
            r8.<init>((java.lang.String) r0)
            throw r8
        L_0x0082:
            r8.mo15086b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.bic.read(com.google.ads.interactivemedia.v3.internal.biw):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ void write(biy biy, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        biy.mo15107b();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            biy.mo15115h(bitSet.get(i) ? 1 : 0);
        }
        biy.mo15110d();
    }
}
