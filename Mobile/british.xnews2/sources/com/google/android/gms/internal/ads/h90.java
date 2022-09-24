package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class h90 implements Parcelable.Creator<zzbtx> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                str = C11056a.m49500q(parcel, D);
            } else if (w != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                bundle = C11056a.m49489f(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzbtx(str, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbtx[i];
    }
}
