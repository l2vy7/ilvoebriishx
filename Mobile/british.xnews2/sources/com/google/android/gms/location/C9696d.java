package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.location.d */
public final class C9696d implements Parcelable.Creator<zzae> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                str2 = C11056a.m49500q(parcel, D);
            } else if (w == 2) {
                str3 = C11056a.m49500q(parcel, D);
            } else if (w != 5) {
                C11056a.m49480L(parcel, D);
            } else {
                str = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzae(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
