package com.google.common.collect;

import com.google.common.collect.C4757r;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6069h;
import p148s6.C6073k;

/* renamed from: com.google.common.collect.p */
/* compiled from: HashBiMap */
public final class C4745p<K, V> extends AbstractMap<K, V> implements C4716h<K, V>, Serializable {

    /* renamed from: b */
    transient K[] f21471b;

    /* renamed from: c */
    transient V[] f21472c;

    /* renamed from: d */
    transient int f21473d;

    /* renamed from: e */
    transient int f21474e;

    /* renamed from: f */
    private transient int[] f21475f;

    /* renamed from: g */
    private transient int[] f21476g;

    /* renamed from: h */
    private transient int[] f21477h;

    /* renamed from: i */
    private transient int[] f21478i;
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: j */
    public transient int f21479j;
    @NullableDecl

    /* renamed from: k */
    private transient int f21480k;

    /* renamed from: l */
    private transient int[] f21481l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public transient int[] f21482m;

    /* renamed from: n */
    private transient Set<K> f21483n;

    /* renamed from: o */
    private transient Set<V> f21484o;

    /* renamed from: p */
    private transient Set<Map.Entry<K, V>> f21485p;
    /* access modifiers changed from: private */
    @RetainedWith
    @MonotonicNonNullDecl

    /* renamed from: q */
    public transient C4716h<V, K> f21486q;

    /* renamed from: com.google.common.collect.p$a */
    /* compiled from: HashBiMap */
    final class C4746a extends C4707e<K, V> {
        @NullableDecl

        /* renamed from: b */
        final K f21487b;

        /* renamed from: c */
        int f21488c;

        C4746a(int i) {
            this.f21487b = C4745p.this.f21471b[i];
            this.f21488c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo19802a() {
            int i = this.f21488c;
            if (i != -1) {
                C4745p pVar = C4745p.this;
                if (i <= pVar.f21473d && C6069h.m26674a(pVar.f21471b[i], this.f21487b)) {
                    return;
                }
            }
            this.f21488c = C4745p.this.mo19792q(this.f21487b);
        }

        public K getKey() {
            return this.f21487b;
        }

        @NullableDecl
        public V getValue() {
            mo19802a();
            int i = this.f21488c;
            if (i == -1) {
                return null;
            }
            return C4745p.this.f21472c[i];
        }

        public V setValue(V v) {
            mo19802a();
            int i = this.f21488c;
            if (i == -1) {
                return C4745p.this.put(this.f21487b, v);
            }
            V v2 = C4745p.this.f21472c[i];
            if (C6069h.m26674a(v2, v)) {
                return v;
            }
            C4745p.this.m21890H(this.f21488c, v, false);
            return v2;
        }
    }

