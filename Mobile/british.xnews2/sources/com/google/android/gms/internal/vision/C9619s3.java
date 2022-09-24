package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.internal.vision.s3 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C9619s3 implements Parcelable.Creator<zzk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                z = C11056a.m49507x(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzk(i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzk[i];
    }
}
