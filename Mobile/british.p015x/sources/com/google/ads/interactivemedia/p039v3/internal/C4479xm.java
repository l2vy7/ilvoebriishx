package com.google.ads.interactivemedia.p039v3.internal;

import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xm */
/* compiled from: IMASDK */
final class C4479xm {
    /* renamed from: a */
    public static C4477xk m19463a(C4307rc rcVar) throws IOException {
        byte[] bArr;
        aup.m14890u(rcVar);
        alw alw = new alw(16);
        if (C4478xl.m19462a(rcVar, alw).f19573a != 1380533830) {
            return null;
        }
        rcVar.mo16600g(alw.mo13952j(), 0, 4);
        alw.mo13951i(0);
        int w = alw.mo13965w();
        if (w != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(w);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        C4478xl a = C4478xl.m19462a(rcVar, alw);
        while (a.f19573a != 1718449184) {
            rcVar.mo16602i((int) a.f19574b);
            a = C4478xl.m19462a(rcVar, alw);
        }
        aup.m14887r(a.f19574b >= 16);
        rcVar.mo16600g(alw.mo13952j(), 0, 16);
        alw.mo13951i(0);
        int q = alw.mo13959q();
        int q2 = alw.mo13959q();
        int D = alw.mo13935D();
        alw.mo13935D();
        int q3 = alw.mo13959q();
        int q4 = alw.mo13959q();
        int i = ((int) a.f19574b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            rcVar.mo16600g(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = amm.f15303f;
        }
        return new C4477xk(q, q2, D, q3, q4, bArr);
    }
}
