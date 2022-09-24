package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzf extends zzzu {
    public static final Parcelable.Creator<zzzf> CREATOR = new je4();

    /* renamed from: c */
    public final String f43095c;

    /* renamed from: d */
    public final String f43096d;

    /* renamed from: e */
    public final int f43097e;

    /* renamed from: f */
    public final byte[] f43098f;

    zzzf(Parcel parcel) {
        super(ApicFrame.f27467ID);
        String readString = parcel.readString();
        int i = d13.f20195a;
        this.f43095c = readString;
        this.f43096d = parcel.readString();
        this.f43097e = parcel.readInt();
        this.f43098f = (byte[]) d13.m20300c(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzf.class == obj.getClass()) {
            zzzf zzzf = (zzzf) obj;
            return this.f43097e == zzzf.f43097e && d13.m20317p(this.f43095c, zzzf.f43095c) && d13.m20317p(this.f43096d, zzzf.f43096d) && Arrays.equals(this.f43098f, zzzf.f43098f);
        }
    }

    /* renamed from: g0 */
    public final void mo36161g0(C7840jr jrVar) {
        jrVar.mo32941k(this.f43098f, this.f43097e);
    }

    public final int hashCode() {
        int i = (this.f43097e + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f43095c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f43096d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f43098f);
    }

    public final String toString() {
        String str = this.f43118b;
        String str2 = this.f43095c;
        String str3 = this.f43096d;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43095c);
        parcel.writeString(this.f43096d);
        parcel.writeInt(this.f43097e);
        parcel.writeByteArray(this.f43098f);
    }

    public zzzf(String str, String str2, int i, byte[] bArr) {
        super(ApicFrame.f27467ID);
        this.f43095c = str;
        this.f43096d = str2;
        this.f43097e = i;
        this.f43098f = bArr;
    }
}
