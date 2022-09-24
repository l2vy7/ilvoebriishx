package com.google.android.gms.internal.ads;

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

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class cs3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    private final int f30482b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<vr3> f30483c = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f30484d = Collections.emptyMap();

    /* renamed from: e */
    private boolean f30485e;

    /* renamed from: f */
    private volatile zr3 f30486f;

    /* renamed from: g */
    private Map<K, V> f30487g = Collections.emptyMap();

    /* synthetic */ cs3(int i, bs3 bs3) {
        this.f30482b = i;
    }

    /* renamed from: m */
    private final int m31140m(K k) {
        int size = this.f30483c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f30483c.get(size).mo35482d());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f30483c.get(i2).mo35482d());
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
    /* renamed from: n */
    public final V m31141n(int i) {
        m31143p();
        V value = this.f30483c.remove(i).getValue();
        if (!this.f30484d.isEmpty()) {
            Iterator it = m31142o().entrySet().iterator();
            List<vr3> list = this.f30483c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new vr3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: o */
    private final SortedMap<K, V> m31142o() {
        m31143p();
        if (this.f30484d.isEmpty() && !(this.f30484d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f30484d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f30487g = treeMap.descendingMap();
        }
        return (SortedMap) this.f30484d;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m31143p() {
        if (this.f30485e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public void mo31022b() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f30485e) {
            if (this.f30484d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f30484d);
            }
            this.f30484d = map;
            if (this.f30487g.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f30487g);
            }
            this.f30487g = map2;
            this.f30485e = true;
        }
    }

    /* renamed from: c */
    public final int mo31023c() {
        return this.f30483c.size();
    }

    public final void clear() {
        m31143p();
        if (!this.f30483c.isEmpty()) {
            this.f30483c.clear();
        }
        if (!this.f30484d.isEmpty()) {
            this.f30484d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m31140m(comparable) >= 0 || this.f30484d.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable<Map.Entry<K, V>> mo31026d() {
        if (this.f30484d.isEmpty()) {
            return ur3.m38429a();
        }
        return this.f30484d.entrySet();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f30486f == null) {
            this.f30486f = new zr3(this, (yr3) null);
        }
        return this.f30486f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs3)) {
            return super.equals(obj);
        }
        cs3 cs3 = (cs3) obj;
        int size = size();
        if (size != cs3.size()) {
            return false;
        }
        int c = mo31023c();
        if (c != cs3.mo31023c()) {
            return entrySet().equals(cs3.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo31031h(i).equals(cs3.mo31031h(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f30484d.equals(cs3.f30484d);
        }
        return true;
    }

    /* renamed from: f */
    public final V put(K k, V v) {
        m31143p();
        int m = m31140m(k);
        if (m >= 0) {
            return this.f30483c.get(m).setValue(v);
        }
        m31143p();
        if (this.f30483c.isEmpty() && !(this.f30483c instanceof ArrayList)) {
            this.f30483c = new ArrayList(this.f30482b);
        }
        int i = -(m + 1);
        if (i >= this.f30482b) {
            return m31142o().put(k, v);
        }
        int size = this.f30483c.size();
        int i2 = this.f30482b;
        if (size == i2) {
            vr3 remove = this.f30483c.remove(i2 - 1);
            m31142o().put(remove.mo35482d(), remove.getValue());
        }
        this.f30483c.add(i, new vr3(this, k, v));
        return null;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m = m31140m(comparable);
        if (m >= 0) {
            return this.f30483c.get(m).getValue();
        }
        return this.f30484d.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry<K, V> mo31031h(int i) {
        return this.f30483c.get(i);
    }

    public final int hashCode() {
        int c = mo31023c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += this.f30483c.get(i2).hashCode();
        }
        return this.f30484d.size() > 0 ? i + this.f30484d.hashCode() : i;
    }

    /* renamed from: l */
    public final boolean mo31033l() {
        return this.f30485e;
    }

    public final V remove(Object obj) {
        m31143p();
        Comparable comparable = (Comparable) obj;
        int m = m31140m(comparable);
        if (m >= 0) {
            return m31141n(m);
        }
        if (this.f30484d.isEmpty()) {
            return null;
        }
        return this.f30484d.remove(comparable);
    }

    public final int size() {
        return this.f30483c.size() + this.f30484d.size();
    }
}
