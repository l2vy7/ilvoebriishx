package com.google.ads.interactivemedia.p039v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aty */
/* compiled from: IMASDK */
final class aty extends atz {

    /* renamed from: a */
    final transient int f15742a;

    /* renamed from: b */
    final transient int f15743b;

    /* renamed from: c */
    final /* synthetic */ atz f15744c;

    aty(atz atz, int i, int i2) {
        this.f15744c = atz;
        this.f15742a = i;
        this.f15743b = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] mo14498b() {
        return this.f15744c.mo14498b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo14499c() {
        return this.f15744c.mo14499c() + this.f15742a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo14502d() {
        return this.f15744c.mo14499c() + this.f15742a + this.f15743b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo14504f() {
        return true;
    }

    public final Object get(int i) {
        ars.m14626f(i, this.f15743b);
        return this.f15744c.get(i + this.f15742a);
    }

    /* renamed from: h */
    public final atz mo14518h(int i, int i2) {
        ars.m14625e(i, i2, this.f15743b);
        atz atz = this.f15744c;
        int i3 = this.f15742a;
        return atz.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f15743b;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
