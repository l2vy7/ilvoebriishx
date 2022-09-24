package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.f5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9515f5 implements Iterator {

    /* renamed from: b */
    private int f45640b;

    /* renamed from: c */
    private boolean f45641c;

    /* renamed from: d */
    private Iterator f45642d;

    /* renamed from: e */
    private final /* synthetic */ C9675x4 f45643e;

    private C9515f5(C9675x4 x4Var) {
        this.f45643e = x4Var;
        this.f45640b = -1;
    }

    /* renamed from: a */
    private final Iterator m44264a() {
        if (this.f45642d == null) {
            this.f45642d = this.f45643e.f45989d.entrySet().iterator();
        }
        return this.f45642d;
    }

    public final boolean hasNext() {
        if (this.f45640b + 1 < this.f45643e.f45988c.size() || (!this.f45643e.f45989d.isEmpty() && m44264a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f45641c = true;
        int i = this.f45640b + 1;
        this.f45640b = i;
        if (i < this.f45643e.f45988c.size()) {
            return (Map.Entry) this.f45643e.f45988c.get(this.f45640b);
        }
        return (Map.Entry) m44264a().next();
    }

    public final void remove() {
        if (this.f45641c) {
            this.f45641c = false;
            this.f45643e.m44813r();
            if (this.f45640b < this.f45643e.f45988c.size()) {
                C9675x4 x4Var = this.f45643e;
                int i = this.f45640b;
                this.f45640b = i - 1;
                Object unused = x4Var.m44811l(i);
                return;
            }
            m44264a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ C9515f5(C9675x4 x4Var, C9467a5 a5Var) {
        this(x4Var);
    }
}
