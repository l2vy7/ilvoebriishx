package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.ironsource.environment.C4961c;
import com.ironsource.environment.C4979h;
import com.ironsource.environment.C4983j;
import com.ironsource.environment.C4985l;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p057a.C4957b;
import com.ironsource.environment.p059c.C4966b;
import com.ironsource.mediationsdk.adunit.p277a.C11308a;
import com.ironsource.mediationsdk.p276a.C11291c;
import com.ironsource.mediationsdk.p276a.C11296h;
import com.ironsource.mediationsdk.p286c.C11361b;
import com.ironsource.mediationsdk.utils.C11483b;
import com.ironsource.mediationsdk.utils.C11491g;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p304e8.C12691c;

/* renamed from: com.ironsource.mediationsdk.f */
public final class C11377f {

    /* renamed from: a */
    private static C11377f f51104a = new C11377f();

    /* renamed from: com.ironsource.mediationsdk.f$a */
    public static class C11378a {

        /* renamed from: a */
        String f51105a;

        /* renamed from: b */
        List<C11291c> f51106b;

        /* renamed from: c */
        C11291c f51107c;

        /* renamed from: d */
        JSONObject f51108d;

        /* renamed from: e */
        int f51109e;

        /* renamed from: f */
        String f51110f;
    }

    /* renamed from: com.ironsource.mediationsdk.f$b */
    static class C11379b extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        private String f51111a;

        /* renamed from: b */
        private String f51112b;

        /* renamed from: c */
        private String f51113c;

        public C11379b(String str, String str2, String str3) {
            this.f51111a = str;
            this.f51112b = str2;
            this.f51113c = str3;
        }

        /* renamed from: a */
        private static Boolean m50873a(String... strArr) {
            try {
                boolean z = false;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(DefaultControlDispatcher.DEFAULT_FAST_FORWARD_MS);
                httpURLConnection.setConnectTimeout(DefaultControlDispatcher.DEFAULT_FAST_FORWARD_MS);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode == 200 || responseCode == 204) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m50873a((String[]) objArr);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
                    jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                    jSONObject.put(IronSourceConstants.EVENTS_EXT1, this.f51111a + ";" + this.f51112b + ";" + this.f51113c);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C11296h.m50466e().mo43979b(new C11308a(IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, jSONObject));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.f$c */
    enum C11380c {
        ;
        

        /* renamed from: a */
        public static final int f51114a = 1;

        /* renamed from: b */
        public static final int f51115b = 2;

        static {
            f51116c = new int[]{1, 2};
        }
    }

    /* renamed from: a */
    public static C11291c m50855a(String str, List<C11291c> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).mo44004a().equals(str)) {
                return list.get(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C11377f m50856a() {
        return f51104a;
    }

    /* renamed from: a */
    public static String m50857a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace("${INSTANCE}", str2).replace("${INSTANCE_TYPE}", Integer.toString(i)).replace("${DYNAMIC_DEMAND_SOURCE}", str3).replace("${PLACEMENT_NAME}", str7);
    }

    /* renamed from: b */
    static C11378a m50858b(JSONObject jSONObject) {
        String optString = jSONObject.optString(IronSourceConstants.EVENTS_AUCTION_ID);
        if (!TextUtils.isEmpty(optString)) {
            C11378a aVar = new C11378a();
            aVar.f51105a = optString;
            JSONObject jSONObject2 = null;
            if (jSONObject.has("settings")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("settings");
                aVar.f51107c = new C11291c(jSONObject3);
                if (jSONObject3.has("armData")) {
                    jSONObject2 = jSONObject3.optJSONObject("armData");
                }
                if (jSONObject3.has(IronSourceConstants.EVENTS_GENERIC_PARAMS)) {
                    aVar.f51108d = jSONObject3.optJSONObject(IronSourceConstants.EVENTS_GENERIC_PARAMS);
                }
            }
            aVar.f51106b = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("waterfall");
            int i = 0;
            while (i < jSONArray.length()) {
                C11291c cVar = new C11291c(jSONArray.getJSONObject(i), jSONObject2);
                if (cVar.mo44010g()) {
                    aVar.f51106b.add(cVar);
                    i++;
                } else {
                    aVar.f51109e = 1002;
                    aVar.f51110f = "waterfall " + i;
                    throw new JSONException("invalid response");
                }
            }
            return aVar;
        }
        throw new JSONException("Invalid auction response - auction id is missing");
    }

    /* renamed from: b */
    public static Map<String, String> m50859b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return hashMap;
    }

