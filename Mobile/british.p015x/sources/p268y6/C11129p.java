package p268y6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: y6.p */
/* compiled from: CycleDetector */
class C11129p {

    /* renamed from: y6.p$b */
    /* compiled from: CycleDetector */
    private static class C11131b {

        /* renamed from: a */
        private final C11114d<?> f50116a;

        /* renamed from: b */
        private final Set<C11131b> f50117b = new HashSet();

        /* renamed from: c */
        private final Set<C11131b> f50118c = new HashSet();

        C11131b(C11114d<?> dVar) {
            this.f50116a = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo43415a(C11131b bVar) {
            this.f50117b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo43416b(C11131b bVar) {
            this.f50118c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C11114d<?> mo43417c() {
            return this.f50116a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set<C11131b> mo43418d() {
            return this.f50117b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo43419e() {
            return this.f50117b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo43420f() {
            return this.f50118c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo43421g(C11131b bVar) {
            this.f50118c.remove(bVar);
        }
    }

    /* renamed from: y6.p$c */
    /* compiled from: CycleDetector */
    private static class C11132c {

        /* renamed from: a */
        private final Class<?> f50119a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f50120b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C11132c)) {
                return false;
            }
            C11132c cVar = (C11132c) obj;
            if (!cVar.f50119a.equals(this.f50119a) || cVar.f50120b != this.f50120b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f50119a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f50120b).hashCode();
        }

        private C11132c(Class<?> cls, boolean z) {
            this.f50119a = cls;
            this.f50120b = z;
        }
    }

    /* renamed from: a */
    static void m49686a(List<C11114d<?>> list) {
        Set<C11131b> c = m49688c(list);
        Set<C11131b> b = m49687b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C11131b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C11131b next2 : next.mo43418d()) {
                next2.mo43421g(next);
                if (next2.mo43420f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C11131b next3 : c) {
                if (!next3.mo43420f() && !next3.mo43419e()) {
                    arrayList.add(next3.mo43417c());
                }
            }
            throw new C11134r(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C11131b> m49687b(Set<C11131b> set) {
        HashSet hashSet = new HashSet();
        for (C11131b next : set) {
            if (next.mo43420f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C11131b> m49688c(List<C11114d<?>> list) {
        Set<C11131b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C11114d next : list) {
            C11131b bVar = new C11131b(next);
            Iterator it = next.mo43394g().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C11132c cVar = new C11132c(cls, !next.mo43398m());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f50120b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C11131b> it2 : hashMap.values()) {
            for (C11131b bVar2 : it2) {
                for (C11133q next2 : bVar2.mo43417c().mo43392e()) {
                    if (next2.mo43426d() && (set = (Set) hashMap.get(new C11132c(next2.mo43424b(), next2.mo43429f()))) != null) {
                        for (C11131b bVar3 : set) {
                            bVar2.mo43415a(bVar3);
                            bVar3.mo43416b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
