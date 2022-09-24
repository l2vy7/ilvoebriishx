package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9186i1;

/* renamed from: com.google.android.gms.measurement.internal.j6 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
final class C9811j6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9186i1 f46380b;

    /* renamed from: c */
    final /* synthetic */ zzau f46381c;

    /* renamed from: d */
    final /* synthetic */ String f46382d;

    /* renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f46383e;

    C9811j6(AppMeasurementDynamiteService appMeasurementDynamiteService, C9186i1 i1Var, zzau zzau, String str) {
        this.f46383e = appMeasurementDynamiteService;
        this.f46380b = i1Var;
        this.f46381c = zzau;
        this.f46382d = str;
    }

    public final void run() {
        this.f46383e.f21267b.mo19370L().mo39218o(this.f46380b, this.f46381c, this.f46382d);
    }
}
