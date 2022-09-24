package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b23 implements Parcelable.Creator<zzfoa> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                bArr = C11056a.m49490g(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                i2 = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzfoa(i, bArr, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfoa[i];
    }
}
