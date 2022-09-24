package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p256v4.C11056a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o80 implements Parcelable.Creator<zzbtc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 1:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                case 2:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 3:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 4:
                    bArr = C11056a.m49490g(parcel2, D);
                    break;
                case 5:
                    strArr = C11056a.m49501r(parcel2, D);
                    break;
                case 6:
                    strArr2 = C11056a.m49501r(parcel2, D);
                    break;
                case 7:
                    z2 = C11056a.m49507x(parcel2, D);
                    break;
                case 8:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new zzbtc(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbtc[i];
    }
}
