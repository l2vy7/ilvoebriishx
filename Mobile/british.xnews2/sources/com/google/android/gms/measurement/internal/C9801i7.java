package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9186i1;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
final class C9801i7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9186i1 f46363b;

    /* renamed from: c */
    final /* synthetic */ String f46364c;

    /* renamed from: d */
    final /* synthetic */ String f46365d;

    /* renamed from: e */
    final /* synthetic */ boolean f46366e;

    /* renamed from: f */
    final /* synthetic */ AppMeasurementDynamiteService f46367f;

    C9801i7(AppMeasurementDynamiteService appMeasurementDynamiteService, C9186i1 i1Var, String str, String str2, boolean z) {
        this.f46367f = appMeasurementDynamiteService;
        this.f46363b = i1Var;
        this.f46364c = str;
        this.f46365d = str2;
        this.f46366e = z;
    }

    public final void run() {
        this.f46367f.f21267b.mo19370L().mo39215V(this.f46363b, this.f46364c, this.f46365d, this.f46366e);
    }
}
