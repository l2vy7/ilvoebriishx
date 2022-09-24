package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.common.server.response.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7462d implements Parcelable.Creator<zal> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        ArrayList<zam> arrayList = null;
        int i = 0;
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
                arrayList = C11056a.m49504u(parcel, D, zam.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zal(i, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zal[i];
    }
}
