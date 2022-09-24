package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class y80 implements Parcelable.Creator<zzbtn> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 2) {
                z = C11056a.m49507x(parcel, D);
            } else if (w == 3) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                str2 = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzbtn(str, z, i, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbtn[i];
    }
}
