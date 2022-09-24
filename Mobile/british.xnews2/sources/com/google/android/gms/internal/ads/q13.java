package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q13 implements Parcelable.Creator<zzfnm> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                bArr = C11056a.m49490g(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzfnm(i, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfnm[i];
    }
}
