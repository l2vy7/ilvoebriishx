package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C9698f();

    /* renamed from: b */
    private final int f46115b;

    /* renamed from: c */
    private final int f46116c;

    /* renamed from: d */
    private final long f46117d;

    /* renamed from: e */
    private final long f46118e;

    zzaj(int i, int i2, long j, long j2) {
        this.f46115b = i;
        this.f46116c = i2;
        this.f46117d = j;
        this.f46118e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.f46115b == zzaj.f46115b && this.f46116c == zzaj.f46116c && this.f46117d == zzaj.f46117d && this.f46118e == zzaj.f46118e;
        }
    }

    public final int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f46116c), Integer.valueOf(this.f46115b), Long.valueOf(this.f46118e), Long.valueOf(this.f46117d));
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f46115b + " Cell status: " + this.f46116c + " elapsed time NS: " + this.f46118e + " system time ms: " + this.f46117d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f46115b);
        C11058b.m49527m(parcel, 2, this.f46116c);
        C11058b.m49531q(parcel, 3, this.f46117d);
        C11058b.m49531q(parcel, 4, this.f46118e);
        C11058b.m49516b(parcel, a);
    }
}
