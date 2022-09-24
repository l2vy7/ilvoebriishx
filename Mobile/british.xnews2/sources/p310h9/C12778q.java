package p310h9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p307g8.C12716c;
import p307g8.C12722f;

/* renamed from: h9.q */
/* compiled from: HeaderGroup */
public class C12778q implements Cloneable, Serializable {

    /* renamed from: b */
    private final List f55470b = new ArrayList(16);

    /* renamed from: a */
    public void mo47908a(C12716c cVar) {
        if (cVar != null) {
            this.f55470b.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo47909b() {
        this.f55470b.clear();
    }

    /* renamed from: c */
    public boolean mo47910c(String str) {
        for (int i = 0; i < this.f55470b.size(); i++) {
            if (((C12716c) this.f55470b.get(i)).getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public Object clone() throws CloneNotSupportedException {
        C12778q qVar = (C12778q) super.clone();
        qVar.f55470b.clear();
        qVar.f55470b.addAll(this.f55470b);
        return qVar;
    }

    /* renamed from: d */
    public C12716c[] mo47912d() {
        List list = this.f55470b;
        return (C12716c[]) list.toArray(new C12716c[list.size()]);
    }

    /* renamed from: g */
    public C12716c mo47913g(String str) {
        for (int i = 0; i < this.f55470b.size(); i++) {
            C12716c cVar = (C12716c) this.f55470b.get(i);
            if (cVar.getName().equalsIgnoreCase(str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    public C12716c[] mo47914h(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f55470b.size(); i++) {
            C12716c cVar = (C12716c) this.f55470b.get(i);
            if (cVar.getName().equalsIgnoreCase(str)) {
                arrayList.add(cVar);
            }
        }
        return (C12716c[]) arrayList.toArray(new C12716c[arrayList.size()]);
    }

    /* renamed from: i */
    public C12722f mo47915i() {
        return new C12772k(this.f55470b, (String) null);
    }

    /* renamed from: k */
    public C12722f mo47916k(String str) {
        return new C12772k(this.f55470b, str);
    }

    /* renamed from: l */
    public void mo47917l(C12716c[] cVarArr) {
        mo47909b();
        if (cVarArr != null) {
            for (C12716c add : cVarArr) {
                this.f55470b.add(add);
            }
        }
    }

    /* renamed from: m */
    public void mo47918m(C12716c cVar) {
        if (cVar != null) {
            for (int i = 0; i < this.f55470b.size(); i++) {
                if (((C12716c) this.f55470b.get(i)).getName().equalsIgnoreCase(cVar.getName())) {
                    this.f55470b.set(i, cVar);
                    return;
                }
            }
            this.f55470b.add(cVar);
        }
    }

    public String toString() {
        return this.f55470b.toString();
    }
}
