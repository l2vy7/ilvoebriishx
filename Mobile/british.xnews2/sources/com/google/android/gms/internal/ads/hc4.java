package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hc4 {
    /* renamed from: a */
    public static zzdd m32853a(wb4 wb4, boolean z) throws IOException {
        zzdd a = new oc4().mo33867a(wb4, z ? null : se4.f38960a);
        if (a == null || a.mo36273a() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: b */
    public static jc4 m32854b(uq2 uq2) {
        uq2.mo35237g(1);
        int u = uq2.mo35251u();
        long k = ((long) uq2.mo35241k()) + ((long) u);
        int i = u / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long z = uq2.mo35256z();
            if (z == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = z;
            jArr2[i2] = uq2.mo35256z();
            uq2.mo35237g(2);
            i2++;
        }
        uq2.mo35237g((int) (k - ((long) uq2.mo35241k())));
        return new jc4(jArr, jArr2);
    }
}
