package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.location.l */
public final class C9704l implements Parcelable.Creator<GeofencingRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        ArrayList<zzbh> arrayList = null;
        int i = 0;
        String str = "";
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                arrayList = C11056a.m49504u(parcel, D, zzbh.CREATOR);
            } else if (w == 2) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                str = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new GeofencingRequest(arrayList, i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GeofencingRequest[i];
    }
}
