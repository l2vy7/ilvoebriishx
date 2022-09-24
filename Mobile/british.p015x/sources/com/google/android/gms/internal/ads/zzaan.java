package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaan implements zzdc {
    public static final Parcelable.Creator<zzaan> CREATOR = new C7776i();

    /* renamed from: b */
    public final float f42860b;

    /* renamed from: c */
    public final int f42861c;

    public zzaan(float f, int i) {
        this.f42860b = f;
        this.f42861c = i;
    }

    /* synthetic */ zzaan(Parcel parcel, C7813j jVar) {
        this.f42860b = parcel.readFloat();
        this.f42861c = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaan.class == obj.getClass()) {
            zzaan zzaan = (zzaan) obj;
            return this.f42860b == zzaan.f42860b && this.f42861c == zzaan.f42861c;
        }
    }

    /* renamed from: g0 */
    public final /* synthetic */ void mo36161g0(C7840jr jrVar) {
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f42860b).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f42861c;
    }

    public final String toString() {
        float f = this.f42860b;
        int i = this.f42861c;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f42860b);
        parcel.writeInt(this.f42861c);
    }
}
