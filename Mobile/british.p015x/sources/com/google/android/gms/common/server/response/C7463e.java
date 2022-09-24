package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.common.server.response.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7463e implements Parcelable.Creator<SafeParcelResponse> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        Parcel parcel2 = null;
        zan zan = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                parcel2 = C11056a.m49497n(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                zan = (zan) C11056a.m49499p(parcel, D, zan.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new SafeParcelResponse(i, parcel2, zan);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
