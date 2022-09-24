package com.google.common.collect;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6069h;

/* renamed from: com.google.common.collect.e */
/* compiled from: AbstractMapEntry */
abstract class C4707e<K, V> implements Map.Entry<K, V> {
    C4707e() {
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C6069h.m26674a(getKey(), entry.getKey()) || !C6069h.m26674a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
