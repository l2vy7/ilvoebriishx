package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.C3489g0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.v */
/* compiled from: ProfileCache */
final class C3753v {

    /* renamed from: a */
    private final SharedPreferences f13865a = C3642m.m12279e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    C3753v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12608a() {
        this.f13865a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Profile mo12609b() {
        String string = this.f13865a.getString("com.facebook.ProfileManager.CachedProfile", (String) null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo12610c(Profile profile) {
        C3489g0.m11687i(profile, "profile");
        JSONObject g = profile.mo11286g();
        if (g != null) {
            this.f13865a.edit().putString("com.facebook.ProfileManager.CachedProfile", g.toString()).apply();
        }
    }
}
