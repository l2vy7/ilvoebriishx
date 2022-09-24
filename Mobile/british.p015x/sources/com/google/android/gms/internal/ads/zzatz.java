package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzatz extends zzatx {
    public static final Parcelable.Creator<zzatz> CREATOR = new C7648ej();

    /* renamed from: c */
    public final String f42907c;

    /* renamed from: d */
    public final String f42908d;

    zzatz(Parcel parcel) {
        super(parcel.readString());
        this.f42907c = parcel.readString();
        this.f42908d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzatz.class == obj.getClass()) {
            zzatz zzatz = (zzatz) obj;
            return this.f42906b.equals(zzatz.f42906b) && C7836jm.m33653o(this.f42907c, zzatz.f42907c) && C7836jm.m33653o(this.f42908d, zzatz.f42908d);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f42906b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f42907c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f42908d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42906b);
        parcel.writeString(this.f42907c);
        parcel.writeString(this.f42908d);
    }

    public zzatz(String str, String str2, String str3) {
        super(str);
        this.f42907c = null;
        this.f42908d = str3;
    }
}
