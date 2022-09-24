package p087h3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.C3642m;
import com.facebook.GraphRequest;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3511k;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p092i3.C5467a;
import p097j3.C5515d;

/* renamed from: h3.b */
/* compiled from: ModelManager */
public final class C5410b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final ConcurrentMap<String, C5405a> f23743a = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static SharedPreferences f23744b;

    /* renamed from: c */
    private static final String[] f23745c = {"version_id", "asset_uri", "use_case", "thresholds", "rules_uri"};

    /* renamed from: h3.b$a */
    /* compiled from: ModelManager */
    static class C5411a implements Runnable {
        C5411a() {
        }

        public void run() {
            try {
                JSONObject a = C5410b.m24344j();
                if (a != null) {
                    C5410b.f23744b.edit().putString("models", a.toString()).apply();
                } else {
                    a = new JSONObject(C5410b.f23744b.getString("models", ""));
                }
                C5410b.m24340f(a);
                C5410b.m24343i();
                C5410b.m24342h();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h3.b$b */
    /* compiled from: ModelManager */
    static class C5412b implements C3511k.C3514c {

        /* renamed from: h3.b$b$a */
        /* compiled from: ModelManager */
        class C5413a implements Runnable {
            C5413a() {
            }

            public void run() {
                C5515d.m24589a();
            }
        }

        C5412b() {
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                ((C5405a) C5410b.f23743a.get("SUGGEST_EVENT")).mo21858g(new C5413a());
            }
        }
    }

    /* renamed from: h3.b$c */
    /* compiled from: ModelManager */
    static class C5414c implements C3511k.C3514c {

        /* renamed from: h3.b$c$a */
        /* compiled from: ModelManager */
        class C5415a implements Runnable {
            C5415a() {
            }

            public void run() {
                C5467a.m24475a();
            }
        }

        C5414c() {
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                ((C5405a) C5410b.f23743a.get("DATA_DETECTION_ADDRESS")).mo21858g(new C5415a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m24340f(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                C5405a n = m24348n(jSONObject.getJSONObject(next));
                if (n != null) {
                    f23743a.put(next, n);
                }
            } catch (JSONException unused) {
                return;
            }
        }
    }

    /* renamed from: g */
    public static void m24341g() {
        m24346l();
    }

    /* renamed from: h */
    public static void m24342h() {
        if (f23743a.containsKey("DATA_DETECTION_ADDRESS")) {
            C3511k.m11755a(C3511k.C3515d.PIIFiltering, new C5414c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m24343i() {
        if (f23743a.containsKey("SUGGEST_EVENT")) {
            Locale B = C3481f0.m11591B();
            if (B == null || B.getLanguage().contains("en")) {
                C3511k.m11755a(C3511k.C3515d.SuggestedEvents, new C5412b());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static JSONObject m24344j() {
        ArrayList arrayList = new ArrayList(Arrays.asList(f23745c));
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest J = GraphRequest.m11252J((AccessToken) null, String.format("%s/model_asset", new Object[]{C3642m.m12280f()}), (GraphRequest.C3360f) null);
        J.mo11247b0(true);
        J.mo11246a0(bundle);
        JSONObject h = J.mo11250g().mo12381h();
        if (h == null) {
            return null;
        }
        return m24350p(h);
    }

    /* renamed from: k */
    public static File m24345k(String str) {
        ConcurrentMap<String, C5405a> concurrentMap = f23743a;
        if (!concurrentMap.containsKey(str)) {
            return null;
        }
        return ((C5405a) concurrentMap.get(str)).mo21857f();
    }

    /* renamed from: l */
    public static void m24346l() {
        f23744b = C3642m.m12279e().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
        m24347m();
    }

    /* renamed from: m */
    private static void m24347m() {
        C3481f0.m11637k0(new C5411a());
    }

    /* renamed from: n */
    private static C5405a m24348n(JSONObject jSONObject) {
        try {
            return new C5405a(jSONObject.getString("use_case"), Integer.parseInt(jSONObject.getString("version_id")), jSONObject.getString("asset_uri"), jSONObject.optString("rules_uri", (String) null), m24349o(jSONObject.getJSONArray("thresholds")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: o */
    private static float[] m24349o(JSONArray jSONArray) {
        float[] fArr = new float[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                fArr[i] = Float.parseFloat(jSONArray.getString(i));
            } catch (JSONException unused) {
            }
        }
        return fArr;
    }

    /* renamed from: p */
    private static JSONObject m24350p(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                if (jSONObject3.has("rules_uri")) {
                    jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                }
                jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: q */
    public static String m24351q(String str, float[] fArr, String str2) {
        ConcurrentMap<String, C5405a> concurrentMap = f23743a;
        if (!concurrentMap.containsKey(str)) {
            return null;
        }
        return ((C5405a) concurrentMap.get(str)).mo21859i(fArr, str2);
    }
}
