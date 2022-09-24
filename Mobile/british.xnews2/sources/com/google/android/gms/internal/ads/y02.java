package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y02 implements a12 {

    /* renamed from: a */
    private final Map<String, iv3<a12>> f41628a;

    /* renamed from: b */
    private final nb3 f41629b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final id1 f41630c;

    public y02(Map<String, iv3<a12>> map, nb3 nb3, id1 id1) {
        this.f41628a = map;
        this.f41629b = nb3;
        this.f41630c = id1;
    }

    /* renamed from: a */
    public final mb3<ur2> mo30278a(zzcdq zzcdq) {
        this.f41630c.mo18437h0(zzcdq);
        mb3<ur2> h = bb3.m30648h(new wy1(3));
        for (String trim : ((String) C8311wv.m39277c().mo18570b(p00.f37029Y5)).split(",")) {
            iv3 iv3 = this.f41628a.get(trim.trim());
            if (iv3 != null) {
                h = bb3.m30647g(h, wy1.class, new w02(iv3, zzcdq), this.f41629b);
            }
        }
        bb3.m30658r(h, new x02(this), po0.f37727f);
        return h;
    }
}
