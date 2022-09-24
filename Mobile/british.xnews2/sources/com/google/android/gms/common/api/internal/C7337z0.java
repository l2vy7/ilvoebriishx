package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.z0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7337z0 extends C7307s1 {

    /* renamed from: a */
    private final WeakReference<C7217a1> f29204a;

    C7337z0(C7217a1 a1Var) {
        this.f29204a = new WeakReference<>(a1Var);
    }

    /* renamed from: a */
    public final void mo29854a() {
        C7217a1 a1Var = (C7217a1) this.f29204a.get();
        if (a1Var != null) {
            C7217a1.m29578y(a1Var);
        }
    }
}
