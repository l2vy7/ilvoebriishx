package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;
import p257v4.C11056a;

/* renamed from: com.google.android.gms.vision.barcode.g */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C9998g implements Parcelable.Creator<Barcode.DriverLicense> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
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
                    str6 = C11056a.m49500q(parcel2, D);
                    break;
                case 8:
                    str7 = C11056a.m49500q(parcel2, D);
                    break;
                case 9:
                    str8 = C11056a.m49500q(parcel2, D);
                    break;
                case 10:
                    str9 = C11056a.m49500q(parcel2, D);
                    break;
                case 11:
                    str10 = C11056a.m49500q(parcel2, D);
                    break;
                case 12:
                    str11 = C11056a.m49500q(parcel2, D);
                    break;
                case 13:
                    str12 = C11056a.m49500q(parcel2, D);
                    break;
                case 14:
                    str13 = C11056a.m49500q(parcel2, D);
                    break;
                case 15:
                    str14 = C11056a.m49500q(parcel2, D);
                    break;
                default:
                    C11056a.m49480L(parcel2, D);
                    break;
            }
        }
        C11056a.m49505v(parcel2, M);
        return new Barcode.DriverLicense(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.DriverLicense[i];
    }
}
