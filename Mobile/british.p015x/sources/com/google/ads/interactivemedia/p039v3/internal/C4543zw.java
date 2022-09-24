package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zw */
/* compiled from: IMASDK */
public final class C4543zw implements Comparable<C4543zw>, Parcelable {
    public static final Parcelable.Creator<C4543zw> CREATOR = new C4542zv();

    /* renamed from: a */
    public final int f19782a;

    /* renamed from: b */
    public final int f19783b;

    /* renamed from: c */
    public final int f19784c;

    public C4543zw() {
        this.f19782a = -1;
        this.f19783b = -1;
        this.f19784c = -1;
    }

    C4543zw(Parcel parcel) {
        this.f19782a = parcel.readInt();
        this.f19783b = parcel.readInt();
        this.f19784c = parcel.readInt();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C4543zw zwVar = (C4543zw) obj;
        int i = this.f19782a - zwVar.f19782a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f19783b - zwVar.f19783b;
        return i2 == 0 ? this.f19784c - zwVar.f19784c : i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4543zw.class == obj.getClass()) {
            C4543zw zwVar = (C4543zw) obj;
            return this.f19782a == zwVar.f19782a && this.f19783b == zwVar.f19783b && this.f19784c == zwVar.f19784c;
        }
    }

    public final int hashCode() {
        return (((this.f19782a * 31) + this.f19783b) * 31) + this.f19784c;
    }

    public final String toString() {
        int i = this.f19782a;
        int i2 = this.f19783b;
        int i3 = this.f19784c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19782a);
        parcel.writeInt(this.f19783b);
        parcel.writeInt(this.f19784c);
    }
}