    /* renamed from: com.google.common.collect.p$c */
    /* compiled from: HashBiMap */
    final class C4747c extends C4753h<K, V, Map.Entry<K, V>> {
        C4747c() {
            super(C4745p.this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Map.Entry<K, V> mo19804a(int i) {
            return new C4746a(i);
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int q = C4745p.this.mo19792q(key);
            if (q == -1 || !C6069h.m26674a(value, C4745p.this.f21472c[q])) {
                return false;
            }
            return true;
        }

        @CanIgnoreReturnValue
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = C4756q.m21945c(key);
            int r = C4745p.this.mo19793r(key, c);
            if (r == -1 || !C6069h.m26674a(value, C4745p.this.f21472c[r])) {
                return false;
            }
            C4745p.this.mo19780D(r, c);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.p$d */
    /* compiled from: HashBiMap */
    static class C4748d<K, V> extends AbstractMap<V, K> implements C4716h<V, K>, Serializable {

        /* renamed from: b */
        private final C4745p<K, V> f21491b;

        /* renamed from: c */
        private transient Set<Map.Entry<V, K>> f21492c;

        C4748d(C4745p<K, V> pVar) {
            this.f21491b = pVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            C4716h unused = this.f21491b.f21486q = this;
        }

        @NullableDecl
        @CanIgnoreReturnValue
        /* renamed from: a */
        public K mo19687a(@NullableDecl V v, @NullableDecl K k) {
            return this.f21491b.mo19778A(v, k, true);
        }

        /* renamed from: b */
        public Set<K> values() {
            return this.f21491b.keySet();
        }

        public void clear() {
            this.f21491b.clear();
        }

        public boolean containsKey(@NullableDecl Object obj) {
            return this.f21491b.containsValue(obj);
        }

        public boolean containsValue(@NullableDecl Object obj) {
            return this.f21491b.containsKey(obj);
        }

        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f21492c;
            if (set != null) {
                return set;
            }
            C4749e eVar = new C4749e(this.f21491b);
            this.f21492c = eVar;
            return eVar;
        }

        @NullableDecl
        public K get(@NullableDecl Object obj) {
            return this.f21491b.mo19798u(obj);
        }

        /* renamed from: k */
        public C4716h<K, V> mo19688k() {
            return this.f21491b;
        }

        public Set<V> keySet() {
            return this.f21491b.values();
        }

        @NullableDecl
        @CanIgnoreReturnValue
        public K put(@NullableDecl V v, @NullableDecl K k) {
            return this.f21491b.mo19778A(v, k, false);
        }

        @NullableDecl
        @CanIgnoreReturnValue
        public K remove(@NullableDecl Object obj) {
            return this.f21491b.mo19782F(obj);
        }

        public int size() {
            return this.f21491b.f21473d;
        }
    }

    /* renamed from: com.google.common.collect.p$e */
    /* compiled from: HashBiMap */
    static class C4749e<K, V> extends C4753h<K, V, Map.Entry<V, K>> {
        C4749e(C4745p<K, V> pVar) {
            super(pVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Map.Entry<V, K> mo19804a(int i) {
            return new C4752b(this.f21498b, i);
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int s = this.f21498b.mo19795s(key);
            if (s == -1 || !C6069h.m26674a(this.f21498b.f21471b[s], value)) {
                return false;
            }
            return true;
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int c = C4756q.m21945c(key);
            int t = this.f21498b.mo19797t(key, c);
            if (t == -1 || !C6069h.m26674a(this.f21498b.f21471b[t], value)) {
                return false;
            }
            this.f21498b.mo19781E(t, c);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.p$f */
    /* compiled from: HashBiMap */
    final class C4750f extends C4753h<K, V, K> {
        C4750f() {
            super(C4745p.this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public K mo19804a(int i) {
            return C4745p.this.f21471b[i];
        }

        public boolean contains(@NullableDecl Object obj) {
            return C4745p.this.containsKey(obj);
        }

        public boolean remove(@NullableDecl Object obj) {
            int c = C4756q.m21945c(obj);
            int r = C4745p.this.mo19793r(obj, c);
            if (r == -1) {
                return false;
            }
            C4745p.this.mo19780D(r, c);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.p$g */
    /* compiled from: HashBiMap */
    final class C4751g extends C4753h<K, V, V> {
        C4751g() {
            super(C4745p.this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public V mo19804a(int i) {
            return C4745p.this.f21472c[i];
        }

        public boolean contains(@NullableDecl Object obj) {
            return C4745p.this.containsValue(obj);
        }

        public boolean remove(@NullableDecl Object obj) {
            int c = C4756q.m21945c(obj);
            int t = C4745p.this.mo19797t(obj, c);
            if (t == -1) {
                return false;
            }
            C4745p.this.mo19781E(t, c);
            return true;
        }
    }

    /* renamed from: com.google.common.collect.p$b */
    /* compiled from: HashBiMap */
    static final class C4752b<K, V> extends C4707e<V, K> {

        /* renamed from: b */
        final C4745p<K, V> f21495b;

        /* renamed from: c */
        final V f21496c;

        /* renamed from: d */
        int f21497d;

        C4752b(C4745p<K, V> pVar, int i) {
            this.f21495b = pVar;
            this.f21496c = pVar.f21472c[i];
            this.f21497d = i;
        }

        /* renamed from: a */
        private void m21934a() {
            int i = this.f21497d;
            if (i != -1) {
                C4745p<K, V> pVar = this.f21495b;
                if (i <= pVar.f21473d && C6069h.m26674a(this.f21496c, pVar.f21472c[i])) {
                    return;
                }
            }
            this.f21497d = this.f21495b.mo19795s(this.f21496c);
        }

        public V getKey() {
            return this.f21496c;
        }

        public K getValue() {
            m21934a();
            int i = this.f21497d;
            if (i == -1) {
                return null;
            }
            return this.f21495b.f21471b[i];
        }

        public K setValue(K k) {
            m21934a();
            int i = this.f21497d;
            if (i == -1) {
                return this.f21495b.mo19778A(this.f21496c, k, false);
            }
            K k2 = this.f21495b.f21471b[i];
            if (C6069h.m26674a(k2, k)) {
                return k;
            }
            this.f21495b.m21889G(this.f21497d, k, false);
            return k2;
        }
    }

    /* renamed from: com.google.common.collect.p$h */
    /* compiled from: HashBiMap */
    static abstract class C4753h<K, V, T> extends AbstractSet<T> {

        /* renamed from: b */
        final C4745p<K, V> f21498b;

        /* renamed from: com.google.common.collect.p$h$a */
        /* compiled from: HashBiMap */
        class C4754a implements Iterator<T> {

            /* renamed from: b */
            private int f21499b;

            /* renamed from: c */
            private int f21500c = -1;

            /* renamed from: d */
            private int f21501d;

            /* renamed from: e */
            private int f21502e;

            C4754a() {
                this.f21499b = C4753h.this.f21498b.f21479j;
                C4745p<K, V> pVar = C4753h.this.f21498b;
                this.f21501d = pVar.f21474e;
                this.f21502e = pVar.f21473d;
            }

            /* renamed from: a */
            private void m21936a() {
                if (C4753h.this.f21498b.f21474e != this.f21501d) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                m21936a();
                return this.f21499b != -2 && this.f21502e > 0;
            }

            public T next() {
                if (hasNext()) {
                    T a = C4753h.this.mo19804a(this.f21499b);
                    this.f21500c = this.f21499b;
                    this.f21499b = C4753h.this.f21498b.f21482m[this.f21499b];
                    this.f21502e--;
                    return a;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                m21936a();
                C10393j.m47931c(this.f21500c != -1);
                C4753h.this.f21498b.mo19779B(this.f21500c);
                int i = this.f21499b;
                C4745p<K, V> pVar = C4753h.this.f21498b;
                if (i == pVar.f21473d) {
                    this.f21499b = this.f21500c;
                }
                this.f21500c = -1;
                this.f21501d = pVar.f21474e;
            }
        }

        C4753h(C4745p<K, V> pVar) {
            this.f21498b = pVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract T mo19804a(int i);

        public void clear() {
            this.f21498b.clear();
        }

        public Iterator<T> iterator() {
            return new C4754a();
        }

        public int size() {
            return this.f21498b.f21473d;
        }
    }

    private C4745p(int i) {
        mo19799v(i);
    }

    /* renamed from: C */
    private void m21888C(int i, int i2, int i3) {
        C6073k.m26681d(i != -1);
        m21901l(i, i2);
        m21902m(i, i3);
        m21891I(this.f21481l[i], this.f21482m[i]);
        m21907y(this.f21473d - 1, i);
        K[] kArr = this.f21471b;
        int i4 = this.f21473d;
        kArr[i4 - 1] = null;
        this.f21472c[i4 - 1] = null;
        this.f21473d = i4 - 1;
        this.f21474e++;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m21889G(int i, @NullableDecl K k, boolean z) {
        C6073k.m26681d(i != -1);
        int c = C4756q.m21945c(k);
        int r = mo19793r(k, c);
        int i2 = this.f21480k;
        int i3 = -2;
        if (r != -1) {
            if (z) {
                i2 = this.f21481l[r];
                i3 = this.f21482m[r];
                mo19780D(r, c);
                if (i == this.f21473d) {
                    i = r;
                }
            } else {
                throw new IllegalArgumentException("Key already present in map: " + k);
            }
        }
        if (i2 == i) {
            i2 = this.f21481l[i];
        } else if (i2 == this.f21473d) {
            i2 = r;
        }
        if (i3 == i) {
            r = this.f21482m[i];
        } else if (i3 != this.f21473d) {
            r = i3;
        }
        m21891I(this.f21481l[i], this.f21482m[i]);
        m21901l(i, C4756q.m21945c(this.f21471b[i]));
        this.f21471b[i] = k;
        m21905w(i, C4756q.m21945c(k));
        m21891I(i2, i);
        m21891I(i, r);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m21890H(int i, @NullableDecl V v, boolean z) {
        C6073k.m26681d(i != -1);
        int c = C4756q.m21945c(v);
        int t = mo19797t(v, c);
        if (t != -1) {
            if (z) {
                mo19781E(t, c);
                if (i == this.f21473d) {
                    i = t;
                }
            } else {
                throw new IllegalArgumentException("Value already present in map: " + v);
            }
        }
        m21902m(i, C4756q.m21945c(this.f21472c[i]));
        this.f21472c[i] = v;
        m21906x(i, c);
    }

    /* renamed from: I */
    private void m21891I(int i, int i2) {
        if (i == -2) {
            this.f21479j = i2;
        } else {
            this.f21482m[i] = i2;
        }
        if (i2 == -2) {
            this.f21480k = i;
        } else {
            this.f21481l[i2] = i;
        }
    }

    /* renamed from: g */
    private int m21897g(int i) {
        return i & (this.f21475f.length - 1);
    }

    /* renamed from: h */
    public static <K, V> C4745p<K, V> m21898h() {
        return m21899i(16);
    }

    /* renamed from: i */
    public static <K, V> C4745p<K, V> m21899i(int i) {
        return new C4745p<>(i);
    }

    /* renamed from: j */
    private static int[] m21900j(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: l */
    private void m21901l(int i, int i2) {
        C6073k.m26681d(i != -1);
        int g = m21897g(i2);
        int[] iArr = this.f21475f;
        if (iArr[g] == i) {
            int[] iArr2 = this.f21477h;
            iArr[g] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[g];
        int i4 = this.f21477h[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.f21471b[i]);
            } else if (i3 == i) {
                int[] iArr3 = this.f21477h;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.f21477h[i3];
            }
        }
    }

    /* renamed from: m */
    private void m21902m(int i, int i2) {
        C6073k.m26681d(i != -1);
        int g = m21897g(i2);
        int[] iArr = this.f21476g;
        if (iArr[g] == i) {
            int[] iArr2 = this.f21478i;
            iArr[g] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i3 = iArr[g];
        int i4 = this.f21478i[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f21472c[i]);
            } else if (i3 == i) {
                int[] iArr3 = this.f21478i;
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            } else {
                i4 = this.f21478i[i3];
            }
        }
    }

    /* renamed from: n */
    private void m21903n(int i) {
        int[] iArr = this.f21477h;
        if (iArr.length < i) {
            int a = C4757r.C4759b.m21956a(iArr.length, i);
            this.f21471b = Arrays.copyOf(this.f21471b, a);
            this.f21472c = Arrays.copyOf(this.f21472c, a);
            this.f21477h = m21904o(this.f21477h, a);
            this.f21478i = m21904o(this.f21478i, a);
            this.f21481l = m21904o(this.f21481l, a);
            this.f21482m = m21904o(this.f21482m, a);
        }
        if (this.f21475f.length < i) {
            int a2 = C4756q.m21943a(i, 1.0d);
            this.f21475f = m21900j(a2);
            this.f21476g = m21900j(a2);
            for (int i2 = 0; i2 < this.f21473d; i2++) {
                int g = m21897g(C4756q.m21945c(this.f21471b[i2]));
                int[] iArr2 = this.f21477h;
                int[] iArr3 = this.f21475f;
                iArr2[i2] = iArr3[g];
                iArr3[g] = i2;
                int g2 = m21897g(C4756q.m21945c(this.f21472c[i2]));
                int[] iArr4 = this.f21478i;
                int[] iArr5 = this.f21476g;
                iArr4[i2] = iArr5[g2];
                iArr5[g2] = i2;
            }
        }
    }

    /* renamed from: o */
    private static int[] m21904o(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int c = C10408x0.m47963c(objectInputStream);
        mo19799v(16);
        C10408x0.m47962b(this, objectInputStream, c);
    }

    /* renamed from: w */
    private void m21905w(int i, int i2) {
        C6073k.m26681d(i != -1);
        int g = m21897g(i2);
        int[] iArr = this.f21477h;
        int[] iArr2 = this.f21475f;
        iArr[i] = iArr2[g];
        iArr2[g] = i;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C10408x0.m47964d(this, objectOutputStream);
    }

    /* renamed from: x */
    private void m21906x(int i, int i2) {
        C6073k.m26681d(i != -1);
        int g = m21897g(i2);
        int[] iArr = this.f21478i;
        int[] iArr2 = this.f21476g;
        iArr[i] = iArr2[g];
        iArr2[g] = i;
    }

    /* renamed from: y */
    private void m21907y(int i, int i2) {
        int i3;
        int i4;
        if (i != i2) {
            int i5 = this.f21481l[i];
            int i6 = this.f21482m[i];
            m21891I(i5, i2);
            m21891I(i2, i6);
            K[] kArr = this.f21471b;
            K k = kArr[i];
            V[] vArr = this.f21472c;
            V v = vArr[i];
            kArr[i2] = k;
            vArr[i2] = v;
            int g = m21897g(C4756q.m21945c(k));
            int[] iArr = this.f21475f;
            if (iArr[g] == i) {
                iArr[g] = i2;
            } else {
                int i7 = iArr[g];
                int i8 = this.f21477h[i7];
                while (true) {
                    int i9 = i8;
                    i4 = i7;
                    i7 = i9;
                    if (i7 == i) {
                        break;
                    }
                    i8 = this.f21477h[i7];
                }
                this.f21477h[i4] = i2;
            }
            int[] iArr2 = this.f21477h;
            iArr2[i2] = iArr2[i];
            iArr2[i] = -1;
            int g2 = m21897g(C4756q.m21945c(v));
            int[] iArr3 = this.f21476g;
            if (iArr3[g2] == i) {
                iArr3[g2] = i2;
            } else {
                int i10 = iArr3[g2];
                int i11 = this.f21478i[i10];
                while (true) {
                    int i12 = i11;
                    i3 = i10;
                    i10 = i12;
                    if (i10 == i) {
                        break;
                    }
                    i11 = this.f21478i[i10];
                }
                this.f21478i[i3] = i2;
            }
            int[] iArr4 = this.f21478i;
            iArr4[i2] = iArr4[i];
            iArr4[i] = -1;
        }
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: A */
    public K mo19778A(@NullableDecl V v, @NullableDecl K k, boolean z) {
        int c = C4756q.m21945c(v);
        int t = mo19797t(v, c);
        if (t != -1) {
            K k2 = this.f21471b[t];
            if (C6069h.m26674a(k2, k)) {
                return k;
            }
            m21889G(t, k, z);
            return k2;
        }
        int i = this.f21480k;
        int c2 = C4756q.m21945c(k);
        int r = mo19793r(k, c2);
        if (!z) {
            C6073k.m26684g(r == -1, "Key already present: %s", k);
        } else if (r != -1) {
            i = this.f21481l[r];
            mo19780D(r, c2);
        }
        m21903n(this.f21473d + 1);
        K[] kArr = this.f21471b;
        int i2 = this.f21473d;
        kArr[i2] = k;
        this.f21472c[i2] = v;
        m21905w(i2, c2);
        m21906x(this.f21473d, c);
        int i3 = i == -2 ? this.f21479j : this.f21482m[i];
        m21891I(i, this.f21473d);
        m21891I(this.f21473d, i3);
        this.f21473d++;
        this.f21474e++;
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo19779B(int i) {
        mo19780D(i, C4756q.m21945c(this.f21471b[i]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo19780D(int i, int i2) {
        m21888C(i, i2, C4756q.m21945c(this.f21472c[i]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo19781E(int i, int i2) {
        m21888C(i, C4756q.m21945c(this.f21471b[i]), i2);
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: F */
    public K mo19782F(@NullableDecl Object obj) {
        int c = C4756q.m21945c(obj);
        int t = mo19797t(obj, c);
        if (t == -1) {
            return null;
        }
        K k = this.f21471b[t];
        mo19781E(t, c);
        return k;
    }

    /* renamed from: J */
    public Set<V> values() {
        Set<V> set = this.f21484o;
        if (set != null) {
            return set;
        }
        C4751g gVar = new C4751g();
        this.f21484o = gVar;
        return gVar;
    }

    @NullableDecl
    @CanIgnoreReturnValue
    /* renamed from: a */
    public V mo19687a(@NullableDecl K k, @NullableDecl V v) {
        return mo19801z(k, v, true);
    }

    public void clear() {
        Arrays.fill(this.f21471b, 0, this.f21473d, (Object) null);
        Arrays.fill(this.f21472c, 0, this.f21473d, (Object) null);
        Arrays.fill(this.f21475f, -1);
        Arrays.fill(this.f21476g, -1);
        Arrays.fill(this.f21477h, 0, this.f21473d, -1);
        Arrays.fill(this.f21478i, 0, this.f21473d, -1);
        Arrays.fill(this.f21481l, 0, this.f21473d, -1);
        Arrays.fill(this.f21482m, 0, this.f21473d, -1);
        this.f21473d = 0;
        this.f21479j = -2;
        this.f21480k = -2;
        this.f21474e++;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return mo19792q(obj) != -1;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return mo19795s(obj) != -1;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f21485p;
        if (set != null) {
            return set;
        }
        C4747c cVar = new C4747c();
        this.f21485p = cVar;
        return cVar;
    }

    @NullableDecl
    public V get(@NullableDecl Object obj) {
        int q = mo19792q(obj);
        if (q == -1) {
            return null;
        }
        return this.f21472c[q];
    }

    /* renamed from: k */
    public C4716h<V, K> mo19688k() {
        C4716h<V, K> hVar = this.f21486q;
        if (hVar != null) {
            return hVar;
        }
        C4748d dVar = new C4748d(this);
        this.f21486q = dVar;
        return dVar;
    }

    public Set<K> keySet() {
        Set<K> set = this.f21483n;
        if (set != null) {
            return set;
        }
        C4750f fVar = new C4750f();
        this.f21483n = fVar;
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo19790p(@NullableDecl Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[m21897g(i)];
        while (i2 != -1) {
            if (C6069h.m26674a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    @CanIgnoreReturnValue
    public V put(@NullableDecl K k, @NullableDecl V v) {
        return mo19801z(k, v, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo19792q(@NullableDecl Object obj) {
        return mo19793r(obj, C4756q.m21945c(obj));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo19793r(@NullableDecl Object obj, int i) {
        return mo19790p(obj, i, this.f21475f, this.f21477h, this.f21471b);
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        int c = C4756q.m21945c(obj);
        int r = mo19793r(obj, c);
        if (r == -1) {
            return null;
        }
        V v = this.f21472c[r];
        mo19780D(r, c);
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo19795s(@NullableDecl Object obj) {
        return mo19797t(obj, C4756q.m21945c(obj));
    }

    public int size() {
        return this.f21473d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo19797t(@NullableDecl Object obj, int i) {
        return mo19790p(obj, i, this.f21476g, this.f21478i, this.f21472c);
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: u */
    public K mo19798u(@NullableDecl Object obj) {
        int s = mo19795s(obj);
        if (s == -1) {
            return null;
        }
        return this.f21471b[s];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo19799v(int i) {
        C10393j.m47930b(i, "expectedSize");
        int a = C4756q.m21943a(i, 1.0d);
        this.f21473d = 0;
        this.f21471b = new Object[i];
        this.f21472c = new Object[i];
        this.f21475f = m21900j(a);
        this.f21476g = m21900j(a);
        this.f21477h = m21900j(i);
        this.f21478i = m21900j(i);
        this.f21479j = -2;
        this.f21480k = -2;
        this.f21481l = m21900j(i);
        this.f21482m = m21900j(i);
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: z */
    public V mo19801z(@NullableDecl K k, @NullableDecl V v, boolean z) {
        int c = C4756q.m21945c(k);
        int r = mo19793r(k, c);
        if (r != -1) {
            V v2 = this.f21472c[r];
            if (C6069h.m26674a(v2, v)) {
                return v;
            }
            m21890H(r, v, z);
            return v2;
        }
        int c2 = C4756q.m21945c(v);
        int t = mo19797t(v, c2);
        if (!z) {
            C6073k.m26684g(t == -1, "Value already present: %s", v);
        } else if (t != -1) {
            mo19781E(t, c2);
        }
        m21903n(this.f21473d + 1);
        K[] kArr = this.f21471b;
        int i = this.f21473d;
        kArr[i] = k;
        this.f21472c[i] = v;
        m21905w(i, c);
        m21906x(this.f21473d, c2);
        m21891I(this.f21480k, this.f21473d);
        m21891I(this.f21473d, -2);
        this.f21473d++;
        this.f21474e++;
        return null;
    }
}
