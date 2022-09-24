package androidx.lifecycle;

import androidx.lifecycle.C0769d;

class CompositeGeneratedAdaptersObserver implements C0773e {

    /* renamed from: a */
    private final C0768c[] f3794a;

    CompositeGeneratedAdaptersObserver(C0768c[] cVarArr) {
        this.f3794a = cVarArr;
    }

    /* renamed from: c */
    public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
        C0780k kVar = new C0780k();
        for (C0768c a : this.f3794a) {
            a.mo3983a(gVar, bVar, false, kVar);
        }
        for (C0768c a2 : this.f3794a) {
            a2.mo3983a(gVar, bVar, true, kVar);
        }
    }
}
