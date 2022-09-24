package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.p4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8037p4 {
    /* renamed from: a */
    public static C7966n4 m35949a(wb4 wb4) throws IOException {
        byte[] bArr;
        uq2 uq2 = new uq2(16);
        if (C8002o4.m35561a(wb4, uq2).f36268a != 1380533830) {
            return null;
        }
        qb4 qb4 = (qb4) wb4;
        qb4.mo33311e(uq2.mo35238h(), 0, 4, false);
        uq2.mo35236f(0);
        int m = uq2.mo35243m();
        if (m != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(m);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        C8002o4 a = C8002o4.m35561a(wb4, uq2);
        while (a.f36268a != 1718449184) {
            qb4.mo34304j((int) a.f36269b, false);
            a = C8002o4.m35561a(wb4, uq2);
        }
        nu1.m20747f(a.f36269b >= 16);
        qb4.mo33311e(uq2.mo35238h(), 0, 16, false);
        uq2.mo35236f(0);
        int q = uq2.mo35247q();
        int q2 = uq2.mo35247q();
        int p = uq2.mo35246p();
        int p2 = uq2.mo35246p();
        int q3 = uq2.mo35247q();
        int q4 = uq2.mo35247q();
        int i = ((int) a.f36269b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            qb4.mo33311e(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = d13.f20200f;
        }
        return new C7966n4(q, q2, p, p2, q3, q4, bArr);
    }
}
