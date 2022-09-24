package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.framework.media.p0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C7136p0 implements Parcelable.Creator<ImageHints> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 3) {
                i2 = C11056a.m49474F(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                i3 = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new ImageHints(i, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ImageHints[i];
    }
}
