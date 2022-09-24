package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.common.r */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7453r implements Parcelable.Creator<zzn> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 2) {
                z = C11056a.m49507x(parcel, D);
            } else if (w == 3) {
                z2 = C11056a.m49507x(parcel, D);
            } else if (w == 4) {
                iBinder = C11056a.m49473E(parcel, D);
            } else if (w != 5) {
                C11056a.m49480L(parcel, D);
            } else {
                z3 = C11056a.m49507x(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzn(str, z, z2, iBinder, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzn[i];
    }
}
