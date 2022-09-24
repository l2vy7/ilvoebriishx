package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aic */
/* compiled from: IMASDK */
public final class aic implements Parcelable {
    public static final Parcelable.Creator<aic> CREATOR = new aib();

    /* renamed from: a */
    public final int f14959a;

    /* renamed from: b */
    public final int[] f14960b;

    /* renamed from: c */
    public final int f14961c;

    /* renamed from: d */
    public final int f14962d;

    aic(Parcel parcel) {
        this.f14959a = parcel.readInt();
        int readByte = parcel.readByte();
        this.f14961c = readByte;
        int[] iArr = new int[readByte];
        this.f14960b = iArr;
        parcel.readIntArray(iArr);
        this.f14962d = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aic.class == obj.getClass()) {
            aic aic = (aic) obj;
            return this.f14959a == aic.f14959a && Arrays.equals(this.f14960b, aic.f14960b) && this.f14962d == aic.f14962d;
        }
    }

    public final int hashCode() {
        return (((this.f14959a * 31) + Arrays.hashCode(this.f14960b)) * 31) + this.f14962d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14959a);
        parcel.writeInt(this.f14960b.length);
        parcel.writeIntArray(this.f14960b);
        parcel.writeInt(this.f14962d);
    }
}
