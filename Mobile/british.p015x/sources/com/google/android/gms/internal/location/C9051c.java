package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C7259j;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p251s5.C10973d;
import p251s5.C10990u;

/* renamed from: com.google.android.gms.internal.location.c */
final class C9051c extends C10990u {

    /* renamed from: b */
    private final C7259j<C10973d> f44840b;

    /* renamed from: B4 */
    public final void mo37277B4(LocationResult locationResult) {
        this.f44840b.mo29875c(new C9052d(this, locationResult));
    }

    /* renamed from: u3 */
    public final void mo37278u3(LocationAvailability locationAvailability) {
        this.f44840b.mo29875c(new C9053e(this, locationAvailability));
    }
}
