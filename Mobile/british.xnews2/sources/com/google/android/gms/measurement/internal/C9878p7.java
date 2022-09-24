package com.google.android.gms.measurement.internal;

import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.p7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9878p7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C11030e f46576b;

    /* renamed from: c */
    final /* synthetic */ C9908s7 f46577c;

    C9878p7(C9908s7 s7Var, C11030e eVar) {
        this.f46577c = s7Var;
        this.f46576b = eVar;
    }

    public final void run() {
        synchronized (this.f46577c) {
            this.f46577c.f46735b = false;
            if (!this.f46577c.f46737d.mo39228z()) {
                this.f46577c.f46737d.f21269a.mo19276j().mo19281p().mo38856a("Connected to remote service");
                this.f46577c.f46737d.mo39226x(this.f46576b);
            }
        }
    }
}
