package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9739c7 extends C9826l {

    /* renamed from: e */
    final /* synthetic */ C9918t7 f46201e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9739c7(C9918t7 t7Var, C9747d5 d5Var) {
        super(d5Var);
        this.f46201e = t7Var;
    }

    /* renamed from: c */
    public final void mo38885c() {
        C9918t7 t7Var = this.f46201e;
        t7Var.mo19272b();
        if (t7Var.mo39228z()) {
            t7Var.f21269a.mo19276j().mo19286v().mo38856a("Inactivity, disconnecting from the service");
            t7Var.mo39210Q();
        }
    }
}
