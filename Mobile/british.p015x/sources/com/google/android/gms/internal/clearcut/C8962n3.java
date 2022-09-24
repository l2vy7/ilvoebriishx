package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.n3 */
final class C8962n3 implements Iterator {

    /* renamed from: b */
    private int f44646b;

    /* renamed from: c */
    private boolean f44647c;

    /* renamed from: d */
    private Iterator f44648d;

    /* renamed from: e */
    private final /* synthetic */ C8898f3 f44649e;

    private C8962n3(C8898f3 f3Var) {
        this.f44649e = f3Var;
        this.f44646b = -1;
    }

    /* synthetic */ C8962n3(C8898f3 f3Var, C8905g3 g3Var) {
        this(f3Var);
    }

    /* renamed from: a */
    private final Iterator m42106a() {
        if (this.f44648d == null) {
            this.f44648d = this.f44649e.f44536d.entrySet().iterator();
        }
        return this.f44648d;
    }

    public final boolean hasNext() {
        return this.f44646b + 1 < this.f44649e.f44535c.size() || (!this.f44649e.f44536d.isEmpty() && m42106a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f44647c = true;
        int i = this.f44646b + 1;
        this.f44646b = i;
        return (Map.Entry) (i < this.f44649e.f44535c.size() ? this.f44649e.f44535c.get(this.f44646b) : m42106a().next());
    }

    public final void remove() {
        if (this.f44647c) {
            this.f44647c = false;
            this.f44649e.m41796q();
            if (this.f44646b < this.f44649e.f44535c.size()) {
                C8898f3 f3Var = this.f44649e;
                int i = this.f44646b;
                this.f44646b = i - 1;
                Object unused = f3Var.m41792i(i);
                return;
            }
            m42106a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
