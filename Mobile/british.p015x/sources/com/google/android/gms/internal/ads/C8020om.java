package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.om */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8020om {

    /* renamed from: a */
    public final List<byte[]> f36532a;

    /* renamed from: b */
    public final int f36533b;

    private C8020om(List<byte[]> list, int i) {
        this.f36532a = list;
        this.f36533b = i;
    }

    /* renamed from: a */
    public static C8020om m35760a(C7544bm bmVar) throws C8153se {
        List list;
        try {
            bmVar.mo30726w(21);
            int g = bmVar.mo30710g() & 3;
            int g2 = bmVar.mo30710g();
            int c = bmVar.mo30706c();
            int i = 0;
            for (int i2 = 0; i2 < g2; i2++) {
                bmVar.mo30726w(1);
                int j = bmVar.mo30713j();
                for (int i3 = 0; i3 < j; i3++) {
                    int j2 = bmVar.mo30713j();
                    i += j2 + 4;
                    bmVar.mo30726w(j2);
                }
            }
            bmVar.mo30725v(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < g2; i5++) {
                bmVar.mo30726w(1);
                int j3 = bmVar.mo30713j();
                for (int i6 = 0; i6 < j3; i6++) {
                    int j4 = bmVar.mo30713j();
                    System.arraycopy(C8410zl.f42494a, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(bmVar.f30037a, bmVar.mo30706c(), bArr, i7, j4);
                    i4 = i7 + j4;
                    bmVar.mo30726w(j4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C8020om(list, g + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C8153se("Error parsing HEVC config", e);
        }
    }
}
