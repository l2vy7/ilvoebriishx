package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class l83 extends d83<Comparable<?>> implements Serializable {

    /* renamed from: b */
    static final l83 f34945b = new l83();

    private l83() {
    }

    /* renamed from: a */
    public final <S extends Comparable> d83<S> mo18552a() {
        return b83.f29930b;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
