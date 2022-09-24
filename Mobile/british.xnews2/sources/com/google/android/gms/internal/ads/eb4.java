package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class eb4 {

    /* renamed from: a */
    public final List<byte[]> f31299a;

    /* renamed from: b */
    public final int f31300b;

    /* renamed from: c */
    public final int f31301c;

    /* renamed from: d */
    public final int f31302d;

    /* renamed from: e */
    public final float f31303e;

    /* renamed from: f */
    public final String f31304f;

    private eb4(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f31299a = list;
        this.f31300b = i;
        this.f31301c = i2;
        this.f31302d = i3;
        this.f31303e = f;
        this.f31304f = str;
    }

    /* renamed from: a */
    public static eb4 m31766a(uq2 uq2) throws C7811iy {
        String str;
        float f;
        int i;
        int i2;
        try {
            uq2.mo35237g(4);
            int s = (uq2.mo35249s() & 3) + 1;
            if (s != 3) {
                ArrayList arrayList = new ArrayList();
                int s2 = uq2.mo35249s() & 31;
                for (int i3 = 0; i3 < s2; i3++) {
                    arrayList.add(m31767b(uq2));
                }
                int s3 = uq2.mo35249s();
                for (int i4 = 0; i4 < s3; i4++) {
                    arrayList.add(m31767b(uq2));
                }
                if (s2 > 0) {
                    jg2 d = kh2.m33961d((byte[]) arrayList.get(0), s + 1, ((byte[]) arrayList.get(0)).length);
                    int i5 = d.f33883e;
                    int i6 = d.f33884f;
                    float f2 = d.f33885g;
                    str = qw1.m36768a(d.f33879a, d.f33880b, d.f33881c);
                    i2 = i5;
                    i = i6;
                    f = f2;
                } else {
                    str = null;
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new eb4(arrayList, s, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C7811iy.m33482a("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    private static byte[] m31767b(uq2 uq2) {
        int w = uq2.mo35253w();
        int k = uq2.mo35241k();
        uq2.mo35237g(w);
        return qw1.m36770c(uq2.mo35238h(), k, w);
    }
}
