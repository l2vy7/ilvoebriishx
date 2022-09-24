package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zd */
/* compiled from: IMASDK */
public final class C4524zd extends C4530zj {
    public static final Parcelable.Creator<C4524zd> CREATOR = new C4519yz((int[]) null);

    /* renamed from: a */
    public final String f19740a;

    /* renamed from: b */
    public final String f19741b;

    /* renamed from: c */
    public final String f19742c;

    C4524zd(Parcel parcel) {
        super(CommentFrame.f27470ID);
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f19740a = readString;
        this.f19741b = parcel.readString();
        this.f19742c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4524zd.class == obj.getClass()) {
            C4524zd zdVar = (C4524zd) obj;
            return amm.m14233c(this.f19741b, zdVar.f19741b) && amm.m14233c(this.f19740a, zdVar.f19740a) && amm.m14233c(this.f19742c, zdVar.f19742c);
        }
    }

    public final int hashCode() {
        String str = this.f19740a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f19741b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19742c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f19753f;
        String str2 = this.f19740a;
        String str3 = this.f19741b;
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
        parcel.writeString(this.f19753f);
        parcel.writeString(this.f19740a);
        parcel.writeString(this.f19742c);
    }

    public C4524zd(String str, String str2, String str3) {
        super(CommentFrame.f27470ID);
        this.f19740a = str;
        this.f19741b = str2;
        this.f19742c = str3;
    }
}
