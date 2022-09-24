package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p149s6.C6068f;
import p149s6.C6069h;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.i */
/* compiled from: ByFunctionOrdering */
final class C4717i<F, T> extends C4755p0<F> implements Serializable {

    /* renamed from: b */
    final C6068f<F, ? extends T> f21432b;

    /* renamed from: c */
    final C4755p0<T> f21433c;

    C4717i(C6068f<F, ? extends T> fVar, C4755p0<T> p0Var) {
        this.f21432b = (C6068f) C6073k.m26688k(fVar);
        this.f21433c = (C4755p0) C6073k.m26688k(p0Var);
    }

    public int compare(F f, F f2) {
        return this.f21433c.compare(this.f21432b.apply(f), this.f21432b.apply(f2));
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4717i)) {
            return false;
        }
        C4717i iVar = (C4717i) obj;
        if (!this.f21432b.equals(iVar.f21432b) || !this.f21433c.equals(iVar.f21433c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6069h.m26675b(this.f21432b, this.f21433c);
    }

    public String toString() {
        return this.f21433c + ".onResultOf(" + this.f21432b + ")";
    }
}
