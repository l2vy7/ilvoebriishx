package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public class C9260n implements C9306q, C9244m {

    /* renamed from: b */
    final Map f45228b = new HashMap();

    /* renamed from: a */
    public final boolean mo19176a(String str) {
        return this.f45228b.containsKey(str);
    }

    /* renamed from: b */
    public C9306q mo19177b(String str, C9326r4 r4Var, List list) {
        if ("toString".equals(str)) {
            return new C9369u(toString());
        }
        return C9214k.m43143a(this, new C9369u(str), r4Var, list);
    }

    /* renamed from: c */
    public final C9306q mo19178c(String str) {
        return this.f45228b.containsKey(str) ? (C9306q) this.f45228b.get(str) : C9306q.f45372d0;
    }

    /* renamed from: d */
    public final List mo37738d() {
        return new ArrayList(this.f45228b.keySet());
    }

    /* renamed from: e */
    public final void mo19179e(String str, C9306q qVar) {
        if (qVar == null) {
            this.f45228b.remove(str);
        } else {
            this.f45228b.put(str, qVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9260n)) {
            return false;
        }
        return this.f45228b.equals(((C9260n) obj).f45228b);
    }

    public final int hashCode() {
        return this.f45228b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f45228b.isEmpty()) {
            for (String str : this.f45228b.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f45228b.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    public final C9306q zzd() {
        C9260n nVar = new C9260n();
        for (Map.Entry entry : this.f45228b.entrySet()) {
            if (entry.getValue() instanceof C9244m) {
                nVar.f45228b.put((String) entry.getKey(), (C9306q) entry.getValue());
            } else {
                nVar.f45228b.put((String) entry.getKey(), ((C9306q) entry.getValue()).zzd());
            }
        }
        return nVar;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return "[object Object]";
    }

    public final Iterator zzl() {
        return C9214k.m43144b(this.f45228b);
    }
}
