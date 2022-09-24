package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class e30 implements Parcelable.Creator<zzbnw> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        zzbkq zzbkq = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 2:
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 3:
                    i2 = C11056a.m49474F(parcel, D);
                    break;
                case 4:
                    z2 = C11056a.m49507x(parcel, D);
                    break;
                case 5:
                    i3 = C11056a.m49474F(parcel, D);
                    break;
                case 6:
                    zzbkq = (zzbkq) C11056a.m49499p(parcel, D, zzbkq.CREATOR);
                    break;
                case 7:
                    z3 = C11056a.m49507x(parcel, D);
                    break;
                case 8:
                    i4 = C11056a.m49474F(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzbnw(i, z, i2, z2, i3, zzbkq, z3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbnw[i];
    }
}
