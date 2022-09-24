package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zn */
/* compiled from: IMASDK */
public final class C4534zn extends C4530zj {
    public static final Parcelable.Creator<C4534zn> CREATOR = new C4519yz((short[][]) null);

    /* renamed from: a */
    public final String f19764a;

    /* renamed from: b */
    public final String f19765b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C4534zn(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.ads.interactivemedia.p039v3.internal.amm.f15298a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f19764a = r0
            java.lang.String r3 = r3.readString()
            r2.f19765b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4534zn.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4534zn.class == obj.getClass()) {
            C4534zn znVar = (C4534zn) obj;
            return this.f19753f.equals(znVar.f19753f) && amm.m14233c(this.f19764a, znVar.f19764a) && amm.m14233c(this.f19765b, znVar.f19765b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f19753f.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f19764a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19765b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f19753f;
        String str2 = this.f19764a;
        String str3 = this.f19765b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19753f);
        parcel.writeString(this.f19764a);
        parcel.writeString(this.f19765b);
    }

    public C4534zn(String str, String str2, String str3) {
        super(str);
        this.f19764a = str2;
        this.f19765b = str3;
    }
}
