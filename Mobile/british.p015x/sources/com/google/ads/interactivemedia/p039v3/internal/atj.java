package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atj */
/* compiled from: IMASDK */
final class atj<K, V> extends aso<V, K> {

    /* renamed from: a */
    final atr<K, V> f15704a;

    /* renamed from: b */
    final V f15705b;

    /* renamed from: c */
    int f15706c;

    atj(atr<K, V> atr, int i) {
        this.f15704a = atr;
        this.f15705b = atr.f15719b[i];
        this.f15706c = i;
    }

    /* renamed from: a */
    private final void m14753a() {
        int i = this.f15706c;
        if (i != -1) {
            atr<K, V> atr = this.f15704a;
            if (i <= atr.f15720c && arq.m14618b(this.f15705b, atr.f15719b[i])) {
                return;
            }
        }
        this.f15706c = this.f15704a.mo14479d(this.f15705b);
    }

    public final V getKey() {
        return this.f15705b;
    }

    public final K getValue() {
        m14753a();
        int i = this.f15706c;
        if (i == -1) {
            return null;
        }
        return this.f15704a.f15718a[i];
    }

    public final K setValue(K k) {
        m14753a();
        int i = this.f15706c;
        if (i == -1) {
            return this.f15704a.mo14490q(this.f15705b, k);
        }
        K k2 = this.f15704a.f15718a[i];
        if (arq.m14618b(k2, k)) {
            return k;
        }
        this.f15704a.m14761B(this.f15706c, k);
        return k2;
    }
}
