package com.google.ads.interactivemedia.p038v3.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bgi */
/* compiled from: IMASDK */
public final class bgi<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: f */
    private static final Comparator<Comparable> f16287f = new bgb();

    /* renamed from: a */
    final Comparator<? super K> f16288a;

    /* renamed from: b */
    bgh<K, V> f16289b;

    /* renamed from: c */
    int f16290c = 0;

    /* renamed from: d */
    int f16291d = 0;

    /* renamed from: e */
    final bgh<K, V> f16292e = new bgh<>();

    /* renamed from: g */
    private bgd f16293g;

    /* renamed from: h */
    private bgf f16294h;

    public bgi() {
        Comparator<Comparable> comparator = f16287f;
        this.f16288a = comparator;
    }

    /* renamed from: f */
    private final void m15847f(bgh<K, V> bgh, bgh<K, V> bgh2) {
        bgh<K, V> bgh3 = bgh.f16279a;
        bgh.f16279a = null;
        if (bgh2 != null) {
            bgh2.f16279a = bgh3;
        }
        if (bgh3 == null) {
            this.f16289b = bgh2;
        } else if (bgh3.f16280b == bgh) {
            bgh3.f16280b = bgh2;
        } else {
            bgh3.f16281c = bgh2;
        }
    }

    /* renamed from: g */
    private final void m15848g(bgh<K, V> bgh, boolean z) {
        while (bgh != null) {
            bgh<K, V> bgh2 = bgh.f16280b;
            bgh<K, V> bgh3 = bgh.f16281c;
            int i = 0;
            int i2 = bgh2 != null ? bgh2.f16286h : 0;
            int i3 = bgh3 != null ? bgh3.f16286h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                bgh<K, V> bgh4 = bgh3.f16280b;
                bgh<K, V> bgh5 = bgh3.f16281c;
                int i5 = bgh5 != null ? bgh5.f16286h : 0;
                if (bgh4 != null) {
                    i = bgh4.f16286h;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m15849h(bgh);
                } else {
                    m15850i(bgh3);
                    m15849h(bgh);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                bgh<K, V> bgh6 = bgh2.f16280b;
                bgh<K, V> bgh7 = bgh2.f16281c;
                int i7 = bgh7 != null ? bgh7.f16286h : 0;
                if (bgh6 != null) {
                    i = bgh6.f16286h;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m15850i(bgh);
                } else {
                    m15849h(bgh2);
                    m15850i(bgh);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                bgh.f16286h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                bgh.f16286h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            bgh = bgh.f16279a;
        }
    }

    /* renamed from: h */
    private final void m15849h(bgh<K, V> bgh) {
        bgh<K, V> bgh2 = bgh.f16280b;
        bgh<K, V> bgh3 = bgh.f16281c;
        bgh<K, V> bgh4 = bgh3.f16280b;
        bgh<K, V> bgh5 = bgh3.f16281c;
        bgh.f16281c = bgh4;
        if (bgh4 != null) {
            bgh4.f16279a = bgh;
        }
        m15847f(bgh, bgh3);
        bgh3.f16280b = bgh;
        bgh.f16279a = bgh3;
        int i = 0;
        int max = Math.max(bgh2 != null ? bgh2.f16286h : 0, bgh4 != null ? bgh4.f16286h : 0) + 1;
        bgh.f16286h = max;
        if (bgh5 != null) {
            i = bgh5.f16286h;
        }
        bgh3.f16286h = Math.max(max, i) + 1;
    }

    /* renamed from: i */
    private final void m15850i(bgh<K, V> bgh) {
        bgh<K, V> bgh2 = bgh.f16280b;
        bgh<K, V> bgh3 = bgh.f16281c;
        bgh<K, V> bgh4 = bgh2.f16280b;
        bgh<K, V> bgh5 = bgh2.f16281c;
        bgh.f16280b = bgh5;
        if (bgh5 != null) {
            bgh5.f16279a = bgh;
        }
        m15847f(bgh, bgh2);
        bgh2.f16281c = bgh;
        bgh.f16279a = bgh2;
        int i = 0;
        int max = Math.max(bgh3 != null ? bgh3.f16286h : 0, bgh5 != null ? bgh5.f16286h : 0) + 1;
        bgh.f16286h = max;
        if (bgh4 != null) {
            i = bgh4.f16286h;
        }
        bgh2.f16286h = Math.max(max, i) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bgh<K, V> mo15068a(K k, boolean z) {
        int i;
        bgh<K, V> bgh;
        Comparator<? super K> comparator = this.f16288a;
        bgh<K, V> bgh2 = this.f16289b;
        if (bgh2 != null) {
            Comparable comparable = comparator == f16287f ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(bgh2.f16284f);
                } else {
                    i = comparator.compare(k, bgh2.f16284f);
                }
                if (i == 0) {
                    return bgh2;
                }
                bgh<K, V> bgh3 = i < 0 ? bgh2.f16280b : bgh2.f16281c;
                if (bgh3 == null) {
                    break;
                }
                bgh2 = bgh3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        bgh<K, V> bgh4 = this.f16292e;
        if (bgh2 != null) {
            bgh = new bgh<>(bgh2, k, bgh4, bgh4.f16283e);
            if (i < 0) {
                bgh2.f16280b = bgh;
            } else {
                bgh2.f16281c = bgh;
            }
            m15848g(bgh2, true);
        } else if (comparator != f16287f || (k instanceof Comparable)) {
            bgh = new bgh<>((bgh) null, k, bgh4, bgh4.f16283e);
            this.f16289b = bgh;
        } else {
            throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
        }
        this.f16290c++;
        this.f16291d++;
        return bgh;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final bgh<K, V> mo15069b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo15068a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final bgh<K, V> mo15070c(Map.Entry<?, ?> entry) {
        bgh<K, V> b = mo15069b(entry.getKey());
        if (b == null) {
            return null;
        }
        V v = b.f16285g;
        V value = entry.getValue();
        if (v == value || (v != null && v.equals(value))) {
            return b;
        }
        return null;
    }

    public final void clear() {
        this.f16289b = null;
        this.f16290c = 0;
        this.f16291d++;
        bgh<K, V> bgh = this.f16292e;
        bgh.f16283e = bgh;
        bgh.f16282d = bgh;
    }

    public final boolean containsKey(Object obj) {
        return mo15069b(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo15073d(bgh<K, V> bgh, boolean z) {
        bgh<K, V> bgh2;
        int i;
        bgh<K, V> bgh3;
        if (z) {
            bgh<K, V> bgh4 = bgh.f16283e;
            bgh4.f16282d = bgh.f16282d;
            bgh.f16282d.f16283e = bgh4;
        }
        bgh<K, V> bgh5 = bgh.f16280b;
        bgh<K, V> bgh6 = bgh.f16281c;
        bgh<K, V> bgh7 = bgh.f16279a;
        int i2 = 0;
        if (bgh5 == null || bgh6 == null) {
            if (bgh5 != null) {
                m15847f(bgh, bgh5);
                bgh.f16280b = null;
            } else if (bgh6 != null) {
                m15847f(bgh, bgh6);
                bgh.f16281c = null;
            } else {
                m15847f(bgh, (bgh<K, V>) null);
            }
            m15848g(bgh7, false);
            this.f16290c--;
            this.f16291d++;
            return;
        }
        if (bgh5.f16286h > bgh6.f16286h) {
            do {
                bgh2 = bgh5;
                bgh5 = bgh5.f16281c;
            } while (bgh5 != null);
        } else {
            do {
                bgh<K, V> bgh8 = bgh6;
                bgh6 = bgh6.f16280b;
                bgh3 = bgh8;
            } while (bgh6 != null);
            bgh2 = bgh3;
        }
        mo15073d(bgh2, false);
        bgh<K, V> bgh9 = bgh.f16280b;
        if (bgh9 != null) {
            i = bgh9.f16286h;
            bgh2.f16280b = bgh9;
            bgh9.f16279a = bgh2;
            bgh.f16280b = null;
        } else {
            i = 0;
        }
        bgh<K, V> bgh10 = bgh.f16281c;
        if (bgh10 != null) {
            i2 = bgh10.f16286h;
            bgh2.f16281c = bgh10;
            bgh10.f16279a = bgh2;
            bgh.f16281c = null;
        }
        bgh2.f16286h = Math.max(i, i2) + 1;
        m15847f(bgh, bgh2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final bgh<K, V> mo15074e(Object obj) {
        bgh<K, V> b = mo15069b(obj);
        if (b != null) {
            mo15073d(b, true);
        }
        return b;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        bgd bgd = this.f16293g;
        if (bgd != null) {
            return bgd;
        }
        bgd bgd2 = new bgd(this);
        this.f16293g = bgd2;
        return bgd2;
    }

    public final V get(Object obj) {
        bgh b = mo15069b(obj);
        if (b != null) {
            return b.f16285g;
        }
        return null;
    }

    public final Set<K> keySet() {
        bgf bgf = this.f16294h;
        if (bgf != null) {
            return bgf;
        }
        bgf bgf2 = new bgf(this);
        this.f16294h = bgf2;
        return bgf2;
    }

    public final V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        bgh a = mo15068a(k, true);
        V v2 = a.f16285g;
        a.f16285g = v;
        return v2;
    }

    public final V remove(Object obj) {
        bgh e = mo15074e(obj);
        if (e != null) {
            return e.f16285g;
        }
        return null;
    }

    public final int size() {
        return this.f16290c;
    }
}
