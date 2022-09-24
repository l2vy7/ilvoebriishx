package com.google.android.gms.internal.vision;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.i5 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
class C9539i5 extends AbstractSet {

    /* renamed from: b */
    private final /* synthetic */ C9675x4 f45676b;

    private C9539i5(C9675x4 x4Var) {
        this.f45676b = x4Var;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f45676b.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f45676b.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f45676b.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new C9515f5(this.f45676b, (C9467a5) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f45676b.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f45676b.size();
    }

    /* synthetic */ C9539i5(C9675x4 x4Var, C9467a5 a5Var) {
        this(x4Var);
    }
}
