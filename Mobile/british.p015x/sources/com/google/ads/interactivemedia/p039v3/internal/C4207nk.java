package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nk */
/* compiled from: IMASDK */
public final class C4207nk {

    /* renamed from: a */
    public static final /* synthetic */ int f18076a = 0;

    /* renamed from: b */
    private static final int[] f18077b = {1, 2, 3, 6};

    /* renamed from: c */
    private static final int[] f18078c = {OpusUtil.SAMPLE_RATE, 44100, 32000};

    /* renamed from: d */
    private static final int[] f18079d = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};

    /* renamed from: e */
    private static final int[] f18080e = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: f */
    private static final int[] f18081f = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: g */
    private static final int[] f18082g = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static C4120ke m18270a(alw alw, String str, String str2, C4276pz pzVar) {
        int i = f18078c[(alw.mo13957o() & PsExtractor.AUDIO_STREAM) >> 6];
        int o = alw.mo13957o();
        int i2 = f18080e[(o & 56) >> 3];
        if ((o & 4) != 0) {
            i2++;
        }
        C4119kd kdVar = new C4119kd();
        kdVar.mo16107S(str);
        kdVar.mo16120ae(MimeTypes.AUDIO_AC3);
        kdVar.mo16096H(i2);
        kdVar.mo16121af(i);
        kdVar.mo16100L(pzVar);
        kdVar.mo16110V(str2);
        return kdVar.mo16115a();
    }

    /* renamed from: b */
    public static C4120ke m18271b(alw alw, String str, String str2, C4276pz pzVar) {
        alw.mo13954l(2);
        int i = f18078c[(alw.mo13957o() & PsExtractor.AUDIO_STREAM) >> 6];
        int o = alw.mo13957o();
        int i2 = f18080e[(o & 14) >> 1];
        if ((o & 1) != 0) {
            i2++;
        }
        if (((alw.mo13957o() & 30) >> 1) > 0 && (2 & alw.mo13957o()) != 0) {
            i2 += 2;
        }
        String str3 = (alw.mo13947e() <= 0 || (alw.mo13957o() & 1) == 0) ? MimeTypes.AUDIO_E_AC3 : MimeTypes.AUDIO_E_AC3_JOC;
        C4119kd kdVar = new C4119kd();
        kdVar.mo16107S(str);
        kdVar.mo16120ae(str3);
        kdVar.mo16096H(i2);
        kdVar.mo16121af(i);
        kdVar.mo16100L(pzVar);
        kdVar.mo16110V(str2);
        return kdVar.mo16115a();
    }

    /* renamed from: c */
    public static C4206nj m18272c(alv alv) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        alv alv2 = alv;
        int d = alv.mo13922d();
        alv2.mo13925g(40);
        int i10 = alv2.mo13927i(5);
        alv2.mo13923e(d);
        int i11 = -1;
        if (i10 > 10) {
            alv2.mo13925g(16);
            int i12 = alv2.mo13927i(2);
            if (i12 == 0) {
                i11 = 0;
            } else if (i12 == 1) {
                i11 = 1;
            } else if (i12 == 2) {
                i11 = 2;
            }
            alv2.mo13925g(3);
            int i13 = alv2.mo13927i(11) + 1;
            int i14 = i13 + i13;
            int i15 = alv2.mo13927i(2);
            if (i15 == 3) {
                i5 = f18079d[alv2.mo13927i(2)];
                i7 = 3;
                i6 = 6;
            } else {
                i7 = alv2.mo13927i(2);
                i6 = f18077b[i7];
                i5 = f18078c[i15];
            }
            int i16 = i6 * 256;
            int i17 = alv2.mo13927i(3);
            boolean h = alv.mo13926h();
            int i18 = f18080e[i17] + (h ? 1 : 0);
            alv2.mo13925g(10);
            if (alv.mo13926h()) {
                alv2.mo13925g(8);
            }
            if (i17 == 0) {
                alv2.mo13925g(5);
                if (alv.mo13926h()) {
                    alv2.mo13925g(8);
                }
                i8 = 0;
            } else {
                i8 = i17;
            }
            if (i11 == 1) {
                if (alv.mo13926h()) {
                    alv2.mo13925g(16);
                }
                i11 = 1;
            }
            if (alv.mo13926h()) {
                if (i8 > 2) {
                    alv2.mo13925g(2);
                }
                if ((i8 & 1) != 0 && i8 > 2) {
                    alv2.mo13925g(6);
                }
                if ((i8 & 4) != 0) {
                    alv2.mo13925g(6);
                }
                if (h && alv.mo13926h()) {
                    alv2.mo13925g(5);
                }
                if (i11 == 0) {
                    if (alv.mo13926h()) {
                        alv2.mo13925g(6);
                    }
                    if (i8 == 0 && alv.mo13926h()) {
                        alv2.mo13925g(6);
                    }
                    if (alv.mo13926h()) {
                        alv2.mo13925g(6);
                    }
                    int i19 = alv2.mo13927i(2);
                    if (i19 == 1) {
                        alv2.mo13925g(5);
                    } else if (i19 == 2) {
                        alv2.mo13925g(12);
                    } else if (i19 == 3) {
                        int i20 = alv2.mo13927i(5);
                        if (alv.mo13926h()) {
                            alv2.mo13925g(5);
                            if (alv.mo13926h()) {
                                alv2.mo13925g(4);
                            }
                            if (alv.mo13926h()) {
                                alv2.mo13925g(4);
                            }
                            if (alv.mo13926h()) {
                                alv2.mo13925g(4);
                            }
                            if (alv.mo13926h()) {
                                alv2.mo13925g(4);
                            }
                            if (alv.mo13926h()) {
                                alv2.mo13925g(4);
                            }
                            if (alv.mo13926h()) {
                                alv2.mo13925g(4);
                            }
                            if (alv.mo13926h()) {
                                alv2.mo13925g(4);
                            }
                            if (alv.mo13926h()) {
                                if (alv.mo13926h()) {
                                    alv2.mo13925g(4);
                                }
                                if (alv.mo13926h()) {
                                    alv2.mo13925g(4);
                                }
                            }
                        }
                        if (alv.mo13926h()) {
                            alv2.mo13925g(5);
                            if (alv.mo13926h()) {
                                alv2.mo13925g(7);
                                if (alv.mo13926h()) {
                                    alv2.mo13925g(8);
                                    alv2.mo13925g((i20 + 2) * 8);
                                    alv.mo13928j();
                                }
                            }
                        }
                        alv2.mo13925g((i20 + 2) * 8);
                        alv.mo13928j();
                    }
                    if (i8 < 2) {
                        if (alv.mo13926h()) {
                            alv2.mo13925g(14);
                        }
                        if (i17 == 0 && alv.mo13926h()) {
                            alv2.mo13925g(14);
                        }
                    }
                    if (alv.mo13926h()) {
                        if (i7 == 0) {
                            alv2.mo13925g(5);
                            i7 = 0;
                        } else {
                            for (int i21 = 0; i21 < i6; i21++) {
                                if (alv.mo13926h()) {
                                    alv2.mo13925g(5);
                                }
                            }
                        }
                    }
                }
            }
            if (alv.mo13926h()) {
                alv2.mo13925g(5);
                if (i8 == 2) {
                    alv2.mo13925g(4);
                }
                if (i8 >= 6) {
                    alv2.mo13925g(2);
                }
                if (alv.mo13926h()) {
                    i9 = 8;
                    alv2.mo13925g(8);
                } else {
                    i9 = 8;
                }
                if (i8 == 0 && alv.mo13926h()) {
                    alv2.mo13925g(i9);
                }
                if (i15 < 3) {
                    alv.mo13924f();
                }
            }
            if (i11 == 0 && i7 != 3) {
                alv.mo13924f();
            }
            if (i11 == 2 && (i7 == 3 || alv.mo13926h())) {
                alv2.mo13925g(6);
            }
            str = (alv.mo13926h() && alv2.mo13927i(6) == 1 && alv2.mo13927i(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i2 = i14;
            i = i16;
            i3 = i5;
            i4 = i18;
        } else {
            alv2.mo13925g(32);
            int i22 = alv2.mo13927i(2);
            String str2 = i22 == 3 ? null : MimeTypes.AUDIO_AC3;
            int f = m18275f(i22, alv2.mo13927i(6));
            alv2.mo13925g(8);
            int i23 = alv2.mo13927i(3);
            if (!((i23 & 1) == 0 || i23 == 1)) {
                alv2.mo13925g(2);
            }
            if ((i23 & 4) != 0) {
                alv2.mo13925g(2);
            }
            if (i23 == 2) {
                alv2.mo13925g(2);
            }
            if (i22 < 3) {
                i11 = f18078c[i22];
            }
            i3 = i11;
            str = str2;
            i2 = f;
            i4 = f18080e[i23] + (alv.mo13926h() ? 1 : 0);
            i = 1536;
        }
        return new C4206nj(str, i4, i3, i2, i);
    }

    /* renamed from: d */
    public static int m18273d(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return m18275f((b & 192) >> 6, b & 63);
    }

    /* renamed from: e */
    public static int m18274e(ByteBuffer byteBuffer) {
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f18077b[i] * 256;
    }

    /* renamed from: f */
    private static int m18275f(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f18078c[i];
        if (i4 == 44100) {
            int i5 = f18082g[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f18081f[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
