package com.facebook.appevents;

import android.content.Context;
import com.facebook.C3642m;
import com.facebook.internal.C3459b;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.appevents.d */
/* compiled from: AppEventCollection */
class C3396d {

    /* renamed from: a */
    private final HashMap<C3387a, C3424o> f12834a = new HashMap<>();

    /* renamed from: e */
    private synchronized C3424o m11367e(C3387a aVar) {
        C3424o oVar;
        oVar = this.f12834a.get(aVar);
        if (oVar == null) {
            Context e = C3642m.m12279e();
            oVar = new C3424o(C3459b.m11543h(e), C3406g.m11394c(e));
        }
        this.f12834a.put(aVar, oVar);
        return oVar;
    }

    /* renamed from: a */
    public synchronized void mo11817a(C3387a aVar, C3392c cVar) {
        m11367e(aVar).mo11856a(cVar);
    }

    /* renamed from: b */
    public synchronized void mo11818b(C3421n nVar) {
        if (nVar != null) {
            for (C3387a next : nVar.mo11855d()) {
                C3424o e = m11367e(next);
                for (C3392c a : nVar.mo11854c(next)) {
                    e.mo11856a(a);
                }
            }
        }
    }

    /* renamed from: c */
    public synchronized C3424o mo11819c(C3387a aVar) {
        return this.f12834a.get(aVar);
    }

    /* renamed from: d */
    public synchronized int mo11820d() {
        int i;
        i = 0;
        for (C3424o c : this.f12834a.values()) {
            i += c.mo11858c();
        }
        return i;
    }

    /* renamed from: f */
    public synchronized Set<C3387a> mo11821f() {
        return this.f12834a.keySet();
    }
}
