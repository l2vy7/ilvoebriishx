package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p249s4.C10969b;
import p256v4.C11058b;

public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C10969b();

    /* renamed from: b */
    private final boolean f28848b;

    /* renamed from: c */
    private final long f28849c;

    /* renamed from: d */
    private final long f28850d;

    public zzc(boolean z, long j, long j2) {
        this.f28848b = z;
        this.f28849c = j;
        this.f28850d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzc) {
            zzc zzc = (zzc) obj;
            return this.f28848b == zzc.f28848b && this.f28849c == zzc.f28849c && this.f28850d == zzc.f28850d;
        }
    }

    public final int hashCode() {
        return C7408m.m30029b(Boolean.valueOf(this.f28848b), Long.valueOf(this.f28849c), Long.valueOf(this.f28850d));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f28848b + ",collectForDebugStartTimeMillis: " + this.f28849c + ",collectForDebugExpiryTimeMillis: " + this.f28850d + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 1, this.f28848b);
        C11058b.m49531q(parcel, 2, this.f28850d);
        C11058b.m49531q(parcel, 3, this.f28849c);
        C11058b.m49516b(parcel, a);
    }
}
