package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.auth.api.signin.g */
public final class C7072g implements Parcelable.Creator<SignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 4) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 7) {
                googleSignInAccount = (GoogleSignInAccount) C11056a.m49499p(parcel, D, GoogleSignInAccount.CREATOR);
            } else if (w != 8) {
                C11056a.m49480L(parcel, D);
            } else {
                str2 = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
