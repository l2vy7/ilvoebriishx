package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.vision.barcode.c */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C9994c implements Parcelable.Creator<Barcode.CalendarDateTime> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    i = C11056a.m49474F(parcel, D);
                    break;
                case 3:
                    i2 = C11056a.m49474F(parcel, D);
                    break;
                case 4:
                    i3 = C11056a.m49474F(parcel, D);
                    break;
                case 5:
                    i4 = C11056a.m49474F(parcel, D);
                    break;
                case 6:
                    i5 = C11056a.m49474F(parcel, D);
                    break;
                case 7:
                    i6 = C11056a.m49474F(parcel, D);
                    break;
                case 8:
                    z = C11056a.m49507x(parcel, D);
                    break;
                case 9:
                    str = C11056a.m49500q(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new Barcode.CalendarDateTime(i, i2, i3, i4, i5, i6, z, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.CalendarDateTime[i];
    }
}
