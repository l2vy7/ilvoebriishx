package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.appevents.n */
/* compiled from: PersistedEvents */
class C3421n implements Serializable {

    /* renamed from: b */
    private HashMap<C3387a, List<C3392c>> f12880b;

    /* renamed from: com.facebook.appevents.n$b */
    /* compiled from: PersistedEvents */
    static class C3423b implements Serializable {

        /* renamed from: b */
        private final HashMap<C3387a, List<C3392c>> f12881b;

        private Object readResolve() {
            return new C3421n(this.f12881b);
        }

        private C3423b(HashMap<C3387a, List<C3392c>> hashMap) {
            this.f12881b = hashMap;
        }
    }

    public C3421n() {
        this.f12880b = new HashMap<>();
    }

    private Object writeReplace() {
        return new C3423b(this.f12880b);
    }

    /* renamed from: a */
    public void mo11852a(C3387a aVar, List<C3392c> list) {
        if (!this.f12880b.containsKey(aVar)) {
            this.f12880b.put(aVar, list);
        } else {
            this.f12880b.get(aVar).addAll(list);
        }
    }

    /* renamed from: b */
    public boolean mo11853b(C3387a aVar) {
        return this.f12880b.containsKey(aVar);
    }

    /* renamed from: c */
    public List<C3392c> mo11854c(C3387a aVar) {
        return this.f12880b.get(aVar);
    }

    /* renamed from: d */
    public Set<C3387a> mo11855d() {
        return this.f12880b.keySet();
    }

    public C3421n(HashMap<C3387a, List<C3392c>> hashMap) {
        HashMap<C3387a, List<C3392c>> hashMap2 = new HashMap<>();
        this.f12880b = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
