package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p256v4.C11058b;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C9694b();

    /* renamed from: b */
    private int f46086b;

    /* renamed from: c */
    private long f46087c;

    /* renamed from: d */
    private long f46088d;

    /* renamed from: e */
    private boolean f46089e;

    /* renamed from: f */
    private long f46090f;

    /* renamed from: g */
    private int f46091g;

    /* renamed from: h */
    private float f46092h;

    /* renamed from: i */
    private long f46093i;

    public LocationRequest() {
        this.f46086b = 102;
        this.f46087c = 3600000;
        this.f46088d = 600000;
        this.f46089e = false;
        this.f46090f = Long.MAX_VALUE;
        this.f46091g = Integer.MAX_VALUE;
        this.f46092h = 0.0f;
        this.f46093i = 0;
    }

    LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f46086b = i;
        this.f46087c = j;
        this.f46088d = j2;
        this.f46089e = z;
        this.f46090f = j3;
        this.f46091g = i2;
        this.f46092h = f;
        this.f46093i = j4;
    }

    /* renamed from: C0 */
    public final long mo38716C0() {
        long j = this.f46093i;
        long j2 = this.f46087c;
        return j < j2 ? j2 : j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f46086b == locationRequest.f46086b && this.f46087c == locationRequest.f46087c && this.f46088d == locationRequest.f46088d && this.f46089e == locationRequest.f46089e && this.f46090f == locationRequest.f46090f && this.f46091g == locationRequest.f46091g && this.f46092h == locationRequest.f46092h && mo38716C0() == locationRequest.mo38716C0();
    }

    public final int hashCode() {
        return C7408m.m30029b(Integer.valueOf(this.f46086b), Long.valueOf(this.f46087c), Float.valueOf(this.f46092h), Long.valueOf(this.f46093i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f46086b;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f46086b != 105) {
            sb.append(" requested=");
            sb.append(this.f46087c);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f46088d);
        sb.append("ms");
        if (this.f46093i > this.f46087c) {
            sb.append(" maxWait=");
            sb.append(this.f46093i);
            sb.append("ms");
        }
        if (this.f46092h > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f46092h);
            sb.append("m");
        }
        long j = this.f46090f;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f46091g != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f46091g);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f46086b);
        C11058b.m49531q(parcel, 2, this.f46087c);
        C11058b.m49531q(parcel, 3, this.f46088d);
        C11058b.m49517c(parcel, 4, this.f46089e);
        C11058b.m49531q(parcel, 5, this.f46090f);
        C11058b.m49527m(parcel, 6, this.f46091g);
        C11058b.m49524j(parcel, 7, this.f46092h);
        C11058b.m49531q(parcel, 8, this.f46093i);
        C11058b.m49516b(parcel, a);
    }
}
