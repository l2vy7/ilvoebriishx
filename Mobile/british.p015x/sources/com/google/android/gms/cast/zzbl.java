package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class zzbl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbl> CREATOR = new C7097f();

    /* renamed from: b */
    private final int f28847b;

    public zzbl() {
        this.f28847b = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzbl) && this.f28847b == ((zzbl) obj).f28847b;
    }

    public final int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f28847b));
    }

    public final String toString() {
        int i = this.f28847b;
        return String.format("joinOptions(connectionType=%s)", new Object[]{i != 0 ? i != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG"});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, this.f28847b);
        C11058b.m49516b(parcel, a);
    }

    zzbl(int i) {
        this.f28847b = i;
    }
}
