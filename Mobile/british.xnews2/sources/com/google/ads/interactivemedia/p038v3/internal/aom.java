package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aom */
/* compiled from: IMASDK */
public final class aom<T> {

    /* renamed from: a */
    private final String f15500a;

    /* renamed from: b */
    private final T f15501b;

    /* renamed from: c */
    private final int f15502c = 1;

    protected aom(String str, T t, int i) {
        this.f15500a = str;
        this.f15501b = t;
    }

    /* renamed from: a */
    public static aom<Boolean> m14470a(String str, boolean z) {
        return new aom<>(str, Boolean.valueOf(z), 1);
    }

    /* renamed from: b */
    public final T mo14160b() {
        aop a = aoq.m14473a();
        if (a != null) {
            return a.mo14154a(this.f15500a, ((Boolean) this.f15501b).booleanValue());
        }
        throw new IllegalStateException("Flag is not initialized.");
    }
}
