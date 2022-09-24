package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C3563z;
import com.facebook.login.LoginClient;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new C3586a();

    /* renamed from: com.facebook.login.FacebookLiteLoginMethodHandler$a */
    static class C3586a implements Parcelable.Creator<FacebookLiteLoginMethodHandler> {
        C3586a() {
        }

        /* renamed from: a */
        public FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }

        /* renamed from: b */
        public FacebookLiteLoginMethodHandler[] newArray(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo12091g() {
        return "fb_lite_login";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo12094n(LoginClient.Request request) {
        String l = LoginClient.m12043l();
        Intent j = C3563z.m11918j(this.f13369c.mo12167j(), request.mo12179a(), request.mo12187i(), l, request.mo12189k(), request.mo12188j(), request.mo12183e(), mo12214f(request.mo12180b()), request.mo12181d());
        mo12213a("e2e", l);
        return mo12218s(j, LoginClient.m12045q());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
