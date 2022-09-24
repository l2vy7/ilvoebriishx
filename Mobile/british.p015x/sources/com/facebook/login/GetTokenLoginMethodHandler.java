package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.C3436c;
import com.facebook.C3572j;
import com.facebook.internal.C3456a0;
import com.facebook.internal.C3481f0;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C3589c();

    /* renamed from: d */
    private C3602c f13331d;

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    class C3587a implements C3456a0.C3458b {

        /* renamed from: a */
        final /* synthetic */ LoginClient.Request f13332a;

        C3587a(LoginClient.Request request) {
            this.f13332a = request;
        }

        /* renamed from: a */
        public void mo11916a(Bundle bundle) {
            GetTokenLoginMethodHandler.this.mo12144p(this.f13332a, bundle);
        }
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$b */
    class C3588b implements C3481f0.C3484c {

        /* renamed from: a */
        final /* synthetic */ Bundle f13334a;

        /* renamed from: b */
        final /* synthetic */ LoginClient.Request f13335b;

        C3588b(Bundle bundle, LoginClient.Request request) {
            this.f13334a = bundle;
            this.f13335b = request;
        }

        /* renamed from: a */
        public void mo11289a(JSONObject jSONObject) {
            try {
                this.f13334a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString(TtmlNode.ATTR_ID));
                GetTokenLoginMethodHandler.this.mo12145q(this.f13335b, this.f13334a);
            } catch (JSONException e) {
                LoginClient loginClient = GetTokenLoginMethodHandler.this.f13369c;
                loginClient.mo12165g(LoginClient.Result.m12088b(loginClient.mo12172r(), "Caught exception", e.getMessage()));
            }
        }

        /* renamed from: b */
        public void mo11290b(C3572j jVar) {
            LoginClient loginClient = GetTokenLoginMethodHandler.this.f13369c;
            loginClient.mo12165g(LoginClient.Result.m12088b(loginClient.mo12172r(), "Caught exception", jVar.getMessage()));
        }
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$c */
    static class C3589c implements Parcelable.Creator {
        C3589c() {
        }

        /* renamed from: a */
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        /* renamed from: b */
        public GetTokenLoginMethodHandler[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12141b() {
        C3602c cVar = this.f13331d;
        if (cVar != null) {
            cVar.mo11908b();
            this.f13331d.mo11911f((C3456a0.C3458b) null);
            this.f13331d = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo12091g() {
        return "get_token";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo12094n(LoginClient.Request request) {
        C3602c cVar = new C3602c(this.f13369c.mo12167j(), request.mo12179a());
        this.f13331d = cVar;
        if (!cVar.mo11912g()) {
            return false;
        }
        this.f13369c.mo12173u();
        this.f13331d.mo11911f(new C3587a(request));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo12143o(LoginClient.Request request, Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.f13369c.mo12173u();
            C3481f0.m11659x(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new C3588b(bundle, request));
            return;
        }
        mo12145q(request, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo12144p(LoginClient.Request request, Bundle bundle) {
        C3602c cVar = this.f13331d;
        if (cVar != null) {
            cVar.mo11911f((C3456a0.C3458b) null);
        }
        this.f13331d = null;
        this.f13369c.mo12174v();
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> i = request.mo12187i();
            if (stringArrayList == null || (i != null && !stringArrayList.containsAll(i))) {
                HashSet hashSet = new HashSet();
                for (String next : i) {
                    if (!stringArrayList.contains(next)) {
                        hashSet.add(next);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mo12213a("new_permissions", TextUtils.join(",", hashSet));
                }
                request.mo12192n(hashSet);
            } else {
                mo12143o(request, bundle);
                return;
            }
        }
        this.f13369c.mo12158D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo12145q(LoginClient.Request request, Bundle bundle) {
        this.f13369c.mo12166h(LoginClient.Result.m12090e(this.f13369c.mo12172r(), LoginMethodHandler.m12099d(bundle, C3436c.FACEBOOK_APPLICATION_SERVICE, request.mo12179a())));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
