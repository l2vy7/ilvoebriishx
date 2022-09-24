package com.google.android.gms.internal.cast;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.oe */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8675oe implements Map.Entry, Comparable<C8675oe> {

    /* renamed from: b */
    private final Comparable f43879b;

    /* renamed from: c */
    private Object f43880c;

    /* renamed from: d */
    final /* synthetic */ C8722re f43881d;

    C8675oe(C8722re reVar, Comparable comparable, Object obj) {
        this.f43881d = reVar;
        this.f43879b = comparable;
        this.f43880c = obj;
    }

    /* renamed from: i */
    private static final boolean m41197i(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f43879b.compareTo(((C8675oe) obj).f43879b);
    }

    /* renamed from: d */
    public final Comparable mo36639d() {
        return this.f43879b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m41197i(this.f43879b, entry.getKey()) && m41197i(this.f43880c, entry.getValue());
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f43879b;
    }

    public final Object getValue() {
        return this.f43880c;
    }

    public final int hashCode() {
        Comparable comparable = this.f43879b;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f43880c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f43881d.m41288o();
        Object obj2 = this.f43880c;
        this.f43880c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f43879b);
        String valueOf2 = String.valueOf(this.f43880c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
