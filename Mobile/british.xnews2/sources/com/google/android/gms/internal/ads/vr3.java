package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vr3 implements Map.Entry, Comparable<vr3> {

    /* renamed from: b */
    private final Comparable f40529b;

    /* renamed from: c */
    private Object f40530c;

    /* renamed from: d */
    final /* synthetic */ cs3 f40531d;

    vr3(cs3 cs3, Comparable comparable, Object obj) {
        this.f40531d = cs3;
        this.f40529b = comparable;
        this.f40530c = obj;
    }

    /* renamed from: i */
    private static final boolean m38906i(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f40529b.compareTo(((vr3) obj).f40529b);
    }

    /* renamed from: d */
    public final Comparable mo35482d() {
        return this.f40529b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m38906i(this.f40529b, entry.getKey()) && m38906i(this.f40530c, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f40529b;
    }

    public final Object getValue() {
        return this.f40530c;
    }

    public final int hashCode() {
        Comparable comparable = this.f40529b;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f40530c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f40531d.m31143p();
        Object obj2 = this.f40530c;
        this.f40530c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f40529b);
        String valueOf2 = String.valueOf(this.f40530c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
