package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7537bf {

    /* renamed from: a */
    private static final int[] f29988a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f29989b = {OpusUtil.SAMPLE_RATE, 44100, 32000};

    /* renamed from: c */
    private static final int[] f29990c = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: d */
    public static final /* synthetic */ int f29991d = 0;

    /* renamed from: a */
    public static int m30689a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f29988a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: b */
    public static zzapg m30690b(C7544bm bmVar, String str, String str2, zzarf zzarf) {
        int i = f29989b[(bmVar.mo30710g() & PsExtractor.AUDIO_STREAM) >> 6];
        int g = bmVar.mo30710g();
        int i2 = f29990c[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return zzapg.m40612h(str, MimeTypes.AUDIO_AC3, (String) null, -1, -1, i2, i, (List<byte[]>) null, zzarf, 0, str2);
    }

    /* renamed from: c */
    public static zzapg m30691c(C7544bm bmVar, String str, String str2, zzarf zzarf) {
        C7544bm bmVar2 = bmVar;
        bmVar.mo30726w(2);
        int i = f29989b[(bmVar.mo30710g() & PsExtractor.AUDIO_STREAM) >> 6];
        int g = bmVar.mo30710g();
        int i2 = f29990c[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return zzapg.m40612h(str, MimeTypes.AUDIO_E_AC3, (String) null, -1, -1, i2, i, (List<byte[]>) null, zzarf, 0, str2);
    }
}
