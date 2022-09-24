package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzl extends zzzu {
    public static final Parcelable.Creator<zzzl> CREATOR = new me4();

    /* renamed from: c */
    public final String f43106c;

    /* renamed from: d */
    public final boolean f43107d;

    /* renamed from: e */
    public final boolean f43108e;

    /* renamed from: f */
    public final String[] f43109f;

    /* renamed from: g */
    private final zzzu[] f43110g;

    zzzl(Parcel parcel) {
        super(ChapterTocFrame.f27469ID);
        String readString = parcel.readString();
        int i = d13.f20195a;
        this.f43106c = readString;
        boolean z = true;
        this.f43107d = parcel.readByte() != 0;
        this.f43108e = parcel.readByte() == 0 ? false : z;
        this.f43109f = (String[]) d13.m20300c(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f43110g = new zzzu[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f43110g[i2] = (zzzu) parcel.readParcelable(zzzu.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzl.class == obj.getClass()) {
            zzzl zzzl = (zzzl) obj;
            return this.f43107d == zzzl.f43107d && this.f43108e == zzzl.f43108e && d13.m20317p(this.f43106c, zzzl.f43106c) && Arrays.equals(this.f43109f, zzzl.f43109f) && Arrays.equals(this.f43110g, zzzl.f43110g);
        }
    }

    public final int hashCode() {
        int i = ((((this.f43107d ? 1 : 0) + true) * 31) + (this.f43108e ? 1 : 0)) * 31;
        String str = this.f43106c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43106c);
        parcel.writeByte(this.f43107d ? (byte) 1 : 0);
        parcel.writeByte(this.f43108e ? (byte) 1 : 0);
        parcel.writeStringArray(this.f43109f);
        parcel.writeInt(this.f43110g.length);
        for (zzzu writeParcelable : this.f43110g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzzl(String str, boolean z, boolean z2, String[] strArr, zzzu[] zzzuArr) {
        super(ChapterTocFrame.f27469ID);
        this.f43106c = str;
        this.f43107d = z;
        this.f43108e = z2;
        this.f43109f = strArr;
        this.f43110g = zzzuArr;
    }
}
