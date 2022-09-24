package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zk */
/* compiled from: IMASDK */
public final class C4531zk extends C4530zj {
    public static final Parcelable.Creator<C4531zk> CREATOR = new C4519yz((float[]) null);

    /* renamed from: a */
    public final String f19754a;

    /* renamed from: b */
    public final String f19755b;

    /* renamed from: c */
    public final String f19756c;

    C4531zk(Parcel parcel) {
        super(InternalFrame.f27473ID);
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f19754a = readString;
        this.f19755b = parcel.readString();
        this.f19756c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4531zk.class == obj.getClass()) {
            C4531zk zkVar = (C4531zk) obj;
            return amm.m14233c(this.f19755b, zkVar.f19755b) && amm.m14233c(this.f19754a, zkVar.f19754a) && amm.m14233c(this.f19756c, zkVar.f19756c);
        }
    }

    public final int hashCode() {
        String str = this.f19754a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f19755b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19756c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f19753f;
        String str2 = this.f19754a;
        String str3 = this.f19755b;
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
        parcel.writeString(this.f19753f);
        parcel.writeString(this.f19754a);
        parcel.writeString(this.f19756c);
    }

    public C4531zk(String str, String str2, String str3) {
        super(InternalFrame.f27473ID);
        this.f19754a = str;
        this.f19755b = str2;
        this.f19756c = str3;
    }
}
