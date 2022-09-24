package p101k2;

import com.bumptech.glide.C3325f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p004a3.C0065j;
import p064d2.C5154a;
import p064d2.C5159f;
import p064d2.C5163h;
import p070e2.C5208d;
import p081g2.C5316q;
import p101k2.C5596n;
import p104l0.C5645e;

/* renamed from: k2.q */
/* compiled from: MultiModelLoader */
class C5602q<Model, Data> implements C5596n<Model, Data> {

    /* renamed from: a */
    private final List<C5596n<Model, Data>> f24134a;

    /* renamed from: b */
    private final C5645e<List<Throwable>> f24135b;

    /* renamed from: k2.q$a */
    /* compiled from: MultiModelLoader */
    static class C5603a<Data> implements C5208d<Data>, C5208d.C5209a<Data> {

        /* renamed from: b */
        private final List<C5208d<Data>> f24136b;

        /* renamed from: c */
        private final C5645e<List<Throwable>> f24137c;

        /* renamed from: d */
        private int f24138d = 0;

        /* renamed from: e */
        private C3325f f24139e;

        /* renamed from: f */
        private C5208d.C5209a<? super Data> f24140f;

        /* renamed from: g */
        private List<Throwable> f24141g;

        /* renamed from: h */
        private boolean f24142h;

        C5603a(List<C5208d<Data>> list, C5645e<List<Throwable>> eVar) {
            this.f24137c = eVar;
            C0065j.m246c(list);
            this.f24136b = list;
        }

        /* renamed from: g */
        private void m24865g() {
            if (!this.f24142h) {
                if (this.f24138d < this.f24136b.size() - 1) {
                    this.f24138d++;
                    mo21431e(this.f24139e, this.f24140f);
                    return;
                }
                C0065j.m247d(this.f24141g);
                this.f24140f.mo21438c(new C5316q("Fetch failed", (List<Throwable>) new ArrayList(this.f24141g)));
            }
        }

        /* renamed from: a */
        public Class<Data> mo21422a() {
            return this.f24136b.get(0).mo21422a();
        }

        /* renamed from: b */
        public void mo21427b() {
            List<Throwable> list = this.f24141g;
            if (list != null) {
                this.f24137c.mo7110a(list);
            }
            this.f24141g = null;
            for (C5208d<Data> b : this.f24136b) {
                b.mo21427b();
            }
        }

        /* renamed from: c */
        public void mo21438c(Exception exc) {
            ((List) C0065j.m247d(this.f24141g)).add(exc);
            m24865g();
        }

        public void cancel() {
            this.f24142h = true;
            for (C5208d<Data> cancel : this.f24136b) {
                cancel.cancel();
            }
        }

        /* renamed from: d */
        public C5154a mo21430d() {
            return this.f24136b.get(0).mo21430d();
        }

        /* renamed from: e */
        public void mo21431e(C3325f fVar, C5208d.C5209a<? super Data> aVar) {
            this.f24139e = fVar;
            this.f24140f = aVar;
            this.f24141g = this.f24137c.acquire();
            this.f24136b.get(this.f24138d).mo21431e(fVar, this);
            if (this.f24142h) {
                cancel();
            }
        }

        /* renamed from: f */
        public void mo21439f(Data data) {
            if (data != null) {
                this.f24140f.mo21439f(data);
            } else {
                m24865g();
            }
        }
    }

    C5602q(List<C5596n<Model, Data>> list, C5645e<List<Throwable>> eVar) {
        this.f24134a = list;
        this.f24135b = eVar;
    }

    /* renamed from: a */
    public C5596n.C5597a<Data> mo22113a(Model model, int i, int i2, C5163h hVar) {
        C5596n.C5597a a;
        int size = this.f24134a.size();
        ArrayList arrayList = new ArrayList(size);
        C5159f fVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C5596n nVar = this.f24134a.get(i3);
            if (nVar.mo22114b(model) && (a = nVar.mo22113a(model, i, i2, hVar)) != null) {
                fVar = a.f24127a;
                arrayList.add(a.f24129c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new C5596n.C5597a<>(fVar, new C5603a(arrayList, this.f24135b));
    }

    /* renamed from: b */
    public boolean mo22114b(Model model) {
        for (C5596n<Model, Data> b : this.f24134a) {
            if (b.mo22114b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f24134a.toArray()) + '}';
    }
}
