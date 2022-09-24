package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzw extends zzzu {
    public static final Parcelable.Creator<zzzw> CREATOR = new te4();

    /* renamed from: c */
    public final String f43119c;

    /* renamed from: d */
    public final String f43120d;

    /* renamed from: e */
    public final String f43121e;

    zzzw(Parcel parcel) {
        super(InternalFrame.f27473ID);
        String readString = parcel.readString();
        int i = d13.f20195a;
        this.f43119c = readString;
        this.f43120d = parcel.readString();
        this.f43121e = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzw.class == obj.getClass()) {
            zzzw zzzw = (zzzw) obj;
            return d13.m20317p(this.f43120d, zzzw.f43120d) && d13.m20317p(this.f43119c, zzzw.f43119c) && d13.m20317p(this.f43121e, zzzw.f43121e);
        }
    }

    public final int hashCode() {
        String str = this.f43119c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f43120d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f43121e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f43118b;
        String str2 = this.f43119c;
        String str3 = this.f43120d;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43118b);
        parcel.writeString(this.f43119c);
        parcel.writeString(this.f43121e);
    }

    public zzzw(String str, String str2, String str3) {
        super(InternalFrame.f27473ID);
        this.f43119c = str;
        this.f43120d = str2;
        this.f43121e = str3;
    }
}
