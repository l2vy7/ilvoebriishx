package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zp */
/* compiled from: IMASDK */
public final class C4536zp implements C4506ym {
    public static final Parcelable.Creator<C4536zp> CREATOR = new C4537zq((byte[]) null);

    /* renamed from: a */
    public final String f19768a;

    /* renamed from: b */
    public final byte[] f19769b;

    /* renamed from: c */
    public final int f19770c;

    /* renamed from: d */
    public final int f19771d;

    /* synthetic */ C4536zp(Parcel parcel) {
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f19768a = readString;
        this.f19769b = (byte[]) amm.m14236f(parcel.createByteArray());
        this.f19770c = parcel.readInt();
        this.f19771d = parcel.readInt();
    }

    public C4536zp(String str, byte[] bArr, int i, int i2) {
        this.f19768a = str;
        this.f19769b = bArr;
        this.f19770c = i;
        this.f19771d = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4536zp.class == obj.getClass()) {
            C4536zp zpVar = (C4536zp) obj;
            return this.f19768a.equals(zpVar.f19768a) && Arrays.equals(this.f19769b, zpVar.f19769b) && this.f19770c == zpVar.f19770c && this.f19771d == zpVar.f19771d;
        }
    }

    public final int hashCode() {
        return ((((((this.f19768a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f19769b)) * 31) + this.f19770c) * 31) + this.f19771d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19768a);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19768a);
        parcel.writeByteArray(this.f19769b);
        parcel.writeInt(this.f19770c);
        parcel.writeInt(this.f19771d);
    }
}
