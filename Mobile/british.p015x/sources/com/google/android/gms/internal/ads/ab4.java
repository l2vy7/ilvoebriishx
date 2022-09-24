package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ab4 {

    /* renamed from: a */
    private static final int[] f29591a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f29592b = {OpusUtil.SAMPLE_RATE, 44100, 32000};

    /* renamed from: c */
    private static final int[] f29593c = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};

    /* renamed from: d */
    private static final int[] f29594d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f29595e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f29596f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g */
    public static final /* synthetic */ int f29597g = 0;

    /* renamed from: a */
    public static int m30274a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return m30278e((b & 192) >> 6, b & 63);
    }

    /* renamed from: b */
    public static C8281w m30275b(uq2 uq2, String str, String str2, zzs zzs) {
        int i = f29592b[(uq2.mo35249s() & PsExtractor.AUDIO_STREAM) >> 6];
        int s = uq2.mo35249s();
        int i2 = f29594d[(s & 56) >> 3];
        if ((s & 4) != 0) {
            i2++;
        }
        ge4 ge4 = new ge4();
        ge4.mo32081h(str);
        ge4.mo32093s(MimeTypes.AUDIO_AC3);
        ge4.mo32076e0(i2);
        ge4.mo32094t(i);
        ge4.mo32070b(zzs);
        ge4.mo32085k(str2);
        return ge4.mo32099y();
    }

    /* renamed from: c */
    public static C8281w m30276c(uq2 uq2, String str, String str2, zzs zzs) {
        uq2.mo35237g(2);
        int i = f29592b[(uq2.mo35249s() & PsExtractor.AUDIO_STREAM) >> 6];
        int s = uq2.mo35249s();
        int i2 = f29594d[(s & 14) >> 1];
        if ((s & 1) != 0) {
            i2++;
        }
        if (((uq2.mo35249s() & 30) >> 1) > 0 && (2 & uq2.mo35249s()) != 0) {
            i2 += 2;
        }
        String str3 = (uq2.mo35239i() <= 0 || (uq2.mo35249s() & 1) == 0) ? MimeTypes.AUDIO_E_AC3 : MimeTypes.AUDIO_E_AC3_JOC;
        ge4 ge4 = new ge4();
        ge4.mo32081h(str);
        ge4.mo32093s(str3);
        ge4.mo32076e0(i2);
        ge4.mo32094t(i);
        ge4.mo32070b(zzs);
        ge4.mo32085k(str2);
        return ge4.mo32099y();
    }

    /* renamed from: d */
    public static za4 m30277d(tp2 tp2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        tp2 tp22 = tp2;
        int b = tp2.mo35007b();
        tp22.mo35015j(40);
        int c = tp22.mo35008c(5);
        tp22.mo35013h(b);
        int i12 = -1;
        if (c > 10) {
            tp22.mo35015j(16);
            int c2 = tp22.mo35008c(2);
            if (c2 == 0) {
                i12 = 0;
            } else if (c2 == 1) {
                i12 = 1;
            } else if (c2 == 2) {
                i12 = 2;
            }
            tp22.mo35015j(3);
            int c3 = tp22.mo35008c(11) + 1;
            int i13 = c3 + c3;
            int c4 = tp22.mo35008c(2);
            if (c4 == 3) {
                i6 = f29593c[tp22.mo35008c(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = tp22.mo35008c(2);
                i7 = f29591a[i8];
                i6 = f29592b[c4];
            }
            int i14 = i7 * 256;
            int c5 = tp22.mo35008c(3);
            boolean l = tp2.mo35017l();
            int i15 = f29594d[c5] + (l ? 1 : 0);
            tp22.mo35015j(10);
            if (tp2.mo35017l()) {
                tp22.mo35015j(8);
            }
            if (c5 == 0) {
                tp22.mo35015j(5);
                if (tp2.mo35017l()) {
                    tp22.mo35015j(8);
                }
                i9 = 0;
                c5 = 0;
            } else {
                i9 = c5;
            }
            if (i12 == 1) {
                if (tp2.mo35017l()) {
                    tp22.mo35015j(16);
                }
                i10 = 1;
            } else {
                i10 = i12;
            }
            if (tp2.mo35017l()) {
                if (i9 > 2) {
                    tp22.mo35015j(2);
                }
                if ((i9 & 1) != 0 && i9 > 2) {
                    tp22.mo35015j(6);
                }
                if ((i9 & 4) != 0) {
                    tp22.mo35015j(6);
                }
                if (l && tp2.mo35017l()) {
                    tp22.mo35015j(5);
                }
                if (i10 == 0) {
                    if (tp2.mo35017l()) {
                        tp22.mo35015j(6);
                    }
                    if (i9 == 0 && tp2.mo35017l()) {
                        tp22.mo35015j(6);
                    }
                    if (tp2.mo35017l()) {
                        tp22.mo35015j(6);
                    }
                    int c6 = tp22.mo35008c(2);
                    if (c6 == 1) {
                        tp22.mo35015j(5);
                    } else if (c6 == 2) {
                        tp22.mo35015j(12);
                    } else if (c6 == 3) {
                        int c7 = tp22.mo35008c(5);
                        if (tp2.mo35017l()) {
                            tp22.mo35015j(5);
                            if (tp2.mo35017l()) {
                                tp22.mo35015j(4);
                            }
                            if (tp2.mo35017l()) {
                                tp22.mo35015j(4);
                            }
                            if (tp2.mo35017l()) {
                                tp22.mo35015j(4);
                            }
                            if (tp2.mo35017l()) {
                                tp22.mo35015j(4);
                            }
                            if (tp2.mo35017l()) {
                                tp22.mo35015j(4);
                            }
                            if (tp2.mo35017l()) {
                                tp22.mo35015j(4);
                            }
                            if (tp2.mo35017l()) {
                                tp22.mo35015j(4);
                            }
                            if (tp2.mo35017l()) {
                                if (tp2.mo35017l()) {
                                    tp22.mo35015j(4);
                                }
                                if (tp2.mo35017l()) {
                                    tp22.mo35015j(4);
                                }
                            }
                        }
                        if (tp2.mo35017l()) {
                            tp22.mo35015j(5);
                            if (tp2.mo35017l()) {
                                tp22.mo35015j(7);
                                if (tp2.mo35017l()) {
                                    tp22.mo35015j(8);
                                    tp22.mo35015j((c7 + 2) * 8);
                                    tp2.mo35009d();
                                }
                            }
                        }
                        tp22.mo35015j((c7 + 2) * 8);
                        tp2.mo35009d();
                    }
                    if (i9 < 2) {
                        if (tp2.mo35017l()) {
                            tp22.mo35015j(14);
                        }
                        if (c5 == 0 && tp2.mo35017l()) {
                            tp22.mo35015j(14);
                        }
                    }
                    if (tp2.mo35017l()) {
                        if (i8 == 0) {
                            tp22.mo35015j(5);
                            i10 = 0;
                            i8 = 0;
                        } else {
                            for (int i16 = 0; i16 < i7; i16++) {
                                if (tp2.mo35017l()) {
                                    tp22.mo35015j(5);
                                }
                            }
                        }
                    }
                    i10 = 0;
                }
            }
            if (tp2.mo35017l()) {
                tp22.mo35015j(5);
                if (i9 == 2) {
                    tp22.mo35015j(4);
                    i9 = 2;
                }
                if (i9 >= 6) {
                    tp22.mo35015j(2);
                }
                if (tp2.mo35017l()) {
                    i11 = 8;
                    tp22.mo35015j(8);
                } else {
                    i11 = 8;
                }
                if (i9 == 0 && tp2.mo35017l()) {
                    tp22.mo35015j(i11);
                }
                if (c4 < 3) {
                    tp2.mo35014i();
                }
            }
            if (i10 == 0 && i8 != 3) {
                tp2.mo35014i();
            }
            if (i10 == 2 && (i8 == 3 || tp2.mo35017l())) {
                tp22.mo35015j(6);
            }
            str = (tp2.mo35017l() && tp22.mo35008c(6) == 1 && tp22.mo35008c(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i5 = i12;
            i2 = i13;
            i = i14;
            i3 = i6;
            i4 = i15;
        } else {
            tp22.mo35015j(32);
            int c8 = tp22.mo35008c(2);
            String str2 = c8 == 3 ? null : MimeTypes.AUDIO_AC3;
            int e = m30278e(c8, tp22.mo35008c(6));
            tp22.mo35015j(8);
            int c9 = tp22.mo35008c(3);
            if (!((c9 & 1) == 0 || c9 == 1)) {
                tp22.mo35015j(2);
            }
            if ((c9 & 4) != 0) {
                tp22.mo35015j(2);
            }
            if (c9 == 2) {
                tp22.mo35015j(2);
            }
            str = str2;
            i2 = e;
            i3 = c8 < 3 ? f29592b[c8] : -1;
            i4 = f29594d[c9] + (tp2.mo35017l() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        return new za4(str, i5, i4, i3, i2, i, (ya4) null);
    }

    /* renamed from: e */
    private static int m30278e(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f29592b[i];
        if (i4 == 44100) {
            int i5 = f29596f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f29595e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
