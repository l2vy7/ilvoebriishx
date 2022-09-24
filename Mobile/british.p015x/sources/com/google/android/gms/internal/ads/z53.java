package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class z53 {
    /* renamed from: a */
    static int m21259a(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r9 = r6 & r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r5 != -1) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        m21263e(r12, r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r13[r5] = (r9 & r11) | (r13[r5] & r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m21260b(@javax.annotation.CheckForNull java.lang.Object r9, @javax.annotation.CheckForNull java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, @javax.annotation.CheckForNull java.lang.Object[] r15) {
        /*
            int r0 = com.google.android.gms.internal.ads.h63.m20519b(r9)
            r1 = r0 & r11
            int r2 = m21261c(r12, r1)
            r3 = -1
            if (r2 == 0) goto L_0x0042
            r4 = r11 ^ -1
            r0 = r0 & r4
            r5 = -1
        L_0x0011:
            int r2 = r2 + r3
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L_0x003a
            r7 = r14[r2]
            boolean r7 = com.google.android.gms.internal.ads.x33.m21118a(r9, r7)
            if (r7 == 0) goto L_0x003a
            if (r15 == 0) goto L_0x002a
            r7 = r15[r2]
            boolean r7 = com.google.android.gms.internal.ads.x33.m21118a(r10, r7)
            if (r7 == 0) goto L_0x003a
        L_0x002a:
            r9 = r6 & r11
            if (r5 != r3) goto L_0x0032
            m21263e(r12, r1, r9)
            goto L_0x0039
        L_0x0032:
            r10 = r13[r5]
            r10 = r10 & r4
            r9 = r9 & r11
            r9 = r9 | r10
            r13[r5] = r9
        L_0x0039:
            return r2
        L_0x003a:
            r5 = r6 & r11
            if (r5 == 0) goto L_0x0042
            r8 = r5
            r5 = r2
            r2 = r8
            goto L_0x0011
        L_0x0042:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z53.m21260b(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    /* renamed from: c */
    static int m21261c(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: d */
    static Object m21262d(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= 256) {
            return new byte[i];
        } else {
            return i <= 65536 ? new short[i] : new int[i];
        }
    }

    /* renamed from: e */
    static void m21263e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
