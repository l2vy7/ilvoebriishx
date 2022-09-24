package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akt */
/* compiled from: IMASDK */
public final class akt {

    /* renamed from: a */
    public static final /* synthetic */ int f15178a = 0;

    /* renamed from: b */
    private static final byte[] f15179b = {0, 0, 0, 1};

    /* renamed from: c */
    private static final String[] f15180c = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m13975a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: b */
    public static String m13976b(alx alx) {
        alx.mo13971c(24);
        int f = alx.mo13974f(2);
        boolean e = alx.mo13973e();
        int f2 = alx.mo13974f(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (alx.mo13973e()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = alx.mo13974f(8);
        }
        int f3 = alx.mo13974f(8);
        Object[] objArr = new Object[5];
        objArr[0] = f15180c[f];
        objArr[1] = Integer.valueOf(f2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(true != e ? 'L' : 'H');
        objArr[4] = Integer.valueOf(f3);
        StringBuilder sb = new StringBuilder(amm.m14188E("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0) {
            int i5 = i3 - 1;
            if (iArr[i5] != 0) {
                break;
            }
            i3 = i5;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i6])}));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static byte[] m13977c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 4)];
        System.arraycopy(f15179b, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
