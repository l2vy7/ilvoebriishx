package com.ironsource.sdk.p290d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.C11412m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.C11515a;
import com.ironsource.sdk.C11524b;
import com.ironsource.sdk.C11673d;
import com.ironsource.sdk.C11692e;
import com.ironsource.sdk.C11695f;
import com.ironsource.sdk.controller.C11555c;
import com.ironsource.sdk.controller.C11563g;
import com.ironsource.sdk.controller.C11588j;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.p287a.C11516a;
import com.ironsource.sdk.p287a.C11520d;
import com.ironsource.sdk.p287a.C11521e;
import com.ironsource.sdk.p287a.C11522f;
import com.ironsource.sdk.p289c.C11532a;
import com.ironsource.sdk.p293f.C11698b;
import com.ironsource.sdk.p294g.C11699a;
import com.ironsource.sdk.p294g.C11702c;
import com.ironsource.sdk.p294g.C11703d;
import com.ironsource.sdk.p295h.C11717e;
import com.ironsource.sdk.p297j.C11725b;
import com.ironsource.sdk.p297j.C11726c;
import com.ironsource.sdk.p297j.C11728e;
import com.ironsource.sdk.p297j.C11729f;
import com.ironsource.sdk.p297j.p298a.C11721a;
import com.ironsource.sdk.p297j.p298a.C11722b;
import com.ironsource.sdk.p297j.p298a.C11723c;
import com.ironsource.sdk.p297j.p298a.C11724d;
import com.ironsource.sdk.service.C11746a;
import com.ironsource.sdk.service.C11748c;
import com.ironsource.sdk.service.C11752e;
import com.ironsource.sdk.utils.C11755a;
import com.ironsource.sdk.utils.C11756b;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.d.b */
public final class C11675b implements C11691c, C11692e, C11695f, C11721a, C11722b, C11723c, C11724d {

    /* renamed from: l */
    private static C11675b f52281l;

    /* renamed from: a */
    public C11563g f52282a;

    /* renamed from: b */
    private final String f52283b = IronSourceConstants.SUPERSONIC_CONFIG_NAME;

    /* renamed from: c */
    C11728e f52284c;

    /* renamed from: d */
    String f52285d;

    /* renamed from: e */
    String f52286e;

    /* renamed from: f */
    private long f52287f;

    /* renamed from: g */
    C11588j f52288g;

    /* renamed from: h */
    private C11752e f52289h;

    /* renamed from: i */
    private C11748c f52290i;

    /* renamed from: j */
    private boolean f52291j = false;

    /* renamed from: k */
    private C11555c f52292k;

    /* renamed from: com.ironsource.sdk.d.b$a */
    class C11676a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Map f52293b;

        /* renamed from: c */
        private /* synthetic */ C11728e f52294c;

        C11676a(Map map, C11728e eVar) {
            this.f52293b = map;
            this.f52294c = eVar;
        }

