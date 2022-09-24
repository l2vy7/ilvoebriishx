package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.m3 */
final class C8955m3 implements Comparable, Map.Entry {

    /* renamed from: b */
    private final Comparable f44628b;

    /* renamed from: c */
    private Object f44629c;

    /* renamed from: d */
    private final /* synthetic */ C8898f3 f44630d;

    C8955m3(C8898f3 f3Var, Comparable comparable, Object obj) {
        this.f44630d = f3Var;
        this.f44628b = comparable;
        this.f44629c = obj;
    }

    C8955m3(C8898f3 f3Var, Map.Entry entry) {
        this(f3Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m42101a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C8955m3) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m42101a(this.f44628b, entry.getKey()) && m42101a(this.f44629c, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f44628b;
    }

    public final Object getValue() {
        return this.f44629c;
    }

    public final int hashCode() {
        Comparable comparable = this.f44628b;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f44629c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f44630d.m41796q();
        Object obj2 = this.f44629c;
        this.f44629c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f44628b);
        String valueOf2 = String.valueOf(this.f44629c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
