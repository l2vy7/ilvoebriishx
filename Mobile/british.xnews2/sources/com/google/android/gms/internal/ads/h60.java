package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class h60 implements e70 {

    /* renamed from: a */
    public final /* synthetic */ gi1 f32631a;

    public /* synthetic */ h60(gi1 gi1) {
        this.f32631a = gi1;
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        d70.m31261d(map, this.f32631a);
        String str = (String) map.get("u");
        if (str == null) {
            co0.zzj("URL missing from click GMSG.");
        } else {
            bb3.m30658r(d70.m31259b(xt0, str), new u60(xt0), po0.f37722a);
        }
    }
}
