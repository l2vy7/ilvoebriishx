package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final /* synthetic */ class C9778g5 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C9779g6 f46292b;

    public /* synthetic */ C9778g5(C9779g6 g6Var) {
        this.f46292b = g6Var;
    }

    public final void run() {
        C9779g6 g6Var = this.f46292b;
        g6Var.mo19272b();
        if (!g6Var.f21269a.mo19365F().f21342r.mo39052b()) {
            long a = g6Var.f21269a.mo19365F().f21343s.mo39075a();
            g6Var.f21269a.mo19365F().f21343s.mo39076b(1 + a);
            g6Var.f21269a.mo19392z();
            if (a >= 5) {
                g6Var.f21269a.mo19276j().mo19287w().mo38856a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                g6Var.f21269a.mo19365F().f21342r.mo39051a(true);
                return;
            }
            g6Var.f21269a.mo19380h();
            return;
        }
        g6Var.f21269a.mo19276j().mo19281p().mo38856a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
