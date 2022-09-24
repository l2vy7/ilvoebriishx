package p109l4;

import p109l4.C10657a;

/* renamed from: l4.f0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final /* synthetic */ class C10677f0 implements Runnable {

    /* renamed from: b */
    private final C10680g0 f49289b;

    /* renamed from: c */
    private final String f49290c;

    /* renamed from: d */
    private final String f49291d;

    C10677f0(C10680g0 g0Var, String str, String str2) {
        this.f49289b = g0Var;
        this.f49290c = str;
        this.f49291d = str2;
    }

    public final void run() {
        C10657a.C10663e eVar;
        C10680g0 g0Var = this.f49289b;
        String str = this.f49290c;
        String str2 = this.f49291d;
        synchronized (g0Var.f49300b.f24279s) {
            eVar = g0Var.f49300b.f24279s.get(str);
        }
        if (eVar != null) {
            eVar.mo17836a(g0Var.f49300b.f24277q, str, str2);
            return;
        }
        C5675h0.f24257w.mo43190a("Discarded message for unknown namespace '%s'", str);
    }
}
