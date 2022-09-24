package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.p039ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tb4 {

    /* renamed from: a */
    private static final int[] f39379a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f39380b = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};

    /* renamed from: c */
    private static final int[] f39381c = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d */
    public static final /* synthetic */ int f39382d = 0;

    /* renamed from: a */
    public static C8281w m37773a(byte[] bArr, String str, String str2, zzs zzs) {
        tp2 tp2;
        int i = 0;
        int i2 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            tp2 = new tp2(bArr, bArr.length);
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
            int length = copyOf.length;
            tp2 = new tp2(copyOf, length);
            if (copyOf[0] == 31) {
                tp2 tp22 = new tp2(copyOf, length);
                while (tp22.mo35006a() >= 16) {
                    tp22.mo35015j(2);
                    tp2.mo35010e(tp22.mo35008c(14), 14);
                }
            }
            tp2.mo35012g(copyOf, copyOf.length);
        }
        tp2.mo35015j(60);
        int i5 = f39379a[tp2.mo35008c(6)];
        int i6 = f39380b[tp2.mo35008c(4)];
        int c = tp2.mo35008c(5);
        if (c < 29) {
            i2 = (f39381c[c] * 1000) / 2;
        }
        tp2.mo35015j(10);
        if (tp2.mo35008c(2) > 0) {
            i = 1;
        }
        ge4 ge4 = new ge4();
        ge4.mo32081h(str);
        ge4.mo32093s(MimeTypes.AUDIO_DTS);
        ge4.mo32074d0(i2);
        ge4.mo32076e0(i5 + i);
        ge4.mo32094t(i6);
        ge4.mo32070b((zzs) null);
        ge4.mo32085k(str2);
        return ge4.mo32099y();
    }
}
