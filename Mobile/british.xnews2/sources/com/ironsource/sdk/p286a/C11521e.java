package com.ironsource.sdk.p286a;

import com.ironsource.mediationsdk.C11412m;
import com.ironsource.sdk.p293g.C11702c;
import com.ironsource.sdk.p293g.C11703d;
import java.util.Map;

/* renamed from: com.ironsource.sdk.a.e */
public class C11521e {

    /* renamed from: a */
    private C11412m f51801a = new C11412m();

    /* renamed from: a */
    public static C11703d.C11708e m51361a(C11702c cVar, C11703d.C11708e eVar) {
        Map<String, String> map;
        return (cVar == null || (map = cVar.f52389d) == null || map.get("rewarded") == null) ? eVar : Boolean.parseBoolean(cVar.f52389d.get("rewarded")) ? C11703d.C11708e.RewardedVideo : C11703d.C11708e.Interstitial;
    }

    /* renamed from: a */
    public static boolean m51362a(C11702c cVar) {
        if (cVar == null || cVar.f52389d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.f52389d.get("inAppBidding"));
    }

    /* renamed from: a */
    public void mo44599a(int i) {
        C11412m.m51068a("sdia", (Object) Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo44600b(int i) {
        C11412m.m51068a("sdra", (Object) Integer.valueOf(i));
    }

    /* renamed from: c */
    public void mo44601c(int i) {
        C11412m.m51068a("sdba", (Object) Integer.valueOf(i));
    }
}
