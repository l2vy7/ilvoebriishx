package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.common.internal.v0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7436v0 implements Parcelable.Creator<RootTelemetryConfiguration> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w == 2) {
                z = C11056a.m49507x(parcel, D);
            } else if (w == 3) {
                z2 = C11056a.m49507x(parcel, D);
            } else if (w == 4) {
                i2 = C11056a.m49474F(parcel, D);
            } else if (w != 5) {
                C11056a.m49480L(parcel, D);
            } else {
                i3 = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new RootTelemetryConfiguration(i, z, z2, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
