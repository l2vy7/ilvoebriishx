package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9186i1;

/* renamed from: com.google.android.gms.measurement.internal.l5 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
final class C9832l5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9186i1 f46437b;

    /* renamed from: c */
    final /* synthetic */ AppMeasurementDynamiteService f46438c;

    C9832l5(AppMeasurementDynamiteService appMeasurementDynamiteService, C9186i1 i1Var) {
        this.f46438c = appMeasurementDynamiteService;
        this.f46437b = i1Var;
    }

    public final void run() {
        this.f46438c.f21267b.mo19370L().mo39211R(this.f46437b);
    }
}
