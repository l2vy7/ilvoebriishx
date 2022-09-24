package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.internal.ads.tu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8204tu implements Parcelable.Creator<zzbfk> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                i2 = C11056a.m49474F(parcel, D);
            } else if (w == 3) {
                str = C11056a.m49500q(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                j = C11056a.m49476H(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzbfk(i, i2, str, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfk[i];
    }
}
