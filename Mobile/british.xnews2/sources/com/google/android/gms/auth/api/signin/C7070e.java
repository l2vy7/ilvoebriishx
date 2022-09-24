package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.auth.api.signin.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7070e implements Parcelable.Creator<GoogleSignInOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        ArrayList<Scope> arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 2:
                    arrayList = C11056a.m49504u(parcel, D, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C11056a.m49499p(parcel, D, Account.CREATOR);
                    break;
                case 4:
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 5:
                    z2 = C11056a.m49507x(parcel, D);
                    break;
                case 6:
                    z3 = C11056a.m49507x(parcel, D);
                    break;
                case 7:
                    str = C11056a.m49500q(parcel, D);
                    break;
                case 8:
                    str2 = C11056a.m49500q(parcel, D);
                    break;
                case 9:
                    arrayList2 = C11056a.m49504u(parcel, D, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = C11056a.m49500q(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
