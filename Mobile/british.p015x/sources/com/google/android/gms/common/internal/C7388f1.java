package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.common.internal.f1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7388f1 implements Parcelable.Creator<zzj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                bundle = C11056a.m49489f(parcel, D);
            } else if (w == 2) {
                featureArr = (Feature[]) C11056a.m49503t(parcel, D, Feature.CREATOR);
            } else if (w == 3) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) C11056a.m49499p(parcel, D, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzj(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
