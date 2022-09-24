package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.vision.barcode.l */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C10003l implements Parcelable.Creator<Barcode.WiFi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                str = C11056a.m49500q(parcel, D);
            } else if (w == 3) {
                str2 = C11056a.m49500q(parcel, D);
            } else if (w != 4) {
                C11056a.m49480L(parcel, D);
            } else {
                i = C11056a.m49474F(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new Barcode.WiFi(str, str2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.WiFi[i];
    }
}
