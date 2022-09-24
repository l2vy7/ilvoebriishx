package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p109l4.C10686k;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new C10686k();

    /* renamed from: b */
    private final float f28842b;

    /* renamed from: c */
    private final float f28843c;

    /* renamed from: d */
    private final float f28844d;

    public zzak(float f, float f2, float f3) {
        this.f28842b = f;
        this.f28843c = f2;
        this.f28844d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzak)) {
            return false;
        }
        zzak zzak = (zzak) obj;
        return this.f28842b == zzak.f28842b && this.f28843c == zzak.f28843c && this.f28844d == zzak.f28844d;
    }

    public final int hashCode() {
        return C7408m.m30029b(Float.valueOf(this.f28842b), Float.valueOf(this.f28843c), Float.valueOf(this.f28844d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49524j(parcel, 2, this.f28842b);
        C11058b.m49524j(parcel, 3, this.f28843c);
        C11058b.m49524j(parcel, 4, this.f28844d);
        C11058b.m49516b(parcel, a);
    }
}
