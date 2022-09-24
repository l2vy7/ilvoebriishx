package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.vision.barcode.i */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C10000i implements Parcelable.Creator<Barcode.GeoPoint> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                d = C11056a.m49509z(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                d2 = C11056a.m49509z(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new Barcode.GeoPoint(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.GeoPoint[i];
    }
}
