package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;
import p256v4.C11058b;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C7072g();
    @Deprecated

    /* renamed from: b */
    private String f19921b;

    /* renamed from: c */
    private GoogleSignInAccount f19922c;
    @Deprecated

    /* renamed from: d */
    private String f19923d;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f19922c = googleSignInAccount;
        this.f19921b = C4604n.m20095h(str, "8.3 and 8.4 SDKs require non-null email");
        this.f19923d = C4604n.m20095h(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Nullable
    /* renamed from: W */
    public final GoogleSignInAccount mo17814W() {
        return this.f19922c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 4, this.f19921b, false);
        C11058b.m49535u(parcel, 7, this.f19922c, i, false);
        C11058b.m49537w(parcel, 8, this.f19923d, false);
        C11058b.m49516b(parcel, a);
    }
}
