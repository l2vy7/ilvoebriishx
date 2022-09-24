package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.cast.x */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7185x implements Parcelable.Creator<TextTrackStyle> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            switch (C11056a.m49506w(D)) {
                case 2:
                    f = C11056a.m49470B(parcel2, D);
                    break;
                case 3:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 4:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 5:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                case 6:
                    i4 = C11056a.m49474F(parcel2, D);
                    break;
                case 7:
                    i5 = C11056a.m49474F(parcel2, D);
                    break;
                case 8:
                    i6 = C11056a.m49474F(parcel2, D);
                    break;
                case 9:
                    i7 = C11056a.m49474F(parcel2, D);
                    break;
                case 10:
                    str = C11056a.m49500q(parcel2, D);
                    break;
                case 11:
                    i8 = C11056a.m49474F(parcel2, D);
                    break;
                case 12:
                    i9 = C11056a.m49474F(parcel2, D);
                    break;
                case 13:
                    str2 = C11056a.m49500q(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new TextTrackStyle(f, i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TextTrackStyle[i];
    }
}
