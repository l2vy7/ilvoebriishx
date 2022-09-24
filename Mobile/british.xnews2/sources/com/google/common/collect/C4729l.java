package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6069h;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.l */
/* compiled from: CompactHashMap */
class C4729l<K, V> extends AbstractMap<K, V> implements Serializable {
    @MonotonicNonNullDecl

    /* renamed from: b */
    private transient int[] f21441b;
    @MonotonicNonNullDecl

    /* renamed from: c */
    transient long[] f21442c;
    @MonotonicNonNullDecl

    /* renamed from: d */
    transient Object[] f21443d;
    @MonotonicNonNullDecl

    /* renamed from: e */
    transient Object[] f21444e;

    /* renamed from: f */
    transient float f21445f;

    /* renamed from: g */
    transient int f21446g;

    /* renamed from: h */
    private transient int f21447h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public transient int f21448i;
    @MonotonicNonNullDecl

    /* renamed from: j */
    private transient Set<K> f21449j;
    @MonotonicNonNullDecl

    /* renamed from: k */
    private transient Set<Map.Entry<K, V>> f21450k;
    @MonotonicNonNullDecl

    /* renamed from: l */
    private transient Collection<V> f21451l;

    /* renamed from: com.google.common.collect.l$d */
    /* compiled from: CompactHashMap */
    class C4730d extends AbstractSet<Map.Entry<K, V>> {
        C4730d() {
        }

        public void clear() {
            C4729l.this.clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int d = C4729l.this.m21833s(entry.getKey());
            if (d == -1 || !C6069h.m26674a(C4729l.this.f21444e[d], entry.getValue())) {
                return false;
            }
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return C4729l.this.mo19733m();
        }

        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int d = C4729l.this.m21833s(entry.getKey());
            if (d == -1 || !C6069h.m26674a(C4729l.this.f21444e[d], entry.getValue())) {
                return false;
            }
            Object unused = C4729l.this.m21821A(d);
            return true;
        }

