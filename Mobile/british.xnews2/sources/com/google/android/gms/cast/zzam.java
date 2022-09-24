package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p108l4.C10688l;
import p243q4.C10920a;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzam> CREATOR = new C10688l();

    /* renamed from: b */
    private final zzak f28845b;

    /* renamed from: c */
    private final zzak f28846c;

    public zzam(zzak zzak, zzak zzak2) {
        this.f28845b = zzak;
        this.f28846c = zzak2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzam)) {
            return false;
        }
        zzam zzam = (zzam) obj;
        return C10920a.m49143f(this.f28845b, zzam.f28845b) && C10920a.m49143f(this.f28846c, zzam.f28846c);
    }

    public final int hashCode() {
        return C7408m.m30029b(this.f28845b, this.f28846c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 2, this.f28845b, i, false);
        C11058b.m49535u(parcel, 3, this.f28846c, i, false);
        C11058b.m49516b(parcel, a);
    }
}
