package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ti0 implements Parcelable.Creator<zzcdo> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            if (C11056a.m49506w(D) != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C11056a.m49499p(parcel, D, ParcelFileDescriptor.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzcdo(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdo[i];
    }
}
