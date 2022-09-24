package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C3563z;
import com.facebook.login.LoginClient;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new C3590a();

    /* renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$a */
    static class C3590a implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
        C3590a() {
        }

        /* renamed from: a */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        /* renamed from: b */
        public KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo12091g() {
        return "katana_proxy_auth";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo12094n(LoginClient.Request request) {
        String l = LoginClient.m12043l();
        Intent n = C3563z.m11922n(this.f13369c.mo12167j(), request.mo12179a(), request.mo12187i(), l, request.mo12189k(), request.mo12188j(), request.mo12183e(), mo12214f(request.mo12180b()), request.mo12181d());
        mo12213a("e2e", l);
        return mo12218s(n, LoginClient.m12045q());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
