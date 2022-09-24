package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C3489g0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a */
/* compiled from: AccessTokenCache */
class C3367a {

    /* renamed from: a */
    private final SharedPreferences f12799a;

    /* renamed from: b */
    private final C3368a f12800b;

    /* renamed from: c */
    private C3751t f12801c;

    /* renamed from: com.facebook.a$a */
    /* compiled from: AccessTokenCache */
    static class C3368a {
        C3368a() {
        }

        /* renamed from: a */
        public C3751t mo11298a() {
            return new C3751t(C3642m.m12279e());
        }
    }

    C3367a(SharedPreferences sharedPreferences, C3368a aVar) {
        this.f12799a = sharedPreferences;
        this.f12800b = aVar;
    }

    /* renamed from: b */
    private AccessToken m11340b() {
        String string = this.f12799a.getString("com.facebook.AccessTokenManager.CachedAccessToken", (String) null);
        if (string != null) {
            try {
                return AccessToken.m11202d(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private AccessToken m11341c() {
        Bundle h = m11342d().mo12607h();
        if (h == null || !C3751t.m12650g(h)) {
            return null;
        }
        return AccessToken.m11203e(h);
    }

    /* renamed from: d */
    private C3751t m11342d() {
        if (this.f12801c == null) {
            synchronized (this) {
                if (this.f12801c == null) {
                    this.f12801c = this.f12800b.mo11298a();
                }
            }
        }
        return this.f12801c;
    }

    /* renamed from: e */
    private boolean m11343e() {
        return this.f12799a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: h */
    private boolean m11344h() {
        return C3642m.m12297w();
    }

    /* renamed from: a */
    public void mo11295a() {
        this.f12799a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m11344h()) {
            m11342d().mo12606a();
        }
    }

    /* renamed from: f */
    public AccessToken mo11296f() {
        if (m11343e()) {
            return m11340b();
        }
        if (!m11344h()) {
            return null;
        }
        AccessToken c = m11341c();
        if (c == null) {
            return c;
        }
        mo11297g(c);
        m11342d().mo12606a();
        return c;
    }

    /* renamed from: g */
    public void mo11297g(AccessToken accessToken) {
        C3489g0.m11687i(accessToken, "accessToken");
        try {
            this.f12799a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.mo11195w().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public C3367a() {
        this(C3642m.m12279e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new C3368a());
    }
}
