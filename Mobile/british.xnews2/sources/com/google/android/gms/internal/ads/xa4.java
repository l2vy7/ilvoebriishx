package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xa4 {

    /* renamed from: a */
    private static final int[] f41122a = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f41123b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c */
    public static final /* synthetic */ int f41124c = 0;

    /* renamed from: a */
    public static wa4 m39418a(byte[] bArr) throws C7811iy {
        return m39419b(new tp2(bArr, bArr.length), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bd, code lost:
        if (r12 != 3) goto L_0x00df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.wa4 m39419b(com.google.android.gms.internal.ads.tp2 r12, boolean r13) throws com.google.android.gms.internal.ads.C7811iy {
        /*
            int r0 = m39420c(r12)
            int r1 = m39421d(r12)
            r2 = 4
            int r3 = r12.mo35008c(r2)
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
            int r1 = m39421d(r12)
            int r0 = m39420c(r12)
            if (r0 != r6) goto L_0x0037
            int r3 = r12.mo35008c(r2)
        L_0x0037:
            if (r13 == 0) goto L_0x00df
            r13 = 17
            r7 = 6
            r8 = 1
            r9 = 2
            r10 = 3
            if (r0 == r8) goto L_0x0069
            if (r0 == r9) goto L_0x0069
            if (r0 == r10) goto L_0x0069
            if (r0 == r2) goto L_0x0069
            if (r0 == r7) goto L_0x0069
            r2 = 7
            if (r0 == r2) goto L_0x0069
            if (r0 == r13) goto L_0x0069
            switch(r0) {
                case 19: goto L_0x0069;
                case 20: goto L_0x0069;
                case 21: goto L_0x0069;
                case 22: goto L_0x0069;
                case 23: goto L_0x0069;
                default: goto L_0x0051;
            }
        L_0x0051:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 42
            r12.<init>(r13)
            java.lang.String r13 = "Unsupported audio object type: "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.google.android.gms.internal.ads.iy r12 = com.google.android.gms.internal.ads.C7811iy.m33484c(r12)
            throw r12
        L_0x0069:
            boolean r2 = r12.mo35017l()
            if (r2 == 0) goto L_0x0076
            java.lang.String r2 = "AacUtil"
            java.lang.String r11 = "Unexpected frameLengthFlag = 1"
            android.util.Log.w(r2, r11)
        L_0x0076:
            boolean r2 = r12.mo35017l()
            if (r2 == 0) goto L_0x0081
            r2 = 14
            r12.mo35015j(r2)
        L_0x0081:
            boolean r2 = r12.mo35017l()
            if (r3 == 0) goto L_0x00d9
            r11 = 20
            if (r0 == r7) goto L_0x0094
            if (r0 != r11) goto L_0x0092
            r0 = 20
            r7 = 20
            goto L_0x0095
        L_0x0092:
            r7 = r0
            goto L_0x0098
        L_0x0094:
            r7 = r0
        L_0x0095:
            r12.mo35015j(r10)
        L_0x0098:
            if (r2 == 0) goto L_0x00b3
            if (r0 != r6) goto L_0x00a2
            r0 = 16
            r12.mo35015j(r0)
            goto L_0x00a3
        L_0x00a2:
            r6 = r0
        L_0x00a3:
            if (r6 == r13) goto L_0x00ad
            if (r6 == r5) goto L_0x00ad
            if (r6 == r11) goto L_0x00ad
            r13 = 23
            if (r6 != r13) goto L_0x00b0
        L_0x00ad:
            r12.mo35015j(r10)
        L_0x00b0:
            r12.mo35015j(r8)
        L_0x00b3:
            switch(r7) {
                case 17: goto L_0x00b7;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b7;
                case 20: goto L_0x00b7;
                case 21: goto L_0x00b7;
                case 22: goto L_0x00b7;
                case 23: goto L_0x00b7;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            goto L_0x00df
        L_0x00b7:
            int r12 = r12.mo35008c(r9)
            if (r12 == r9) goto L_0x00c0
            if (r12 == r10) goto L_0x00c1
            goto L_0x00df
        L_0x00c0:
            r10 = r12
        L_0x00c1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 33
            r12.<init>(r13)
            java.lang.String r13 = "Unsupported epConfig: "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            com.google.android.gms.internal.ads.iy r12 = com.google.android.gms.internal.ads.C7811iy.m33484c(r12)
            throw r12
        L_0x00d9:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            r12.<init>()
            throw r12
        L_0x00df:
            int[] r12 = f41123b
            r12 = r12[r3]
            r13 = -1
            r0 = 0
            if (r12 == r13) goto L_0x00ed
            com.google.android.gms.internal.ads.wa4 r13 = new com.google.android.gms.internal.ads.wa4
            r13.<init>(r1, r12, r4, r0)
            return r13
        L_0x00ed:
            com.google.android.gms.internal.ads.iy r12 = com.google.android.gms.internal.ads.C7811iy.m33482a(r0, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xa4.m39419b(com.google.android.gms.internal.ads.tp2, boolean):com.google.android.gms.internal.ads.wa4");
    }

    /* renamed from: c */
    private static int m39420c(tp2 tp2) {
        int c = tp2.mo35008c(5);
        return c == 31 ? tp2.mo35008c(6) + 32 : c;
    }

    /* renamed from: d */
    private static int m39421d(tp2 tp2) throws C7811iy {
        int c = tp2.mo35008c(4);
        if (c == 15) {
            return tp2.mo35008c(24);
        }
        if (c < 13) {
            return f41122a[c];
        }
        throw C7811iy.m33482a((String) null, (Throwable) null);
    }
}
