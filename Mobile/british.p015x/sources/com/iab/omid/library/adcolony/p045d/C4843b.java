package com.iab.omid.library.adcolony.p045d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.adcolony.p043b.C4831c;
import com.iab.omid.library.adcolony.walking.C4858a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.d.b */
public class C4843b {

    /* renamed from: a */
    private static WindowManager f21716a;

    /* renamed from: b */
    private static String[] f21717b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f21718c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: com.iab.omid.library.adcolony.d.b$a */
    private static class C4844a {

        /* renamed from: a */
        final float f21719a;

        /* renamed from: b */
        final float f21720b;

        C4844a(float f, float f2) {
            this.f21719a = f;
            this.f21720b = f2;
        }
    }

    /* renamed from: a */
    static float m22323a(int i) {
        return ((float) i) / f21718c;
    }

    /* renamed from: a */
    public static JSONObject m22324a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m22323a(i));
            jSONObject.put("y", (double) m22323a(i2));
            jSONObject.put("width", (double) m22323a(i3));
            jSONObject.put("height", (double) m22323a(i4));
        } catch (JSONException e) {
            C4845c.m22340a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m22325a(Context context) {
        if (context != null) {
            f21718c = context.getResources().getDisplayMetrics().density;
            f21716a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m22326a(JSONObject jSONObject) {
        C4844a b = m22332b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f21719a);
            jSONObject.put("height", (double) b.f21720b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m22327a(JSONObject jSONObject, C4858a.C4859a aVar) {
        C4831c a = aVar.mo20201a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo20203b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo20122b());
            jSONObject.put("friendlyObstructionPurpose", a.mo20123c());
            jSONObject.put("friendlyObstructionReason", a.mo20124d());
        } catch (JSONException e) {
            C4845c.m22340a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m22328a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4845c.m22340a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m22329a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4845c.m22340a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m22330a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m22331a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4844a m22332b(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f3 = Math.max(f3, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f3;
                return new C4844a(f2, f);
            }
        } else if (f21716a != null) {
            Point point = new Point(0, 0);
            f21716a.getDefaultDisplay().getRealSize(point);
            f2 = m22323a(point.x);
            f = m22323a(point.y);
            return new C4844a(f2, f);
        }
        f = 0.0f;
        return new C4844a(f2, f);
    }

    /* renamed from: b */
    public static void m22333b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4845c.m22340a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m22334b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m22335c(jSONObject, jSONObject2) && m22336d(jSONObject, jSONObject2) && m22337e(jSONObject, jSONObject2) && m22338f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m22335c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f21717b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m22336d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m22337e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22331a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m22338f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22331a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m22334b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
