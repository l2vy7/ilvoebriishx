package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.internal.ads.hu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7770hu implements Parcelable.Creator<zzbew> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        zzbew zzbew = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 3) {
                str2 = C11056a.m49500q(parcel, D);
            } else if (w == 4) {
                zzbew = (zzbew) C11056a.m49499p(parcel, D, zzbew.CREATOR);
            } else if (w != 5) {
                C11056a.m49480L(parcel, D);
            } else {
                iBinder = C11056a.m49473E(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzbew(i, str, str2, zzbew, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbew[i];
    }
}
