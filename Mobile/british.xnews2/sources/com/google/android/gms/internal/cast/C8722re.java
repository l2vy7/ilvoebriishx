package com.google.android.gms.internal.cast;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.cast.re */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
class C8722re<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    private final int f43960b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C8675oe> f43961c = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f43962d = Collections.emptyMap();

    /* renamed from: e */
    private boolean f43963e;

    /* renamed from: f */
    private volatile C8707qe f43964f;

    /* renamed from: g */
    private Map<K, V> f43965g = Collections.emptyMap();

    /* synthetic */ C8722re(int i, C8611ke keVar) {
        this.f43960b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final V m41286m(int i) {
        m41288o();
        V value = this.f43961c.remove(i).getValue();
        if (!this.f43962d.isEmpty()) {
            Iterator it = m41289p().entrySet().iterator();
            List<C8675oe> list = this.f43961c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C8675oe(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: n */
    private final int m41287n(K k) {
        int size = this.f43961c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f43961c.get(size).mo36639d());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f43961c.get(i2).mo36639d());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m41288o() {
        if (this.f43963e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: p */
    private final SortedMap<K, V> m41289p() {
        m41288o();
        if (this.f43962d.isEmpty() && !(this.f43962d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f43962d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f43965g = treeMap.descendingMap();
        }
        return (SortedMap) this.f43962d;
    }

    /* renamed from: b */
    public void mo36583b() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f43963e) {
            if (this.f43962d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f43962d);
            }
            this.f43962d = map;
            if (this.f43965g.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f43965g);
            }
            this.f43965g = map2;
            this.f43963e = true;
        }
    }

    /* renamed from: c */
    public final boolean mo36709c() {
        return this.f43963e;
    }

    public final void clear() {
        m41288o();
        if (!this.f43961c.isEmpty()) {
            this.f43961c.clear();
        }
        if (!this.f43962d.isEmpty()) {
            this.f43962d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m41287n(comparable) >= 0 || this.f43962d.containsKey(comparable);
    }

    /* renamed from: d */
    public final int mo36712d() {
        return this.f43961c.size();
    }

    /* renamed from: e */
    public final Map.Entry<K, V> mo36713e(int i) {
        return this.f43961c.get(i);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f43964f == null) {
            this.f43964f = new C8707qe(this, (C8611ke) null);
        }
        return this.f43964f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8722re)) {
            return super.equals(obj);
        }
        C8722re reVar = (C8722re) obj;
        int size = size();
        if (size != reVar.size()) {
            return false;
        }
        int d = mo36712d();
        if (d != reVar.mo36712d()) {
            return entrySet().equals(reVar.entrySet());
        }
        for (int i = 0; i < d; i++) {
            if (!mo36713e(i).equals(reVar.mo36713e(i))) {
                return false;
            }
        }
        if (d != size) {
            return this.f43962d.equals(reVar.f43962d);
        }
        return true;
    }

    /* renamed from: f */
    public final Iterable<Map.Entry<K, V>> mo36716f() {
        if (this.f43962d.isEmpty()) {
            return C8659ne.m41165a();
        }
        return this.f43962d.entrySet();
    }

    /* renamed from: g */
    public final V put(K k, V v) {
        m41288o();
        int n = m41287n(k);
        if (n >= 0) {
            return this.f43961c.get(n).setValue(v);
        }
        m41288o();
        if (this.f43961c.isEmpty() && !(this.f43961c instanceof ArrayList)) {
            this.f43961c = new ArrayList(this.f43960b);
        }
        int i = -(n + 1);
        if (i >= this.f43960b) {
            return m41289p().put(k, v);
        }
        int size = this.f43961c.size();
        int i2 = this.f43960b;
        if (size == i2) {
            C8675oe remove = this.f43961c.remove(i2 - 1);
            m41289p().put(remove.mo36639d(), remove.getValue());
        }
        this.f43961c.add(i, new C8675oe(this, k, v));
        return null;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int n = m41287n(comparable);
        if (n >= 0) {
            return this.f43961c.get(n).getValue();
        }
        return this.f43962d.get(comparable);
    }

    public final int hashCode() {
        int d = mo36712d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            i += this.f43961c.get(i2).hashCode();
        }
        return this.f43962d.size() > 0 ? i + this.f43962d.hashCode() : i;
    }

    public final V remove(Object obj) {
        m41288o();
        Comparable comparable = (Comparable) obj;
        int n = m41287n(comparable);
        if (n >= 0) {
            return m41286m(n);
        }
        if (this.f43962d.isEmpty()) {
            return null;
        }
        return this.f43962d.remove(comparable);
    }

    public final int size() {
        return this.f43961c.size() + this.f43962d.size();
    }
}
