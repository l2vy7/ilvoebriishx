package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0769d;

/* renamed from: androidx.savedstate.b */
/* compiled from: SavedStateRegistryController */
public final class C1219b {

    /* renamed from: a */
    private final C1220c f5542a;

    /* renamed from: b */
    private final SavedStateRegistry f5543b = new SavedStateRegistry();

    private C1219b(C1220c cVar) {
        this.f5542a = cVar;
    }

    /* renamed from: a */
    public static C1219b m6649a(C1220c cVar) {
        return new C1219b(cVar);
    }

    /* renamed from: b */
    public SavedStateRegistry mo5973b() {
        return this.f5543b;
    }

    /* renamed from: c */
    public void mo5974c(Bundle bundle) {
        C0769d a = this.f5542a.mo639a();
        if (a.mo3985b() == C0769d.C0772c.INITIALIZED) {
            a.mo3984a(new Recreator(this.f5542a));
            this.f5543b.mo5969b(a, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void mo5975d(Bundle bundle) {
        this.f5543b.mo5970c(bundle);
    }
}
