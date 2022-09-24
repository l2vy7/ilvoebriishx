package com.google.common.collect;

import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p149s6.C6073k;

/* renamed from: com.google.common.collect.k */
/* compiled from: Collections2 */
public final class C4728k {
    /* renamed from: a */
    static StringBuilder m21819a(int i) {
        C10393j.m47930b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }

    /* renamed from: b */
    static boolean m21820b(Collection<?> collection, @NullableDecl Object obj) {
        C6073k.m26688k(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
