package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atb */
/* compiled from: IMASDK */
final class atb<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Object f15685d = new Object();

    /* renamed from: a */
    transient int[] f15686a;

    /* renamed from: b */
    transient Object[] f15687b;

    /* renamed from: c */
    transient Object[] f15688c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public transient Object f15689e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public transient int f15690f;

    /* renamed from: g */
    private transient int f15691g;

    /* renamed from: h */
    private transient Set<K> f15692h;

    /* renamed from: i */
    private transient Set<Map.Entry<K, V>> f15693i;

    /* renamed from: j */
    private transient Collection<V> f15694j;

    atb() {
        mo14417b(3);
    }

    /* renamed from: a */
    public static <K, V> atb<K, V> m14710a() {
        return new atb<>();
    }

    /* renamed from: p */
    static /* synthetic */ void m14717p(atb atb) {
        atb.f15691g--;
    }

    /* renamed from: q */
    private final void m14718q(int i) {
        this.f15690f = aup.m14880k(this.f15690f, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final int m14719r() {
        return (1 << (this.f15690f & 31)) - 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            mo14417b(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    /* renamed from: s */
    private final int m14720s(int i, int i2, int i3, int i4) {
        Object f = aup.m14875f(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            aup.m14877h(f, i3 & i5, i4 + 1);
        }
        Object obj = this.f15689e;
        int[] iArr = this.f15686a;
        for (int i6 = 0; i6 <= i; i6++) {
            int g = aup.m14876g(obj, i6);
            while (g != 0) {
                int i7 = g - 1;
                int i8 = iArr[i7];
                int j = aup.m14879j(i8, i) | i6;
                int i9 = j & i5;
                int g2 = aup.m14876g(f, i9);
                aup.m14877h(f, i9, g);
                iArr[i7] = aup.m14880k(j, g2, i5);
                g = i8 & i;
            }
        }
        this.f15689e = f;
        m14718q(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final int m14721t(Object obj) {
        if (mo14418c()) {
            return -1;
        }
        int d = aup.m14873d(obj);
        int r = m14719r();
        int g = aup.m14876g(this.f15689e, d & r);
        if (g == 0) {
            return -1;
        }
        int j = aup.m14879j(d, r);
        do {
            int i = g - 1;
            int i2 = this.f15686a[i];
            if (aup.m14879j(i2, r) == j && arq.m14618b(obj, this.f15687b[i])) {
                return i;
            }
            g = i2 & r;
        } while (g != 0);
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final Object m14722u(Object obj) {
        if (mo14418c()) {
            return f15685d;
        }
        int r = m14719r();
        int l = aup.m14881l(obj, (Object) null, r, this.f15689e, this.f15686a, this.f15687b, (Object[]) null);
        if (l == -1) {
            return f15685d;
        }
        Object obj2 = this.f15688c[l];
        mo14425f(l, r);
        this.f15691g--;
        mo14423e();
        return obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator i = mo14429i();
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14417b(int i) {
        ars.m14622b(true, "Expected size must be >= 0");
        this.f15690f = awa.m14990b(i, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo14418c() {
        return this.f15689e == null;
    }

    public final void clear() {
        if (!mo14418c()) {
            mo14423e();
            Map d = mo14422d();
            if (d != null) {
                this.f15690f = awa.m14990b(size(), 3);
                d.clear();
                this.f15689e = null;
                this.f15691g = 0;
                return;
            }
            Arrays.fill(this.f15687b, 0, this.f15691g, (Object) null);
            Arrays.fill(this.f15688c, 0, this.f15691g, (Object) null);
            Object obj = this.f15689e;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.f15686a, 0, this.f15691g, 0);
            this.f15691g = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map d = mo14422d();
        if (d != null) {
            return d.containsKey(obj);
        }
        return m14721t(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        Map d = mo14422d();
        if (d != null) {
            return d.containsValue(obj);
        }
        for (int i = 0; i < this.f15691g; i++) {
            if (arq.m14618b(obj, this.f15688c[i])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map<K, V> mo14422d() {
        Object obj = this.f15689e;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo14423e() {
        this.f15690f += 32;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f15693i;
        if (set != null) {
            return set;
        }
        asw asw = new asw(this);
        this.f15693i = asw;
        return asw;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo14425f(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f15687b;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f15688c;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f15686a;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int d = aup.m14873d(obj) & i2;
            int g = aup.m14876g(this.f15689e, d);
            int i3 = size + 1;
            if (g != i3) {
                while (true) {
                    int i4 = g - 1;
                    int[] iArr2 = this.f15686a;
                    int i5 = iArr2[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        g = i6;
                    } else {
                        iArr2[i4] = aup.m14880k(i5, i + 1, i2);
                        return;
                    }
                }
            } else {
                aup.m14877h(this.f15689e, d, i + 1);
            }
        } else {
            this.f15687b[i] = null;
            this.f15688c[i] = null;
            this.f15686a[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo14426g() {
        return isEmpty() ? -1 : 0;
    }

    public final V get(Object obj) {
        Map d = mo14422d();
        if (d != null) {
            return d.get(obj);
        }
        int t = m14721t(obj);
        if (t == -1) {
            return null;
        }
        return this.f15688c[t];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo14428h(int i) {
        int i2 = i + 1;
        if (i2 < this.f15691g) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Iterator<Map.Entry<K, V>> mo14429i() {
        Map d = mo14422d();
        if (d != null) {
            return d.entrySet().iterator();
        }
        return new asu(this);
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f15692h;
        if (set != null) {
            return set;
        }
        asy asy = new asy(this);
        this.f15692h = asy;
        return asy;
    }

    public final V put(K k, V v) {
        int min;
        K k2 = k;
        V v2 = v;
        if (mo14418c()) {
            ars.m14624d(mo14418c(), "Arrays already allocated");
            int i = this.f15690f;
            int max = Math.max(4, aup.m14874e(i + 1));
            this.f15689e = aup.m14875f(max);
            m14718q(max - 1);
            this.f15686a = new int[i];
            this.f15687b = new Object[i];
            this.f15688c = new Object[i];
        }
        Map d = mo14422d();
        if (d != null) {
            return d.put(k2, v2);
        }
        int[] iArr = this.f15686a;
        Object[] objArr = this.f15687b;
        V[] vArr = this.f15688c;
        int i2 = this.f15691g;
        int i3 = i2 + 1;
        int d2 = aup.m14873d(k);
        int r = m14719r();
        int i4 = d2 & r;
        int g = aup.m14876g(this.f15689e, i4);
        if (g != 0) {
            int j = aup.m14879j(d2, r);
            int i5 = 0;
            while (true) {
                int i6 = g - 1;
                int i7 = iArr[i6];
                if (aup.m14879j(i7, r) != j || !arq.m14618b(k2, objArr[i6])) {
                    int i8 = i7 & r;
                    i5++;
                    if (i8 != 0) {
                        g = i8;
                    } else if (i5 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m14719r() + 1, 1.0f);
                        for (int g2 = mo14426g(); g2 >= 0; g2 = mo14428h(g2)) {
                            linkedHashMap.put(this.f15687b[g2], this.f15688c[g2]);
                        }
                        this.f15689e = linkedHashMap;
                        this.f15686a = null;
                        this.f15687b = null;
                        this.f15688c = null;
                        mo14423e();
                        return linkedHashMap.put(k2, v2);
                    } else if (i3 > r) {
                        r = m14720s(r, aup.m14878i(r), d2, i2);
                    } else {
                        iArr[i6] = aup.m14880k(i7, i3, r);
                    }
                } else {
                    V v3 = vArr[i6];
                    vArr[i6] = v2;
                    return v3;
                }
            }
        } else if (i3 > r) {
            r = m14720s(r, aup.m14878i(r), d2, i2);
        } else {
            aup.m14877h(this.f15689e, i4, i3);
        }
        int length = this.f15686a.length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f15686a = Arrays.copyOf(this.f15686a, min);
            this.f15687b = Arrays.copyOf(this.f15687b, min);
            this.f15688c = Arrays.copyOf(this.f15688c, min);
        }
        this.f15686a[i2] = aup.m14880k(d2, 0, r);
        this.f15687b[i2] = k2;
        this.f15688c[i2] = v2;
        this.f15691g = i3;
        mo14423e();
        return null;
    }

    public final V remove(Object obj) {
        Map d = mo14422d();
        if (d != null) {
            return d.remove(obj);
        }
        V u = m14722u(obj);
        if (u == f15685d) {
            return null;
        }
        return u;
    }

    public final int size() {
        Map d = mo14422d();
        return d != null ? d.size() : this.f15691g;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f15694j;
        if (collection != null) {
            return collection;
        }
        ata ata = new ata(this);
        this.f15694j = ata;
        return ata;
    }
}
