package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.measurement.internal.q */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9881q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            if (C11056a.m49506w(D) != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                bundle = C11056a.m49489f(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzas(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzas[i];
    }
}
