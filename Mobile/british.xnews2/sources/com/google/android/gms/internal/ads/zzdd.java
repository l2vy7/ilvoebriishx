package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzdd implements Parcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new t61();

    /* renamed from: b */
    private final zzdc[] f43041b;

    zzdd(Parcel parcel) {
        this.f43041b = new zzdc[parcel.readInt()];
        int i = 0;
        while (true) {
            zzdc[] zzdcArr = this.f43041b;
            if (i < zzdcArr.length) {
                zzdcArr[i] = (zzdc) parcel.readParcelable(zzdc.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public zzdd(zzdc... zzdcArr) {
        this.f43041b = zzdcArr;
    }

    /* renamed from: a */
    public final int mo36273a() {
        return this.f43041b.length;
    }

    /* renamed from: b */
    public final zzdc mo36274b(int i) {
        return this.f43041b[i];
    }

    /* renamed from: d */
    public final zzdd mo36275d(zzdc... zzdcArr) {
        if (zzdcArr.length == 0) {
            return this;
        }
        return new zzdd((zzdc[]) d13.m20327z(this.f43041b, zzdcArr));
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final zzdd mo36277e(zzdd zzdd) {
        return zzdd == null ? this : mo36275d(zzdd.f43041b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdd.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f43041b, ((zzdd) obj).f43041b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f43041b);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f43041b));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f43041b.length);
        for (zzdc writeParcelable : this.f43041b) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzdd(List<? extends zzdc> list) {
        this.f43041b = (zzdc[]) list.toArray(new zzdc[0]);
    }
}
