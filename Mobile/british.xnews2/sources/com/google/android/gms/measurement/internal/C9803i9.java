package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.measurement.internal.i9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9803i9 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = "";
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
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
                    str3 = C11056a.m49500q(parcel2, D);
                    break;
                case 5:
                    str4 = C11056a.m49500q(parcel2, D);
                    break;
                case 6:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 7:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 8:
                    str5 = C11056a.m49500q(parcel2, D);
                    break;
                case 9:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 10:
                    z2 = C11056a.m49507x(parcel2, D);
                    break;
                case 11:
                    j6 = C11056a.m49476H(parcel2, D);
                    break;
                case 12:
                    str6 = C11056a.m49500q(parcel2, D);
                    break;
                case 13:
                    j3 = C11056a.m49476H(parcel2, D);
                    break;
                case 14:
                    j4 = C11056a.m49476H(parcel2, D);
                    break;
                case 15:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 16:
                    z3 = C11056a.m49507x(parcel2, D);
                    break;
                case 18:
                    z4 = C11056a.m49507x(parcel2, D);
                    break;
                case 19:
                    str7 = C11056a.m49500q(parcel2, D);
                    break;
                case 21:
                    bool = C11056a.m49508y(parcel2, D);
                    break;
                case 22:
                    j5 = C11056a.m49476H(parcel2, D);
                    break;
                case 23:
                    arrayList = C11056a.m49502s(parcel2, D);
                    break;
                case 24:
                    str8 = C11056a.m49500q(parcel2, D);
                    break;
                case 25:
                    str9 = C11056a.m49500q(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzp(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, str7, bool, j5, (List) arrayList, str8, str9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzp[i];
    }
}
