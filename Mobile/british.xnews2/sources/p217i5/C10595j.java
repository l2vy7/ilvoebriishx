package p217i5;

import p006a5.C6486h;

/* renamed from: i5.j */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
final class C10595j implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C10597l f49137b;

    /* synthetic */ C10595j(C10597l lVar, C10594i iVar) {
        this.f49137b = lVar;
    }

    public final void run() {
        long a = this.f49137b.mo42711a();
        if (a != -1 && C6486h.m28261b().currentTimeMillis() > a) {
            C10597l.m48340e(this.f49137b.f49139a);
        }
    }
}
