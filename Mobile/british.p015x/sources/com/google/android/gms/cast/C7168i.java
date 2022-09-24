package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.cast.i */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7168i implements Parcelable.Creator<MediaLiveSeekableRange> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                j = C11056a.m49476H(parcel, D);
            } else if (w == 3) {
                j2 = C11056a.m49476H(parcel, D);
            } else if (w == 4) {
                z = C11056a.m49507x(parcel, D);
            } else if (w != 5) {
                C11056a.m49480L(parcel, D);
            } else {
                z2 = C11056a.m49507x(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new MediaLiveSeekableRange(j, j2, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaLiveSeekableRange[i];
    }
}
