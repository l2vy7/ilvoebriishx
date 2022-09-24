package androidx.lifecycle;

import androidx.lifecycle.C0769d;
import androidx.savedstate.C1220c;
import androidx.savedstate.SavedStateRegistry;

final class SavedStateHandleController implements C0773e {

    /* renamed from: a */
    private boolean f3821a;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    static final class C0763a implements SavedStateRegistry.C1216a {
        C0763a() {
        }

        /* renamed from: a */
        public void mo3970a(C1220c cVar) {
            if (cVar instanceof C0795t) {
                C0794s g = ((C0795t) cVar).mo643g();
                SavedStateRegistry i = cVar.mo644i();
                for (String b : g.mo4030c()) {
                    SavedStateHandleController.m4243h(g.mo4029b(b), i, cVar.mo639a());
                }
                if (!g.mo4030c().isEmpty()) {
                    i.mo5972e(C0763a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* renamed from: h */
    static void m4243h(C0789q qVar, SavedStateRegistry savedStateRegistry, C0769d dVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) qVar.mo4023c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo3969j()) {
            savedStateHandleController.mo3968i(savedStateRegistry, dVar);
            m4244k(savedStateRegistry, dVar);
        }
    }

    /* renamed from: k */
    private static void m4244k(final SavedStateRegistry savedStateRegistry, final C0769d dVar) {
        C0769d.C0772c b = dVar.mo3985b();
        if (b == C0769d.C0772c.INITIALIZED || b.mo3988a(C0769d.C0772c.STARTED)) {
            savedStateRegistry.mo5972e(C0763a.class);
        } else {
            dVar.mo3984a(new C0773e() {
                /* renamed from: c */
                public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
                    if (bVar == C0769d.C0771b.ON_START) {
                        C0769d.this.mo3986c(this);
                        savedStateRegistry.mo5972e(C0763a.class);
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
        if (bVar == C0769d.C0771b.ON_DESTROY) {
            this.f3821a = false;
            gVar.mo639a().mo3986c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3968i(SavedStateRegistry savedStateRegistry, C0769d dVar) {
        if (this.f3821a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3821a = true;
        dVar.mo3984a(this);
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo3969j() {
        return this.f3821a;
    }
}
