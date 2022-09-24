package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C7719gg {

    /* renamed from: a */
    private int f32297a;

    /* renamed from: a */
    public final void mo32116a(int i) {
        this.f32297a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo32117b() {
        this.f32297a = 0;
    }

    /* renamed from: c */
    public final void mo32118c(int i) {
        this.f32297a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32119d(int i) {
        return (this.f32297a & i) == i;
    }

    /* renamed from: e */
    public final boolean mo32120e() {
        return mo32119d(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public final boolean mo32121f() {
        return mo32119d(4);
    }

    /* renamed from: g */
    public final boolean mo32122g() {
        return mo32119d(1);
    }
}
