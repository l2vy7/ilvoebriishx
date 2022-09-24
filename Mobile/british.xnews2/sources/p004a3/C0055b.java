package p004a3;

import p149t.C6077a;
import p149t.C6090g;

/* renamed from: a3.b */
/* compiled from: CachedHashCodeArrayMap */
public final class C0055b<K, V> extends C6077a<K, V> {

    /* renamed from: j */
    private int f173j;

    public void clear() {
        this.f173j = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f173j == 0) {
            this.f173j = super.hashCode();
        }
        return this.f173j;
    }

    /* renamed from: l */
    public void mo158l(C6090g<? extends K, ? extends V> gVar) {
        this.f173j = 0;
        super.mo158l(gVar);
    }

    /* renamed from: m */
    public V mo159m(int i) {
        this.f173j = 0;
        return super.mo159m(i);
    }

    /* renamed from: n */
    public V mo160n(int i, V v) {
        this.f173j = 0;
        return super.mo160n(i, v);
    }

    public V put(K k, V v) {
        this.f173j = 0;
        return super.put(k, v);
    }
}
