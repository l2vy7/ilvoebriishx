package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.location.e */
public final class C9697e implements Parcelable.Creator<LocationSettingsRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        boolean z = false;
        ArrayList<LocationRequest> arrayList = null;
        zzae zzae = null;
        boolean z2 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                arrayList = C11056a.m49504u(parcel, D, LocationRequest.CREATOR);
            } else if (w == 2) {
                z = C11056a.m49507x(parcel, D);
            } else if (w == 3) {
                z2 = C11056a.m49507x(parcel, D);
            } else if (w != 5) {
                C11056a.m49480L(parcel, D);
            } else {
                zzae = (zzae) C11056a.m49499p(parcel, D, zzae.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new LocationSettingsRequest(arrayList, z, z2, zzae);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
