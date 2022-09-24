package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C7377d;
import com.google.android.gms.common.internal.C7395i;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.q1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7298q1 implements C7377d.C7380c, C7274l2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7191a.C7201f f29094a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7220b<?> f29095b;

    /* renamed from: c */
    private C7395i f29096c = null;

    /* renamed from: d */
    private Set<Scope> f29097d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f29098e = false;

    /* renamed from: f */
    final /* synthetic */ C4595g f29099f;

    public C7298q1(C4595g gVar, C7191a.C7201f fVar, C7220b<?> bVar) {
        this.f29099f = gVar;
        this.f29094a = fVar;
        this.f29095b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m29735h() {
        C7395i iVar;
        if (this.f29098e && (iVar = this.f29096c) != null) {
            this.f29094a.getRemoteService(iVar, this.f29097d);
        }
    }

    /* renamed from: a */
    public final void mo29866a(ConnectionResult connectionResult) {
        this.f29099f.f20009q.post(new C7293p1(this, connectionResult));
    }

    /* renamed from: b */
    public final void mo29895b(ConnectionResult connectionResult) {
        C4596m1 m1Var = (C4596m1) this.f29099f.f20005m.get(this.f29095b);
        if (m1Var != null) {
            m1Var.mo17946G(connectionResult);
        }
    }

    /* renamed from: c */
    public final void mo29896c(C7395i iVar, Set<Scope> set) {
        if (iVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo29895b(new ConnectionResult(4));
            return;
        }
        this.f29096c = iVar;
        this.f29097d = set;
        m29735h();
    }
}
