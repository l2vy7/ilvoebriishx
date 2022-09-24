package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.internal.ads.tp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8199tp implements Parcelable.Creator<zzbak> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 3:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 4:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 5:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 6:
                    str4 = C11056a.m49500q(parcel2, D);
                    break;
                case 7:
                    bundle = C11056a.m49489f(parcel2, D);
                    break;
                case 8:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 9:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 10:
                    str5 = C11056a.m49500q(parcel2, D);
                    break;
                case 11:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzbak(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbak[i];
    }
}
