package com.google.android.gms.internal.cast;

import com.google.android.gms.common.internal.C4604n;
import p115m4.C10775p;
import p115m4.C10779r;
import p115m4.C5759d;

/* renamed from: com.google.android.gms.internal.cast.q3 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C8696q3 implements C10779r<C5759d> {

    /* renamed from: a */
    final /* synthetic */ C4643r4 f43917a;

    /* synthetic */ C8696q3(C4643r4 r4Var, C8679p2 p2Var) {
        this.f43917a = r4Var;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9070a(C10775p pVar) {
        C5759d dVar = (C5759d) pVar;
        if (this.f43917a.f21195f != null) {
            C4643r4.f21189g.mo43195f("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.f43917a.m21358q(dVar);
        this.f43917a.f21190a.mo19116b(this.f43917a.f21191b.mo19122a(this.f43917a.f21195f), C8435a5.APP_SESSION_STARTING);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9071b(C10775p pVar, int i) {
        C4643r4.m21352j(this.f43917a, (C5759d) pVar, i);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo9072h(C10775p pVar, int i) {
        C4643r4.m21352j(this.f43917a, (C5759d) pVar, i);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo9073i(C10775p pVar, boolean z) {
        this.f43917a.m21359r((C5759d) pVar);
        C4604n.m20098k(this.f43917a.f21195f);
        this.f43917a.f21190a.mo19116b(this.f43917a.f21191b.mo19124c(this.f43917a.f21195f, z), C8435a5.APP_SESSION_RESUMED);
        this.f43917a.f21195f.mo36728c(this.f43917a.f21194e);
        this.f43917a.m21356o();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo9074j(C10775p pVar, int i) {
        C4643r4.m21352j(this.f43917a, (C5759d) pVar, i);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo9075k(C10775p pVar) {
        C5759d dVar = (C5759d) pVar;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ void mo9076m(C10775p pVar, String str) {
        C5759d dVar = (C5759d) pVar;
        C4643r4 r4Var = this.f43917a;
        C4643r4.m21354l(r4Var, r4Var.f21194e, str);
        C4604n.m20098k(this.f43917a.f21195f);
        this.f43917a.f21190a.mo19116b(this.f43917a.f21191b.mo19123b(this.f43917a.f21195f), C8435a5.APP_SESSION_RESUMING);
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo9077n(C10775p pVar, String str) {
        this.f43917a.m21359r((C5759d) pVar);
        this.f43917a.f21195f.f43987f = str;
        this.f43917a.f21190a.mo19116b(this.f43917a.f21191b.mo19122a(this.f43917a.f21195f), C8435a5.APP_SESSION_RUNNING);
        this.f43917a.f21195f.mo36728c(this.f43917a.f21194e);
        this.f43917a.m21356o();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ void mo9078o(C10775p pVar, int i) {
        this.f43917a.m21359r((C5759d) pVar);
        C4604n.m20098k(this.f43917a.f21195f);
        this.f43917a.f21190a.mo19116b(this.f43917a.f21191b.mo19125d(this.f43917a.f21195f, i), C8435a5.APP_SESSION_SUSPENDED);
        this.f43917a.f21195f.mo36728c(this.f43917a.f21194e);
        this.f43917a.m21357p();
    }
}
