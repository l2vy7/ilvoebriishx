package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzh extends zzzu {
    public static final Parcelable.Creator<zzzh> CREATOR = new ke4();

    /* renamed from: c */
    public final byte[] f43099c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzzh(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.d13.f20195a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.google.android.gms.internal.ads.d13.m20300c(r3)
            byte[] r3 = (byte[]) r3
            r2.f43099c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzh.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzh.class == obj.getClass()) {
            zzzh zzzh = (zzzh) obj;
            return this.f43118b.equals(zzzh.f43118b) && Arrays.equals(this.f43099c, zzzh.f43099c);
        }
    }

    public final int hashCode() {
        return ((this.f43118b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f43099c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43118b);
        parcel.writeByteArray(this.f43099c);
    }

    public zzzh(String str, byte[] bArr) {
        super(str);
        this.f43099c = bArr;
    }
}
