package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yt */
/* compiled from: IMASDK */
public final class C4513yt implements C4506ym {
    public static final Parcelable.Creator<C4513yt> CREATOR = new C4514yu((byte[]) null);

    /* renamed from: a */
    public final int f19700a;

    /* renamed from: b */
    public final String f19701b;

    /* renamed from: c */
    public final String f19702c;

    /* renamed from: d */
    public final int f19703d;

    /* renamed from: e */
    public final int f19704e;

    /* renamed from: f */
    public final int f19705f;

    /* renamed from: g */
    public final int f19706g;

    /* renamed from: h */
    public final byte[] f19707h;

    public C4513yt(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f19700a = i;
        this.f19701b = str;
        this.f19702c = str2;
        this.f19703d = i2;
        this.f19704e = i3;
        this.f19705f = i4;
        this.f19706g = i5;
        this.f19707h = bArr;
    }

    C4513yt(Parcel parcel) {
        this.f19700a = parcel.readInt();
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f19701b = readString;
        this.f19702c = parcel.readString();
        this.f19703d = parcel.readInt();
        this.f19704e = parcel.readInt();
        this.f19705f = parcel.readInt();
        this.f19706g = parcel.readInt();
        this.f19707h = (byte[]) amm.m14236f(parcel.createByteArray());
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4513yt.class == obj.getClass()) {
            C4513yt ytVar = (C4513yt) obj;
            return this.f19700a == ytVar.f19700a && this.f19701b.equals(ytVar.f19701b) && this.f19702c.equals(ytVar.f19702c) && this.f19703d == ytVar.f19703d && this.f19704e == ytVar.f19704e && this.f19705f == ytVar.f19705f && this.f19706g == ytVar.f19706g && Arrays.equals(this.f19707h, ytVar.f19707h);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f19700a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f19701b.hashCode()) * 31) + this.f19702c.hashCode()) * 31) + this.f19703d) * 31) + this.f19704e) * 31) + this.f19705f) * 31) + this.f19706g) * 31) + Arrays.hashCode(this.f19707h);
    }

    public final String toString() {
        String str = this.f19701b;
        String str2 = this.f19702c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19700a);
        parcel.writeString(this.f19701b);
        parcel.writeString(this.f19702c);
        parcel.writeInt(this.f19703d);
        parcel.writeInt(this.f19704e);
        parcel.writeInt(this.f19705f);
        parcel.writeInt(this.f19706g);
        parcel.writeByteArray(this.f19707h);
    }
}
