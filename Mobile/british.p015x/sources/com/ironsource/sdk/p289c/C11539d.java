package com.ironsource.sdk.p289c;

import android.webkit.WebView;
import com.ironsource.sdk.C11515a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.d */
public class C11539d {

    /* renamed from: a */
    public static final String f51879a = "d";

    /* renamed from: c */
    private static C11539d f51880c;

    /* renamed from: b */
    public Map<String, C11541e> f51881b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static synchronized C11539d m51410a() {
        C11539d dVar;
        synchronized (C11539d.class) {
            if (f51880c == null) {
                f51880c = new C11539d();
            }
            dVar = f51880c;
        }
        return dVar;
    }

    /* renamed from: a */
    public static String m51411a(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    /* renamed from: b */
    public static boolean m51413b(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean("shouldCreateContainer");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    private static C11515a m51414d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("adSize"));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new C11515a(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception unused) {
            return new C11515a();
        }
    }

    /* renamed from: a */
    public final WebView mo44638a(String str) {
        C11541e eVar;
        if (str.isEmpty() || !this.f51881b.containsKey(str) || (eVar = this.f51881b.get(str)) == null) {
            return null;
        }
        return eVar.mo44621a();
    }

    /* renamed from: c */
    public C11515a mo44639c(JSONObject jSONObject) {
        C11515a aVar = new C11515a();
        try {
            return m51414d(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return aVar;
        }
    }
}
