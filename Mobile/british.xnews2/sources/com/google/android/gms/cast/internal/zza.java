package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p243q4.C10920a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C7169a();

    /* renamed from: b */
    private final String f28831b;

    public zza() {
        this.f28831b = null;
    }

    /* renamed from: C0 */
    public final String mo29620C0() {
        return this.f28831b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zza)) {
            return false;
        }
        return C10920a.m49143f(this.f28831b, ((zza) obj).f28831b);
    }

    public final int hashCode() {
        return C7408m.m30029b(this.f28831b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f28831b, false);
        C11058b.m49516b(parcel, a);
    }

    zza(String str) {
        this.f28831b = str;
    }
}
