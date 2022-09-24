package p109l4;

import com.google.android.gms.tasks.Task;

/* renamed from: l4.z */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final /* synthetic */ class C10712z implements Runnable {

    /* renamed from: b */
    private final C10680g0 f49338b;

    /* renamed from: c */
    private final int f49339c;

    C10712z(C10680g0 g0Var, int i) {
        this.f49338b = g0Var;
        this.f49339c = i;
    }

    public final void run() {
        C10680g0 g0Var = this.f49338b;
        int i = this.f49339c;
        C5675h0.m25059y(g0Var.f49300b);
        int unused = g0Var.f49300b.f24282v = 1;
        synchronized (g0Var.f49300b.f24281u) {
            for (C10695o0 d : g0Var.f49300b.f24281u) {
                d.mo42862d(i);
            }
        }
        g0Var.f49300b.m25037C();
        C5675h0 h0Var = g0Var.f49300b;
        Task unused2 = h0Var.m25036B(h0Var.f24261a);
    }
}
