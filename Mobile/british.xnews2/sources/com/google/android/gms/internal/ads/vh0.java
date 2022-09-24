package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class vh0 implements Parcelable.Creator<zzcco> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                iBinder = C11056a.m49473E(parcel, D);
            } else if (w != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                iBinder2 = C11056a.m49473E(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzcco(iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcco[i];
    }
}
