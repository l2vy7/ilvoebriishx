package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaah implements zzdc {
    public static final Parcelable.Creator<zzaah> CREATOR = new C7628e();

    /* renamed from: b */
    public final String f42851b;

    /* renamed from: c */
    public final byte[] f42852c;

    /* renamed from: d */
    public final int f42853d;

    /* renamed from: e */
    public final int f42854e;

    /* synthetic */ zzaah(Parcel parcel, C7665f fVar) {
        String readString = parcel.readString();
        int i = d13.f20195a;
        this.f42851b = readString;
        this.f42852c = (byte[]) d13.m20300c(parcel.createByteArray());
        this.f42853d = parcel.readInt();
        this.f42854e = parcel.readInt();
    }

    public zzaah(String str, byte[] bArr, int i, int i2) {
        this.f42851b = str;
        this.f42852c = bArr;
        this.f42853d = i;
        this.f42854e = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaah.class == obj.getClass()) {
            zzaah zzaah = (zzaah) obj;
            return this.f42851b.equals(zzaah.f42851b) && Arrays.equals(this.f42852c, zzaah.f42852c) && this.f42853d == zzaah.f42853d && this.f42854e == zzaah.f42854e;
        }
    }

    /* renamed from: g0 */
    public final /* synthetic */ void mo36161g0(C7840jr jrVar) {
    }

    public final int hashCode() {
        return ((((((this.f42851b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f42852c)) * 31) + this.f42853d) * 31) + this.f42854e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f42851b);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42851b);
        parcel.writeByteArray(this.f42852c);
        parcel.writeInt(this.f42853d);
        parcel.writeInt(this.f42854e);
    }
}
