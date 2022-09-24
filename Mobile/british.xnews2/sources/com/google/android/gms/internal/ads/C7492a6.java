package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7492a6<T> {

    /* renamed from: a */
    public final T f29536a;

    /* renamed from: b */
    public final C7597d5 f29537b;

    /* renamed from: c */
    public final C7635e6 f29538c;

    /* renamed from: d */
    public boolean f29539d;

    private C7492a6(C7635e6 e6Var) {
        this.f29539d = false;
        this.f29536a = null;
        this.f29537b = null;
        this.f29538c = e6Var;
    }

    private C7492a6(T t, C7597d5 d5Var) {
        this.f29539d = false;
        this.f29536a = t;
        this.f29537b = d5Var;
        this.f29538c = null;
    }

    /* renamed from: a */
    public static <T> C7492a6<T> m30245a(C7635e6 e6Var) {
        return new C7492a6<>(e6Var);
    }

    /* renamed from: b */
    public static <T> C7492a6<T> m30246b(T t, C7597d5 d5Var) {
        return new C7492a6<>(t, d5Var);
    }

    /* renamed from: c */
    public final boolean mo30310c() {
        return this.f29538c == null;
    }
}
