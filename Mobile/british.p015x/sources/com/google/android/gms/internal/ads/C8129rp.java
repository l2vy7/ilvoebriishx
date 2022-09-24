package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.internal.ads.rp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8129rp implements Parcelable.Creator<zzbah> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) C11056a.m49499p(parcel, D, ParcelFileDescriptor.CREATOR);
            } else if (w == 3) {
                z = C11056a.m49507x(parcel, D);
            } else if (w == 4) {
                z2 = C11056a.m49507x(parcel, D);
            } else if (w == 5) {
                j = C11056a.m49476H(parcel, D);
            } else if (w != 6) {
                C11056a.m49480L(parcel, D);
            } else {
                z3 = C11056a.m49507x(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzbah(parcelFileDescriptor, z, z2, j, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbah[i];
    }
}
