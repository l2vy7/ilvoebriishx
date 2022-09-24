package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class j90 implements Parcelable.Creator<zzbtz> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i2 = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 3) {
                i3 = C11056a.m49474F(parcel, D);
            } else if (w != 1000) {
                C11056a.m49480L(parcel, D);
            } else {
                i = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzbtz(i, i2, str, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbtz[i];
    }
}
