package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzcc;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class m60 implements e70 {

    /* renamed from: a */
    public static final /* synthetic */ m60 f35417a = new m60();

    private /* synthetic */ m60() {
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map map) {
        zu0 zu0 = (zu0) obj;
        e70<xt0> e70 = d70.f30654a;
        String str = (String) map.get("u");
        if (str == null) {
            co0.zzj("URL missing from httpTrack GMSG.");
        } else {
            new zzcc(zu0.getContext(), ((hv0) zu0).zzp().f43036b, str).zzb();
        }
    }
}
