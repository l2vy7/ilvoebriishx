package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p251s5.C10979j;
import p257v4.C11058b;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new C10979j();

    /* renamed from: b */
    private final boolean f46102b;

    /* renamed from: c */
    private final boolean f46103c;

    /* renamed from: d */
    private final boolean f46104d;

    /* renamed from: e */
    private final boolean f46105e;

    /* renamed from: f */
    private final boolean f46106f;

    /* renamed from: g */
    private final boolean f46107g;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f46102b = z;
        this.f46103c = z2;
        this.f46104d = z3;
        this.f46105e = z4;
        this.f46106f = z5;
        this.f46107g = z6;
    }

    /* renamed from: C0 */
    public final boolean mo38729C0() {
        return this.f46107g;
    }

    /* renamed from: D0 */
    public final boolean mo38730D0() {
        return this.f46104d;
    }

    /* renamed from: E0 */
    public final boolean mo38731E0() {
        return this.f46105e;
    }

    /* renamed from: F0 */
    public final boolean mo38732F0() {
        return this.f46102b;
    }

    /* renamed from: G0 */
    public final boolean mo38733G0() {
        return this.f46106f;
    }

    /* renamed from: H0 */
    public final boolean mo38734H0() {
        return this.f46103c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 1, mo38732F0());
        C11058b.m49517c(parcel, 2, mo38734H0());
        C11058b.m49517c(parcel, 3, mo38730D0());
        C11058b.m49517c(parcel, 4, mo38731E0());
        C11058b.m49517c(parcel, 5, mo38733G0());
        C11058b.m49517c(parcel, 6, mo38729C0());
        C11058b.m49516b(parcel, a);
    }
}
