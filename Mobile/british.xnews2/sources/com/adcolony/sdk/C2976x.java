package com.adcolony.sdk;

import com.adcolony.sdk.C2978z;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.x */
class C2976x {
    C2976x() {
    }

    /* renamed from: a */
    static JSONObject m10305a(String str, String str2) {
        String str3;
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2 + ": " + e.toString();
            }
            new C2978z.C2979a().mo10088a(str3).mo10090a(C2978z.f11950j);
            return new JSONObject();
        }
    }

    /* renamed from: b */
    static JSONObject m10319b() {
        return new JSONObject();
    }

    /* renamed from: c */
    static Object m10327c(JSONArray jSONArray, int i) {
        Object opt = jSONArray.opt(i);
        return opt == null ? Boolean.FALSE : opt;
    }

    /* renamed from: d */
    static String m10331d(JSONArray jSONArray, int i) {
        return jSONArray.optString(i);
    }

    /* renamed from: e */
    static int m10332e(JSONObject jSONObject, String str) {
        return jSONObject.optInt(str);
    }

    /* renamed from: f */
    static long m10334f(JSONObject jSONObject, String str) {
        return jSONObject.optLong(str);
    }

    /* renamed from: g */
    static JSONObject m10335g(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    /* renamed from: h */
    static Object m10336h(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        return opt == null ? Boolean.FALSE : opt;
    }

    /* renamed from: i */
    static String m10337i(JSONObject jSONObject, String str) {
        return jSONObject.optString(str);
    }

    /* renamed from: j */
    static boolean m10338j(JSONObject jSONObject, String str) {
        try {
            C2684a.m9409c().mo9726m().mo10012a(str, jSONObject.toString(), false);
            return true;
        } catch (IOException e) {
            new C2978z.C2979a().mo10088a("IOException in ADCJSON's saveObject: ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
            return false;
        }
    }

    /* renamed from: b */
    static JSONObject m10320b(String str) {
        return m10305a(str, (String) null);
    }

    /* renamed from: d */
    static double m10330d(JSONObject jSONObject, String str) {
        return jSONObject.optDouble(str, 0.0d);
    }

    /* renamed from: e */
    static void m10333e(JSONArray jSONArray, int i) {
        jSONArray.put(i);
    }

    /* renamed from: b */
    static JSONObject m10321b(JSONArray jSONArray, int i) {
        JSONObject optJSONObject = jSONArray.optJSONObject(i);
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    /* renamed from: c */
    static boolean m10329c(JSONObject jSONObject, String str) {
        return jSONObject.optBoolean(str);
    }

    /* renamed from: c */
    static JSONObject m10328c(String str) {
        try {
            String sb = C2684a.m9409c().mo9726m().mo10011a(str, false).toString();
            return m10305a(sb, "loadObject from filepath " + str);
        } catch (IOException e) {
            new C2978z.C2979a().mo10088a("IOException in ADCJSON's loadObject: ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
            return m10319b();
        }
    }

    /* renamed from: b */
    static JSONArray m10318b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        return optJSONArray == null ? new JSONArray() : optJSONArray;
    }

    /* renamed from: b */
    static boolean m10323b(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
            return true;
        } catch (JSONException e) {
            C2978z.C2979a a = new C2978z.C2979a().mo10088a("JSON error in ADCJSON putInteger(): ").mo10088a(e.toString());
            C2978z.C2979a a2 = a.mo10088a(" with key: " + str);
            a2.mo10088a(" and value: " + i).mo10090a(C2978z.f11950j);
            return false;
        }
    }

    /* renamed from: a */
    static JSONArray m10301a() {
        return new JSONArray();
    }

    /* renamed from: a */
    static JSONArray m10302a(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e) {
            new C2978z.C2979a().mo10088a(e.toString()).mo10090a(C2978z.f11950j);
            return new JSONArray();
        }
    }

    /* renamed from: a */
    static JSONObject m10306a(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getJSONObject(i);
        } catch (JSONException e) {
            new C2978z.C2979a().mo10088a(e.toString()).mo10090a(C2978z.f11950j);
            return new JSONObject();
        }
    }

    /* renamed from: b */
    static boolean m10324b(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
            return true;
        } catch (JSONException e) {
            C2978z.C2979a a = new C2978z.C2979a().mo10088a("JSON error in ADCJSON putLong(): ").mo10088a(e.toString());
            C2978z.C2979a a2 = a.mo10088a(" with key: " + str);
            a2.mo10088a(" and value: " + j).mo10090a(C2978z.f11950j);
            return false;
        }
    }

    /* renamed from: a */
    static int m10299a(JSONObject jSONObject, String str, int i) {
        return jSONObject.optInt(str, i);
    }

    /* renamed from: a */
    static long m10300a(JSONObject jSONObject, String str, long j) {
        return jSONObject.optLong(str, j);
    }

    /* renamed from: a */
    static boolean m10316a(JSONObject jSONObject, String str, boolean z) {
        return jSONObject.optBoolean(str, z);
    }

    /* renamed from: b */
    static boolean m10325b(JSONObject jSONObject, String str, boolean z) {
        try {
            jSONObject.put(str, z);
            return true;
        } catch (JSONException e) {
            C2978z.C2979a a = new C2978z.C2979a().mo10088a("JSON error in ADCJSON putBoolean(): ").mo10088a(e.toString());
            C2978z.C2979a a2 = a.mo10088a(" with key: " + str);
            a2.mo10088a(" and value: " + z).mo10090a(C2978z.f11950j);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m10313a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
            return true;
        } catch (JSONException e) {
            C2978z.C2979a a = new C2978z.C2979a().mo10088a("JSON error in ADCJSON putString(): ").mo10088a(e.toString());
            C2978z.C2979a a2 = a.mo10088a(" with key: " + str);
            a2.mo10088a(" and value: " + str2).mo10090a(C2978z.f11950j);
            return false;
        }
    }

    /* renamed from: b */
    static void m10322b(JSONArray jSONArray, String str) {
        jSONArray.put(str);
    }

    /* renamed from: a */
    static boolean m10314a(JSONObject jSONObject, String str, JSONArray jSONArray) {
        try {
            jSONObject.put(str, jSONArray);
            return true;
        } catch (JSONException e) {
            C2978z.C2979a a = new C2978z.C2979a().mo10088a("JSON error in ADCJSON putArray(): ").mo10088a(e.toString());
            C2978z.C2979a a2 = a.mo10088a(" with key: " + str);
            a2.mo10088a(" and value: " + jSONArray).mo10090a(C2978z.f11950j);
            return false;
        }
    }

    /* renamed from: b */
    static JSONObject[] m10326b(JSONArray jSONArray) {
        JSONObject[] jSONObjectArr = new JSONObject[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            jSONObjectArr[i] = m10321b(jSONArray, i);
        }
        return jSONObjectArr;
    }

    /* renamed from: a */
    static boolean m10315a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
            return true;
        } catch (JSONException e) {
            C2978z.C2979a a = new C2978z.C2979a().mo10088a("JSON error in ADCJSON putObject(): ").mo10088a(e.toString());
            C2978z.C2979a a2 = a.mo10088a(" with key: " + str);
            a2.mo10088a(" and value: " + jSONObject2).mo10090a(C2978z.f11950j);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m10312a(JSONObject jSONObject, String str, double d) {
        try {
            jSONObject.put(str, d);
            return true;
        } catch (JSONException unused) {
            C2978z.C2979a a = new C2978z.C2979a().mo10088a("JSON error in ADCJSON putDouble(): ");
            C2978z.C2979a a2 = a.mo10088a(" with key: " + str);
            a2.mo10088a(" and value: " + d).mo10090a(C2978z.f11950j);
            return false;
        }
    }

    /* renamed from: a */
    static void m10309a(JSONArray jSONArray, boolean z) {
        jSONArray.put(z);
    }

    /* renamed from: a */
    static void m10308a(JSONArray jSONArray, Object obj) {
        jSONArray.put(obj);
    }

    /* renamed from: a */
    static String[] m10317a(JSONArray jSONArray) {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = m10331d(jSONArray, i);
        }
        return strArr;
    }

    /* renamed from: a */
    static JSONArray m10304a(String[] strArr) {
        JSONArray a = m10301a();
        for (String b : strArr) {
            m10322b(a, b);
        }
        return a;
    }

    /* renamed from: a */
    static boolean m10310a(JSONArray jSONArray, String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (m10331d(jSONArray, i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m10311a(JSONObject jSONObject, String str) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            if (str.equals(keys.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static JSONArray m10303a(JSONArray jSONArray, String[] strArr, boolean z) {
        for (String str : strArr) {
            if (!z || !m10310a(jSONArray, str)) {
                m10322b(jSONArray, str);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    static JSONObject m10307a(JSONObject... jSONObjectArr) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return jSONObjectArr.length > 0 ? jSONObjectArr[0] : new JSONObject();
        }
    }
}
