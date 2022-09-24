package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xr3 implements Iterator<Map.Entry> {

    /* renamed from: b */
    private int f41283b = -1;

    /* renamed from: c */
    private boolean f41284c;

    /* renamed from: d */
    private Iterator<Map.Entry> f41285d;

    /* renamed from: e */
    final /* synthetic */ cs3 f41286e;

    /* synthetic */ xr3(cs3 cs3, wr3 wr3) {
        this.f41286e = cs3;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry> m39583a() {
        if (this.f41285d == null) {
            this.f41285d = this.f41286e.f30484d.entrySet().iterator();
        }
        return this.f41285d;
    }

    public final boolean hasNext() {
        if (this.f41283b + 1 >= this.f41286e.f30483c.size()) {
            return !this.f41286e.f30484d.isEmpty() && m39583a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f41284c = true;
        int i = this.f41283b + 1;
        this.f41283b = i;
        if (i < this.f41286e.f30483c.size()) {
            return (Map.Entry) this.f41286e.f30483c.get(this.f41283b);
        }
        return m39583a().next();
    }

    public final void remove() {
        if (this.f41284c) {
            this.f41284c = false;
            this.f41286e.m31143p();
            if (this.f41283b < this.f41286e.f30483c.size()) {
                cs3 cs3 = this.f41286e;
                int i = this.f41283b;
                this.f41283b = i - 1;
                Object unused = cs3.m31141n(i);
                return;
            }
            m39583a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
