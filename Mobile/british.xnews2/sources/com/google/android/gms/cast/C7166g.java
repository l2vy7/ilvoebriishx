package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.g */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7166g implements Parcelable.Creator<LaunchOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        CredentialsData credentialsData = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                z = C11056a.m49507x(parcel, D);
            } else if (w == 3) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 4) {
                z2 = C11056a.m49507x(parcel, D);
            } else if (w != 5) {
                C11056a.m49480L(parcel, D);
            } else {
                credentialsData = (CredentialsData) C11056a.m49499p(parcel, D, CredentialsData.CREATOR);
            }
        }
        C11056a.m49505v(parcel, M);
        return new LaunchOptions(z, str, z2, credentialsData);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LaunchOptions[i];
    }
}
