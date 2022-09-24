package com.adcolony.sdk;

import com.adcolony.sdk.C2686a0;
import java.util.Date;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.t */
class C2919t extends C2686a0 {

    /* renamed from: i */
    static final C2972w f11761i = new C2972w("adcolony_fatal_reports", "4.5.0", "Production");

    /* renamed from: j */
    static final String f11762j = "sourceFile";

    /* renamed from: k */
    static final String f11763k = "lineNumber";

    /* renamed from: l */
    static final String f11764l = "methodName";

    /* renamed from: m */
    static final String f11765m = "stackTrace";

    /* renamed from: n */
    static final String f11766n = "isAdActive";

    /* renamed from: o */
    static final String f11767o = "activeAdId";

    /* renamed from: p */
    static final String f11768p = "active_creative_ad_id";

    /* renamed from: q */
    static final String f11769q = "listOfCachedAds";

    /* renamed from: r */
    static final String f11770r = "listOfCreativeAdIds";

    /* renamed from: s */
    static final String f11771s = "adCacheSize";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public JSONObject f11772h;

    /* renamed from: com.adcolony.sdk.t$a */
    private class C2920a extends C2686a0.C2687a {
        C2920a() {
            this.f10595a = new C2919t();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2920a mo9986a(JSONObject jSONObject) {
            JSONObject unused = ((C2919t) this.f10595a).f11772h = jSONObject;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2686a0.C2687a mo9544a(Date date) {
            C2976x.m10313a(((C2919t) this.f10595a).f11772h, "timestamp", C2686a0.f10588e.format(date));
            return super.mo9544a(date);
        }
    }

    C2919t() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public JSONObject mo9985f() {
        return this.f11772h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2919t mo9984a(JSONObject jSONObject) {
        C2920a aVar = new C2920a();
        aVar.mo9986a(jSONObject);
        aVar.mo9543a(C2976x.m10337i(jSONObject, "message"));
        try {
            aVar.mo9544a(new Date(Long.parseLong(C2976x.m10337i(jSONObject, "timestamp"))));
        } catch (NumberFormatException unused) {
        }
        aVar.mo9542a(f11761i);
        aVar.mo9541a(-1);
        return (C2919t) aVar.mo9545a();
    }
}
