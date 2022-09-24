package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.appevents.C3420m;
import com.facebook.login.LoginClient;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.f */
/* compiled from: LoginLogger */
class C3607f {

    /* renamed from: a */
    private final C3420m f13407a;

    /* renamed from: b */
    private String f13408b;

    /* renamed from: c */
    private String f13409c;

    C3607f(Context context, String str) {
        PackageInfo packageInfo;
        this.f13408b = str;
        this.f13407a = new C3420m(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f13409c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: i */
    static Bundle m12168i(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    /* renamed from: a */
    public String mo12245a() {
        return this.f13408b;
    }

    /* renamed from: b */
    public void mo12246b(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Bundle i = m12168i(str);
        if (str3 != null) {
            i.putString("2_result", str3);
        }
        if (str4 != null) {
            i.putString("5_error_message", str4);
        }
        if (str5 != null) {
            i.putString("4_error_code", str5);
        }
        if (map != null && !map.isEmpty()) {
            i.putString("6_extras", new JSONObject(map).toString());
        }
        i.putString("3_method", str2);
        this.f13407a.mo11848i("fb_mobile_login_method_complete", i);
    }

    /* renamed from: c */
    public void mo12247c(String str, String str2) {
        Bundle i = m12168i(str);
        i.putString("3_method", str2);
        this.f13407a.mo11848i("fb_mobile_login_method_not_tried", i);
    }

    /* renamed from: d */
    public void mo12248d(String str, String str2) {
        Bundle i = m12168i(str);
        i.putString("3_method", str2);
        this.f13407a.mo11848i("fb_mobile_login_method_start", i);
    }

    /* renamed from: e */
    public void mo12249e(String str, Map<String, String> map, LoginClient.Result.C3593b bVar, Map<String, String> map2, Exception exc) {
        Bundle i = m12168i(str);
        if (bVar != null) {
            i.putString("2_result", bVar.mo12205d());
        }
        if (!(exc == null || exc.getMessage() == null)) {
            i.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = null;
        if (!map.isEmpty()) {
            jSONObject = new JSONObject(map);
        }
        if (map2 != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Map.Entry next : map2.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            i.putString("6_extras", jSONObject.toString());
        }
        this.f13407a.mo11848i("fb_mobile_login_complete", i);
    }

    /* renamed from: f */
    public void mo12250f(LoginClient.Request request) {
        Bundle i = m12168i(request.mo12180b());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("login_behavior", request.mo12186h().toString());
            jSONObject.put("request_code", LoginClient.m12045q());
            jSONObject.put("permissions", TextUtils.join(",", request.mo12187i()));
            jSONObject.put("default_audience", request.mo12183e().toString());
            jSONObject.put("isReauthorize", request.mo12189k());
            String str = this.f13409c;
            if (str != null) {
                jSONObject.put("facebookVersion", str);
            }
            i.putString("6_extras", jSONObject.toString());
        } catch (JSONException unused) {
        }
        this.f13407a.mo11849j("fb_mobile_login_start", (Double) null, i);
    }

    /* renamed from: g */
    public void mo12251g(String str, String str2) {
        mo12252h(str, str2, "");
    }

    /* renamed from: h */
    public void mo12252h(String str, String str2, String str3) {
        Bundle i = m12168i("");
        i.putString("2_result", LoginClient.Result.C3593b.ERROR.mo12205d());
        i.putString("5_error_message", str2);
        i.putString("3_method", str3);
        this.f13407a.mo11848i(str, i);
    }
}
