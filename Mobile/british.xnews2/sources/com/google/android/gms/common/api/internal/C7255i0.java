package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7255i0 extends C7228c1 {

    /* renamed from: b */
    final /* synthetic */ ConnectionResult f29021b;

    /* renamed from: c */
    final /* synthetic */ C7267k0 f29022c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7255i0(C7267k0 k0Var, C7222b1 b1Var, ConnectionResult connectionResult) {
        super(b1Var);
        this.f29022c = k0Var;
        this.f29021b = connectionResult;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo29838a() {
        this.f29022c.f29037d.m29761k(this.f29021b);
    }
}
