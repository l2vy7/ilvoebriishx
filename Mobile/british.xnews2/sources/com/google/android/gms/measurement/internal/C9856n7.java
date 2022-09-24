package com.google.android.gms.measurement.internal;

import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.n7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9856n7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C11030e f46516b;

    /* renamed from: c */
    final /* synthetic */ C9908s7 f46517c;

    C9856n7(C9908s7 s7Var, C11030e eVar) {
        this.f46517c = s7Var;
        this.f46516b = eVar;
    }

    public final void run() {
        synchronized (this.f46517c) {
            this.f46517c.f46735b = false;
            if (!this.f46517c.f46737d.mo39228z()) {
                this.f46517c.f46737d.f21269a.mo19276j().mo19286v().mo38856a("Connected to service");
                this.f46517c.f46737d.mo39226x(this.f46516b);
            }
        }
    }
}
