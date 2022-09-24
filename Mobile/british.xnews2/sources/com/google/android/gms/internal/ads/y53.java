package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class y53<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Object f21007k = new Object();
    @CheckForNull

    /* renamed from: b */
    private transient Object f21008b;
    @CheckForNull

    /* renamed from: c */
    transient int[] f21009c;
    @CheckForNull

    /* renamed from: d */
    transient Object[] f21010d;
    @CheckForNull

    /* renamed from: e */
    transient Object[] f21011e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public transient int f21012f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public transient int f21013g;
    @CheckForNull

    /* renamed from: h */
    private transient Set<K> f21014h;
    @CheckForNull

    /* renamed from: i */
    private transient Set<Map.Entry<K, V>> f21015i;
    @CheckForNull

    /* renamed from: j */
    private transient Collection<V> f21016j;

    y53() {
        mo19008u(3);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final int m21188A() {
        return (1 << (this.f21012f & 31)) - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final int m21189B(@CheckForNull Object obj) {
        if (mo19011w()) {
            return -1;
        }
        int b = h63.m20519b(obj);
        int A = m21188A();
        Object obj2 = this.f21008b;
        obj2.getClass();
        int c = z53.m21261c(obj2, b & A);
        if (c != 0) {
            int i = A ^ -1;
            int i2 = b & i;
            do {
                int i3 = c - 1;
                int i4 = m21193b()[i3];
                if ((i4 & i) == i2 && x33.m21118a(obj, m21194c()[i3])) {
                    return i3;
                }
                c = i4 & A;
            } while (c != 0);
        }
        return -1;
    }

    /* renamed from: C */
    private final int m21190C(int i, int i2, int i3, int i4) {
        Object d = z53.m21262d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            z53.m21263e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f21008b;
        obj.getClass();
        int[] b = m21193b();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = z53.m21261c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = b[i7];
                int i9 = ((i ^ -1) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = z53.m21261c(d, i10);
                z53.m21263e(d, i10, c);
                b[i7] = ((i5 ^ -1) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f21008b = d;
        m21192E(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final Object m21191D(@CheckForNull Object obj) {
        if (mo19011w()) {
            return f21007k;
        }
        int A = m21188A();
        Object obj2 = this.f21008b;
        obj2.getClass();
        int b = z53.m21260b(obj, (Object) null, A, obj2, m21193b(), m21194c(), (Object[]) null);
        if (b == -1) {
            return f21007k;
        }
        Object obj3 = m21195d()[b];
        mo19009v(b, A);
        this.f21013g--;
        mo19007t();
        return obj3;
    }

    /* renamed from: E */
    private final void m21192E(int i) {
        this.f21012f = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f21012f & -32);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final int[] m21193b() {
        int[] iArr = this.f21009c;
        iArr.getClass();
        return iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Object[] m21194c() {
        Object[] objArr = this.f21010d;
        objArr.getClass();
        return objArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final Object[] m21195d() {
        Object[] objArr = this.f21011e;
        objArr.getClass();
        return objArr;
    }

    /* renamed from: l */
    static /* synthetic */ Object m21200l(y53 y53, int i) {
        return y53.m21194c()[i];
    }

    /* renamed from: n */
    static /* synthetic */ Object m21202n(y53 y53) {
        Object obj = y53.f21008b;
        obj.getClass();
        return obj;
    }

    /* renamed from: o */
    static /* synthetic */ Object m21203o(y53 y53, int i) {
        return y53.m21195d()[i];
    }

    /* renamed from: s */
    static /* synthetic */ void m21206s(y53 y53, int i, Object obj) {
        y53.m21195d()[i] = obj;
    }

    public final void clear() {
        if (!mo19011w()) {
            mo19007t();
            Map q = mo19004q();
            if (q != null) {
                this.f21012f = z83.m40202a(size(), 3, 1073741823);
                q.clear();
                this.f21008b = null;
                this.f21013g = 0;
                return;
            }
            Arrays.fill(m21194c(), 0, this.f21013g, (Object) null);
            Arrays.fill(m21195d(), 0, this.f21013g, (Object) null);
            Object obj = this.f21008b;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(m21193b(), 0, this.f21013g, 0);
            this.f21013g = 0;
        }
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        Map q = mo19004q();
        if (q != null) {
            return q.containsKey(obj);
        }
        return m21189B(obj) != -1;
    }

    public final boolean containsValue(@CheckForNull Object obj) {
        Map q = mo19004q();
        if (q != null) {
            return q.containsValue(obj);
        }
        for (int i = 0; i < this.f21013g; i++) {
            if (x33.m21118a(obj, m21195d()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f21015i;
        if (set != null) {
            return set;
        }
        r53 r53 = new r53(this);
        this.f21015i = r53;
        return r53;
    }

    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        Map q = mo19004q();
        if (q != null) {
            return q.get(obj);
        }
        int B = m21189B(obj);
        if (B == -1) {
            return null;
        }
        return m21195d()[B];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo18999i() {
        return isEmpty() ? -1 : 0;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo19001j(int i) {
        int i2 = i + 1;
        if (i2 < this.f21013g) {
            return i2;
        }
        return -1;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f21014h;
        if (set != null) {
            return set;
        }
        u53 u53 = new u53(this);
        this.f21014h = u53;
        return u53;
    }

    @CheckForNull
    public final V put(K k, V v) {
        int min;
        K k2 = k;
        V v2 = v;
        if (mo19011w()) {
            b43.m20210g(mo19011w(), "Arrays already allocated");
            int i = this.f21012f;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f21008b = z53.m21262d(max2);
            m21192E(max2 - 1);
            this.f21009c = new int[i];
            this.f21010d = new Object[i];
            this.f21011e = new Object[i];
        }
        Map q = mo19004q();
        if (q != null) {
            return q.put(k2, v2);
        }
        int[] b = m21193b();
        Object[] c = m21194c();
        V[] d = m21195d();
        int i2 = this.f21013g;
        int i3 = i2 + 1;
        int b2 = h63.m20519b(k);
        int A = m21188A();
        int i4 = b2 & A;
        Object obj = this.f21008b;
        obj.getClass();
        int c2 = z53.m21261c(obj, i4);
        if (c2 != 0) {
            int i5 = A ^ -1;
            int i6 = b2 & i5;
            int i7 = 0;
            while (true) {
                int i8 = c2 - 1;
                int i9 = b[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !x33.m21118a(k2, c[i8])) {
                    int i11 = i9 & A;
                    i7++;
                    if (i11 != 0) {
                        c2 = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m21188A() + 1, 1.0f);
                        for (int i12 = mo18999i(); i12 >= 0; i12 = mo19001j(i12)) {
                            linkedHashMap.put(m21194c()[i12], m21195d()[i12]);
                        }
                        this.f21008b = linkedHashMap;
                        this.f21009c = null;
                        this.f21010d = null;
                        this.f21011e = null;
                        mo19007t();
                        return linkedHashMap.put(k2, v2);
                    } else if (i3 > A) {
                        A = m21190C(A, z53.m21259a(A), b2, i2);
                    } else {
                        b[i8] = (i3 & A) | i10;
                    }
                } else {
                    V v3 = d[i8];
                    d[i8] = v2;
                    return v3;
                }
            }
        } else if (i3 > A) {
            A = m21190C(A, z53.m21259a(A), b2, i2);
        } else {
            Object obj2 = this.f21008b;
            obj2.getClass();
            z53.m21263e(obj2, i4, i3);
        }
        int length = m21193b().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f21009c = Arrays.copyOf(m21193b(), min);
            this.f21010d = Arrays.copyOf(m21194c(), min);
            this.f21011e = Arrays.copyOf(m21195d(), min);
        }
        m21193b()[i2] = (A ^ -1) & b2;
        m21194c()[i2] = k2;
        m21195d()[i2] = v2;
        this.f21013g = i3;
        mo19007t();
        return null;
    }

    /* access modifiers changed from: package-private */
    @CheckForNull
    /* renamed from: q */
    public final Map<K, V> mo19004q() {
        Object obj = this.f21008b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        Map q = mo19004q();
        if (q != null) {
            return q.remove(obj);
        }
        V D = m21191D(obj);
        if (D == f21007k) {
            return null;
        }
        return D;
    }

    public final int size() {
        Map q = mo19004q();
        return q != null ? q.size() : this.f21013g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo19007t() {
        this.f21012f += 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo19008u(int i) {
        this.f21012f = z83.m40202a(i, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo19009v(int i, int i2) {
        Object obj = this.f21008b;
        obj.getClass();
        int[] b = m21193b();
        Object[] c = m21194c();
        Object[] d = m21195d();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = c[size];
            c[i] = obj2;
            d[i] = d[size];
            c[size] = null;
            d[size] = null;
            b[i] = b[size];
            b[size] = 0;
            int b2 = h63.m20519b(obj2) & i2;
            int c2 = z53.m21261c(obj, b2);
            int i3 = size + 1;
            if (c2 != i3) {
                while (true) {
                    int i4 = c2 - 1;
                    int i5 = b[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        c2 = i6;
                    } else {
                        b[i4] = ((i + 1) & i2) | (i5 & (i2 ^ -1));
                        return;
                    }
                }
            } else {
                z53.m21263e(obj, b2, i + 1);
            }
        } else {
            c[i] = null;
            d[i] = null;
            b[i] = 0;
        }
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f21016j;
        if (collection != null) {
            return collection;
        }
        x53 x53 = new x53(this);
        this.f21016j = x53;
        return x53;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo19011w() {
        return this.f21008b == null;
    }

    y53(int i) {
        mo19008u(8);
    }
}
