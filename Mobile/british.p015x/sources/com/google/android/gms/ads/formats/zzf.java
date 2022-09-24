package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzf implements Parcelable.Creator<PublisherAdViewOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                z = C11056a.m49507x(parcel, D);
            } else if (w == 2) {
                iBinder = C11056a.m49473E(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                iBinder2 = C11056a.m49473E(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new PublisherAdViewOptions(z, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }
}
