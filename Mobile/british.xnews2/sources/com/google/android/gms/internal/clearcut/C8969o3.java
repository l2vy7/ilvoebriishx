package com.google.android.gms.internal.clearcut;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.o3 */
class C8969o3 extends AbstractSet {

    /* renamed from: b */
    private final /* synthetic */ C8898f3 f44676b;

    private C8969o3(C8898f3 f3Var) {
        this.f44676b = f3Var;
    }

    /* synthetic */ C8969o3(C8898f3 f3Var, C8905g3 g3Var) {
        this(f3Var);
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f44676b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f44676b.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f44676b.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new C8962n3(this.f44676b, (C8905g3) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f44676b.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f44676b.size();
    }
}
