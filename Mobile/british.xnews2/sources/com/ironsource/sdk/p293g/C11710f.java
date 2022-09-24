package com.ironsource.sdk.p293g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.g.f */
public class C11710f {

    /* renamed from: d */
    public JSONObject f52427d;

    public C11710f() {
        this.f52427d = new JSONObject();
    }

    public C11710f(String str) {
        try {
            this.f52427d = new JSONObject(str);
        } catch (Exception unused) {
            this.f52427d = new JSONObject();
        }
    }

    /* renamed from: a */
    private Object m51826a(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? m51827b((JSONObject) obj) : obj instanceof JSONArray ? mo45016a((JSONArray) obj) : obj;
    }

    /* renamed from: b */
    private Map<String, Object> m51827b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m51826a(jSONObject.get(next)));
        }
        return hashMap;
    }

    /* renamed from: a */
    public final List mo45016a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m51826a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo45017a(String str, String str2) {
        try {
            this.f52427d.put(str, str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo45018a(String str, JSONObject jSONObject) {
        try {
            this.f52427d.put(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo45019a(String str) {
        return this.f52427d.has(str);
    }

    /* renamed from: b */
    public final boolean mo45020b(String str) {
        return this.f52427d.isNull(str);
    }

    /* renamed from: c */
    public final Object mo45021c(String str) {
        try {
            return this.f52427d.get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final String mo45022d(String str) {
        try {
            return this.f52427d.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final boolean mo45023e(String str) {
        try {
            return this.f52427d.getBoolean(str);
        } catch (JSONException unused) {
            return false;
        }
    }

    public String toString() {
        JSONObject jSONObject = this.f52427d;
        return jSONObject == null ? "" : jSONObject.toString();
    }
}
