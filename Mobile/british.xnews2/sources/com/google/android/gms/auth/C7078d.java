package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.auth.d */
public final class C7078d implements Parcelable.Creator<TokenData> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        Long l = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 2:
                    str = C11056a.m49500q(parcel, D);
                    break;
                case 3:
                    l = C11056a.m49477I(parcel, D);
                    break;
                case 4:
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 5:
                    z2 = C11056a.m49507x(parcel, D);
                    break;
                case 6:
                    arrayList = C11056a.m49502s(parcel, D);
                    break;
                case 7:
                    str2 = C11056a.m49500q(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
