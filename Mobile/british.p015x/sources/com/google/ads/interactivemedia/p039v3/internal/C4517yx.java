package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yx */
/* compiled from: IMASDK */
public final class C4517yx implements C4506ym {
    public static final Parcelable.Creator<C4517yx> CREATOR = new C4516yw();

    /* renamed from: a */
    public final int f19711a;

    /* renamed from: b */
    public final String f19712b;

    /* renamed from: c */
    public final String f19713c;

    /* renamed from: d */
    public final String f19714d;

    /* renamed from: e */
    public final boolean f19715e;

    /* renamed from: f */
    public final int f19716f;

    public C4517yx(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        aup.m14885p(z2);
        this.f19711a = i;
        this.f19712b = str;
        this.f19713c = str2;
        this.f19714d = str3;
        this.f19715e = z;
        this.f19716f = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4517yx.class == obj.getClass()) {
            C4517yx yxVar = (C4517yx) obj;
            return this.f19711a == yxVar.f19711a && amm.m14233c(this.f19712b, yxVar.f19712b) && amm.m14233c(this.f19713c, yxVar.f19713c) && amm.m14233c(this.f19714d, yxVar.f19714d) && this.f19715e == yxVar.f19715e && this.f19716f == yxVar.f19716f;
        }
    }

    public final int hashCode() {
        int i = (this.f19711a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f19712b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19713c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19714d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f19715e ? 1 : 0)) * 31) + this.f19716f;
    }

    public final String toString() {
        String str = this.f19713c;
        String str2 = this.f19712b;
        int i = this.f19711a;
        int i2 = this.f19716f;
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
        parcel.writeInt(this.f19711a);
        parcel.writeString(this.f19712b);
        parcel.writeString(this.f19713c);
        parcel.writeString(this.f19714d);
        amm.m14250t(parcel, this.f19715e);
        parcel.writeInt(this.f19716f);
    }

    C4517yx(Parcel parcel) {
        this.f19711a = parcel.readInt();
        this.f19712b = parcel.readString();
        this.f19713c = parcel.readString();
        this.f19714d = parcel.readString();
        this.f19715e = amm.m14249s(parcel);
        this.f19716f = parcel.readInt();
    }
}
