package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class hs2 implements e70 {

    /* renamed from: a */
    public final /* synthetic */ gi1 f32832a;

    /* renamed from: b */
    public final /* synthetic */ sx2 f32833b;

    /* renamed from: c */
    public final /* synthetic */ f42 f32834c;

    public /* synthetic */ hs2(gi1 gi1, sx2 sx2, f42 f42) {
        this.f32832a = gi1;
        this.f32833b = sx2;
        this.f32834c = f42;
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map map) {
        gi1 gi1 = this.f32832a;
        sx2 sx2 = this.f32833b;
        f42 f42 = this.f32834c;
        xt0 xt0 = (xt0) obj;
        d70.m31261d(map, gi1);
        String str = (String) map.get("u");
        if (str == null) {
            co0.zzj("URL missing from click GMSG.");
        } else {
            bb3.m30658r(d70.m31259b(xt0, str), new js2(xt0, sx2, f42), po0.f37722a);
        }
    }
}
