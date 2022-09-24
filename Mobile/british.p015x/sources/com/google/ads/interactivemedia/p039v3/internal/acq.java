package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acq */
/* compiled from: IMASDK */
public final class acq implements Parcelable {
    public static final Parcelable.Creator<acq> CREATOR = new acp();

    /* renamed from: a */
    public static final acq f14192a = new acq(new aco[0]);

    /* renamed from: b */
    public final int f14193b;

    /* renamed from: c */
    private final aco[] f14194c;

    /* renamed from: d */
    private int f14195d;

    acq(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f14193b = readInt;
        this.f14194c = new aco[readInt];
        for (int i = 0; i < this.f14193b; i++) {
            this.f14194c[i] = (aco) parcel.readParcelable(aco.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public final aco mo13453a(int i) {
        return this.f14194c[i];
    }

    /* renamed from: b */
    public final int mo13454b(aco aco) {
        for (int i = 0; i < this.f14193b; i++) {
            if (this.f14194c[i] == aco) {
                return i;
            }
        }
        return -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && acq.class == obj.getClass()) {
            acq acq = (acq) obj;
            return this.f14193b == acq.f14193b && Arrays.equals(this.f14194c, acq.f14194c);
        }
    }

    public final int hashCode() {
        int i = this.f14195d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f14194c);
        this.f14195d = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14193b);
        for (int i2 = 0; i2 < this.f14193b; i2++) {
            parcel.writeParcelable(this.f14194c[i2], 0);
        }
    }

    public acq(aco... acoArr) {
        this.f14194c = acoArr;
        this.f14193b = acoArr.length;
    }
}
