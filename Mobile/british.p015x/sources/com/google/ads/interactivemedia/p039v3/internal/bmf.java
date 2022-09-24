package com.google.ads.interactivemedia.p039v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmf */
/* compiled from: IMASDK */
final class bmf implements Map.Entry, Comparable<bmf> {

    /* renamed from: a */
    final /* synthetic */ bmi f16682a;

    /* renamed from: b */
    private final Comparable f16683b;

    /* renamed from: c */
    private Object f16684c;

    bmf(bmi bmi, Comparable comparable, Object obj) {
        this.f16682a = bmi;
        this.f16683b = comparable;
        this.f16684c = obj;
    }

    /* renamed from: b */
    private static final boolean m16629b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable mo15469a() {
        return this.f16683b;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f16683b.compareTo(((bmf) obj).f16683b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m16629b(this.f16683b, entry.getKey()) && m16629b(this.f16684c, entry.getValue());
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f16683b;
    }

    public final Object getValue() {
        return this.f16684c;
    }

    public final int hashCode() {
        Comparable comparable = this.f16683b;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f16684c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f16682a.m16639n();
        Object obj2 = this.f16684c;
        this.f16684c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16683b);
        String valueOf2 = String.valueOf(this.f16684c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
