package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.q7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9888q7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C9908s7 f46621b;

    C9888q7(C9908s7 s7Var) {
        this.f46621b = s7Var;
    }

    public final void run() {
        C9918t7 t7Var = this.f46621b.f46737d;
        Context r = t7Var.f21269a.mo19277r();
        this.f46621b.f46737d.f21269a.mo19275g();
        C9918t7.m45390M(t7Var, new ComponentName(r, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
