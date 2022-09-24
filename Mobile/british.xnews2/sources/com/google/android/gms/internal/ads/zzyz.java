package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzyz implements zzdc {
    public static final Parcelable.Creator<zzyz> CREATOR = new fe4();

    /* renamed from: b */
    public final int f43079b;

    /* renamed from: c */
    public final String f43080c;

    /* renamed from: d */
    public final String f43081d;

    /* renamed from: e */
    public final int f43082e;

    /* renamed from: f */
    public final int f43083f;

    /* renamed from: g */
    public final int f43084g;

    /* renamed from: h */
    public final int f43085h;

    /* renamed from: i */
    public final byte[] f43086i;

    public zzyz(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f43079b = i;
        this.f43080c = str;
        this.f43081d = str2;
        this.f43082e = i2;
        this.f43083f = i3;
        this.f43084g = i4;
        this.f43085h = i5;
        this.f43086i = bArr;
    }

    zzyz(Parcel parcel) {
        this.f43079b = parcel.readInt();
        String readString = parcel.readString();
        int i = d13.f20195a;
        this.f43080c = readString;
        this.f43081d = parcel.readString();
        this.f43082e = parcel.readInt();
        this.f43083f = parcel.readInt();
        this.f43084g = parcel.readInt();
        this.f43085h = parcel.readInt();
        this.f43086i = (byte[]) d13.m20300c(parcel.createByteArray());
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzyz.class == obj.getClass()) {
            zzyz zzyz = (zzyz) obj;
            return this.f43079b == zzyz.f43079b && this.f43080c.equals(zzyz.f43080c) && this.f43081d.equals(zzyz.f43081d) && this.f43082e == zzyz.f43082e && this.f43083f == zzyz.f43083f && this.f43084g == zzyz.f43084g && this.f43085h == zzyz.f43085h && Arrays.equals(this.f43086i, zzyz.f43086i);
        }
    }

    /* renamed from: g0 */
    public final void mo36161g0(C7840jr jrVar) {
        jrVar.mo32941k(this.f43086i, this.f43079b);
    }

    public final int hashCode() {
        return ((((((((((((((this.f43079b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f43080c.hashCode()) * 31) + this.f43081d.hashCode()) * 31) + this.f43082e) * 31) + this.f43083f) * 31) + this.f43084g) * 31) + this.f43085h) * 31) + Arrays.hashCode(this.f43086i);
    }

    public final String toString() {
        String str = this.f43080c;
        String str2 = this.f43081d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f43079b);
        parcel.writeString(this.f43080c);
        parcel.writeString(this.f43081d);
        parcel.writeInt(this.f43082e);
        parcel.writeInt(this.f43083f);
        parcel.writeInt(this.f43084g);
        parcel.writeInt(this.f43085h);
        parcel.writeByteArray(this.f43086i);
    }
}
