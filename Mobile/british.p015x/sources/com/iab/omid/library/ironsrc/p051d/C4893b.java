package com.iab.omid.library.ironsrc.p051d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.ironsrc.p049b.C4881c;
import com.iab.omid.library.ironsrc.walking.C4908a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.d.b */
public class C4893b {

    /* renamed from: a */
    static float f21830a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f21831b;

    /* renamed from: c */
    private static String[] f21832c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.ironsrc.d.b$a */
    static class C4894a {

        /* renamed from: a */
        final float f21833a;

        /* renamed from: b */
        final float f21834b;

        C4894a(float f, float f2) {
            this.f21833a = f;
            this.f21834b = f2;
        }
    }

    /* renamed from: a */
    static float m22544a(int i) {
        return ((float) i) / f21830a;
    }

    /* renamed from: a */
    public static JSONObject m22545a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m22544a(i));
            jSONObject.put("y", (double) m22544a(i2));
            jSONObject.put("width", (double) m22544a(i3));
            jSONObject.put("height", (double) m22544a(i4));
        } catch (JSONException e) {
            C4895c.m22561a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m22546a(Context context) {
        if (context != null) {
            f21830a = context.getResources().getDisplayMetrics().density;
            f21831b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m22547a(JSONObject jSONObject) {
        C4894a b = m22553b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f21833a);
            jSONObject.put("height", (double) b.f21834b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m22548a(JSONObject jSONObject, C4908a.C4909a aVar) {
        C4881c a = aVar.mo20387a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo20389b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo20308b());
            jSONObject.put("friendlyObstructionPurpose", a.mo20309c());
            jSONObject.put("friendlyObstructionReason", a.mo20310d());
        } catch (JSONException e) {
            C4895c.m22561a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m22549a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4895c.m22561a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m22550a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4895c.m22561a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m22551a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m22552a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4894a m22553b(JSONObject jSONObject) {
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
                return new C4894a(f2, f);
            }
        } else if (f21831b != null) {
            Point point = new Point(0, 0);
            f21831b.getDefaultDisplay().getRealSize(point);
            f2 = m22544a(point.x);
            f = m22544a(point.y);
            return new C4894a(f2, f);
        }
        f = 0.0f;
        return new C4894a(f2, f);
    }

    /* renamed from: b */
    public static void m22554b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4895c.m22561a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m22555b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m22556c(jSONObject, jSONObject2) && m22557d(jSONObject, jSONObject2) && m22558e(jSONObject, jSONObject2) && m22559f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m22556c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f21832c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m22557d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m22558e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22552a(optJSONArray, optJSONArray2)) {
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
    private static boolean m22559f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m22552a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m22555b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
