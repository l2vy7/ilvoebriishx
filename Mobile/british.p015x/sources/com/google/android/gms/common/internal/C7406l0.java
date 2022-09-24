package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.common.internal.l0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7406l0 implements Parcelable.Creator<zax> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                i2 = C11056a.m49474F(parcel, D);
            } else if (w == 3) {
                i3 = C11056a.m49474F(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                scopeArr = (Scope[]) C11056a.m49503t(parcel, D, Scope.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zax(i, i2, i3, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zax[i];
    }
}
