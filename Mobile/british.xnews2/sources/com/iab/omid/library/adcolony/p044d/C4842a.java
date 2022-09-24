package com.iab.omid.library.adcolony.p044d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.d.a */
public final class C4842a {
    /* renamed from: a */
    public static String m22319a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m22320b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m22321c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m22322d() {
        JSONObject jSONObject = new JSONObject();
        C4843b.m22329a(jSONObject, "deviceType", m22319a());
        C4843b.m22329a(jSONObject, "osVersion", m22320b());
        C4843b.m22329a(jSONObject, "os", m22321c());
        return jSONObject;
    }
}
