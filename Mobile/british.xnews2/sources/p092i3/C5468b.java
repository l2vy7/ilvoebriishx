package p092i3;

import android.util.Log;
import com.facebook.C3642m;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: i3.b */
/* compiled from: RestrictiveDataManager */
public final class C5468b {

    /* renamed from: a */
    private static boolean f23837a = false;

    /* renamed from: b */
    private static final String f23838b = "i3.b";

    /* renamed from: c */
    private static final List<C5469a> f23839c = new ArrayList();

    /* renamed from: i3.b$a */
    /* compiled from: RestrictiveDataManager */
    static class C5469a {

        /* renamed from: a */
        String f23840a;

        /* renamed from: b */
        Map<String, String> f23841b;

        C5469a(String str, Map<String, String> map) {
            this.f23840a = str;
            this.f23841b = map;
        }
    }

    /* renamed from: a */
    public static void m24478a() {
        f23837a = true;
        m24480c();
    }

    /* renamed from: b */
    private static String m24479b(String str, String str2) {
        try {
            for (C5469a aVar : new ArrayList(f23839c)) {
                if (aVar != null) {
                    if (str.equals(aVar.f23840a)) {
                        for (String next : aVar.f23841b.keySet()) {
                            if (str2.equals(next)) {
                                return aVar.f23841b.get(next);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            Log.w(f23838b, "getMatchedRuleType failed", e);
            return null;
        }
    }

    /* renamed from: c */
    private static void m24480c() {
        String i;
        try {
            C3520m o = C3522n.m11809o(C3642m.m12280f(), false);
            if (o != null && (i = o.mo12004i()) != null && !i.isEmpty()) {
                JSONObject jSONObject = new JSONObject(i);
                f23839c.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        C5469a aVar = new C5469a(next, new HashMap());
                        if (optJSONObject != null) {
                            aVar.f23841b = C3481f0.m11638l(optJSONObject);
                            f23839c.add(aVar);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static void m24481d(Map<String, String> map, String str) {
        if (f23837a) {
            HashMap hashMap = new HashMap();
            for (String str2 : new ArrayList(map.keySet())) {
                String b = m24479b(str, str2);
                if (b != null) {
                    hashMap.put(str2, b);
                    map.remove(str2);
                }
            }
            if (hashMap.size() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    map.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        }
    }
}
