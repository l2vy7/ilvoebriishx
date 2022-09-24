package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.b0 */
/* compiled from: ProfileInformationCache */
class C3463b0 {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, JSONObject> f13029a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static JSONObject m11554a(String str) {
        return f13029a.get(str);
    }

    /* renamed from: b */
    public static void m11555b(String str, JSONObject jSONObject) {
        f13029a.put(str, jSONObject);
    }
}
