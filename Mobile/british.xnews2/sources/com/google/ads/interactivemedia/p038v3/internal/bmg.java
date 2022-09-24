package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmg */
/* compiled from: IMASDK */
final class bmg implements Iterator<Map.Entry> {

    /* renamed from: a */
    final /* synthetic */ bmi f16685a;

    /* renamed from: b */
    private int f16686b = -1;

    /* renamed from: c */
    private boolean f16687c;

    /* renamed from: d */
    private Iterator<Map.Entry> f16688d;

    /* synthetic */ bmg(bmi bmi) {
        this.f16685a = bmi;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry> m16631a() {
        if (this.f16688d == null) {
            this.f16688d = this.f16685a.f16692c.entrySet().iterator();
        }
        return this.f16688d;
    }

    public final boolean hasNext() {
        if (this.f16686b + 1 >= this.f16685a.f16691b.size()) {
            return !this.f16685a.f16692c.isEmpty() && m16631a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f16687c = true;
        int i = this.f16686b + 1;
        this.f16686b = i;
        if (i < this.f16685a.f16691b.size()) {
            return (Map.Entry) this.f16685a.f16691b.get(this.f16686b);
        }
        return m16631a().next();
    }

    public final void remove() {
        if (this.f16687c) {
            this.f16687c = false;
            this.f16685a.m16639n();
            if (this.f16686b < this.f16685a.f16691b.size()) {
                bmi bmi = this.f16685a;
                int i = this.f16686b;
                this.f16686b = i - 1;
                bmi.m16637l(i);
                return;
            }
            m16631a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
