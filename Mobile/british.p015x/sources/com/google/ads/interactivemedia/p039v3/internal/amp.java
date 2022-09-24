package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amp */
/* compiled from: IMASDK */
public final class amp implements Parcelable {
    public static final Parcelable.Creator<amp> CREATOR = new amo();

    /* renamed from: a */
    public final int f15318a;

    /* renamed from: b */
    public final int f15319b;

    /* renamed from: c */
    public final int f15320c;

    /* renamed from: d */
    public final byte[] f15321d;

    /* renamed from: e */
    private int f15322e;

    public amp(int i, int i2, int i3, byte[] bArr) {
        this.f15318a = i;
        this.f15319b = i2;
        this.f15320c = i3;
        this.f15321d = bArr;
    }

    amp(Parcel parcel) {
        this.f15318a = parcel.readInt();
        this.f15319b = parcel.readInt();
        this.f15320c = parcel.readInt();
        this.f15321d = amm.m14249s(parcel) ? parcel.createByteArray() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && amp.class == obj.getClass()) {
            amp amp = (amp) obj;
            return this.f15318a == amp.f15318a && this.f15319b == amp.f15319b && this.f15320c == amp.f15320c && Arrays.equals(this.f15321d, amp.f15321d);
        }
    }

    public final int hashCode() {
        int i = this.f15322e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f15318a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f15319b) * 31) + this.f15320c) * 31) + Arrays.hashCode(this.f15321d);
        this.f15322e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f15318a;
        int i2 = this.f15319b;
        int i3 = this.f15320c;
        boolean z = this.f15321d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15318a);
        parcel.writeInt(this.f15319b);
        parcel.writeInt(this.f15320c);
        amm.m14250t(parcel, this.f15321d != null);
        byte[] bArr = this.f15321d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
