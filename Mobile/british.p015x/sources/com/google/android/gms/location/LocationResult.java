package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p257v4.C11058b;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new C9695c();

    /* renamed from: c */
    static final List<Location> f46094c = Collections.emptyList();

    /* renamed from: b */
    private final List<Location> f46095b;

    LocationResult(List<Location> list) {
        this.f46095b = list;
    }

    /* renamed from: C0 */
    public final List<Location> mo38721C0() {
        return this.f46095b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f46095b.size() != this.f46095b.size()) {
            return false;
        }
        Iterator<Location> it = this.f46095b.iterator();
        for (Location time : locationResult.f46095b) {
            if (it.next().getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.f46095b) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46095b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49510A(parcel, 1, mo38721C0(), false);
        C11058b.m49516b(parcel, a);
    }
}
