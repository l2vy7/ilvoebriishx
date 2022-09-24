package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C9990e();

    /* renamed from: b */
    final int f47009b;

    /* renamed from: c */
    private final ConnectionResult f47010c;

    /* renamed from: d */
    private final zav f47011d;

    zak(int i, ConnectionResult connectionResult, zav zav) {
        this.f47009b = i;
        this.f47010c = connectionResult;
        this.f47011d = zav;
    }

    /* renamed from: C0 */
    public final ConnectionResult mo39397C0() {
        return this.f47010c;
    }

    /* renamed from: D0 */
    public final zav mo39398D0() {
        return this.f47011d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 1, this.f47009b);
        C11058b.m49535u(parcel, 2, this.f47010c, i, false);
        C11058b.m49535u(parcel, 3, this.f47011d, i, false);
        C11058b.m49516b(parcel, a);
    }
}
