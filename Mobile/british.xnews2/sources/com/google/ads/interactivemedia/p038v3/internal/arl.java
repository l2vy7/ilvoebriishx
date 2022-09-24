package com.google.ads.interactivemedia.p038v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arl */
/* compiled from: IMASDK */
public final class arl implements bfj {
    /* renamed from: a */
    public final <T> bfi<T> mo14244a(bet bet, biu<T> biu) {
        Class<? super T> a = biu.mo15133a();
        ark ark = (ark) a.getAnnotation(ark.class);
        if (ark == null || a == ark.mo14242a()) {
            return null;
        }
        return bet.mo14967d(ark.mo14242a());
    }
}