        public int size() {
            return C4729l.this.f21448i;
        }
    }

    /* renamed from: com.google.common.collect.l$f */
    /* compiled from: CompactHashMap */
    class C4731f extends AbstractSet<K> {
        C4731f() {
        }

        public void clear() {
            C4729l.this.clear();
        }

        public boolean contains(Object obj) {
            return C4729l.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return C4729l.this.mo19741v();
        }

        public boolean remove(@NullableDecl Object obj) {
            int d = C4729l.this.m21833s(obj);
            if (d == -1) {
                return false;
            }
            Object unused = C4729l.this.m21821A(d);
            return true;
        }

        public int size() {
            return C4729l.this.f21448i;
        }
    }

    /* renamed from: com.google.common.collect.l$g */
    /* compiled from: CompactHashMap */
    final class C4732g extends C4707e<K, V> {
        @NullableDecl

        /* renamed from: b */
        private final K f21454b;

        /* renamed from: c */
        private int f21455c;

        C4732g(int i) {
            this.f21454b = C4729l.this.f21443d[i];
            this.f21455c = i;
        }

        /* renamed from: a */
        private void m21851a() {
            int i = this.f21455c;
            if (i == -1 || i >= C4729l.this.size() || !C6069h.m26674a(this.f21454b, C4729l.this.f21443d[this.f21455c])) {
                this.f21455c = C4729l.this.m21833s(this.f21454b);
            }
        }

        public K getKey() {
            return this.f21454b;
        }

        public V getValue() {
            m21851a();
            int i = this.f21455c;
            if (i == -1) {
                return null;
            }
            return C4729l.this.f21444e[i];
        }

        public V setValue(V v) {
            m21851a();
            int i = this.f21455c;
            if (i == -1) {
                C4729l.this.put(this.f21454b, v);
                return null;
            }
            V[] vArr = C4729l.this.f21444e;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }
    }

    /* renamed from: com.google.common.collect.l$a */
    /* compiled from: CompactHashMap */
    class C4733a extends C4729l<K, V>.e<K> {
        C4733a() {
            super(C4729l.this, (C4733a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public K mo19755b(int i) {
            return C4729l.this.f21443d[i];
        }
    }

    /* renamed from: com.google.common.collect.l$b */
    /* compiled from: CompactHashMap */
    class C4734b extends C4729l<K, V>.e<Map.Entry<K, V>> {
        C4734b() {
            super(C4729l.this, (C4733a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Map.Entry<K, V> mo19755b(int i) {
            return new C4732g(i);
        }
    }

    /* renamed from: com.google.common.collect.l$c */
    /* compiled from: CompactHashMap */
    class C4735c extends C4729l<K, V>.e<V> {
        C4735c() {
            super(C4729l.this, (C4733a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public V mo19755b(int i) {
            return C4729l.this.f21444e[i];
        }
    }

    /* renamed from: com.google.common.collect.l$h */
    /* compiled from: CompactHashMap */
    class C4737h extends AbstractCollection<V> {
        C4737h() {
        }

        public void clear() {
            C4729l.this.clear();
        }

        public Iterator<V> iterator() {
            return C4729l.this.mo19720F();
        }

        public int size() {
            return C4729l.this.f21448i;
        }
    }

    C4729l() {
        mo19739t(3, 1.0f);
    }

    /* access modifiers changed from: private */
    @CanIgnoreReturnValue
    /* renamed from: A */
    public V m21821A(int i) {
        return m21836z(this.f21443d[i], m21830o(this.f21442c[i]));
    }

    /* renamed from: C */
    private void m21822C(int i) {
        int length = this.f21442c.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo19719B(max);
            }
        }
    }

    /* renamed from: D */
    private void m21823D(int i) {
        if (this.f21441b.length >= 1073741824) {
            this.f21447h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f21445f)) + 1;
        int[] y = m21835y(i);
        long[] jArr = this.f21442c;
        int length = y.length - 1;
        for (int i3 = 0; i3 < this.f21448i; i3++) {
            int o = m21830o(jArr[i3]);
            int i4 = o & length;
            int i5 = y[i4];
            y[i4] = i3;
            jArr[i3] = (((long) o) << 32) | (4294967295L & ((long) i5));
        }
        this.f21447h = i2;
        this.f21441b = y;
    }

    /* renamed from: E */
    private static long m21824E(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: g */
    public static <K, V> C4729l<K, V> m21828g() {
        return new C4729l<>();
    }

    /* renamed from: l */
    public static <K, V> C4729l<K, V> m21829l(int i) {
        return new C4729l<>(i);
    }

    /* renamed from: o */
    private static int m21830o(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: p */
    private static int m21831p(long j) {
        return (int) j;
    }

    /* renamed from: r */
    private int m21832r() {
        return this.f21441b.length - 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        mo19739t(3, 1.0f);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public int m21833s(@NullableDecl Object obj) {
        int c = C4756q.m21945c(obj);
        int i = this.f21441b[m21832r() & c];
        while (i != -1) {
            long j = this.f21442c[i];
            if (m21830o(j) == c && C6069h.m26674a(obj, this.f21443d[i])) {
                return i;
            }
            i = m21831p(j);
        }
        return -1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f21448i);
        for (int i = 0; i < this.f21448i; i++) {
            objectOutputStream.writeObject(this.f21443d[i]);
            objectOutputStream.writeObject(this.f21444e[i]);
        }
    }

    /* renamed from: x */
    private static long[] m21834x(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    /* renamed from: y */
    private static int[] m21835y(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @NullableDecl
    /* renamed from: z */
    private V m21836z(@NullableDecl Object obj, int i) {
        int r = m21832r() & i;
        int i2 = this.f21441b[r];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (m21830o(this.f21442c[i2]) != i || !C6069h.m26674a(obj, this.f21443d[i2])) {
                int p = m21831p(this.f21442c[i2]);
                if (p == -1) {
                    return null;
                }
                int i4 = p;
                i3 = i2;
                i2 = i4;
            } else {
                V v = this.f21444e[i2];
                if (i3 == -1) {
                    this.f21441b[r] = m21831p(this.f21442c[i2]);
                } else {
                    long[] jArr = this.f21442c;
                    jArr[i3] = m21824E(jArr[i3], m21831p(jArr[i2]));
                }
                mo19743w(i2);
                this.f21448i--;
                this.f21446g++;
                return v;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo19719B(int i) {
        this.f21443d = Arrays.copyOf(this.f21443d, i);
        this.f21444e = Arrays.copyOf(this.f21444e, i);
        long[] jArr = this.f21442c;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f21442c = copyOf;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public Iterator<V> mo19720F() {
        return new C4735c();
    }

    public void clear() {
        this.f21446g++;
        Arrays.fill(this.f21443d, 0, this.f21448i, (Object) null);
        Arrays.fill(this.f21444e, 0, this.f21448i, (Object) null);
        Arrays.fill(this.f21441b, -1);
        Arrays.fill(this.f21442c, -1);
        this.f21448i = 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return m21833s(obj) != -1;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        for (int i = 0; i < this.f21448i; i++) {
            if (C6069h.m26674a(obj, this.f21444e[i])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo19724e(int i) {
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f21450k;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> h = mo19728h();
        this.f21450k = h;
        return h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo19726f(int i, int i2) {
        return i - 1;
    }

    public V get(@NullableDecl Object obj) {
        int s = m21833s(obj);
        mo19724e(s);
        if (s == -1) {
            return null;
        }
        return this.f21444e[s];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Set<Map.Entry<K, V>> mo19728h() {
        return new C4730d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Set<K> mo19729i() {
        return new C4731f();
    }

    public boolean isEmpty() {
        return this.f21448i == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Collection<V> mo19731j() {
        return new C4737h();
    }

    public Set<K> keySet() {
        Set<K> set = this.f21449j;
        if (set != null) {
            return set;
        }
        Set<K> i = mo19729i();
        this.f21449j = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Iterator<Map.Entry<K, V>> mo19733m() {
        return new C4734b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo19734n() {
        return isEmpty() ? -1 : 0;
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k, @NullableDecl V v) {
        long[] jArr = this.f21442c;
        Object[] objArr = this.f21443d;
        V[] vArr = this.f21444e;
        int c = C4756q.m21945c(k);
        int r = m21832r() & c;
        int i = this.f21448i;
        int[] iArr = this.f21441b;
        int i2 = iArr[r];
        if (i2 == -1) {
            iArr[r] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (m21830o(j) != c || !C6069h.m26674a(k, objArr[i2])) {
                    int p = m21831p(j);
                    if (p == -1) {
                        jArr[i2] = m21824E(j, i);
                        break;
                    }
                    i2 = p;
                } else {
                    V v2 = vArr[i2];
                    vArr[i2] = v;
                    mo19724e(i2);
                    return v2;
                }
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            m21822C(i3);
            mo19740u(i, k, v, c);
            this.f21448i = i3;
            if (i >= this.f21447h) {
                m21823D(this.f21441b.length * 2);
            }
            this.f21446g++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo19736q(int i) {
        int i2 = i + 1;
        if (i2 < this.f21448i) {
            return i2;
        }
        return -1;
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        return m21836z(obj, C4756q.m21945c(obj));
    }

    public int size() {
        return this.f21448i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo19739t(int i, float f) {
        boolean z = false;
        C6073k.m26682e(i >= 0, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z = true;
        }
        C6073k.m26682e(z, "Illegal load factor");
        int a = C4756q.m21943a(i, (double) f);
        this.f21441b = m21835y(a);
        this.f21445f = f;
        this.f21443d = new Object[i];
        this.f21444e = new Object[i];
        this.f21442c = m21834x(i);
        this.f21447h = Math.max(1, (int) (((float) a) * f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo19740u(int i, @NullableDecl K k, @NullableDecl V v, int i2) {
        this.f21442c[i] = (((long) i2) << 32) | 4294967295L;
        this.f21443d[i] = k;
        this.f21444e[i] = v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Iterator<K> mo19741v() {
        return new C4733a();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f21451l;
        if (collection != null) {
            return collection;
        }
        Collection<V> j = mo19731j();
        this.f21451l = j;
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo19743w(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f21443d;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.f21444e;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f21442c;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int o = m21830o(j) & m21832r();
            int[] iArr = this.f21441b;
            int i2 = iArr[o];
            if (i2 == size) {
                iArr[o] = i;
                return;
            }
            while (true) {
                long j2 = this.f21442c[i2];
                int p = m21831p(j2);
                if (p == size) {
                    this.f21442c[i2] = m21824E(j2, i);
                    return;
                }
                i2 = p;
            }
        } else {
            this.f21443d[i] = null;
            this.f21444e[i] = null;
            this.f21442c[i] = -1;
        }
    }

    C4729l(int i) {
        this(i, 1.0f);
    }

    /* renamed from: com.google.common.collect.l$e */
    /* compiled from: CompactHashMap */
    private abstract class C4736e<T> implements Iterator<T> {

        /* renamed from: b */
        int f21460b;

        /* renamed from: c */
        int f21461c;

        /* renamed from: d */
        int f21462d;

        private C4736e() {
            this.f21460b = C4729l.this.f21446g;
            this.f21461c = C4729l.this.mo19734n();
            this.f21462d = -1;
        }

        /* renamed from: a */
        private void m21856a() {
            if (C4729l.this.f21446g != this.f21460b) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract T mo19755b(int i);

        public boolean hasNext() {
            return this.f21461c >= 0;
        }

        public T next() {
            m21856a();
            if (hasNext()) {
                int i = this.f21461c;
                this.f21462d = i;
                T b = mo19755b(i);
                this.f21461c = C4729l.this.mo19736q(this.f21461c);
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            m21856a();
            C10393j.m47931c(this.f21462d >= 0);
            this.f21460b++;
            Object unused = C4729l.this.m21821A(this.f21462d);
            this.f21461c = C4729l.this.mo19726f(this.f21461c, this.f21462d);
            this.f21462d = -1;
        }

        /* synthetic */ C4736e(C4729l lVar, C4733a aVar) {
            this();
        }
    }

    C4729l(int i, float f) {
        mo19739t(i, f);
    }
}
