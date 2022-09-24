package com.google.android.gms.internal.vision;

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

/* renamed from: com.google.android.gms.internal.vision.x4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
class C9675x4<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b */
    private final int f45987b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C9523g5> f45988c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f45989d;

    /* renamed from: e */
    private boolean f45990e;

    /* renamed from: f */
    private volatile C9539i5 f45991f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Map<K, V> f45992g;

    /* renamed from: h */
    private volatile C9487c5 f45993h;

    private C9675x4(int i) {
        this.f45987b = i;
        this.f45988c = Collections.emptyList();
        this.f45989d = Collections.emptyMap();
        this.f45992g = Collections.emptyMap();
    }

    /* renamed from: c */
    private final int m44805c(K k) {
        int size = this.f45988c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f45988c.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f45988c.get(i2).getKey());
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

    /* renamed from: i */
    static <FieldDescriptorType extends C9569m2<FieldDescriptorType>> C9675x4<FieldDescriptorType, Object> m44810i(int i) {
        return new C9467a5(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final V m44811l(int i) {
        m44813r();
        V value = this.f45988c.remove(i).getValue();
        if (!this.f45989d.isEmpty()) {
            Iterator it = m44814s().entrySet().iterator();
            this.f45988c.add(new C9523g5(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m44813r() {
        if (this.f45990e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: s */
    private final SortedMap<K, V> m44814s() {
        m44813r();
        if (this.f45989d.isEmpty() && !(this.f45989d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f45989d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f45992g = treeMap.descendingMap();
        }
        return (SortedMap) this.f45989d;
    }

    /* renamed from: b */
    public final boolean mo38648b() {
        return this.f45990e;
    }

    public void clear() {
        m44813r();
        if (!this.f45988c.isEmpty()) {
            this.f45988c.clear();
        }
        if (!this.f45989d.isEmpty()) {
            this.f45989d.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m44805c(comparable) >= 0 || this.f45989d.containsKey(comparable);
    }

    /* renamed from: e */
    public final V put(K k, V v) {
        m44813r();
        int c = m44805c(k);
        if (c >= 0) {
            return this.f45988c.get(c).setValue(v);
        }
        m44813r();
        if (this.f45988c.isEmpty() && !(this.f45988c instanceof ArrayList)) {
            this.f45988c = new ArrayList(this.f45987b);
        }
        int i = -(c + 1);
        if (i >= this.f45987b) {
            return m44814s().put(k, v);
        }
        int size = this.f45988c.size();
        int i2 = this.f45987b;
        if (size == i2) {
            C9523g5 remove = this.f45988c.remove(i2 - 1);
            m44814s().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f45988c.add(i, new C9523g5(this, k, v));
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f45991f == null) {
            this.f45991f = new C9539i5(this, (C9467a5) null);
        }
        return this.f45991f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9675x4)) {
            return super.equals(obj);
        }
        C9675x4 x4Var = (C9675x4) obj;
        int size = size();
        if (size != x4Var.size()) {
            return false;
        }
        int o = mo38657o();
        if (o != x4Var.mo38657o()) {
            return entrySet().equals(x4Var.entrySet());
        }
        for (int i = 0; i < o; i++) {
            if (!mo38656j(i).equals(x4Var.mo38656j(i))) {
                return false;
            }
        }
        if (o != size) {
            return this.f45989d.equals(x4Var.f45989d);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int c = m44805c(comparable);
        if (c >= 0) {
            return this.f45988c.get(c).getValue();
        }
        return this.f45989d.get(comparable);
    }

    public int hashCode() {
        int o = mo38657o();
        int i = 0;
        for (int i2 = 0; i2 < o; i2++) {
            i += this.f45988c.get(i2).hashCode();
        }
        return this.f45989d.size() > 0 ? i + this.f45989d.hashCode() : i;
    }

    /* renamed from: j */
    public final Map.Entry<K, V> mo38656j(int i) {
        return this.f45988c.get(i);
    }

    /* renamed from: n */
    public void mo38251n() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f45990e) {
            if (this.f45989d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f45989d);
            }
            this.f45989d = map;
            if (this.f45992g.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f45992g);
            }
            this.f45992g = map2;
            this.f45990e = true;
        }
    }

    /* renamed from: o */
    public final int mo38657o() {
        return this.f45988c.size();
    }

    /* renamed from: p */
    public final Iterable<Map.Entry<K, V>> mo38658p() {
        if (this.f45989d.isEmpty()) {
            return C9476b5.m44050a();
        }
        return this.f45989d.entrySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Set<Map.Entry<K, V>> mo38660q() {
        if (this.f45993h == null) {
            this.f45993h = new C9487c5(this, (C9467a5) null);
        }
        return this.f45993h;
    }

    public V remove(Object obj) {
        m44813r();
        Comparable comparable = (Comparable) obj;
        int c = m44805c(comparable);
        if (c >= 0) {
            return m44811l(c);
        }
        if (this.f45989d.isEmpty()) {
            return null;
        }
        return this.f45989d.remove(comparable);
    }

    public int size() {
        return this.f45988c.size() + this.f45989d.size();
    }

    /* synthetic */ C9675x4(int i, C9467a5 a5Var) {
        this(i);
    }
}
