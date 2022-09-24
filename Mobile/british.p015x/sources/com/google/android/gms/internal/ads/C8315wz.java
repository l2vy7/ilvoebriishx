package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.internal.ads.wz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8315wz implements Parcelable.Creator<zzbkq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                z = C11056a.m49507x(parcel, D);
            } else if (w == 3) {
                z2 = C11056a.m49507x(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                z3 = C11056a.m49507x(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzbkq(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbkq[i];
    }
}
