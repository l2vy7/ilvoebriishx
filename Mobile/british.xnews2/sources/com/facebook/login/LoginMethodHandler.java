package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C3436c;
import com.facebook.C3572j;
import com.facebook.appevents.C3420m;
import com.facebook.internal.C3481f0;
import com.facebook.login.LoginClient;
import com.google.android.exoplayer2.C6540C;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: b */
    Map<String, String> f13368b;

    /* renamed from: c */
    protected LoginClient f13369c;

    LoginMethodHandler(LoginClient loginClient) {
        this.f13369c = loginClient;
    }

    /* renamed from: d */
    static AccessToken m12099d(Bundle bundle, C3436c cVar, String str) {
        Bundle bundle2 = bundle;
        Date t = C3481f0.m11654t(bundle2, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle2.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date t2 = C3481f0.m11654t(bundle2, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (C3481f0.m11604O(string)) {
            return null;
        }
        return new AccessToken(string, str, bundle2.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, (Collection<String>) null, (Collection<String>) null, cVar, t, new Date(), t2, bundle2.getString("graph_domain"));
    }

    /* renamed from: e */
    public static AccessToken m12100e(Collection<String> collection, Bundle bundle, C3436c cVar, String str) throws C3572j {
        Bundle bundle2 = bundle;
        Date t = C3481f0.m11654t(bundle2, "expires_in", new Date());
        String string = bundle2.getString("access_token");
        Date t2 = C3481f0.m11654t(bundle2, "data_access_expiration_time", new Date(0));
        String string2 = bundle2.getString("granted_scopes");
        ArrayList arrayList = !C3481f0.m11604O(string2) ? new ArrayList(Arrays.asList(string2.split(","))) : collection;
        String string3 = bundle2.getString("denied_scopes");
        ArrayList arrayList2 = !C3481f0.m11604O(string3) ? new ArrayList(Arrays.asList(string3.split(","))) : null;
        String string4 = bundle2.getString("expired_scopes");
        ArrayList arrayList3 = !C3481f0.m11604O(string4) ? new ArrayList(Arrays.asList(string4.split(","))) : null;
        if (C3481f0.m11604O(string)) {
            return null;
        }
        return new AccessToken(string, str, m12101h(bundle2.getString("signed_request")), arrayList, arrayList2, arrayList3, cVar, t, new Date(), t2, bundle2.getString("graph_domain"));
    }

    /* renamed from: h */
    static String m12101h(String str) throws C3572j {
        if (str == null || str.isEmpty()) {
            throw new C3572j("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), C6540C.UTF8_NAME)).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new C3572j("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12213a(String str, Object obj) {
        if (this.f13368b == null) {
            this.f13368b = new HashMap();
        }
        this.f13368b.put(str, obj == null ? null : obj.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12141b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo12214f(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo12091g());
            mo12093l(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract String mo12091g();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo12215i(String str) {
        String a = this.f13369c.mo12172r().mo12179a();
        C3420m mVar = new C3420m(this.f13369c.mo12167j(), a);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", a);
        mVar.mo11849j("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo12216j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo12092k(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo12093l(JSONObject jSONObject) throws JSONException {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo12217m(LoginClient loginClient) {
        if (this.f13369c == null) {
            this.f13369c = loginClient;
            return;
        }
        throw new C3572j("Can't set LoginClient if it is already set.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract boolean mo12094n(LoginClient.Request request);

    public void writeToParcel(Parcel parcel, int i) {
        C3481f0.m11655t0(parcel, this.f13368b);
    }

    LoginMethodHandler(Parcel parcel) {
        this.f13368b = C3481f0.m11623d0(parcel);
    }
}
