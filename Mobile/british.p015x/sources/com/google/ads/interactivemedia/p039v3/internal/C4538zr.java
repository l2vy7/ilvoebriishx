package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zr */
/* compiled from: IMASDK */
public final class C4538zr implements C4506ym {
    public static final Parcelable.Creator<C4538zr> CREATOR = new C4537zq();

    /* renamed from: a */
    public final long f19773a;

    /* renamed from: b */
    public final long f19774b;

    /* renamed from: c */
    public final long f19775c;

    /* renamed from: d */
    public final long f19776d;

    /* renamed from: e */
    public final long f19777e;

    public C4538zr(long j, long j2, long j3, long j4, long j5) {
        this.f19773a = j;
        this.f19774b = j2;
        this.f19775c = j3;
        this.f19776d = j4;
        this.f19777e = j5;
    }

    /* synthetic */ C4538zr(Parcel parcel) {
        this.f19773a = parcel.readLong();
        this.f19774b = parcel.readLong();
        this.f19775c = parcel.readLong();
        this.f19776d = parcel.readLong();
        this.f19777e = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4538zr.class == obj.getClass()) {
            C4538zr zrVar = (C4538zr) obj;
            return this.f19773a == zrVar.f19773a && this.f19774b == zrVar.f19774b && this.f19775c == zrVar.f19775c && this.f19776d == zrVar.f19776d && this.f19777e == zrVar.f19777e;
        }
    }

    public final int hashCode() {
        return ((((((((awo.m15058c(this.f19773a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + awo.m15058c(this.f19774b)) * 31) + awo.m15058c(this.f19775c)) * 31) + awo.m15058c(this.f19776d)) * 31) + awo.m15058c(this.f19777e);
    }

    public final String toString() {
        long j = this.f19773a;
        long j2 = this.f19774b;
        long j3 = this.f19775c;
        long j4 = this.f19776d;
        long j5 = this.f19777e;
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
        parcel.writeLong(this.f19773a);
        parcel.writeLong(this.f19774b);
        parcel.writeLong(this.f19775c);
        parcel.writeLong(this.f19776d);
        parcel.writeLong(this.f19777e);
    }
}
