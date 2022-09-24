package com.google.android.gms.internal.vision;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.internal.vision.c */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C9478c implements Parcelable.Creator<zzaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        Rect rect = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            if (C11056a.m49506w(D) != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                rect = (Rect) C11056a.m49499p(parcel, D, Rect.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzaj(rect);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
