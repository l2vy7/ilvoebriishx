package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.internal.vision.e */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C9498e implements Parcelable.Creator<zzam> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            C11056a.m49506w(D);
            C11056a.m49480L(parcel, D);
        }
        C11056a.m49505v(parcel, M);
        return new zzam();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzam[i];
    }
}
