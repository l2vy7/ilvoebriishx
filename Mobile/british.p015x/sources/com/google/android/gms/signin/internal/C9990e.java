package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.signin.internal.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9990e implements Parcelable.Creator<zak> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        ConnectionResult connectionResult = null;
        zav zav = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                connectionResult = (ConnectionResult) C11056a.m49499p(parcel, D, ConnectionResult.CREATOR);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                zav = (zav) C11056a.m49499p(parcel, D, zav.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zak(i, connectionResult, zav);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
