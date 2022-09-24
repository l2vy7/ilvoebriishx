package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fl0 implements Parcelable.Creator<zzcgc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
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
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 5:
                    z2 = C11056a.m49507x(parcel, D);
                    break;
                case 6:
                    arrayList = C11056a.m49502s(parcel, D);
                    break;
                case 7:
                    z3 = C11056a.m49507x(parcel, D);
                    break;
                case 8:
                    z4 = C11056a.m49507x(parcel, D);
                    break;
                case 9:
                    arrayList2 = C11056a.m49502s(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzcgc(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcgc[i];
    }
}
