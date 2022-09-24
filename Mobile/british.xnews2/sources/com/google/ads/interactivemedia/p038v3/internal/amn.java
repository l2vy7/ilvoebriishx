package com.google.ads.interactivemedia.p038v3.internal;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amn */
/* compiled from: IMASDK */
public final class amn {

    /* renamed from: a */
    public final List<byte[]> f15312a;

    /* renamed from: b */
    public final int f15313b;

    /* renamed from: c */
    public final int f15314c;

    /* renamed from: d */
    public final int f15315d;

    /* renamed from: e */
    public final float f15316e;

    /* renamed from: f */
    public final String f15317f;

    private amn(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f15312a = list;
        this.f15313b = i;
        this.f15314c = i2;
        this.f15315d = i3;
        this.f15316e = f;
        this.f15317f = str;
    }

    /* renamed from: a */
    public static amn m14257a(alw alw) throws C4144lb {
        String str;
        float f;
        int i;
        int i2;
        try {
            alw.mo13954l(4);
            int o = (alw.mo13957o() & 3) + 1;
            if (o != 3) {
                ArrayList arrayList = new ArrayList();
                int o2 = alw.mo13957o() & 31;
                for (int i3 = 0; i3 < o2; i3++) {
                    arrayList.add(m14258b(alw));
                }
                int o3 = alw.mo13957o();
                for (int i4 = 0; i4 < o3; i4++) {
                    arrayList.add(m14258b(alw));
                }
                if (o2 > 0) {
                    alp b = alq.m14049b((byte[]) arrayList.get(0), o, ((byte[]) arrayList.get(0)).length);
                    int i5 = b.f15224e;
                    int i6 = b.f15225f;
                    float f2 = b.f15226g;
                    str = akt.m13975a(b.f15220a, b.f15221b, b.f15222c);
                    i2 = i5;
                    i = i6;
                    f = f2;
                } else {
                    str = null;
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new amn(arrayList, o, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C4144lb("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    private static byte[] m14258b(alw alw) {
        int p = alw.mo13958p();
        int h = alw.mo13950h();
        alw.mo13954l(p);
        return akt.m13977c(alw.mo13952j(), h, p);
    }
}
