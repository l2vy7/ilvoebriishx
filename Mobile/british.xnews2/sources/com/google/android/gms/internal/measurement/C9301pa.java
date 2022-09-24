package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.pa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9301pa implements Iterator {

    /* renamed from: b */
    private int f45365b = -1;

    /* renamed from: c */
    private boolean f45366c;

    /* renamed from: d */
    private Iterator f45367d;

    /* renamed from: e */
    final /* synthetic */ C9332ra f45368e;

    /* synthetic */ C9301pa(C9332ra raVar, C9224ka kaVar) {
        this.f45368e = raVar;
    }

    /* renamed from: a */
    private final Iterator m43496a() {
        if (this.f45367d == null) {
            this.f45367d = this.f45368e.f45427d.entrySet().iterator();
        }
        return this.f45367d;
    }

    public final boolean hasNext() {
        if (this.f45365b + 1 >= this.f45368e.f45426c.size()) {
            return !this.f45368e.f45427d.isEmpty() && m43496a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f45366c = true;
        int i = this.f45365b + 1;
        this.f45365b = i;
        if (i < this.f45368e.f45426c.size()) {
            return (Map.Entry) this.f45368e.f45426c.get(this.f45365b);
        }
        return (Map.Entry) m43496a().next();
    }

    public final void remove() {
        if (this.f45366c) {
            this.f45366c = false;
            this.f45368e.m43584p();
            if (this.f45365b < this.f45368e.f45426c.size()) {
                C9332ra raVar = this.f45368e;
                int i = this.f45365b;
                this.f45365b = i - 1;
                Object unused = raVar.m43582n(i);
                return;
            }
            m43496a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
