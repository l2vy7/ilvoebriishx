package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pa */
/* compiled from: IMASDK */
public final class C4251pa {

    /* renamed from: a */
    public static final /* synthetic */ int f18293a = 0;

    /* renamed from: b */
    private static final int[] f18294b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: c */
    private static final int[] f18295c = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};

    /* renamed from: d */
    private static final int[] f18296d = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: a */
    public static C4120ke m18468a(byte[] bArr, String str, String str2) {
        alv alv;
        int i = 0;
        int i2 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            alv = new alv(bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b2 = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b2;
                }
            }
            alv = new alv(copyOf);
            if (copyOf[0] == 31) {
                alv alv2 = new alv(copyOf);
                while (alv2.mo13921c() >= 16) {
                    alv2.mo13925g(2);
                    alv.mo13930l(alv2.mo13927i(14));
                }
            }
            alv.mo13919a(copyOf);
        }
        alv.mo13925g(60);
        int i5 = f18294b[alv.mo13927i(6)];
        int i6 = f18295c[alv.mo13927i(4)];
        int i7 = alv.mo13927i(5);
        if (i7 < 29) {
            i2 = (f18296d[i7] * 1000) / 2;
        }
        alv.mo13925g(10);
        if (alv.mo13927i(2) > 0) {
            i = 1;
        }
        C4119kd kdVar = new C4119kd();
        kdVar.mo16107S(str);
        kdVar.mo16120ae(MimeTypes.AUDIO_DTS);
        kdVar.mo16095G(i2);
        kdVar.mo16096H(i5 + i);
        kdVar.mo16121af(i6);
        kdVar.mo16100L((C4276pz) null);
        kdVar.mo16110V(str2);
        return kdVar.mo16115a();
    }
}
