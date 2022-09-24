package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agj */
/* compiled from: IMASDK */
final class agj implements Parcelable.Creator<agk> {

    /* renamed from: a */
    private final /* synthetic */ int f14698a = 0;

    agj() {
    }

    agj(byte[] bArr) {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (this.f14698a != 0) {
            return new agl(parcel);
        }
        return new agk(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        if (this.f14698a != 0) {
            return new agl[i];
        }
        return new agk[i];
    }
}
