package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaaa extends zzzu {
    public static final Parcelable.Creator<zzaaa> CREATOR = new ve4();

    /* renamed from: c */
    public final String f42845c;

    /* renamed from: d */
    public final byte[] f42846d;

    zzaaa(Parcel parcel) {
        super(PrivFrame.f27475ID);
        String readString = parcel.readString();
        int i = d13.f20195a;
        this.f42845c = readString;
        this.f42846d = (byte[]) d13.m20300c(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaaa.class == obj.getClass()) {
            zzaaa zzaaa = (zzaaa) obj;
            return d13.m20317p(this.f42845c, zzaaa.f42845c) && Arrays.equals(this.f42846d, zzaaa.f42846d);
        }
    }

    public final int hashCode() {
        String str = this.f42845c;
        return (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f42846d);
    }

    public final String toString() {
        String str = this.f43118b;
        String str2 = this.f42845c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42845c);
        parcel.writeByteArray(this.f42846d);
    }

    public zzaaa(String str, byte[] bArr) {
        super(PrivFrame.f27475ID);
        this.f42845c = str;
        this.f42846d = bArr;
    }
}
