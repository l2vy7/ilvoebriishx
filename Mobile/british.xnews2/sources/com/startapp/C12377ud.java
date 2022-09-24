package com.startapp;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.ud */
/* compiled from: Sta */
public class C12377ud {

    /* renamed from: a */
    public static WindowManager f54853a;

    /* renamed from: b */
    public static String[] f54854b = {"x", "y", "width", "height"};

    /* renamed from: c */
    public static float f54855c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: a */
    public static float m53543a(int i) {
        return ((float) i) / f54855c;
    }

    /* renamed from: a */
    public static JSONObject m53544a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m53543a(i));
            jSONObject.put("y", (double) m53543a(i2));
            jSONObject.put("width", (double) m53543a(i3));
            jSONObject.put("height", (double) m53543a(i4));
        } catch (JSONException e) {
            C11792ae.m52061a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m53546a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            Log.e("OMIDLIB", "JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m53547a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    public static boolean m53548a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    public static boolean m53549b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m53548a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m53550c(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m53550c(org.json.JSONObject r10, org.json.JSONObject r11) {
        /*
            r0 = 1
            if (r10 != 0) goto L_0x0006
            if (r11 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 0
            if (r10 == 0) goto L_0x008f
            if (r11 != 0) goto L_0x000d
            goto L_0x008f
        L_0x000d:
            java.lang.String[] r2 = f54854b
            int r3 = r2.length
            r4 = 0
        L_0x0011:
            if (r4 >= r3) goto L_0x0026
            r5 = r2[r4]
            double r6 = r10.optDouble(r5)
            double r8 = r11.optDouble(r5)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0023
            r2 = 0
            goto L_0x0027
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0026:
            r2 = 1
        L_0x0027:
            if (r2 == 0) goto L_0x008d
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r10.optString(r2, r3)
            java.lang.String r2 = r11.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x008d
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r10.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r11.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x008d
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r10.optJSONArray(r2)
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r4 != 0) goto L_0x0062
            if (r2 != 0) goto L_0x0062
            goto L_0x0083
        L_0x0062:
            boolean r5 = m53548a((org.json.JSONArray) r4, (org.json.JSONArray) r2)
            if (r5 != 0) goto L_0x0069
            goto L_0x007e
        L_0x0069:
            r5 = 0
        L_0x006a:
            int r6 = r4.length()
            if (r5 >= r6) goto L_0x0083
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0080
        L_0x007e:
            r2 = 0
            goto L_0x0084
        L_0x0080:
            int r5 = r5 + 1
            goto L_0x006a
        L_0x0083:
            r2 = 1
        L_0x0084:
            if (r2 == 0) goto L_0x008d
            boolean r10 = m53549b(r10, r11)
            if (r10 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            return r0
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12377ud.m53550c(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    /* renamed from: a */
    public static void m53545a(JSONObject jSONObject) {
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
                f = f2;
                f2 = f3;
                jSONObject2.put("width", (double) f);
                jSONObject2.put("height", (double) f2);
            }
        } else if (f54853a != null) {
            Point point = new Point(0, 0);
            f54853a.getDefaultDisplay().getRealSize(point);
            float a = m53543a(point.x);
            f2 = m53543a(point.y);
            f = a;
            jSONObject2.put("width", (double) f);
            jSONObject2.put("height", (double) f2);
        }
        f = 0.0f;
        try {
            jSONObject2.put("width", (double) f);
            jSONObject2.put("height", (double) f2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
