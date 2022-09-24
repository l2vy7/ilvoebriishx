package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
final class C9802i8 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9782g9 f46368b;

    /* renamed from: c */
    final /* synthetic */ AppMeasurementDynamiteService f46369c;

    C9802i8(AppMeasurementDynamiteService appMeasurementDynamiteService, C9782g9 g9Var) {
        this.f46369c = appMeasurementDynamiteService;
        this.f46368b = g9Var;
    }

    public final void run() {
        this.f46369c.f21267b.mo19367I().mo38930I(this.f46368b);
    }
}
