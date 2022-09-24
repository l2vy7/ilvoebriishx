package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.internal.ads.pu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8063pu implements Parcelable.Creator<zzbfd> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        zzbkm zzbkm = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzbeu zzbeu = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 2:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 3:
                    bundle = C11056a.m49489f(parcel2, D);
                    break;
                case 4:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 5:
                    arrayList = C11056a.m49502s(parcel2, D);
                    break;
                case 6:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 7:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                case 8:
                    z2 = C11056a.m49507x(parcel2, D);
                    break;
                case 9:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 10:
                    zzbkm = (zzbkm) C11056a.m49499p(parcel2, D, zzbkm.CREATOR);
                    break;
                case 11:
                    location = (Location) C11056a.m49499p(parcel2, D, Location.CREATOR);
                    break;
                case 12:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 13:
                    bundle2 = C11056a.m49489f(parcel2, D);
                    break;
                case 14:
                    bundle3 = C11056a.m49489f(parcel2, D);
                    break;
                case 15:
                    arrayList2 = C11056a.m49502s(parcel2, D);
                    break;
                case 16:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 17:
                    str4 = C11056a.m49500q(parcel2, D);
                    break;
                case 18:
                    z3 = C11056a.m49507x(parcel2, D);
                    break;
                case 19:
                    zzbeu = (zzbeu) C11056a.m49499p(parcel2, D, zzbeu.CREATOR);
                    break;
                case 20:
                    i4 = C11056a.m49474F(parcel2, D);
                    break;
                case 21:
                    str5 = C11056a.m49500q(parcel2, D);
                    break;
                case 22:
                    arrayList3 = C11056a.m49502s(parcel2, D);
                    break;
                case 23:
                    i5 = C11056a.m49474F(parcel2, D);
                    break;
                case 24:
                    str6 = C11056a.m49500q(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzbfd(i, j, bundle, i2, arrayList, z, i3, z2, str, zzbkm, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, zzbeu, i4, str5, arrayList3, i5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfd[i];
    }
}
