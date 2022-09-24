package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.h */
/* compiled from: BiMap */
public interface C4716h<K, V> extends Map<K, V> {
    @NullableDecl
    @CanIgnoreReturnValue
    /* renamed from: a */
    V mo19687a(@NullableDecl K k, @NullableDecl V v);

    /* renamed from: k */
    C4716h<V, K> mo19688k();
}
