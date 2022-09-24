package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p104l0.C5645e;
import p104l0.C5646f;
import p149t.C6090g;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* compiled from: DirectedAcyclicGraph */
public final class C0584a<T> {

    /* renamed from: a */
    private final C5645e<ArrayList<T>> f3114a = new C5646f(10);

    /* renamed from: b */
    private final C6090g<T, ArrayList<T>> f3115b = new C6090g<>();

    /* renamed from: c */
    private final ArrayList<T> f3116c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f3117d = new HashSet<>();

    /* renamed from: e */
    private void m3227e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f3115b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m3227e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    private ArrayList<T> m3228f() {
        ArrayList<T> acquire = this.f3114a.acquire();
        return acquire == null ? new ArrayList<>() : acquire;
    }

    /* renamed from: k */
    private void m3229k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3114a.mo7110a(arrayList);
    }

    /* renamed from: a */
    public void mo3050a(T t, T t2) {
        if (!this.f3115b.containsKey(t) || !this.f3115b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f3115b.get(t);
        if (arrayList == null) {
            arrayList = m3228f();
            this.f3115b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void mo3051b(T t) {
        if (!this.f3115b.containsKey(t)) {
            this.f3115b.put(t, null);
        }
    }

    /* renamed from: c */
    public void mo3052c() {
        int size = this.f3115b.size();
        for (int i = 0; i < size; i++) {
            ArrayList o = this.f3115b.mo23391o(i);
            if (o != null) {
                m3229k(o);
            }
        }
        this.f3115b.clear();
    }

    /* renamed from: d */
    public boolean mo3053d(T t) {
        return this.f3115b.containsKey(t);
    }

    /* renamed from: g */
    public List mo3054g(T t) {
        return this.f3115b.get(t);
    }

    /* renamed from: h */
    public List<T> mo3055h(T t) {
        int size = this.f3115b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList o = this.f3115b.mo23391o(i);
            if (o != null && o.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3115b.mo23390j(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> mo3056i() {
        this.f3116c.clear();
        this.f3117d.clear();
        int size = this.f3115b.size();
        for (int i = 0; i < size; i++) {
            m3227e(this.f3115b.mo23390j(i), this.f3116c, this.f3117d);
        }
        return this.f3116c;
    }

    /* renamed from: j */
    public boolean mo3057j(T t) {
        int size = this.f3115b.size();
        for (int i = 0; i < size; i++) {
            ArrayList o = this.f3115b.mo23391o(i);
            if (o != null && o.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
