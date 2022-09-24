package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzatt extends zzatx {
    public static final Parcelable.Creator<zzatt> CREATOR = new C7541bj();

    /* renamed from: c */
    public final String f42899c;

    /* renamed from: d */
    public final String f42900d;

    /* renamed from: e */
    public final int f42901e;

    /* renamed from: f */
    public final byte[] f42902f;

    zzatt(Parcel parcel) {
        super(ApicFrame.f27467ID);
        this.f42899c = parcel.readString();
        this.f42900d = parcel.readString();
        this.f42901e = parcel.readInt();
        this.f42902f = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzatt.class == obj.getClass()) {
            zzatt zzatt = (zzatt) obj;
            return this.f42901e == zzatt.f42901e && C7836jm.m33653o(this.f42899c, zzatt.f42899c) && C7836jm.m33653o(this.f42900d, zzatt.f42900d) && Arrays.equals(this.f42902f, zzatt.f42902f);
        }
    }

    public final int hashCode() {
        int i = (this.f42901e + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f42899c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f42900d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f42902f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42899c);
        parcel.writeString(this.f42900d);
        parcel.writeInt(this.f42901e);
        parcel.writeByteArray(this.f42902f);
    }

    public zzatt(String str, String str2, int i, byte[] bArr) {
        super(ApicFrame.f27467ID);
        this.f42899c = str;
        this.f42900d = null;
        this.f42901e = 3;
        this.f42902f = bArr;
    }
}
