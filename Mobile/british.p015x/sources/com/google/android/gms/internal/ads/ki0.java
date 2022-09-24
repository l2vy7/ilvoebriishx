package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p257v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ki0 implements Parcelable.Creator<zzcde> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                z = C11056a.m49507x(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                arrayList = C11056a.m49502s(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzcde(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcde[i];
    }
}
