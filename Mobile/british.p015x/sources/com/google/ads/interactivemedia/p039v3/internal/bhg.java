package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bhg */
/* compiled from: IMASDK */
final class bhg implements bfj {

    /* renamed from: a */
    private final biu<?> f16347a;

    /* renamed from: b */
    private final boolean f16348b;

    /* renamed from: c */
    private final bfe<?> f16349c;

    /* renamed from: d */
    private final bex<?> f16350d;

    bhg(Object obj, biu<?> biu, boolean z) {
        bex<?> bex = null;
        bfe<?> bfe = obj instanceof bfe ? (bfe) obj : null;
        this.f16349c = bfe;
        bex = obj instanceof bex ? (bex) obj : bex;
        this.f16350d = bex;
        boolean z2 = true;
        if (bfe == null && bex == null) {
            z2 = false;
        }
        art.m14631b(z2);
        this.f16347a = biu;
        this.f16348b = z;
    }

    /* renamed from: a */
    public final <T> bfi<T> mo14244a(bet bet, biu<T> biu) {
        if (this.f16347a.equals(biu) || (this.f16348b && this.f16347a.mo15134b() == biu.mo15133a())) {
            return new bhh(this.f16349c, this.f16350d, bet, biu, this);
        }
        return null;
    }
}
