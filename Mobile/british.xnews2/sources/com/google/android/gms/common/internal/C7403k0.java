package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.common.internal.k0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7403k0 implements Parcelable.Creator<zav> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                iBinder = C11056a.m49473E(parcel, D);
            } else if (w == 3) {
                connectionResult = (ConnectionResult) C11056a.m49499p(parcel, D, ConnectionResult.CREATOR);
            } else if (w == 4) {
                z = C11056a.m49507x(parcel, D);
            } else if (w != 5) {
                C11056a.m49480L(parcel, D);
            } else {
                z2 = C11056a.m49507x(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zav(i, iBinder, connectionResult, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zav[i];
    }
}
