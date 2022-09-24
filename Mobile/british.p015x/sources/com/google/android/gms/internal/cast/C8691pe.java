package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.pe */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8691pe implements Iterator<Map.Entry> {

    /* renamed from: b */
    private int f43909b = -1;

    /* renamed from: c */
    private boolean f43910c;

    /* renamed from: d */
    private Iterator<Map.Entry> f43911d;

    /* renamed from: e */
    final /* synthetic */ C8722re f43912e;

    /* synthetic */ C8691pe(C8722re reVar, C8611ke keVar) {
        this.f43912e = reVar;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry> m41220a() {
        if (this.f43911d == null) {
            this.f43911d = this.f43912e.f43962d.entrySet().iterator();
        }
        return this.f43911d;
    }

    public final boolean hasNext() {
        if (this.f43909b + 1 >= this.f43912e.f43961c.size()) {
            return !this.f43912e.f43962d.isEmpty() && m41220a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f43910c = true;
        int i = this.f43909b + 1;
        this.f43909b = i;
        if (i < this.f43912e.f43961c.size()) {
            return (Map.Entry) this.f43912e.f43961c.get(this.f43909b);
        }
        return m41220a().next();
    }

    public final void remove() {
        if (this.f43910c) {
            this.f43910c = false;
            this.f43912e.m41288o();
            if (this.f43909b < this.f43912e.f43961c.size()) {
                C8722re reVar = this.f43912e;
                int i = this.f43909b;
                this.f43909b = i - 1;
                Object unused = reVar.m41286m(i);
                return;
            }
            m41220a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
