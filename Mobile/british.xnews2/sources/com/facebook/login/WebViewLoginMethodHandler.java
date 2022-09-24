package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C3436c;
import com.facebook.C3572j;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3486g;
import com.facebook.internal.C3494h0;
import com.facebook.login.LoginClient;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C3598b();

    /* renamed from: e */
    private C3494h0 f13371e;

    /* renamed from: f */
    private String f13372f;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    class C3597a implements C3494h0.C3501g {

        /* renamed from: a */
        final /* synthetic */ LoginClient.Request f13373a;

        C3597a(LoginClient.Request request) {
            this.f13373a = request;
        }

        /* renamed from: a */
        public void mo11939a(Bundle bundle, C3572j jVar) {
            WebViewLoginMethodHandler.this.mo12223w(this.f13373a, bundle, jVar);
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$b */
    static class C3598b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        C3598b() {
        }

        /* renamed from: a */
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        /* renamed from: b */
        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$c */
    static class C3599c extends C3494h0.C3499e {

        /* renamed from: h */
        private String f13375h;

        /* renamed from: i */
        private String f13376i;

        /* renamed from: j */
        private String f13377j = "fbconnect://success";

        public C3599c(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        /* renamed from: a */
        public C3494h0 mo11964a() {
            Bundle f = mo11968f();
            f.putString("redirect_uri", this.f13377j);
            f.putString("client_id", mo11965c());
            f.putString("e2e", this.f13375h);
            f.putString("response_type", "token,signed_request,graph_domain");
            f.putString("return_scopes", "true");
            f.putString("auth_type", this.f13376i);
            return C3494h0.m11709q(mo11966d(), "oauth", f, mo11969g(), mo11967e());
        }

        /* renamed from: i */
        public C3599c mo12228i(String str) {
            this.f13376i = str;
            return this;
        }

        /* renamed from: j */
        public C3599c mo12229j(String str) {
            this.f13375h = str;
            return this;
        }

        /* renamed from: k */
        public C3599c mo12230k(boolean z) {
            this.f13377j = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12141b() {
        C3494h0 h0Var = this.f13371e;
        if (h0Var != null) {
            h0Var.cancel();
            this.f13371e = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo12091g() {
        return "web_view";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo12216j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo12094n(LoginClient.Request request) {
        Bundle p = mo12220p(request);
        C3597a aVar = new C3597a(request);
        String l = LoginClient.m12043l();
        this.f13372f = l;
        mo12213a("e2e", l);
        FragmentActivity j = this.f13369c.mo12167j();
        this.f13371e = new C3599c(j, request.mo12179a(), p).mo12229j(this.f13372f).mo12230k(C3481f0.m11600K(j)).mo12228i(request.mo12181d()).mo11970h(aVar).mo11964a();
        C3486g gVar = new C3486g();
        gVar.mo3364H1(true);
        gVar.mo11938j2(this.f13371e);
        gVar.mo3729e2(j.mo3505r(), "FacebookDialogFragment");
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C3436c mo12097s() {
        return C3436c.WEB_VIEW;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo12223w(LoginClient.Request request, Bundle bundle, C3572j jVar) {
        super.mo12221u(request, bundle, jVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f13372f);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f13372f = parcel.readString();
    }
}
