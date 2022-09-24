package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acp */
/* compiled from: IMASDK */
final class acp implements Parcelable.Creator<acq> {

    /* renamed from: a */
    private final /* synthetic */ int f14191a = 0;

    acp() {
    }

    acp(byte[] bArr) {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (this.f14191a != 0) {
            return new aco(parcel);
        }
        return new acq(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        if (this.f14191a != 0) {
            return new aco[i];
        }
        return new acq[i];
    }
}
