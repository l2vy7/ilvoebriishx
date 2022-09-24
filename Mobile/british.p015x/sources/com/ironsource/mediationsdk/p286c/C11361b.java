package com.ironsource.mediationsdk.p286c;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.c.b */
public class C11361b {

    /* renamed from: c */
    private static C11361b f51002c;

    /* renamed from: a */
    private final HashSet<ImpressionDataListener> f51003a = new HashSet<>();

    /* renamed from: b */
    private ConcurrentHashMap<String, List<String>> f51004b = new ConcurrentHashMap<>();

    C11361b() {
    }

    /* renamed from: a */
    public static synchronized C11361b m50766a() {
        C11361b bVar;
        synchronized (C11361b.class) {
            if (f51002c == null) {
                f51002c = new C11361b();
            }
            bVar = f51002c;
        }
        return bVar;
    }

    /* renamed from: a */
    public static Map<String, Object> m50767a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, m50770b(jSONObject.get(next)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", new Object[]{next, e.getMessage()}));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m50768a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), m50772d(next.getValue()));
                } catch (JSONException unused) {
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", new Object[]{next.getKey(), next.getValue()}));
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m50769a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < 2; i++) {
            JSONObject jSONObject2 = jSONObjectArr[i];
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.get(next));
                    } catch (JSONException e) {
                        IronLog.INTERNAL.error(e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static Object m50770b(Object obj) {
        return obj instanceof JSONObject ? m50767a((JSONObject) obj) : obj instanceof JSONArray ? m50771c((JSONArray) obj) : obj;
    }

    /* renamed from: c */
    private static List<Object> m50771c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(m50770b(jSONArray.get(i)));
            } catch (JSONException e) {
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", new Object[]{e.getMessage()}));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private static Object m50772d(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray(Arrays.asList(new Object[]{obj}));
            } else if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            } else {
                if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                    return obj;
                }
                if (obj instanceof Enum) {
                    return obj.toString();
                }
                if (obj.getClass().getPackage().getName().startsWith("java.")) {
                    return obj.toString();
                }
                return null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo44207a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f51003a.add(impressionDataListener);
        }
    }

    /* renamed from: a */
    public void mo44208a(String str, List<String> list) {
        this.f51004b.put(str, list);
    }

    /* renamed from: b */
    public HashSet<ImpressionDataListener> mo44209b() {
        return this.f51003a;
    }

    /* renamed from: b */
    public void mo44210b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f51003a.remove(impressionDataListener);
        }
    }

    /* renamed from: c */
    public void mo44211c() {
        synchronized (this) {
            this.f51003a.clear();
        }
    }

    /* renamed from: d */
    public ConcurrentHashMap<String, List<String>> mo44212d() {
        return this.f51004b;
    }
}
