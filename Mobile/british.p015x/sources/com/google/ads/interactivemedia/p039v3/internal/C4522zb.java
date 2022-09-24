package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zb */
/* compiled from: IMASDK */
public final class C4522zb extends C4530zj {
    public static final Parcelable.Creator<C4522zb> CREATOR = new C4519yz((char[]) null);

    /* renamed from: a */
    public final String f19729a;

    /* renamed from: b */
    public final int f19730b;

    /* renamed from: c */
    public final int f19731c;

    /* renamed from: d */
    public final long f19732d;

    /* renamed from: e */
    public final long f19733e;

    /* renamed from: g */
    private final C4530zj[] f19734g;

    C4522zb(Parcel parcel) {
        super(ChapterFrame.f27468ID);
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f19729a = readString;
        this.f19730b = parcel.readInt();
        this.f19731c = parcel.readInt();
        this.f19732d = parcel.readLong();
        this.f19733e = parcel.readLong();
        int readInt = parcel.readInt();
        this.f19734g = new C4530zj[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f19734g[i2] = (C4530zj) parcel.readParcelable(C4530zj.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4522zb.class == obj.getClass()) {
            C4522zb zbVar = (C4522zb) obj;
            return this.f19730b == zbVar.f19730b && this.f19731c == zbVar.f19731c && this.f19732d == zbVar.f19732d && this.f19733e == zbVar.f19733e && amm.m14233c(this.f19729a, zbVar.f19729a) && Arrays.equals(this.f19734g, zbVar.f19734g);
        }
    }

    public final int hashCode() {
        int i = (((((((this.f19730b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f19731c) * 31) + ((int) this.f19732d)) * 31) + ((int) this.f19733e)) * 31;
        String str = this.f19729a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19729a);
        parcel.writeInt(this.f19730b);
        parcel.writeInt(this.f19731c);
        parcel.writeLong(this.f19732d);
        parcel.writeLong(this.f19733e);
        parcel.writeInt(this.f19734g.length);
        for (C4530zj writeParcelable : this.f19734g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C4522zb(String str, int i, int i2, long j, long j2, C4530zj[] zjVarArr) {
        super(ChapterFrame.f27468ID);
        this.f19729a = str;
        this.f19730b = i;
        this.f19731c = i2;
        this.f19732d = j;
        this.f19733e = j2;
        this.f19734g = zjVarArr;
    }
}
