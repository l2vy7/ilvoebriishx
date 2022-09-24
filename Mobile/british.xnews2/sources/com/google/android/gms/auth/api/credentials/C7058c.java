package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.auth.api.credentials.c */
public final class C7058c implements Parcelable.Creator<CredentialPickerConfig> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 1) {
                z = C11056a.m49507x(parcel, D);
            } else if (w == 2) {
                z2 = C11056a.m49507x(parcel, D);
            } else if (w == 3) {
                z3 = C11056a.m49507x(parcel, D);
            } else if (w == 4) {
                i2 = C11056a.m49474F(parcel, D);
            } else if (w != 1000) {
                C11056a.m49480L(parcel, D);
            } else {
                i = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
