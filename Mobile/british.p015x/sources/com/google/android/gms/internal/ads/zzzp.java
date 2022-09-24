package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzp extends zzzu {
    public static final Parcelable.Creator<zzzp> CREATOR = new oe4();

    /* renamed from: c */
    public final String f43114c;

    /* renamed from: d */
    public final String f43115d;

    /* renamed from: e */
    public final String f43116e;

    /* renamed from: f */
    public final byte[] f43117f;

    zzzp(Parcel parcel) {
        super(GeobFrame.f27471ID);
        String readString = parcel.readString();
        int i = d13.f20195a;
        this.f43114c = readString;
        this.f43115d = parcel.readString();
        this.f43116e = parcel.readString();
        this.f43117f = (byte[]) d13.m20300c(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzp.class == obj.getClass()) {
            zzzp zzzp = (zzzp) obj;
            return d13.m20317p(this.f43114c, zzzp.f43114c) && d13.m20317p(this.f43115d, zzzp.f43115d) && d13.m20317p(this.f43116e, zzzp.f43116e) && Arrays.equals(this.f43117f, zzzp.f43117f);
        }
    }

    public final int hashCode() {
        String str = this.f43114c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f43115d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f43116e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f43117f);
    }

    public final String toString() {
        String str = this.f43118b;
        String str2 = this.f43114c;
        String str3 = this.f43115d;
        String str4 = this.f43116e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 36 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43114c);
        parcel.writeString(this.f43115d);
        parcel.writeString(this.f43116e);
        parcel.writeByteArray(this.f43117f);
    }

    public zzzp(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.f27471ID);
        this.f43114c = str;
        this.f43115d = str2;
        this.f43116e = str3;
        this.f43117f = bArr;
    }
}
