package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.C3436c;
import com.facebook.C3572j;
import com.facebook.internal.C3473c0;
import com.facebook.internal.C3481f0;
import com.facebook.login.LoginClient;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: o */
    private String m12112o(Bundle bundle) {
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    /* renamed from: p */
    private String m12113p(Bundle bundle) {
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString("error_description") : string;
    }

    /* renamed from: q */
    private LoginClient.Result m12114q(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String o = m12112o(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        if ("CONNECTION_FAILURE".equals(obj)) {
            return LoginClient.Result.m12089d(request, o, m12113p(extras), obj);
        }
        return LoginClient.Result.m12087a(request, o);
    }

    /* renamed from: r */
    private LoginClient.Result m12115r(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String o = m12112o(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        String p = m12113p(extras);
        String string = extras.getString("e2e");
        if (!C3481f0.m11604O(string)) {
            mo12215i(string);
        }
        if (o == null && obj == null && p == null) {
            try {
                return LoginClient.Result.m12090e(request, LoginMethodHandler.m12100e(request.mo12187i(), extras, C3436c.FACEBOOK_APPLICATION_WEB, request.mo12179a()));
            } catch (C3572j e) {
                return LoginClient.Result.m12088b(request, (String) null, e.getMessage());
            }
        } else if (C3473c0.f13031a.contains(o)) {
            return null;
        } else {
            if (C3473c0.f13032b.contains(o)) {
                return LoginClient.Result.m12087a(request, (String) null);
            }
            return LoginClient.Result.m12089d(request, o, p, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo12092k(int i, int i2, Intent intent) {
        LoginClient.Result result;
        LoginClient.Request r = this.f13369c.mo12172r();
        if (intent == null) {
            result = LoginClient.Result.m12087a(r, "Operation canceled");
        } else if (i2 == 0) {
            result = m12114q(r, intent);
        } else if (i2 != -1) {
            result = LoginClient.Result.m12088b(r, "Unexpected resultCode from authorization.", (String) null);
        } else {
            result = m12115r(r, intent);
        }
        if (result != null) {
            this.f13369c.mo12166h(result);
            return true;
        }
        this.f13369c.mo12158D();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo12218s(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f13369c.mo12169m().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
