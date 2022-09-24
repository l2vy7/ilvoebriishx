package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rt2 implements Parcelable.Creator<zzffu> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 2:
                    i2 = C11056a.m49474F(parcel, D);
                    break;
                case 3:
                    i3 = C11056a.m49474F(parcel, D);
                    break;
                case 4:
                    i4 = C11056a.m49474F(parcel, D);
                    break;
                case 5:
                    str = C11056a.m49500q(parcel, D);
                    break;
                case 6:
                    i5 = C11056a.m49474F(parcel, D);
                    break;
                case 7:
                    i6 = C11056a.m49474F(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzffu(i, i2, i3, i4, str, i5, i6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzffu[i];
    }
}
