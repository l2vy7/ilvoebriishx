package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zm */
/* compiled from: IMASDK */
public final class C4533zm extends C4530zj {
    public static final Parcelable.Creator<C4533zm> CREATOR = new C4519yz((char[][]) null);

    /* renamed from: a */
    public final String f19762a;

    /* renamed from: b */
    public final byte[] f19763b;

    C4533zm(Parcel parcel) {
        super(PrivFrame.f27475ID);
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f19762a = readString;
        this.f19763b = (byte[]) amm.m14236f(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4533zm.class == obj.getClass()) {
            C4533zm zmVar = (C4533zm) obj;
            return amm.m14233c(this.f19762a, zmVar.f19762a) && Arrays.equals(this.f19763b, zmVar.f19763b);
        }
    }

    public final int hashCode() {
        String str = this.f19762a;
        return (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f19763b);
    }

    public final String toString() {
        String str = this.f19753f;
        String str2 = this.f19762a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19762a);
        parcel.writeByteArray(this.f19763b);
    }

    public C4533zm(String str, byte[] bArr) {
        super(PrivFrame.f27475ID);
        this.f19762a = str;
        this.f19763b = bArr;
    }
}
