package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.h3 */
final class C8912h3 implements Iterator {

    /* renamed from: b */
    private int f44553b;

    /* renamed from: c */
    private Iterator f44554c;

    /* renamed from: d */
    private final /* synthetic */ C8898f3 f44555d;

    private C8912h3(C8898f3 f3Var) {
        this.f44555d = f3Var;
        this.f44553b = f3Var.f44535c.size();
    }

    /* synthetic */ C8912h3(C8898f3 f3Var, C8905g3 g3Var) {
        this(f3Var);
    }

    /* renamed from: a */
    private final Iterator m41850a() {
        if (this.f44554c == null) {
            this.f44554c = this.f44555d.f44539g.entrySet().iterator();
        }
        return this.f44554c;
    }

    public final boolean hasNext() {
        int i = this.f44553b;
        return (i > 0 && i <= this.f44555d.f44535c.size()) || m41850a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (m41850a().hasNext()) {
            obj = m41850a().next();
        } else {
            List j = this.f44555d.f44535c;
            int i = this.f44553b - 1;
            this.f44553b = i;
            obj = j.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
