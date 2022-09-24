package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yu */
/* compiled from: IMASDK */
final class C4514yu implements Parcelable.Creator<C4515yv> {

    /* renamed from: a */
    private final /* synthetic */ int f19708a = 0;

    C4514yu() {
    }

    C4514yu(byte[] bArr) {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (this.f19708a != 0) {
            return new C4513yt(parcel);
        }
        return new C4515yv(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        if (this.f19708a != 0) {
            return new C4513yt[i];
        }
        return new C4515yv[i];
    }
}
