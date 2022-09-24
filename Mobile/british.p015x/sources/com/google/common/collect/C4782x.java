package com.google.common.collect;

import com.google.common.collect.C10408x0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.common.collect.x */
/* compiled from: ImmutableMultimap */
public abstract class C4782x<K, V> extends C10391g<K, V> implements Serializable {

    /* renamed from: f */
    final transient C4776v<K, ? extends C4757r<V>> f21551f;

    /* renamed from: g */
    final transient int f21552g;

    /* renamed from: com.google.common.collect.x$c */
    /* compiled from: ImmutableMultimap */
    public static class C4783c<K, V> {

        /* renamed from: a */
        Map<K, Collection<V>> f21553a = C10405q0.m47953d();
        @MonotonicNonNullDecl

        /* renamed from: b */
        Comparator<? super K> f21554b;
        @MonotonicNonNullDecl

        /* renamed from: c */
        Comparator<? super V> f21555c;

        /* renamed from: a */
        public C4782x<K, V> mo19942a() {
            Collection entrySet = this.f21553a.entrySet();
            Comparator comparator = this.f21554b;
            if (comparator != null) {
                entrySet = C4755p0.m21937a(comparator).mo19834d().mo19833b(entrySet);
            }
            return C4773u.m22020u(entrySet, this.f21555c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Collection<V> mo19943b() {
            return new ArrayList();
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public C4783c<K, V> mo19891c(K k, Iterable<? extends V> iterable) {
            if (k != null) {
                Collection collection = this.f21553a.get(k);
                if (collection != null) {
                    for (Object next : iterable) {
                        C10393j.m47929a(k, next);
                        collection.add(next);
                    }
                    return this;
                }
                Iterator<? extends V> it = iterable.iterator();
                if (!it.hasNext()) {
                    return this;
                }
                Collection b = mo19943b();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    C10393j.m47929a(k, next2);
                    b.add(next2);
                }
                this.f21553a.put(k, b);
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + C4706d0.m21760g(iterable));
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public C4783c<K, V> mo19944d(K k, V... vArr) {
            return mo19891c(k, Arrays.asList(vArr));
        }
    }

    /* renamed from: com.google.common.collect.x$f */
    /* compiled from: ImmutableMultimap */
    private static final class C4784f<K, V> extends C4757r<V> {
        @Weak

        /* renamed from: c */
        private final transient C4782x<K, V> f21556c;

        C4784f(C4782x<K, V> xVar) {
            this.f21556c = xVar;
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f21556c.mo19674d(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo19459e(Object[] objArr, int i) {
            C10388e1<? extends C4757r<V>> r = this.f21556c.f21551f.values().iterator();
            while (r.hasNext()) {
                i = ((C4757r) r.next()).mo19459e(objArr, i);
            }
            return i;
        }

        /* renamed from: r */
        public C10388e1<V> iterator() {
            return this.f21556c.mo19521k();
        }

        public int size() {
            return this.f21556c.size();
        }
    }

    /* renamed from: com.google.common.collect.x$a */
    /* compiled from: ImmutableMultimap */
    class C4785a extends C10388e1<Map.Entry<K, V>> {

        /* renamed from: b */
        final Iterator<? extends Map.Entry<K, ? extends C4757r<V>>> f21557b;

        /* renamed from: c */
        K f21558c = null;

        /* renamed from: d */
        Iterator<V> f21559d = C4708e0.m21764d();

        C4785a() {
            this.f21557b = C4782x.this.f21551f.entrySet().iterator();
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (!this.f21559d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f21557b.next();
                this.f21558c = entry.getKey();
                this.f21559d = ((C4757r) entry.getValue()).iterator();
            }
            return C4718i0.m21797c(this.f21558c, this.f21559d.next());
        }

        public boolean hasNext() {
            return this.f21559d.hasNext() || this.f21557b.hasNext();
        }
    }

    /* renamed from: com.google.common.collect.x$b */
    /* compiled from: ImmutableMultimap */
    class C4786b extends C10388e1<V> {

        /* renamed from: b */
        Iterator<? extends C4757r<V>> f21561b;

        /* renamed from: c */
        Iterator<V> f21562c = C4708e0.m21764d();

        C4786b() {
            this.f21561b = C4782x.this.f21551f.values().iterator();
        }

        public boolean hasNext() {
            return this.f21562c.hasNext() || this.f21561b.hasNext();
        }

        public V next() {
            if (!this.f21562c.hasNext()) {
                this.f21562c = ((C4757r) this.f21561b.next()).iterator();
            }
            return this.f21562c.next();
        }
    }

    /* renamed from: com.google.common.collect.x$d */
    /* compiled from: ImmutableMultimap */
    private static class C4787d<K, V> extends C4757r<Map.Entry<K, V>> {
        @Weak

        /* renamed from: c */
        final C4782x<K, V> f21564c;

        C4787d(C4782x<K, V> xVar) {
            this.f21564c = xVar;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f21564c.mo19673c(entry.getKey(), entry.getValue());
        }

        /* renamed from: r */
        public C10388e1<Map.Entry<K, V>> iterator() {
            return this.f21564c.mo19520i();
        }

        public int size() {
            return this.f21564c.size();
        }
    }

    /* renamed from: com.google.common.collect.x$e */
    /* compiled from: ImmutableMultimap */
    static class C4788e {

        /* renamed from: a */
        static final C10408x0.C10410b<C4782x> f21565a = C10408x0.m47961a(C4782x.class, "map");

        /* renamed from: b */
        static final C10408x0.C10410b<C4782x> f21566b = C10408x0.m47961a(C4782x.class, "size");
    }

    C4782x(C4776v<K, ? extends C4757r<V>> vVar, int i) {
        this.f21551f = vVar;
        this.f21552g = i;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo19673c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.mo19673c(obj, obj2);
    }

    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public boolean mo19674d(@NullableDecl Object obj) {
        return obj != null && super.mo19674d(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<K, Collection<V>> mo19675e() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Set<K> mo19676g() {
        throw new AssertionError("unreachable");
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: l */
    public C4776v<K, Collection<V>> mo19511b() {
        return this.f21551f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C4757r<Map.Entry<K, V>> mo19518f() {
        return new C4787d(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C4757r<V> mo19519h() {
        return new C4784f(this);
    }

    /* renamed from: o */
    public C4757r<Map.Entry<K, V>> mo19516a() {
        return (C4757r) super.mo19516a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C10388e1<Map.Entry<K, V>> mo19520i() {
        return new C4785a();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public abstract C4757r<V> get(K k);

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C10388e1<V> mo19521k() {
        return new C4786b();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public C4757r<V> values() {
        return (C4757r) super.values();
    }

    public int size() {
        return this.f21552g;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
