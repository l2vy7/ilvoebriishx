package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.signin.internal.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9987b implements Parcelable.Creator<zaa> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                i2 = C11056a.m49474F(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                intent = (Intent) C11056a.m49499p(parcel, D, Intent.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zaa(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
