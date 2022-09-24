package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0776h;
import androidx.savedstate.C1219b;
import androidx.savedstate.C1220c;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.fragment.app.u */
/* compiled from: FragmentViewLifecycleOwner */
class C0741u implements C1220c {

    /* renamed from: b */
    private C0776h f3746b = null;

    /* renamed from: c */
    private C1219b f3747c = null;

    C0741u() {
    }

    /* renamed from: a */
    public C0769d mo639a() {
        mo3910d();
        return this.f3746b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3909b(C0769d.C0771b bVar) {
        this.f3746b.mo3989h(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3910d() {
        if (this.f3746b == null) {
            this.f3746b = new C0776h(this);
            this.f3747c = C1219b.m6649a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo3911e() {
        return this.f3746b != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3912f(Bundle bundle) {
        this.f3747c.mo5974c(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3913g(Bundle bundle) {
        this.f3747c.mo5975d(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3914h(C0769d.C0772c cVar) {
        this.f3746b.mo3991o(cVar);
    }

    /* renamed from: i */
    public SavedStateRegistry mo644i() {
        return this.f3747c.mo5973b();
    }
}
