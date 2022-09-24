package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p256v4.C11058b;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C9693a();
    @Deprecated

    /* renamed from: b */
    private int f46081b;
    @Deprecated

    /* renamed from: c */
    private int f46082c;

    /* renamed from: d */
    private long f46083d;

    /* renamed from: e */
    private int f46084e;

    /* renamed from: f */
    private zzaj[] f46085f;

    LocationAvailability(int i, int i2, int i3, long j, zzaj[] zzajArr) {
        this.f46084e = i;
        this.f46081b = i2;
        this.f46082c = i3;
        this.f46083d = j;
        this.f46085f = zzajArr;
    }

    /* renamed from: C0 */
    public final boolean mo38711C0() {
        return this.f46084e < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f46081b == locationAvailability.f46081b && this.f46082c == locationAvailability.f46082c && this.f46083d == locationAvailability.f46083d && this.f46084e == locationAvailability.f46084e && Arrays.equals(this.f46085f, locationAvailability.f46085f);
        }
    }

    public final int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f46084e), Integer.valueOf(this.f46081b), Integer.valueOf(this.f46082c), Long.valueOf(this.f46083d), this.f46085f);
    }

    public final String toString() {
        boolean C0 = mo38711C0();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(C0);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f46081b);
        C11058b.m49527m(parcel, 2, this.f46082c);
        C11058b.m49531q(parcel, 3, this.f46083d);
        C11058b.m49527m(parcel, 4, this.f46084e);
        C11058b.m49540z(parcel, 5, this.f46085f, i, false);
        C11058b.m49516b(parcel, a);
    }
}
