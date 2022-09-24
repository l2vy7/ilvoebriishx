package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.internal.clearcut.y5 */
public final class C9041y5 implements Parcelable.Creator<zzr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    str = C11056a.m49500q(parcel, D);
                    break;
                case 3:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 4:
                    i2 = C11056a.m49474F(parcel, D);
                    break;
                case 5:
                    str2 = C11056a.m49500q(parcel, D);
                    break;
                case 6:
                    str3 = C11056a.m49500q(parcel, D);
                    break;
                case 7:
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 8:
                    str4 = C11056a.m49500q(parcel, D);
                    break;
                case 9:
                    z2 = C11056a.m49507x(parcel, D);
                    break;
                case 10:
                    i3 = C11056a.m49474F(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new zzr(str, i, i2, str2, str3, z, str4, z2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
