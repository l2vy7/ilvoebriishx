package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.c */
/* compiled from: BundleJSONConverter */
public class C3464c {

    /* renamed from: a */
    private static final Map<Class<?>, C3472h> f13030a;

    /* renamed from: com.facebook.internal.c$a */
    /* compiled from: BundleJSONConverter */
    static class C3465a implements C3472h {
        C3465a() {
        }

        /* renamed from: a */
        public void mo11927a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        /* renamed from: b */
        public void mo11928b(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.facebook.internal.c$b */
    /* compiled from: BundleJSONConverter */
    static class C3466b implements C3472h {
        C3466b() {
        }

        /* renamed from: a */
        public void mo11927a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        /* renamed from: b */
        public void mo11928b(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: com.facebook.internal.c$c */
    /* compiled from: BundleJSONConverter */
    static class C3467c implements C3472h {
        C3467c() {
        }

        /* renamed from: a */
        public void mo11927a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        /* renamed from: b */
        public void mo11928b(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: com.facebook.internal.c$d */
    /* compiled from: BundleJSONConverter */
    static class C3468d implements C3472h {
        C3468d() {
        }

        /* renamed from: a */
        public void mo11927a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        /* renamed from: b */
        public void mo11928b(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* renamed from: com.facebook.internal.c$e */
    /* compiled from: BundleJSONConverter */
    static class C3469e implements C3472h {
        C3469e() {
        }

        /* renamed from: a */
        public void mo11927a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        /* renamed from: b */
        public void mo11928b(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: com.facebook.internal.c$f */
    /* compiled from: BundleJSONConverter */
    static class C3470f implements C3472h {
        C3470f() {
        }

        /* renamed from: a */
        public void mo11927a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            for (String put : (String[]) obj) {
                jSONArray.put(put);
            }
            jSONObject.put(str, jSONArray);
        }

        /* renamed from: b */
        public void mo11928b(Bundle bundle, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: com.facebook.internal.c$g */
    /* compiled from: BundleJSONConverter */
    static class C3471g implements C3472h {
        C3471g() {
        }

        /* renamed from: a */
        public void mo11927a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }

        /* renamed from: b */
        public void mo11928b(Bundle bundle, String str, Object obj) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i = 0;
            while (i < jSONArray.length()) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                    i++;
                } else {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* renamed from: com.facebook.internal.c$h */
    /* compiled from: BundleJSONConverter */
    public interface C3472h {
        /* renamed from: a */
        void mo11927a(JSONObject jSONObject, String str, Object obj) throws JSONException;

        /* renamed from: b */
        void mo11928b(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        f13030a = hashMap;
        hashMap.put(Boolean.class, new C3465a());
        hashMap.put(Integer.class, new C3466b());
        hashMap.put(Long.class, new C3467c());
        hashMap.put(Double.class, new C3468d());
        hashMap.put(String.class, new C3469e());
        hashMap.put(String[].class, new C3470f());
        hashMap.put(JSONArray.class, new C3471g());
    }

    /* renamed from: a */
    public static Bundle m11556a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m11556a((JSONObject) obj));
                } else {
                    C3472h hVar = f13030a.get(obj.getClass());
                    if (hVar != null) {
                        hVar.mo11928b(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static JSONObject m11557b(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (String put : (List) obj) {
                        jSONArray.put(put);
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, m11557b((Bundle) obj));
                } else {
                    C3472h hVar = f13030a.get(obj.getClass());
                    if (hVar != null) {
                        hVar.mo11927a(jSONObject, str, obj);
                    } else {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                }
            }
        }
        return jSONObject;
    }
}
