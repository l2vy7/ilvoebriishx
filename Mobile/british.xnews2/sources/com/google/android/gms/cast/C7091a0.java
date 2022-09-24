package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.cast.a0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C7091a0 implements Parcelable.Creator<CastDevice> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<WebImage> arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        boolean z = false;
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
                    str5 = C11056a.m49500q(parcel2, D);
                    break;
                case 7:
                    i = C11056a.m49474F(parcel2, D);
                    break;
                case 8:
                    arrayList = C11056a.m49504u(parcel2, D, WebImage.CREATOR);
                    break;
                case 9:
                    i2 = C11056a.m49474F(parcel2, D);
                    break;
                case 10:
                    i3 = C11056a.m49474F(parcel2, D);
                    break;
                case 11:
                    str6 = C11056a.m49500q(parcel2, D);
                    break;
                case 12:
                    str7 = C11056a.m49500q(parcel2, D);
                    break;
                case 13:
                    i4 = C11056a.m49474F(parcel2, D);
                    break;
                case 14:
                    str8 = C11056a.m49500q(parcel2, D);
                    break;
                case 15:
                    bArr = C11056a.m49490g(parcel2, D);
                    break;
                case 16:
                    str9 = C11056a.m49500q(parcel2, D);
                    break;
                case 17:
                    z = C11056a.m49507x(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new CastDevice(str, str2, str3, str4, str5, i, arrayList, i2, i3, str6, str7, i4, str8, bArr, str9, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }
}
