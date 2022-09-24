package com.google.ads.interactivemedia.p038v3.internal;

import java.util.Comparator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atd */
/* compiled from: IMASDK */
final class atd extends atf {
    atd() {
    }

    /* renamed from: f */
    static final atf m14731f(int i) {
        return i < 0 ? atf.f15698b : i > 0 ? atf.f15699c : atf.f15697a;
    }

    /* renamed from: a */
    public final <T> atf mo14440a(T t, T t2, Comparator<T> comparator) {
        return m14731f(comparator.compare(t, t2));
    }

    /* renamed from: b */
    public final atf mo14441b(int i, int i2) {
        return m14731f(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    /* renamed from: c */
    public final atf mo14442c(boolean z, boolean z2) {
        return m14731f(awa.m14991c(z2, z));
    }

    /* renamed from: d */
    public final atf mo14443d(boolean z, boolean z2) {
        return m14731f(awa.m14991c(z, z2));
    }

    /* renamed from: e */
    public final int mo14444e() {
        return 0;
    }
}
