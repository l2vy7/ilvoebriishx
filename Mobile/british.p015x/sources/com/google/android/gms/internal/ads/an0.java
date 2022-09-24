package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class an0 implements Parcelable.Creator<zzchx> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        zzbfi zzbfi = null;
        zzbfd zzbfd = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 2) {
                str2 = C11056a.m49500q(parcel, D);
            } else if (w == 3) {
                zzbfi = (zzbfi) C11056a.m49499p(parcel, D, zzbfi.CREATOR);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                zzbfd = (zzbfd) C11056a.m49499p(parcel, D, zzbfd.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzchx(str, str2, zzbfi, zzbfd);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzchx[i];
    }
}
