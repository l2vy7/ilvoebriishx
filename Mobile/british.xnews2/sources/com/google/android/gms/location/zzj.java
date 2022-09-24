package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C9703k();

    /* renamed from: b */
    private boolean f46122b;

    /* renamed from: c */
    private long f46123c;

    /* renamed from: d */
    private float f46124d;

    /* renamed from: e */
    private long f46125e;

    /* renamed from: f */
    private int f46126f;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    zzj(boolean z, long j, float f, long j2, int i) {
        this.f46122b = z;
        this.f46123c = j;
        this.f46124d = f;
        this.f46125e = j2;
        this.f46126f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f46122b == zzj.f46122b && this.f46123c == zzj.f46123c && Float.compare(this.f46124d, zzj.f46124d) == 0 && this.f46125e == zzj.f46125e && this.f46126f == zzj.f46126f;
    }

    public final int hashCode() {
        return C7408m.m30029b(Boolean.valueOf(this.f46122b), Long.valueOf(this.f46123c), Float.valueOf(this.f46124d), Long.valueOf(this.f46125e), Integer.valueOf(this.f46126f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f46122b);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f46123c);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f46124d);
        long j = this.f46125e;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f46126f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f46126f);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 1, this.f46122b);
        C11058b.m49531q(parcel, 2, this.f46123c);
        C11058b.m49524j(parcel, 3, this.f46124d);
        C11058b.m49531q(parcel, 4, this.f46125e);
        C11058b.m49527m(parcel, 5, this.f46126f);
        C11058b.m49516b(parcel, a);
    }
}
