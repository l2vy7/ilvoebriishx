package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.f */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7097f implements Parcelable.Creator<zzbl> {
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
        return new zzbl(i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbl[i];
    }
}
