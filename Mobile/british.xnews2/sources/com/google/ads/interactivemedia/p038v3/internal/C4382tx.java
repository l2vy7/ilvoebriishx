package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.extractor.p039ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tx */
/* compiled from: IMASDK */
final class C4382tx {

    /* renamed from: a */
    private static final byte[] f18861a = amm.m14255y("OpusHead");

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
    public static android.util.Pair<com.google.ads.interactivemedia.p038v3.internal.C4507yn, com.google.ads.interactivemedia.p038v3.internal.C4507yn> m19019a(com.google.ads.interactivemedia.p038v3.internal.C4374tp r11) {
        /*
            com.google.ads.interactivemedia.v3.internal.alw r11 = r11.f18835a
            r0 = 8
            r11.mo13951i(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x000a:
            int r4 = r11.mo13947e()
            if (r4 < r0) goto L_0x00da
            int r4 = r11.mo13950h()
            int r5 = r11.mo13965w()
            int r6 = r11.mo13965w()
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 != r7) goto L_0x0075
            r11.mo13951i(r4)
            int r2 = r4 + r5
            r11.mo13954l(r0)
            m19021c(r11)
        L_0x002c:
            int r6 = r11.mo13950h()
            if (r6 >= r2) goto L_0x0073
            int r6 = r11.mo13950h()
            int r7 = r11.mo13965w()
            int r8 = r11.mo13965w()
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r9) goto L_0x006e
            r11.mo13951i(r6)
            int r6 = r6 + r7
            r11.mo13954l(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x004f:
            int r7 = r11.mo13950h()
            if (r7 >= r6) goto L_0x005f
            com.google.ads.interactivemedia.v3.internal.ym r7 = com.google.ads.interactivemedia.p038v3.internal.C4390ue.m19110a(r11)
            if (r7 == 0) goto L_0x004f
            r2.add(r7)
            goto L_0x004f
        L_0x005f:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0066
            goto L_0x0073
        L_0x0066:
            com.google.ads.interactivemedia.v3.internal.yn r6 = new com.google.ads.interactivemedia.v3.internal.yn
            r6.<init>((java.util.List<? extends com.google.ads.interactivemedia.p038v3.internal.C4506ym>) r2)
            r2 = r6
            goto L_0x00d4
        L_0x006e:
            int r6 = r6 + r7
            r11.mo13951i(r6)
            goto L_0x002c
        L_0x0073:
            r2 = r1
            goto L_0x00d4
        L_0x0075:
            r7 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r6 != r7) goto L_0x00d4
            r11.mo13951i(r4)
            int r3 = r4 + r5
            r6 = 12
            r11.mo13954l(r6)
        L_0x0084:
            int r7 = r11.mo13950h()
            if (r7 >= r3) goto L_0x00d3
            int r7 = r11.mo13950h()
            int r8 = r11.mo13965w()
            int r9 = r11.mo13965w()
            r10 = 1935766900(0x73617574, float:1.7862687E31)
            if (r9 != r10) goto L_0x00ce
            r3 = 14
            if (r8 >= r3) goto L_0x00a0
            goto L_0x00d3
        L_0x00a0:
            r3 = 5
            r11.mo13954l(r3)
            int r3 = r11.mo13957o()
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
            r11.mo13954l(r3)
            int r6 = r11.mo13957o()
            com.google.ads.interactivemedia.v3.internal.yn r8 = new com.google.ads.interactivemedia.v3.internal.yn
            com.google.ads.interactivemedia.v3.internal.ym[] r3 = new com.google.ads.interactivemedia.p038v3.internal.C4506ym[r3]
            com.google.ads.interactivemedia.v3.internal.zs r9 = new com.google.ads.interactivemedia.v3.internal.zs
            r9.<init>(r7, r6)
            r6 = 0
            r3[r6] = r9
            r8.<init>((com.google.ads.interactivemedia.p038v3.internal.C4506ym[]) r3)
            r3 = r8
            goto L_0x00d4
        L_0x00ce:
            int r7 = r7 + r8
            r11.mo13951i(r7)
            goto L_0x0084
        L_0x00d3:
            r3 = r1
        L_0x00d4:
            int r4 = r4 + r5
            r11.mo13951i(r4)
            goto L_0x000a
        L_0x00da:
            android.util.Pair r11 = android.util.Pair.create(r2, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4382tx.m19019a(com.google.ads.interactivemedia.v3.internal.tp):android.util.Pair");
    }

    /* renamed from: b */
    public static C4507yn m19020b(C4373to toVar) {
        C4536zp zpVar;
        C4374tp c = toVar.mo16659c(Atom.TYPE_hdlr);
        C4374tp c2 = toVar.mo16659c(Atom.TYPE_keys);
        C4374tp c3 = toVar.mo16659c(Atom.TYPE_ilst);
        if (c == null || c2 == null || c3 == null || m19023e(c.f18835a) != 1835299937) {
            return null;
        }
        alw alw = c2.f18835a;
        alw.mo13951i(12);
        int w = alw.mo13965w();
        String[] strArr = new String[w];
        for (int i = 0; i < w; i++) {
            int w2 = alw.mo13965w();
            alw.mo13954l(4);
            strArr[i] = alw.mo13937F(w2 - 8);
        }
        alw alw2 = c3.f18835a;
        alw2.mo13951i(8);
        ArrayList arrayList = new ArrayList();
        while (alw2.mo13947e() > 8) {
            int h = alw2.mo13950h();
            int w3 = alw2.mo13965w();
            int w4 = alw2.mo13965w() - 1;
            if (w4 < 0 || w4 >= w) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(w4);
                Log.w("AtomParsers", sb.toString());
            } else {
                String str = strArr[w4];
                int i2 = h + w3;
                int i3 = C4390ue.f19008b;
                while (true) {
                    int h2 = alw2.mo13950h();
                    if (h2 >= i2) {
                        zpVar = null;
                        break;
                    }
                    int w5 = alw2.mo13965w();
                    if (alw2.mo13965w() == 1684108385) {
                        int w6 = alw2.mo13965w();
                        int w7 = alw2.mo13965w();
                        int i4 = w5 - 16;
                        byte[] bArr = new byte[i4];
                        alw2.mo13956n(bArr, 0, i4);
                        zpVar = new C4536zp(str, bArr, w7, w6);
                        break;
                    }
                    alw2.mo13951i(h2 + w5);
                }
                if (zpVar != null) {
                    arrayList.add(zpVar);
                }
            }
            alw2.mo13951i(h + w3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4507yn((List<? extends C4506ym>) arrayList);
    }

    /* renamed from: c */
    public static void m19021c(alw alw) {
        int h = alw.mo13950h();
        alw.mo13954l(4);
        if (alw.mo13965w() != 1751411826) {
            h += 4;
        }
        alw.mo13951i(h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
        if (r8 == 0) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ec, code lost:
        r8 = -9223372036854775807L;
     */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0697  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0708  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x090d  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x09b7  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x09ca  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x09ee  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0a03  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0a48  */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0a5b  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0a5e  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0abf  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0ad8  */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0ba8  */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0beb  */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x09e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0218  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.google.ads.interactivemedia.p038v3.internal.C4402uq> m19022d(com.google.ads.interactivemedia.p038v3.internal.C4373to r44, com.google.ads.interactivemedia.p038v3.internal.C4318rn r45, long r46, com.google.ads.interactivemedia.p038v3.internal.C4276pz r48, boolean r49, com.google.ads.interactivemedia.p038v3.internal.arn<com.google.ads.interactivemedia.p038v3.internal.C4399un, com.google.ads.interactivemedia.p038v3.internal.C4399un> r50) throws com.google.ads.interactivemedia.p038v3.internal.C4144lb {
        /*
            r0 = r44
            r1 = r45
            r12 = r48
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r15 = 0
        L_0x000c:
            java.util.List<com.google.ads.interactivemedia.v3.internal.to> r2 = r0.f18834c
            int r2 = r2.size()
            if (r15 >= r2) goto L_0x0d6b
            java.util.List<com.google.ads.interactivemedia.v3.internal.to> r2 = r0.f18834c
            java.lang.Object r2 = r2.get(r15)
            r11 = r2
            com.google.ads.interactivemedia.v3.internal.to r11 = (com.google.ads.interactivemedia.p038v3.internal.C4373to) r11
            int r2 = r11.f18836d
            r3 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r3) goto L_0x0029
            r0 = r13
            r32 = r15
            goto L_0x0d60
        L_0x0029:
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.ads.interactivemedia.v3.internal.tp r2 = r0.mo16659c(r2)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r2)
            r10 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.ads.interactivemedia.v3.internal.to r3 = r11.mo16660d(r10)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r3)
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.ads.interactivemedia.v3.internal.tp r4 = r3.mo16659c(r4)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r4)
            com.google.ads.interactivemedia.v3.internal.alw r4 = r4.f18835a
            int r4 = m19023e(r4)
            r5 = 1936684398(0x736f756e, float:1.8971874E31)
            r7 = -1
            if (r4 != r5) goto L_0x0055
            r5 = 1
            goto L_0x007c
        L_0x0055:
            r5 = 1986618469(0x76696465, float:1.1834389E33)
            if (r4 != r5) goto L_0x005c
            r5 = 2
            goto L_0x007c
        L_0x005c:
            r5 = 1952807028(0x74657874, float:7.272211E31)
            if (r4 == r5) goto L_0x007b
            r5 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r4 == r5) goto L_0x007b
            r5 = 1937072756(0x73756274, float:1.944137E31)
            if (r4 == r5) goto L_0x007b
            r5 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r4 != r5) goto L_0x0071
            goto L_0x007b
        L_0x0071:
            r5 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r4 != r5) goto L_0x0079
            r4 = 5
            r5 = 5
            goto L_0x007c
        L_0x0079:
            r5 = -1
            goto L_0x007c
        L_0x007b:
            r5 = 3
        L_0x007c:
            r14 = 4
            r31 = 0
            if (r5 != r7) goto L_0x008d
            r0 = r50
            r2 = r11
            r33 = r13
            r32 = r15
            r1 = r31
            r8 = 2
            goto L_0x073c
        L_0x008d:
            r10 = 1953196132(0x746b6864, float:7.46037E31)
            com.google.ads.interactivemedia.v3.internal.tp r10 = r11.mo16659c(r10)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r10)
            com.google.ads.interactivemedia.v3.internal.alw r10 = r10.f18835a
            r4 = 8
            r10.mo13951i(r4)
            int r21 = r10.mo13965w()
            int r21 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19003e(r21)
            if (r21 != 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r4 = 16
        L_0x00ab:
            r10.mo13954l(r4)
            int r4 = r10.mo13965w()
            r10.mo13954l(r14)
            int r24 = r10.mo13950h()
            if (r21 != 0) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            r14 = 8
        L_0x00be:
            r6 = 0
        L_0x00bf:
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 >= r14) goto L_0x00e7
            byte[] r28 = r10.mo13952j()
            int r29 = r24 + r6
            byte r8 = r28[r29]
            if (r8 == r7) goto L_0x00e2
            if (r21 != 0) goto L_0x00d7
            long r8 = r10.mo13963u()
            goto L_0x00db
        L_0x00d7:
            long r8 = r10.mo13936E()
        L_0x00db:
            r28 = 0
            int r6 = (r8 > r28 ? 1 : (r8 == r28 ? 0 : -1))
            if (r6 != 0) goto L_0x00ee
            goto L_0x00ec
        L_0x00e2:
            r28 = 0
            int r6 = r6 + 1
            goto L_0x00bf
        L_0x00e7:
            r28 = 0
            r10.mo13954l(r14)
        L_0x00ec:
            r8 = r26
        L_0x00ee:
            r6 = 16
            r10.mo13954l(r6)
            int r14 = r10.mo13965w()
            int r6 = r10.mo13965w()
            r7 = 4
            r10.mo13954l(r7)
            int r7 = r10.mo13965w()
            int r10 = r10.mo13965w()
            r0 = 65536(0x10000, float:9.18355E-41)
            r24 = r5
            r5 = -65536(0xffffffffffff0000, float:NaN)
            if (r14 != 0) goto L_0x0120
            if (r6 != r0) goto L_0x011f
            if (r7 != r5) goto L_0x011d
            if (r10 != 0) goto L_0x0118
            r0 = 90
            goto L_0x0137
        L_0x0118:
            r6 = 65536(0x10000, float:9.18355E-41)
            r7 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x011f
        L_0x011d:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x011f:
            r14 = 0
        L_0x0120:
            if (r14 != 0) goto L_0x012b
            if (r6 != r5) goto L_0x012b
            if (r7 != r0) goto L_0x012b
            if (r10 != 0) goto L_0x012b
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x0137
        L_0x012b:
            if (r14 != r5) goto L_0x0136
            if (r6 != 0) goto L_0x0136
            if (r7 != 0) goto L_0x0136
            if (r10 != r5) goto L_0x0136
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x0137
        L_0x0136:
            r0 = 0
        L_0x0137:
            com.google.ads.interactivemedia.v3.internal.tw r14 = new com.google.ads.interactivemedia.v3.internal.tw
            r14.<init>(r4, r8, r0)
            int r0 = (r46 > r26 ? 1 : (r46 == r26 ? 0 : -1))
            if (r0 != 0) goto L_0x0147
            long r4 = r14.f18859b
            r32 = r4
            goto L_0x0149
        L_0x0147:
            r32 = r46
        L_0x0149:
            com.google.ads.interactivemedia.v3.internal.alw r0 = r2.f18835a
            r2 = 8
            r0.mo13951i(r2)
            int r2 = r0.mo13965w()
            int r2 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19003e(r2)
            if (r2 != 0) goto L_0x015d
            r2 = 8
            goto L_0x015f
        L_0x015d:
            r2 = 16
        L_0x015f:
            r0.mo13954l(r2)
            long r38 = r0.mo13963u()
            int r0 = (r32 > r26 ? 1 : (r32 == r26 ? 0 : -1))
            if (r0 != 0) goto L_0x016b
            goto L_0x0176
        L_0x016b:
            r34 = 1000000(0xf4240, double:4.940656E-318)
            r36 = r38
            long r4 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r32, r34, r36)
            r26 = r4
        L_0x0176:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.ads.interactivemedia.v3.internal.to r2 = r3.mo16660d(r0)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r2)
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.ads.interactivemedia.v3.internal.to r2 = r2.mo16660d(r4)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r2)
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            com.google.ads.interactivemedia.v3.internal.tp r3 = r3.mo16659c(r5)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r3)
            com.google.ads.interactivemedia.v3.internal.alw r3 = r3.f18835a
            r7 = 8
            r3.mo13951i(r7)
            int r5 = r3.mo13965w()
            int r5 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19003e(r5)
            if (r5 != 0) goto L_0x01a8
            r6 = 8
            goto L_0x01aa
        L_0x01a8:
            r6 = 16
        L_0x01aa:
            r3.mo13954l(r6)
            long r8 = r3.mo13963u()
            if (r5 != 0) goto L_0x01b5
            r5 = 4
            goto L_0x01b7
        L_0x01b5:
            r5 = 8
        L_0x01b7:
            r3.mo13954l(r5)
            int r3 = r3.mo13958p()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r10 = 3
            r5.<init>(r10)
            int r6 = r3 >> 10
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r5.append(r6)
            int r6 = r3 >> 5
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r5.append(r6)
            r3 = r3 & 31
            int r3 = r3 + 96
            char r3 = (char) r3
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            android.util.Pair r9 = android.util.Pair.create(r5, r3)
            r3 = 1937011556(0x73747364, float:1.9367383E31)
            com.google.ads.interactivemedia.v3.internal.tp r2 = r2.mo16659c(r3)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r2)
            com.google.ads.interactivemedia.v3.internal.alw r8 = r2.f18835a
            int r6 = r14.f18858a
            int r5 = r14.f18860c
            java.lang.Object r2 = r9.second
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            r2 = 12
            r8.mo13951i(r2)
            int r2 = r8.mo13965w()
            com.google.ads.interactivemedia.v3.internal.tt r0 = new com.google.ads.interactivemedia.v3.internal.tt
            r0.<init>(r2)
            r32 = r15
            r15 = 0
        L_0x0216:
            if (r15 >= r2) goto L_0x0681
            r33 = r13
            int r13 = r8.mo13950h()
            int r1 = r8.mo13965w()
            if (r1 <= 0) goto L_0x0226
            r4 = 1
            goto L_0x0227
        L_0x0226:
            r4 = 0
        L_0x0227:
            java.lang.String r7 = "childAtomSize should be positive"
            com.google.ads.interactivemedia.p038v3.internal.aup.m14888s(r4, r7)
            int r4 = r8.mo13965w()
            r7 = 1635148593(0x61766331, float:2.840654E20)
            r10 = 1701733238(0x656e6376, float:7.035987E22)
            if (r4 == r7) goto L_0x0417
            r7 = 1635148595(0x61766333, float:2.8406544E20)
            if (r4 == r7) goto L_0x0417
            if (r4 == r10) goto L_0x0417
            r7 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 == r7) goto L_0x0417
            r7 = 1836070006(0x6d703476, float:4.646239E27)
            if (r4 == r7) goto L_0x0417
            r7 = 1752589105(0x68766331, float:4.6541277E24)
            if (r4 == r7) goto L_0x0417
            r7 = 1751479857(0x68657631, float:4.3344087E24)
            if (r4 == r7) goto L_0x0417
            r7 = 1932670515(0x73323633, float:1.4119387E31)
            if (r4 == r7) goto L_0x0417
            r7 = 1987063864(0x76703038, float:1.21789965E33)
            if (r4 == r7) goto L_0x0417
            r7 = 1987063865(0x76703039, float:1.2178997E33)
            if (r4 == r7) goto L_0x0417
            r7 = 1635135537(0x61763031, float:2.8383572E20)
            if (r4 == r7) goto L_0x0417
            r7 = 1685479798(0x64766176, float:1.8179687E22)
            if (r4 == r7) goto L_0x0417
            r7 = 1685479729(0x64766131, float:1.817961E22)
            if (r4 == r7) goto L_0x0417
            r7 = 1685481573(0x64766865, float:1.8181686E22)
            if (r4 == r7) goto L_0x0417
            r7 = 1685481521(0x64766831, float:1.8181627E22)
            if (r4 != r7) goto L_0x027d
            goto L_0x0417
        L_0x027d:
            r7 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r4 == r7) goto L_0x03dd
            r7 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r4 == r7) goto L_0x03dd
            r7 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r4 == r7) goto L_0x03dd
            r7 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r4 == r7) goto L_0x03dd
            r7 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r4 == r7) goto L_0x03dd
            r7 = 1685353315(0x64747363, float:1.803728E22)
            if (r4 == r7) goto L_0x03dd
            r7 = 1685353317(0x64747365, float:1.8037282E22)
            if (r4 == r7) goto L_0x03dd
            r7 = 1685353320(0x64747368, float:1.8037286E22)
            if (r4 == r7) goto L_0x03dd
            r7 = 1685353324(0x6474736c, float:1.803729E22)
            if (r4 == r7) goto L_0x03dd
            r7 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r4 == r7) goto L_0x03dd
            r7 = 1935767394(0x73617762, float:1.7863284E31)
            if (r4 == r7) goto L_0x03dd
            r7 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r4 == r7) goto L_0x03dd
            r7 = 1936684916(0x736f7774, float:1.89725E31)
            if (r4 == r7) goto L_0x03dd
            r7 = 1953984371(0x74776f73, float:7.841539E31)
            if (r4 == r7) goto L_0x03dd
            r7 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r4 == r7) goto L_0x03dd
            r7 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r4 == r7) goto L_0x03dd
            r7 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r4 == r7) goto L_0x03dd
            r7 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r4 == r7) goto L_0x03dd
            r7 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r4 == r7) goto L_0x03dd
            r7 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r4 == r7) goto L_0x03dd
            r7 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r4 != r7) goto L_0x02ec
            r34 = r2
            r16 = r8
            goto L_0x03e1
        L_0x02ec:
            r7 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r4 == r7) goto L_0x035b
            r7 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 == r7) goto L_0x035b
            r7 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 == r7) goto L_0x035b
            r7 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 == r7) goto L_0x035b
            r7 = 1664495672(0x63363038, float:3.360782E21)
            if (r4 != r7) goto L_0x0306
            goto L_0x035b
        L_0x0306:
            r7 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r4 != r7) goto L_0x032b
            int r4 = r13 + 16
            r8.mo13951i(r4)
            r8.mo13940I()
            java.lang.String r4 = r8.mo13940I()
            if (r4 == 0) goto L_0x0343
            com.google.ads.interactivemedia.v3.internal.kd r7 = new com.google.ads.interactivemedia.v3.internal.kd
            r7.<init>()
            r7.mo16106R(r6)
            r7.mo16120ae(r4)
            com.google.ads.interactivemedia.v3.internal.ke r4 = r7.mo16115a()
            r0.f18847b = r4
            goto L_0x0343
        L_0x032b:
            r7 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r4 != r7) goto L_0x0343
            com.google.ads.interactivemedia.v3.internal.kd r4 = new com.google.ads.interactivemedia.v3.internal.kd
            r4.<init>()
            r4.mo16106R(r6)
            java.lang.String r7 = "application/x-camera-motion"
            r4.mo16120ae(r7)
            com.google.ads.interactivemedia.v3.internal.ke r4 = r4.mo16115a()
            r0.f18847b = r4
        L_0x0343:
            r18 = r1
            r34 = r2
            r35 = r3
            r3 = r5
            r2 = r6
            r41 = r9
            r42 = r11
            r21 = r13
            r23 = r14
            r16 = r15
            r20 = r24
            r4 = 3
            r14 = r8
            goto L_0x0414
        L_0x035b:
            int r7 = r13 + 16
            r8.mo13951i(r7)
            r7 = 1414810956(0x54544d4c, float:3.64731957E12)
            r34 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 != r7) goto L_0x0375
            java.lang.String r4 = "application/ttml+xml"
        L_0x036c:
            r16 = r8
            r10 = r31
        L_0x0370:
            r7 = r34
            r34 = r2
            goto L_0x03ab
        L_0x0375:
            r7 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 != r7) goto L_0x038d
            int r4 = r1 + -16
            byte[] r7 = new byte[r4]
            r10 = 0
            r8.mo13956n(r7, r10, r4)
            com.google.ads.interactivemedia.v3.internal.atz r4 = com.google.ads.interactivemedia.p038v3.internal.atz.m14808j(r7)
            java.lang.String r7 = "application/x-quicktime-tx3g"
            r10 = r4
            r4 = r7
            r16 = r8
            goto L_0x0370
        L_0x038d:
            r7 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 != r7) goto L_0x0395
            java.lang.String r4 = "application/x-mp4-vtt"
            goto L_0x036c
        L_0x0395:
            r7 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 != r7) goto L_0x03a5
            java.lang.String r4 = "application/ttml+xml"
            r34 = r2
            r16 = r8
            r7 = r28
            r10 = r31
            goto L_0x03ab
        L_0x03a5:
            r7 = 1
            r0.f18849d = r7
            java.lang.String r4 = "application/x-mp4-cea-608"
            goto L_0x036c
        L_0x03ab:
            com.google.ads.interactivemedia.v3.internal.kd r2 = new com.google.ads.interactivemedia.v3.internal.kd
            r2.<init>()
            r2.mo16106R(r6)
            r2.mo16120ae(r4)
            r2.mo16110V(r3)
            r2.mo16124ai(r7)
            r2.mo16108T(r10)
            com.google.ads.interactivemedia.v3.internal.ke r2 = r2.mo16115a()
            r0.f18847b = r2
            r18 = r1
            r35 = r3
            r3 = r5
            r2 = r6
            r41 = r9
            r42 = r11
            r21 = r13
            r23 = r14
            r14 = r16
            r20 = r24
            r4 = 3
            r8 = 2
            r16 = r15
            goto L_0x065b
        L_0x03dd:
            r16 = r8
            r34 = r2
        L_0x03e1:
            r2 = r16
            r35 = r3
            r3 = r4
            r8 = 8
            r10 = 1937007212(0x7374626c, float:1.9362132E31)
            r4 = r13
            r7 = r5
            r20 = r24
            r5 = r1
            r22 = r6
            r23 = r14
            r14 = 16
            r40 = r7
            r7 = r35
            r14 = r16
            r8 = r49
            r41 = r9
            r9 = r48
            r10 = r0
            r42 = r11
            r11 = r15
            m19024f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r18 = r1
            r21 = r13
            r16 = r15
            r2 = r22
            r3 = r40
            r4 = 3
        L_0x0414:
            r8 = 2
            goto L_0x065b
        L_0x0417:
            r34 = r2
            r35 = r3
            r40 = r5
            r22 = r6
            r41 = r9
            r42 = r11
            r23 = r14
            r20 = r24
            r14 = r8
            int r2 = r13 + 16
            r14.mo13951i(r2)
            r2 = 16
            r14.mo13954l(r2)
            int r3 = r14.mo13958p()
            int r5 = r14.mo13958p()
            r6 = 50
            r14.mo13954l(r6)
            int r6 = r14.mo13950h()
            if (r4 != r10) goto L_0x0474
            android.util.Pair r4 = m19026h(r14, r13, r1)
            if (r4 == 0) goto L_0x046c
            java.lang.Object r7 = r4.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r12 != 0) goto L_0x0458
            r8 = r31
            goto L_0x0462
        L_0x0458:
            java.lang.Object r8 = r4.second
            com.google.ads.interactivemedia.v3.internal.uo r8 = (com.google.ads.interactivemedia.p038v3.internal.C4400uo) r8
            java.lang.String r8 = r8.f19055b
            com.google.ads.interactivemedia.v3.internal.pz r8 = r12.mo16539b(r8)
        L_0x0462:
            com.google.ads.interactivemedia.v3.internal.uo[] r9 = r0.f18846a
            java.lang.Object r4 = r4.second
            com.google.ads.interactivemedia.v3.internal.uo r4 = (com.google.ads.interactivemedia.p038v3.internal.C4400uo) r4
            r9[r15] = r4
            r4 = r7
            goto L_0x0470
        L_0x046c:
            r8 = r12
            r4 = 1701733238(0x656e6376, float:7.035987E22)
        L_0x0470:
            r14.mo13951i(r6)
            goto L_0x0475
        L_0x0474:
            r8 = r12
        L_0x0475:
            r7 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 != r7) goto L_0x047d
            java.lang.String r7 = "video/mpeg"
            goto L_0x047f
        L_0x047d:
            r7 = r31
        L_0x047f:
            r9 = 1065353216(0x3f800000, float:1.0)
            r9 = r7
            r17 = r8
            r16 = r15
            r2 = r31
            r12 = r2
            r15 = r12
            r7 = 0
            r10 = -1
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x048e:
            int r8 = r6 - r13
            if (r8 >= r1) goto L_0x0618
            r14.mo13951i(r6)
            int r8 = r14.mo13950h()
            int r18 = r14.mo13965w()
            if (r18 != 0) goto L_0x04af
            int r18 = r14.mo13950h()
            r19 = r2
            int r2 = r18 - r13
            if (r2 != r1) goto L_0x04ad
            r18 = r1
            goto L_0x061c
        L_0x04ad:
            r2 = 0
            goto L_0x04b3
        L_0x04af:
            r19 = r2
            r2 = r18
        L_0x04b3:
            if (r2 <= 0) goto L_0x04bb
            r18 = r1
            r21 = r13
            r1 = 1
            goto L_0x04c0
        L_0x04bb:
            r18 = r1
            r21 = r13
            r1 = 0
        L_0x04c0:
            java.lang.String r13 = "childAtomSize should be positive"
            com.google.ads.interactivemedia.p038v3.internal.aup.m14888s(r1, r13)
            int r1 = r14.mo13965w()
            r13 = 1635148611(0x61766343, float:2.8406573E20)
            if (r1 != r13) goto L_0x04ee
            if (r9 != 0) goto L_0x04d2
            r1 = 1
            goto L_0x04d3
        L_0x04d2:
            r1 = 0
        L_0x04d3:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r1)
            int r8 = r8 + 8
            r14.mo13951i(r8)
            com.google.ads.interactivemedia.v3.internal.amn r1 = com.google.ads.interactivemedia.p038v3.internal.amn.m14257a(r14)
            java.util.List<byte[]> r8 = r1.f15312a
            int r9 = r1.f15313b
            r0.f18848c = r9
            if (r7 != 0) goto L_0x04e9
            float r11 = r1.f15316e
        L_0x04e9:
            java.lang.String r12 = r1.f15317f
            java.lang.String r1 = "video/avc"
            goto L_0x050e
        L_0x04ee:
            r13 = 1752589123(0x68766343, float:4.6541328E24)
            if (r1 != r13) goto L_0x0517
            if (r9 != 0) goto L_0x04f7
            r1 = 1
            goto L_0x04f8
        L_0x04f7:
            r1 = 0
        L_0x04f8:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r1)
            int r8 = r8 + 8
            r14.mo13951i(r8)
            com.google.ads.interactivemedia.v3.internal.amv r1 = com.google.ads.interactivemedia.p038v3.internal.amv.m14278a(r14)
            java.util.List<byte[]> r8 = r1.f15346a
            int r9 = r1.f15347b
            r0.f18848c = r9
            java.lang.String r12 = r1.f15348c
            java.lang.String r1 = "video/hevc"
        L_0x050e:
            r9 = r1
            r24 = r4
            r19 = r8
        L_0x0513:
            r4 = 3
        L_0x0514:
            r8 = 2
            goto L_0x060d
        L_0x0517:
            r13 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 == r13) goto L_0x05ff
            r13 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 != r13) goto L_0x0523
            goto L_0x05ff
        L_0x0523:
            r13 = 1987076931(0x76706343, float:1.21891066E33)
            if (r1 != r13) goto L_0x053b
            if (r9 != 0) goto L_0x052c
            r1 = 1
            goto L_0x052d
        L_0x052c:
            r1 = 0
        L_0x052d:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r1)
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r4 != r1) goto L_0x0538
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x054a
        L_0x0538:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x054a
        L_0x053b:
            r13 = 1635135811(0x61763143, float:2.8384055E20)
            if (r1 != r13) goto L_0x054e
            if (r9 != 0) goto L_0x0544
            r1 = 1
            goto L_0x0545
        L_0x0544:
            r1 = 0
        L_0x0545:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r1)
            java.lang.String r1 = "video/av01"
        L_0x054a:
            r9 = r1
            r24 = r4
            goto L_0x0513
        L_0x054e:
            r13 = 1681012275(0x64323633, float:1.3149704E22)
            if (r1 != r13) goto L_0x055e
            if (r9 != 0) goto L_0x0557
            r1 = 1
            goto L_0x0558
        L_0x0557:
            r1 = 0
        L_0x0558:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r1)
            java.lang.String r1 = "video/3gpp"
            goto L_0x054a
        L_0x055e:
            r13 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 != r13) goto L_0x0586
            if (r9 != 0) goto L_0x0567
            r1 = 1
            goto L_0x0568
        L_0x0567:
            r1 = 0
        L_0x0568:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14887r(r1)
            android.util.Pair r1 = m19025g(r14, r8)
            java.lang.Object r8 = r1.first
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x057e
            com.google.ads.interactivemedia.v3.internal.atz r1 = com.google.ads.interactivemedia.p038v3.internal.atz.m14808j(r1)
            goto L_0x0580
        L_0x057e:
            r1 = r19
        L_0x0580:
            r19 = r1
            r24 = r4
            r9 = r8
            goto L_0x0513
        L_0x0586:
            r13 = 1885434736(0x70617370, float:2.7909473E29)
            if (r1 != r13) goto L_0x05a2
            int r8 = r8 + 8
            r14.mo13951i(r8)
            int r1 = r14.mo13934C()
            float r1 = (float) r1
            int r7 = r14.mo13934C()
            float r7 = (float) r7
            float r1 = r1 / r7
            r11 = r1
            r24 = r4
            r4 = 3
            r7 = 1
            goto L_0x0514
        L_0x05a2:
            r13 = 1937126244(0x73763364, float:1.9506033E31)
            if (r1 != r13) goto L_0x05d5
            int r1 = r8 + 8
        L_0x05a9:
            int r13 = r1 - r8
            if (r13 >= r2) goto L_0x05cf
            r14.mo13951i(r1)
            int r13 = r14.mo13965w()
            int r15 = r14.mo13965w()
            r24 = r4
            r4 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r15 != r4) goto L_0x05cb
            byte[] r4 = r14.mo13952j()
            int r13 = r13 + r1
            byte[] r1 = java.util.Arrays.copyOfRange(r4, r1, r13)
            r15 = r1
            goto L_0x0513
        L_0x05cb:
            int r1 = r1 + r13
            r4 = r24
            goto L_0x05a9
        L_0x05cf:
            r24 = r4
            r15 = r31
            goto L_0x0513
        L_0x05d5:
            r24 = r4
            r4 = 1936995172(0x73743364, float:1.9347576E31)
            if (r1 != r4) goto L_0x0513
            int r1 = r14.mo13957o()
            r4 = 3
            r14.mo13954l(r4)
            if (r1 != 0) goto L_0x0514
            int r1 = r14.mo13957o()
            if (r1 == 0) goto L_0x05fc
            r8 = 1
            if (r1 == r8) goto L_0x05f9
            r8 = 2
            if (r1 == r8) goto L_0x05f7
            if (r1 == r4) goto L_0x05f5
            goto L_0x060d
        L_0x05f5:
            r10 = 3
            goto L_0x060d
        L_0x05f7:
            r10 = 2
            goto L_0x060d
        L_0x05f9:
            r8 = 2
            r10 = 1
            goto L_0x060d
        L_0x05fc:
            r8 = 2
            r10 = 0
            goto L_0x060d
        L_0x05ff:
            r24 = r4
            r4 = 3
            r8 = 2
            com.google.ads.interactivemedia.v3.internal.amq r1 = com.google.ads.interactivemedia.p038v3.internal.amq.m14259a(r14)
            if (r1 == 0) goto L_0x060d
            java.lang.String r12 = r1.f15323a
            java.lang.String r9 = "video/dolby-vision"
        L_0x060d:
            int r6 = r6 + r2
            r1 = r18
            r2 = r19
            r13 = r21
            r4 = r24
            goto L_0x048e
        L_0x0618:
            r18 = r1
            r19 = r2
        L_0x061c:
            r21 = r13
            r4 = 3
            r8 = 2
            if (r9 == 0) goto L_0x0657
            com.google.ads.interactivemedia.v3.internal.kd r1 = new com.google.ads.interactivemedia.v3.internal.kd
            r1.<init>()
            r2 = r22
            r1.mo16106R(r2)
            r1.mo16120ae(r9)
            r1.mo16097I(r12)
            r1.mo16125aj(r3)
            r1.mo16105Q(r5)
            r1.mo16116aa(r11)
            r3 = r40
            r1.mo16119ad(r3)
            r1.mo16117ab(r15)
            r1.mo16123ah(r10)
            r5 = r19
            r1.mo16108T(r5)
            r12 = r17
            r1.mo16100L(r12)
            com.google.ads.interactivemedia.v3.internal.ke r1 = r1.mo16115a()
            r0.f18847b = r1
            goto L_0x065b
        L_0x0657:
            r2 = r22
            r3 = r40
        L_0x065b:
            int r13 = r21 + r18
            r14.mo13951i(r13)
            int r15 = r16 + 1
            r1 = r45
            r12 = r48
            r6 = r2
            r5 = r3
            r8 = r14
            r24 = r20
            r14 = r23
            r13 = r33
            r2 = r34
            r3 = r35
            r9 = r41
            r11 = r42
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            r7 = 8
            r10 = 3
            r28 = 0
            goto L_0x0216
        L_0x0681:
            r41 = r9
            r42 = r11
            r33 = r13
            r23 = r14
            r20 = r24
            r8 = 2
            r1 = 1701082227(0x65647473, float:6.742798E22)
            r2 = r42
            com.google.ads.interactivemedia.v3.internal.to r1 = r2.mo16660d(r1)
            if (r1 == 0) goto L_0x0700
            r3 = 1701606260(0x656c7374, float:6.9788014E22)
            com.google.ads.interactivemedia.v3.internal.tp r1 = r1.mo16659c(r3)
            if (r1 != 0) goto L_0x06a3
            r1 = r31
            goto L_0x06f1
        L_0x06a3:
            com.google.ads.interactivemedia.v3.internal.alw r1 = r1.f18835a
            r3 = 8
            r1.mo13951i(r3)
            int r3 = r1.mo13965w()
            int r3 = com.google.ads.interactivemedia.p038v3.internal.C4375tq.m19003e(r3)
            int r4 = r1.mo13934C()
            long[] r5 = new long[r4]
            long[] r6 = new long[r4]
            r7 = 0
        L_0x06bb:
            if (r7 >= r4) goto L_0x06ed
            r9 = 1
            if (r3 != r9) goto L_0x06c5
            long r10 = r1.mo13936E()
            goto L_0x06c9
        L_0x06c5:
            long r10 = r1.mo13963u()
        L_0x06c9:
            r5[r7] = r10
            if (r3 != r9) goto L_0x06d2
            long r10 = r1.mo13967y()
            goto L_0x06d7
        L_0x06d2:
            int r10 = r1.mo13965w()
            long r10 = (long) r10
        L_0x06d7:
            r6[r7] = r10
            short r10 = r1.mo13960r()
            if (r10 != r9) goto L_0x06e5
            r1.mo13954l(r8)
            int r7 = r7 + 1
            goto L_0x06bb
        L_0x06e5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x06ed:
            android.util.Pair r1 = android.util.Pair.create(r5, r6)
        L_0x06f1:
            if (r1 == 0) goto L_0x0700
            java.lang.Object r3 = r1.first
            long[] r3 = (long[]) r3
            java.lang.Object r1 = r1.second
            long[] r1 = (long[]) r1
            r30 = r1
            r29 = r3
            goto L_0x0704
        L_0x0700:
            r29 = r31
            r30 = r29
        L_0x0704:
            com.google.ads.interactivemedia.v3.internal.ke r1 = r0.f18847b
            if (r1 != 0) goto L_0x070d
            r0 = r50
            r1 = r31
            goto L_0x073c
        L_0x070d:
            com.google.ads.interactivemedia.v3.internal.un r1 = new com.google.ads.interactivemedia.v3.internal.un
            int r17 = r23.f18858a
            r3 = r41
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            com.google.ads.interactivemedia.v3.internal.ke r5 = r0.f18847b
            int r6 = r0.f18849d
            com.google.ads.interactivemedia.v3.internal.uo[] r7 = r0.f18846a
            int r0 = r0.f18848c
            r16 = r1
            r18 = r20
            r19 = r3
            r21 = r38
            r23 = r26
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r0
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            r0 = r50
        L_0x073c:
            java.lang.Object r1 = r0.mo14245a(r1)
            if (r1 == 0) goto L_0x0d5e
            r3 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.ads.interactivemedia.v3.internal.to r2 = r2.mo16660d(r3)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r2)
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.ads.interactivemedia.v3.internal.to r2 = r2.mo16660d(r3)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r2)
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.ads.interactivemedia.v3.internal.to r2 = r2.mo16660d(r3)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r2)
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.ads.interactivemedia.v3.internal.tp r3 = r2.mo16659c(r3)
            if (r3 == 0) goto L_0x0774
            com.google.ads.interactivemedia.v3.internal.tu r4 = new com.google.ads.interactivemedia.v3.internal.tu
            r5 = r1
            com.google.ads.interactivemedia.v3.internal.un r5 = (com.google.ads.interactivemedia.p038v3.internal.C4399un) r5
            com.google.ads.interactivemedia.v3.internal.ke r5 = r5.f19048f
            r4.<init>(r3, r5)
            goto L_0x0782
        L_0x0774:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.ads.interactivemedia.v3.internal.tp r3 = r2.mo16659c(r3)
            if (r3 == 0) goto L_0x0d56
            com.google.ads.interactivemedia.v3.internal.tv r4 = new com.google.ads.interactivemedia.v3.internal.tv
            r4.<init>(r3)
        L_0x0782:
            int r3 = r4.mo16663a()
            if (r3 != 0) goto L_0x07a1
            com.google.ads.interactivemedia.v3.internal.uq r2 = new com.google.ads.interactivemedia.v3.internal.uq
            r3 = 0
            long[] r11 = new long[r3]
            int[] r12 = new int[r3]
            long[] r14 = new long[r3]
            int[] r15 = new int[r3]
            r10 = r1
            com.google.ads.interactivemedia.v3.internal.un r10 = (com.google.ads.interactivemedia.p038v3.internal.C4399un) r10
            r13 = 0
            r16 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x079d:
            r0 = r33
            goto L_0x0d52
        L_0x07a1:
            r5 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.ads.interactivemedia.v3.internal.tp r5 = r2.mo16659c(r5)
            if (r5 != 0) goto L_0x07b6
            r5 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.ads.interactivemedia.v3.internal.tp r5 = r2.mo16659c(r5)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r5)
            r6 = 1
            goto L_0x07b7
        L_0x07b6:
            r6 = 0
        L_0x07b7:
            com.google.ads.interactivemedia.v3.internal.alw r5 = r5.f18835a
            r7 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.ads.interactivemedia.v3.internal.tp r7 = r2.mo16659c(r7)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r7)
            com.google.ads.interactivemedia.v3.internal.alw r7 = r7.f18835a
            r9 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.ads.interactivemedia.v3.internal.tp r9 = r2.mo16659c(r9)
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r9)
            com.google.ads.interactivemedia.v3.internal.alw r9 = r9.f18835a
            r10 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.ads.interactivemedia.v3.internal.tp r10 = r2.mo16659c(r10)
            if (r10 == 0) goto L_0x07dd
            com.google.ads.interactivemedia.v3.internal.alw r10 = r10.f18835a
            goto L_0x07df
        L_0x07dd:
            r10 = r31
        L_0x07df:
            r11 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.ads.interactivemedia.v3.internal.tp r2 = r2.mo16659c(r11)
            if (r2 == 0) goto L_0x07eb
            com.google.ads.interactivemedia.v3.internal.alw r2 = r2.f18835a
            goto L_0x07ed
        L_0x07eb:
            r2 = r31
        L_0x07ed:
            com.google.ads.interactivemedia.v3.internal.tr r11 = new com.google.ads.interactivemedia.v3.internal.tr
            r11.<init>(r7, r5, r6)
            r5 = 12
            r9.mo13951i(r5)
            int r6 = r9.mo13934C()
            r7 = -1
            int r6 = r6 + r7
            int r12 = r9.mo13934C()
            int r13 = r9.mo13934C()
            if (r2 == 0) goto L_0x080f
            r2.mo13951i(r5)
            int r14 = r2.mo13934C()
            goto L_0x0810
        L_0x080f:
            r14 = 0
        L_0x0810:
            if (r10 == 0) goto L_0x0823
            r10.mo13951i(r5)
            int r5 = r10.mo13934C()
            if (r5 <= 0) goto L_0x0826
            int r15 = r10.mo13934C()
            int r15 = r15 + r7
            r31 = r10
            goto L_0x0827
        L_0x0823:
            r31 = r10
            r5 = 0
        L_0x0826:
            r15 = -1
        L_0x0827:
            int r10 = r4.mo16664b()
            com.google.ads.interactivemedia.v3.internal.un r1 = (com.google.ads.interactivemedia.p038v3.internal.C4399un) r1
            com.google.ads.interactivemedia.v3.internal.ke r8 = r1.f19048f
            java.lang.String r8 = r8.f17681l
            if (r10 == r7) goto L_0x08ec
            java.lang.String r7 = "audio/raw"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x084b
            java.lang.String r7 = "audio/g711-mlaw"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x084b
            java.lang.String r7 = "audio/g711-alaw"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x08ec
        L_0x084b:
            if (r6 != 0) goto L_0x08ec
            if (r14 != 0) goto L_0x08eb
            if (r5 != 0) goto L_0x08eb
            int r2 = r11.f18837a
            long[] r4 = new long[r2]
            int[] r5 = new int[r2]
        L_0x0857:
            boolean r6 = r11.mo16662a()
            if (r6 == 0) goto L_0x0868
            int r6 = r11.f18838b
            long r7 = r11.f18840d
            r4[r6] = r7
            int r7 = r11.f18839c
            r5[r6] = r7
            goto L_0x0857
        L_0x0868:
            long r6 = (long) r13
            r8 = 8192(0x2000, float:1.14794E-41)
            int r8 = r8 / r10
            r9 = 0
            r11 = 0
        L_0x086e:
            if (r9 >= r2) goto L_0x087a
            r12 = r5[r9]
            int r12 = com.google.ads.interactivemedia.p038v3.internal.amm.m14189F(r12, r8)
            int r11 = r11 + r12
            int r9 = r9 + 1
            goto L_0x086e
        L_0x087a:
            long[] r13 = new long[r11]
            int[] r14 = new int[r11]
            long[] r9 = new long[r11]
            int[] r11 = new int[r11]
            r0 = 0
            r12 = 0
            r15 = 0
            r16 = 0
        L_0x0887:
            if (r12 >= r2) goto L_0x08c8
            r17 = r5[r12]
            r18 = r4[r12]
            r43 = r17
            r17 = r2
            r2 = r43
        L_0x0893:
            if (r2 <= 0) goto L_0x08bf
            int r20 = java.lang.Math.min(r8, r2)
            r13[r16] = r18
            r21 = r4
            int r4 = r10 * r20
            r14[r16] = r4
            int r15 = java.lang.Math.max(r15, r4)
            r22 = r5
            long r4 = (long) r0
            long r4 = r4 * r6
            r9[r16] = r4
            r4 = 1
            r11[r16] = r4
            r4 = r14[r16]
            long r4 = (long) r4
            long r18 = r18 + r4
            int r0 = r0 + r20
            int r2 = r2 - r20
            int r16 = r16 + 1
            r4 = r21
            r5 = r22
            goto L_0x0893
        L_0x08bf:
            r21 = r4
            r22 = r5
            int r12 = r12 + 1
            r2 = r17
            goto L_0x0887
        L_0x08c8:
            com.google.ads.interactivemedia.v3.internal.tz r2 = new com.google.ads.interactivemedia.v3.internal.tz
            long r4 = (long) r0
            long r18 = r6 * r4
            r12 = r2
            r16 = r9
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
            long[] r0 = r2.f18866a
            int[] r4 = r2.f18867b
            int r5 = r2.f18868c
            long[] r6 = r2.f18869d
            int[] r7 = r2.f18870e
            long r8 = r2.f18871f
            r2 = r0
            r14 = r1
            r10 = r4
            r20 = r5
            r11 = r6
            r12 = r7
            r0 = r8
            goto L_0x0ab1
        L_0x08eb:
            r6 = 0
        L_0x08ec:
            long[] r0 = new long[r3]
            int[] r7 = new int[r3]
            long[] r8 = new long[r3]
            int[] r10 = new int[r3]
            r24 = r1
            r21 = r5
            r22 = r6
            r23 = r12
            r19 = r14
            r5 = r15
            r1 = 0
            r6 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r14 = r13
            r12 = 0
        L_0x090b:
            if (r6 >= r3) goto L_0x09e5
            r25 = r18
            r18 = 1
        L_0x0911:
            if (r25 != 0) goto L_0x0936
            boolean r18 = r11.mo16662a()
            if (r18 == 0) goto L_0x092e
            r26 = r14
            r27 = r15
            long r14 = r11.f18840d
            r28 = r3
            int r3 = r11.f18839c
            r25 = r3
            r16 = r14
            r14 = r26
            r15 = r27
            r3 = r28
            goto L_0x0911
        L_0x092e:
            r28 = r3
            r26 = r14
            r27 = r15
            r3 = 0
            goto L_0x093e
        L_0x0936:
            r28 = r3
            r26 = r14
            r27 = r15
            r3 = r25
        L_0x093e:
            if (r18 != 0) goto L_0x095c
            java.lang.String r3 = "AtomParsers"
            java.lang.String r4 = "Unexpected end of chunk data"
            android.util.Log.w(r3, r4)
            long[] r0 = java.util.Arrays.copyOf(r0, r6)
            int[] r7 = java.util.Arrays.copyOf(r7, r6)
            long[] r8 = java.util.Arrays.copyOf(r8, r6)
            int[] r10 = java.util.Arrays.copyOf(r10, r6)
            r3 = r6
            r15 = r27
            goto L_0x09ea
        L_0x095c:
            if (r2 == 0) goto L_0x0978
            r15 = r19
        L_0x0960:
            if (r20 != 0) goto L_0x0973
            if (r15 <= 0) goto L_0x096f
            int r20 = r2.mo13934C()
            int r27 = r2.mo13965w()
            int r15 = r15 + -1
            goto L_0x0960
        L_0x096f:
            r14 = -1
            r20 = 0
            goto L_0x0974
        L_0x0973:
            r14 = -1
        L_0x0974:
            int r20 = r20 + -1
            r19 = r15
        L_0x0978:
            r15 = r27
            r0[r6] = r16
            int r14 = r4.mo16665c()
            r7[r6] = r14
            if (r14 <= r1) goto L_0x0988
            r18 = r14
            r14 = r0
            goto L_0x098b
        L_0x0988:
            r14 = r0
            r18 = r1
        L_0x098b:
            long r0 = (long) r15
            long r0 = r0 + r12
            r8[r6] = r0
            if (r31 != 0) goto L_0x0993
            r0 = 1
            goto L_0x0994
        L_0x0993:
            r0 = 0
        L_0x0994:
            r10[r6] = r0
            if (r6 != r5) goto L_0x09ac
            r0 = 1
            r10[r6] = r0
            int r21 = r21 + -1
            if (r21 <= 0) goto L_0x09ac
            com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r31)
            int r0 = r31.mo13934C()
            r1 = -1
            int r0 = r0 + r1
            r1 = r0
            r25 = r4
            goto L_0x09af
        L_0x09ac:
            r25 = r4
            r1 = r5
        L_0x09af:
            r0 = r26
            long r4 = (long) r0
            long r12 = r12 + r4
            int r4 = r23 + -1
            if (r4 != 0) goto L_0x09ca
            if (r22 <= 0) goto L_0x09c7
            int r0 = r9.mo13934C()
            int r4 = r9.mo13965w()
            int r22 = r22 + -1
            r23 = r0
            r0 = r4
            goto L_0x09cc
        L_0x09c7:
            r23 = 0
            goto L_0x09cc
        L_0x09ca:
            r23 = r4
        L_0x09cc:
            r4 = r7[r6]
            long r4 = (long) r4
            long r16 = r16 + r4
            r4 = -1
            int r3 = r3 + r4
            int r6 = r6 + 1
            r5 = r1
            r1 = r18
            r4 = r25
            r18 = r3
            r3 = r28
            r43 = r14
            r14 = r0
            r0 = r43
            goto L_0x090b
        L_0x09e5:
            r14 = r0
            r28 = r3
            r25 = r18
        L_0x09ea:
            long r4 = (long) r15
            long r4 = r4 + r12
            if (r2 == 0) goto L_0x0a00
            r15 = r19
        L_0x09f0:
            if (r15 <= 0) goto L_0x0a00
            int r6 = r2.mo13934C()
            if (r6 == 0) goto L_0x09fa
            r6 = 0
            goto L_0x0a01
        L_0x09fa:
            r2.mo13965w()
            int r15 = r15 + -1
            goto L_0x09f0
        L_0x0a00:
            r6 = 1
        L_0x0a01:
            if (r21 != 0) goto L_0x0a48
            if (r23 != 0) goto L_0x0a3c
            if (r25 != 0) goto L_0x0a31
            if (r22 != 0) goto L_0x0a27
            if (r20 != 0) goto L_0x0a1e
            if (r6 != 0) goto L_0x0a16
            r14 = r24
            r2 = 0
            r6 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            goto L_0x0a54
        L_0x0a16:
            r16 = r0
            r17 = r1
            r14 = r24
            goto L_0x0aa9
        L_0x0a1e:
            r13 = r20
            r14 = r24
            r2 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            goto L_0x0a54
        L_0x0a27:
            r13 = r20
            r12 = r22
            r14 = r24
            r2 = 0
            r9 = 0
            r11 = 0
            goto L_0x0a54
        L_0x0a31:
            r13 = r20
            r12 = r22
            r14 = r24
            r11 = r25
            r2 = 0
            r9 = 0
            goto L_0x0a54
        L_0x0a3c:
            r13 = r20
            r12 = r22
            r9 = r23
            r14 = r24
            r11 = r25
            r2 = 0
            goto L_0x0a54
        L_0x0a48:
            r13 = r20
            r2 = r21
            r12 = r22
            r9 = r23
            r14 = r24
            r11 = r25
        L_0x0a54:
            int r15 = r14.f19043a
            r16 = r0
            r0 = 1
            if (r0 == r6) goto L_0x0a5e
            java.lang.String r0 = ", ctts invalid"
            goto L_0x0a60
        L_0x0a5e:
            java.lang.String r0 = ""
        L_0x0a60:
            int r6 = r0.length()
            r17 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r6 = r6 + 262
            r1.<init>(r6)
            java.lang.String r6 = "Inconsistent stbl box for track "
            r1.append(r6)
            r1.append(r15)
            java.lang.String r6 = ": remainingSynchronizationSamples "
            r1.append(r6)
            r1.append(r2)
            java.lang.String r2 = ", remainingSamplesAtTimestampDelta "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = ", remainingSamplesInChunk "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ", remainingTimestampDeltaChanges "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = ", remainingSamplesAtTimestampOffset "
            r1.append(r2)
            r1.append(r13)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "AtomParsers"
            android.util.Log.w(r1, r0)
        L_0x0aa9:
            r0 = r4
            r11 = r8
            r12 = r10
            r2 = r16
            r20 = r17
            r10 = r7
        L_0x0ab1:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r14.f19045c
            r4 = r0
            long r23 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r4, r6, r8)
            long[] r4 = r14.f19050h
            if (r4 != 0) goto L_0x0ad8
            long r0 = r14.f19045c
            com.google.ads.interactivemedia.p038v3.internal.amm.m14228ar(r11, r0)
            com.google.ads.interactivemedia.v3.internal.uq r0 = new com.google.ads.interactivemedia.v3.internal.uq
            r16 = r0
            r17 = r14
            r18 = r2
            r19 = r10
            r21 = r11
            r22 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
        L_0x0ad5:
            r2 = r0
            goto L_0x079d
        L_0x0ad8:
            int r4 = r4.length
            r5 = 1
            if (r4 != r5) goto L_0x0b96
            int r4 = r14.f19044b
            if (r4 != r5) goto L_0x0b96
            int r4 = r11.length
            r5 = 2
            if (r4 < r5) goto L_0x0b96
            long[] r5 = r14.f19051i
            java.lang.Object r5 = com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r5)
            long[] r5 = (long[]) r5
            r6 = 0
            r7 = r5[r6]
            long[] r5 = r14.f19050h
            r21 = r5[r6]
            r15 = r7
            long r6 = r14.f19045c
            long r8 = r14.f19046d
            r23 = r6
            r25 = r8
            long r5 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r21, r23, r25)
            long r7 = r15 + r5
            int r5 = r4 + -1
            r6 = 4
            r9 = 0
            int r6 = com.google.ads.interactivemedia.p038v3.internal.amm.m14191H(r6, r9, r5)
            int r4 = r4 + -4
            int r4 = com.google.ads.interactivemedia.p038v3.internal.amm.m14191H(r4, r9, r5)
            r17 = r11[r9]
            int r5 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r5 > 0) goto L_0x0b96
            r5 = r11[r6]
            int r13 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r13 >= 0) goto L_0x0b96
            r4 = r11[r4]
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0b96
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0b96
            r4 = r11[r9]
            long r21 = r15 - r4
            com.google.ads.interactivemedia.v3.internal.ke r4 = r14.f19048f
            int r4 = r4.f17695z
            long r4 = (long) r4
            r6 = r12
            long r12 = r14.f19045c
            r23 = r4
            r25 = r12
            long r4 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r21, r23, r25)
            long r21 = r0 - r7
            com.google.ads.interactivemedia.v3.internal.ke r7 = r14.f19048f
            int r7 = r7.f17695z
            long r7 = (long) r7
            long r12 = r14.f19045c
            r23 = r7
            r25 = r12
            long r7 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r21, r23, r25)
            r12 = 0
            int r9 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0b55
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0b93
        L_0x0b55:
            r15 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r9 > 0) goto L_0x0b93
            r15 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r9 > 0) goto L_0x0b93
            int r0 = (int) r4
            r4 = r45
            r4.f18526a = r0
            int r0 = (int) r7
            r4.f18527b = r0
            long r0 = r14.f19045c
            com.google.ads.interactivemedia.p038v3.internal.amm.m14228ar(r11, r0)
            long[] r0 = r14.f19050h
            r1 = 0
            r21 = r0[r1]
            long r0 = r14.f19046d
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r25 = r0
            long r23 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r21, r23, r25)
            com.google.ads.interactivemedia.v3.internal.uq r0 = new com.google.ads.interactivemedia.v3.internal.uq
            r16 = r0
            r17 = r14
            r18 = r2
            r19 = r10
            r21 = r11
            r22 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0ad5
        L_0x0b93:
            r4 = r45
            goto L_0x0b9b
        L_0x0b96:
            r4 = r45
            r6 = r12
            r12 = 0
        L_0x0b9b:
            long[] r5 = r14.f19050h
            int r7 = r5.length
            r8 = 1
            if (r7 != r8) goto L_0x0beb
            r8 = 0
            r15 = r5[r8]
            int r5 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0beb
            long[] r3 = r14.f19051i
            java.lang.Object r3 = com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r3)
            long[] r3 = (long[]) r3
            r12 = r3[r8]
            r3 = 0
        L_0x0bb3:
            int r5 = r11.length
            if (r3 >= r5) goto L_0x0bcb
            r15 = r11[r3]
            long r21 = r15 - r12
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r14.f19045c
            r25 = r8
            long r7 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r21, r23, r25)
            r11[r3] = r7
            int r3 = r3 + 1
            r8 = 0
            goto L_0x0bb3
        L_0x0bcb:
            long r7 = r14.f19045c
            long r21 = r0 - r12
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r25 = r7
            long r23 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r21, r23, r25)
            com.google.ads.interactivemedia.v3.internal.uq r0 = new com.google.ads.interactivemedia.v3.internal.uq
            r16 = r0
            r17 = r14
            r18 = r2
            r19 = r10
            r21 = r11
            r22 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0ad5
        L_0x0beb:
            int r0 = r14.f19044b
            r1 = 1
            if (r0 != r1) goto L_0x0bf2
            r0 = 1
            goto L_0x0bf3
        L_0x0bf2:
            r0 = 0
        L_0x0bf3:
            int[] r1 = new int[r7]
            int[] r5 = new int[r7]
            long[] r7 = r14.f19051i
            java.lang.Object r7 = com.google.ads.interactivemedia.p038v3.internal.aup.m14890u(r7)
            long[] r7 = (long[]) r7
            r8 = 0
            r9 = 0
            r15 = 0
            r16 = 0
        L_0x0c04:
            long[] r12 = r14.f19050h
            int r13 = r12.length
            if (r8 >= r13) goto L_0x0c65
            r13 = r2
            r17 = r3
            r2 = r7[r8]
            r18 = -1
            int r21 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r21 == 0) goto L_0x0c56
            r22 = r12[r8]
            r18 = r13
            long r12 = r14.f19045c
            r21 = r9
            r19 = r10
            long r9 = r14.f19046d
            r24 = r12
            r26 = r9
            long r9 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r22, r24, r26)
            r12 = 1
            int r13 = com.google.ads.interactivemedia.p038v3.internal.amm.m14223am(r11, r2, r12)
            r1[r8] = r13
            long r2 = r2 + r9
            int r2 = com.google.ads.interactivemedia.p038v3.internal.amm.m14220aj(r11, r2, r0)
            r5[r8] = r2
        L_0x0c36:
            r2 = r1[r8]
            r3 = r5[r8]
            if (r2 >= r3) goto L_0x0c47
            r9 = r6[r2]
            r9 = r9 & r12
            if (r9 != 0) goto L_0x0c47
            int r2 = r2 + 1
            r1[r8] = r2
            r12 = 1
            goto L_0x0c36
        L_0x0c47:
            int r9 = r3 - r2
            int r9 = r21 + r9
            if (r15 == r2) goto L_0x0c4f
            r2 = 1
            goto L_0x0c50
        L_0x0c4f:
            r2 = 0
        L_0x0c50:
            r2 = r16 | r2
            r16 = r2
            r15 = r3
            goto L_0x0c5c
        L_0x0c56:
            r21 = r9
            r19 = r10
            r18 = r13
        L_0x0c5c:
            int r8 = r8 + 1
            r3 = r17
            r2 = r18
            r10 = r19
            goto L_0x0c04
        L_0x0c65:
            r18 = r2
            r19 = r10
            if (r9 == r3) goto L_0x0c6d
            r0 = 1
            goto L_0x0c6e
        L_0x0c6d:
            r0 = 0
        L_0x0c6e:
            r0 = r16 | r0
            if (r0 == 0) goto L_0x0c75
            long[] r2 = new long[r9]
            goto L_0x0c77
        L_0x0c75:
            r2 = r18
        L_0x0c77:
            if (r0 == 0) goto L_0x0c7c
            int[] r3 = new int[r9]
            goto L_0x0c7e
        L_0x0c7c:
            r3 = r19
        L_0x0c7e:
            r7 = 1
            if (r7 != r0) goto L_0x0c83
            r10 = 0
            goto L_0x0c85
        L_0x0c83:
            r10 = r20
        L_0x0c85:
            if (r0 == 0) goto L_0x0c8a
            int[] r7 = new int[r9]
            goto L_0x0c8b
        L_0x0c8a:
            r7 = r6
        L_0x0c8b:
            long[] r8 = new long[r9]
            r15 = r10
            r9 = 0
            r12 = 0
            r13 = 0
        L_0x0c92:
            long[] r4 = r14.f19050h
            int r4 = r4.length
            if (r12 >= r4) goto L_0x0d2a
            long[] r4 = r14.f19051i
            r16 = r4[r12]
            r4 = r1[r12]
            r26 = r1
            r1 = r5[r12]
            if (r0 == 0) goto L_0x0cb7
            r27 = r5
            int r5 = r1 - r4
            r28 = r15
            r15 = r18
            java.lang.System.arraycopy(r15, r4, r2, r13, r5)
            r15 = r19
            java.lang.System.arraycopy(r15, r4, r3, r13, r5)
            java.lang.System.arraycopy(r6, r4, r7, r13, r5)
            goto L_0x0cbd
        L_0x0cb7:
            r27 = r5
            r28 = r15
            r15 = r19
        L_0x0cbd:
            r5 = r28
        L_0x0cbf:
            if (r4 >= r1) goto L_0x0d08
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r6
            r29 = r7
            long r6 = r14.f19046d
            r20 = r9
            r24 = r6
            long r6 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r20, r22, r24)
            r20 = r11[r4]
            r22 = r1
            r30 = r2
            long r1 = r20 - r16
            r20 = r9
            r9 = 0
            long r34 = java.lang.Math.max(r9, r1)
            r36 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r14.f19045c
            r38 = r1
            long r1 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r34, r36, r38)
            long r6 = r6 + r1
            r8[r13] = r6
            if (r0 == 0) goto L_0x0cf9
            r1 = r3[r13]
            if (r1 <= r5) goto L_0x0cf9
            r1 = r15[r4]
            r5 = r1
        L_0x0cf9:
            int r13 = r13 + 1
            int r4 = r4 + 1
            r6 = r19
            r9 = r20
            r1 = r22
            r7 = r29
            r2 = r30
            goto L_0x0cbf
        L_0x0d08:
            r30 = r2
            r19 = r6
            r29 = r7
            r20 = r9
            r9 = 0
            long[] r1 = r14.f19050h
            r6 = r1[r12]
            long r1 = r20 + r6
            int r12 = r12 + 1
            r9 = r1
            r6 = r19
            r1 = r26
            r7 = r29
            r2 = r30
            r19 = r15
            r15 = r5
            r5 = r27
            goto L_0x0c92
        L_0x0d2a:
            r30 = r2
            r29 = r7
            r20 = r9
            r28 = r15
            long r0 = r14.f19046d
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r24 = r0
            long r23 = com.google.ads.interactivemedia.p038v3.internal.amm.m14196M(r20, r22, r24)
            com.google.ads.interactivemedia.v3.internal.uq r2 = new com.google.ads.interactivemedia.v3.internal.uq
            r16 = r2
            r17 = r14
            r18 = r30
            r19 = r3
            r20 = r28
            r21 = r8
            r22 = r29
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x079d
        L_0x0d52:
            r0.add(r2)
            goto L_0x0d60
        L_0x0d56:
            com.google.ads.interactivemedia.v3.internal.lb r0 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0d5e:
            r0 = r33
        L_0x0d60:
            int r15 = r32 + 1
            r1 = r45
            r12 = r48
            r13 = r0
            r0 = r44
            goto L_0x000c
        L_0x0d6b:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4382tx.m19022d(com.google.ads.interactivemedia.v3.internal.to, com.google.ads.interactivemedia.v3.internal.rn, long, com.google.ads.interactivemedia.v3.internal.pz, boolean, com.google.ads.interactivemedia.v3.internal.arn):java.util.List");
    }

    /* renamed from: e */
    private static int m19023e(alw alw) {
        alw.mo13951i(16);
        return alw.mo13965w();
    }

    /* JADX WARNING: type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0319 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0137  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m19024f(com.google.ads.interactivemedia.p038v3.internal.alw r21, int r22, int r23, int r24, int r25, java.lang.String r26, boolean r27, com.google.ads.interactivemedia.p038v3.internal.C4276pz r28, com.google.ads.interactivemedia.p038v3.internal.C4378tt r29, int r30) throws com.google.ads.interactivemedia.p038v3.internal.C4144lb {
        /*
            r0 = r21
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r28
            r6 = r29
            int r7 = r1 + 16
            r0.mo13951i(r7)
            r7 = 6
            if (r27 == 0) goto L_0x001e
            int r9 = r21.mo13958p()
            r0.mo13954l(r7)
            goto L_0x0024
        L_0x001e:
            r9 = 8
            r0.mo13954l(r9)
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
            r0.mo13954l(r11)
            long r14 = r21.mo13967y()
            double r14 = java.lang.Double.longBitsToDouble(r14)
            long r14 = java.lang.Math.round(r14)
            int r7 = (int) r14
            int r9 = r21.mo13934C()
            r0.mo13954l(r10)
            goto L_0x005b
        L_0x0049:
            return
        L_0x004a:
            int r14 = r21.mo13958p()
            r0.mo13954l(r7)
            int r7 = r21.mo13932A()
            if (r9 != r13) goto L_0x005a
            r0.mo13954l(r11)
        L_0x005a:
            r9 = r14
        L_0x005b:
            int r11 = r21.mo13950h()
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r15 = r22
            if (r15 != r14) goto L_0x008e
            android.util.Pair r15 = m19026h(r0, r1, r2)
            if (r15 == 0) goto L_0x008a
            java.lang.Object r14 = r15.first
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r5 != 0) goto L_0x0078
            r5 = 0
            goto L_0x0082
        L_0x0078:
            java.lang.Object r10 = r15.second
            com.google.ads.interactivemedia.v3.internal.uo r10 = (com.google.ads.interactivemedia.p038v3.internal.C4400uo) r10
            java.lang.String r10 = r10.f19055b
            com.google.ads.interactivemedia.v3.internal.pz r5 = r5.mo16539b(r10)
        L_0x0082:
            com.google.ads.interactivemedia.v3.internal.uo[] r10 = r6.f18846a
            java.lang.Object r15 = r15.second
            com.google.ads.interactivemedia.v3.internal.uo r15 = (com.google.ads.interactivemedia.p038v3.internal.C4400uo) r15
            r10[r30] = r15
        L_0x008a:
            r0.mo13951i(r11)
            goto L_0x008f
        L_0x008e:
            r14 = r15
        L_0x008f:
            r10 = 1633889587(0x61632d33, float:2.6191674E20)
            r15 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r17 = "audio/raw"
            java.lang.String r8 = "audio/ac4"
            if (r14 != r10) goto L_0x00a0
            java.lang.String r17 = "audio/ac3"
        L_0x009d:
            r10 = -1
            goto L_0x012e
        L_0x00a0:
            r10 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r14 != r10) goto L_0x00a8
            java.lang.String r17 = "audio/eac3"
            goto L_0x009d
        L_0x00a8:
            r10 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r14 != r10) goto L_0x00b0
            r17 = r8
            goto L_0x009d
        L_0x00b0:
            r10 = 1685353315(0x64747363, float:1.803728E22)
            if (r14 != r10) goto L_0x00b8
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x009d
        L_0x00b8:
            r10 = 1685353320(0x64747368, float:1.8037286E22)
            if (r14 == r10) goto L_0x012a
            r10 = 1685353324(0x6474736c, float:1.803729E22)
            if (r14 != r10) goto L_0x00c4
            goto L_0x012a
        L_0x00c4:
            r10 = 1685353317(0x64747365, float:1.8037282E22)
            if (r14 != r10) goto L_0x00cc
            java.lang.String r17 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x009d
        L_0x00cc:
            r10 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r14 != r10) goto L_0x00d4
            java.lang.String r17 = "audio/3gpp"
            goto L_0x009d
        L_0x00d4:
            r10 = 1935767394(0x73617762, float:1.7863284E31)
            if (r14 != r10) goto L_0x00dc
            java.lang.String r17 = "audio/amr-wb"
            goto L_0x009d
        L_0x00dc:
            r10 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r14 == r10) goto L_0x0128
            r10 = 1936684916(0x736f7774, float:1.89725E31)
            if (r14 != r10) goto L_0x00e7
            goto L_0x0128
        L_0x00e7:
            r10 = 1953984371(0x74776f73, float:7.841539E31)
            if (r14 != r10) goto L_0x00ef
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012e
        L_0x00ef:
            r10 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r14 == r10) goto L_0x0124
            r10 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r14 != r10) goto L_0x00fa
            goto L_0x0124
        L_0x00fa:
            if (r14 != r15) goto L_0x00ff
            java.lang.String r17 = "audio/alac"
            goto L_0x009d
        L_0x00ff:
            r10 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r14 != r10) goto L_0x0107
            java.lang.String r17 = "audio/g711-alaw"
            goto L_0x009d
        L_0x0107:
            r10 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r14 != r10) goto L_0x010f
            java.lang.String r17 = "audio/g711-mlaw"
            goto L_0x009d
        L_0x010f:
            r10 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r14 != r10) goto L_0x0117
            java.lang.String r17 = "audio/opus"
            goto L_0x009d
        L_0x0117:
            r10 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r14 != r10) goto L_0x0120
            java.lang.String r17 = "audio/flac"
            goto L_0x009d
        L_0x0120:
            r10 = -1
            r17 = 0
            goto L_0x012e
        L_0x0124:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x009d
        L_0x0128:
            r10 = 2
            goto L_0x012e
        L_0x012a:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x009d
        L_0x012e:
            r12 = r17
            r14 = 0
            r19 = 0
        L_0x0133:
            int r15 = r11 - r1
            if (r15 >= r2) goto L_0x0313
            r0.mo13951i(r11)
            int r15 = r21.mo13965w()
            if (r15 <= 0) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r13 = 0
        L_0x0142:
            java.lang.String r1 = "childAtomSize should be positive"
            com.google.ads.interactivemedia.p038v3.internal.aup.m14888s(r13, r1)
            int r13 = r21.mo13965w()
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r13 == r2) goto L_0x02d8
            if (r27 == 0) goto L_0x0192
            r2 = 2002876005(0x77617665, float:4.5729223E33)
            if (r13 != r2) goto L_0x0192
            int r2 = r21.mo13950h()
        L_0x015b:
            int r13 = r2 - r11
            if (r13 >= r15) goto L_0x0185
            r0.mo13951i(r2)
            int r13 = r21.mo13965w()
            if (r13 <= 0) goto L_0x016c
            r17 = r10
            r10 = 1
            goto L_0x016f
        L_0x016c:
            r17 = r10
            r10 = 0
        L_0x016f:
            com.google.ads.interactivemedia.p038v3.internal.aup.m14888s(r10, r1)
            int r10 = r21.mo13965w()
            r20 = r1
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r10 == r1) goto L_0x0183
            int r2 = r2 + r13
            r10 = r17
            r1 = r20
            goto L_0x015b
        L_0x0183:
            r1 = -1
            goto L_0x0189
        L_0x0185:
            r17 = r10
            r1 = -1
            r2 = -1
        L_0x0189:
            r10 = 0
            r13 = 20
            r16 = 1
            r18 = 2
            goto L_0x02e3
        L_0x0192:
            r17 = r10
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r13 != r1) goto L_0x01ad
            int r1 = r11 + 8
            r0.mo13951i(r1)
            java.lang.String r1 = java.lang.Integer.toString(r25)
            com.google.ads.interactivemedia.v3.internal.ke r1 = com.google.ads.interactivemedia.p038v3.internal.C4207nk.m18270a(r0, r1, r4, r5)
            r6.f18847b = r1
        L_0x01a8:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0248
        L_0x01ad:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r13 != r1) goto L_0x01c2
            int r1 = r11 + 8
            r0.mo13951i(r1)
            java.lang.String r1 = java.lang.Integer.toString(r25)
            com.google.ads.interactivemedia.v3.internal.ke r1 = com.google.ads.interactivemedia.p038v3.internal.C4207nk.m18271b(r0, r1, r4, r5)
            r6.f18847b = r1
            goto L_0x01a8
        L_0x01c2:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r13 != r1) goto L_0x0206
            int r1 = r11 + 8
            r0.mo13951i(r1)
            java.lang.String r1 = java.lang.Integer.toString(r25)
            int r2 = com.google.ads.interactivemedia.p038v3.internal.C4209nm.f18086a
            r2 = 1
            r0.mo13954l(r2)
            int r10 = r21.mo13957o()
            r10 = r10 & 32
            int r10 = r10 >> 5
            if (r2 == r10) goto L_0x01e4
            r2 = 44100(0xac44, float:6.1797E-41)
            goto L_0x01e7
        L_0x01e4:
            r2 = 48000(0xbb80, float:6.7262E-41)
        L_0x01e7:
            com.google.ads.interactivemedia.v3.internal.kd r10 = new com.google.ads.interactivemedia.v3.internal.kd
            r10.<init>()
            r10.mo16107S(r1)
            r10.mo16120ae(r8)
            r1 = 2
            r10.mo16096H(r1)
            r10.mo16121af(r2)
            r10.mo16100L(r5)
            r10.mo16110V(r4)
            com.google.ads.interactivemedia.v3.internal.ke r1 = r10.mo16115a()
            r6.f18847b = r1
            goto L_0x01a8
        L_0x0206:
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r13 != r1) goto L_0x022a
            com.google.ads.interactivemedia.v3.internal.kd r1 = new com.google.ads.interactivemedia.v3.internal.kd
            r1.<init>()
            r1.mo16106R(r3)
            r1.mo16120ae(r12)
            r1.mo16096H(r9)
            r1.mo16121af(r7)
            r1.mo16100L(r5)
            r1.mo16110V(r4)
            com.google.ads.interactivemedia.v3.internal.ke r1 = r1.mo16115a()
            r6.f18847b = r1
            goto L_0x01a8
        L_0x022a:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r13 != r1) goto L_0x0251
            int r1 = r15 + -8
            byte[] r2 = f18861a
            int r10 = r2.length
            int r10 = r10 + r1
            byte[] r10 = java.util.Arrays.copyOf(r2, r10)
            int r13 = r11 + 8
            r0.mo13951i(r13)
            int r2 = r2.length
            r0.mo13956n(r10, r2, r1)
            java.util.List r1 = com.google.ads.interactivemedia.p038v3.internal.C4257pg.m18522a(r10)
            r19 = r1
        L_0x0248:
            r10 = 0
            r13 = 20
            r16 = 1
            r18 = 2
            goto L_0x0309
        L_0x0251:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r13 != r1) goto L_0x0286
            int r1 = r15 + -12
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r10 = 102(0x66, float:1.43E-43)
            r13 = 0
            r2[r13] = r10
            r10 = 76
            r16 = 1
            r2[r16] = r10
            r10 = 97
            r18 = 2
            r2[r18] = r10
            r10 = 3
            r13 = 67
            r2[r10] = r13
            int r10 = r11 + 12
            r0.mo13951i(r10)
            r10 = 4
            r0.mo13956n(r2, r10, r1)
            com.google.ads.interactivemedia.v3.internal.atz r1 = com.google.ads.interactivemedia.p038v3.internal.atz.m14808j(r2)
            r19 = r1
        L_0x0281:
            r10 = 0
            r13 = 20
            goto L_0x0309
        L_0x0286:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r18 = 2
            if (r13 != r1) goto L_0x0281
            int r2 = r15 + -12
            byte[] r7 = new byte[r2]
            int r9 = r11 + 12
            r0.mo13951i(r9)
            r10 = 0
            r0.mo13956n(r7, r10, r2)
            com.google.ads.interactivemedia.v3.internal.alw r2 = new com.google.ads.interactivemedia.v3.internal.alw
            r2.<init>((byte[]) r7)
            r9 = 9
            r2.mo13951i(r9)
            int r9 = r2.mo13957o()
            r13 = 20
            r2.mo13951i(r13)
            int r2 = r2.mo13934C()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r2 = android.util.Pair.create(r2, r9)
            java.lang.Object r9 = r2.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.ads.interactivemedia.v3.internal.atz r7 = com.google.ads.interactivemedia.p038v3.internal.atz.m14808j(r7)
            r19 = r7
            r7 = r9
            r9 = r2
            goto L_0x0309
        L_0x02d8:
            r17 = r10
            r10 = 0
            r13 = 20
            r16 = 1
            r18 = 2
            r2 = r11
            r1 = -1
        L_0x02e3:
            if (r2 == r1) goto L_0x0309
            android.util.Pair r2 = m19025g(r0, r2)
            java.lang.Object r12 = r2.first
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r2.second
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L_0x0309
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0305
            com.google.ads.interactivemedia.v3.internal.nh r1 = com.google.ads.interactivemedia.p038v3.internal.C4205ni.m18265a(r2)
            int r7 = r1.f18065a
            int r9 = r1.f18066b
            java.lang.String r14 = r1.f18067c
        L_0x0305:
            com.google.ads.interactivemedia.v3.internal.atz r19 = com.google.ads.interactivemedia.p038v3.internal.atz.m14808j(r2)
        L_0x0309:
            int r11 = r11 + r15
            r1 = r23
            r2 = r24
            r10 = r17
            r13 = 1
            goto L_0x0133
        L_0x0313:
            r17 = r10
            com.google.ads.interactivemedia.v3.internal.ke r0 = r6.f18847b
            if (r0 != 0) goto L_0x0345
            if (r12 == 0) goto L_0x0345
            com.google.ads.interactivemedia.v3.internal.kd r0 = new com.google.ads.interactivemedia.v3.internal.kd
            r0.<init>()
            r0.mo16106R(r3)
            r0.mo16120ae(r12)
            r0.mo16097I(r14)
            r0.mo16096H(r9)
            r0.mo16121af(r7)
            r12 = r17
            r0.mo16113Y(r12)
            r1 = r19
            r0.mo16108T(r1)
            r0.mo16100L(r5)
            r0.mo16110V(r4)
            com.google.ads.interactivemedia.v3.internal.ke r0 = r0.mo16115a()
            r6.f18847b = r0
        L_0x0345:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4382tx.m19024f(com.google.ads.interactivemedia.v3.internal.alw, int, int, int, int, java.lang.String, boolean, com.google.ads.interactivemedia.v3.internal.pz, com.google.ads.interactivemedia.v3.internal.tt, int):void");
    }

    /* renamed from: g */
    private static Pair<String, byte[]> m19025g(alw alw, int i) {
        alw.mo13951i(i + 12);
        alw.mo13954l(1);
        m19027i(alw);
        alw.mo13954l(2);
        int o = alw.mo13957o();
        if ((o & 128) != 0) {
            alw.mo13954l(2);
        }
        if ((o & 64) != 0) {
            alw.mo13954l(alw.mo13958p());
        }
        if ((o & 32) != 0) {
            alw.mo13954l(2);
        }
        alw.mo13954l(1);
        m19027i(alw);
        String k = aln.m14041k(alw.mo13957o());
        if (MimeTypes.AUDIO_MPEG.equals(k) || MimeTypes.AUDIO_DTS.equals(k) || MimeTypes.AUDIO_DTS_HD.equals(k)) {
            return Pair.create(k, (Object) null);
        }
        alw.mo13954l(12);
        alw.mo13954l(1);
        int i2 = m19027i(alw);
        byte[] bArr = new byte[i2];
        alw.mo13956n(bArr, 0, i2);
        return Pair.create(k, bArr);
    }

    /* renamed from: h */
    private static Pair<Integer, C4400uo> m19026h(alw alw, int i, int i2) {
        Pair<Integer, C4400uo> pair;
        Integer num;
        C4400uo uoVar;
        int i3;
        int i4;
        byte[] bArr;
        alw alw2 = alw;
        int h = alw.mo13950h();
        while (h - i < i2) {
            alw2.mo13951i(h);
            int w = alw.mo13965w();
            aup.m14888s(w > 0, "childAtomSize should be positive");
            if (alw.mo13965w() == 1936289382) {
                int i5 = h + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - h < w) {
                    alw2.mo13951i(i5);
                    int w2 = alw.mo13965w();
                    int w3 = alw.mo13965w();
                    if (w3 == 1718775137) {
                        num2 = Integer.valueOf(alw.mo13965w());
                    } else if (w3 == 1935894637) {
                        alw2.mo13954l(4);
                        str = alw2.mo13937F(4);
                    } else if (w3 == 1935894633) {
                        i6 = i5;
                        i7 = w2;
                    }
                    i5 += w2;
                }
                if (C6540C.CENC_TYPE_cenc.equals(str) || C6540C.CENC_TYPE_cbc1.equals(str) || C6540C.CENC_TYPE_cens.equals(str) || C6540C.CENC_TYPE_cbcs.equals(str)) {
                    aup.m14892w(num2, "frma atom is mandatory");
                    aup.m14888s(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            uoVar = null;
                            break;
                        }
                        alw2.mo13951i(i8);
                        int w4 = alw.mo13965w();
                        if (alw.mo13965w() == 1952804451) {
                            int w5 = alw.mo13965w();
                            alw2.mo13954l(1);
                            if (C4375tq.m19003e(w5) == 0) {
                                alw2.mo13954l(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int o = alw.mo13957o();
                                i4 = o & 15;
                                i3 = (o & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            boolean z = alw.mo13957o() == 1;
                            int o2 = alw.mo13957o();
                            byte[] bArr2 = new byte[16];
                            alw2.mo13956n(bArr2, 0, 16);
                            if (!z || o2 != 0) {
                                bArr = null;
                            } else {
                                int o3 = alw.mo13957o();
                                byte[] bArr3 = new byte[o3];
                                alw2.mo13956n(bArr3, 0, o3);
                                bArr = bArr3;
                            }
                            num = num2;
                            uoVar = new C4400uo(z, str, o2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i8 += w4;
                        }
                    }
                    aup.m14892w(uoVar, "tenc atom is mandatory");
                    pair = Pair.create(num, uoVar);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            h += w;
        }
        return null;
    }

    /* renamed from: i */
    private static int m19027i(alw alw) {
        int o = alw.mo13957o();
        int i = o & 127;
        while ((o & 128) == 128) {
            o = alw.mo13957o();
            i = (i << 7) | (o & 127);
        }
        return i;
    }
}
