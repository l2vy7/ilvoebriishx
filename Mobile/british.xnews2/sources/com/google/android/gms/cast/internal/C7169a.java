package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.internal.a */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7169a implements Parcelable.Creator<zza> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            if (C11056a.m49506w(D) != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                str = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zza(str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
