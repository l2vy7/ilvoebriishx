package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zs */
/* compiled from: IMASDK */
public final class C4539zs implements C4506ym {
    public static final Parcelable.Creator<C4539zs> CREATOR = new C4537zq((char[]) null);

    /* renamed from: a */
    public final float f19778a;

    /* renamed from: b */
    public final int f19779b;

    public C4539zs(float f, int i) {
        this.f19778a = f;
        this.f19779b = i;
    }

    /* synthetic */ C4539zs(Parcel parcel) {
        this.f19778a = parcel.readFloat();
        this.f19779b = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4539zs.class == obj.getClass()) {
            C4539zs zsVar = (C4539zs) obj;
            return this.f19778a == zsVar.f19778a && this.f19779b == zsVar.f19779b;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f19778a).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f19779b;
    }

    public final String toString() {
        float f = this.f19778a;
        int i = this.f19779b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f19778a);
        parcel.writeInt(this.f19779b);
    }
}
