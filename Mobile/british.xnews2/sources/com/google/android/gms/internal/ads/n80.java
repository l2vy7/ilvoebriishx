package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n80 implements Parcelable.Creator<zzbta> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 2) {
                strArr = C11056a.m49501r(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                strArr2 = C11056a.m49501r(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzbta(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbta[i];
    }
}