        public final void run() {
            C11675b bVar = C11675b.this;
            bVar.f52282a.mo44712a(bVar.f52285d, bVar.f52286e, (Map<String, String>) this.f52293b, this.f52294c);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$b */
    class C11677b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ Map f52296b;

        C11677b(Map map) {
            this.f52296b = map;
        }

        public final void run() {
            C11675b bVar = C11675b.this;
            bVar.f52282a.mo44713a((Map<String, String>) this.f52296b, bVar.f52284c);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$c */
    class C11678c implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f52298b;

        /* renamed from: c */
        private /* synthetic */ String f52299c;

        /* renamed from: d */
        private /* synthetic */ C11728e f52300d;

        C11678c(String str, String str2, C11728e eVar) {
            this.f52298b = str;
            this.f52299c = str2;
            this.f52300d = eVar;
        }

        public final void run() {
            C11675b.this.f52282a.mo44711a(this.f52298b, this.f52299c, this.f52300d);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$d */
    class C11679d implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11728e f52302b;

        C11679d(C11728e eVar) {
            this.f52302b = eVar;
        }

        public final void run() {
            C11675b bVar = C11675b.this;
            bVar.f52282a.mo44711a(bVar.f52285d, bVar.f52286e, this.f52302b);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$e */
    class C11680e implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f52304b;

        /* renamed from: c */
        private /* synthetic */ String f52305c;

        /* renamed from: d */
        private /* synthetic */ C11702c f52306d;

        C11680e(String str, String str2, C11702c cVar) {
            this.f52304b = str;
            this.f52305c = str2;
            this.f52306d = cVar;
        }

        public final void run() {
            C11675b bVar = C11675b.this;
            bVar.f52282a.mo44709a(this.f52304b, this.f52305c, this.f52306d, (C11723c) bVar);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$f */
    class C11681f implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f52308b;

        C11681f(String str) {
            this.f52308b = str;
        }

        public final void run() {
            C11675b bVar = C11675b.this;
            bVar.f52282a.mo44707a(this.f52308b, (C11723c) bVar);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$g */
    class C11682g implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f52310b;

        /* renamed from: c */
        private /* synthetic */ String f52311c;

        /* renamed from: d */
        private /* synthetic */ C11702c f52312d;

        C11682g(String str, String str2, C11702c cVar) {
            this.f52310b = str;
            this.f52311c = str2;
            this.f52312d = cVar;
        }

        public final void run() {
            C11675b bVar = C11675b.this;
            bVar.f52282a.mo44710a(this.f52310b, this.f52311c, this.f52312d, (C11724d) bVar);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$h */
    class C11683h implements Runnable {

        /* renamed from: b */
        private /* synthetic */ JSONObject f52314b;

        C11683h(JSONObject jSONObject) {
            this.f52314b = jSONObject;
        }

        public final void run() {
            C11675b bVar = C11675b.this;
            bVar.f52282a.mo44715a(this.f52314b, (C11723c) bVar);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$i */
    class C11684i implements Runnable {
        C11684i() {
        }

        public final void run() {
            C11675b.this.f52282a.mo44721d();
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$j */
    class C11685j implements Runnable {

        /* renamed from: b */
        private /* synthetic */ JSONObject f52317b;

        C11685j(JSONObject jSONObject) {
            this.f52317b = jSONObject;
        }

        public final void run() {
            C11675b.this.f52282a.mo44714a(this.f52317b);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$k */
    class C11686k implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11524b f52319b;

        /* renamed from: c */
        private /* synthetic */ Map f52320c;

        C11686k(C11524b bVar, Map map) {
            this.f52319b = bVar;
            this.f52320c = map;
        }

        public final void run() {
            C11702c a = C11675b.this.f52288g.mo44754a(C11703d.C11708e.Interstitial, this.f52319b.f51827b);
            if (a != null) {
                C11675b bVar = C11675b.this;
                bVar.f52282a.mo44705a(a, (Map<String, String>) this.f52320c, (C11723c) bVar);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$l */
    class C11687l implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11524b f52322b;

        /* renamed from: c */
        private /* synthetic */ Map f52323c;

        C11687l(C11524b bVar, Map map) {
            this.f52322b = bVar;
            this.f52323c = map;
        }

        public final void run() {
            C11703d.C11708e eVar = this.f52322b.mo44602a() ? C11703d.C11708e.Banner : C11703d.C11708e.Interstitial;
            C11588j jVar = C11675b.this.f52288g;
            C11524b bVar = this.f52322b;
            String str = bVar.f51827b;
            String str2 = bVar.f51828c;
            HashMap hashMap = new HashMap();
            hashMap.put("instanceId", bVar.f51827b);
            hashMap.put("instanceName", bVar.f51828c);
            hashMap.put("rewarded", Boolean.toString(bVar.f51826a));
            hashMap.put("inAppBidding", Boolean.toString(bVar.f51829d));
            hashMap.put("apiVersion", "2");
            C11515a aVar = bVar.f51830e;
            String str3 = SessionDescription.SUPPORTED_SDP_VERSION;
            hashMap.put("width", aVar != null ? Integer.toString(aVar.f51790a) : str3);
            C11515a aVar2 = bVar.f51830e;
            if (aVar2 != null) {
                str3 = Integer.toString(aVar2.f51791b);
            }
            hashMap.put("height", str3);
            C11515a aVar3 = bVar.f51830e;
            hashMap.put("label", aVar3 != null ? aVar3.f51792c : "");
            hashMap.put("isBanner", Boolean.toString(bVar.mo44602a()));
            Map<String, String> map = bVar.f51831f;
            if (map != null) {
                hashMap.putAll(map);
            }
            C11702c cVar = new C11702c(str, str2, hashMap, bVar.f51832g);
            jVar.mo44756a(eVar, str, cVar);
            C11516a aVar4 = new C11516a();
            C11516a a = aVar4.mo44598a("isbiddinginstance", Boolean.valueOf(this.f52322b.f51829d)).mo44598a("demandsourcename", this.f52322b.f51828c).mo44598a("producttype", C11673d.m51707a(this.f52322b));
            C11746a aVar5 = C11746a.f52469a;
            a.mo44598a("custom_c", Long.valueOf(C11746a.m51917c(this.f52322b.f51827b)));
            C11520d.m51360a(C11522f.f51808g, (Map<String, Object>) aVar4.f51793a);
            if (eVar == C11703d.C11708e.Banner) {
                C11675b bVar2 = C11675b.this;
                bVar2.f52282a.mo44708a(bVar2.f52285d, bVar2.f52286e, cVar, (C11722b) bVar2);
                this.f52322b.f51833h = true;
                C11675b bVar3 = C11675b.this;
                bVar3.f52282a.mo44704a(cVar, (Map<String, String>) this.f52323c, (C11722b) bVar3);
                return;
            }
            C11675b bVar4 = C11675b.this;
            bVar4.f52282a.mo44709a(bVar4.f52285d, bVar4.f52286e, cVar, (C11723c) bVar4);
            this.f52322b.f51833h = true;
            C11675b bVar5 = C11675b.this;
            bVar5.f52282a.mo44705a(cVar, (Map<String, String>) this.f52323c, (C11723c) bVar5);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$m */
    class C11688m implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11702c f52325b;

        /* renamed from: c */
        private /* synthetic */ Map f52326c;

        C11688m(C11702c cVar, Map map) {
            this.f52325b = cVar;
            this.f52326c = map;
        }

        public final void run() {
            C11675b bVar = C11675b.this;
            bVar.f52282a.mo44718b(this.f52325b, this.f52326c, bVar);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$n */
    class C11689n implements Runnable {

        /* renamed from: b */
        private /* synthetic */ JSONObject f52328b;

        C11689n(JSONObject jSONObject) {
            this.f52328b = jSONObject;
        }

        public final void run() {
            C11675b bVar = C11675b.this;
            bVar.f52282a.mo44716a(this.f52328b, (C11724d) bVar);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$o */
    class C11690o implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f52330b;

        /* renamed from: c */
        private /* synthetic */ String f52331c;

        /* renamed from: d */
        private /* synthetic */ Map f52332d;

        /* renamed from: e */
        private /* synthetic */ C11728e f52333e;

        C11690o(String str, String str2, Map map, C11728e eVar) {
            this.f52330b = str;
            this.f52331c = str2;
            this.f52332d = map;
            this.f52333e = eVar;
        }

        public final void run() {
            C11675b.this.f52282a.mo44712a(this.f52330b, this.f52331c, (Map<String, String>) this.f52332d, this.f52333e);
        }
    }

    private C11675b(Context context) {
        m51715e(context);
    }

    private C11675b(String str, String str2, Context context) {
        this.f52285d = str;
        this.f52286e = str2;
        m51715e(context);
    }

    /* renamed from: a */
    public static synchronized C11675b m51709a(Context context) {
        C11675b a;
        synchronized (C11675b.class) {
            a = m51710a(context, 0);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized C11675b m51710a(Context context, int i) {
        C11675b bVar;
        synchronized (C11675b.class) {
            Logger.m51953i("IronSourceAdsPublisherAgent", "getInstance()");
            if (f52281l == null) {
                f52281l = new C11675b(context);
            }
            bVar = f52281l;
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized C11692e m51711a(String str, String str2, Context context) {
        C11675b bVar;
        synchronized (C11675b.class) {
            if (f52281l == null) {
                C11520d.m51359a(C11522f.f51802a);
                f52281l = new C11675b(str, str2, context);
            } else {
                C11752e.m51930a().mo45065b(str);
                C11752e.m51930a().mo45060a(str2);
            }
            bVar = f52281l;
        }
        return bVar;
    }

    /* renamed from: b */
    private static C11729f m51712b(C11702c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C11729f) cVar.f52392g;
    }

    /* renamed from: c */
    private void m51713c(Context context, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableLifeCycleListeners", false);
        this.f52291j = optBoolean;
        if (optBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C11674a(this));
            } catch (Throwable th) {
                C11516a aVar = new C11516a();
                aVar.mo44598a("generalmessage", th.getMessage());
                C11520d.m51360a(C11522f.f51819r, (Map<String, Object>) aVar.f51793a);
            }
        }
    }

    /* renamed from: d */
    private static C11726c m51714d(C11702c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C11726c) cVar.f52392g;
    }

    /* renamed from: e */
    private void m51715e(Context context) {
        try {
            C11756b.m51964a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C11717e(SDKUtils.getNetworkConfiguration().optJSONObject("storage")));
            C11756b.m51963a().mo45070a(C11755a.m51960a());
            this.f52289h = m51718h(context);
            this.f52288g = new C11588j();
            C11555c cVar = new C11555c();
            this.f52292k = cVar;
            if (context instanceof Activity) {
                cVar.mo44690a((Activity) context);
            }
            this.f52282a = new C11563g(context, this.f52292k, this.f52289h, this.f52288g);
            Logger.enableLogging(FeaturesManager.getInstance().getDebugMode());
            Logger.m51953i("IronSourceAdsPublisherAgent", "C'tor");
            m51713c(context, SDKUtils.getNetworkConfiguration());
            this.f52290i = new C11748c();
            C11412m.m51068a("sdkv", (Object) "5.108");
            this.f52290i.mo45053a();
            this.f52290i.mo45054a(context);
            this.f52290i.mo45055b();
            this.f52290i.mo45057c();
            this.f52290i.mo45056b(context);
            this.f52287f = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private void m51716f(C11524b bVar, Map<String, String> map) {
        if (bVar.f51833h) {
            m51719i(bVar, map);
        } else {
            m51721k(bVar, map);
        }
    }

    /* renamed from: g */
    private static C11725b m51717g(C11702c cVar) {
        if (cVar == null) {
            return null;
        }
        return (C11725b) cVar.f52392g;
    }

    /* renamed from: h */
    private C11752e m51718h(Context context) {
        C11752e a = C11752e.m51930a();
        a.mo45064b();
        a.mo45059a(context, this.f52285d, this.f52286e);
        return a;
    }

    /* renamed from: i */
    private void m51719i(C11524b bVar, Map<String, String> map) {
        Logger.m51949d("IronSourceAdsPublisherAgent", "loadOnInitializedInstance " + bVar.f51827b);
        this.f52282a.mo44706a((Runnable) new C11686k(bVar, map));
    }

    /* renamed from: j */
    private C11702c m51720j(C11703d.C11708e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f52288g.mo44754a(eVar, str);
    }

    /* renamed from: k */
    private void m51721k(C11524b bVar, Map<String, String> map) {
        Logger.m51949d("IronSourceAdsPublisherAgent", "loadOnNewInstance " + bVar.f51827b);
        this.f52282a.mo44706a((Runnable) new C11687l(bVar, map));
    }

    /* renamed from: a */
    public final void mo44931a() {
        this.f52282a.mo44706a((Runnable) new C11684i());
    }

    /* renamed from: a */
    public final void mo44932a(Activity activity) {
        try {
            Logger.m51953i("IronSourceAdsPublisherAgent", "release()");
            C11755a.m51962b();
            this.f52292k.mo44691b();
            this.f52282a.mo44717b((Context) activity);
            this.f52282a.destroy();
            this.f52282a = null;
        } catch (Exception unused) {
        }
        f52281l = null;
    }

    /* renamed from: a */
    public final void mo44933a(Activity activity, C11524b bVar, Map<String, String> map) {
        this.f52292k.mo44690a(activity);
        long currentTimeMillis = System.currentTimeMillis();
        map.put("loadStartTime", String.valueOf(currentTimeMillis));
        C11746a aVar = C11746a.f52469a;
        C11746a.m51915a(bVar.f51827b, currentTimeMillis);
        C11516a aVar2 = new C11516a();
        aVar2.mo44598a("isbiddinginstance", Boolean.valueOf(bVar.f51829d)).mo44598a("demandsourcename", bVar.f51828c).mo44598a("producttype", C11673d.m51707a(bVar)).mo44598a("custom_c", Long.valueOf(currentTimeMillis));
        C11520d.m51360a(C11522f.f51806e, (Map<String, Object>) aVar2.f51793a);
        Logger.m51949d("IronSourceAdsPublisherAgent", "loadAd " + bVar.f51827b);
        if (bVar.f51829d) {
            try {
                map.put("adm", SDKUtils.decodeString(map.get("adm")));
            } catch (Exception e) {
                C11516a a = new C11516a().mo44598a("callfailreason", e.getMessage()).mo44598a("generalmessage", bVar.f51833h ? C11698b.f52358a : C11698b.f52359b).mo44598a("isbiddinginstance", Boolean.valueOf(bVar.f51829d)).mo44598a("demandsourcename", bVar.f51828c).mo44598a("producttype", C11673d.m51707a(bVar));
                C11746a aVar3 = C11746a.f52469a;
                C11516a a2 = a.mo44598a("custom_c", Long.valueOf(C11746a.m51917c(bVar.f51827b)));
                C11746a.m51916b(bVar.f51827b);
                C11520d.m51360a(C11522f.f51811j, (Map<String, Object>) a2.f51793a);
                e.printStackTrace();
                Logger.m51949d("IronSourceAdsPublisherAgent", "loadInAppBiddingAd failed decoding  ADM " + e.getMessage());
            }
            m51716f(bVar, map);
            return;
        }
        m51716f(bVar, map);
    }

    /* renamed from: a */
    public final void mo44934a(Activity activity, Map<String, String> map) {
        if (activity != null) {
            this.f52292k.mo44690a(activity);
        }
        this.f52282a.mo44706a((Runnable) new C11677b(map));
    }

    /* renamed from: a */
    public final void mo44935a(C11524b bVar, Map<String, String> map) {
        Logger.m51953i("IronSourceAdsPublisherAgent", "showAd " + bVar.f51827b);
        C11702c a = this.f52288g.mo44754a(C11703d.C11708e.Interstitial, bVar.f51827b);
        if (a != null) {
            this.f52282a.mo44706a((Runnable) new C11688m(a, map));
        }
    }

    /* renamed from: a */
    public final void mo44936a(C11703d.C11708e eVar, String str) {
        C11726c d;
        C11702c j = m51720j(eVar, str);
        if (j == null) {
            return;
        }
        if (eVar == C11703d.C11708e.RewardedVideo) {
            C11729f b = m51712b(j);
            if (b != null) {
                b.onRVAdClosed();
            }
        } else if (eVar == C11703d.C11708e.Interstitial && (d = m51714d(j)) != null) {
            d.onInterstitialClose();
        }
    }

    /* renamed from: a */
    public final void mo44937a(C11703d.C11708e eVar, String str, C11699a aVar) {
        C11725b g;
        C11702c j = m51720j(eVar, str);
        if (j != null) {
            j.mo45000a(2);
            if (eVar == C11703d.C11708e.RewardedVideo) {
                C11729f b = m51712b(j);
                if (b != null) {
                    b.onRVInitSuccess(aVar);
                }
            } else if (eVar == C11703d.C11708e.Interstitial) {
                C11726c d = m51714d(j);
                if (d != null) {
                    d.onInterstitialInitSuccess();
                }
            } else if (eVar == C11703d.C11708e.Banner && (g = m51717g(j)) != null) {
                g.onBannerInitSuccess();
            }
        }
    }

    /* renamed from: a */
    public final void mo44938a(C11703d.C11708e eVar, String str, String str2) {
        C11725b g;
        C11702c j = m51720j(eVar, str);
        C11516a a = new C11516a().mo44598a("demandsourcename", str).mo44598a("producttype", eVar).mo44598a("callfailreason", str2);
        C11746a aVar = C11746a.f52469a;
        C11516a a2 = a.mo44598a("custom_c", Long.valueOf(C11746a.m51917c(j.f52387b)));
        C11746a.m51916b(j.f52387b);
        a2.mo44598a("isbiddinginstance", Boolean.valueOf(C11521e.m51362a(j)));
        j.mo45000a(3);
        if (eVar == C11703d.C11708e.RewardedVideo) {
            C11729f b = m51712b(j);
            if (b != null) {
                b.onRVInitFail(str2);
            }
        } else if (eVar == C11703d.C11708e.Interstitial) {
            C11726c d = m51714d(j);
            if (d != null) {
                d.onInterstitialInitFailed(str2);
            }
        } else if (eVar == C11703d.C11708e.Banner && (g = m51717g(j)) != null) {
            g.onBannerInitFailed(str2);
        }
        C11520d.m51360a(C11522f.f51809h, (Map<String, Object>) a2.f51793a);
    }

    /* renamed from: a */
    public final void mo44939a(C11703d.C11708e eVar, String str, String str2, JSONObject jSONObject) {
        C11725b g;
        C11702c j = m51720j(eVar, str);
        if (j != null && !TextUtils.isEmpty(str2)) {
            try {
                Logger.m51953i("IronSourceAdsPublisherAgent", "Received Event Notification: " + str2 + " for demand source: " + j.f52386a);
                if (eVar == C11703d.C11708e.Interstitial) {
                    C11726c d = m51714d(j);
                    if (d != null) {
                        jSONObject.put("demandSourceName", str);
                        d.onInterstitialEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == C11703d.C11708e.RewardedVideo) {
                    C11729f b = m51712b(j);
                    if (b != null) {
                        jSONObject.put("demandSourceName", str);
                        b.onRVEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == C11703d.C11708e.Banner && (g = m51717g(j)) != null) {
                    jSONObject.put("demandSourceName", str);
                    if (str2.equalsIgnoreCase("impressions")) {
                        g.onBannerShowSuccess();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo44940a(C11728e eVar) {
        this.f52282a.mo44706a((Runnable) new C11679d(eVar));
    }

    /* renamed from: a */
    public final void mo44941a(String str, int i) {
        C11729f b;
        C11702c j = m51720j(C11703d.C11708e.RewardedVideo, str);
        if (j != null && (b = m51712b(j)) != null) {
            b.onRVAdCredited(i);
        }
    }

    /* renamed from: a */
    public final void mo44942a(String str, C11532a aVar) {
        C11725b g;
        C11702c j = m51720j(C11703d.C11708e.Banner, str);
        if (j != null && (g = m51717g(j)) != null) {
            g.onBannerLoadSuccess(aVar);
        }
    }

    /* renamed from: a */
    public final void mo44943a(String str, String str2) {
        C11729f b;
        C11702c j = m51720j(C11703d.C11708e.RewardedVideo, str);
        if (j != null && (b = m51712b(j)) != null) {
            b.onRVShowFail(str2);
        }
    }

    /* renamed from: a */
    public final void mo44944a(String str, String str2, int i) {
        C11703d.C11708e productType;
        C11702c a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (productType = SDKUtils.getProductType(str)) != null && (a = this.f52288g.mo44754a(productType, str2)) != null) {
            a.f52388c = i;
        }
    }

    /* renamed from: a */
    public final void mo44945a(String str, String str2, C11728e eVar) {
        this.f52285d = str;
        this.f52286e = str2;
        this.f52282a.mo44706a((Runnable) new C11678c(str, str2, eVar));
    }

    /* renamed from: a */
    public final void mo44946a(String str, String str2, String str3, Map<String, String> map, C11726c cVar) {
        this.f52285d = str;
        this.f52286e = str2;
        this.f52282a.mo44706a((Runnable) new C11680e(str, str2, this.f52288g.mo44755a(C11703d.C11708e.Interstitial, str3, map, cVar)));
    }

    /* renamed from: a */
    public final void mo44947a(String str, String str2, String str3, Map<String, String> map, C11729f fVar) {
        this.f52285d = str;
        this.f52286e = str2;
        this.f52282a.mo44706a((Runnable) new C11682g(str, str2, this.f52288g.mo44755a(C11703d.C11708e.RewardedVideo, str3, map, fVar)));
    }

    /* renamed from: a */
    public final void mo44948a(String str, String str2, Map<String, String> map, C11728e eVar) {
        this.f52285d = str;
        this.f52286e = str2;
        this.f52284c = eVar;
        this.f52282a.mo44706a((Runnable) new C11690o(str, str2, map, eVar));
    }

    /* renamed from: a */
    public final void mo44949a(Map<String, String> map, C11728e eVar) {
        this.f52284c = eVar;
        this.f52282a.mo44706a((Runnable) new C11676a(map, eVar));
    }

    /* renamed from: a */
    public final void mo44950a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gdprConsentStatus")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("consent", Boolean.parseBoolean(jSONObject.getString("gdprConsentStatus")));
                this.f52289h.mo45062a(jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.f52282a.mo44706a((Runnable) new C11685j(jSONObject));
    }

    /* renamed from: a */
    public final boolean mo44951a(C11524b bVar) {
        Logger.m51949d("IronSourceAdsPublisherAgent", "isAdAvailable " + bVar.f51827b);
        C11702c a = this.f52288g.mo44754a(C11703d.C11708e.Interstitial, bVar.f51827b);
        if (a == null) {
            return false;
        }
        return a.f52391f;
    }

    /* renamed from: a */
    public final boolean mo44952a(String str) {
        return this.f52282a.mo44720c(str);
    }

    /* renamed from: b */
    public final void mo44953b(Activity activity) {
        if (!this.f52291j) {
            mo44964d(activity);
        }
    }

    /* renamed from: b */
    public final void mo44954b(C11703d.C11708e eVar, String str) {
        C11725b g;
        C11702c j = m51720j(eVar, str);
        if (j == null) {
            return;
        }
        if (eVar == C11703d.C11708e.RewardedVideo) {
            C11729f b = m51712b(j);
            if (b != null) {
                b.onRVAdClicked();
            }
        } else if (eVar == C11703d.C11708e.Interstitial) {
            C11726c d = m51714d(j);
            if (d != null) {
                d.onInterstitialClick();
            }
        } else if (eVar == C11703d.C11708e.Banner && (g = m51717g(j)) != null) {
            g.onBannerClick();
        }
    }

    /* renamed from: b */
    public final void mo44955b(String str) {
        C11729f b;
        C11702c j = m51720j(C11703d.C11708e.RewardedVideo, str);
        if (j != null && (b = m51712b(j)) != null) {
            b.onRVNoMoreOffers();
        }
    }

    /* renamed from: b */
    public final void mo44956b(String str, int i) {
        C11702c j = m51720j(C11703d.C11708e.Interstitial, str);
        C11726c d = m51714d(j);
        if (j != null && d != null) {
            d.onInterstitialAdRewarded(str, i);
        }
    }

    /* renamed from: b */
    public final void mo44957b(String str, String str2) {
        C11703d.C11708e eVar = C11703d.C11708e.Interstitial;
        C11702c j = m51720j(eVar, str);
        C11516a aVar = new C11516a();
        aVar.mo44598a("callfailreason", str2).mo44598a("demandsourcename", str);
        if (j != null) {
            C11516a a = aVar.mo44598a("producttype", C11521e.m51361a(j, eVar)).mo44598a("generalmessage", j.f52390e == 2 ? C11698b.f52358a : C11698b.f52359b).mo44598a("isbiddinginstance", Boolean.valueOf(C11521e.m51362a(j)));
            C11746a aVar2 = C11746a.f52469a;
            a.mo44598a("custom_c", Long.valueOf(C11746a.m51917c(j.f52387b)));
            C11746a.m51916b(j.f52387b);
            C11726c d = m51714d(j);
            if (d != null) {
                d.onInterstitialLoadFailed(str2);
            }
        }
        C11520d.m51360a(C11522f.f51807f, (Map<String, Object>) aVar.f51793a);
    }

    /* renamed from: b */
    public final void mo44958b(JSONObject jSONObject) {
        this.f52282a.mo44706a((Runnable) new C11689n(jSONObject));
    }

    /* renamed from: c */
    public final void mo44959c(Activity activity) {
        if (!this.f52291j) {
            mo44968e(activity);
        }
    }

    /* renamed from: c */
    public final void mo44960c(C11703d.C11708e eVar, String str) {
        C11729f b;
        C11702c j = m51720j(eVar, str);
        if (j == null) {
            return;
        }
        if (eVar == C11703d.C11708e.Interstitial) {
            C11726c d = m51714d(j);
            if (d != null) {
                d.onInterstitialOpen();
            }
        } else if (eVar == C11703d.C11708e.RewardedVideo && (b = m51712b(j)) != null) {
            b.onRVAdOpened();
        }
    }

    /* renamed from: c */
    public final void mo44961c(String str) {
        C11703d.C11708e eVar = C11703d.C11708e.Interstitial;
        C11702c j = m51720j(eVar, str);
        C11516a a = new C11516a().mo44598a("demandsourcename", str);
        if (j != null) {
            C11516a a2 = a.mo44598a("producttype", C11521e.m51361a(j, eVar)).mo44598a("isbiddinginstance", Boolean.valueOf(C11521e.m51362a(j)));
            C11746a aVar = C11746a.f52469a;
            a2.mo44598a("custom_c", Long.valueOf(C11746a.m51917c(j.f52387b)));
            C11746a.m51916b(j.f52387b);
            C11726c d = m51714d(j);
            if (d != null) {
                d.onInterstitialLoadSuccess();
            }
        }
        C11520d.m51360a(C11522f.f51812k, (Map<String, Object>) a.f51793a);
    }

    /* renamed from: c */
    public final void mo44962c(String str, String str2) {
        C11726c d;
        C11702c j = m51720j(C11703d.C11708e.Interstitial, str);
        if (j != null && (d = m51714d(j)) != null) {
            d.onInterstitialShowFailed(str2);
        }
    }

    /* renamed from: c */
    public final void mo44963c(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceName");
        if (!TextUtils.isEmpty(optString)) {
            this.f52282a.mo44706a((Runnable) new C11681f(optString));
        }
    }

    /* renamed from: d */
    public final void mo44964d(Activity activity) {
        try {
            this.f52282a.mo44724f();
            this.f52282a.mo44717b((Context) activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public final void mo44965d(String str) {
        C11726c d;
        C11702c j = m51720j(C11703d.C11708e.Interstitial, str);
        if (j != null && (d = m51714d(j)) != null) {
            d.onInterstitialShowSuccess();
        }
    }

    /* renamed from: d */
    public final void mo44966d(String str, String str2) {
        C11725b g;
        C11702c j = m51720j(C11703d.C11708e.Banner, str);
        if (j != null && (g = m51717g(j)) != null) {
            g.onBannerLoadFail(str2);
        }
    }

    /* renamed from: d */
    public final void mo44967d(JSONObject jSONObject) {
        this.f52282a.mo44706a((Runnable) new C11683h(jSONObject));
    }

    /* renamed from: e */
    public final void mo44968e(Activity activity) {
        this.f52292k.mo44690a(activity);
        this.f52282a.mo44723e();
        this.f52282a.mo44703a((Context) activity);
    }
}
