package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import p255u5.C11027b;

/* renamed from: com.google.android.gms.measurement.internal.s4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9905s4 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzp f46730b;

    /* renamed from: c */
    final /* synthetic */ C9716a5 f46731c;

    C9905s4(C9716a5 a5Var, zzp zzp) {
        this.f46731c = a5Var;
        this.f46730b = zzp;
    }

    public final void run() {
        this.f46731c.f46149b.mo39285a();
        C9958x8 m6 = this.f46731c.f46149b;
        zzp zzp = this.f46730b;
        m6.mo19273e().mo19272b();
        m6.mo39286b();
        C4604n.m20094g(zzp.f46948b);
        C11027b b = C11027b.m49402b(zzp.f46969w);
        C11027b U = m6.mo39279U(zzp.f46948b);
        m6.mo19276j().mo19286v().mo38858c("Setting consent, package, consent", zzp.f46948b, b);
        m6.mo39313z(zzp.f46948b, b);
        if (b.mo43339k(U)) {
            m6.mo39308u(zzp);
        }
    }
}
