package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.b */
public final class C7051b implements Parcelable.Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 2:
                    arrayList = C11056a.m49502s(parcel, D);
                    break;
                case 3:
                    arrayList2 = C11056a.m49502s(parcel, D);
                    break;
                case 4:
                    arrayList3 = C11056a.m49502s(parcel, D);
                    break;
                case 5:
                    arrayList4 = C11056a.m49502s(parcel, D);
                    break;
                case 6:
                    arrayList5 = C11056a.m49502s(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzo(i, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
