package com.google.android.gms.internal.clearcut;

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

/* renamed from: com.google.android.gms.internal.clearcut.f3 */
class C8898f3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    private final int f44534b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C8955m3> f44535c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f44536d;

    /* renamed from: e */
    private boolean f44537e;

    /* renamed from: f */
    private volatile C8969o3 f44538f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Map<K, V> f44539g;

    /* renamed from: h */
    private volatile C8919i3 f44540h;

    private C8898f3(int i) {
        this.f44534b = i;
        this.f44535c = Collections.emptyList();
        this.f44536d = Collections.emptyMap();
        this.f44539g = Collections.emptyMap();
    }

    /* synthetic */ C8898f3(int i, C8905g3 g3Var) {
        this(i);
    }

    /* renamed from: c */
    private final int m41788c(K k) {
        int size = this.f44535c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f44535c.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.f44535c.get(i2).getKey());
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

    /* renamed from: g */
    static <FieldDescriptorType extends C9043z0<FieldDescriptorType>> C8898f3<FieldDescriptorType, Object> m41791g(int i) {
        return new C8905g3(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final V m41792i(int i) {
        m41796q();
        V value = this.f44535c.remove(i).getValue();
        if (!this.f44536d.isEmpty()) {
            Iterator it = m41797r().entrySet().iterator();
            this.f44535c.add(new C8955m3(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m41796q() {
        if (this.f44537e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: r */
    private final SortedMap<K, V> m41797r() {
        m41796q();
        if (this.f44536d.isEmpty() && !(this.f44536d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f44536d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f44539g = treeMap.descendingMap();
        }
        return (SortedMap) this.f44536d;
    }

    /* renamed from: b */
    public final boolean mo36929b() {
        return this.f44537e;
    }

    public void clear() {
        m41796q();
        if (!this.f44535c.isEmpty()) {
            this.f44535c.clear();
        }
        if (!this.f44536d.isEmpty()) {
            this.f44536d.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m41788c(comparable) >= 0 || this.f44536d.containsKey(comparable);
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        m41796q();
        int c = m41788c(k);
        if (c >= 0) {
            return this.f44535c.get(c).setValue(v);
        }
        m41796q();
        if (this.f44535c.isEmpty() && !(this.f44535c instanceof ArrayList)) {
            this.f44535c = new ArrayList(this.f44534b);
        }
        int i = -(c + 1);
        if (i >= this.f44534b) {
            return m41797r().put(k, v);
        }
        int size = this.f44535c.size();
        int i2 = this.f44534b;
        if (size == i2) {
            C8955m3 remove = this.f44535c.remove(i2 - 1);
            m41797r().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f44535c.add(i, new C8955m3(this, k, v));
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f44538f == null) {
            this.f44538f = new C8969o3(this, (C8905g3) null);
        }
        return this.f44538f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8898f3)) {
            return super.equals(obj);
        }
        C8898f3 f3Var = (C8898f3) obj;
        int size = size();
        if (size != f3Var.size()) {
            return false;
        }
        int n = mo36938n();
        if (n != f3Var.mo36938n()) {
            return entrySet().equals(f3Var.entrySet());
        }
        for (int i = 0; i < n; i++) {
            if (!mo36936h(i).equals(f3Var.mo36936h(i))) {
                return false;
            }
        }
        if (n != size) {
            return this.f44536d.equals(f3Var.f44536d);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int c = m41788c(comparable);
        return c >= 0 ? this.f44535c.get(c).getValue() : this.f44536d.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry<K, V> mo36936h(int i) {
        return this.f44535c.get(i);
    }

    public int hashCode() {
        int n = mo36938n();
        int i = 0;
        for (int i2 = 0; i2 < n; i2++) {
            i += this.f44535c.get(i2).hashCode();
        }
        return this.f44536d.size() > 0 ? i + this.f44536d.hashCode() : i;
    }

    /* renamed from: n */
    public final int mo36938n() {
        return this.f44535c.size();
    }

    /* renamed from: o */
    public final Iterable<Map.Entry<K, V>> mo36939o() {
        return this.f44536d.isEmpty() ? C8929j3.m41889a() : this.f44536d.entrySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Set<Map.Entry<K, V>> mo36940p() {
        if (this.f44540h == null) {
            this.f44540h = new C8919i3(this, (C8905g3) null);
        }
        return this.f44540h;
    }

    public V remove(Object obj) {
        m41796q();
        Comparable comparable = (Comparable) obj;
        int c = m41788c(comparable);
        if (c >= 0) {
            return m41792i(c);
        }
        if (this.f44536d.isEmpty()) {
            return null;
        }
        return this.f44536d.remove(comparable);
    }

    /* renamed from: s */
    public void mo36943s() {
        if (!this.f44537e) {
            this.f44536d = this.f44536d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f44536d);
            this.f44539g = this.f44539g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f44539g);
            this.f44537e = true;
        }
    }

    public int size() {
        return this.f44535c.size() + this.f44536d.size();
    }
}
