package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.py */
/* compiled from: IMASDK */
public final class C4275py implements Parcelable {
    public static final Parcelable.Creator<C4275py> CREATOR = new C4274px();

    /* renamed from: a */
    public final UUID f18412a;

    /* renamed from: b */
    public final String f18413b;

    /* renamed from: c */
    public final String f18414c;

    /* renamed from: d */
    public final byte[] f18415d;

    /* renamed from: e */
    private int f18416e;

    C4275py(Parcel parcel) {
        this.f18412a = new UUID(parcel.readLong(), parcel.readLong());
        this.f18413b = parcel.readString();
        String readString = parcel.readString();
        int i = amm.f15298a;
        this.f18414c = readString;
        this.f18415d = parcel.createByteArray();
    }

    /* renamed from: a */
    public final boolean mo16532a(UUID uuid) {
        return C4083iv.f17461a.equals(this.f18412a) || uuid.equals(this.f18412a);
    }

    /* renamed from: b */
    public final boolean mo16533b() {
        return this.f18415d != null;
    }

    /* renamed from: c */
    public final C4275py mo16534c(byte[] bArr) {
        return new C4275py(this.f18412a, this.f18413b, this.f18414c, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4275py)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4275py pyVar = (C4275py) obj;
        return amm.m14233c(this.f18413b, pyVar.f18413b) && amm.m14233c(this.f18414c, pyVar.f18414c) && amm.m14233c(this.f18412a, pyVar.f18412a) && Arrays.equals(this.f18415d, pyVar.f18415d);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f18416e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f18412a.hashCode() * 31;
        String str = this.f18413b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = ((((hashCode + i) * 31) + this.f18414c.hashCode()) * 31) + Arrays.hashCode(this.f18415d);
        this.f18416e = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f18412a.getMostSignificantBits());
        parcel.writeLong(this.f18412a.getLeastSignificantBits());
        parcel.writeString(this.f18413b);
        parcel.writeString(this.f18414c);
        parcel.writeByteArray(this.f18415d);
    }

    public C4275py(UUID uuid, String str, String str2, byte[] bArr) {
        aup.m14890u(uuid);
        this.f18412a = uuid;
        this.f18413b = str;
        aup.m14890u(str2);
        this.f18414c = str2;
        this.f18415d = bArr;
    }

    public C4275py(UUID uuid, String str, byte[] bArr) {
        this(uuid, (String) null, str, bArr);
    }
}
