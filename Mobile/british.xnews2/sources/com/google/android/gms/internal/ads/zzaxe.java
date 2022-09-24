package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaxe implements Parcelable {
    public static final Parcelable.Creator<zzaxe> CREATOR = new C7909lm();

    /* renamed from: b */
    public final int f42909b;

    /* renamed from: c */
    public final int f42910c;

    /* renamed from: d */
    public final int f42911d;

    /* renamed from: e */
    public final byte[] f42912e;

    /* renamed from: f */
    private int f42913f;

    public zzaxe(int i, int i2, int i3, byte[] bArr) {
        this.f42909b = i;
        this.f42910c = i2;
        this.f42911d = i3;
        this.f42912e = bArr;
    }

    zzaxe(Parcel parcel) {
        this.f42909b = parcel.readInt();
        this.f42910c = parcel.readInt();
        this.f42911d = parcel.readInt();
        this.f42912e = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxe.class == obj.getClass()) {
            zzaxe zzaxe = (zzaxe) obj;
            return this.f42909b == zzaxe.f42909b && this.f42910c == zzaxe.f42910c && this.f42911d == zzaxe.f42911d && Arrays.equals(this.f42912e, zzaxe.f42912e);
        }
    }

    public final int hashCode() {
        int i = this.f42913f;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f42909b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f42910c) * 31) + this.f42911d) * 31) + Arrays.hashCode(this.f42912e);
        this.f42913f = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f42909b;
        int i2 = this.f42910c;
        int i3 = this.f42911d;
        boolean z = this.f42912e != null;
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
        parcel.writeInt(this.f42909b);
        parcel.writeInt(this.f42910c);
        parcel.writeInt(this.f42911d);
        parcel.writeInt(this.f42912e != null ? 1 : 0);
        byte[] bArr = this.f42912e;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
