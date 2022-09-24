package p244q4;

import p109l4.C10657a;

/* renamed from: q4.h0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C10935h0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C10939j0 f49818b;

    /* renamed from: c */
    final /* synthetic */ String f49819c;

    /* renamed from: d */
    final /* synthetic */ String f49820d;

    C10935h0(C10937i0 i0Var, C10939j0 j0Var, String str, String str2) {
        this.f49818b = j0Var;
        this.f49819c = str;
        this.f49820d = str2;
    }

    public final void run() {
        C10657a.C10663e eVar;
        synchronized (this.f49818b.f49839e) {
            eVar = (C10657a.C10663e) this.f49818b.f49839e.get(this.f49819c);
        }
        if (eVar != null) {
            eVar.mo17836a(this.f49818b.f49837c, this.f49819c, this.f49820d);
            return;
        }
        C10939j0.f49834y.mo43190a("Discarded message for unknown namespace '%s'", this.f49819c);
    }
}
