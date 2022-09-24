package com.google.ads.interactivemedia.p038v3.internal;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bnn */
/* compiled from: IMASDK */
public abstract class bnn<L, R> implements Map.Entry<L, R>, Comparable<bnn<L, R>>, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    /* renamed from: c */
    public static <L, R> bnn<L, R> m16847c(L l, R r) {
        return new bnm(l, r);
    }

    /* renamed from: a */
    public abstract L mo15568a();

    /* renamed from: b */
    public abstract R mo15569b();

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bnn bnn = (bnn) obj;
        return new bng().mo15556a(mo15568a(), bnn.mo15568a()).mo15556a(mo15569b(), bnn.mo15569b()).mo15557b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return Objects.equals(mo15568a(), entry.getKey()) && Objects.equals(mo15569b(), entry.getValue());
        }
    }

    public final L getKey() {
        return mo15568a();
    }

    public final R getValue() {
        return mo15569b();
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (mo15568a() == null) {
            i = 0;
        } else {
            i = mo15568a().hashCode();
        }
        if (mo15569b() != null) {
            i2 = mo15569b().hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        return "(" + mo15568a() + ',' + mo15569b() + ')';
    }
}
