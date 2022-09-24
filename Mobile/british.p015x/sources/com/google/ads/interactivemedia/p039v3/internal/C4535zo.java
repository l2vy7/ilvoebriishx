package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zo */
/* compiled from: IMASDK */
public final class C4535zo extends C4530zj {
    public static final Parcelable.Creator<C4535zo> CREATOR = new C4519yz((int[][]) null);

    /* renamed from: a */
    public final String f19766a;

    /* renamed from: b */
    public final String f19767b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C4535zo(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.ads.interactivemedia.p039v3.internal.amm.f15298a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f19766a = r0
            java.lang.String r3 = r3.readString()
            r2.f19767b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4535zo.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4535zo.class == obj.getClass()) {
            C4535zo zoVar = (C4535zo) obj;
            return this.f19753f.equals(zoVar.f19753f) && amm.m14233c(this.f19766a, zoVar.f19766a) && amm.m14233c(this.f19767b, zoVar.f19767b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f19753f.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f19766a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19767b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f19753f;
        String str2 = this.f19767b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19753f);
        parcel.writeString(this.f19766a);
        parcel.writeString(this.f19767b);
    }

    public C4535zo(String str, String str2, String str3) {
        super(str);
        this.f19766a = str2;
        this.f19767b = str3;
    }
}
