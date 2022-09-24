package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.internal.measurement.n1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9262n1 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 2:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 3:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 4:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 5:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 6:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 7:
                    bundle = C11056a.m49489f(parcel2, D);
                    break;
                case 8:
                    str4 = C11056a.m49500q(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzcl(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
