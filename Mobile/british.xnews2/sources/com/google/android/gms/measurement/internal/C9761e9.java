package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9186i1;

/* renamed from: com.google.android.gms.measurement.internal.e9 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
final class C9761e9 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9186i1 f46243b;

    /* renamed from: c */
    final /* synthetic */ String f46244c;

    /* renamed from: d */
    final /* synthetic */ String f46245d;

    /* renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f46246e;

    C9761e9(AppMeasurementDynamiteService appMeasurementDynamiteService, C9186i1 i1Var, String str, String str2) {
        this.f46246e = appMeasurementDynamiteService;
        this.f46243b = i1Var;
        this.f46244c = str;
        this.f46245d = str2;
    }

    public final void run() {
        this.f46246e.f21267b.mo19370L().mo39213T(this.f46243b, this.f46244c, this.f46245d);
    }
}
