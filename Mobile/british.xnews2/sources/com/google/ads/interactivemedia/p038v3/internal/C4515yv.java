package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yv */
/* compiled from: IMASDK */
public final class C4515yv implements C4506ym {
    public static final Parcelable.Creator<C4515yv> CREATOR = new C4514yu();

    /* renamed from: a */
    public final String f19709a;

    /* renamed from: b */
    public final String f19710b;

    C4515yv(Parcel parcel) {
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f19709a = readString;
        this.f19710b = parcel.readString();
    }

    public C4515yv(String str, String str2) {
        this.f19709a = str;
        this.f19710b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4515yv.class == obj.getClass()) {
            C4515yv yvVar = (C4515yv) obj;
            return this.f19709a.equals(yvVar.f19709a) && this.f19710b.equals(yvVar.f19710b);
        }
    }

    public final int hashCode() {
        return ((this.f19709a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f19710b.hashCode();
    }

    public final String toString() {
        String str = this.f19709a;
        String str2 = this.f19710b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19709a);
        parcel.writeString(this.f19710b);
    }
}
