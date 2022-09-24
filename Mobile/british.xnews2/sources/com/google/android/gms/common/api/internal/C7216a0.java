package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.C7190a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4604n;
import p149t.C6079b;

/* renamed from: com.google.android.gms.common.api.internal.a0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7216a0 extends C7248g3 {

    /* renamed from: f */
    private final C6079b<C7220b<?>> f28936f = new C6079b<>();

    /* renamed from: g */
    private final C4595g f28937g;

    C7216a0(C7254i iVar, C4595g gVar, C7190a aVar) {
        super(iVar, aVar);
        this.f28937g = gVar;
        this.mLifecycleFragment.mo29868b("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: j */
    public static void m29566j(Activity activity, C4595g gVar, C7220b<?> bVar) {
        C7254i fragment = LifecycleCallback.getFragment(activity);
        C7216a0 a0Var = (C7216a0) fragment.mo29869f("ConnectionlessLifecycleHelper", C7216a0.class);
        if (a0Var == null) {
            a0Var = new C7216a0(fragment, gVar, C7190a.m29483q());
        }
        C4604n.m20099l(bVar, "ApiKey cannot be null");
        a0Var.f28936f.add(bVar);
        gVar.mo17934d(a0Var);
    }

    /* renamed from: k */
    private final void m29567k() {
        if (!this.f28936f.isEmpty()) {
            this.f28937g.mo17934d(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29807b(ConnectionResult connectionResult, int i) {
        this.f28937g.mo17931K(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo29808c() {
        this.f28937g.mo17932b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C6079b<C7220b<?>> mo29809i() {
        return this.f28936f;
    }

    public final void onResume() {
        super.onResume();
        m29567k();
    }

    public final void onStart() {
        super.onStart();
        m29567k();
    }

    public final void onStop() {
        super.onStop();
        this.f28937g.mo17935e(this);
    }
}
