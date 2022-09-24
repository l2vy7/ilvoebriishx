package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9291p extends C9199j {

    /* renamed from: d */
    protected final List f45354d;

    /* renamed from: e */
    protected final List f45355e;

    /* renamed from: f */
    protected C9326r4 f45356f;

    private C9291p(C9291p pVar) {
        super(pVar.f45093b);
        ArrayList arrayList = new ArrayList(pVar.f45354d.size());
        this.f45354d = arrayList;
        arrayList.addAll(pVar.f45354d);
        ArrayList arrayList2 = new ArrayList(pVar.f45355e.size());
        this.f45355e = arrayList2;
        arrayList2.addAll(pVar.f45355e);
        this.f45356f = pVar.f45356f;
    }

    /* renamed from: d */
    public final C9306q mo37655d(C9326r4 r4Var, List list) {
        C9326r4 a = this.f45356f.mo37976a();
        for (int i = 0; i < this.f45354d.size(); i++) {
            if (i < list.size()) {
                a.mo37980e((String) this.f45354d.get(i), r4Var.mo37977b((C9306q) list.get(i)));
            } else {
                a.mo37980e((String) this.f45354d.get(i), C9306q.f45372d0);
            }
        }
        for (C9306q qVar : this.f45355e) {
            C9306q b = a.mo37977b(qVar);
            if (b instanceof C9321r) {
                b = a.mo37977b(qVar);
            }
            if (b instanceof C9169h) {
                return ((C9169h) b).mo37612a();
            }
        }
        return C9306q.f45372d0;
    }

    public final C9306q zzd() {
        return new C9291p(this);
    }

    public C9291p(String str, List list, List list2, C9326r4 r4Var) {
        super(str);
        this.f45354d = new ArrayList();
        this.f45356f = r4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f45354d.add(((C9306q) it.next()).zzi());
            }
        }
        this.f45355e = new ArrayList(list2);
    }
}
