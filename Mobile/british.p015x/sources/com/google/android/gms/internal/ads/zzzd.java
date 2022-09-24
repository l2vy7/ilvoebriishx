package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzd implements zzdc {
    public static final Parcelable.Creator<zzzd> CREATOR = new ie4();

    /* renamed from: b */
    public final int f43089b;

    /* renamed from: c */
    public final String f43090c;

    /* renamed from: d */
    public final String f43091d;

    /* renamed from: e */
    public final String f43092e;

    /* renamed from: f */
    public final boolean f43093f;

    /* renamed from: g */
    public final int f43094g;

    public zzzd(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        nu1.m20745d(z2);
        this.f43089b = i;
        this.f43090c = str;
        this.f43091d = str2;
        this.f43092e = str3;
        this.f43093f = z;
        this.f43094g = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzd.class == obj.getClass()) {
            zzzd zzzd = (zzzd) obj;
            return this.f43089b == zzzd.f43089b && d13.m20317p(this.f43090c, zzzd.f43090c) && d13.m20317p(this.f43091d, zzzd.f43091d) && d13.m20317p(this.f43092e, zzzd.f43092e) && this.f43093f == zzzd.f43093f && this.f43094g == zzzd.f43094g;
        }
    }

    /* renamed from: g0 */
    public final /* synthetic */ void mo36161g0(C7840jr jrVar) {
    }

    public final int hashCode() {
        int i = (this.f43089b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f43090c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f43091d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f43092e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f43093f ? 1 : 0)) * 31) + this.f43094g;
    }

    public final String toString() {
        String str = this.f43091d;
        String str2 = this.f43090c;
        int i = this.f43089b;
        int i2 = this.f43094g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i);
        sb.append(", metadataInterval=");
        sb.append(i2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f43089b);
        parcel.writeString(this.f43090c);
        parcel.writeString(this.f43091d);
        parcel.writeString(this.f43092e);
        d13.m20316o(parcel, this.f43093f);
        parcel.writeInt(this.f43094g);
    }

    zzzd(Parcel parcel) {
        this.f43089b = parcel.readInt();
        this.f43090c = parcel.readString();
        this.f43091d = parcel.readString();
        this.f43092e = parcel.readString();
        this.f43093f = d13.m20323v(parcel);
        this.f43094g = parcel.readInt();
    }
}
