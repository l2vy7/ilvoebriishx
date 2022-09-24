package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajq */
/* compiled from: IMASDK */
public final /* synthetic */ class ajq {
    /* renamed from: a */
    public static ajn m13887a(Context context, Map map, int i, aks aks, boolean z) {
        return new ajn(context, map, 2000, aks, true);
    }

    /* renamed from: b */
    public static int m13888b(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: c */
    public static C4329ry m13889c(alw alw, boolean z, boolean z2) throws C4144lb {
        if (z) {
            m13890d(3, alw, false);
        }
        alw.mo13937F((int) alw.mo13964v()).length();
        long v = alw.mo13964v();
        String[] strArr = new String[((int) v)];
        for (int i = 0; ((long) i) < v; i++) {
            String F = alw.mo13937F((int) alw.mo13964v());
            strArr[i] = F;
            F.length();
        }
        if (!z2 || (alw.mo13957o() & 1) != 0) {
            return new C4329ry(strArr);
        }
        throw new C4144lb("framing bit expected to be set");
    }

    /* renamed from: d */
    public static boolean m13890d(int i, alw alw, boolean z) throws C4144lb {
        String str;
        if (alw.mo13947e() < 7) {
            if (z) {
                return false;
            }
            int e = alw.mo13947e();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(e);
            throw new C4144lb(sb.toString());
        } else if (alw.mo13957o() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            if (valueOf.length() != 0) {
                str = "expected header type ".concat(valueOf);
            } else {
                str = new String("expected header type ");
            }
            throw new C4144lb(str);
        } else if (alw.mo13957o() == 118 && alw.mo13957o() == 111 && alw.mo13957o() == 114 && alw.mo13957o() == 98 && alw.mo13957o() == 105 && alw.mo13957o() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C4144lb("expected characters 'vorbis'");
        }
    }

    /* renamed from: e */
    public static C4330rz[] m13891e(alw alw, int i) throws C4144lb {
        int i2;
        int i3;
        long j;
        int i4 = i;
        int i5 = 5;
        int i6 = 0;
        m13890d(5, alw, false);
        int o = alw.mo13957o() + 1;
        C4328rx rxVar = new C4328rx(alw.mo13952j());
        rxVar.mo16630c(alw.mo13950h() * 8);
        int i7 = 0;
        while (i7 < o) {
            if (rxVar.mo16629b(24) == 5653314) {
                int b = rxVar.mo16629b(16);
                int b2 = rxVar.mo16629b(24);
                long[] jArr = new long[b2];
                if (!rxVar.mo16628a()) {
                    boolean a = rxVar.mo16628a();
                    while (i6 < b2) {
                        if (!a) {
                            jArr[i6] = (long) (rxVar.mo16629b(5) + 1);
                        } else if (rxVar.mo16628a()) {
                            jArr[i6] = (long) (rxVar.mo16629b(5) + 1);
                        } else {
                            jArr[i6] = 0;
                        }
                        i6++;
                    }
                } else {
                    int b3 = rxVar.mo16629b(5) + 1;
                    int i8 = 0;
                    while (i8 < b2) {
                        int b4 = rxVar.mo16629b(m13888b(b2 - i8));
                        for (int i9 = 0; i9 < b4 && i8 < b2; i9++) {
                            jArr[i8] = (long) b3;
                            i8++;
                        }
                        b3++;
                    }
                }
                int b5 = rxVar.mo16629b(4);
                if (b5 <= 2) {
                    if (b5 == 1) {
                        i3 = b5;
                    } else if (b5 == 2) {
                        i3 = 2;
                    } else {
                        i7++;
                        i6 = 0;
                    }
                    rxVar.mo16630c(32);
                    rxVar.mo16630c(32);
                    int b6 = rxVar.mo16629b(4) + 1;
                    rxVar.mo16630c(1);
                    if (i3 != 1) {
                        j = ((long) b2) * ((long) b);
                    } else if (b != 0) {
                        double d = (double) ((long) b);
                        Double.isNaN(d);
                        j = (long) Math.floor(Math.pow((double) ((long) b2), 1.0d / d));
                    } else {
                        j = 0;
                    }
                    rxVar.mo16630c((int) (j * ((long) b6)));
                    i7++;
                    i6 = 0;
                } else {
                    StringBuilder sb = new StringBuilder(53);
                    sb.append("lookup type greater than 2 not decodable: ");
                    sb.append(b5);
                    throw new C4144lb(sb.toString());
                }
            } else {
                int d2 = rxVar.mo16631d();
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                sb2.append(d2);
                throw new C4144lb(sb2.toString());
            }
        }
        int b7 = rxVar.mo16629b(6) + 1;
        int i10 = 0;
        while (i10 < b7) {
            if (rxVar.mo16629b(16) == 0) {
                i10++;
            } else {
                throw new C4144lb("placeholder of time domain transforms not zeroed out");
            }
        }
        int b8 = rxVar.mo16629b(6) + 1;
        int i11 = 0;
        while (true) {
            int i12 = 3;
            if (i11 < b8) {
                int b9 = rxVar.mo16629b(16);
                if (b9 == 0) {
                    int i13 = 8;
                    rxVar.mo16630c(8);
                    rxVar.mo16630c(16);
                    rxVar.mo16630c(16);
                    rxVar.mo16630c(6);
                    rxVar.mo16630c(8);
                    int b10 = rxVar.mo16629b(4) + 1;
                    int i14 = 0;
                    while (i14 < b10) {
                        rxVar.mo16630c(i13);
                        i14++;
                        i13 = 8;
                    }
                } else if (b9 == 1) {
                    int b11 = rxVar.mo16629b(i5);
                    int[] iArr = new int[b11];
                    int i15 = -1;
                    for (int i16 = 0; i16 < b11; i16++) {
                        int b12 = rxVar.mo16629b(4);
                        iArr[i16] = b12;
                        if (b12 > i15) {
                            i15 = b12;
                        }
                    }
                    int i17 = i15 + 1;
                    int[] iArr2 = new int[i17];
                    int i18 = 0;
                    while (i18 < i17) {
                        iArr2[i18] = rxVar.mo16629b(i12) + 1;
                        int b13 = rxVar.mo16629b(2);
                        if (b13 > 0) {
                            i2 = 8;
                            rxVar.mo16630c(8);
                        } else {
                            i2 = 8;
                        }
                        int i19 = 0;
                        while (i19 < (1 << b13)) {
                            rxVar.mo16630c(i2);
                            i19++;
                            i2 = 8;
                        }
                        i18++;
                        i12 = 3;
                    }
                    rxVar.mo16630c(2);
                    int b14 = rxVar.mo16629b(4);
                    int i20 = 0;
                    int i21 = 0;
                    for (int i22 = 0; i22 < b11; i22++) {
                        i20 += iArr2[iArr[i22]];
                        while (i21 < i20) {
                            rxVar.mo16630c(b14);
                            i21++;
                        }
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(52);
                    sb3.append("floor type greater than 1 not decodable: ");
                    sb3.append(b9);
                    throw new C4144lb(sb3.toString());
                }
                i11++;
                i5 = 5;
            } else {
                int b15 = rxVar.mo16629b(6) + 1;
                int i23 = 0;
                while (i23 < b15) {
                    if (rxVar.mo16629b(16) <= 2) {
                        rxVar.mo16630c(24);
                        rxVar.mo16630c(24);
                        rxVar.mo16630c(24);
                        int b16 = rxVar.mo16629b(6) + 1;
                        int i24 = 8;
                        rxVar.mo16630c(8);
                        int[] iArr3 = new int[b16];
                        for (int i25 = 0; i25 < b16; i25++) {
                            iArr3[i25] = ((rxVar.mo16628a() ? rxVar.mo16629b(5) : 0) * 8) + rxVar.mo16629b(3);
                        }
                        int i26 = 0;
                        while (i26 < b16) {
                            int i27 = 0;
                            while (i27 < i24) {
                                if ((iArr3[i26] & (1 << i27)) != 0) {
                                    rxVar.mo16630c(i24);
                                }
                                i27++;
                                i24 = 8;
                            }
                            i26++;
                            i24 = 8;
                        }
                        i23++;
                    } else {
                        throw new C4144lb("residueType greater than 2 is not decodable");
                    }
                }
                int b17 = rxVar.mo16629b(6) + 1;
                for (int i28 = 0; i28 < b17; i28++) {
                    int b18 = rxVar.mo16629b(16);
                    if (b18 != 0) {
                        StringBuilder sb4 = new StringBuilder(52);
                        sb4.append("mapping type other than 0 not supported: ");
                        sb4.append(b18);
                        Log.e("VorbisUtil", sb4.toString());
                    } else {
                        int b19 = rxVar.mo16628a() ? rxVar.mo16629b(4) + 1 : 1;
                        if (rxVar.mo16628a()) {
                            int b20 = rxVar.mo16629b(8) + 1;
                            for (int i29 = 0; i29 < b20; i29++) {
                                int i30 = i4 - 1;
                                rxVar.mo16630c(m13888b(i30));
                                rxVar.mo16630c(m13888b(i30));
                            }
                        }
                        if (rxVar.mo16629b(2) == 0) {
                            if (b19 > 1) {
                                for (int i31 = 0; i31 < i4; i31++) {
                                    rxVar.mo16630c(4);
                                }
                            }
                            for (int i32 = 0; i32 < b19; i32++) {
                                rxVar.mo16630c(8);
                                rxVar.mo16630c(8);
                                rxVar.mo16630c(8);
                            }
                        } else {
                            throw new C4144lb("to reserved bits must be zero after mapping coupling steps");
                        }
                    }
                }
                int b21 = rxVar.mo16629b(6) + 1;
                C4330rz[] rzVarArr = new C4330rz[b21];
                for (int i33 = 0; i33 < b21; i33++) {
                    boolean a2 = rxVar.mo16628a();
                    rxVar.mo16629b(16);
                    rxVar.mo16629b(16);
                    rxVar.mo16629b(8);
                    rzVarArr[i33] = new C4330rz(a2);
                }
                if (rxVar.mo16628a()) {
                    return rzVarArr;
                }
                throw new C4144lb("framing bit after modes not set as expected");
            }
        }
    }

    /* renamed from: f */
    public static int m13892f(C4327rw rwVar, ajd ajd, int i, boolean z) throws IOException {
        return rwVar.mo13407e(ajd, i, z);
    }

    /* renamed from: g */
    public static void m13893g(C4327rw rwVar, alw alw, int i) {
        rwVar.mo13408f(alw, i);
    }

    /* renamed from: h */
    public static C4507yn m13894h(C4307rc rcVar, boolean z) throws IOException {
        C4507yn a = new C4319ro().mo16617a(rcVar, z ? null : C4529zi.f19751a);
        if (a == null || a.mo16831a() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: i */
    public static C4315rk m13895i(alw alw) {
        alw.mo13954l(1);
        int s = alw.mo13961s();
        long h = ((long) alw.mo13950h()) + ((long) s);
        int i = s / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long y = alw.mo13967y();
            if (y == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = y;
            jArr2[i2] = alw.mo13967y();
            alw.mo13954l(2);
            i2++;
        }
        alw.mo13954l((int) (h - ((long) alw.mo13950h())));
        return new C4315rk(jArr, jArr2);
    }
}
