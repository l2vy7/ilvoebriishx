package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yy */
/* compiled from: IMASDK */
public final class C4518yy extends C4530zj {
    public static final Parcelable.Creator<C4518yy> CREATOR = new C4519yz((byte[]) null);

    /* renamed from: a */
    public final String f19717a;

    /* renamed from: b */
    public final String f19718b;

    /* renamed from: c */
    public final int f19719c;

    /* renamed from: d */
    public final byte[] f19720d;

    C4518yy(Parcel parcel) {
        super(ApicFrame.f27467ID);
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f19717a = readString;
        this.f19718b = parcel.readString();
        this.f19719c = parcel.readInt();
        this.f19720d = (byte[]) amm.m14236f(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4518yy.class == obj.getClass()) {
            C4518yy yyVar = (C4518yy) obj;
            return this.f19719c == yyVar.f19719c && amm.m14233c(this.f19717a, yyVar.f19717a) && amm.m14233c(this.f19718b, yyVar.f19718b) && Arrays.equals(this.f19720d, yyVar.f19720d);
        }
    }

    public final int hashCode() {
        int i = (this.f19719c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f19717a;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19718b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f19720d);
    }

    public final String toString() {
        String str = this.f19753f;
        String str2 = this.f19717a;
        String str3 = this.f19718b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19717a);
        parcel.writeString(this.f19718b);
        parcel.writeInt(this.f19719c);
        parcel.writeByteArray(this.f19720d);
    }

    public C4518yy(String str, String str2, int i, byte[] bArr) {
        super(ApicFrame.f27467ID);
        this.f19717a = str;
        this.f19718b = str2;
        this.f19719c = i;
        this.f19720d = bArr;
    }
}
