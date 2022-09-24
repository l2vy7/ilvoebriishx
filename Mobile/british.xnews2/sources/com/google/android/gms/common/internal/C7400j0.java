package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.common.internal.j0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7400j0 implements Parcelable.Creator<zat> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                account = (Account) C11056a.m49499p(parcel, D, Account.CREATOR);
            } else if (w == 3) {
                i2 = C11056a.m49474F(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C11056a.m49499p(parcel, D, GoogleSignInAccount.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zat(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zat[i];
    }
}
