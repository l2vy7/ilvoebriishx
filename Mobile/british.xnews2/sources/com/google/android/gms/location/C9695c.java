package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.location.c */
public final class C9695c implements Parcelable.Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        List<Location> list = LocationResult.f46094c;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            if (C11056a.m49506w(D) != 1) {
                C11056a.m49480L(parcel, D);
            } else {
                list = C11056a.m49504u(parcel, D, Location.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
