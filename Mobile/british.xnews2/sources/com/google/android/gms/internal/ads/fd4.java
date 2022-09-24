package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fd4 {
    /* renamed from: a */
    public static int m32127a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static cd4 m32128b(uq2 uq2, boolean z, boolean z2) throws C7811iy {
        if (z) {
            m32129c(3, uq2, false);
        }
        String F = uq2.mo35228F((int) uq2.mo35255y(), n33.f35887c);
        long y = uq2.mo35255y();
        String[] strArr = new String[((int) y)];
        int length = F.length() + 15;
        for (int i = 0; ((long) i) < y; i++) {
            String F2 = uq2.mo35228F((int) uq2.mo35255y(), n33.f35887c);
            strArr[i] = F2;
            length = length + 4 + F2.length();
        }
        if (!z2 || (uq2.mo35249s() & 1) != 0) {
            return new cd4(F, strArr, length + 1);
        }
        throw C7811iy.m33482a("framing bit expected to be set", (Throwable) null);
    }

    /* renamed from: c */
    public static boolean m32129c(int i, uq2 uq2, boolean z) throws C7811iy {
        String str;
        if (uq2.mo35239i() < 7) {
            if (z) {
                return false;
            }
            int i2 = uq2.mo35239i();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(i2);
            throw C7811iy.m33482a(sb.toString(), (Throwable) null);
        } else if (uq2.mo35249s() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            if (valueOf.length() != 0) {
                str = "expected header type ".concat(valueOf);
            } else {
                str = new String("expected header type ");
            }
            throw C7811iy.m33482a(str, (Throwable) null);
        } else if (uq2.mo35249s() == 118 && uq2.mo35249s() == 111 && uq2.mo35249s() == 114 && uq2.mo35249s() == 98 && uq2.mo35249s() == 105 && uq2.mo35249s() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw C7811iy.m33482a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
