package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.internal.auth.a */
public final class C8425a implements Parcelable.Creator<zzab> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                str = C11056a.m49500q(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                i2 = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzab(i, str, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzab[i];
    }
}
