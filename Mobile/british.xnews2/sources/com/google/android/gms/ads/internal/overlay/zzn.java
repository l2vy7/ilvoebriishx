package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zzcjf;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzn implements Parcelable.Creator<AdOverlayInfoParcel> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        zzc zzc = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzcjf zzcjf = null;
        String str4 = null;
        zzj zzj = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    zzc = (zzc) C11056a.m49499p(parcel2, D, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = C11056a.m49473E(parcel2, D);
                    break;
                case 4:
                    iBinder2 = C11056a.m49473E(parcel2, D);
                    break;
                case 5:
                    iBinder3 = C11056a.m49473E(parcel2, D);
                    break;
                case 6:
                    iBinder4 = C11056a.m49473E(parcel2, D);
                    break;
                case 7:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 8:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 9:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 10:
                    iBinder5 = C11056a.m49473E(parcel2, D);
                    break;
                case 11:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 12:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 13:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 14:
                    zzcjf = (zzcjf) C11056a.m49499p(parcel2, D, zzcjf.CREATOR);
                    break;
                case 16:
                    str4 = C11056a.m49500q(parcel2, D);
                    break;
                case 17:
                    zzj = (zzj) C11056a.m49499p(parcel2, D, zzj.CREATOR);
                    break;
                case 18:
                    iBinder6 = C11056a.m49473E(parcel2, D);
                    break;
                case 19:
                    str5 = C11056a.m49500q(parcel2, D);
                    break;
                case 20:
                    iBinder7 = C11056a.m49473E(parcel2, D);
                    break;
                case 21:
                    iBinder8 = C11056a.m49473E(parcel2, D);
                    break;
                case 22:
                    iBinder9 = C11056a.m49473E(parcel2, D);
                    break;
                case 23:
                    iBinder10 = C11056a.m49473E(parcel2, D);
                    break;
                case 24:
                    str6 = C11056a.m49500q(parcel2, D);
                    break;
                case 25:
                    str7 = C11056a.m49500q(parcel2, D);
                    break;
                case 26:
                    iBinder11 = C11056a.m49473E(parcel2, D);
                    break;
                case 27:
                    iBinder12 = C11056a.m49473E(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new AdOverlayInfoParcel(zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzcjf, str4, zzj, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6, str7, iBinder11, iBinder12);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
