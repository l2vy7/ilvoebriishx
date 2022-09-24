package com.ironsource.sdk.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C4952a;
import com.ironsource.environment.C4961c;
import com.ironsource.environment.C4979h;
import com.ironsource.p056c.C4946a;
import com.ironsource.sdk.utils.C11755a;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.b */
public class C11747b {

    /* renamed from: a */
    private static final String f52471a = "b";

    /* renamed from: a */
    public static JSONObject m51918a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(advertiserId)) {
            try {
                Logger.m51953i(f52471a, "add AID and LAT");
                jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                jSONObject.put("deviceIds" + "[AID" + "]", SDKUtils.encodeString(advertiserId));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static JSONObject m51919b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            m51920b(jSONObject, "displaySizeWidth", String.valueOf(C4979h.m22810k()));
            m51920b(jSONObject, "displaySizeHeight", String.valueOf(C4979h.m22812l()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String a = C4946a.m22688a(context);
            if (!TextUtils.isEmpty(a) && !a.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put(SDKUtils.encodeString("hasVPN"), C4946a.m22693c(context));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(C4979h.m22821p())));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("batteryLevel"), C4979h.m22831w(context));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("lpm"), C4979h.m22832x(context));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            C11755a.m51959a(context);
            jSONObject.put(SDKUtils.encodeString("deviceVolume"), (double) C11755a.m51961b(context));
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("sdCardAvailable")) {
                jSONObject.put(SDKUtils.encodeString("sdCardAvailable"), C4979h.m22795d());
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("isCharging")) {
                jSONObject.put(SDKUtils.encodeString("isCharging"), C4979h.m22801f(context));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("chargingType")) {
                jSONObject.put(SDKUtils.encodeString("chargingType"), C4979h.m22802g(context));
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("airplaneMode")) {
                jSONObject.put(SDKUtils.encodeString("airplaneMode"), C4979h.m22805h(context));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("stayOnWhenPluggedIn")) {
                jSONObject.put(SDKUtils.encodeString("stayOnWhenPluggedIn"), C4979h.m22807i(context));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static void m51920b(JSONObject jSONObject, String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static JSONObject m51921c(Context context) {
        C11755a a = C11755a.m51959a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String str = a.f52494a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a.f52495b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
            }
            String str3 = a.f52496c;
            if (str3 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
            }
            String str4 = a.f52497d;
            if (str4 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
            }
            String str5 = a.f52497d;
            if (str5 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
            }
            jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), String.valueOf(a.f52498e));
            jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(C11755a.m51960a()));
            String str6 = a.f52499f;
            if (str6 != null && str6.length() > 0) {
                jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a.f52499f));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
            }
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("totalDeviceRAM")) {
                jSONObject.put(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(C4979h.m22797e(context))));
            }
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
            }
            String valueOf = String.valueOf(C4979h.m22818o());
            if (!TextUtils.isEmpty(valueOf)) {
                jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf));
            }
            String valueOf2 = String.valueOf(C4979h.m22809j());
            if (!TextUtils.isEmpty(valueOf2)) {
                jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), C11749d.m51928a(context));
            jSONObject.put("mcc", C4952a.C49531.m22727c(context));
            jSONObject.put("mnc", C4952a.C49531.m22730d(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), C4952a.C49531.m22733f(context));
            jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(C4952a.C49531.m22732e(context)));
            jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), C4961c.m22742b(context));
            jSONObject.put(SDKUtils.encodeString("firstInstallTime"), C4961c.m22739a(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C4961c.m22744c(context)));
            String d = C4961c.m22746d(context);
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d));
            }
            jSONObject.put("localTime", SDKUtils.encodeString(String.valueOf(C4979h.m22783a())));
            jSONObject.put("timezoneOffset", SDKUtils.encodeString(String.valueOf(C4979h.m22788b())));
            String k = C4979h.m22811k(context);
            if (!TextUtils.isEmpty(k)) {
                jSONObject.put("icc", k);
            }
            String c = C4979h.m22791c();
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("tz", SDKUtils.encodeString(c));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
