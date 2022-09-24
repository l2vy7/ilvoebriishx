package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aib */
/* compiled from: IMASDK */
final class aib implements Parcelable.Creator<aic> {

    /* renamed from: a */
    private final /* synthetic */ int f14958a = 0;

    aib() {
    }

    aib(byte[] bArr) {
    }

    aib(char[] cArr) {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.f14958a;
        if (i == 0) {
            return new aic(parcel);
        }
        if (i != 1) {
            return new ain(parcel);
        }
        return new ahz(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        int i2 = this.f14958a;
        if (i2 == 0) {
            return new aic[i];
        }
        if (i2 != 1) {
            return new ain[i];
        }
        return new ahz[i];
    }
}
