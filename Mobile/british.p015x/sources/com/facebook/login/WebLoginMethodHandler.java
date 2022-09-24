package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.C3436c;
import com.facebook.C3572j;
import com.facebook.C3575l;
import com.facebook.C3642m;
import com.facebook.C3650o;
import com.facebook.FacebookRequestError;
import com.facebook.internal.C3481f0;
import com.facebook.login.LoginClient;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Locale;

abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: d */
    private String f13370d;

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: t */
    private String m12118t() {
        return this.f13369c.mo12167j().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* renamed from: v */
    private void m12119v(String str) {
        this.f13369c.mo12167j().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Bundle mo12219o(Bundle bundle, LoginClient.Request request) {
        bundle.putString("redirect_uri", mo12095q());
        bundle.putString("client_id", request.mo12179a());
        bundle.putString("e2e", LoginClient.m12043l());
        bundle.putString("response_type", "token,signed_request,graph_domain");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.mo12181d());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{C3642m.m12293s()}));
        if (mo12096r() != null) {
            bundle.putString("sso", mo12096r());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Bundle mo12220p(LoginClient.Request request) {
        Bundle bundle = new Bundle();
        if (!C3481f0.m11605P(request.mo12187i())) {
            String join = TextUtils.join(",", request.mo12187i());
            bundle.putString("scope", join);
            mo12213a("scope", join);
        }
        bundle.putString("default_audience", request.mo12183e().mo12231d());
        bundle.putString("state", mo12214f(request.mo12180b()));
        AccessToken h = AccessToken.m11205h();
        String r = h != null ? h.mo11191r() : null;
        String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        if (r == null || !r.equals(m12118t())) {
            C3481f0.m11628g(this.f13369c.mo12167j());
            mo12213a("access_token", SessionDescription.SUPPORTED_SDP_VERSION);
        } else {
            bundle.putString("access_token", r);
            mo12213a("access_token", str);
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (!C3642m.m12283i()) {
            str = SessionDescription.SUPPORTED_SDP_VERSION;
        }
        bundle.putString("ies", str);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public String mo12095q() {
        return "fb" + C3642m.m12280f() + "://authorize";
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo12096r() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract C3436c mo12097s();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo12221u(LoginClient.Request request, Bundle bundle, C3572j jVar) {
        LoginClient.Result result;
        String str;
        this.f13370d = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f13370d = bundle.getString("e2e");
            }
            try {
                AccessToken e = LoginMethodHandler.m12100e(request.mo12187i(), bundle, mo12097s(), request.mo12179a());
                result = LoginClient.Result.m12090e(this.f13369c.mo12172r(), e);
                CookieSyncManager.createInstance(this.f13369c.mo12167j()).sync();
                m12119v(e.mo11191r());
            } catch (C3572j e2) {
                result = LoginClient.Result.m12088b(this.f13369c.mo12172r(), (String) null, e2.getMessage());
            }
        } else if (jVar instanceof C3575l) {
            result = LoginClient.Result.m12087a(this.f13369c.mo12172r(), "User canceled log in.");
        } else {
            this.f13370d = null;
            String message = jVar.getMessage();
            if (jVar instanceof C3650o) {
                FacebookRequestError a = ((C3650o) jVar).mo12348a();
                str = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(a.mo11225d())});
                message = a.toString();
            } else {
                str = null;
            }
            result = LoginClient.Result.m12089d(this.f13369c.mo12172r(), (String) null, message, str);
        }
        if (!C3481f0.m11604O(this.f13370d)) {
            mo12215i(this.f13370d);
        }
        this.f13369c.mo12166h(result);
    }

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
