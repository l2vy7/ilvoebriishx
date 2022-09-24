package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ni */
/* compiled from: IMASDK */
public final class C4205ni {

    /* renamed from: a */
    public static final /* synthetic */ int f18068a = 0;

    /* renamed from: b */
    private static final int[] f18069b = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f18070c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static C4204nh m18265a(byte[] bArr) throws C4144lb {
        return m18266b(new alv(bArr), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
        if (r12 != 3) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.ads.interactivemedia.p038v3.internal.C4204nh m18266b(com.google.ads.interactivemedia.p038v3.internal.alv r12, boolean r13) throws com.google.ads.interactivemedia.p038v3.internal.C4144lb {
        /*
            int r0 = m18268d(r12)
            int r1 = m18269e(r12)
            r2 = 4
            int r3 = r12.mo13927i(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 19
            r4.<init>(r5)
            java.lang.String r6 = "mp4a.40."
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r6 = 22
            r7 = 5
            if (r0 == r7) goto L_0x0029
            r7 = 29
            if (r0 != r7) goto L_0x0037
        L_0x0029:
            int r1 = m18269e(r12)
            int r0 = m18268d(r12)
            if (r0 != r6) goto L_0x0037
            int r3 = r12.mo13927i(r2)
        L_0x0037:
            if (r13 == 0) goto L_0x00dd
            r13 = 17
            r7 = 6
            r8 = 1
            r9 = 2
            r10 = 3
            if (r0 == r8) goto L_0x006a
            if (r0 == r9) goto L_0x006a
            if (r0 == r10) goto L_0x006a
            if (r0 == r2) goto L_0x006a
            if (r0 == r7) goto L_0x006a
            r2 = 7
            if (r0 == r2) goto L_0x006a
            if (r0 == r13) goto L_0x006a
            switch(r0) {
                case 19: goto L_0x006a;
                case 20: goto L_0x006a;
                case 21: goto L_0x006a;
                case 22: goto L_0x006a;
                case 23: goto L_0x006a;
                default: goto L_0x0051;
            }
        L_0x0051:
            com.google.ads.interactivemedia.v3.internal.lb r12 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r1 = 42
            r13.<init>(r1)
            java.lang.String r1 = "Unsupported audio object type: "
            r13.append(r1)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>((java.lang.String) r13)
            throw r12
        L_0x006a:
            boolean r2 = r12.mo13926h()
            if (r2 == 0) goto L_0x0077
            java.lang.String r2 = "AacUtil"
            java.lang.String r11 = "Unexpected frameLengthFlag = 1"
            android.util.Log.w(r2, r11)
        L_0x0077:
            boolean r2 = r12.mo13926h()
            if (r2 == 0) goto L_0x0082
            r2 = 14
            r12.mo13925g(r2)
        L_0x0082:
            boolean r2 = r12.mo13926h()
            if (r3 == 0) goto L_0x00d7
            r11 = 20
            if (r0 == r7) goto L_0x0093
            if (r0 != r11) goto L_0x0091
            r7 = 20
            goto L_0x0094
        L_0x0091:
            r7 = r0
            goto L_0x0097
        L_0x0093:
            r7 = r0
        L_0x0094:
            r12.mo13925g(r10)
        L_0x0097:
            if (r2 == 0) goto L_0x00b0
            if (r7 != r6) goto L_0x00a0
            r2 = 16
            r12.mo13925g(r2)
        L_0x00a0:
            if (r7 == r13) goto L_0x00aa
            if (r7 == r5) goto L_0x00aa
            if (r7 == r11) goto L_0x00aa
            r13 = 23
            if (r7 != r13) goto L_0x00ad
        L_0x00aa:
            r12.mo13925g(r10)
        L_0x00ad:
            r12.mo13925g(r8)
        L_0x00b0:
            switch(r0) {
                case 17: goto L_0x00b4;
                case 18: goto L_0x00b3;
                case 19: goto L_0x00b4;
                case 20: goto L_0x00b4;
                case 21: goto L_0x00b4;
                case 22: goto L_0x00b4;
                case 23: goto L_0x00b4;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            goto L_0x00dd
        L_0x00b4:
            int r12 = r12.mo13927i(r9)
            if (r12 == r9) goto L_0x00bd
            if (r12 == r10) goto L_0x00be
            goto L_0x00dd
        L_0x00bd:
            r10 = r12
        L_0x00be:
            com.google.ads.interactivemedia.v3.internal.lb r12 = new com.google.ads.interactivemedia.v3.internal.lb
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 33
            r13.<init>(r0)
            java.lang.String r0 = "Unsupported epConfig: "
            r13.append(r0)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            r12.<init>((java.lang.String) r13)
            throw r12
        L_0x00d7:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            r12.<init>()
            throw r12
        L_0x00dd:
            int[] r12 = f18070c
            r12 = r12[r3]
            r13 = -1
            if (r12 == r13) goto L_0x00ea
            com.google.ads.interactivemedia.v3.internal.nh r13 = new com.google.ads.interactivemedia.v3.internal.nh
            r13.<init>(r1, r12, r4)
            return r13
        L_0x00ea:
            com.google.ads.interactivemedia.v3.internal.lb r12 = new com.google.ads.interactivemedia.v3.internal.lb
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4205ni.m18266b(com.google.ads.interactivemedia.v3.internal.alv, boolean):com.google.ads.interactivemedia.v3.internal.nh");
    }

    /* renamed from: c */
    public static int m18267c(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* renamed from: d */
    private static int m18268d(alv alv) {
        int i = alv.mo13927i(5);
        return i == 31 ? alv.mo13927i(6) + 32 : i;
    }

    /* renamed from: e */
    private static int m18269e(alv alv) throws C4144lb {
        int i = alv.mo13927i(4);
        if (i == 15) {
            return alv.mo13927i(24);
        }
        if (i < 13) {
            return f18069b[i];
        }
        throw new C4144lb();
    }
}
