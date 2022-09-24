package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.common.t */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7465t implements Parcelable.Creator<zzq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                z = C11056a.m49507x(parcel, D);
            } else if (w == 2) {
                str = C11056a.m49500q(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                i = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzq(z, str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
