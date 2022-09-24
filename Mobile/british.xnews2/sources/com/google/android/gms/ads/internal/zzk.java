package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzk implements Parcelable.Creator<zzj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 3:
                    z2 = C11056a.m49507x(parcel, D);
                    break;
                case 4:
                    str = C11056a.m49500q(parcel, D);
                    break;
                case 5:
                    z3 = C11056a.m49507x(parcel, D);
                    break;
                case 6:
                    f = C11056a.m49470B(parcel, D);
                    break;
                case 7:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 8:
                    z4 = C11056a.m49507x(parcel, D);
                    break;
                case 9:
                    z5 = C11056a.m49507x(parcel, D);
                    break;
                case 10:
                    z6 = C11056a.m49507x(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzj(z, z2, str, z3, f, i, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
