package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zi */
/* compiled from: IMASDK */
public final class C4529zi extends C4508yo {

    /* renamed from: a */
    public static final C4527zg f19751a = C4526zf.f19747a;

    /* renamed from: b */
    private final C4527zg f19752b;

    public C4529zi() {
        this((C4527zg) null);
    }

    public C4529zi(C4527zg zgVar) {
        this.f19752b = zgVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x008a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m19629d(com.google.ads.interactivemedia.p038v3.internal.alw r19, int r20, int r21, boolean r22) {
        /*
            r1 = r19
            r0 = r20
            int r2 = r19.mo13950h()
        L_0x0008:
            int r3 = r19.mo13947e()     // Catch:{ all -> 0x00ae }
            r4 = 1
            r5 = r21
            if (r3 < r5) goto L_0x00aa
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r19.mo13965w()     // Catch:{ all -> 0x00ae }
            long r8 = r19.mo13963u()     // Catch:{ all -> 0x00ae }
            int r10 = r19.mo13958p()     // Catch:{ all -> 0x00ae }
            goto L_0x002c
        L_0x0022:
            int r7 = r19.mo13961s()     // Catch:{ all -> 0x00ae }
            int r8 = r19.mo13961s()     // Catch:{ all -> 0x00ae }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003b
            if (r10 == 0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            r1.mo13951i(r2)
            return r4
        L_0x003b:
            r7 = 4
            if (r0 != r7) goto L_0x006a
            if (r22 != 0) goto L_0x006a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004c
            r1.mo13951i(r2)
            return r6
        L_0x004c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r11 = r11 & r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 24
            long r8 = r8 >> r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L_0x006a:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            r3 = r10 & 1
            r18 = r4
            r4 = r3
            r3 = r18
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0088:
            r3 = 0
        L_0x0089:
            r4 = 0
        L_0x008a:
            if (r4 == 0) goto L_0x008e
            int r3 = r3 + 4
        L_0x008e:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
            r1.mo13951i(r2)
            return r6
        L_0x0097:
            int r3 = r19.mo13947e()     // Catch:{ all -> 0x00ae }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a4
            r1.mo13951i(r2)
            return r6
        L_0x00a4:
            int r3 = (int) r8
            r1.mo13954l(r3)     // Catch:{ all -> 0x00ae }
            goto L_0x0008
        L_0x00aa:
            r1.mo13951i(r2)
            return r4
        L_0x00ae:
            r0 = move-exception
            r1.mo13951i(r2)
            goto L_0x00b4
        L_0x00b3:
            throw r0
        L_0x00b4:
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4529zi.m19629d(com.google.ads.interactivemedia.v3.internal.alw, int, int, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v17, types: [com.google.ads.interactivemedia.v3.internal.zd] */
    /* JADX WARNING: type inference failed for: r3v20, types: [com.google.ads.interactivemedia.v3.internal.yy] */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x026e, code lost:
        if (r9 == 67) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0300, code lost:
        r2 = "Id3Decoder";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x054d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x054e, code lost:
        r14 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0551, code lost:
        r2 = r20;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:121:0x0220, B:140:0x028a] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0498 A[Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0506 A[Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x051e A[Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x054d A[ExcHandler: all (th java.lang.Throwable), PHI: r22 
      PHI: (r22v1 int) = (r22v2 int), (r22v2 int), (r22v5 int), (r22v6 int) binds: [B:233:0x0549, B:234:?, B:140:0x028a, B:121:0x0220] A[DONT_GENERATE, DONT_INLINE], Splitter:B:121:0x0220] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.ads.interactivemedia.p038v3.internal.C4530zj m19630e(int r34, com.google.ads.interactivemedia.p038v3.internal.alw r35, boolean r36, int r37, com.google.ads.interactivemedia.p038v3.internal.C4527zg r38) {
        /*
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            int r4 = r35.mo13957o()
            int r5 = r35.mo13957o()
            int r6 = r35.mo13957o()
            r7 = 3
            if (r0 < r7) goto L_0x001c
            int r9 = r35.mo13957o()
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            r10 = 4
            if (r0 != r10) goto L_0x003c
            int r11 = r35.mo13934C()
            if (r2 != 0) goto L_0x0047
            r12 = r11 & 255(0xff, float:3.57E-43)
            int r13 = r11 >> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 7
            r12 = r12 | r13
            int r13 = r11 >> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 14
            r12 = r12 | r13
            int r11 = r11 >> 24
            int r11 = r11 << 21
            r11 = r11 | r12
            goto L_0x0047
        L_0x003c:
            if (r0 != r7) goto L_0x0043
            int r11 = r35.mo13934C()
            goto L_0x0047
        L_0x0043:
            int r11 = r35.mo13961s()
        L_0x0047:
            if (r0 < r7) goto L_0x004e
            int r12 = r35.mo13958p()
            goto L_0x004f
        L_0x004e:
            r12 = 0
        L_0x004f:
            r13 = 0
            if (r4 != 0) goto L_0x0065
            if (r5 != 0) goto L_0x0065
            if (r6 != 0) goto L_0x0065
            if (r9 != 0) goto L_0x0065
            if (r11 != 0) goto L_0x0065
            if (r12 == 0) goto L_0x005d
            goto L_0x0065
        L_0x005d:
            int r0 = r35.mo13948f()
            r1.mo13951i(r0)
            return r13
        L_0x0065:
            int r14 = r35.mo13950h()
            int r14 = r14 + r11
            int r15 = r35.mo13948f()
            java.lang.String r8 = "Id3Decoder"
            if (r14 <= r15) goto L_0x007f
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r8, r0)
            int r0 = r35.mo13948f()
            r1.mo13951i(r0)
            return r13
        L_0x007f:
            if (r38 != 0) goto L_0x0575
            r15 = 1
            if (r0 != r7) goto L_0x00a2
            r7 = r12 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x008a
            r7 = 1
            goto L_0x008b
        L_0x008a:
            r7 = 0
        L_0x008b:
            r17 = r12 & 64
            if (r17 == 0) goto L_0x0092
            r17 = 1
            goto L_0x0094
        L_0x0092:
            r17 = 0
        L_0x0094:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x009a
            r12 = 1
            goto L_0x009b
        L_0x009a:
            r12 = 0
        L_0x009b:
            r18 = r17
            r19 = 0
            r17 = r7
            goto L_0x00d5
        L_0x00a2:
            if (r0 != r10) goto L_0x00cd
            r7 = r12 & 64
            if (r7 == 0) goto L_0x00aa
            r7 = 1
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            r17 = r12 & 8
            if (r17 == 0) goto L_0x00b2
            r17 = 1
            goto L_0x00b4
        L_0x00b2:
            r17 = 0
        L_0x00b4:
            r18 = r12 & 4
            if (r18 == 0) goto L_0x00bb
            r18 = 1
            goto L_0x00bd
        L_0x00bb:
            r18 = 0
        L_0x00bd:
            r19 = r12 & 2
            if (r19 == 0) goto L_0x00c4
            r19 = 1
            goto L_0x00c6
        L_0x00c4:
            r19 = 0
        L_0x00c6:
            r12 = r12 & r15
            r33 = r12
            r12 = r7
            r7 = r33
            goto L_0x00d5
        L_0x00cd:
            r7 = 0
            r12 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x00d5:
            if (r17 != 0) goto L_0x056a
            if (r18 == 0) goto L_0x00db
            goto L_0x056a
        L_0x00db:
            if (r12 == 0) goto L_0x00e2
            int r11 = r11 + -1
            r1.mo13954l(r15)
        L_0x00e2:
            if (r7 == 0) goto L_0x00e9
            int r11 = r11 + -4
            r1.mo13954l(r10)
        L_0x00e9:
            if (r19 == 0) goto L_0x00ef
            int r11 = m19631f(r1, r11)
        L_0x00ef:
            r7 = 84
            r12 = 88
            r10 = 2
            if (r4 != r7) goto L_0x012f
            if (r5 != r12) goto L_0x012f
            if (r6 != r12) goto L_0x012f
            if (r0 == r10) goto L_0x00fe
            if (r9 != r12) goto L_0x012f
        L_0x00fe:
            if (r11 > 0) goto L_0x0101
            goto L_0x0137
        L_0x0101:
            int r2 = r35.mo13957o()     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r3 = m19632g(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r12 = 0
            r1.mo13956n(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = m19634i(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r15.<init>(r10, r12, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r12 = m19636k(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = r7 + r12
            int r2 = m19634i(r10, r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r2 = m19638m(r10, r7, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            com.google.ads.interactivemedia.v3.internal.zn r3 = new com.google.ads.interactivemedia.v3.internal.zn     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r7 = "TXXX"
            r3.<init>(r7, r15, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            goto L_0x0160
        L_0x012f:
            if (r4 != r7) goto L_0x0168
            java.lang.String r2 = m19633h(r0, r7, r5, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            if (r11 > 0) goto L_0x0142
        L_0x0137:
            r23 = r4
            r3 = r5
            r4 = r6
            r20 = r8
            r8 = r9
            r22 = r14
            goto L_0x051c
        L_0x0142:
            int r3 = r35.mo13957o()     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r7 = m19632g(r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r10 = r11 + -1
            byte[] r12 = new byte[r10]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r15 = 0
            r1.mo13956n(r12, r15, r10)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r3 = m19634i(r12, r15, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r10.<init>(r12, r15, r3, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            com.google.ads.interactivemedia.v3.internal.zn r3 = new com.google.ads.interactivemedia.v3.internal.zn     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r3.<init>(r2, r13, r10)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
        L_0x0160:
            r13 = r3
            goto L_0x0137
        L_0x0162:
            r0 = move-exception
            goto L_0x0566
        L_0x0165:
            r2 = r8
            goto L_0x055c
        L_0x0168:
            r7 = 87
            java.lang.String r15 = "ISO-8859-1"
            if (r4 != r7) goto L_0x01aa
            if (r5 != r12) goto L_0x01a7
            if (r6 != r12) goto L_0x01a7
            if (r0 == r10) goto L_0x0176
            if (r9 != r12) goto L_0x01a7
        L_0x0176:
            if (r11 > 0) goto L_0x0179
            goto L_0x0137
        L_0x0179:
            int r2 = r35.mo13957o()     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r3 = m19632g(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r12 = 0
            r1.mo13956n(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = m19634i(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r13.<init>(r10, r12, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r2 = m19636k(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = r7 + r2
            int r2 = m19635j(r10, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r2 = m19638m(r10, r7, r2, r15)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            com.google.ads.interactivemedia.v3.internal.zo r3 = new com.google.ads.interactivemedia.v3.internal.zo     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r7 = "WXXX"
            r3.<init>(r7, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            goto L_0x0160
        L_0x01a7:
            r12 = 87
            goto L_0x01ab
        L_0x01aa:
            r12 = r4
        L_0x01ab:
            if (r12 != r7) goto L_0x01c7
            java.lang.String r2 = m19633h(r0, r7, r5, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            byte[] r3 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r7 = 0
            r1.mo13956n(r3, r7, r11)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r10 = m19635j(r3, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r12.<init>(r3, r7, r10, r15)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            com.google.ads.interactivemedia.v3.internal.zo r3 = new com.google.ads.interactivemedia.v3.internal.zo     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r7 = 0
            r3.<init>(r2, r7, r12)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            goto L_0x0160
        L_0x01c7:
            r7 = 73
            r13 = 80
            if (r12 != r13) goto L_0x01f5
            r12 = 82
            if (r5 != r12) goto L_0x01f3
            if (r6 != r7) goto L_0x01f3
            r12 = 86
            if (r9 != r12) goto L_0x01f3
            byte[] r2 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r3 = 0
            r1.mo13956n(r2, r3, r11)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = m19635j(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r10.<init>(r2, r3, r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r3 = 1
            int r7 = r7 + r3
            byte[] r2 = m19637l(r2, r7, r11)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            com.google.ads.interactivemedia.v3.internal.zm r3 = new com.google.ads.interactivemedia.v3.internal.zm     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r3.<init>(r10, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            goto L_0x0160
        L_0x01f3:
            r12 = 80
        L_0x01f5:
            r7 = 71
            r13 = 79
            if (r12 != r7) goto L_0x0251
            r7 = 69
            if (r5 != r7) goto L_0x0251
            if (r6 != r13) goto L_0x0251
            r7 = 66
            if (r9 == r7) goto L_0x0207
            if (r0 != r10) goto L_0x0251
        L_0x0207:
            int r2 = r35.mo13957o()     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r3 = m19632g(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r12 = 0
            r1.mo13956n(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r13 = m19635j(r10, r12)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r22 = r14
            r14 = 0
            r12.<init>(r10, r14, r13, r15)     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            r14 = 1
            int r13 = r13 + r14
            int r14 = m19634i(r10, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            java.lang.String r13 = m19638m(r10, r13, r14, r3)     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            int r15 = m19636k(r2)     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            int r14 = r14 + r15
            int r15 = m19634i(r10, r14, r2)     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            java.lang.String r3 = m19638m(r10, r14, r15, r3)     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            int r2 = m19636k(r2)     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            int r15 = r15 + r2
            byte[] r2 = m19637l(r10, r15, r7)     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            com.google.ads.interactivemedia.v3.internal.ze r7 = new com.google.ads.interactivemedia.v3.internal.ze     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            r7.<init>(r12, r13, r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            r23 = r4
            r3 = r5
            r4 = r6
            r13 = r7
            r20 = r8
            goto L_0x0358
        L_0x0251:
            r22 = r14
            r7 = 65
            r14 = 67
            if (r0 != r10) goto L_0x0264
            r13 = 80
            if (r12 != r13) goto L_0x0303
            r10 = 73
            if (r5 != r10) goto L_0x0303
            if (r6 != r14) goto L_0x0303
            goto L_0x0270
        L_0x0264:
            r10 = 73
            r13 = 80
            if (r12 != r7) goto L_0x0303
            if (r5 != r13) goto L_0x0303
            if (r6 != r10) goto L_0x0303
            if (r9 != r14) goto L_0x0303
        L_0x0270:
            int r2 = r35.mo13957o()     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            java.lang.String r3 = m19632g(r2)     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            r12 = 0
            r1.mo13956n(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            r13 = 2
            if (r0 != r13) goto L_0x02b1
            java.lang.String r13 = "image/"
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0300, all -> 0x054d }
            r20 = r8
            r8 = 3
            r14.<init>(r10, r12, r8, r15)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r8 = com.google.ads.interactivemedia.p038v3.internal.amm.m14186C(r14)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r12 = r8.length()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            if (r12 == 0) goto L_0x02a0
            java.lang.String r8 = r13.concat(r8)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            goto L_0x02a5
        L_0x02a0:
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r8.<init>(r13)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
        L_0x02a5:
            java.lang.String r12 = "image/jpg"
            boolean r12 = r12.equals(r8)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            if (r12 == 0) goto L_0x02af
            java.lang.String r8 = "image/jpeg"
        L_0x02af:
            r12 = 2
            goto L_0x02dc
        L_0x02b1:
            r20 = r8
            r8 = 0
            int r12 = m19635j(r10, r8)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r13.<init>(r10, r8, r12, r15)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r8 = com.google.ads.interactivemedia.p038v3.internal.amm.m14186C(r13)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r13 = 47
            int r13 = r8.indexOf(r13)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r14 = -1
            if (r13 != r14) goto L_0x02dc
            java.lang.String r13 = "image/"
            int r14 = r8.length()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            if (r14 == 0) goto L_0x02d7
            java.lang.String r8 = r13.concat(r8)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            goto L_0x02dc
        L_0x02d7:
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r8.<init>(r13)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
        L_0x02dc:
            int r13 = r12 + 1
            byte r13 = r10[r13]     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r13 = r13 & 255(0xff, float:3.57E-43)
            r14 = 2
            int r12 = r12 + r14
            int r14 = m19634i(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r23 = r4
            int r4 = r14 - r12
            r15.<init>(r10, r12, r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r2 = m19636k(r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r14 = r14 + r2
            byte[] r2 = m19637l(r10, r14, r7)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            com.google.ads.interactivemedia.v3.internal.yy r3 = new com.google.ads.interactivemedia.v3.internal.yy     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r3.<init>(r8, r15, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            goto L_0x0355
        L_0x0300:
            r2 = r8
            goto L_0x0553
        L_0x0303:
            r23 = r4
            r20 = r8
            r4 = 77
            if (r12 != r14) goto L_0x035b
            r8 = 79
            if (r5 != r8) goto L_0x035b
            if (r6 != r4) goto L_0x035b
            if (r9 == r4) goto L_0x0316
            r8 = 2
            if (r0 != r8) goto L_0x035b
        L_0x0316:
            r2 = 4
            if (r11 >= r2) goto L_0x031f
            r3 = r5
            r4 = r6
            r8 = r9
            r13 = 0
            goto L_0x051c
        L_0x031f:
            int r2 = r35.mo13957o()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r3 = m19632g(r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r4 = 3
            byte[] r7 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r8 = 0
            r1.mo13956n(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r10.<init>(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r4 = r11 + -4
            byte[] r7 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r1.mo13956n(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r4 = m19634i(r7, r8, r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r12.<init>(r7, r8, r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r8 = m19636k(r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r4 = r4 + r8
            int r2 = m19634i(r7, r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r2 = m19638m(r7, r4, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            com.google.ads.interactivemedia.v3.internal.zd r3 = new com.google.ads.interactivemedia.v3.internal.zd     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r3.<init>(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
        L_0x0355:
            r13 = r3
            r3 = r5
            r4 = r6
        L_0x0358:
            r8 = r9
            goto L_0x051c
        L_0x035b:
            if (r12 != r14) goto L_0x03da
            r8 = 72
            if (r5 != r8) goto L_0x03da
            if (r6 != r7) goto L_0x03da
            r7 = 80
            if (r9 != r7) goto L_0x03da
            int r4 = r35.mo13950h()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            byte[] r7 = r35.mo13952j()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r7 = m19635j(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            byte[] r10 = r35.mo13952j()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r12 = r7 - r4
            r8.<init>(r10, r4, r12, r15)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r10 = 1
            int r7 = r7 + r10
            r1.mo13951i(r7)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r26 = r35.mo13965w()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r27 = r35.mo13965w()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            long r12 = r35.mo13963u()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x039a
            r12 = -1
        L_0x039a:
            r28 = r12
            long r12 = r35.mo13963u()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x03ab
            r12 = -1
        L_0x03ab:
            r30 = r12
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r7.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r4 = r4 + r11
        L_0x03b3:
            int r10 = r35.mo13950h()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            if (r10 >= r4) goto L_0x03c4
            r10 = 0
            com.google.ads.interactivemedia.v3.internal.zj r12 = m19630e(r0, r1, r2, r3, r10)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            if (r12 == 0) goto L_0x03b3
            r7.add(r12)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            goto L_0x03b3
        L_0x03c4:
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.zj[] r2 = new com.google.ads.interactivemedia.p038v3.internal.C4530zj[r2]     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.Object[] r2 = r7.toArray(r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r32 = r2
            com.google.ads.interactivemedia.v3.internal.zj[] r32 = (com.google.ads.interactivemedia.p038v3.internal.C4530zj[]) r32     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            com.google.ads.interactivemedia.v3.internal.zb r3 = new com.google.ads.interactivemedia.v3.internal.zb     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r24 = r3
            r25 = r8
            r24.<init>(r25, r26, r27, r28, r30, r32)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            goto L_0x0355
        L_0x03da:
            if (r12 != r14) goto L_0x0490
            r7 = 84
            if (r5 != r7) goto L_0x0490
            r7 = 79
            if (r6 != r7) goto L_0x0490
            if (r9 != r14) goto L_0x0490
            int r4 = r35.mo13950h()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            byte[] r7 = r35.mo13952j()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r7 = m19635j(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            byte[] r10 = r35.mo13952j()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r12 = r7 - r4
            r8.<init>(r10, r4, r12, r15)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r10 = 1
            int r7 = r7 + r10
            r1.mo13951i(r7)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r7 = r35.mo13957o()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r10 = r7 & 2
            if (r10 == 0) goto L_0x040e
            r10 = 1
            r26 = 1
            goto L_0x0411
        L_0x040e:
            r10 = 1
            r26 = 0
        L_0x0411:
            r7 = r7 & r10
            int r10 = r35.mo13957o()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String[] r12 = new java.lang.String[r10]     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r13 = 0
        L_0x0419:
            if (r13 >= r10) goto L_0x044c
            int r14 = r35.mo13950h()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r38 = r10
            byte[] r10 = r35.mo13952j()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r10 = m19635j(r10, r14)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r16 = r9
            java.lang.String r9 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r17 = r6
            byte[] r6 = r35.mo13952j()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r21 = r5
            int r5 = r10 - r14
            r9.<init>(r6, r14, r5, r15)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r12[r13] = r9     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r10 = r10 + 1
            r1.mo13951i(r10)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r13 = r13 + 1
            r10 = r38
            r9 = r16
            r6 = r17
            r5 = r21
            goto L_0x0419
        L_0x044c:
            r21 = r5
            r17 = r6
            r16 = r9
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r5.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r4 = r4 + r11
        L_0x0458:
            int r6 = r35.mo13950h()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            if (r6 >= r4) goto L_0x0469
            r6 = 0
            com.google.ads.interactivemedia.v3.internal.zj r9 = m19630e(r0, r1, r2, r3, r6)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            if (r9 == 0) goto L_0x0458
            r5.add(r9)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            goto L_0x0458
        L_0x0469:
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.zj[] r3 = new com.google.ads.interactivemedia.p038v3.internal.C4530zj[r2]     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.Object[] r2 = r5.toArray(r3)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r29 = r2
            com.google.ads.interactivemedia.v3.internal.zj[] r29 = (com.google.ads.interactivemedia.p038v3.internal.C4530zj[]) r29     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            com.google.ads.interactivemedia.v3.internal.zc r3 = new com.google.ads.interactivemedia.v3.internal.zc     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r2 = 1
            if (r2 == r7) goto L_0x047c
            r27 = 0
            goto L_0x047e
        L_0x047c:
            r27 = 1
        L_0x047e:
            r24 = r3
            r25 = r8
            r28 = r12
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r13 = r3
            r8 = r16
            r4 = r17
            r3 = r21
            goto L_0x051c
        L_0x0490:
            r21 = r5
            r17 = r6
            r16 = r9
            if (r12 != r4) goto L_0x0506
            r2 = 76
            r3 = r21
            if (r3 != r2) goto L_0x0501
            r2 = 76
            r4 = r17
            r8 = r16
            if (r4 != r2) goto L_0x050c
            r2 = 84
            if (r8 != r2) goto L_0x050c
            int r25 = r35.mo13958p()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r26 = r35.mo13961s()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r27 = r35.mo13961s()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r2 = r35.mo13957o()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r5 = r35.mo13957o()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            com.google.ads.interactivemedia.v3.internal.alv r6 = new com.google.ads.interactivemedia.v3.internal.alv     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r6.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            byte[] r7 = r35.mo13952j()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r9 = r35.mo13948f()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r6.mo13920b(r7, r9)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r7 = r35.mo13950h()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r7 = r7 * 8
            r6.mo13923e(r7)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r7 = r11 + -10
            int r7 = r7 * 8
            int r9 = r2 + r5
            int r7 = r7 / r9
            int[] r9 = new int[r7]     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int[] r10 = new int[r7]     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r12 = 0
        L_0x04e3:
            if (r12 >= r7) goto L_0x04f4
            int r13 = r6.mo13927i(r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r14 = r6.mo13927i(r5)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r9[r12] = r13     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r10[r12] = r14     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r12 = r12 + 1
            goto L_0x04e3
        L_0x04f4:
            com.google.ads.interactivemedia.v3.internal.zl r2 = new com.google.ads.interactivemedia.v3.internal.zl     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r24 = r2
            r28 = r9
            r29 = r10
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r13 = r2
            goto L_0x051c
        L_0x0501:
            r8 = r16
            r4 = r17
            goto L_0x050c
        L_0x0506:
            r8 = r16
            r4 = r17
            r3 = r21
        L_0x050c:
            java.lang.String r2 = m19633h(r0, r12, r3, r4, r8)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            byte[] r5 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r6 = 0
            r1.mo13956n(r5, r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            com.google.ads.interactivemedia.v3.internal.za r6 = new com.google.ads.interactivemedia.v3.internal.za     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r6.<init>(r2, r5)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r13 = r6
        L_0x051c:
            if (r13 != 0) goto L_0x0556
            r2 = r23
            java.lang.String r0 = m19633h(r0, r2, r3, r4, r8)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r2 = r2.length()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            int r2 = r2 + 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r3.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r2 = "Failed to decode frame: id="
            r3.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r0 = ", frameSize="
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r3.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            java.lang.String r0 = r3.toString()     // Catch:{ UnsupportedEncodingException -> 0x0551, all -> 0x054d }
            r2 = r20
            android.util.Log.w(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x0553, all -> 0x054d }
            goto L_0x0556
        L_0x054d:
            r0 = move-exception
            r14 = r22
            goto L_0x0566
        L_0x0551:
            r2 = r20
        L_0x0553:
            r14 = r22
            goto L_0x055c
        L_0x0556:
            r14 = r22
            r1.mo13951i(r14)
            return r13
        L_0x055c:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0162 }
            r1.mo13951i(r14)
            r0 = 0
            return r0
        L_0x0566:
            r1.mo13951i(r14)
            throw r0
        L_0x056a:
            r2 = r8
            r0 = r13
            java.lang.String r3 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r2, r3)
            r1.mo13951i(r14)
            return r0
        L_0x0575:
            r0 = r13
            r1.mo13951i(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4529zi.m19630e(int, com.google.ads.interactivemedia.v3.internal.alw, boolean, int, com.google.ads.interactivemedia.v3.internal.zg):com.google.ads.interactivemedia.v3.internal.zj");
    }

    /* renamed from: f */
    private static int m19631f(alw alw, int i) {
        byte[] j = alw.mo13952j();
        int h = alw.mo13950h();
        int i2 = h;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= h + i) {
                return i;
            }
            if ((j[i2] & 255) == 255 && j[i3] == 0) {
                System.arraycopy(j, i2 + 2, j, i3, (i - (i2 - h)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* renamed from: g */
    private static String m19632g(int i) {
        return i != 1 ? i != 2 ? i != 3 ? C6540C.ISO88591_NAME : C6540C.UTF8_NAME : "UTF-16BE" : C6540C.UTF16_NAME;
    }

    /* renamed from: h */
    private static String m19633h(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: i */
    private static int m19634i(byte[] bArr, int i, int i2) {
        int j = m19635j(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return j;
        }
        while (true) {
            int length = bArr.length;
            if (j >= length - 1) {
                return length;
            }
            if (j % 2 == 0 && bArr[j + 1] == 0) {
                return j;
            }
            j = m19635j(bArr, j + 1);
        }
    }

    /* renamed from: j */
    private static int m19635j(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: k */
    private static int m19636k(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: l */
    private static byte[] m19637l(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return amm.f15303f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: m */
    private static String m19638m(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C4507yn mo16841b(ByteBuffer byteBuffer) {
        return mo16896c(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p038v3.internal.C4507yn mo16896c(byte[] r13, int r14) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.ads.interactivemedia.v3.internal.alw r1 = new com.google.ads.interactivemedia.v3.internal.alw
            r1.<init>(r13, r14)
            int r13 = r1.mo13947e()
            r14 = 2
            r2 = 10
            r3 = 4
            r4 = 0
            r5 = 1
            java.lang.String r6 = "Id3Decoder"
            r7 = 0
            if (r13 >= r2) goto L_0x0021
            java.lang.String r13 = "Data too short to be an ID3 tag"
            android.util.Log.w(r6, r13)
        L_0x001e:
            r10 = r7
            goto L_0x00bb
        L_0x0021:
            int r13 = r1.mo13961s()
            r8 = 4801587(0x494433, float:6.728456E-39)
            if (r13 == r8) goto L_0x0052
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r8[r4] = r13
            java.lang.String r13 = "%06X"
            java.lang.String r13 = java.lang.String.format(r13, r8)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r8 = "Unexpected first three bytes of ID3 tag header: 0x"
            int r9 = r13.length()
            if (r9 == 0) goto L_0x0049
            java.lang.String r13 = r8.concat(r13)
            goto L_0x004e
        L_0x0049:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r8)
        L_0x004e:
            android.util.Log.w(r6, r13)
            goto L_0x001e
        L_0x0052:
            int r13 = r1.mo13957o()
            r1.mo13954l(r5)
            int r8 = r1.mo13957o()
            int r9 = r1.mo13933B()
            if (r13 != r14) goto L_0x006d
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0094
            java.lang.String r13 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            android.util.Log.w(r6, r13)
            goto L_0x001e
        L_0x006d:
            r10 = 3
            if (r13 != r10) goto L_0x007e
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0094
            int r10 = r1.mo13965w()
            r1.mo13954l(r10)
            int r10 = r10 + r3
            int r9 = r9 - r10
            goto L_0x0094
        L_0x007e:
            if (r13 != r3) goto L_0x00a3
            r10 = r8 & 64
            if (r10 == 0) goto L_0x008e
            int r10 = r1.mo13933B()
            int r11 = r10 + -4
            r1.mo13954l(r11)
            int r9 = r9 - r10
        L_0x008e:
            r10 = r8 & 16
            if (r10 == 0) goto L_0x0094
            int r9 = r9 + -10
        L_0x0094:
            if (r13 >= r3) goto L_0x009c
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x009c
            r8 = 1
            goto L_0x009d
        L_0x009c:
            r8 = 0
        L_0x009d:
            com.google.ads.interactivemedia.v3.internal.zh r10 = new com.google.ads.interactivemedia.v3.internal.zh
            r10.<init>(r13, r8, r9)
            goto L_0x00bb
        L_0x00a3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 57
            r8.<init>(r9)
            java.lang.String r9 = "Skipped ID3 tag with unsupported majorVersion="
            r8.append(r9)
            r8.append(r13)
            java.lang.String r13 = r8.toString()
            android.util.Log.w(r6, r13)
            goto L_0x001e
        L_0x00bb:
            if (r10 != 0) goto L_0x00be
            return r7
        L_0x00be:
            int r13 = r1.mo13950h()
            int r8 = r10.f19748a
            if (r8 != r14) goto L_0x00c9
            r2 = 6
        L_0x00c9:
            int r14 = r10.f19750c
            boolean r8 = r10.f19749b
            if (r8 == 0) goto L_0x00db
            int r14 = r10.f19750c
            int r14 = m19631f(r1, r14)
        L_0x00db:
            int r13 = r13 + r14
            r1.mo13949g(r13)
            int r13 = r10.f19748a
            boolean r13 = m19629d(r1, r13, r2, r4)
            if (r13 != 0) goto L_0x0112
            int r13 = r10.f19748a
            if (r13 != r3) goto L_0x00f7
            boolean r13 = m19629d(r1, r3, r2, r5)
            if (r13 == 0) goto L_0x00f7
            r4 = 1
            goto L_0x0112
        L_0x00f7:
            int r13 = r10.f19748a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r0 = 56
            r14.<init>(r0)
            java.lang.String r0 = "Failed to validate ID3 tag with majorVersion="
            r14.append(r0)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            android.util.Log.w(r6, r13)
            return r7
        L_0x0112:
            int r13 = r1.mo13947e()
            if (r13 < r2) goto L_0x0128
            int r13 = r10.f19748a
            com.google.ads.interactivemedia.v3.internal.zg r14 = r12.f19752b
            com.google.ads.interactivemedia.v3.internal.zj r13 = m19630e(r13, r1, r4, r2, r14)
            if (r13 == 0) goto L_0x0112
            r0.add(r13)
            goto L_0x0112
        L_0x0128:
            com.google.ads.interactivemedia.v3.internal.yn r13 = new com.google.ads.interactivemedia.v3.internal.yn
            r13.<init>((java.util.List<? extends com.google.ads.interactivemedia.p038v3.internal.C4506ym>) r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4529zi.mo16896c(byte[], int):com.google.ads.interactivemedia.v3.internal.yn");
    }
}
