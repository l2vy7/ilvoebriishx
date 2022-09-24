package com.google.android.gms.internal.vision;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.g5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9523g5 implements Comparable, Map.Entry {

    /* renamed from: b */
    private final Comparable f45648b;

    /* renamed from: c */
    private Object f45649c;

    /* renamed from: d */
    private final /* synthetic */ C9675x4 f45650d;

    C9523g5(C9675x4 x4Var, Map.Entry entry) {
        this(x4Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m44277a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C9523g5) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m44277a(this.f45648b, entry.getKey()) && m44277a(this.f45649c, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f45648b;
    }

    public final Object getValue() {
        return this.f45649c;
    }

    public final int hashCode() {
        Comparable comparable = this.f45648b;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f45649c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f45650d.m44813r();
        Object obj2 = this.f45649c;
        this.f45649c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f45648b);
        String valueOf2 = String.valueOf(this.f45649c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    C9523g5(C9675x4 x4Var, Comparable comparable, Object obj) {
        this.f45650d = x4Var;
        this.f45648b = comparable;
        this.f45649c = obj;
    }
}