    /* renamed from: c */
    public static String m50860c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException unused) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m50861d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            return jSONObject2.has(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID) ? jSONObject2.getString(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID) : "";
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: e */
    static JSONObject m50862e(String str) {
        try {
            return new JSONObject(IronSourceAES.decode(C11491g.m51272a().mo44552b(), str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static JSONObject m50863g(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (list.contains(next)) {
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: i */
    static void m50864i(String str, String str2, String str3) {
        new C11379b(str, str2, str3).execute(new String[]{str3});
    }

    /* renamed from: j */
    private void m50865j(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject2 != null) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.has(next)) {
                    int i = 0;
                    str = next;
                    while (jSONObject.has(str)) {
                        i++;
                        str = next + "_" + i;
                    }
                } else {
                    str = next;
                }
                try {
                    jSONObject.put(str, jSONObject2.opt(next));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: k */
    private static int m50866k() {
        int i = C11380c.f51115b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                return i;
            }
        } else if (i2 >= 23) {
            if (!((ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0)) {
                return i;
            }
        }
        return C11380c.f51114a;
    }

    /* renamed from: l */
    static String m50867l(JSONObject jSONObject) {
        return IronSourceAES.encode(C11491g.m51272a().mo44552b(), jSONObject.toString());
    }

    /* renamed from: m */
    private JSONObject m50868m(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    HashMap<String, String> hashMap = C4985l.f22056b;
                    String str = hashMap.containsKey(next) ? hashMap.get(next) : next;
                    if ((list.isEmpty() && !C4985l.f22055a.contains(str) && !str.startsWith("metadata_")) || list.contains(str)) {
                        jSONObject2.put(str, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final String mo44254a(String str, int i, C11291c cVar, String str2, String str3, String str4) {
        String str5;
        String c = cVar.mo44006c();
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(str2)) {
            double parseDouble = Double.parseDouble(c);
            double parseDouble2 = Double.parseDouble(str2);
            if (parseDouble2 != 0.0d) {
                double round = (double) Math.round((parseDouble / parseDouble2) * 1000.0d);
                Double.isNaN(round);
                str5 = String.valueOf(round / 1000.0d);
                return m50857a(str, cVar.mo44004a(), i, m50861d(cVar.mo44005b()), c, str5, str3, str4);
            }
        }
        str5 = "";
        return m50857a(str, cVar.mo44004a(), i, m50861d(cVar.mo44005b()), c, str5, str3, str4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final JSONObject mo44255c(Context context, Map<String, Object> map, List<String> list, C11392i iVar, int i, String str, C11483b bVar, ISBannerSize iSBannerSize) {
        String str2;
        String str3;
        C11392i iVar2 = iVar;
        JSONObject jSONObject = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceType", 2);
            Map<String, Object> map2 = map;
            jSONObject2.put("biddingAdditionalData", new JSONObject((Map) map.get(next)));
            if (iVar2 != null) {
                str2 = iVar.mo44294a(next);
            }
            jSONObject2.put("performance", str2);
            jSONObject.put(next, jSONObject2);
        }
        if (list != null) {
            for (String next2 : list) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("instanceType", 1);
                jSONObject3.put("performance", iVar2 != null ? iVar.mo44294a(next2) : str2);
                jSONObject.put(next2, jSONObject3);
            }
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = C11369d.m50788a().f51059g;
        concurrentHashMap.putAll(C11361b.m50766a().mo44212d());
        JSONObject jSONObject4 = new JSONObject();
        for (Map.Entry next3 : concurrentHashMap.entrySet()) {
            jSONObject4.put((String) next3.getKey(), TextUtils.join(",", (Iterable) next3.getValue()));
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("applicationUserId", C11232E.m50103a().f50419k);
        Boolean bool = C11232E.m50103a().f50388P;
        if (bool != null) {
            jSONObject5.put("consent", bool.booleanValue() ? 1 : 0);
        }
        jSONObject5.put("mobileCarrier", C4979h.m22808j(context));
        jSONObject5.put("connectionType", IronSourceUtils.getConnectionType(context));
        jSONObject5.put("deviceOS", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        jSONObject5.put("deviceWidth", context.getResources().getConfiguration().screenWidthDp);
        jSONObject5.put("deviceHeight", context.getResources().getConfiguration().screenHeightDp);
        jSONObject5.put("deviceOSVersion", Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")");
        jSONObject5.put("deviceModel", Build.MODEL);
        jSONObject5.put("deviceMake", Build.MANUFACTURER);
        jSONObject5.put("bundleId", context.getPackageName());
        Context context2 = context;
        jSONObject5.put("appVersion", C4961c.m22745c(context, context.getPackageName()));
        jSONObject5.put("clientTimestamp", new Date().getTime());
        jSONObject5.put("fs", IronSourceUtils.getFirstSession(context) ? 1 : 0);
        jSONObject5.put("browserUserAgent", C4979h.m22824r());
        jSONObject5.put("deviceType", IronSourceUtils.getDeviceType(context));
        jSONObject5.put("deviceLang", Locale.getDefault().getLanguage());
        jSONObject5.put("secure", m50866k() - 1);
        if (iSBannerSize != null) {
            jSONObject5.put("bannerSize", iSBannerSize.getDescription());
            jSONObject5.put("bannerWidth", iSBannerSize.getWidth());
            jSONObject5.put("bannerHeight", iSBannerSize.getHeight());
        }
        boolean z = false;
        try {
            String[] a = C4979h.m22787a(context);
            str3 = !TextUtils.isEmpty(a[0]) ? a[0] : str2;
            try {
                z = Boolean.valueOf(a[1]).booleanValue();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            str2 = IronSourceConstants.TYPE_GAID;
        } else {
            str3 = C4979h.m22833y(context);
            if (!TextUtils.isEmpty(str3)) {
                str2 = IronSourceConstants.TYPE_UUID;
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            jSONObject5.put("advId", str3);
            jSONObject5.put("advIdType", str2);
            jSONObject5.put("isLimitAdTrackingEnabled", z ? "true" : "false");
        }
        String C = C4979h.m22782C(context);
        if (!TextUtils.isEmpty(C)) {
            jSONObject5.put("asid", C);
        }
        String z2 = C4979h.m22834z(context);
        if (!TextUtils.isEmpty(z2)) {
            jSONObject5.put("auid", z2);
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("applicationKey", C11232E.m50103a().f50417j);
        jSONObject6.put("SDKVersion", IronSourceUtils.getSDKVersion());
        jSONObject6.put("clientParams", jSONObject5);
        int i2 = i;
        jSONObject6.put(IronSourceConstants.KEY_SESSION_DEPTH, i);
        jSONObject6.put("sessionId", str);
        jSONObject6.put("instances", jSONObject);
        jSONObject6.put("auctionData", bVar.f51534c);
        jSONObject6.put("metaData", jSONObject4);
        return jSONObject6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final JSONObject mo44256f(String str, boolean z, Map<String, Object> map, List<String> list, C11392i iVar, int i, ISBannerSize iSBannerSize) {
        String str2;
        C11392i iVar2 = iVar;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("instp", 2);
            Map<String, Object> map2 = map;
            jSONObject3.put("badt", new JSONObject((Map) map.get(next)));
            if (iVar2 != null) {
                str2 = iVar2.mo44294a(next);
            }
            jSONObject3.put("prfm", str2);
            jSONObject2.put(next, jSONObject3);
        }
        if (list != null) {
            for (String next2 : list) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("instp", 1);
                jSONObject4.put("prfm", iVar2 != null ? iVar2.mo44294a(next2) : str2);
                jSONObject2.put(next2, jSONObject4);
            }
        }
        jSONObject.put("inst", jSONObject2);
        JSONObject a = C4983j.m22836a(new C4957b().f22009a);
        C12691c.m53983b(a, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        JSONObject a2 = C4966b.m22758a(a.optJSONObject("md"));
        if (a2 != null) {
            a.put("md", a2);
        }
        a.put("sd", i);
        a.put("scr", m50866k() - 1);
        jSONObject.put("ctdt", a);
        if (iSBannerSize != null) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("bns", iSBannerSize.getDescription());
            jSONObject5.put("bnw", iSBannerSize.getWidth());
            jSONObject5.put("bnh", iSBannerSize.getHeight());
            jSONObject.put("bndt", jSONObject5);
        }
        String str3 = str;
        jSONObject.put("adu", str);
        jSONObject.put("dner", z ^ true ? 1 : 0);
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final JSONObject mo44257h(JSONObject jSONObject, JSONObject jSONObject2, List<String> list) {
        C11394i0 a = C11394i0.m50972a();
        a.mo44296e(C11394i0.m50977g());
        a.mo44296e(C11394i0.m50976f());
        JSONObject g = m50863g(a.f51222a, list.isEmpty() ? C4985l.f22055a : list);
        m50865j(g, m50868m(jSONObject, list));
        if (!list.isEmpty()) {
            jSONObject2 = m50863g(jSONObject2, list);
        }
        m50865j(g, jSONObject2);
        return g;
    }
}
