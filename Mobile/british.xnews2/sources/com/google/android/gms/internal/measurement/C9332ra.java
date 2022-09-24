package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.ra */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
class C9332ra extends AbstractMap {

    /* renamed from: b */
    private final int f45425b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List f45426c = Collections.emptyList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map f45427d = Collections.emptyMap();

    /* renamed from: e */
    private boolean f45428e;

    /* renamed from: f */
    private volatile C9316qa f45429f;

    /* renamed from: g */
    private Map f45430g = Collections.emptyMap();

    /* synthetic */ C9332ra(int i, C9224ka kaVar) {
        this.f45425b = i;
    }

    /* renamed from: m */
    private final int m43581m(Comparable comparable) {
        int size = this.f45426c.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C9286oa) this.f45426c.get(size)).mo37844d());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C9286oa) this.f45426c.get(i2)).mo37844d());
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
    public final Object m43582n(int i) {
        m43584p();
        Object value = ((C9286oa) this.f45426c.remove(i)).getValue();
        if (!this.f45427d.isEmpty()) {
            Iterator it = m43583o().entrySet().iterator();
            List list = this.f45426c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C9286oa(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: o */
    private final SortedMap m43583o() {
        m43584p();
        if (this.f45427d.isEmpty() && !(this.f45427d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f45427d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f45430g = treeMap.descendingMap();
        }
        return (SortedMap) this.f45427d;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m43584p() {
        if (this.f45428e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public void mo37693b() {
        Map map;
        Map map2;
        if (!this.f45428e) {
            if (this.f45427d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f45427d);
            }
            this.f45427d = map;
            if (this.f45430g.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f45430g);
            }
            this.f45430g = map2;
            this.f45428e = true;
        }
    }

    /* renamed from: c */
    public final int mo37999c() {
        return this.f45426c.size();
    }

    public final void clear() {
        m43584p();
        if (!this.f45426c.isEmpty()) {
            this.f45426c.clear();
        }
        if (!this.f45427d.isEmpty()) {
            this.f45427d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m43581m(comparable) >= 0 || this.f45427d.containsKey(comparable);
    }

    /* renamed from: d */
    public final Iterable mo38002d() {
        if (this.f45427d.isEmpty()) {
            return C9270na.m43248a();
        }
        return this.f45427d.entrySet();
    }

    public final Set entrySet() {
        if (this.f45429f == null) {
            this.f45429f = new C9316qa(this, (C9224ka) null);
        }
        return this.f45429f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9332ra)) {
            return super.equals(obj);
        }
        C9332ra raVar = (C9332ra) obj;
        int size = size();
        if (size != raVar.size()) {
            return false;
        }
        int c = mo37999c();
        if (c != raVar.mo37999c()) {
            return entrySet().equals(raVar.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!mo38007h(i).equals(raVar.mo38007h(i))) {
                return false;
            }
        }
        if (c != size) {
            return this.f45427d.equals(raVar.f45427d);
        }
        return true;
    }

    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        m43584p();
        int m = m43581m(comparable);
        if (m >= 0) {
            return ((C9286oa) this.f45426c.get(m)).setValue(obj);
        }
        m43584p();
        if (this.f45426c.isEmpty() && !(this.f45426c instanceof ArrayList)) {
            this.f45426c = new ArrayList(this.f45425b);
        }
        int i = -(m + 1);
        if (i >= this.f45425b) {
            return m43583o().put(comparable, obj);
        }
        int size = this.f45426c.size();
        int i2 = this.f45425b;
        if (size == i2) {
            C9286oa oaVar = (C9286oa) this.f45426c.remove(i2 - 1);
            m43583o().put(oaVar.mo37844d(), oaVar.getValue());
        }
        this.f45426c.add(i, new C9286oa(this, comparable, obj));
        return null;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m = m43581m(comparable);
        if (m >= 0) {
            return ((C9286oa) this.f45426c.get(m)).getValue();
        }
        return this.f45427d.get(comparable);
    }

    /* renamed from: h */
    public final Map.Entry mo38007h(int i) {
        return (Map.Entry) this.f45426c.get(i);
    }

    public final int hashCode() {
        int c = mo37999c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i += ((C9286oa) this.f45426c.get(i2)).hashCode();
        }
        return this.f45427d.size() > 0 ? i + this.f45427d.hashCode() : i;
    }

    /* renamed from: l */
    public final boolean mo38009l() {
        return this.f45428e;
    }

    public final Object remove(Object obj) {
        m43584p();
        Comparable comparable = (Comparable) obj;
        int m = m43581m(comparable);
        if (m >= 0) {
            return m43582n(m);
        }
        if (this.f45427d.isEmpty()) {
            return null;
        }
        return this.f45427d.remove(comparable);
    }

    public final int size() {
        return this.f45426c.size() + this.f45427d.size();
    }
}
