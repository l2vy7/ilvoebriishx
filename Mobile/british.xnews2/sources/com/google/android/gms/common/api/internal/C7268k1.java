package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.k1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7268k1 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C7273l1 f29038b;

    C7268k1(C7273l1 l1Var) {
        this.f29038b = l1Var;
    }

    public final void run() {
        C4596m1 m1Var = this.f29038b.f29058a;
        m1Var.f20012c.disconnect(m1Var.f20012c.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
