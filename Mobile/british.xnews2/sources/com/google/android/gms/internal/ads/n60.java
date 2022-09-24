package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class n60 implements e70 {

    /* renamed from: a */
    public static final /* synthetic */ n60 f35909a = new n60();

    private /* synthetic */ n60() {
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map map) {
        gv0 gv0 = (gv0) obj;
        e70<xt0> e70 = d70.f30654a;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            C7497ab zzK = gv0.zzK();
            if (zzK != null) {
                zzK.mo30331c().zzl(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            co0.zzj("Could not parse touch parameters from gmsg.");
        }
    }
}
