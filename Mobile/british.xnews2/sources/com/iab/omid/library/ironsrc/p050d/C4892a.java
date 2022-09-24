package com.iab.omid.library.ironsrc.p050d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.d.a */
public final class C4892a {
    /* renamed from: a */
    public static String m22540a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m22541b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m22542c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m22543d() {
        JSONObject jSONObject = new JSONObject();
        C4893b.m22550a(jSONObject, "deviceType", m22540a());
        C4893b.m22550a(jSONObject, "osVersion", m22541b());
        C4893b.m22550a(jSONObject, "os", m22542c());
        return jSONObject;
    }
}
