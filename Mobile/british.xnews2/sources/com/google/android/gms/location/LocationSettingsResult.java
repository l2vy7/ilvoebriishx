package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p250s5.C10978i;
import p256v4.C11058b;

public final class LocationSettingsResult extends AbstractSafeParcelable implements C7341k {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new C10978i();

    /* renamed from: b */
    private final Status f46100b;

    /* renamed from: c */
    private final LocationSettingsStates f46101c;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f46100b = status;
        this.f46101c = locationSettingsStates;
    }

    /* renamed from: C0 */
    public final LocationSettingsStates mo38727C0() {
        return this.f46101c;
    }

    /* renamed from: p0 */
    public final Status mo29527p0() {
        return this.f46100b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 1, mo29527p0(), i, false);
        C11058b.m49535u(parcel, 2, mo38727C0(), i, false);
        C11058b.m49516b(parcel, a);
    }
}
