package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.internal.ads.vu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8277vu implements Parcelable.Creator<zzbfo> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            if (C11056a.m49506w(D) != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                i = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzbfo(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfo[i];
    }
}
