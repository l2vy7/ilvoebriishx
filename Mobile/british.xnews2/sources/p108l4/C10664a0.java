package p108l4;

/* renamed from: l4.a0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final /* synthetic */ class C10664a0 implements Runnable {

    /* renamed from: b */
    private final C10680g0 f49255b;

    /* renamed from: c */
    private final int f49256c;

    C10664a0(C10680g0 g0Var, int i) {
        this.f49255b = g0Var;
        this.f49256c = i;
    }

    public final void run() {
        C10680g0 g0Var = this.f49255b;
        int i = this.f49256c;
        if (i == 0) {
            int unused = g0Var.f49300b.f24282v = 2;
            boolean unused2 = g0Var.f49300b.f24263c = true;
            boolean unused3 = g0Var.f49300b.f24264d = true;
            synchronized (g0Var.f49300b.f24281u) {
                for (C10695o0 a : g0Var.f49300b.f24281u) {
                    a.mo42859a();
                }
            }
            return;
        }
        int unused4 = g0Var.f49300b.f24282v = 1;
        synchronized (g0Var.f49300b.f24281u) {
            for (C10695o0 b : g0Var.f49300b.f24281u) {
                b.mo42860b(i);
            }
        }
        g0Var.f49300b.m25037C();
    }
}
