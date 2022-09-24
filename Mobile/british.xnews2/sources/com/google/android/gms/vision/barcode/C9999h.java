package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.vision.barcode.h */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C9999h implements Parcelable.Creator<Barcode.PersonName> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    str3 = C11056a.m49500q(parcel, D);
                    break;
                case 5:
                    str4 = C11056a.m49500q(parcel, D);
                    break;
                case 6:
                    str5 = C11056a.m49500q(parcel, D);
                    break;
                case 7:
                    str6 = C11056a.m49500q(parcel, D);
                    break;
                case 8:
                    str7 = C11056a.m49500q(parcel, D);
                    break;
                default:
                    C11056a.m49480L(parcel, D);
                    break;
            }
        }
        C11056a.m49505v(parcel, M);
        return new Barcode.PersonName(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.PersonName[i];
    }
}
