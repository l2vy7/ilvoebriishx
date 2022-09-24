package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.barcode.Barcode;
import p256v4.C11056a;

/* renamed from: com.google.android.gms.vision.barcode.j */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C10001j implements Parcelable.Creator<Barcode.Sms> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = C11056a.m49481M(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < M) {
            int D = C11056a.m49472D(parcel);
            int w = C11056a.m49506w(D);
            if (w == 2) {
                str = C11056a.m49500q(parcel, D);
            } else if (w != 3) {
                C11056a.m49480L(parcel, D);
            } else {
                str2 = C11056a.m49500q(parcel, D);
            }
        }
        C11056a.m49505v(parcel, M);
        return new Barcode.Sms(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.Sms[i];
    }
}
