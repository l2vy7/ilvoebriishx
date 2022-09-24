package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zc */
/* compiled from: IMASDK */
public final class C4523zc extends C4530zj {
    public static final Parcelable.Creator<C4523zc> CREATOR = new C4519yz((short[]) null);

    /* renamed from: a */
    public final String f19735a;

    /* renamed from: b */
    public final boolean f19736b;

    /* renamed from: c */
    public final boolean f19737c;

    /* renamed from: d */
    public final String[] f19738d;

    /* renamed from: e */
    private final C4530zj[] f19739e;

    C4523zc(Parcel parcel) {
        super(ChapterTocFrame.f27469ID);
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f19735a = readString;
        boolean z = true;
        this.f19736b = parcel.readByte() != 0;
        this.f19737c = parcel.readByte() == 0 ? false : z;
        this.f19738d = (String[]) amm.m14236f(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f19739e = new C4530zj[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f19739e[i2] = (C4530zj) parcel.readParcelable(C4530zj.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4523zc.class == obj.getClass()) {
            C4523zc zcVar = (C4523zc) obj;
            return this.f19736b == zcVar.f19736b && this.f19737c == zcVar.f19737c && amm.m14233c(this.f19735a, zcVar.f19735a) && Arrays.equals(this.f19738d, zcVar.f19738d) && Arrays.equals(this.f19739e, zcVar.f19739e);
        }
    }

    public final int hashCode() {
        int i = ((((this.f19736b ? 1 : 0) + true) * 31) + (this.f19737c ? 1 : 0)) * 31;
        String str = this.f19735a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19735a);
        parcel.writeByte(this.f19736b ? (byte) 1 : 0);
        parcel.writeByte(this.f19737c ? (byte) 1 : 0);
        parcel.writeStringArray(this.f19738d);
        parcel.writeInt(this.f19739e.length);
        for (C4530zj writeParcelable : this.f19739e) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C4523zc(String str, boolean z, boolean z2, String[] strArr, C4530zj[] zjVarArr) {
        super(ChapterTocFrame.f27469ID);
        this.f19735a = str;
        this.f19736b = z;
        this.f19737c = z2;
        this.f19738d = strArr;
        this.f19739e = zjVarArr;
    }
}
