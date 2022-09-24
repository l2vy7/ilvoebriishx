package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.s */
/* compiled from: ImmutableEntry */
class C4760s<K, V> extends C4707e<K, V> implements Serializable {
    @NullableDecl

    /* renamed from: b */
    final K f21508b;
    @NullableDecl

    /* renamed from: c */
    final V f21509c;

    C4760s(@NullableDecl K k, @NullableDecl V v) {
        this.f21508b = k;
        this.f21509c = v;
    }

    @NullableDecl
    public final K getKey() {
        return this.f21508b;
    }

    @NullableDecl
    public final V getValue() {
        return this.f21509c;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
