package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Looper;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agh */
/* compiled from: IMASDK */
final class agh extends acg {

    /* renamed from: a */
    private final Map<String, C4276pz> f14646a;

    /* renamed from: b */
    private C4276pz f14647b;

    /* synthetic */ agh(ajl ajl, Looper looper, C4286qi qiVar, C4281qd qdVar, Map map) {
        super(ajl, looper, qiVar, qdVar);
        this.f14646a = map;
    }

    /* renamed from: J */
    public final C4120ke mo13400J(C4120ke keVar) {
        C4276pz pzVar;
        C4276pz pzVar2 = this.f14647b;
        if (pzVar2 == null) {
            pzVar2 = keVar.f17684o;
        }
        if (!(pzVar2 == null || (pzVar = this.f14646a.get(pzVar2.f18417a)) == null)) {
            pzVar2 = pzVar;
        }
        C4507yn ynVar = keVar.f17679j;
        if (ynVar != null) {
            int a = ynVar.mo16831a();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= a) {
                    i2 = -1;
                    break;
                }
                C4506ym b = ynVar.mo16832b(i2);
                if ((b instanceof C4533zm) && HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(((C4533zm) b).f19762a)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (a != 1) {
                    C4506ym[] ymVarArr = new C4506ym[(a - 1)];
                    while (i < a) {
                        if (i != i2) {
                            ymVarArr[i < i2 ? i : i - 1] = ynVar.mo16832b(i);
                        }
                        i++;
                    }
                    ynVar = new C4507yn(ymVarArr);
                }
            }
            if (!(pzVar2 == keVar.f17684o && ynVar == keVar.f17679j)) {
                C4119kd a2 = keVar.mo16126a();
                a2.mo16100L(pzVar2);
                a2.mo16112X(ynVar);
                keVar = a2.mo16115a();
            }
            return super.mo13400J(keVar);
        }
        ynVar = null;
        C4119kd a22 = keVar.mo16126a();
        a22.mo16100L(pzVar2);
        a22.mo16112X(ynVar);
        keVar = a22.mo16115a();
        return super.mo13400J(keVar);
    }

    /* renamed from: O */
    public final void mo13651O(afx afx) {
        mo13413k(afx.f14576a);
    }

    /* renamed from: P */
    public final void mo13652P(C4276pz pzVar) {
        this.f14647b = pzVar;
        mo13399I();
    }
}
