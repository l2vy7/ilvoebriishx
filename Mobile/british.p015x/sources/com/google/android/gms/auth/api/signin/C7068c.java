package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.auth.api.signin.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7068c implements Parcelable.Creator<GoogleSignInAccount> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 2:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 3:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 4:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 5:
                    str4 = C11056a.m49500q(parcel2, D);
                    break;
                case 6:
                    uri = (Uri) C11056a.m49499p(parcel2, D, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C11056a.m49500q(parcel2, D);
                    break;
                case 8:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 9:
                    str6 = C11056a.m49500q(parcel2, D);
                    break;
                case 10:
                    arrayList = C11056a.m49504u(parcel2, D, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C11056a.m49500q(parcel2, D);
                    break;
                case 12:
                    str8 = C11056a.m49500q(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
