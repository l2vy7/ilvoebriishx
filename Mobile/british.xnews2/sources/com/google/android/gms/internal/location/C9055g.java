package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C7259j;
import p250s5.C10974e;
import p250s5.C10993x;

/* renamed from: com.google.android.gms.internal.location.g */
final class C9055g extends C10993x {

    /* renamed from: b */
    private final C7259j<C10974e> f44843b;

    public final synchronized void onLocationChanged(Location location) {
        this.f44843b.mo29875c(new C9056h(this, location));
    }
}
