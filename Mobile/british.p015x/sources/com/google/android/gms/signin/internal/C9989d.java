package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zat;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.signin.internal.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9989d implements Parcelable.Creator<zai> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        zat zat = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                zat = (zat) C11056a.m49499p(parcel, D, zat.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zai(i, zat);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zai[i];
    }
}
