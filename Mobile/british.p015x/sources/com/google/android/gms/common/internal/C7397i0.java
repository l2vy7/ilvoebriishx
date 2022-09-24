package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.common.internal.i0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7397i0 implements Parcelable.Creator<MethodInvocation> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 2:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 3:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                case 4:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 5:
                    j2 = C11056a.m49476H(parcel2, D);
                    break;
                case 6:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 7:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                case 8:
                    i4 = C11056a.m49474F(parcel2, D);
                    break;
                case 9:
                    i5 = C11056a.m49474F(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
