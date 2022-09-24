package androidx.lifecycle;

import androidx.lifecycle.C0764a;
import androidx.lifecycle.C0769d;

class ReflectiveGenericLifecycleObserver implements C0773e {

    /* renamed from: a */
    private final Object f3819a;

    /* renamed from: b */
    private final C0764a.C0765a f3820b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3819a = obj;
        this.f3820b = C0764a.f3825c.mo3971c(obj.getClass());
    }

    /* renamed from: c */
    public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
        this.f3820b.mo3973a(gVar, bVar, this.f3819a);
    }
}
