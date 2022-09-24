package p152t1;

import java.util.ArrayList;
import java.util.List;
import p146s1.C6013a;
import p157u1.C6179d;
import p168w1.C6283p;

/* renamed from: t1.c */
/* compiled from: ConstraintController */
public abstract class C6097c<T> implements C6013a<T> {

    /* renamed from: a */
    private final List<String> f25339a = new ArrayList();

    /* renamed from: b */
    private T f25340b;

    /* renamed from: c */
    private C6179d<T> f25341c;

    /* renamed from: d */
    private C6098a f25342d;

    /* renamed from: t1.c$a */
    /* compiled from: ConstraintController */
    public interface C6098a {
        /* renamed from: a */
        void mo23143a(List<String> list);

        /* renamed from: b */
        void mo23144b(List<String> list);
    }

    C6097c(C6179d<T> dVar) {
        this.f25341c = dVar;
    }

    /* renamed from: h */
    private void m26809h(C6098a aVar, T t) {
        if (!this.f25339a.isEmpty() && aVar != null) {
            if (t == null || mo23412c(t)) {
                aVar.mo23144b(this.f25339a);
            } else {
                aVar.mo23143a(this.f25339a);
            }
        }
    }

    /* renamed from: a */
    public void mo23135a(T t) {
        this.f25340b = t;
        m26809h(this.f25342d, t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo23411b(C6283p pVar);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo23412c(T t);

    /* renamed from: d */
    public boolean mo23415d(String str) {
        T t = this.f25340b;
        return t != null && mo23412c(t) && this.f25339a.contains(str);
    }

    /* renamed from: e */
    public void mo23416e(Iterable<C6283p> iterable) {
        this.f25339a.clear();
        for (C6283p next : iterable) {
            if (mo23411b(next)) {
                this.f25339a.add(next.f25941a);
            }
        }
        if (this.f25339a.isEmpty()) {
            this.f25341c.mo23591c(this);
        } else {
            this.f25341c.mo23590a(this);
        }
        m26809h(this.f25342d, this.f25340b);
    }

    /* renamed from: f */
    public void mo23417f() {
        if (!this.f25339a.isEmpty()) {
            this.f25339a.clear();
            this.f25341c.mo23591c(this);
        }
    }

    /* renamed from: g */
    public void mo23418g(C6098a aVar) {
        if (this.f25342d != aVar) {
            this.f25342d = aVar;
            m26809h(aVar, this.f25340b);
        }
    }
}
