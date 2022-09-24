package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9186i1;

/* renamed from: com.google.android.gms.measurement.internal.f9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
final class C9771f9 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9186i1 f46274b;

    /* renamed from: c */
    final /* synthetic */ AppMeasurementDynamiteService f46275c;

    C9771f9(AppMeasurementDynamiteService appMeasurementDynamiteService, C9186i1 i1Var) {
        this.f46275c = appMeasurementDynamiteService;
        this.f46274b = i1Var;
    }

    public final void run() {
        this.f46275c.f21267b.mo19372N().mo19292C(this.f46274b, this.f46275c.f21267b.mo19384m());
    }
}
