package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaak implements zzdc {
    public static final Parcelable.Creator<zzaak> CREATOR = new C7702g();

    /* renamed from: b */
    public final long f42855b;

    /* renamed from: c */
    public final long f42856c;

    /* renamed from: d */
    public final long f42857d;

    /* renamed from: e */
    public final long f42858e;

    /* renamed from: f */
    public final long f42859f;

    public zzaak(long j, long j2, long j3, long j4, long j5) {
        this.f42855b = j;
        this.f42856c = j2;
        this.f42857d = j3;
        this.f42858e = j4;
        this.f42859f = j5;
    }

    /* synthetic */ zzaak(Parcel parcel, C7738h hVar) {
        this.f42855b = parcel.readLong();
        this.f42856c = parcel.readLong();
        this.f42857d = parcel.readLong();
        this.f42858e = parcel.readLong();
        this.f42859f = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaak.class == obj.getClass()) {
            zzaak zzaak = (zzaak) obj;
            return this.f42855b == zzaak.f42855b && this.f42856c == zzaak.f42856c && this.f42857d == zzaak.f42857d && this.f42858e == zzaak.f42858e && this.f42859f == zzaak.f42859f;
        }
    }

    /* renamed from: g0 */
    public final /* synthetic */ void mo36161g0(C7840jr jrVar) {
    }

    public final int hashCode() {
        long j = this.f42855b;
        long j2 = this.f42856c;
        long j3 = this.f42857d;
        long j4 = this.f42858e;
        long j5 = this.f42859f;
        return ((((((((((int) (j ^ (j >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        long j = this.f42855b;
        long j2 = this.f42856c;
        long j3 = this.f42857d;
        long j4 = this.f42858e;
        long j5 = this.f42859f;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j);
        sb.append(", photoSize=");
        sb.append(j2);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j3);
        sb.append(", videoStartPosition=");
        sb.append(j4);
        sb.append(", videoSize=");
        sb.append(j5);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f42855b);
        parcel.writeLong(this.f42856c);
        parcel.writeLong(this.f42857d);
        parcel.writeLong(this.f42858e);
        parcel.writeLong(this.f42859f);
    }
}
