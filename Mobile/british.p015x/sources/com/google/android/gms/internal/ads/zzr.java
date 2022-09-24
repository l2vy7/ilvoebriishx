package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzr implements Parcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new d54();

    /* renamed from: b */
    private int f43058b;

    /* renamed from: c */
    public final UUID f43059c;

    /* renamed from: d */
    public final String f43060d;

    /* renamed from: e */
    public final String f43061e;

    /* renamed from: f */
    public final byte[] f43062f;

    zzr(Parcel parcel) {
        this.f43059c = new UUID(parcel.readLong(), parcel.readLong());
        this.f43060d = parcel.readString();
        String readString = parcel.readString();
        int i = d13.f20195a;
        this.f43061e = readString;
        this.f43062f = parcel.createByteArray();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzr zzr = (zzr) obj;
        return d13.m20317p(this.f43060d, zzr.f43060d) && d13.m20317p(this.f43061e, zzr.f43061e) && d13.m20317p(this.f43059c, zzr.f43059c) && Arrays.equals(this.f43062f, zzr.f43062f);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f43058b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f43059c.hashCode() * 31;
        String str = this.f43060d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = ((((hashCode + i) * 31) + this.f43061e.hashCode()) * 31) + Arrays.hashCode(this.f43062f);
        this.f43058b = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f43059c.getMostSignificantBits());
        parcel.writeLong(this.f43059c.getLeastSignificantBits());
        parcel.writeString(this.f43060d);
        parcel.writeString(this.f43061e);
        parcel.writeByteArray(this.f43062f);
    }

    public zzr(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.f43059c = uuid;
        this.f43060d = null;
        this.f43061e = str2;
        this.f43062f = bArr;
    }
}
