package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzatr implements Parcelable {
    public static final Parcelable.Creator<zzatr> CREATOR = new C7505aj();

    /* renamed from: b */
    private final zzatq[] f42898b;

    zzatr(Parcel parcel) {
        this.f42898b = new zzatq[parcel.readInt()];
        int i = 0;
        while (true) {
            zzatq[] zzatqArr = this.f42898b;
            if (i < zzatqArr.length) {
                zzatqArr[i] = (zzatq) parcel.readParcelable(zzatq.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo36205a() {
        return this.f42898b.length;
    }

    /* renamed from: b */
    public final zzatq mo36206b(int i) {
        return this.f42898b[i];
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzatr.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f42898b, ((zzatr) obj).f42898b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42898b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f42898b.length);
        for (zzatq writeParcelable : this.f42898b) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzatr(List<? extends zzatq> list) {
        zzatq[] zzatqArr = new zzatq[list.size()];
        this.f42898b = zzatqArr;
        list.toArray(zzatqArr);
    }
}
