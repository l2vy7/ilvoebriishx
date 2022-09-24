package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.j0 */
/* compiled from: Multimap */
public interface C4727j0<K, V> {
    /* renamed from: a */
    Collection<Map.Entry<K, V>> mo19516a();

    /* renamed from: b */
    Map<K, Collection<V>> mo19511b();

    /* renamed from: c */
    boolean mo19673c(@NullableDecl @CompatibleWith("K") Object obj, @NullableDecl @CompatibleWith("V") Object obj2);

    void clear();

    Collection<V> get(@NullableDecl K k);

    @CanIgnoreReturnValue
    boolean put(@NullableDecl K k, @NullableDecl V v);

    @CanIgnoreReturnValue
    boolean remove(@NullableDecl @CompatibleWith("K") Object obj, @NullableDecl @CompatibleWith("V") Object obj2);

    int size();

    Collection<V> values();
}
