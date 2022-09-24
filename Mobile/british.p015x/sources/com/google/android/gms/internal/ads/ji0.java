package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p257v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ji0 implements Parcelable.Creator<zzcdc> {
    /* renamed from: a */
    public static final zzcdc m33621a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        zzbfd zzbfd = null;
        zzbfi zzbfi = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzcjf zzcjf = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzbnw zzbnw = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzbjd zzbjd = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbtz zzbtz = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 2:
                    bundle = C11056a.m49489f(parcel2, D);
                    break;
                case 3:
                    zzbfd = (zzbfd) C11056a.m49499p(parcel2, D, zzbfd.CREATOR);
                    break;
                case 4:
                    zzbfi = (zzbfi) C11056a.m49499p(parcel2, D, zzbfi.CREATOR);
                    break;
                case 5:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C11056a.m49499p(parcel2, D, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C11056a.m49499p(parcel2, D, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 9:
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 10:
                    str4 = C11056a.m49500q(parcel2, D);
                    break;
                case 11:
                    zzcjf = (zzcjf) C11056a.m49499p(parcel2, D, zzcjf.CREATOR);
                    break;
                case 12:
                    bundle2 = C11056a.m49489f(parcel2, D);
                    break;
                case 13:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 14:
                    arrayList = C11056a.m49502s(parcel2, D);
                    break;
                case 15:
                    bundle3 = C11056a.m49489f(parcel2, D);
                    break;
                case 16:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 18:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                case 19:
                    i4 = C11056a.m49474F(parcel2, D);
                    break;
                case 20:
                    f = C11056a.m49470B(parcel2, D);
                    break;
                case 21:
                    str5 = C11056a.m49500q(parcel2, D);
                    break;
                case 25:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 26:
                    str6 = C11056a.m49500q(parcel2, D);
                    break;
                case 27:
                    arrayList2 = C11056a.m49502s(parcel2, D);
                    break;
                case 28:
                    str7 = C11056a.m49500q(parcel2, D);
                    break;
                case 29:
                    zzbnw = (zzbnw) C11056a.m49499p(parcel2, D, zzbnw.CREATOR);
                    break;
                case 30:
                    arrayList3 = C11056a.m49502s(parcel2, D);
                    break;
                case 31:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 33:
                    str8 = C11056a.m49500q(parcel2, D);
                    break;
                case 34:
                    f2 = C11056a.m49470B(parcel2, D);
                    break;
                case 35:
                    i5 = C11056a.m49474F(parcel2, D);
                    break;
                case 36:
                    i6 = C11056a.m49474F(parcel2, D);
                    break;
                case 37:
                    z3 = C11056a.m49507x(parcel2, D);
                    break;
                case 39:
                    str9 = C11056a.m49500q(parcel2, D);
                    break;
                case 40:
                    z2 = C11056a.m49507x(parcel2, D);
                    break;
                case 41:
                    str10 = C11056a.m49500q(parcel2, D);
                    break;
                case 42:
                    z4 = C11056a.m49507x(parcel2, D);
                    break;
                case 43:
                    i7 = C11056a.m49474F(parcel2, D);
                    break;
                case 44:
                    bundle4 = C11056a.m49489f(parcel2, D);
                    break;
                case 45:
                    str11 = C11056a.m49500q(parcel2, D);
                    break;
                case 46:
                    zzbjd = (zzbjd) C11056a.m49499p(parcel2, D, zzbjd.CREATOR);
                    break;
                case 47:
                    z5 = C11056a.m49507x(parcel2, D);
                    break;
                case 48:
                    bundle5 = C11056a.m49489f(parcel2, D);
                    break;
                case 49:
                    str12 = C11056a.m49500q(parcel2, D);
                    break;
                case 50:
                    str13 = C11056a.m49500q(parcel2, D);
                    break;
                case 51:
                    str14 = C11056a.m49500q(parcel2, D);
                    break;
                case 52:
                    z6 = C11056a.m49507x(parcel2, D);
                    break;
                case 53:
                    arrayList4 = C11056a.m49495l(parcel2, D);
                    break;
                case 54:
                    str15 = C11056a.m49500q(parcel2, D);
                    break;
                case 55:
                    arrayList5 = C11056a.m49502s(parcel2, D);
                    break;
                case 56:
                    i8 = C11056a.m49474F(parcel2, D);
                    break;
                case 57:
                    z7 = C11056a.m49507x(parcel2, D);
                    break;
                case 58:
                    z8 = C11056a.m49507x(parcel2, D);
                    break;
                case 59:
                    z9 = C11056a.m49507x(parcel2, D);
                    break;
                case 60:
                    arrayList6 = C11056a.m49502s(parcel2, D);
                    break;
                case 61:
                    str16 = C11056a.m49500q(parcel2, D);
                    break;
                case 63:
                    zzbtz = (zzbtz) C11056a.m49499p(parcel2, D, zzbtz.CREATOR);
                    break;
                case 64:
                    str17 = C11056a.m49500q(parcel2, D);
                    break;
                case 65:
                    bundle6 = C11056a.m49489f(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzcdc(i, bundle, zzbfd, zzbfi, str, applicationInfo, packageInfo, str2, str3, str4, zzcjf, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, zzbnw, arrayList3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, zzbjd, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i8, z7, z8, z9, arrayList6, str16, zzbtz, str17, bundle6);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m33621a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdc[i];
    }
}
