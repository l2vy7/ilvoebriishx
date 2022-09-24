package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.r */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7179r implements Parcelable.Creator<AdBreakStatus> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                j = C11056a.m49476H(parcel, D);
            } else if (w == 3) {
                j2 = C11056a.m49476H(parcel, D);
            } else if (w == 4) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 5) {
                str2 = C11056a.m49500q(parcel, D);
            } else if (w != 6) {
                C11056a.m49480L(parcel, D);
            } else {
                j3 = C11056a.m49476H(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new AdBreakStatus(j, j2, str, str2, j3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdBreakStatus[i];
    }
}
