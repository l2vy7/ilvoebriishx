package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.vision.barcode.k */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C10002k implements Parcelable.Creator<Barcode.Phone> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                i = C11056a.m49474F(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                str = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new Barcode.Phone(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.Phone[i];
    }
}
