package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public abstract class C9199j implements C9306q, C9244m {

    /* renamed from: b */
    protected final String f45093b;

    /* renamed from: c */
    protected final Map f45094c = new HashMap();

    public C9199j(String str) {
        this.f45093b = str;
    }

    /* renamed from: a */
    public final boolean mo19176a(String str) {
        return this.f45094c.containsKey(str);
    }

    /* renamed from: b */
    public final C9306q mo19177b(String str, C9326r4 r4Var, List list) {
        if ("toString".equals(str)) {
            return new C9369u(this.f45093b);
        }
        return C9214k.m43143a(this, new C9369u(str), r4Var, list);
    }

    /* renamed from: c */
    public final C9306q mo19178c(String str) {
        return this.f45094c.containsKey(str) ? (C9306q) this.f45094c.get(str) : C9306q.f45372d0;
    }

    /* renamed from: d */
    public abstract C9306q mo37655d(C9326r4 r4Var, List list);

    /* renamed from: e */
    public final void mo19179e(String str, C9306q qVar) {
        if (qVar == null) {
            this.f45094c.remove(str);
        } else {
            this.f45094c.put(str, qVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9199j)) {
            return false;
        }
        C9199j jVar = (C9199j) obj;
        String str = this.f45093b;
        if (str != null) {
            return str.equals(jVar.f45093b);
        }
        return false;
    }

    /* renamed from: f */
    public final String mo37657f() {
        return this.f45093b;
    }

    public final int hashCode() {
        String str = this.f45093b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public C9306q zzd() {
        return this;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return this.f45093b;
    }

    public final Iterator zzl() {
        return C9214k.m43144b(this.f45094c);
    }
}
