package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.za */
/* compiled from: IMASDK */
public final class C4521za extends C4530zj {
    public static final Parcelable.Creator<C4521za> CREATOR = new C4519yz();

    /* renamed from: a */
    public final byte[] f19728a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C4521za(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.ads.interactivemedia.p038v3.internal.amm.f15298a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.google.ads.interactivemedia.p038v3.internal.amm.m14236f(r3)
            byte[] r3 = (byte[]) r3
            r2.f19728a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.C4521za.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4521za.class == obj.getClass()) {
            C4521za zaVar = (C4521za) obj;
            return this.f19753f.equals(zaVar.f19753f) && Arrays.equals(this.f19728a, zaVar.f19728a);
        }
    }

    public final int hashCode() {
        return ((this.f19753f.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f19728a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19753f);
        parcel.writeByteArray(this.f19728a);
    }

    public C4521za(String str, byte[] bArr) {
        super(str);
        this.f19728a = bArr;
    }
}
