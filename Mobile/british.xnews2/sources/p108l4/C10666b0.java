package p108l4;

/* renamed from: l4.b0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final /* synthetic */ class C10666b0 implements Runnable {

    /* renamed from: b */
    private final C10680g0 f49257b;

    /* renamed from: c */
    private final int f49258c;

    C10666b0(C10680g0 g0Var, int i) {
        this.f49257b = g0Var;
        this.f49258c = i;
    }

    public final void run() {
        C10680g0 g0Var = this.f49257b;
        int i = this.f49258c;
        int unused = g0Var.f49300b.f24282v = 3;
        synchronized (g0Var.f49300b.f24281u) {
            for (C10695o0 c : g0Var.f49300b.f24281u) {
                c.mo42861c(i);
            }
        }
    }
}
