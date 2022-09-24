package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.oa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
final class C9286oa implements Map.Entry, Comparable {

    /* renamed from: b */
    private final Comparable f45344b;

    /* renamed from: c */
    private Object f45345c;

    /* renamed from: d */
    final /* synthetic */ C9332ra f45346d;

    C9286oa(C9332ra raVar, Comparable comparable, Object obj) {
        this.f45346d = raVar;
        this.f45344b = comparable;
        this.f45345c = obj;
    }

    /* renamed from: i */
    private static final boolean m43340i(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f45344b.compareTo(((C9286oa) obj).f45344b);
    }

    /* renamed from: d */
    public final Comparable mo37844d() {
        return this.f45344b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m43340i(this.f45344b, entry.getKey()) && m43340i(this.f45345c, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f45344b;
    }

    public final Object getValue() {
        return this.f45345c;
    }

    public final int hashCode() {
        Comparable comparable = this.f45344b;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f45345c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f45346d.m43584p();
        Object obj2 = this.f45345c;
        this.f45345c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f45344b);
        String valueOf2 = String.valueOf(this.f45345c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
