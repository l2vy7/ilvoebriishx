package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class is2 implements e70 {

    /* renamed from: a */
    public final /* synthetic */ sx2 f33516a;

    /* renamed from: b */
    public final /* synthetic */ f42 f33517b;

    public /* synthetic */ is2(sx2 sx2, f42 f42) {
        this.f33516a = sx2;
        this.f33517b = f42;
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map map) {
        sx2 sx2 = this.f33516a;
        f42 f42 = this.f33517b;
        ot0 ot0 = (ot0) obj;
        String str = (String) map.get("u");
        if (str == null) {
            co0.zzj("URL missing from httpTrack GMSG.");
        } else if (!ot0.mo18740b().f33477g0) {
            sx2.mo34829b(str);
        } else {
            f42.mo31747f(new h42(zzt.zzA().currentTimeMillis(), ((vu0) ot0).mo18780p().f35215b, str, 2));
        }
    }
}
