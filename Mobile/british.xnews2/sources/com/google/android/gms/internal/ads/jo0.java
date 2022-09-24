package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class jo0 implements Parcelable.Creator<zzcjf> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 3) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 4) {
                i2 = C11056a.m49474F(parcel, D);
            } else if (w == 5) {
                z = C11056a.m49507x(parcel, D);
            } else if (w != 6) {
                C11056a.m49480L(parcel, D);
            } else {
                z2 = C11056a.m49507x(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzcjf(str, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcjf[i];
    }
}
