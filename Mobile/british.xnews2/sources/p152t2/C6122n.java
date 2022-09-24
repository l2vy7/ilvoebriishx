package p152t2;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p004a3.C0066k;
import p168w2.C6306c;

/* renamed from: t2.n */
/* compiled from: RequestTracker */
public class C6122n {

    /* renamed from: a */
    private final Set<C6306c> f25370a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<C6306c> f25371b = new ArrayList();

    /* renamed from: c */
    private boolean f25372c;

    /* renamed from: a */
    public boolean mo23453a(C6306c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f25370a.remove(cVar);
        if (!this.f25371b.remove(cVar) && !remove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void mo23454b() {
        for (T a : C0066k.m257i(this.f25370a)) {
            mo23453a(a);
        }
        this.f25371b.clear();
    }

    /* renamed from: c */
    public void mo23455c() {
        this.f25372c = true;
        for (T t : C0066k.m257i(this.f25370a)) {
            if (t.isRunning() || t.mo24062d()) {
                t.clear();
                this.f25371b.add(t);
            }
        }
    }

    /* renamed from: d */
    public void mo23456d() {
        this.f25372c = true;
        for (T t : C0066k.m257i(this.f25370a)) {
            if (t.isRunning()) {
                t.pause();
                this.f25371b.add(t);
            }
        }
    }

    /* renamed from: e */
    public void mo23457e() {
        for (T t : C0066k.m257i(this.f25370a)) {
            if (!t.mo24062d() && !t.mo24065g()) {
                t.clear();
                if (!this.f25372c) {
                    t.mo24067i();
                } else {
                    this.f25371b.add(t);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo23458f() {
        this.f25372c = false;
        for (T t : C0066k.m257i(this.f25370a)) {
            if (!t.mo24062d() && !t.isRunning()) {
                t.mo24067i();
            }
        }
        this.f25371b.clear();
    }

    /* renamed from: g */
    public void mo23459g(C6306c cVar) {
        this.f25370a.add(cVar);
        if (!this.f25372c) {
            cVar.mo24067i();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f25371b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f25370a.size() + ", isPaused=" + this.f25372c + "}";
    }
}
