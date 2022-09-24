package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: com.google.common.collect.o0 */
/* compiled from: ObjectArrays */
public final class C10404o0 {
    @CanIgnoreReturnValue
    /* renamed from: a */
    static Object m47946a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    static Object[] m47947b(Object... objArr) {
        return m47948c(objArr, objArr.length);
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    static Object[] m47948c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m47946a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m47949d(T[] tArr, int i) {
        return C10405q0.m47951b(tArr, i);
    }
}
