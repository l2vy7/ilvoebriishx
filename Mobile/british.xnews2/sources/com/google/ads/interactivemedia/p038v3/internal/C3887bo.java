package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bo */
/* compiled from: IMASDK */
public final class C3887bo {

    /* renamed from: a */
    static float f16768a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f16769b;

    /* renamed from: c */
    private static final String[] f16770c = {"x", "y", "width", "height"};

    /* renamed from: a */
    public static void m16850a(Context context) {
        if (context != null) {
            f16768a = context.getResources().getDisplayMetrics().density;
            f16769b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    public static JSONObject m16851b(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m16852c(i));
            jSONObject.put("y", (double) m16852c(i2));
            jSONObject.put("width", (double) m16852c(i3));
            jSONObject.put("height", (double) m16852c(i4));
        } catch (JSONException e) {
            C4257pg.m18529h("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: c */
    static float m16852c(int i) {
        return ((float) i) / f16768a;
    }

    /* renamed from: d */
    public static void m16853d(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            C4257pg.m18529h(sb.toString(), e);
        }
    }

    /* renamed from: e */
    public static void m16854e(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4257pg.m18529h("Error with setting ad session id", e);
        }
    }

    /* renamed from: f */
    public static void m16855f(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4257pg.m18529h("Error with setting not visible reason", e);
        }
    }

    /* renamed from: g */
    public static void m16856g(JSONObject jSONObject, C3888bp bpVar) {
        C3871az b = bpVar.mo15578b();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> c = bpVar.mo15579c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(c.get(i));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", b.mo14774a());
            jSONObject.put("friendlyObstructionPurpose", b.mo14775b());
            jSONObject.put("friendlyObstructionReason", b.mo14776c());
        } catch (JSONException e) {
            C4257pg.m18529h("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: h */
    public static void m16857h(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            bej.m15775b(e);
        }
    }

    /* renamed from: i */
    public static void m16858i(JSONObject jSONObject) {
        float f;
        JSONObject jSONObject2 = jSONObject;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject2.optJSONArray("childViews");
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
                C3886bn bnVar = new C3886bn(f2, f);
                jSONObject2.put("width", (double) bnVar.f16719a);
                jSONObject2.put("height", (double) bnVar.f16720b);
            }
        } else if (f16769b != null) {
            Point point = new Point(0, 0);
            f16769b.getDefaultDisplay().getRealSize(point);
            f2 = m16852c(point.x);
            f = m16852c(point.y);
            C3886bn bnVar2 = new C3886bn(f2, f);
            jSONObject2.put("width", (double) bnVar2.f16719a);
            jSONObject2.put("height", (double) bnVar2.f16720b);
        }
        f = 0.0f;
        C3886bn bnVar22 = new C3886bn(f2, f);
        try {
            jSONObject2.put("width", (double) bnVar22.f16719a);
            jSONObject2.put("height", (double) bnVar22.f16720b);
        } catch (JSONException e) {
            bej.m15775b(e);
        }
    }

    /* renamed from: j */
    public static boolean m16859j(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f16770c;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (m16860k(optJSONArray, optJSONArray2)) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < optJSONArray.length()) {
                                    if (!optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (!(optJSONArray3 == null && optJSONArray4 == null)) {
                        if (m16860k(optJSONArray3, optJSONArray4)) {
                            int i3 = 0;
                            while (i3 < optJSONArray3.length()) {
                                if (m16859j(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                    i3++;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m16860k(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
