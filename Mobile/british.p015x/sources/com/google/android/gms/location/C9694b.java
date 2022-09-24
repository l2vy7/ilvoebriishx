package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.location.b */
public final class C9694b implements Parcelable.Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 2:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 3:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 4:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 5:
                    j3 = C11056a.m49476H(parcel2, D);
                    break;
                case 6:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 7:
                    f = C11056a.m49470B(parcel2, D);
                    break;
                case 8:
                    j4 = C11056a.m49476H(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
