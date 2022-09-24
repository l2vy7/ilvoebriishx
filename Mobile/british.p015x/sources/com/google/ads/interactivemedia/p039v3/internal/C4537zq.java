package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zq */
/* compiled from: IMASDK */
final class C4537zq implements Parcelable.Creator<C4538zr> {

    /* renamed from: a */
    private final /* synthetic */ int f19772a = 0;

    C4537zq() {
    }

    C4537zq(byte[] bArr) {
    }

    C4537zq(char[] cArr) {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.f19772a;
        if (i == 0) {
            return new C4538zr(parcel);
        }
        if (i != 1) {
            return new C4539zs(parcel);
        }
        return new C4536zp(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        int i2 = this.f19772a;
        if (i2 == 0) {
            return new C4538zr[i];
        }
        if (i2 != 1) {
            return new C4539zs[i];
        }
        return new C4536zp[i];
    }
}
