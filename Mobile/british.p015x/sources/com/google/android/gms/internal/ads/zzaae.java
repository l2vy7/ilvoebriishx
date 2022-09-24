package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaae extends zzzu {
    public static final Parcelable.Creator<zzaae> CREATOR = new C7593d();

    /* renamed from: c */
    public final String f42849c;

    /* renamed from: d */
    public final String f42850d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzaae(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.d13.f20195a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f42849c = r0
            java.lang.String r3 = r3.readString()
            r2.f42850d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaae.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaae.class == obj.getClass()) {
            zzaae zzaae = (zzaae) obj;
            return this.f43118b.equals(zzaae.f43118b) && d13.m20317p(this.f42849c, zzaae.f42849c) && d13.m20317p(this.f42850d, zzaae.f42850d);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f43118b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f42849c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f42850d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f43118b;
        String str2 = this.f42850d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43118b);
        parcel.writeString(this.f42849c);
        parcel.writeString(this.f42850d);
    }

    public zzaae(String str, String str2, String str3) {
        super(str);
        this.f42849c = str2;
        this.f42850d = str3;
    }
}
