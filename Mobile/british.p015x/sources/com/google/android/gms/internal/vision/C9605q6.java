package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.internal.vision.q6 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public final class C9605q6 implements Parcelable.Creator<zzu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 3) {
                i2 = C11056a.m49474F(parcel, D);
            } else if (w == 4) {
                i3 = C11056a.m49474F(parcel, D);
            } else if (w == 5) {
                j = C11056a.m49476H(parcel, D);
            } else if (w != 6) {
                C11056a.m49480L(parcel, D);
            } else {
                i4 = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzu(i, i2, i3, j, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
