package p314j9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p307g8.C12727k;
import p307g8.C12731o;
import p307g8.C12732p;
import p307g8.C12733q;
import p307g8.C12735s;

/* renamed from: j9.b */
/* compiled from: BasicHttpProcessor */
public final class C12808b implements C12812f, Cloneable {

    /* renamed from: b */
    protected final List f55481b = new ArrayList();

    /* renamed from: c */
    protected final List f55482c = new ArrayList();

    /* renamed from: a */
    public void mo47803a(C12731o oVar, C12811e eVar) throws IOException, C12727k {
        for (int i = 0; i < this.f55481b.size(); i++) {
            ((C12732p) this.f55481b.get(i)).mo47803a(oVar, eVar);
        }
    }

    /* renamed from: b */
    public void mo47808b(C12733q qVar, C12811e eVar) throws IOException, C12727k {
        for (int i = 0; i < this.f55482c.size(); i++) {
            ((C12735s) this.f55482c.get(i)).mo47808b(qVar, eVar);
        }
    }

    /* renamed from: c */
    public final void mo47935c(C12732p pVar) {
        mo47938g(pVar);
    }

    public Object clone() throws CloneNotSupportedException {
        C12808b bVar = (C12808b) super.clone();
        mo47940i(bVar);
        return bVar;
    }

    /* renamed from: d */
    public final void mo47937d(C12735s sVar) {
        mo47939h(sVar);
    }

    /* renamed from: g */
    public void mo47938g(C12732p pVar) {
        if (pVar != null) {
            this.f55481b.add(pVar);
        }
    }

    /* renamed from: h */
    public void mo47939h(C12735s sVar) {
        if (sVar != null) {
            this.f55482c.add(sVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo47940i(C12808b bVar) {
        bVar.f55481b.clear();
        bVar.f55481b.addAll(this.f55481b);
        bVar.f55482c.clear();
        bVar.f55482c.addAll(this.f55482c);
    }

    /* renamed from: k */
    public C12732p mo47941k(int i) {
        if (i < 0 || i >= this.f55481b.size()) {
            return null;
        }
        return (C12732p) this.f55481b.get(i);
    }

    /* renamed from: l */
    public int mo47942l() {
        return this.f55481b.size();
    }

    /* renamed from: m */
    public C12735s mo47943m(int i) {
        if (i < 0 || i >= this.f55482c.size()) {
            return null;
        }
        return (C12735s) this.f55482c.get(i);
    }

    /* renamed from: n */
    public int mo47944n() {
        return this.f55482c.size();
    }
}
