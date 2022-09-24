package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzare implements Parcelable {
    public static final Parcelable.Creator<zzare> CREATOR = new C8014og();

    /* renamed from: b */
    private int f42890b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final UUID f42891c;

    /* renamed from: d */
    public final String f42892d;

    /* renamed from: e */
    public final byte[] f42893e;

    /* renamed from: f */
    public final boolean f42894f;

    zzare(Parcel parcel) {
        this.f42891c = new UUID(parcel.readLong(), parcel.readLong());
        this.f42892d = parcel.readString();
        this.f42893e = parcel.createByteArray();
        this.f42894f = parcel.readByte() != 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzare)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzare zzare = (zzare) obj;
        return this.f42892d.equals(zzare.f42892d) && C7836jm.m33653o(this.f42891c, zzare.f42891c) && Arrays.equals(this.f42893e, zzare.f42893e);
    }

    public final int hashCode() {
        int i = this.f42890b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((this.f42891c.hashCode() * 31) + this.f42892d.hashCode()) * 31) + Arrays.hashCode(this.f42893e);
        this.f42890b = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f42891c.getMostSignificantBits());
        parcel.writeLong(this.f42891c.getLeastSignificantBits());
        parcel.writeString(this.f42892d);
        parcel.writeByteArray(this.f42893e);
        parcel.writeByte(this.f42894f ? (byte) 1 : 0);
    }

    public zzare(UUID uuid, String str, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.f42891c = uuid;
        this.f42892d = str;
        Objects.requireNonNull(bArr);
        this.f42893e = bArr;
        this.f42894f = false;
    }
}
