package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.j */
/* compiled from: CollectPreconditions */
final class C10393j {
    /* renamed from: a */
    static void m47929a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    static int m47930b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: c */
    static void m47931c(boolean z) {
        C6073k.m26694q(z, "no calls to next() since the last call to remove()");
    }
}
