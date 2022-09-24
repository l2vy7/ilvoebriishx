package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzb implements Parcelable.Creator<zzc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    str = C11056a.m49500q(parcel, D);
                    break;
                case 3:
                    str2 = C11056a.m49500q(parcel, D);
                    break;
                case 4:
                    str3 = C11056a.m49500q(parcel, D);
                    break;
                case 5:
                    str4 = C11056a.m49500q(parcel, D);
                    break;
                case 6:
                    str5 = C11056a.m49500q(parcel, D);
                    break;
                case 7:
                    str6 = C11056a.m49500q(parcel, D);
                    break;
                case 8:
                    str7 = C11056a.m49500q(parcel, D);
                    break;
                case 9:
                    intent = (Intent) C11056a.m49499p(parcel, D, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = C11056a.m49473E(parcel, D);
                    break;
                case 11:
                    z = C11056a.m49507x(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
