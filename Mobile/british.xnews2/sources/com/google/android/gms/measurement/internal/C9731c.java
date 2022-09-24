package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.measurement.internal.c */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9731c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzks zzks = null;
        String str3 = null;
        zzau zzau = null;
        zzau zzau2 = null;
        zzau zzau3 = null;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 3:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 4:
                    zzks = (zzks) C11056a.m49499p(parcel2, D, zzks.CREATOR);
                    break;
                case 5:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 6:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 7:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 8:
                    zzau = (zzau) C11056a.m49499p(parcel2, D, zzau.CREATOR);
                    break;
                case 9:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 10:
                    zzau2 = (zzau) C11056a.m49499p(parcel2, D, zzau.CREATOR);
                    break;
                case 11:
                    j3 = C11056a.m49476H(parcel2, D);
                    break;
                case 12:
                    zzau3 = (zzau) C11056a.m49499p(parcel2, D, zzau.CREATOR);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzab(str, str2, zzks, j, z, str3, zzau, j2, zzau2, j3, zzau3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzab[i];
    }
}
