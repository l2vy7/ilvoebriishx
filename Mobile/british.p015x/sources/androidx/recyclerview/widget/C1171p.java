package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p105l0.C5645e;
import p105l0.C5646f;
import p150t.C6082d;
import p150t.C6090g;

/* renamed from: androidx.recyclerview.widget.p */
/* compiled from: ViewInfoStore */
class C1171p {

    /* renamed from: a */
    final C6090g<RecyclerView.C1087c0, C1172a> f5406a = new C6090g<>();

    /* renamed from: b */
    final C6082d<RecyclerView.C1087c0> f5407b = new C6082d<>();

    /* renamed from: androidx.recyclerview.widget.p$a */
    /* compiled from: ViewInfoStore */
    static class C1172a {

        /* renamed from: d */
        static C5645e<C1172a> f5408d = new C5646f(20);

        /* renamed from: a */
        int f5409a;

        /* renamed from: b */
        RecyclerView.C1098m.C1101c f5410b;

        /* renamed from: c */
        RecyclerView.C1098m.C1101c f5411c;

        private C1172a() {
        }

        /* renamed from: a */
        static void m6542a() {
            do {
            } while (f5408d.acquire() != null);
        }

        /* renamed from: b */
        static C1172a m6543b() {
            C1172a acquire = f5408d.acquire();
            return acquire == null ? new C1172a() : acquire;
        }

        /* renamed from: c */
        static void m6544c(C1172a aVar) {
            aVar.f5409a = 0;
            aVar.f5410b = null;
            aVar.f5411c = null;
            f5408d.mo7110a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$b */
    /* compiled from: ViewInfoStore */
    interface C1173b {
        /* renamed from: a */
        void mo5300a(RecyclerView.C1087c0 c0Var);

        /* renamed from: b */
        void mo5301b(RecyclerView.C1087c0 c0Var, RecyclerView.C1098m.C1101c cVar, RecyclerView.C1098m.C1101c cVar2);

        /* renamed from: c */
        void mo5302c(RecyclerView.C1087c0 c0Var, RecyclerView.C1098m.C1101c cVar, RecyclerView.C1098m.C1101c cVar2);

        /* renamed from: d */
        void mo5303d(RecyclerView.C1087c0 c0Var, RecyclerView.C1098m.C1101c cVar, RecyclerView.C1098m.C1101c cVar2);
    }

    C1171p() {
    }

    /* renamed from: l */
    private RecyclerView.C1098m.C1101c m6525l(RecyclerView.C1087c0 c0Var, int i) {
        C1172a o;
        RecyclerView.C1098m.C1101c cVar;
        int g = this.f5406a.mo23384g(c0Var);
        if (g >= 0 && (o = this.f5406a.mo23391o(g)) != null) {
            int i2 = o.f5409a;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                o.f5409a = i3;
                if (i == 4) {
                    cVar = o.f5410b;
                } else if (i == 8) {
                    cVar = o.f5411c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f5406a.mo159m(g);
                    C1172a.m6544c(o);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5825a(RecyclerView.C1087c0 c0Var, RecyclerView.C1098m.C1101c cVar) {
        C1172a aVar = this.f5406a.get(c0Var);
        if (aVar == null) {
            aVar = C1172a.m6543b();
            this.f5406a.put(c0Var, aVar);
        }
        aVar.f5409a |= 2;
        aVar.f5410b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5826b(RecyclerView.C1087c0 c0Var) {
        C1172a aVar = this.f5406a.get(c0Var);
        if (aVar == null) {
            aVar = C1172a.m6543b();
            this.f5406a.put(c0Var, aVar);
        }
        aVar.f5409a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5827c(long j, RecyclerView.C1087c0 c0Var) {
        this.f5407b.mo23302l(j, c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5828d(RecyclerView.C1087c0 c0Var, RecyclerView.C1098m.C1101c cVar) {
        C1172a aVar = this.f5406a.get(c0Var);
        if (aVar == null) {
            aVar = C1172a.m6543b();
            this.f5406a.put(c0Var, aVar);
        }
        aVar.f5411c = cVar;
        aVar.f5409a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5829e(RecyclerView.C1087c0 c0Var, RecyclerView.C1098m.C1101c cVar) {
        C1172a aVar = this.f5406a.get(c0Var);
        if (aVar == null) {
            aVar = C1172a.m6543b();
            this.f5406a.put(c0Var, aVar);
        }
        aVar.f5410b = cVar;
        aVar.f5409a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5830f() {
        this.f5406a.clear();
        this.f5407b.mo23295b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.C1087c0 mo5831g(long j) {
        return this.f5407b.mo23298g(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo5832h(RecyclerView.C1087c0 c0Var) {
        C1172a aVar = this.f5406a.get(c0Var);
        if (aVar == null || (aVar.f5409a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo5833i(RecyclerView.C1087c0 c0Var) {
        C1172a aVar = this.f5406a.get(c0Var);
        return (aVar == null || (aVar.f5409a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5834j() {
        C1172a.m6542a();
    }

    /* renamed from: k */
    public void mo5835k(RecyclerView.C1087c0 c0Var) {
        mo5839p(c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.C1098m.C1101c mo5836m(RecyclerView.C1087c0 c0Var) {
        return m6525l(c0Var, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.C1098m.C1101c mo5837n(RecyclerView.C1087c0 c0Var) {
        return m6525l(c0Var, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5838o(C1173b bVar) {
        for (int size = this.f5406a.size() - 1; size >= 0; size--) {
            RecyclerView.C1087c0 j = this.f5406a.mo23390j(size);
            C1172a m = this.f5406a.mo159m(size);
            int i = m.f5409a;
            if ((i & 3) == 3) {
                bVar.mo5300a(j);
            } else if ((i & 1) != 0) {
                RecyclerView.C1098m.C1101c cVar = m.f5410b;
                if (cVar == null) {
                    bVar.mo5300a(j);
                } else {
                    bVar.mo5302c(j, cVar, m.f5411c);
                }
            } else if ((i & 14) == 14) {
                bVar.mo5301b(j, m.f5410b, m.f5411c);
            } else if ((i & 12) == 12) {
                bVar.mo5303d(j, m.f5410b, m.f5411c);
            } else if ((i & 4) != 0) {
                bVar.mo5302c(j, m.f5410b, (RecyclerView.C1098m.C1101c) null);
            } else if ((i & 8) != 0) {
                bVar.mo5301b(j, m.f5410b, m.f5411c);
            }
            C1172a.m6544c(m);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5839p(RecyclerView.C1087c0 c0Var) {
        C1172a aVar = this.f5406a.get(c0Var);
        if (aVar != null) {
            aVar.f5409a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5840q(RecyclerView.C1087c0 c0Var) {
        int o = this.f5407b.mo23305o() - 1;
        while (true) {
            if (o < 0) {
                break;
            } else if (c0Var == this.f5407b.mo23306p(o)) {
                this.f5407b.mo23304n(o);
                break;
            } else {
                o--;
            }
        }
        C1172a remove = this.f5406a.remove(c0Var);
        if (remove != null) {
            C1172a.m6544c(remove);
        }
    }
}
