package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.location.k */
public final class C9703k implements Parcelable.Creator<zzj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                z = C11056a.m49507x(parcel2, D);
            } else if (w == 2) {
                j = C11056a.m49476H(parcel2, D);
            } else if (w == 3) {
                f = C11056a.m49470B(parcel2, D);
            } else if (w == 4) {
                j2 = C11056a.m49476H(parcel2, D);
            } else if (w != 5) {
                C11056a.m49480L(parcel2, D);
            } else {
                i = C11056a.m49474F(parcel2, D);
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzj(z, j, f, j2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
