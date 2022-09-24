package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzn extends zzzu {
    public static final Parcelable.Creator<zzzn> CREATOR = new ne4();

    /* renamed from: c */
    public final String f43111c;

    /* renamed from: d */
    public final String f43112d;

    /* renamed from: e */
    public final String f43113e;

    zzzn(Parcel parcel) {
        super(CommentFrame.f27470ID);
        String readString = parcel.readString();
        int i = d13.f20195a;
        this.f43111c = readString;
        this.f43112d = parcel.readString();
        this.f43113e = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzn.class == obj.getClass()) {
            zzzn zzzn = (zzzn) obj;
            return d13.m20317p(this.f43112d, zzzn.f43112d) && d13.m20317p(this.f43111c, zzzn.f43111c) && d13.m20317p(this.f43113e, zzzn.f43113e);
        }
    }

    public final int hashCode() {
        String str = this.f43111c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f43112d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f43113e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f43118b;
        String str2 = this.f43111c;
        String str3 = this.f43112d;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43118b);
        parcel.writeString(this.f43111c);
        parcel.writeString(this.f43113e);
    }

    public zzzn(String str, String str2, String str3) {
        super(CommentFrame.f27470ID);
        this.f43111c = str;
        this.f43112d = str2;
        this.f43113e = str3;
    }
}
