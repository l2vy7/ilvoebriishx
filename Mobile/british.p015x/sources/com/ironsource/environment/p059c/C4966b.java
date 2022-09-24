package com.ironsource.environment.p059c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.c.b */
public final class C4966b {
    static {
        new C4966b();
    }

    /* renamed from: a */
    public static HashMap<String, Object> m22757a(ConcurrentHashMap<String, Object> concurrentHashMap) {
        Object b;
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Map.Entry next : concurrentHashMap.entrySet()) {
            if (next.getValue() instanceof JSONObject) {
                b = m22761d((JSONObject) next.getValue());
            } else if (next.getValue() instanceof JSONArray) {
                b = m22760c((JSONArray) next.getValue());
            } else if (next.getValue() instanceof Map) {
                b = m22759b((Map) next.getValue());
            } else {
                hashMap.put(next.getKey(), next.getValue());
            }
            hashMap.put(next.getKey(), b);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m22758a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof List) {
                    jSONObject.put(next, TextUtils.join(",", (List) opt));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static Map<String, Object> m22759b(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (String next : map.keySet()) {
            hashMap.put(next, map.get(next));
        }
        return hashMap;
    }

    /* renamed from: c */
    private static JSONArray m22760c(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONArray2.put(jSONArray.opt(i));
        }
        return jSONArray2;
    }

    /* renamed from: d */
    private static JSONObject m22761d(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.opt(next));
        }
        return jSONObject2;
    }
}
