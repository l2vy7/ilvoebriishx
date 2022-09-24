package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* renamed from: com.google.android.gms.internal.ads.ul */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8231ul {

    /* renamed from: a */
    private static final byte[] f39885a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f39886b = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f39887c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m38359a(byte[] bArr) {
        C7508am amVar = new C7508am(bArr, bArr.length);
        int c = m38361c(amVar);
        int d = m38362d(amVar);
        int a = amVar.mo30420a(4);
        if (c == 5 || c == 29) {
            d = m38362d(amVar);
            if (m38361c(amVar) == 22) {
                a = amVar.mo30420a(4);
            }
        }
        int i = f39887c[a];
        C8195tl.m37898c(i != -1);
        return Pair.create(Integer.valueOf(d), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static byte[] m38360b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 4)];
        System.arraycopy(f39885a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    /* renamed from: c */
    private static int m38361c(C7508am amVar) {
        int a = amVar.mo30420a(5);
        return a == 31 ? amVar.mo30420a(6) + 32 : a;
    }

    /* renamed from: d */
    private static int m38362d(C7508am amVar) {
        int a = amVar.mo30420a(4);
        if (a == 15) {
            return amVar.mo30420a(24);
        }
        C8195tl.m37898c(a < 13);
        return f39886b[a];
    }
}
