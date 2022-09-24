package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ze */
/* compiled from: IMASDK */
public final class C4525ze extends C4530zj {
    public static final Parcelable.Creator<C4525ze> CREATOR = new C4519yz((boolean[]) null);

    /* renamed from: a */
    public final String f19743a;

    /* renamed from: b */
    public final String f19744b;

    /* renamed from: c */
    public final String f19745c;

    /* renamed from: d */
    public final byte[] f19746d;

    C4525ze(Parcel parcel) {
        super(GeobFrame.f27471ID);
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f19743a = readString;
        this.f19744b = parcel.readString();
        this.f19745c = parcel.readString();
        this.f19746d = (byte[]) amm.m14236f(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4525ze.class == obj.getClass()) {
            C4525ze zeVar = (C4525ze) obj;
            return amm.m14233c(this.f19743a, zeVar.f19743a) && amm.m14233c(this.f19744b, zeVar.f19744b) && amm.m14233c(this.f19745c, zeVar.f19745c) && Arrays.equals(this.f19746d, zeVar.f19746d);
        }
    }

    public final int hashCode() {
        String str = this.f19743a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f19744b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19745c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f19746d);
    }

    public final String toString() {
        String str = this.f19753f;
        String str2 = this.f19743a;
        String str3 = this.f19744b;
        String str4 = this.f19745c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 36 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19743a);
        parcel.writeString(this.f19744b);
        parcel.writeString(this.f19745c);
        parcel.writeByteArray(this.f19746d);
    }

    public C4525ze(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.f27471ID);
        this.f19743a = str;
        this.f19744b = str2;
        this.f19745c = str3;
        this.f19746d = bArr;
    }
}
