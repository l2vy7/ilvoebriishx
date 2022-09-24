package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;
import p267y5.C11107a;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7281n0 extends C11107a {

    /* renamed from: b */
    private final WeakReference<C7306s0> f29074b;

    C7281n0(C7306s0 s0Var) {
        this.f29074b = new WeakReference<>(s0Var);
    }

    /* renamed from: D1 */
    public final void mo29897D1(zak zak) {
        C7306s0 s0Var = (C7306s0) this.f29074b.get();
        if (s0Var != null) {
            s0Var.f29106a.mo17920o(new C7277m0(this, s0Var, s0Var, zak));
        }
    }
}
