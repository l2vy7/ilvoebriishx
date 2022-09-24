package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pm */
/* compiled from: IMASDK */
public class C4263pm {

    /* renamed from: a */
    private int f18377a;

    /* renamed from: a */
    public void mo16508a() {
        this.f18377a = 0;
    }

    /* renamed from: b */
    public final boolean mo16509b() {
        return mo16515h(Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public final boolean mo16510c() {
        return mo16515h(4);
    }

    /* renamed from: d */
    public final boolean mo16511d() {
        return mo16515h(1);
    }

    /* renamed from: e */
    public final boolean mo16512e() {
        return mo16515h(268435456);
    }

    /* renamed from: f */
    public final void mo16513f(int i) {
        this.f18377a = i;
    }

    /* renamed from: g */
    public final void mo16514g(int i) {
        this.f18377a = i | this.f18377a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo16515h(int i) {
        return (this.f18377a & i) == i;
    }
}
