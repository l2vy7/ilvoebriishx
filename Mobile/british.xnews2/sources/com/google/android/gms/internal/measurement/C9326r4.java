package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9326r4 {

    /* renamed from: a */
    public final C9326r4 f45414a;

    /* renamed from: b */
    final C9430y f45415b;

    /* renamed from: c */
    final Map f45416c = new HashMap();

    /* renamed from: d */
    final Map f45417d = new HashMap();

    public C9326r4(C9326r4 r4Var, C9430y yVar) {
        this.f45414a = r4Var;
        this.f45415b = yVar;
    }

    /* renamed from: a */
    public final C9326r4 mo37976a() {
        return new C9326r4(this, this.f45415b);
    }

    /* renamed from: b */
    public final C9306q mo37977b(C9306q qVar) {
        return this.f45415b.mo38178a(this, qVar);
    }

    /* renamed from: c */
    public final C9306q mo37978c(C4652f fVar) {
        C9306q qVar = C9306q.f45372d0;
        Iterator j = fVar.mo19187j();
        while (j.hasNext()) {
            qVar = this.f45415b.mo38178a(this, fVar.mo19183h(((Integer) j.next()).intValue()));
            if (qVar instanceof C9169h) {
                break;
            }
        }
        return qVar;
    }

    /* renamed from: d */
    public final C9306q mo37979d(String str) {
        if (this.f45416c.containsKey(str)) {
            return (C9306q) this.f45416c.get(str);
        }
        C9326r4 r4Var = this.f45414a;
        if (r4Var != null) {
            return r4Var.mo37979d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: e */
    public final void mo37980e(String str, C9306q qVar) {
        if (!this.f45417d.containsKey(str)) {
            if (qVar == null) {
                this.f45416c.remove(str);
            } else {
                this.f45416c.put(str, qVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo37981f(String str, C9306q qVar) {
        mo37980e(str, qVar);
        this.f45417d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void mo37982g(String str, C9306q qVar) {
        C9326r4 r4Var;
        if (!this.f45416c.containsKey(str) && (r4Var = this.f45414a) != null && r4Var.mo37983h(str)) {
            this.f45414a.mo37982g(str, qVar);
        } else if (!this.f45417d.containsKey(str)) {
            if (qVar == null) {
                this.f45416c.remove(str);
            } else {
                this.f45416c.put(str, qVar);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo37983h(String str) {
        if (this.f45416c.containsKey(str)) {
            return true;
        }
        C9326r4 r4Var = this.f45414a;
        if (r4Var != null) {
            return r4Var.mo37983h(str);
        }
        return false;
    }
}
