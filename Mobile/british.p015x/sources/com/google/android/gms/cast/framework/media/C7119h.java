package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.cast.framework.media.h */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C7119h implements Parcelable.Creator<NotificationOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        ArrayList<String> arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    arrayList = C11056a.m49502s(parcel2, D);
                    break;
                case 3:
                    iArr = C11056a.m49494k(parcel2, D);
                    break;
                case 4:
                    j = C11056a.m49476H(parcel2, D);
                    break;
                case 5:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 6:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 7:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 8:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                case 9:
                    i4 = C11056a.m49474F(parcel2, D);
                    break;
                case 10:
                    i5 = C11056a.m49474F(parcel2, D);
                    break;
                case 11:
                    i6 = C11056a.m49474F(parcel2, D);
                    break;
                case 12:
                    i7 = C11056a.m49474F(parcel2, D);
                    break;
                case 13:
                    i8 = C11056a.m49474F(parcel2, D);
                    break;
                case 14:
                    i9 = C11056a.m49474F(parcel2, D);
                    break;
                case 15:
                    i10 = C11056a.m49474F(parcel2, D);
                    break;
                case 16:
                    i11 = C11056a.m49474F(parcel2, D);
                    break;
                case 17:
                    i12 = C11056a.m49474F(parcel2, D);
                    break;
                case 18:
                    i13 = C11056a.m49474F(parcel2, D);
                    break;
                case 19:
                    i14 = C11056a.m49474F(parcel2, D);
                    break;
                case 20:
                    i15 = C11056a.m49474F(parcel2, D);
                    break;
                case 21:
                    i16 = C11056a.m49474F(parcel2, D);
                    break;
                case 22:
                    i17 = C11056a.m49474F(parcel2, D);
                    break;
                case 23:
                    i18 = C11056a.m49474F(parcel2, D);
                    break;
                case 24:
                    i19 = C11056a.m49474F(parcel2, D);
                    break;
                case 25:
                    i20 = C11056a.m49474F(parcel2, D);
                    break;
                case 26:
                    i21 = C11056a.m49474F(parcel2, D);
                    break;
                case 27:
                    i22 = C11056a.m49474F(parcel2, D);
                    break;
                case 28:
                    i23 = C11056a.m49474F(parcel2, D);
                    break;
                case 29:
                    i24 = C11056a.m49474F(parcel2, D);
                    break;
                case 30:
                    i25 = C11056a.m49474F(parcel2, D);
                    break;
                case 31:
                    i26 = C11056a.m49474F(parcel2, D);
                    break;
                case 32:
                    i27 = C11056a.m49474F(parcel2, D);
                    break;
                case 33:
                    iBinder = C11056a.m49473E(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new NotificationOptions(arrayList, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NotificationOptions[i];
    }
}
