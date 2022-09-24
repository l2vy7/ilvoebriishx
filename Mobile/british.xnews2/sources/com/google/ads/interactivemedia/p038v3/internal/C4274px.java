package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.px */
/* compiled from: IMASDK */
final class C4274px implements Parcelable.Creator<C4275py> {

    /* renamed from: a */
    private final /* synthetic */ int f18411a = 0;

    C4274px() {
    }

    C4274px(byte[] bArr) {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (this.f18411a != 0) {
            return new C4276pz(parcel);
        }
        return new C4275py(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        if (this.f18411a != 0) {
            return new C4276pz[i];
        }
        return new C4275py[i];
    }
}
