package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.t5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9916t5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ AtomicReference f46746b;

    /* renamed from: c */
    final /* synthetic */ String f46747c;

    /* renamed from: d */
    final /* synthetic */ String f46748d;

    /* renamed from: e */
    final /* synthetic */ C9779g6 f46749e;

    C9916t5(C9779g6 g6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f46749e = g6Var;
        this.f46746b = atomicReference;
        this.f46747c = str2;
        this.f46748d = str3;
    }

    public final void run() {
        this.f46749e.f21269a.mo19370L().mo39214U(this.f46746b, (String) null, this.f46747c, this.f46748d);
    }
}
