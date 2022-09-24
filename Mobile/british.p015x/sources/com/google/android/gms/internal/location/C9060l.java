package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.internal.location.l */
public final class C9060l implements Parcelable.Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        zzm zzm = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                zzm = (zzm) C11056a.m49499p(parcel, D, zzm.CREATOR);
            } else if (w == 3) {
                iBinder = C11056a.m49473E(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                iBinder2 = C11056a.m49473E(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzo(i, zzm, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
