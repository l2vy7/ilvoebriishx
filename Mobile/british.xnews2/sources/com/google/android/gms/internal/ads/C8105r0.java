package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p039ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8105r0 {

    /* renamed from: a */
    private static final byte[] f38446a = d13.m20324w("OpusHead");

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        if (r3 != 13) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        r3 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<com.google.android.gms.internal.ads.zzdd, com.google.android.gms.internal.ads.zzdd> m36830a(com.google.android.gms.internal.ads.C7814j0 r11) {
        /*
            com.google.android.gms.internal.ads.uq2 r11 = r11.f33686b
            r0 = 8
            r11.mo35236f(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x000a:
            int r4 = r11.mo35239i()
            if (r4 < r0) goto L_0x00da
            int r4 = r11.mo35241k()
            int r5 = r11.mo35243m()
            int r6 = r11.mo35243m()
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 != r7) goto L_0x0075
            r11.mo35236f(r4)
            int r2 = r4 + r5
            r11.mo35237g(r0)
            m36833d(r11)
        L_0x002c:
            int r6 = r11.mo35241k()
            if (r6 >= r2) goto L_0x0073
            int r6 = r11.mo35241k()
            int r7 = r11.mo35243m()
            int r8 = r11.mo35243m()
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r9) goto L_0x006e
            r11.mo35236f(r6)
            int r6 = r6 + r7
            r11.mo35237g(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x004f:
            int r7 = r11.mo35241k()
            if (r7 >= r6) goto L_0x005f
            com.google.android.gms.internal.ads.zzdc r7 = com.google.android.gms.internal.ads.C8389z0.m40108a(r11)
            if (r7 == 0) goto L_0x004f
            r2.add(r7)
            goto L_0x004f
        L_0x005f:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0066
            goto L_0x0073
        L_0x0066:
            com.google.android.gms.internal.ads.zzdd r6 = new com.google.android.gms.internal.ads.zzdd
            r6.<init>((java.util.List<? extends com.google.android.gms.internal.ads.zzdc>) r2)
            r2 = r6
            goto L_0x00d4
        L_0x006e:
            int r6 = r6 + r7
            r11.mo35236f(r6)
            goto L_0x002c
        L_0x0073:
            r2 = r1
            goto L_0x00d4
        L_0x0075:
            r7 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r6 != r7) goto L_0x00d4
            r11.mo35236f(r4)
            int r3 = r4 + r5
            r6 = 12
            r11.mo35237g(r6)
        L_0x0084:
            int r7 = r11.mo35241k()
            if (r7 >= r3) goto L_0x00d3
            int r7 = r11.mo35241k()
            int r8 = r11.mo35243m()
            int r9 = r11.mo35243m()
            r10 = 1935766900(0x73617574, float:1.7862687E31)
            if (r9 != r10) goto L_0x00ce
            r3 = 14
            if (r8 >= r3) goto L_0x00a0
            goto L_0x00d3
        L_0x00a0:
            r3 = 5
            r11.mo35237g(r3)
            int r3 = r11.mo35249s()
            r7 = 1123024896(0x42f00000, float:120.0)
            if (r3 == r6) goto L_0x00b1
            r6 = 13
            if (r3 == r6) goto L_0x00b5
            goto L_0x00d3
        L_0x00b1:
            if (r3 != r6) goto L_0x00b5
            r7 = 1131413504(0x43700000, float:240.0)
        L_0x00b5:
            r3 = 1
            r11.mo35237g(r3)
            int r6 = r11.mo35249s()
            com.google.android.gms.internal.ads.zzdd r8 = new com.google.android.gms.internal.ads.zzdd
            com.google.android.gms.internal.ads.zzdc[] r3 = new com.google.android.gms.internal.ads.zzdc[r3]
            com.google.android.gms.internal.ads.zzaan r9 = new com.google.android.gms.internal.ads.zzaan
            r9.<init>((float) r7, (int) r6)
            r6 = 0
            r3[r6] = r9
            r8.<init>((com.google.android.gms.internal.ads.zzdc[]) r3)
            r3 = r8
            goto L_0x00d4
        L_0x00ce:
            int r7 = r7 + r8
            r11.mo35236f(r7)
            goto L_0x0084
        L_0x00d3:
            r3 = r1
        L_0x00d4:
            int r4 = r4 + r5
            r11.mo35236f(r4)
            goto L_0x000a
        L_0x00da:
            android.util.Pair r11 = android.util.Pair.create(r2, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8105r0.m36830a(com.google.android.gms.internal.ads.j0):android.util.Pair");
    }

    /* renamed from: b */
    public static zzdd m36831b(C7777i0 i0Var) {
        zzaah zzaah;
        C7814j0 d = i0Var.mo32508d(Atom.TYPE_hdlr);
        C7814j0 d2 = i0Var.mo32508d(Atom.TYPE_keys);
        C7814j0 d3 = i0Var.mo32508d(Atom.TYPE_ilst);
        if (d == null || d2 == null || d3 == null || m36836g(d.f33686b) != 1835299937) {
            return null;
        }
        uq2 uq2 = d2.f33686b;
        uq2.mo35236f(12);
        int m = uq2.mo35243m();
        String[] strArr = new String[m];
        for (int i = 0; i < m; i++) {
            int m2 = uq2.mo35243m();
            uq2.mo35237g(4);
            strArr[i] = uq2.mo35228F(m2 - 8, n33.f35887c);
        }
        uq2 uq22 = d3.f33686b;
        uq22.mo35236f(8);
        ArrayList arrayList = new ArrayList();
        while (uq22.mo35239i() > 8) {
            int k = uq22.mo35241k();
            int m3 = uq22.mo35243m();
            int m4 = uq22.mo35243m() - 1;
            if (m4 < 0 || m4 >= m) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(m4);
                Log.w("AtomParsers", sb.toString());
            } else {
                String str = strArr[m4];
                int i2 = k + m3;
                int i3 = C8389z0.f42249b;
                while (true) {
                    int k2 = uq22.mo35241k();
                    if (k2 >= i2) {
                        zzaah = null;
                        break;
                    }
                    int m5 = uq22.mo35243m();
                    if (uq22.mo35243m() == 1684108385) {
                        int m6 = uq22.mo35243m();
                        int m7 = uq22.mo35243m();
                        int i4 = m5 - 16;
                        byte[] bArr = new byte[i4];
                        uq22.mo35232b(bArr, 0, i4);
                        zzaah = new zzaah(str, bArr, m7, m6);
                        break;
                    }
                    uq22.mo35236f(k2 + m5);
                }
                if (zzaah != null) {
                    arrayList.add(zzaah);
                }
            }
            uq22.mo35236f(k + m3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzdd((List<? extends zzdc>) arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:349:0x073b  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x07a6  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x07aa  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x07e4  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0996  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0a74 A[LOOP:13: B:477:0x0a74->B:481:0x0a7e, LOOP_START, PHI: r20 
      PHI: (r20v12 int) = (r20v11 int), (r20v13 int) binds: [B:476:0x0a72, B:481:0x0a7e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0a87  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0ac5  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0ad6  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0ad9  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x0b3a  */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x0b52  */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x0c13  */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x0c5e  */
    /* JADX WARNING: Removed duplicated region for block: B:546:0x0c60  */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x0c75  */
    /* JADX WARNING: Removed duplicated region for block: B:567:0x0cdf  */
    /* JADX WARNING: Removed duplicated region for block: B:568:0x0ce1  */
    /* JADX WARNING: Removed duplicated region for block: B:571:0x0ce5  */
    /* JADX WARNING: Removed duplicated region for block: B:572:0x0ce9  */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0ced  */
    /* JADX WARNING: Removed duplicated region for block: B:575:0x0cf1  */
    /* JADX WARNING: Removed duplicated region for block: B:578:0x0cf6  */
    /* JADX WARNING: Removed duplicated region for block: B:579:0x0cf8  */
    /* JADX WARNING: Removed duplicated region for block: B:581:0x0cfc  */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x0d00  */
    /* JADX WARNING: Removed duplicated region for block: B:586:0x0d0d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0db7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:631:0x0a68 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:642:0x0cd6 A[EDGE_INSN: B:642:0x0cd6->B:565:0x0cd6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01fd  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.google.android.gms.internal.ads.C7888l1> m36832c(com.google.android.gms.internal.ads.C7777i0 r49, com.google.android.gms.internal.ads.mc4 r50, long r51, com.google.android.gms.internal.ads.zzs r53, boolean r54, boolean r55, com.google.android.gms.internal.ads.p33<com.google.android.gms.internal.ads.C7778i1, com.google.android.gms.internal.ads.C7778i1> r56) throws com.google.android.gms.internal.ads.C7811iy {
        /*
            r0 = r49
            r1 = r50
            r12 = r53
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r15 = 0
        L_0x000c:
            java.util.List<com.google.android.gms.internal.ads.i0> r2 = r0.f33007d
            int r2 = r2.size()
            if (r15 >= r2) goto L_0x0dc4
            java.util.List<com.google.android.gms.internal.ads.i0> r2 = r0.f33007d
            java.lang.Object r2 = r2.get(r15)
            r11 = r2
            com.google.android.gms.internal.ads.i0 r11 = (com.google.android.gms.internal.ads.C7777i0) r11
            int r2 = r11.f34088a
            r3 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r3) goto L_0x0029
            r0 = r13
            r31 = r15
            goto L_0x0db9
        L_0x0029:
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.android.gms.internal.ads.j0 r2 = r0.mo32508d(r2)
            java.util.Objects.requireNonNull(r2)
            r10 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.i0 r3 = r11.mo32507c(r10)
            java.util.Objects.requireNonNull(r3)
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.gms.internal.ads.j0 r4 = r3.mo32508d(r4)
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.internal.ads.uq2 r4 = r4.f33686b
            int r4 = m36836g(r4)
            int r9 = m36834e(r4)
            java.lang.String r7 = "AtomParsers"
            r5 = 4
            r31 = r15
            r6 = -1
            if (r9 != r6) goto L_0x0063
            r0 = r56
            r45 = r7
            r2 = r11
            r32 = r13
        L_0x0060:
            r8 = 0
            goto L_0x07db
        L_0x0063:
            r15 = 1953196132(0x746b6864, float:7.46037E31)
            com.google.android.gms.internal.ads.j0 r15 = r11.mo32508d(r15)
            java.util.Objects.requireNonNull(r15)
            com.google.android.gms.internal.ads.uq2 r15 = r15.f33686b
            r14 = 8
            r15.mo35236f(r14)
            int r18 = r15.mo35243m()
            int r18 = com.google.android.gms.internal.ads.C7850k0.m33804a(r18)
            r14 = 16
            if (r18 != 0) goto L_0x0083
            r4 = 8
            goto L_0x0085
        L_0x0083:
            r4 = 16
        L_0x0085:
            r15.mo35237g(r4)
            int r4 = r15.mo35243m()
            r15.mo35237g(r5)
            int r21 = r15.mo35241k()
            if (r18 != 0) goto L_0x0097
            r8 = 4
            goto L_0x0099
        L_0x0097:
            r8 = 8
        L_0x0099:
            r10 = 0
        L_0x009a:
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r10 >= r8) goto L_0x00c5
            byte[] r26 = r15.mo35238h()
            int r27 = r21 + r10
            byte r5 = r26[r27]
            if (r5 == r6) goto L_0x00c1
            if (r18 != 0) goto L_0x00b2
            long r26 = r15.mo35223A()
            goto L_0x00b6
        L_0x00b2:
            long r26 = r15.mo35224B()
        L_0x00b6:
            r29 = 0
            int r5 = (r26 > r29 ? 1 : (r26 == r29 ? 0 : -1))
            if (r5 != 0) goto L_0x00bd
            goto L_0x00c8
        L_0x00bd:
            r8 = r7
            r6 = r26
            goto L_0x00cb
        L_0x00c1:
            int r10 = r10 + 1
            r5 = 4
            goto L_0x009a
        L_0x00c5:
            r15.mo35237g(r8)
        L_0x00c8:
            r8 = r7
            r6 = r24
        L_0x00cb:
            r15.mo35237g(r14)
            int r5 = r15.mo35243m()
            int r10 = r15.mo35243m()
            r14 = 4
            r15.mo35237g(r14)
            int r14 = r15.mo35243m()
            int r15 = r15.mo35243m()
            r0 = 65536(0x10000, float:9.18355E-41)
            r26 = r8
            r8 = -65536(0xffffffffffff0000, float:NaN)
            if (r5 != 0) goto L_0x00fe
            if (r10 != r0) goto L_0x00fd
            if (r14 != r8) goto L_0x00f9
            if (r15 != 0) goto L_0x00f3
            r0 = 90
            goto L_0x011e
        L_0x00f3:
            r5 = 0
            r10 = 65536(0x10000, float:9.18355E-41)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x00fe
        L_0x00f9:
            r5 = 0
            r10 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00fe
        L_0x00fd:
            r5 = 0
        L_0x00fe:
            if (r5 != 0) goto L_0x0111
            if (r10 != r8) goto L_0x010e
            if (r14 != r0) goto L_0x0109
            if (r15 != 0) goto L_0x010a
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x011e
        L_0x0109:
            r0 = r14
        L_0x010a:
            r5 = 0
            r10 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x0112
        L_0x010e:
            r0 = r14
            r5 = 0
            goto L_0x0112
        L_0x0111:
            r0 = r14
        L_0x0112:
            if (r5 != r8) goto L_0x011d
            if (r10 != 0) goto L_0x011d
            if (r0 != 0) goto L_0x011d
            if (r15 != r8) goto L_0x011d
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            com.google.android.gms.internal.ads.q0 r14 = new com.google.android.gms.internal.ads.q0
            r14.<init>(r4, r6, r0)
            int r0 = (r51 > r24 ? 1 : (r51 == r24 ? 0 : -1))
            if (r0 != 0) goto L_0x012e
            long r4 = r14.f37819b
            r32 = r4
            goto L_0x0130
        L_0x012e:
            r32 = r51
        L_0x0130:
            com.google.android.gms.internal.ads.uq2 r0 = r2.f33686b
            r2 = 8
            r0.mo35236f(r2)
            int r2 = r0.mo35243m()
            int r2 = com.google.android.gms.internal.ads.C7850k0.m33804a(r2)
            if (r2 != 0) goto L_0x0144
            r2 = 8
            goto L_0x0146
        L_0x0144:
            r2 = 16
        L_0x0146:
            r0.mo35237g(r2)
            long r29 = r0.mo35223A()
            int r0 = (r32 > r24 ? 1 : (r32 == r24 ? 0 : -1))
            if (r0 != 0) goto L_0x0152
            goto L_0x015d
        L_0x0152:
            r34 = 1000000(0xf4240, double:4.940656E-318)
            r36 = r29
            long r4 = com.google.android.gms.internal.ads.d13.m20295Z(r32, r34, r36)
            r24 = r4
        L_0x015d:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.i0 r2 = r3.mo32507c(r0)
            java.util.Objects.requireNonNull(r2)
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.i0 r2 = r2.mo32507c(r4)
            java.util.Objects.requireNonNull(r2)
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            com.google.android.gms.internal.ads.j0 r3 = r3.mo32508d(r4)
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.uq2 r3 = r3.f33686b
            r4 = 8
            r3.mo35236f(r4)
            int r4 = r3.mo35243m()
            int r4 = com.google.android.gms.internal.ads.C7850k0.m33804a(r4)
            if (r4 != 0) goto L_0x018f
            r5 = 8
            goto L_0x0191
        L_0x018f:
            r5 = 16
        L_0x0191:
            r3.mo35237g(r5)
            long r5 = r3.mo35223A()
            if (r4 != 0) goto L_0x019c
            r4 = 4
            goto L_0x019e
        L_0x019c:
            r4 = 8
        L_0x019e:
            r3.mo35237g(r4)
            int r3 = r3.mo35253w()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r15 = 3
            r4.<init>(r15)
            int r7 = r3 >> 10
            r7 = r7 & 31
            int r7 = r7 + 96
            char r7 = (char) r7
            r4.append(r7)
            int r7 = r3 >> 5
            r7 = r7 & 31
            int r7 = r7 + 96
            char r7 = (char) r7
            r4.append(r7)
            r3 = r3 & 31
            int r3 = r3 + 96
            char r3 = (char) r3
            r4.append(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.String r4 = r4.toString()
            android.util.Pair r10 = android.util.Pair.create(r3, r4)
            r3 = 1937011556(0x73747364, float:1.9367383E31)
            com.google.android.gms.internal.ads.j0 r2 = r2.mo32508d(r3)
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.uq2 r8 = r2.f33686b
            int r7 = r14.f37818a
            int r6 = r14.f37820c
            java.lang.Object r2 = r10.second
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            r4 = 12
            r8.mo35236f(r4)
            int r3 = r8.mo35243m()
            com.google.android.gms.internal.ads.n0 r2 = new com.google.android.gms.internal.ads.n0
            r2.<init>(r3)
            r0 = 0
        L_0x01fb:
            if (r0 >= r3) goto L_0x0723
            int r15 = r8.mo35241k()
            r32 = r13
            int r13 = r8.mo35243m()
            if (r13 <= 0) goto L_0x020d
            r33 = r3
            r4 = 1
            goto L_0x0210
        L_0x020d:
            r33 = r3
            r4 = 0
        L_0x0210:
            java.lang.String r3 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zb4.m21283b(r4, r3)
            int r3 = r8.mo35243m()
            r4 = 1635148593(0x61766331, float:2.840654E20)
            r34 = r6
            r6 = 1701733238(0x656e6376, float:7.035987E22)
            if (r3 == r4) goto L_0x041f
            r4 = 1635148595(0x61766333, float:2.8406544E20)
            if (r3 == r4) goto L_0x041f
            if (r3 == r6) goto L_0x041f
            r4 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r3 == r4) goto L_0x041f
            r4 = 1836070006(0x6d703476, float:4.646239E27)
            if (r3 == r4) goto L_0x041f
            r4 = 1752589105(0x68766331, float:4.6541277E24)
            if (r3 == r4) goto L_0x041f
            r4 = 1751479857(0x68657631, float:4.3344087E24)
            if (r3 == r4) goto L_0x041f
            r4 = 1932670515(0x73323633, float:1.4119387E31)
            if (r3 == r4) goto L_0x041f
            r4 = 1211250227(0x48323633, float:182488.8)
            if (r3 == r4) goto L_0x041f
            r4 = 1987063864(0x76703038, float:1.21789965E33)
            if (r3 == r4) goto L_0x041f
            r4 = 1987063865(0x76703039, float:1.2178997E33)
            if (r3 == r4) goto L_0x041f
            r4 = 1635135537(0x61763031, float:2.8383572E20)
            if (r3 == r4) goto L_0x041f
            r4 = 1685479798(0x64766176, float:1.8179687E22)
            if (r3 == r4) goto L_0x041f
            r4 = 1685479729(0x64766131, float:1.817961E22)
            if (r3 == r4) goto L_0x041f
            r4 = 1685481573(0x64766865, float:1.8181686E22)
            if (r3 == r4) goto L_0x041f
            r4 = 1685481521(0x64766831, float:1.8181627E22)
            if (r3 != r4) goto L_0x026d
            goto L_0x041f
        L_0x026d:
            r4 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r3 == r4) goto L_0x03df
            r4 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r3 == r4) goto L_0x03df
            r4 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r3 == r4) goto L_0x03df
            r4 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r3 == r4) goto L_0x03df
            r4 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r3 == r4) goto L_0x03df
            r4 = 1685353315(0x64747363, float:1.803728E22)
            if (r3 == r4) goto L_0x03df
            r4 = 1685353317(0x64747365, float:1.8037282E22)
            if (r3 == r4) goto L_0x03df
            r4 = 1685353320(0x64747368, float:1.8037286E22)
            if (r3 == r4) goto L_0x03df
            r4 = 1685353324(0x6474736c, float:1.803729E22)
            if (r3 == r4) goto L_0x03df
            r4 = 1685353336(0x64747378, float:1.8037304E22)
            if (r3 == r4) goto L_0x03df
            r4 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r3 == r4) goto L_0x03df
            r4 = 1935767394(0x73617762, float:1.7863284E31)
            if (r3 == r4) goto L_0x03df
            r4 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r3 == r4) goto L_0x03df
            r4 = 1936684916(0x736f7774, float:1.89725E31)
            if (r3 == r4) goto L_0x03df
            r4 = 1953984371(0x74776f73, float:7.841539E31)
            if (r3 == r4) goto L_0x03df
            r4 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r3 == r4) goto L_0x03df
            r4 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r3 == r4) goto L_0x03df
            r4 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r3 == r4) goto L_0x03df
            r4 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r3 == r4) goto L_0x03df
            r4 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r3 == r4) goto L_0x03df
            r4 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r3 == r4) goto L_0x03df
            r4 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r3 == r4) goto L_0x03df
            r4 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r3 == r4) goto L_0x03df
            r4 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r3 != r4) goto L_0x02e7
            goto L_0x03df
        L_0x02e7:
            r4 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r3 == r4) goto L_0x0355
            r4 = 1954034535(0x74783367, float:7.865797E31)
            if (r3 == r4) goto L_0x0355
            r4 = 2004251764(0x77767474, float:4.998699E33)
            if (r3 == r4) goto L_0x0355
            r4 = 1937010800(0x73747070, float:1.9366469E31)
            if (r3 == r4) goto L_0x0355
            r4 = 1664495672(0x63363038, float:3.360782E21)
            if (r3 != r4) goto L_0x0301
            goto L_0x0355
        L_0x0301:
            r4 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r3 != r4) goto L_0x0327
            int r3 = r15 + 16
            r8.mo35236f(r3)
            r3 = 0
            r8.mo35226D(r3)
            java.lang.String r4 = r8.mo35226D(r3)
            if (r4 == 0) goto L_0x033f
            com.google.android.gms.internal.ads.ge4 r3 = new com.google.android.gms.internal.ads.ge4
            r3.<init>()
            r3.mo32079g(r7)
            r3.mo32093s(r4)
            com.google.android.gms.internal.ads.w r3 = r3.mo32099y()
            r2.f35858b = r3
            goto L_0x033f
        L_0x0327:
            r4 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r3 != r4) goto L_0x033f
            com.google.android.gms.internal.ads.ge4 r3 = new com.google.android.gms.internal.ads.ge4
            r3.<init>()
            r3.mo32079g(r7)
            java.lang.String r4 = "application/x-camera-motion"
            r3.mo32093s(r4)
            com.google.android.gms.internal.ads.w r3 = r3.mo32099y()
            r2.f35858b = r3
        L_0x033f:
            r17 = r0
            r20 = r5
            r1 = r7
            r22 = r9
            r39 = r10
            r40 = r11
            r23 = r13
            r18 = r14
            r45 = r26
            r3 = r34
            r9 = r2
            goto L_0x03dc
        L_0x0355:
            int r4 = r15 + 16
            r8.mo35236f(r4)
            r4 = 1414810956(0x54544d4c, float:3.64731957E12)
            r35 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != r4) goto L_0x0370
            java.lang.String r3 = "application/ttml+xml"
        L_0x0366:
            r37 = r10
            r4 = 0
            r46 = r35
            r36 = r9
            r9 = r46
            goto L_0x03ae
        L_0x0370:
            r4 = 1954034535(0x74783367, float:7.865797E31)
            if (r3 != r4) goto L_0x0391
            int r3 = r13 + -16
            byte[] r4 = new byte[r3]
            r6 = 0
            r8.mo35232b(r4, r6, r3)
            com.google.android.gms.internal.ads.p63 r3 = com.google.android.gms.internal.ads.p63.m20815D(r4)
            java.lang.String r4 = "application/x-quicktime-tx3g"
            r37 = r10
            r46 = r4
            r4 = r3
            r3 = r46
            r47 = r35
            r36 = r9
            r9 = r47
            goto L_0x03ae
        L_0x0391:
            r4 = 2004251764(0x77767474, float:4.998699E33)
            if (r3 != r4) goto L_0x0399
            java.lang.String r3 = "application/x-mp4-vtt"
            goto L_0x0366
        L_0x0399:
            r4 = 1937010800(0x73747070, float:1.9366469E31)
            if (r3 != r4) goto L_0x03a8
            java.lang.String r3 = "application/ttml+xml"
            r36 = r9
            r37 = r10
            r4 = 0
            r9 = 0
            goto L_0x03ae
        L_0x03a8:
            r3 = 1
            r2.f35860d = r3
            java.lang.String r3 = "application/x-mp4-cea-608"
            goto L_0x0366
        L_0x03ae:
            com.google.android.gms.internal.ads.ge4 r6 = new com.google.android.gms.internal.ads.ge4
            r6.<init>()
            r6.mo32079g(r7)
            r6.mo32093s(r3)
            r6.mo32085k(r5)
            r6.mo32097w(r9)
            r6.mo32083i(r4)
            com.google.android.gms.internal.ads.w r3 = r6.mo32099y()
            r2.f35858b = r3
            r17 = r0
            r9 = r2
            r20 = r5
            r1 = r7
            r40 = r11
            r23 = r13
            r18 = r14
            r45 = r26
            r3 = r34
            r22 = r36
            r39 = r37
        L_0x03dc:
            r14 = r8
            goto L_0x06ff
        L_0x03df:
            r36 = r9
            r37 = r10
            r10 = r2
            r2 = r8
            r6 = 12
            r9 = 2
            r4 = r15
            r20 = r5
            r1 = 4
            r5 = r13
            r1 = r34
            r6 = r7
            r18 = r14
            r14 = r7
            r46 = r26
            r26 = r1
            r1 = r46
            r7 = r20
            r27 = r14
            r14 = r8
            r8 = r55
            r22 = r36
            r36 = r1
            r1 = 2
            r9 = r53
            r17 = r10
            r39 = r37
            r40 = r11
            r11 = r0
            m36839j(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r23 = r13
            r9 = r17
            r3 = r26
            r1 = r27
            r45 = r36
            r17 = r0
            goto L_0x06ff
        L_0x041f:
            r17 = r2
            r20 = r5
            r27 = r7
            r22 = r9
            r39 = r10
            r40 = r11
            r18 = r14
            r36 = r26
            r26 = r34
            r1 = 2
            r14 = r8
            int r2 = r15 + 16
            r14.mo35236f(r2)
            r2 = 16
            r14.mo35237g(r2)
            int r4 = r14.mo35253w()
            int r5 = r14.mo35253w()
            r7 = 50
            r14.mo35237g(r7)
            int r7 = r14.mo35241k()
            if (r3 != r6) goto L_0x0484
            android.util.Pair r3 = m36838i(r14, r15, r13)
            if (r3 == 0) goto L_0x047a
            java.lang.Object r6 = r3.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r12 != 0) goto L_0x0464
            r9 = r17
            r8 = 0
            goto L_0x0470
        L_0x0464:
            java.lang.Object r8 = r3.second
            com.google.android.gms.internal.ads.j1 r8 = (com.google.android.gms.internal.ads.C7815j1) r8
            java.lang.String r8 = r8.f33693b
            com.google.android.gms.internal.ads.zzs r8 = r12.mo36292a(r8)
            r9 = r17
        L_0x0470:
            com.google.android.gms.internal.ads.j1[] r10 = r9.f35857a
            java.lang.Object r3 = r3.second
            com.google.android.gms.internal.ads.j1 r3 = (com.google.android.gms.internal.ads.C7815j1) r3
            r10[r0] = r3
            r3 = r6
            goto L_0x0480
        L_0x047a:
            r9 = r17
            r8 = r12
            r3 = 1701733238(0x656e6376, float:7.035987E22)
        L_0x0480:
            r14.mo35236f(r7)
            goto L_0x0487
        L_0x0484:
            r9 = r17
            r8 = r12
        L_0x0487:
            r6 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r3 != r6) goto L_0x0494
            java.lang.String r6 = "video/mpeg"
            r46 = r6
            r6 = r3
            r3 = r46
            goto L_0x049e
        L_0x0494:
            r6 = 1211250227(0x48323633, float:182488.8)
            if (r3 != r6) goto L_0x049c
            java.lang.String r3 = "video/3gpp"
            goto L_0x049e
        L_0x049c:
            r6 = r3
            r3 = 0
        L_0x049e:
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = r7
            r2 = 0
            r10 = -1
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 1065353216(0x3f800000, float:1.0)
            r7 = r3
            r3 = 0
        L_0x04ad:
            int r1 = r11 - r15
            if (r1 >= r13) goto L_0x06b7
            r14.mo35236f(r11)
            int r1 = r14.mo35241k()
            int r17 = r14.mo35243m()
            if (r17 != 0) goto L_0x04ca
            int r17 = r14.mo35241k()
            int r12 = r17 - r15
            if (r12 != r13) goto L_0x04c8
            goto L_0x06b7
        L_0x04c8:
            r12 = 0
            goto L_0x04cc
        L_0x04ca:
            r12 = r17
        L_0x04cc:
            if (r12 <= 0) goto L_0x04d4
            r17 = r0
            r23 = r13
            r0 = 1
            goto L_0x04d9
        L_0x04d4:
            r17 = r0
            r23 = r13
            r0 = 0
        L_0x04d9:
            java.lang.String r13 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zb4.m21283b(r0, r13)
            int r0 = r14.mo35243m()
            r13 = 1635148611(0x61766343, float:2.8406573E20)
            if (r0 != r13) goto L_0x0513
            if (r7 != 0) goto L_0x04eb
            r0 = 1
            goto L_0x04ec
        L_0x04eb:
            r0 = 0
        L_0x04ec:
            r2 = 0
            com.google.android.gms.internal.ads.zb4.m21283b(r0, r2)
            int r1 = r1 + 8
            r14.mo35236f(r1)
            com.google.android.gms.internal.ads.eb4 r0 = com.google.android.gms.internal.ads.eb4.m31766a(r14)
            java.util.List<byte[]> r1 = r0.f31299a
            int r2 = r0.f31300b
            r9.f35859c = r2
            if (r3 != 0) goto L_0x0505
            float r2 = r0.f31303e
            r44 = r2
        L_0x0505:
            java.lang.String r0 = r0.f31304f
            java.lang.String r2 = "video/avc"
        L_0x0509:
            r41 = r0
            r7 = r2
            r45 = r36
            r2 = r1
        L_0x050f:
            r36 = r6
            goto L_0x06aa
        L_0x0513:
            r13 = 1752589123(0x68766343, float:4.6541328E24)
            if (r0 != r13) goto L_0x053b
            if (r7 != 0) goto L_0x051c
            r0 = 1
            goto L_0x051d
        L_0x051c:
            r0 = 0
        L_0x051d:
            r2 = 0
            com.google.android.gms.internal.ads.zb4.m21283b(r0, r2)
            int r1 = r1 + 8
            r14.mo35236f(r1)
            com.google.android.gms.internal.ads.nc4 r0 = com.google.android.gms.internal.ads.nc4.m35132a(r14)
            java.util.List<byte[]> r1 = r0.f35974a
            int r2 = r0.f35975b
            r9.f35859c = r2
            if (r3 != 0) goto L_0x0536
            float r2 = r0.f35976c
            r44 = r2
        L_0x0536:
            java.lang.String r0 = r0.f35977d
            java.lang.String r2 = "video/hevc"
            goto L_0x0509
        L_0x053b:
            r13 = 1685480259(0x64766343, float:1.8180206E22)
            if (r0 == r13) goto L_0x0696
            r13 = 1685485123(0x64767643, float:1.8185683E22)
            if (r0 != r13) goto L_0x0547
            goto L_0x0696
        L_0x0547:
            r13 = 1987076931(0x76706343, float:1.21891066E33)
            if (r0 != r13) goto L_0x0560
            if (r7 != 0) goto L_0x0550
            r0 = 1
            goto L_0x0551
        L_0x0550:
            r0 = 0
        L_0x0551:
            r1 = 0
            com.google.android.gms.internal.ads.zb4.m21283b(r0, r1)
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r6 != r0) goto L_0x055d
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x0570
        L_0x055d:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            goto L_0x0570
        L_0x0560:
            r13 = 1635135811(0x61763143, float:2.8384055E20)
            if (r0 != r13) goto L_0x0574
            if (r7 != 0) goto L_0x0569
            r0 = 1
            goto L_0x056a
        L_0x0569:
            r0 = 0
        L_0x056a:
            r13 = 0
            com.google.android.gms.internal.ads.zb4.m21283b(r0, r13)
            java.lang.String r0 = "video/av01"
        L_0x0570:
            r7 = r0
        L_0x0571:
            r45 = r36
            goto L_0x050f
        L_0x0574:
            r13 = 1681012275(0x64323633, float:1.3149704E22)
            if (r0 != r13) goto L_0x0585
            if (r7 != 0) goto L_0x057d
            r0 = 1
            goto L_0x057e
        L_0x057d:
            r0 = 0
        L_0x057e:
            r13 = 0
            com.google.android.gms.internal.ads.zb4.m21283b(r0, r13)
            java.lang.String r0 = "video/3gpp"
            goto L_0x0570
        L_0x0585:
            r13 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 != r13) goto L_0x05a7
            if (r7 != 0) goto L_0x058e
            r0 = 1
            goto L_0x058f
        L_0x058e:
            r0 = 0
        L_0x058f:
            r7 = 0
            com.google.android.gms.internal.ads.zb4.m21283b(r0, r7)
            android.util.Pair r0 = m36837h(r14, r1)
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x05a5
            com.google.android.gms.internal.ads.p63 r2 = com.google.android.gms.internal.ads.p63.m20815D(r0)
        L_0x05a5:
            r7 = r1
            goto L_0x0571
        L_0x05a7:
            r13 = 1885434736(0x70617370, float:2.7909473E29)
            if (r0 != r13) goto L_0x05c3
            int r1 = r1 + 8
            r14.mo35236f(r1)
            int r0 = r14.mo35252v()
            float r0 = (float) r0
            int r1 = r14.mo35252v()
            float r1 = (float) r1
            float r0 = r0 / r1
            r44 = r0
            r45 = r36
            r3 = 1
            goto L_0x050f
        L_0x05c3:
            r13 = 1937126244(0x73763364, float:1.9506033E31)
            if (r0 != r13) goto L_0x05f8
            int r0 = r1 + 8
        L_0x05ca:
            int r13 = r0 - r1
            if (r13 >= r12) goto L_0x05f2
            r14.mo35236f(r0)
            int r13 = r14.mo35243m()
            r28 = r1
            int r1 = r14.mo35243m()
            r37 = r3
            r3 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r1 != r3) goto L_0x05ec
            byte[] r1 = r14.mo35238h()
            int r13 = r13 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r0, r13)
            goto L_0x05f5
        L_0x05ec:
            int r0 = r0 + r13
            r1 = r28
            r3 = r37
            goto L_0x05ca
        L_0x05f2:
            r37 = r3
            r0 = 0
        L_0x05f5:
            r42 = r0
            goto L_0x061f
        L_0x05f8:
            r37 = r3
            r1 = 1936995172(0x73743364, float:1.9347576E31)
            if (r0 != r1) goto L_0x0625
            int r0 = r14.mo35249s()
            r1 = 3
            r14.mo35237g(r1)
            if (r0 != 0) goto L_0x061f
            int r0 = r14.mo35249s()
            if (r0 == 0) goto L_0x061e
            r3 = 1
            if (r0 == r3) goto L_0x061c
            r3 = 2
            if (r0 == r3) goto L_0x061a
            if (r0 == r1) goto L_0x0618
            goto L_0x061f
        L_0x0618:
            r10 = 3
            goto L_0x061f
        L_0x061a:
            r10 = 2
            goto L_0x061f
        L_0x061c:
            r10 = 1
            goto L_0x061f
        L_0x061e:
            r10 = 0
        L_0x061f:
            r45 = r36
            r3 = r37
            goto L_0x050f
        L_0x0625:
            r1 = 3
            r3 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r0 != r3) goto L_0x0691
            int r0 = r14.mo35243m()
            r3 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r0 == r3) goto L_0x0658
            r3 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r0 != r3) goto L_0x063a
            goto L_0x0658
        L_0x063a:
            java.lang.String r0 = com.google.android.gms.internal.ads.C7850k0.m33805b(r0)
            java.lang.String r3 = "Unsupported color type: "
            int r13 = r0.length()
            if (r13 == 0) goto L_0x064b
            java.lang.String r0 = r3.concat(r0)
            goto L_0x0650
        L_0x064b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x0650:
            r3 = r36
            android.util.Log.w(r3, r0)
            r45 = r3
            goto L_0x0693
        L_0x0658:
            r3 = r36
            int r13 = r14.mo35253w()
            int r16 = r14.mo35253w()
            r1 = 2
            r14.mo35237g(r1)
            r1 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r0 != r1) goto L_0x0675
            int r0 = r14.mo35249s()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0675
            r0 = 1
            goto L_0x0676
        L_0x0675:
            r0 = 0
        L_0x0676:
            int r1 = com.google.android.gms.internal.ads.z04.m21252a(r13)
            r13 = 1
            if (r13 == r0) goto L_0x067f
            r0 = 2
            goto L_0x0680
        L_0x067f:
            r0 = 1
        L_0x0680:
            com.google.android.gms.internal.ads.z04 r13 = new com.google.android.gms.internal.ads.z04
            r36 = r6
            int r6 = com.google.android.gms.internal.ads.z04.m21253b(r16)
            r45 = r3
            r3 = 0
            r13.<init>(r1, r0, r6, r3)
            r43 = r13
            goto L_0x06a8
        L_0x0691:
            r45 = r36
        L_0x0693:
            r36 = r6
            goto L_0x06a8
        L_0x0696:
            r37 = r3
            r45 = r36
            r36 = r6
            com.google.android.gms.internal.ads.sb4 r0 = com.google.android.gms.internal.ads.sb4.m37371a(r14)
            if (r0 == 0) goto L_0x06a8
            java.lang.String r0 = r0.f38944a
            java.lang.String r7 = "video/dolby-vision"
            r41 = r0
        L_0x06a8:
            r3 = r37
        L_0x06aa:
            int r11 = r11 + r12
            r12 = r53
            r0 = r17
            r13 = r23
            r6 = r36
            r36 = r45
            goto L_0x04ad
        L_0x06b7:
            r17 = r0
            r23 = r13
            r45 = r36
            if (r7 == 0) goto L_0x06fb
            com.google.android.gms.internal.ads.ge4 r0 = new com.google.android.gms.internal.ads.ge4
            r0.<init>()
            r1 = r27
            r0.mo32079g(r1)
            r0.mo32093s(r7)
            r3 = r41
            r0.mo32078f0(r3)
            r0.mo32098x(r4)
            r0.mo32077f(r5)
            r3 = r44
            r0.mo32090p(r3)
            r3 = r26
            r0.mo32092r(r3)
            r4 = r42
            r0.mo32091q(r4)
            r0.mo32096v(r10)
            r0.mo32083i(r2)
            r0.mo32070b(r8)
            r2 = r43
            r0.mo32080g0(r2)
            com.google.android.gms.internal.ads.w r0 = r0.mo32099y()
            r9.f35858b = r0
            goto L_0x06ff
        L_0x06fb:
            r3 = r26
            r1 = r27
        L_0x06ff:
            int r15 = r15 + r23
            r14.mo35236f(r15)
            int r0 = r17 + 1
            r12 = r53
            r7 = r1
            r6 = r3
            r2 = r9
            r8 = r14
            r14 = r18
            r5 = r20
            r9 = r22
            r13 = r32
            r3 = r33
            r10 = r39
            r11 = r40
            r26 = r45
            r4 = 12
            r15 = 3
            r1 = r50
            goto L_0x01fb
        L_0x0723:
            r22 = r9
            r39 = r10
            r40 = r11
            r32 = r13
            r18 = r14
            r45 = r26
            r9 = r2
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r2 = r40
            com.google.android.gms.internal.ads.i0 r0 = r2.mo32507c(r0)
            if (r0 == 0) goto L_0x07a0
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            com.google.android.gms.internal.ads.j0 r0 = r0.mo32508d(r1)
            if (r0 != 0) goto L_0x0746
            r8 = 0
            goto L_0x0795
        L_0x0746:
            com.google.android.gms.internal.ads.uq2 r0 = r0.f33686b
            r1 = 8
            r0.mo35236f(r1)
            int r1 = r0.mo35243m()
            int r1 = com.google.android.gms.internal.ads.C7850k0.m33804a(r1)
            int r3 = r0.mo35252v()
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            r6 = 0
        L_0x075e:
            if (r6 >= r3) goto L_0x0791
            r7 = 1
            if (r1 != r7) goto L_0x0768
            long r10 = r0.mo35224B()
            goto L_0x076c
        L_0x0768:
            long r10 = r0.mo35223A()
        L_0x076c:
            r4[r6] = r10
            if (r1 != r7) goto L_0x0775
            long r10 = r0.mo35256z()
            goto L_0x077a
        L_0x0775:
            int r8 = r0.mo35243m()
            long r10 = (long) r8
        L_0x077a:
            r5[r6] = r10
            short r8 = r0.mo35229G()
            if (r8 != r7) goto L_0x0789
            r7 = 2
            r0.mo35237g(r7)
            int r6 = r6 + 1
            goto L_0x075e
        L_0x0789:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0791:
            android.util.Pair r8 = android.util.Pair.create(r4, r5)
        L_0x0795:
            if (r8 == 0) goto L_0x07a0
            java.lang.Object r0 = r8.first
            long[] r0 = (long[]) r0
            java.lang.Object r1 = r8.second
            long[] r1 = (long[]) r1
            goto L_0x07a2
        L_0x07a0:
            r0 = 0
            r1 = 0
        L_0x07a2:
            com.google.android.gms.internal.ads.w r3 = r9.f35858b
            if (r3 != 0) goto L_0x07aa
            r0 = r56
            goto L_0x0060
        L_0x07aa:
            com.google.android.gms.internal.ads.i1 r8 = new com.google.android.gms.internal.ads.i1
            int r17 = r18.f37818a
            r3 = r39
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r19 = r3.longValue()
            com.google.android.gms.internal.ads.w r3 = r9.f35858b
            int r4 = r9.f35860d
            com.google.android.gms.internal.ads.j1[] r5 = r9.f35857a
            int r6 = r9.f35859c
            r16 = r8
            r18 = r22
            r21 = r29
            r23 = r24
            r25 = r3
            r26 = r4
            r27 = r5
            r28 = r6
            r29 = r0
            r30 = r1
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            r0 = r56
        L_0x07db:
            java.lang.Object r1 = r0.apply(r8)
            r4 = r1
            com.google.android.gms.internal.ads.i1 r4 = (com.google.android.gms.internal.ads.C7778i1) r4
            if (r4 == 0) goto L_0x0db7
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.i0 r1 = r2.mo32507c(r1)
            java.util.Objects.requireNonNull(r1)
            r2 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.i0 r1 = r1.mo32507c(r2)
            java.util.Objects.requireNonNull(r1)
            r2 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.i0 r1 = r1.mo32507c(r2)
            java.util.Objects.requireNonNull(r1)
            r2 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.android.gms.internal.ads.j0 r2 = r1.mo32508d(r2)
            if (r2 == 0) goto L_0x0813
            com.google.android.gms.internal.ads.o0 r3 = new com.google.android.gms.internal.ads.o0
            com.google.android.gms.internal.ads.w r5 = r4.f33021f
            r3.<init>(r2, r5)
            goto L_0x0821
        L_0x0813:
            r2 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.android.gms.internal.ads.j0 r2 = r1.mo32508d(r2)
            if (r2 == 0) goto L_0x0daf
            com.google.android.gms.internal.ads.p0 r3 = new com.google.android.gms.internal.ads.p0
            r3.<init>(r2)
        L_0x0821:
            int r2 = r3.zzb()
            if (r2 != 0) goto L_0x083d
            com.google.android.gms.internal.ads.l1 r1 = new com.google.android.gms.internal.ads.l1
            r2 = 0
            long[] r5 = new long[r2]
            int[] r6 = new int[r2]
            r7 = 0
            long[] r8 = new long[r2]
            int[] r9 = new int[r2]
            r10 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x0839:
            r0 = r32
            goto L_0x0dab
        L_0x083d:
            r5 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.android.gms.internal.ads.j0 r5 = r1.mo32508d(r5)
            if (r5 != 0) goto L_0x0853
            r5 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.android.gms.internal.ads.j0 r5 = r1.mo32508d(r5)
            java.util.Objects.requireNonNull(r5)
            r6 = r5
            r5 = 1
            goto L_0x0855
        L_0x0853:
            r6 = r5
            r5 = 0
        L_0x0855:
            com.google.android.gms.internal.ads.uq2 r6 = r6.f33686b
            r7 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.android.gms.internal.ads.j0 r7 = r1.mo32508d(r7)
            java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.ads.uq2 r7 = r7.f33686b
            r8 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.android.gms.internal.ads.j0 r8 = r1.mo32508d(r8)
            java.util.Objects.requireNonNull(r8)
            com.google.android.gms.internal.ads.uq2 r8 = r8.f33686b
            r9 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.android.gms.internal.ads.j0 r9 = r1.mo32508d(r9)
            if (r9 == 0) goto L_0x087b
            com.google.android.gms.internal.ads.uq2 r9 = r9.f33686b
            goto L_0x087c
        L_0x087b:
            r9 = 0
        L_0x087c:
            r10 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.android.gms.internal.ads.j0 r1 = r1.mo32508d(r10)
            if (r1 == 0) goto L_0x0888
            com.google.android.gms.internal.ads.uq2 r1 = r1.f33686b
            goto L_0x0889
        L_0x0888:
            r1 = 0
        L_0x0889:
            com.google.android.gms.internal.ads.l0 r10 = new com.google.android.gms.internal.ads.l0
            r10.<init>(r7, r6, r5)
            r5 = 12
            r8.mo35236f(r5)
            int r6 = r8.mo35252v()
            r7 = -1
            int r6 = r6 + r7
            int r7 = r8.mo35252v()
            int r11 = r8.mo35252v()
            if (r1 == 0) goto L_0x08ab
            r1.mo35236f(r5)
            int r12 = r1.mo35252v()
            goto L_0x08ac
        L_0x08ab:
            r12 = 0
        L_0x08ac:
            if (r9 == 0) goto L_0x08c1
            r9.mo35236f(r5)
            int r5 = r9.mo35252v()
            if (r5 <= 0) goto L_0x08be
            int r13 = r9.mo35252v()
            r14 = -1
            int r13 = r13 + r14
            goto L_0x08c4
        L_0x08be:
            r14 = -1
            r9 = 0
            goto L_0x08c3
        L_0x08c1:
            r14 = -1
            r5 = 0
        L_0x08c3:
            r13 = -1
        L_0x08c4:
            int r15 = r3.zza()
            com.google.android.gms.internal.ads.w r0 = r4.f33021f
            java.lang.String r0 = r0.f40619l
            if (r15 == r14) goto L_0x0976
            java.lang.String r14 = "audio/raw"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L_0x08e6
            java.lang.String r14 = "audio/g711-mlaw"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L_0x08e6
            java.lang.String r14 = "audio/g711-alaw"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0976
        L_0x08e6:
            if (r6 != 0) goto L_0x0976
            if (r12 != 0) goto L_0x0975
            if (r5 != 0) goto L_0x0975
            int r0 = r10.f34755a
            long[] r1 = new long[r0]
            int[] r3 = new int[r0]
        L_0x08f2:
            boolean r5 = r10.mo33218a()
            if (r5 == 0) goto L_0x0903
            int r5 = r10.f34756b
            long r6 = r10.f34758d
            r1[r5] = r6
            int r6 = r10.f34757c
            r3[r5] = r6
            goto L_0x08f2
        L_0x0903:
            long r5 = (long) r11
            r7 = 8192(0x2000, float:1.14794E-41)
            int r7 = r7 / r15
            r8 = 0
            r9 = 0
        L_0x0909:
            if (r8 >= r0) goto L_0x0915
            r10 = r3[r8]
            int r10 = com.google.android.gms.internal.ads.d13.m20280K(r10, r7)
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x0909
        L_0x0915:
            long[] r8 = new long[r9]
            int[] r10 = new int[r9]
            long[] r11 = new long[r9]
            int[] r9 = new int[r9]
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
        L_0x0922:
            if (r12 >= r0) goto L_0x0968
            r17 = r3[r12]
            r18 = r1[r12]
            r46 = r17
            r17 = r0
            r0 = r46
        L_0x092e:
            if (r0 <= 0) goto L_0x095c
            int r20 = java.lang.Math.min(r7, r0)
            r8[r16] = r18
            r21 = r1
            int r1 = r15 * r20
            r10[r16] = r1
            int r14 = java.lang.Math.max(r14, r1)
            r1 = r7
            r22 = r8
            long r7 = (long) r13
            long r7 = r7 * r5
            r11[r16] = r7
            r7 = 1
            r9[r16] = r7
            r7 = r10[r16]
            long r7 = (long) r7
            long r18 = r18 + r7
            int r13 = r13 + r20
            int r0 = r0 - r20
            int r16 = r16 + 1
            r7 = r1
            r1 = r21
            r8 = r22
            goto L_0x092e
        L_0x095c:
            r21 = r1
            r1 = r7
            r22 = r8
            int r12 = r12 + 1
            r0 = r17
            r1 = r21
            goto L_0x0922
        L_0x0968:
            r22 = r8
            long r0 = (long) r13
            long r5 = r5 * r0
            r0 = r5
            r12 = r9
            r15 = r11
            r9 = r22
            r11 = r4
            goto L_0x0b2c
        L_0x0975:
            r6 = 0
        L_0x0976:
            long[] r0 = new long[r2]
            int[] r14 = new int[r2]
            long[] r15 = new long[r2]
            r16 = r5
            int[] r5 = new int[r2]
            r19 = r4
            r17 = r7
            r4 = r11
            r20 = r12
            r12 = r13
            r7 = 0
            r11 = 0
            r18 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r13 = r6
            r6 = 0
        L_0x0994:
            if (r6 >= r2) goto L_0x0a68
            r26 = 1
        L_0x0998:
            if (r18 != 0) goto L_0x09bd
            boolean r26 = r10.mo33218a()
            if (r26 == 0) goto L_0x09b5
            r27 = r11
            r28 = r12
            long r11 = r10.f34758d
            r29 = r2
            int r2 = r10.f34757c
            r18 = r2
            r22 = r11
            r11 = r27
            r12 = r28
            r2 = r29
            goto L_0x0998
        L_0x09b5:
            r29 = r2
            r27 = r11
            r28 = r12
            r2 = 0
            goto L_0x09c5
        L_0x09bd:
            r29 = r2
            r27 = r11
            r28 = r12
            r2 = r18
        L_0x09c5:
            if (r26 != 0) goto L_0x09e5
            java.lang.String r2 = "Unexpected end of chunk data"
            r11 = r45
            android.util.Log.w(r11, r2)
            long[] r0 = java.util.Arrays.copyOf(r0, r6)
            int[] r14 = java.util.Arrays.copyOf(r14, r6)
            long[] r15 = java.util.Arrays.copyOf(r15, r6)
            int[] r5 = java.util.Arrays.copyOf(r5, r6)
            r2 = r6
            r36 = r11
            r12 = r27
            goto L_0x0a6f
        L_0x09e5:
            r11 = r45
            if (r1 == 0) goto L_0x09ff
        L_0x09e9:
            if (r21 != 0) goto L_0x09fc
            if (r20 <= 0) goto L_0x09f8
            int r21 = r1.mo35252v()
            int r27 = r1.mo35243m()
            int r20 = r20 + -1
            goto L_0x09e9
        L_0x09f8:
            r12 = -1
            r21 = 0
            goto L_0x09fd
        L_0x09fc:
            r12 = -1
        L_0x09fd:
            int r21 = r21 + -1
        L_0x09ff:
            r12 = r27
            r0[r6] = r22
            r26 = r0
            int r0 = r3.zzc()
            r14[r6] = r0
            if (r0 <= r7) goto L_0x0a0e
            r7 = r0
        L_0x0a0e:
            r0 = r10
            r36 = r11
            long r10 = (long) r12
            long r10 = r24 + r10
            r15[r6] = r10
            if (r9 != 0) goto L_0x0a1a
            r10 = 1
            goto L_0x0a1b
        L_0x0a1a:
            r10 = 0
        L_0x0a1b:
            r5[r6] = r10
            r10 = r28
            if (r6 != r10) goto L_0x0a31
            r11 = 1
            r5[r6] = r11
            int r16 = r16 + -1
            if (r16 <= 0) goto L_0x0a31
            java.util.Objects.requireNonNull(r9)
            int r10 = r9.mo35252v()
            r11 = -1
            int r10 = r10 + r11
        L_0x0a31:
            r11 = r9
            r18 = r10
            long r9 = (long) r4
            long r24 = r24 + r9
            int r9 = r17 + -1
            if (r9 != 0) goto L_0x0a4e
            if (r13 <= 0) goto L_0x0a4b
            int r4 = r8.mo35252v()
            int r9 = r8.mo35243m()
            int r13 = r13 + -1
            r17 = r4
            r4 = r9
            goto L_0x0a50
        L_0x0a4b:
            r17 = 0
            goto L_0x0a50
        L_0x0a4e:
            r17 = r9
        L_0x0a50:
            r9 = r14[r6]
            long r9 = (long) r9
            long r22 = r22 + r9
            r9 = -1
            int r2 = r2 + r9
            int r6 = r6 + 1
            r10 = r0
            r9 = r11
            r11 = r12
            r12 = r18
            r0 = r26
            r45 = r36
            r18 = r2
            r2 = r29
            goto L_0x0994
        L_0x0a68:
            r26 = r0
            r29 = r2
            r36 = r45
            r12 = r11
        L_0x0a6f:
            long r3 = (long) r12
            long r3 = r24 + r3
            if (r1 == 0) goto L_0x0a84
        L_0x0a74:
            if (r20 <= 0) goto L_0x0a84
            int r6 = r1.mo35252v()
            if (r6 == 0) goto L_0x0a7e
            r1 = 0
            goto L_0x0a85
        L_0x0a7e:
            r1.mo35243m()
            int r20 = r20 + -1
            goto L_0x0a74
        L_0x0a84:
            r1 = 1
        L_0x0a85:
            if (r16 != 0) goto L_0x0ac5
            if (r17 != 0) goto L_0x0abb
            if (r18 != 0) goto L_0x0ab2
            if (r13 != 0) goto L_0x0aaa
            if (r21 != 0) goto L_0x0aa1
            if (r1 != 0) goto L_0x0a99
            r11 = r19
            r1 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            goto L_0x0aa8
        L_0x0a99:
            r16 = r0
            r17 = r2
            r11 = r19
            goto L_0x0b24
        L_0x0aa1:
            r11 = r19
            r10 = r21
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x0aa8:
            r13 = 0
            goto L_0x0acf
        L_0x0aaa:
            r11 = r19
            r10 = r21
            r6 = 0
            r8 = 0
            r9 = 0
            goto L_0x0acf
        L_0x0ab2:
            r9 = r18
            r11 = r19
            r10 = r21
            r6 = 0
            r8 = 0
            goto L_0x0acf
        L_0x0abb:
            r8 = r17
            r9 = r18
            r11 = r19
            r10 = r21
            r6 = 0
            goto L_0x0acf
        L_0x0ac5:
            r6 = r16
            r8 = r17
            r9 = r18
            r11 = r19
            r10 = r21
        L_0x0acf:
            int r12 = r11.f33016a
            r16 = r0
            r0 = 1
            if (r0 == r1) goto L_0x0ad9
            java.lang.String r0 = ", ctts invalid"
            goto L_0x0adb
        L_0x0ad9:
            java.lang.String r0 = ""
        L_0x0adb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r17 = r2
            int r2 = r0.length()
            int r2 = r2 + 262
            r1.<init>(r2)
            java.lang.String r2 = "Inconsistent stbl box for track "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = ": remainingSynchronizationSamples "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", remainingSamplesAtTimestampDelta "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = ", remainingSamplesInChunk "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = ", remainingTimestampDeltaChanges "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = ", remainingSamplesAtTimestampOffset "
            r1.append(r2)
            r1.append(r10)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r36
            android.util.Log.w(r1, r0)
        L_0x0b24:
            r0 = r3
            r12 = r5
            r10 = r14
            r9 = r16
            r2 = r17
            r14 = r7
        L_0x0b2c:
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r11.f33018c
            r3 = r0
            long r16 = com.google.android.gms.internal.ads.d13.m20295Z(r3, r5, r7)
            long[] r3 = r11.f33023h
            if (r3 != 0) goto L_0x0b52
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r11.f33018c
            com.google.android.gms.internal.ads.d13.m20315n(r15, r0, r2)
            com.google.android.gms.internal.ads.l1 r1 = new com.google.android.gms.internal.ads.l1
            r3 = r1
            r4 = r11
            r5 = r9
            r6 = r10
            r7 = r14
            r8 = r15
            r9 = r12
            r10 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0839
        L_0x0b52:
            int r4 = r3.length
            r5 = 1
            if (r4 != r5) goto L_0x0c0a
            int r4 = r11.f33017b
            if (r4 != r5) goto L_0x0c0a
            int r4 = r15.length
            r5 = 2
            if (r4 < r5) goto L_0x0c0a
            long[] r5 = r11.f33024i
            java.util.Objects.requireNonNull(r5)
            r6 = 0
            r7 = r5[r6]
            r16 = r3[r6]
            r22 = r7
            long r6 = r11.f33018c
            r5 = r2
            long r2 = r11.f33019d
            r18 = r6
            r20 = r2
            long r2 = com.google.android.gms.internal.ads.d13.m20295Z(r16, r18, r20)
            long r7 = r22 + r2
            int r2 = r4 + -1
            r3 = 4
            r6 = 0
            int r3 = com.google.android.gms.internal.ads.d13.m20281L(r3, r6, r2)
            int r4 = r4 + -4
            int r2 = com.google.android.gms.internal.ads.d13.m20281L(r4, r6, r2)
            r16 = r15[r6]
            int r4 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r4 > 0) goto L_0x0c06
            r3 = r15[r3]
            int r13 = (r22 > r3 ? 1 : (r22 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0c06
            r2 = r15[r2]
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0c06
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0c06
            r2 = r15[r6]
            long r16 = r22 - r2
            com.google.android.gms.internal.ads.w r2 = r11.f33021f
            int r2 = r2.f40633z
            long r2 = (long) r2
            r6 = r5
            long r4 = r11.f33018c
            r18 = r2
            r20 = r4
            long r2 = com.google.android.gms.internal.ads.d13.m20295Z(r16, r18, r20)
            long r16 = r0 - r7
            com.google.android.gms.internal.ads.w r4 = r11.f33021f
            int r4 = r4.f40633z
            long r4 = (long) r4
            long r7 = r11.f33018c
            r18 = r4
            r20 = r7
            long r4 = com.google.android.gms.internal.ads.d13.m20295Z(r16, r18, r20)
            r7 = 0
            int r13 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x0bcc
            int r13 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r13 == 0) goto L_0x0c0b
        L_0x0bcc:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r13 > 0) goto L_0x0c0b
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r13 > 0) goto L_0x0c0b
            int r0 = (int) r2
            r2 = r50
            r2.f35496a = r0
            int r0 = (int) r4
            r2.f35497b = r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r11.f33018c
            com.google.android.gms.internal.ads.d13.m20315n(r15, r0, r3)
            long[] r0 = r11.f33023h
            r1 = 0
            r3 = r0[r1]
            long r7 = r11.f33019d
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = com.google.android.gms.internal.ads.d13.m20295Z(r3, r5, r7)
            com.google.android.gms.internal.ads.l1 r13 = new com.google.android.gms.internal.ads.l1
            r3 = r13
            r4 = r11
            r5 = r9
            r6 = r10
            r7 = r14
            r8 = r15
            r9 = r12
            r10 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0c55
        L_0x0c06:
            r2 = r50
            r6 = r5
            goto L_0x0c0d
        L_0x0c0a:
            r6 = r2
        L_0x0c0b:
            r2 = r50
        L_0x0c0d:
            long[] r3 = r11.f33023h
            int r4 = r3.length
            r5 = 1
            if (r4 != r5) goto L_0x0c59
            r5 = 0
            r7 = r3[r5]
            r3 = 0
            int r13 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0c58
            long[] r3 = r11.f33024i
            java.util.Objects.requireNonNull(r3)
            r6 = r3[r5]
            r3 = 0
        L_0x0c24:
            int r4 = r15.length
            if (r3 >= r4) goto L_0x0c3b
            r4 = r15[r3]
            long r16 = r4 - r6
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r11.f33018c
            r20 = r4
            long r4 = com.google.android.gms.internal.ads.d13.m20295Z(r16, r18, r20)
            r15[r3] = r4
            int r3 = r3 + 1
            goto L_0x0c24
        L_0x0c3b:
            long r3 = r11.f33018c
            long r16 = r0 - r6
            r18 = 1000000(0xf4240, double:4.940656E-318)
            r20 = r3
            long r0 = com.google.android.gms.internal.ads.d13.m20295Z(r16, r18, r20)
            com.google.android.gms.internal.ads.l1 r13 = new com.google.android.gms.internal.ads.l1
            r3 = r13
            r4 = r11
            r5 = r9
            r6 = r10
            r7 = r14
            r8 = r15
            r9 = r12
            r10 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x0c55:
            r1 = r13
            goto L_0x0839
        L_0x0c58:
            r4 = 1
        L_0x0c59:
            int r0 = r11.f33017b
            r1 = 1
            if (r0 != r1) goto L_0x0c60
            r3 = 1
            goto L_0x0c61
        L_0x0c60:
            r3 = 0
        L_0x0c61:
            int[] r0 = new int[r4]
            int[] r1 = new int[r4]
            long[] r4 = r11.f33024i
            java.util.Objects.requireNonNull(r4)
            r5 = 0
            r7 = 0
            r8 = 0
            r13 = 0
        L_0x0c6e:
            long[] r2 = r11.f33023h
            r16 = r14
            int r14 = r2.length
            if (r5 >= r14) goto L_0x0cd6
            r14 = r9
            r17 = r10
            r9 = r4[r5]
            r18 = -1
            int r20 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r20 == 0) goto L_0x0cc3
            r21 = r2[r5]
            r2 = r13
            r18 = r14
            long r13 = r11.f33018c
            r19 = r6
            r20 = r7
            long r6 = r11.f33019d
            r23 = r13
            r25 = r6
            long r6 = com.google.android.gms.internal.ads.d13.m20295Z(r21, r23, r25)
            r13 = 1
            int r14 = com.google.android.gms.internal.ads.d13.m20279J(r15, r9, r13, r13)
            r0[r5] = r14
            long r9 = r9 + r6
            r14 = 0
            int r6 = com.google.android.gms.internal.ads.d13.m20277H(r15, r9, r3, r14)
            r1[r5] = r6
        L_0x0ca4:
            r6 = r0[r5]
            r7 = r1[r5]
            if (r6 >= r7) goto L_0x0cb5
            r9 = r12[r6]
            r9 = r9 & r13
            if (r9 != 0) goto L_0x0cb5
            int r6 = r6 + 1
            r0[r5] = r6
            r13 = 1
            goto L_0x0ca4
        L_0x0cb5:
            int r9 = r7 - r6
            int r9 = r20 + r9
            if (r8 == r6) goto L_0x0cbd
            r6 = 1
            goto L_0x0cbe
        L_0x0cbd:
            r6 = 0
        L_0x0cbe:
            r2 = r2 | r6
            r13 = r2
            r8 = r7
            r7 = r9
            goto L_0x0ccb
        L_0x0cc3:
            r19 = r6
            r20 = r7
            r2 = r13
            r18 = r14
            r14 = 0
        L_0x0ccb:
            int r5 = r5 + 1
            r14 = r16
            r10 = r17
            r9 = r18
            r6 = r19
            goto L_0x0c6e
        L_0x0cd6:
            r5 = r6
            r18 = r9
            r17 = r10
            r2 = r13
            r14 = 0
            if (r7 == r5) goto L_0x0ce1
            r3 = 1
            goto L_0x0ce2
        L_0x0ce1:
            r3 = 0
        L_0x0ce2:
            r2 = r2 | r3
            if (r2 == 0) goto L_0x0ce9
            long[] r3 = new long[r7]
            r5 = r3
            goto L_0x0ceb
        L_0x0ce9:
            r5 = r18
        L_0x0ceb:
            if (r2 == 0) goto L_0x0cf1
            int[] r3 = new int[r7]
            r6 = r3
            goto L_0x0cf3
        L_0x0cf1:
            r6 = r17
        L_0x0cf3:
            r3 = 1
            if (r3 != r2) goto L_0x0cf8
            r3 = 0
            goto L_0x0cfa
        L_0x0cf8:
            r3 = r16
        L_0x0cfa:
            if (r2 == 0) goto L_0x0d00
            int[] r4 = new int[r7]
            r9 = r4
            goto L_0x0d01
        L_0x0d00:
            r9 = r12
        L_0x0d01:
            long[] r8 = new long[r7]
            r7 = r3
            r3 = 0
            r4 = 0
            r25 = 0
        L_0x0d08:
            long[] r10 = r11.f33023h
            int r10 = r10.length
            if (r3 >= r10) goto L_0x0d93
            long[] r10 = r11.f33024i
            r27 = r10[r3]
            r10 = r0[r3]
            r13 = r1[r3]
            if (r2 == 0) goto L_0x0d29
            int r14 = r13 - r10
            r16 = r0
            r0 = r18
            java.lang.System.arraycopy(r0, r10, r5, r4, r14)
            r0 = r17
            java.lang.System.arraycopy(r0, r10, r6, r4, r14)
            java.lang.System.arraycopy(r12, r10, r9, r4, r14)
            goto L_0x0d2d
        L_0x0d29:
            r16 = r0
            r0 = r17
        L_0x0d2d:
            if (r10 >= r13) goto L_0x0d76
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r14 = r12
            r17 = r13
            long r12 = r11.f33019d
            r19 = r25
            r23 = r12
            long r12 = com.google.android.gms.internal.ads.d13.m20295Z(r19, r21, r23)
            r19 = r15[r10]
            r22 = r14
            r21 = r15
            long r14 = r19 - r27
            r20 = r0
            r19 = r1
            r0 = 0
            long r33 = java.lang.Math.max(r0, r14)
            r35 = 1000000(0xf4240, double:4.940656E-318)
            long r14 = r11.f33018c
            r37 = r14
            long r14 = com.google.android.gms.internal.ads.d13.m20295Z(r33, r35, r37)
            long r12 = r12 + r14
            r8[r4] = r12
            if (r2 == 0) goto L_0x0d67
            r12 = r6[r4]
            if (r12 <= r7) goto L_0x0d67
            r7 = r20[r10]
        L_0x0d67:
            int r4 = r4 + 1
            int r10 = r10 + 1
            r13 = r17
            r1 = r19
            r0 = r20
            r15 = r21
            r12 = r22
            goto L_0x0d2d
        L_0x0d76:
            r20 = r0
            r19 = r1
            r22 = r12
            r21 = r15
            r0 = 0
            long[] r10 = r11.f33023h
            r12 = r10[r3]
            long r25 = r25 + r12
            int r3 = r3 + 1
            r0 = r16
            r1 = r19
            r17 = r20
            r12 = r22
            r14 = 0
            goto L_0x0d08
        L_0x0d93:
            long r0 = r11.f33019d
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r25
            r23 = r0
            long r0 = com.google.android.gms.internal.ads.d13.m20295Z(r19, r21, r23)
            com.google.android.gms.internal.ads.l1 r2 = new com.google.android.gms.internal.ads.l1
            r3 = r2
            r4 = r11
            r10 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1 = r2
            goto L_0x0839
        L_0x0dab:
            r0.add(r1)
            goto L_0x0db9
        L_0x0daf:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.google.android.gms.internal.ads.iy r0 = com.google.android.gms.internal.ads.C7811iy.m33482a(r0, r1)
            throw r0
        L_0x0db7:
            r0 = r32
        L_0x0db9:
            int r15 = r31 + 1
            r1 = r50
            r12 = r53
            r13 = r0
            r0 = r49
            goto L_0x000c
        L_0x0dc4:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8105r0.m36832c(com.google.android.gms.internal.ads.i0, com.google.android.gms.internal.ads.mc4, long, com.google.android.gms.internal.ads.zzs, boolean, boolean, com.google.android.gms.internal.ads.p33):java.util.List");
    }

    /* renamed from: d */
    public static void m36833d(uq2 uq2) {
        int k = uq2.mo35241k();
        uq2.mo35237g(4);
        if (uq2.mo35243m() != 1751411826) {
            k += 4;
        }
        uq2.mo35236f(k);
    }

    /* renamed from: e */
    private static int m36834e(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* renamed from: f */
    private static int m36835f(uq2 uq2) {
        int s = uq2.mo35249s();
        int i = s & 127;
        while ((s & 128) == 128) {
            s = uq2.mo35249s();
            i = (i << 7) | (s & 127);
        }
        return i;
    }

    /* renamed from: g */
    private static int m36836g(uq2 uq2) {
        uq2.mo35236f(16);
        return uq2.mo35243m();
    }

    /* renamed from: h */
    private static Pair<String, byte[]> m36837h(uq2 uq2, int i) {
        uq2.mo35236f(i + 12);
        uq2.mo35237g(1);
        m36835f(uq2);
        uq2.mo35237g(2);
        int s = uq2.mo35249s();
        if ((s & 128) != 0) {
            uq2.mo35237g(2);
        }
        if ((s & 64) != 0) {
            uq2.mo35237g(uq2.mo35253w());
        }
        if ((s & 32) != 0) {
            uq2.mo35237g(2);
        }
        uq2.mo35237g(1);
        m36835f(uq2);
        String d = C7773hx.m32962d(uq2.mo35249s());
        if (MimeTypes.AUDIO_MPEG.equals(d) || MimeTypes.AUDIO_DTS.equals(d) || MimeTypes.AUDIO_DTS_HD.equals(d)) {
            return Pair.create(d, (Object) null);
        }
        uq2.mo35237g(12);
        uq2.mo35237g(1);
        int f = m36835f(uq2);
        byte[] bArr = new byte[f];
        uq2.mo35232b(bArr, 0, f);
        return Pair.create(d, bArr);
    }

    /* renamed from: i */
    private static Pair<Integer, C7815j1> m36838i(uq2 uq2, int i, int i2) throws C7811iy {
        Pair<Integer, C7815j1> pair;
        Integer num;
        C7815j1 j1Var;
        int i3;
        int i4;
        byte[] bArr;
        uq2 uq22 = uq2;
        int k = uq2.mo35241k();
        while (k - i < i2) {
            uq22.mo35236f(k);
            int m = uq2.mo35243m();
            boolean z = true;
            zb4.m21283b(m > 0, "childAtomSize must be positive");
            if (uq2.mo35243m() == 1936289382) {
                int i5 = k + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - k < m) {
                    uq22.mo35236f(i5);
                    int m2 = uq2.mo35243m();
                    int m3 = uq2.mo35243m();
                    if (m3 == 1718775137) {
                        num2 = Integer.valueOf(uq2.mo35243m());
                    } else if (m3 == 1935894637) {
                        uq22.mo35237g(4);
                        str = uq22.mo35228F(4, n33.f35887c);
                    } else if (m3 == 1935894633) {
                        i6 = i5;
                        i7 = m2;
                    }
                    i5 += m2;
                }
                if (C6540C.CENC_TYPE_cenc.equals(str) || C6540C.CENC_TYPE_cbc1.equals(str) || C6540C.CENC_TYPE_cens.equals(str) || C6540C.CENC_TYPE_cbcs.equals(str)) {
                    zb4.m21283b(num2 != null, "frma atom is mandatory");
                    zb4.m21283b(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            j1Var = null;
                            break;
                        }
                        uq22.mo35236f(i8);
                        int m4 = uq2.mo35243m();
                        if (uq2.mo35243m() == 1952804451) {
                            int m5 = uq2.mo35243m();
                            uq22.mo35237g(1);
                            if (C7850k0.m33804a(m5) == 0) {
                                uq22.mo35237g(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int s = uq2.mo35249s();
                                i4 = s & 15;
                                i3 = (s & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            boolean z2 = uq2.mo35249s() == 1;
                            int s2 = uq2.mo35249s();
                            byte[] bArr2 = new byte[16];
                            uq22.mo35232b(bArr2, 0, 16);
                            if (!z2 || s2 != 0) {
                                bArr = null;
                            } else {
                                int s3 = uq2.mo35249s();
                                byte[] bArr3 = new byte[s3];
                                uq22.mo35232b(bArr3, 0, s3);
                                bArr = bArr3;
                            }
                            num = num2;
                            j1Var = new C7815j1(z2, str, s2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i8 += m4;
                        }
                    }
                    if (j1Var == null) {
                        z = false;
                    }
                    zb4.m21283b(z, "tenc atom is mandatory");
                    int i9 = d13.f20195a;
                    pair = Pair.create(num, j1Var);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            k += m;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0343 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0152  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m36839j(com.google.android.gms.internal.ads.uq2 r21, int r22, int r23, int r24, int r25, java.lang.String r26, boolean r27, com.google.android.gms.internal.ads.zzs r28, com.google.android.gms.internal.ads.C7962n0 r29, int r30) throws com.google.android.gms.internal.ads.C7811iy {
        /*
            r0 = r21
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r28
            r6 = r29
            int r7 = r1 + 16
            r0.mo35236f(r7)
            r7 = 6
            if (r27 == 0) goto L_0x001e
            int r9 = r21.mo35253w()
            r0.mo35237g(r7)
            goto L_0x0024
        L_0x001e:
            r9 = 8
            r0.mo35237g(r9)
            r9 = 0
        L_0x0024:
            r10 = 20
            r11 = 16
            r12 = 2
            r13 = 1
            if (r9 == 0) goto L_0x004a
            if (r9 != r13) goto L_0x002f
            goto L_0x004a
        L_0x002f:
            if (r9 != r12) goto L_0x0049
            r0.mo35237g(r11)
            long r14 = r21.mo35256z()
            double r14 = java.lang.Double.longBitsToDouble(r14)
            long r14 = java.lang.Math.round(r14)
            int r7 = (int) r14
            int r9 = r21.mo35252v()
            r0.mo35237g(r10)
            goto L_0x005b
        L_0x0049:
            return
        L_0x004a:
            int r14 = r21.mo35253w()
            r0.mo35237g(r7)
            int r7 = r21.mo35250t()
            if (r9 != r13) goto L_0x005a
            r0.mo35237g(r11)
        L_0x005a:
            r9 = r14
        L_0x005b:
            int r11 = r21.mo35241k()
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r15 = r22
            if (r15 != r14) goto L_0x008e
            android.util.Pair r15 = m36838i(r0, r1, r2)
            if (r15 == 0) goto L_0x008a
            java.lang.Object r14 = r15.first
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r5 != 0) goto L_0x0078
            r5 = 0
            goto L_0x0082
        L_0x0078:
            java.lang.Object r10 = r15.second
            com.google.android.gms.internal.ads.j1 r10 = (com.google.android.gms.internal.ads.C7815j1) r10
            java.lang.String r10 = r10.f33693b
            com.google.android.gms.internal.ads.zzs r5 = r5.mo36292a(r10)
        L_0x0082:
            com.google.android.gms.internal.ads.j1[] r10 = r6.f35857a
            java.lang.Object r15 = r15.second
            com.google.android.gms.internal.ads.j1 r15 = (com.google.android.gms.internal.ads.C7815j1) r15
            r10[r30] = r15
        L_0x008a:
            r0.mo35236f(r11)
            goto L_0x008f
        L_0x008e:
            r14 = r15
        L_0x008f:
            r10 = 1633889587(0x61632d33, float:2.6191674E20)
            r15 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r16 = "audio/raw"
            java.lang.String r12 = "audio/ac4"
            if (r14 != r10) goto L_0x00a0
            java.lang.String r16 = "audio/ac3"
        L_0x009d:
            r10 = -1
            goto L_0x0149
        L_0x00a0:
            r10 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r14 != r10) goto L_0x00a8
            java.lang.String r16 = "audio/eac3"
            goto L_0x009d
        L_0x00a8:
            r10 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r14 != r10) goto L_0x00b0
            r16 = r12
            goto L_0x009d
        L_0x00b0:
            r10 = 1685353315(0x64747363, float:1.803728E22)
            if (r14 != r10) goto L_0x00b8
            java.lang.String r16 = "audio/vnd.dts"
            goto L_0x009d
        L_0x00b8:
            r10 = 1685353320(0x64747368, float:1.8037286E22)
            if (r14 == r10) goto L_0x0145
            r10 = 1685353324(0x6474736c, float:1.803729E22)
            if (r14 != r10) goto L_0x00c4
            goto L_0x0145
        L_0x00c4:
            r10 = 1685353317(0x64747365, float:1.8037282E22)
            if (r14 != r10) goto L_0x00cc
            java.lang.String r16 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x009d
        L_0x00cc:
            r10 = 1685353336(0x64747378, float:1.8037304E22)
            if (r14 != r10) goto L_0x00d4
            java.lang.String r16 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x009d
        L_0x00d4:
            r10 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r14 != r10) goto L_0x00dc
            java.lang.String r16 = "audio/3gpp"
            goto L_0x009d
        L_0x00dc:
            r10 = 1935767394(0x73617762, float:1.7863284E31)
            if (r14 != r10) goto L_0x00e4
            java.lang.String r16 = "audio/amr-wb"
            goto L_0x009d
        L_0x00e4:
            r10 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r14 == r10) goto L_0x0143
            r10 = 1936684916(0x736f7774, float:1.89725E31)
            if (r14 != r10) goto L_0x00ef
            goto L_0x0143
        L_0x00ef:
            r10 = 1953984371(0x74776f73, float:7.841539E31)
            if (r14 != r10) goto L_0x00f7
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0149
        L_0x00f7:
            r10 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r14 == r10) goto L_0x013f
            r10 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r14 != r10) goto L_0x0102
            goto L_0x013f
        L_0x0102:
            r10 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r14 != r10) goto L_0x010a
            java.lang.String r16 = "audio/mha1"
            goto L_0x009d
        L_0x010a:
            r10 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r14 != r10) goto L_0x0112
            java.lang.String r16 = "audio/mhm1"
            goto L_0x009d
        L_0x0112:
            if (r14 != r15) goto L_0x0117
            java.lang.String r16 = "audio/alac"
            goto L_0x009d
        L_0x0117:
            r10 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r14 != r10) goto L_0x0120
            java.lang.String r16 = "audio/g711-alaw"
            goto L_0x009d
        L_0x0120:
            r10 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r14 != r10) goto L_0x0129
            java.lang.String r16 = "audio/g711-mlaw"
            goto L_0x009d
        L_0x0129:
            r10 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r14 != r10) goto L_0x0132
            java.lang.String r16 = "audio/opus"
            goto L_0x009d
        L_0x0132:
            r10 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r14 != r10) goto L_0x013b
            java.lang.String r16 = "audio/flac"
            goto L_0x009d
        L_0x013b:
            r10 = -1
            r16 = 0
            goto L_0x0149
        L_0x013f:
            java.lang.String r16 = "audio/mpeg"
            goto L_0x009d
        L_0x0143:
            r10 = 2
            goto L_0x0149
        L_0x0145:
            java.lang.String r16 = "audio/vnd.dts.hd"
            goto L_0x009d
        L_0x0149:
            r13 = r16
            r14 = 0
            r19 = 0
        L_0x014e:
            int r15 = r11 - r1
            if (r15 >= r2) goto L_0x033d
            r0.mo35236f(r11)
            int r15 = r21.mo35243m()
            if (r15 <= 0) goto L_0x015d
            r8 = 1
            goto L_0x015e
        L_0x015d:
            r8 = 0
        L_0x015e:
            java.lang.String r1 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zb4.m21283b(r8, r1)
            int r8 = r21.mo35243m()
            r2 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r8 != r2) goto L_0x0187
            int r1 = r15 + -13
            byte[] r2 = new byte[r1]
            int r8 = r11 + 13
            r0.mo35236f(r8)
            r8 = 0
            r0.mo35232b(r2, r8, r1)
            com.google.android.gms.internal.ads.p63 r1 = com.google.android.gms.internal.ads.p63.m20815D(r2)
            r19 = r1
            r16 = r10
        L_0x0181:
            r8 = 0
            r10 = 1
            r17 = 2
            goto L_0x0334
        L_0x0187:
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r8 == r2) goto L_0x0306
            if (r27 == 0) goto L_0x01cb
            r2 = 2002876005(0x77617665, float:4.5729223E33)
            if (r8 != r2) goto L_0x01cb
            int r2 = r21.mo35241k()
        L_0x0197:
            int r8 = r2 - r11
            if (r8 >= r15) goto L_0x01c1
            r0.mo35236f(r2)
            int r8 = r21.mo35243m()
            if (r8 <= 0) goto L_0x01a8
            r16 = r10
            r10 = 1
            goto L_0x01ab
        L_0x01a8:
            r16 = r10
            r10 = 0
        L_0x01ab:
            com.google.android.gms.internal.ads.zb4.m21283b(r10, r1)
            int r10 = r21.mo35243m()
            r20 = r1
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r10 == r1) goto L_0x01bf
            int r2 = r2 + r8
            r10 = r16
            r1 = r20
            goto L_0x0197
        L_0x01bf:
            r1 = -1
            goto L_0x01c5
        L_0x01c1:
            r16 = r10
            r1 = -1
            r2 = -1
        L_0x01c5:
            r8 = 0
            r10 = 1
            r17 = 2
            goto L_0x030e
        L_0x01cb:
            r16 = r10
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r8 != r1) goto L_0x01e4
            int r1 = r11 + 8
            r0.mo35236f(r1)
            java.lang.String r1 = java.lang.Integer.toString(r25)
            com.google.android.gms.internal.ads.w r1 = com.google.android.gms.internal.ads.ab4.m30275b(r0, r1, r4, r5)
            r6.f35858b = r1
        L_0x01e1:
            r1 = 20
            goto L_0x0181
        L_0x01e4:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r8 != r1) goto L_0x01f9
            int r1 = r11 + 8
            r0.mo35236f(r1)
            java.lang.String r1 = java.lang.Integer.toString(r25)
            com.google.android.gms.internal.ads.w r1 = com.google.android.gms.internal.ads.ab4.m30276c(r0, r1, r4, r5)
            r6.f35858b = r1
            goto L_0x01e1
        L_0x01f9:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r8 != r1) goto L_0x023d
            int r1 = r11 + 8
            r0.mo35236f(r1)
            java.lang.String r1 = java.lang.Integer.toString(r25)
            int r2 = com.google.android.gms.internal.ads.db4.f30706b
            r2 = 1
            r0.mo35237g(r2)
            int r8 = r21.mo35249s()
            r8 = r8 & 32
            int r8 = r8 >> 5
            if (r2 == r8) goto L_0x021b
            r2 = 44100(0xac44, float:6.1797E-41)
            goto L_0x021e
        L_0x021b:
            r2 = 48000(0xbb80, float:6.7262E-41)
        L_0x021e:
            com.google.android.gms.internal.ads.ge4 r8 = new com.google.android.gms.internal.ads.ge4
            r8.<init>()
            r8.mo32081h(r1)
            r8.mo32093s(r12)
            r1 = 2
            r8.mo32076e0(r1)
            r8.mo32094t(r2)
            r8.mo32070b(r5)
            r8.mo32085k(r4)
            com.google.android.gms.internal.ads.w r1 = r8.mo32099y()
            r6.f35858b = r1
            goto L_0x01e1
        L_0x023d:
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r8 != r1) goto L_0x0260
            com.google.android.gms.internal.ads.ge4 r1 = new com.google.android.gms.internal.ads.ge4
            r1.<init>()
            r1.mo32079g(r3)
            r1.mo32093s(r13)
            r1.mo32076e0(r9)
            r1.mo32094t(r7)
            r1.mo32070b(r5)
            r1.mo32085k(r4)
            com.google.android.gms.internal.ads.w r1 = r1.mo32099y()
            r6.f35858b = r1
            goto L_0x01e1
        L_0x0260:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r8 != r1) goto L_0x0280
            int r1 = r15 + -8
            byte[] r2 = f38446a
            int r8 = r2.length
            int r8 = r8 + r1
            byte[] r8 = java.util.Arrays.copyOf(r2, r8)
            int r10 = r11 + 8
            r0.mo35236f(r10)
            int r2 = r2.length
            r0.mo35232b(r8, r2, r1)
            java.util.List r1 = com.google.android.gms.internal.ads.sc4.m37375a(r8)
            r19 = r1
            goto L_0x0181
        L_0x0280:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r8 != r1) goto L_0x02b2
            int r1 = r15 + -12
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r8 = 102(0x66, float:1.43E-43)
            r10 = 0
            r2[r10] = r8
            r8 = 76
            r10 = 1
            r2[r10] = r8
            r8 = 97
            r17 = 2
            r2[r17] = r8
            r8 = 3
            r18 = 67
            r2[r8] = r18
            int r8 = r11 + 12
            r0.mo35236f(r8)
            r8 = 4
            r0.mo35232b(r2, r8, r1)
            com.google.android.gms.internal.ads.p63 r1 = com.google.android.gms.internal.ads.p63.m20815D(r2)
            r19 = r1
        L_0x02af:
            r8 = 0
            goto L_0x0334
        L_0x02b2:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r10 = 1
            r17 = 2
            if (r8 != r1) goto L_0x0303
            int r2 = r15 + -12
            byte[] r7 = new byte[r2]
            int r8 = r11 + 12
            r0.mo35236f(r8)
            r8 = 0
            r0.mo35232b(r7, r8, r2)
            com.google.android.gms.internal.ads.uq2 r2 = new com.google.android.gms.internal.ads.uq2
            r2.<init>((byte[]) r7)
            r9 = 9
            r2.mo35236f(r9)
            int r9 = r2.mo35249s()
            r1 = 20
            r2.mo35236f(r1)
            int r2 = r2.mo35252v()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r2 = android.util.Pair.create(r2, r9)
            java.lang.Object r9 = r2.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.gms.internal.ads.p63 r7 = com.google.android.gms.internal.ads.p63.m20815D(r7)
            r19 = r7
            r7 = r9
            r9 = r2
            goto L_0x0334
        L_0x0303:
            r1 = 20
            goto L_0x02af
        L_0x0306:
            r16 = r10
            r8 = 0
            r10 = 1
            r17 = 2
            r2 = r11
            r1 = -1
        L_0x030e:
            if (r2 == r1) goto L_0x0334
            android.util.Pair r2 = m36837h(r0, r2)
            java.lang.Object r13 = r2.first
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r2.second
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L_0x0334
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0330
            com.google.android.gms.internal.ads.wa4 r1 = com.google.android.gms.internal.ads.xa4.m39418a(r2)
            int r7 = r1.f40746a
            int r9 = r1.f40747b
            java.lang.String r14 = r1.f40748c
        L_0x0330:
            com.google.android.gms.internal.ads.p63 r19 = com.google.android.gms.internal.ads.p63.m20815D(r2)
        L_0x0334:
            int r11 = r11 + r15
            r1 = r23
            r2 = r24
            r10 = r16
            goto L_0x014e
        L_0x033d:
            r16 = r10
            com.google.android.gms.internal.ads.w r0 = r6.f35858b
            if (r0 != 0) goto L_0x036f
            if (r13 == 0) goto L_0x036f
            com.google.android.gms.internal.ads.ge4 r0 = new com.google.android.gms.internal.ads.ge4
            r0.<init>()
            r0.mo32079g(r3)
            r0.mo32093s(r13)
            r0.mo32078f0(r14)
            r0.mo32076e0(r9)
            r0.mo32094t(r7)
            r13 = r16
            r0.mo32088n(r13)
            r1 = r19
            r0.mo32083i(r1)
            r0.mo32070b(r5)
            r0.mo32085k(r4)
            com.google.android.gms.internal.ads.w r0 = r0.mo32099y()
            r6.f35858b = r0
        L_0x036f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8105r0.m36839j(com.google.android.gms.internal.ads.uq2, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzs, com.google.android.gms.internal.ads.n0, int):void");
    }
}
