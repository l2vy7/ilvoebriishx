package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.c */
/* compiled from: AbstractListMultimap */
abstract class C4687c<K, V> extends C4688d<K, V> implements C10389f0<K, V> {
    protected C4687c(Map<K, Collection<V>> map) {
        super(map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public <E> Collection<E> mo19508A(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public Collection<V> mo19509B(K k, Collection<V> collection) {
        return mo19515C(k, (List) collection, (C4688d<K, V>.k) null);
    }

    /* renamed from: D */
    public List<V> get(@NullableDecl K k) {
        return (List) super.get(k);
    }

    /* renamed from: b */
    public Map<K, Collection<V>> mo19511b() {
        return super.mo19511b();
    }

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k, @NullableDecl V v) {
        return super.put(k, v);
    }
}
