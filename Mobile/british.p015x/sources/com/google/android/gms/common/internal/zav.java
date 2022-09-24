package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7395i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C7403k0();

    /* renamed from: b */
    final int f29384b;

    /* renamed from: c */
    final IBinder f29385c;

    /* renamed from: d */
    private final ConnectionResult f29386d;

    /* renamed from: e */
    private final boolean f29387e;

    /* renamed from: f */
    private final boolean f29388f;

    zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f29384b = i;
        this.f29385c = iBinder;
        this.f29386d = connectionResult;
        this.f29387e = z;
        this.f29388f = z2;
    }

    /* renamed from: C0 */
    public final ConnectionResult mo30179C0() {
        return this.f29386d;
    }

    /* renamed from: D0 */
    public final C7395i mo30180D0() {
        IBinder iBinder = this.f29385c;
        if (iBinder == null) {
            return null;
        }
        return C7395i.C7396a.m30009b2(iBinder);
    }

    /* renamed from: E0 */
    public final boolean mo30181E0() {
        return this.f29387e;
    }

    /* renamed from: F0 */
    public final boolean mo30182F0() {
        return this.f29388f;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zav = (zav) obj;
        return this.f29386d.equals(zav.f29386d) && C7408m.m30028a(mo30180D0(), zav.mo30180D0());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f29384b);
        C11058b.m49526l(parcel, 2, this.f29385c, false);
        C11058b.m49535u(parcel, 3, this.f29386d, i, false);
        C11058b.m49517c(parcel, 4, this.f29387e);
        C11058b.m49517c(parcel, 5, this.f29388f);
        C11058b.m49516b(parcel, a);
    }
}
