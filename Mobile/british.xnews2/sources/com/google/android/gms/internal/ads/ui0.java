package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ui0 implements Parcelable.Creator<zzcdq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        Bundle bundle = null;
        zzcjf zzcjf = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzffu zzffu = null;
        String str4 = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    bundle = C11056a.m49489f(parcel, D);
                    break;
                case 2:
                    zzcjf = (zzcjf) C11056a.m49499p(parcel, D, zzcjf.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) C11056a.m49499p(parcel, D, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = C11056a.m49500q(parcel, D);
                    break;
                case 5:
                    arrayList = C11056a.m49502s(parcel, D);
                    break;
                case 6:
                    packageInfo = (PackageInfo) C11056a.m49499p(parcel, D, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = C11056a.m49500q(parcel, D);
                    break;
                case 9:
                    str3 = C11056a.m49500q(parcel, D);
                    break;
                case 10:
                    zzffu = (zzffu) C11056a.m49499p(parcel, D, zzffu.CREATOR);
                    break;
                case 11:
                    str4 = C11056a.m49500q(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzcdq(bundle, zzcjf, applicationInfo, str, arrayList, packageInfo, str2, str3, zzffu, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdq[i];
    }
}
