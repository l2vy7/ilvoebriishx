package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.zzam;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.internal.b */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7170b implements Parcelable.Creator<zzy> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        ApplicationMetadata applicationMetadata = null;
        zzam zzam = null;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    d = C11056a.m49509z(parcel2, D);
                    break;
                case 3:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 4:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 5:
                    applicationMetadata = (ApplicationMetadata) C11056a.m49499p(parcel2, D, ApplicationMetadata.CREATOR);
                    break;
                case 6:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 7:
                    zzam = (zzam) C11056a.m49499p(parcel2, D, zzam.CREATOR);
                    break;
                case 8:
                    d2 = C11056a.m49509z(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzy(d, z, i, applicationMetadata, i2, zzam, d2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzy[i];
    }
}
