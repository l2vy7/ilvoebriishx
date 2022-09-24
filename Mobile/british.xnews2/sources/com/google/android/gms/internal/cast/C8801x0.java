package com.google.android.gms.internal.cast;

import java.util.List;

/* renamed from: com.google.android.gms.internal.cast.x0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C8801x0 extends C4647y0 {

    /* renamed from: d */
    final transient int f44187d;

    /* renamed from: e */
    final transient int f44188e;

    /* renamed from: f */
    final /* synthetic */ C4647y0 f44189f;

    C8801x0(C4647y0 y0Var, int i, int i2) {
        this.f44189f = y0Var;
        this.f44187d = i;
        this.f44188e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] mo19128c() {
        return this.f44189f.mo19128c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo19130e() {
        return this.f44189f.mo19130e() + this.f44187d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo19131f() {
        return this.f44189f.mo19130e() + this.f44187d + this.f44188e;
    }

    public final Object get(int i) {
        C4640o0.m21338a(i, this.f44188e, "index");
        return this.f44189f.get(i + this.f44187d);
    }

    /* renamed from: i */
    public final C4647y0 mo19142i(int i, int i2) {
        C4640o0.m21340c(i, i2, this.f44188e);
        C4647y0 y0Var = this.f44189f;
        int i3 = this.f44187d;
        return y0Var.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f44188e;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
