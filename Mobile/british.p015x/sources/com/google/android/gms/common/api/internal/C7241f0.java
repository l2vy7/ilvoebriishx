package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4604n;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.f0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7241f0 implements C7222b1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4594e1 f29004a;

    /* renamed from: b */
    private boolean f29005b = false;

    public C7241f0(C4594e1 e1Var) {
        this.f29004a = e1Var;
    }

    /* renamed from: a */
    public final void mo17964a(Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo17965b() {
        if (this.f29005b) {
            this.f29005b = false;
            this.f29004a.mo17920o(new C7237e0(this, this));
        }
    }

    /* renamed from: c */
    public final void mo17966c(ConnectionResult connectionResult, C7191a<?> aVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo17967d(int i) {
        this.f29004a.mo17919n((ConnectionResult) null);
        this.f29004a.f19989p.mo29812b(i, this.f29005b);
    }

    /* renamed from: e */
    public final void mo17968e() {
    }

    /* renamed from: f */
    public final boolean mo17969f() {
        if (this.f29005b) {
            return false;
        }
        Set<C7308s2> set = this.f29004a.f19988o.f28959w;
        if (set == null || set.isEmpty()) {
            this.f29004a.mo17919n((ConnectionResult) null);
            return true;
        }
        this.f29005b = true;
        for (C7308s2 f : set) {
            f.mo29925f();
        }
        return false;
    }

    /* renamed from: g */
    public final <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T mo17970g(T t) {
        try {
            this.f29004a.f19988o.f28960x.mo29946a(t);
            C7217a1 a1Var = this.f29004a.f19988o;
            C7191a.C7201f fVar = a1Var.f28951o.get(t.mo29845s());
            C4604n.m20099l(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f29004a.f19981h.containsKey(t.mo29845s())) {
                t.mo29847u(fVar);
            } else {
                t.mo29848w(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f29004a.mo17920o(new C7232d0(this, this));
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo29855i() {
        if (this.f29005b) {
            this.f29005b = false;
            this.f29004a.f19988o.f28960x.mo29947b();
            mo17969f();
        }
    }
}
