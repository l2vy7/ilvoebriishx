package com.google.ads.interactivemedia.p039v3.internal;

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

/* renamed from: com.google.ads.interactivemedia.v3.internal.bmi */
/* compiled from: IMASDK */
class bmi<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f16690a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<bmf> f16691b = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f16692c = Collections.emptyMap();

    /* renamed from: d */
    private boolean f16693d;

    /* renamed from: e */
    private volatile bmh f16694e;

    /* renamed from: f */
    private Map<K, V> f16695f = Collections.emptyMap();

    /* synthetic */ bmi(int i) {
        this.f16690a = i;
    }

    /* renamed from: b */
    static <FieldDescriptorType extends bkd<FieldDescriptorType>> bmi<FieldDescriptorType, Object> m16632b(int i) {
        return new bmb(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final V m16637l(int i) {
        m16639n();
        V value = this.f16691b.remove(i).getValue();
        if (!this.f16692c.isEmpty()) {
            Iterator it = m16640o().entrySet().iterator();
            List<bmf> list = this.f16691b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new bmf(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: m */
    private final int m16638m(K k) {
        int size = this.f16691b.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f16691b.get(size).mo15469a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f16691b.get(i2).mo15469a());
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
    public final void m16639n() {
        if (this.f16693d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o */
    private final SortedMap<K, V> m16640o() {
        m16639n();
        if (this.f16692c.isEmpty() && !(this.f16692c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16692c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f16695f = treeMap.descendingMap();
        }
        return (SortedMap) this.f16692c;
    }

    /* renamed from: a */
    public void mo15464a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f16693d) {
            if (this.f16692c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f16692c);
            }
            this.f16692c = map;
            if (this.f16695f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f16695f);
            }
            this.f16695f = map2;
            this.f16693d = true;
        }
    }

    /* renamed from: c */
    public final boolean mo15486c() {
        return this.f16693d;
    }

    public final void clear() {
        m16639n();
        if (!this.f16691b.isEmpty()) {
            this.f16691b.clear();
        }
        if (!this.f16692c.isEmpty()) {
            this.f16692c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m16638m(comparable) >= 0 || this.f16692c.containsKey(comparable);
    }

    /* renamed from: d */
    public final int mo15489d() {
        return this.f16691b.size();
    }

    /* renamed from: e */
    public final Map.Entry<K, V> mo15490e(int i) {
        return this.f16691b.get(i);
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f16694e == null) {
            this.f16694e = new bmh(this);
        }
        return this.f16694e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmi)) {
            return super.equals(obj);
        }
        bmi bmi = (bmi) obj;
        int size = size();
        if (size != bmi.size()) {
            return false;
        }
        int d = mo15489d();
        if (d != bmi.mo15489d()) {
            return entrySet().equals(bmi.entrySet());
        }
        for (int i = 0; i < d; i++) {
            if (!mo15490e(i).equals(bmi.mo15490e(i))) {
                return false;
            }
        }
        if (d != size) {
            return this.f16692c.equals(bmi.f16692c);
        }
        return true;
    }

    /* renamed from: f */
    public final Iterable<Map.Entry<K, V>> mo15493f() {
        if (this.f16692c.isEmpty()) {
            return bme.m16627a();
        }
        return this.f16692c.entrySet();
    }

    /* renamed from: g */
    public final V put(K k, V v) {
        m16639n();
        int m = m16638m(k);
        if (m >= 0) {
            return this.f16691b.get(m).setValue(v);
        }
        m16639n();
        if (this.f16691b.isEmpty() && !(this.f16691b instanceof ArrayList)) {
            this.f16691b = new ArrayList(this.f16690a);
        }
        int i = -(m + 1);
        if (i >= this.f16690a) {
            return m16640o().put(k, v);
        }
        int size = this.f16691b.size();
        int i2 = this.f16690a;
        if (size == i2) {
            bmf remove = this.f16691b.remove(i2 - 1);
            m16640o().put(remove.mo15469a(), remove.getValue());
        }
        this.f16691b.add(i, new bmf(this, k, v));
        return null;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m = m16638m(comparable);
        if (m >= 0) {
            return this.f16691b.get(m).getValue();
        }
        return this.f16692c.get(comparable);
    }

    public final int hashCode() {
        int d = mo15489d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            i += this.f16691b.get(i2).hashCode();
        }
        return this.f16692c.size() > 0 ? i + this.f16692c.hashCode() : i;
    }

    public final V remove(Object obj) {
        m16639n();
        Comparable comparable = (Comparable) obj;
        int m = m16638m(comparable);
        if (m >= 0) {
            return m16637l(m);
        }
        if (this.f16692c.isEmpty()) {
            return null;
        }
        return this.f16692c.remove(comparable);
    }

    public final int size() {
        return this.f16691b.size() + this.f16692c.size();
    }
}
