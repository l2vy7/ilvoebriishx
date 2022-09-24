package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.internal.ads.su */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8168su implements Parcelable.Creator<zzbfi> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        zzbfi[] zzbfiArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 3:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 4:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 5:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 6:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                case 7:
                    i4 = C11056a.m49474F(parcel2, D);
                    break;
                case 8:
                    zzbfiArr = (zzbfi[]) C11056a.m49503t(parcel2, D, zzbfi.CREATOR);
                    break;
                case 9:
                    z2 = C11056a.m49507x(parcel2, D);
                    break;
                case 10:
                    z3 = C11056a.m49507x(parcel2, D);
                    break;
                case 11:
                    z4 = C11056a.m49507x(parcel2, D);
                    break;
                case 12:
                    z5 = C11056a.m49507x(parcel2, D);
                    break;
                case 13:
                    z6 = C11056a.m49507x(parcel2, D);
                    break;
                case 14:
                    z7 = C11056a.m49507x(parcel2, D);
                    break;
                case 15:
                    z8 = C11056a.m49507x(parcel2, D);
                    break;
                case 16:
                    z9 = C11056a.m49507x(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzbfi(str, i, i2, z, i3, i4, zzbfiArr, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfi[i];
    }
}
