package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.common.collect.q0 */
/* compiled from: Platform */
final class C10405q0 {
    /* renamed from: a */
    static <T> T[] m47950a(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* renamed from: b */
    static <T> T[] m47951b(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }

    /* renamed from: c */
    static <K, V> Map<K, V> m47952c(int i) {
        return C4729l.m21829l(i);
    }

    /* renamed from: d */
    static <K, V> Map<K, V> m47953d() {
        return C4729l.m21828g();
    }
}
