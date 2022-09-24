package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amv */
/* compiled from: IMASDK */
public final class amv {

    /* renamed from: a */
    public final List<byte[]> f15346a;

    /* renamed from: b */
    public final int f15347b;

    /* renamed from: c */
    public final String f15348c;

    private amv(List<byte[]> list, int i, String str) {
        this.f15346a = list;
        this.f15347b = i;
        this.f15348c = str;
    }

    /* renamed from: a */
    public static amv m14278a(alw alw) throws C4144lb {
        List list;
        alw alw2 = alw;
        try {
            alw2.mo13954l(21);
            int o = alw.mo13957o() & 3;
            int o2 = alw.mo13957o();
            int h = alw.mo13950h();
            int i = 0;
            for (int i2 = 0; i2 < o2; i2++) {
                alw2.mo13954l(1);
                int p = alw.mo13958p();
                for (int i3 = 0; i3 < p; i3++) {
                    int p2 = alw.mo13958p();
                    i += p2 + 4;
                    alw2.mo13954l(p2);
                }
            }
            alw2.mo13951i(h);
            byte[] bArr = new byte[i];
            String str = null;
            int i4 = 0;
            for (int i5 = 0; i5 < o2; i5++) {
                int o3 = alw.mo13957o() & 127;
                int p3 = alw.mo13958p();
                int i6 = 0;
                while (i6 < p3) {
                    int p4 = alw.mo13958p();
                    System.arraycopy(alq.f15233a, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(alw.mo13952j(), alw.mo13950h(), bArr, i7, p4);
                    if (o3 == 33 && i6 == 0) {
                        str = akt.m13976b(new alx(bArr, i7, i7 + p4));
                        i6 = 0;
                    }
                    i4 = i7 + p4;
                    alw2.mo13954l(p4);
                    i6++;
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new amv(list, o + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C4144lb("Error parsing HEVC config", e);
        }
    }
}
