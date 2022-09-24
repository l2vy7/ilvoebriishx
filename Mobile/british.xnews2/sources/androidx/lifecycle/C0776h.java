package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0769d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p109m.C5676a;
import p115n.C5761a;
import p115n.C5762b;

/* renamed from: androidx.lifecycle.h */
/* compiled from: LifecycleRegistry */
public class C0776h extends C0769d {

    /* renamed from: b */
    private C5761a<C0774f, C0777a> f3841b;

    /* renamed from: c */
    private C0769d.C0772c f3842c;

    /* renamed from: d */
    private final WeakReference<C0775g> f3843d;

    /* renamed from: e */
    private int f3844e;

    /* renamed from: f */
    private boolean f3845f;

    /* renamed from: g */
    private boolean f3846g;

    /* renamed from: h */
    private ArrayList<C0769d.C0772c> f3847h;

    /* renamed from: i */
    private final boolean f3848i;

    /* renamed from: androidx.lifecycle.h$a */
    /* compiled from: LifecycleRegistry */
    static class C0777a {

        /* renamed from: a */
        C0769d.C0772c f3849a;

        /* renamed from: b */
        C0773e f3850b;

        C0777a(C0774f fVar, C0769d.C0772c cVar) {
            this.f3850b = C0779j.m4298f(fVar);
            this.f3849a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3992a(C0775g gVar, C0769d.C0771b bVar) {
            C0769d.C0772c d = bVar.mo3987d();
            this.f3849a = C0776h.m4280k(this.f3849a, d);
            this.f3850b.mo660c(gVar, bVar);
            this.f3849a = d;
        }
    }

    public C0776h(C0775g gVar) {
        this(gVar, true);
    }

    /* renamed from: d */
    private void m4275d(C0775g gVar) {
        Iterator<Map.Entry<C0774f, C0777a>> descendingIterator = this.f3841b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f3846g) {
            Map.Entry next = descendingIterator.next();
            C0777a aVar = (C0777a) next.getValue();
            while (aVar.f3849a.compareTo(this.f3842c) > 0 && !this.f3846g && this.f3841b.contains(next.getKey())) {
                C0769d.C0771b a = C0769d.C0771b.m4269a(aVar.f3849a);
                if (a != null) {
                    m4283n(a.mo3987d());
                    aVar.mo3992a(gVar, a);
                    m4282m();
                } else {
                    throw new IllegalStateException("no event down from " + aVar.f3849a);
                }
            }
        }
    }

    /* renamed from: e */
    private C0769d.C0772c m4276e(C0774f fVar) {
        Map.Entry<C0774f, C0777a> q = this.f3841b.mo22568q(fVar);
        C0769d.C0772c cVar = null;
        C0769d.C0772c cVar2 = q != null ? q.getValue().f3849a : null;
        if (!this.f3847h.isEmpty()) {
            ArrayList<C0769d.C0772c> arrayList = this.f3847h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return m4280k(m4280k(this.f3842c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    private void m4277f(String str) {
        if (this.f3848i && !C5676a.m25078e().mo22374b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: g */
    private void m4278g(C0775g gVar) {
        C5762b<K, V>.d f = this.f3841b.mo22572f();
        while (f.hasNext() && !this.f3846g) {
            Map.Entry entry = (Map.Entry) f.next();
            C0777a aVar = (C0777a) entry.getValue();
            while (aVar.f3849a.compareTo(this.f3842c) < 0 && !this.f3846g && this.f3841b.contains(entry.getKey())) {
                m4283n(aVar.f3849a);
                C0769d.C0771b i = C0769d.C0771b.m4270i(aVar.f3849a);
                if (i != null) {
                    aVar.mo3992a(gVar, i);
                    m4282m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3849a);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m4279i() {
        if (this.f3841b.size() == 0) {
            return true;
        }
        C0769d.C0772c cVar = this.f3841b.mo22569c().getValue().f3849a;
        C0769d.C0772c cVar2 = this.f3841b.mo22573g().getValue().f3849a;
        if (cVar == cVar2 && this.f3842c == cVar2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    static C0769d.C0772c m4280k(C0769d.C0772c cVar, C0769d.C0772c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: l */
    private void m4281l(C0769d.C0772c cVar) {
        if (this.f3842c != cVar) {
            this.f3842c = cVar;
            if (this.f3845f || this.f3844e != 0) {
                this.f3846g = true;
                return;
            }
            this.f3845f = true;
            m4284p();
            this.f3845f = false;
        }
    }

    /* renamed from: m */
    private void m4282m() {
        ArrayList<C0769d.C0772c> arrayList = this.f3847h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private void m4283n(C0769d.C0772c cVar) {
        this.f3847h.add(cVar);
    }

    /* renamed from: p */
    private void m4284p() {
        C0775g gVar = (C0775g) this.f3843d.get();
        if (gVar != null) {
            while (!m4279i()) {
                this.f3846g = false;
                if (this.f3842c.compareTo(this.f3841b.mo22569c().getValue().f3849a) < 0) {
                    m4275d(gVar);
                }
                Map.Entry<C0774f, C0777a> g = this.f3841b.mo22573g();
                if (!this.f3846g && g != null && this.f3842c.compareTo(g.getValue().f3849a) > 0) {
                    m4278g(gVar);
                }
            }
            this.f3846g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: a */
    public void mo3984a(C0774f fVar) {
        C0775g gVar;
        m4277f("addObserver");
        C0769d.C0772c cVar = this.f3842c;
        C0769d.C0772c cVar2 = C0769d.C0772c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = C0769d.C0772c.INITIALIZED;
        }
        C0777a aVar = new C0777a(fVar, cVar2);
        if (this.f3841b.mo22566i(fVar, aVar) == null && (gVar = (C0775g) this.f3843d.get()) != null) {
            boolean z = this.f3844e != 0 || this.f3845f;
            C0769d.C0772c e = m4276e(fVar);
            this.f3844e++;
            while (aVar.f3849a.compareTo(e) < 0 && this.f3841b.contains(fVar)) {
                m4283n(aVar.f3849a);
                C0769d.C0771b i = C0769d.C0771b.m4270i(aVar.f3849a);
                if (i != null) {
                    aVar.mo3992a(gVar, i);
                    m4282m();
                    e = m4276e(fVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3849a);
                }
            }
            if (!z) {
                m4284p();
            }
            this.f3844e--;
        }
    }

    /* renamed from: b */
    public C0769d.C0772c mo3985b() {
        return this.f3842c;
    }

    /* renamed from: c */
    public void mo3986c(C0774f fVar) {
        m4277f("removeObserver");
        this.f3841b.mo22567j(fVar);
    }

    /* renamed from: h */
    public void mo3989h(C0769d.C0771b bVar) {
        m4277f("handleLifecycleEvent");
        m4281l(bVar.mo3987d());
    }

    @Deprecated
    /* renamed from: j */
    public void mo3990j(C0769d.C0772c cVar) {
        m4277f("markState");
        mo3991o(cVar);
    }

    /* renamed from: o */
    public void mo3991o(C0769d.C0772c cVar) {
        m4277f("setCurrentState");
        m4281l(cVar);
    }

    private C0776h(C0775g gVar, boolean z) {
        this.f3841b = new C5761a<>();
        this.f3844e = 0;
        this.f3845f = false;
        this.f3846g = false;
        this.f3847h = new ArrayList<>();
        this.f3843d = new WeakReference<>(gVar);
        this.f3842c = C0769d.C0772c.INITIALIZED;
        this.f3848i = z;
    }
}
