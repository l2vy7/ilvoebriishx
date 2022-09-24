package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.common.internal.g1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7391g1 implements Parcelable.Creator<ConnectionTelemetryConfiguration> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) C11056a.m49499p(parcel, D, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 3:
                    z2 = C11056a.m49507x(parcel, D);
                    break;
                case 4:
                    iArr = C11056a.m49494k(parcel, D);
                    break;
                case 5:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 6:
                    iArr2 = C11056a.m49494k(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
