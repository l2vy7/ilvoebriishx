package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.common.internal.u */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7433u implements Parcelable.Creator<TelemetryData> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        ArrayList<MethodInvocation> arrayList = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 2) {
                C11056a.m49480L(parcel, D);
            } else {
                arrayList = C11056a.m49504u(parcel, D, MethodInvocation.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new TelemetryData(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TelemetryData[i];
    }
}
