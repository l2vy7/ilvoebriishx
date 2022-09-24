package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b83 extends d83<Comparable<?>> implements Serializable {

    /* renamed from: b */
    static final b83 f29930b = new b83();

    private b83() {
    }

    /* renamed from: a */
    public final <S extends Comparable> d83<S> mo18552a() {
        return l83.f34945b;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
