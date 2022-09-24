package p268y6;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p201d7.C10506c;
import p201d7.C10507d;
import p216h7.C10581b;
import p269z6.C11151a;

/* renamed from: y6.n */
/* compiled from: ComponentRuntime */
public class C11126n extends C11111a implements C11151a {

    /* renamed from: g */
    private static final C10581b<Set<Object>> f50106g = C12966k.f55696a;

    /* renamed from: a */
    private final Map<C11114d<?>, C10581b<?>> f50107a;

    /* renamed from: b */
    private final Map<Class<?>, C10581b<?>> f50108b;

    /* renamed from: c */
    private final Map<Class<?>, C11139x<?>> f50109c;

    /* renamed from: d */
    private final List<C10581b<C11125i>> f50110d;

    /* renamed from: e */
    private final C11136u f50111e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f50112f;

    /* renamed from: y6.n$b */
    /* compiled from: ComponentRuntime */
    public static final class C11128b {

        /* renamed from: a */
        private final Executor f50113a;

        /* renamed from: b */
        private final List<C10581b<C11125i>> f50114b = new ArrayList();

        /* renamed from: c */
        private final List<C11114d<?>> f50115c = new ArrayList();

        C11128b(Executor executor) {
            this.f50113a = executor;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ C11125i m49681f(C11125i iVar) {
            return iVar;
        }

        /* renamed from: b */
        public C11128b mo43411b(C11114d<?> dVar) {
            this.f50115c.add(dVar);
            return this;
        }

        /* renamed from: c */
        public C11128b mo43412c(C11125i iVar) {
            this.f50114b.add(new C12969o(iVar));
            return this;
        }

        /* renamed from: d */
        public C11128b mo43413d(Collection<C10581b<C11125i>> collection) {
            this.f50114b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C11126n mo43414e() {
            return new C11126n(this.f50113a, this.f50114b, this.f50115c);
        }
    }

    /* renamed from: h */
    public static C11128b m49664h(Executor executor) {
        return new C11128b(executor);
    }

    /* renamed from: i */
    private void m49665i(List<C11114d<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<C10581b<C11125i>> it = this.f50110d.iterator();
            while (it.hasNext()) {
                try {
                    C11125i iVar = (C11125i) it.next().get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it.remove();
                    }
                } catch (C11137v e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f50107a.isEmpty()) {
                C11129p.m49686a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f50107a.keySet());
                arrayList2.addAll(list);
                C11129p.m49686a(arrayList2);
            }
            for (C11114d next : list) {
                this.f50107a.put(next, new C11138w(new C12965j(this, next)));
            }
            arrayList.addAll(m49673r(list));
            arrayList.addAll(m49674s());
            m49672q();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        m49671p();
    }

    /* renamed from: j */
    private void m49666j(Map<C11114d<?>, C10581b<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            C11114d dVar = (C11114d) next.getKey();
            C10581b bVar = (C10581b) next.getValue();
            if (dVar.mo43396k() || (dVar.mo43397l() && z)) {
                bVar.get();
            }
        }
        this.f50111e.mo43432d();
    }

    /* renamed from: l */
    private static <T> List<T> m49667l(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object m49668m(C11114d dVar) {
        return dVar.mo43393f().mo41852a(new C11117d0(dVar, this));
    }

    /* renamed from: p */
    private void m49671p() {
        Boolean bool = this.f50112f.get();
        if (bool != null) {
            m49666j(this.f50107a, bool.booleanValue());
        }
    }

    /* renamed from: q */
    private void m49672q() {
        for (C11114d next : this.f50107a.keySet()) {
            Iterator<C11133q> it = next.mo43392e().iterator();
            while (true) {
                if (it.hasNext()) {
                    C11133q next2 = it.next();
                    if (next2.mo43429f() && !this.f50109c.containsKey(next2.mo43424b())) {
                        this.f50109c.put(next2.mo43424b(), C11139x.m49713b(Collections.emptySet()));
                    } else if (this.f50108b.containsKey(next2.mo43424b())) {
                        continue;
                    } else if (next2.mo43427e()) {
                        throw new C11140y(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo43424b()}));
                    } else if (!next2.mo43429f()) {
                        this.f50108b.put(next2.mo43424b(), C11112b0.m49610c());
                    }
                }
            }
        }
    }

    /* renamed from: r */
    private List<Runnable> m49673r(List<C11114d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C11114d next : list) {
            if (next.mo43398m()) {
                C10581b bVar = this.f50107a.get(next);
                for (Class cls : next.mo43394g()) {
                    if (!this.f50108b.containsKey(cls)) {
                        this.f50108b.put(cls, bVar);
                    } else {
                        arrayList.add(new C12968m((C11112b0) this.f50108b.get(cls), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    private List<Runnable> m49674s() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f50107a.entrySet()) {
            C11114d dVar = (C11114d) next.getKey();
            if (!dVar.mo43398m()) {
                C10581b bVar = (C10581b) next.getValue();
                for (Class cls : dVar.mo43394g()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f50109c.containsKey(entry.getKey())) {
                this.f50109c.put((Class) entry.getKey(), C11139x.m49713b((Collection) entry.getValue()));
            } else {
                C11139x xVar = this.f50109c.get(entry.getKey());
                for (C10581b lVar : (Set) entry.getValue()) {
                    arrayList.add(new C12967l(xVar, lVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo43389a(Class cls) {
        return super.mo43389a(cls);
    }

    /* renamed from: b */
    public synchronized <T> C10581b<T> mo43405b(Class<T> cls) {
        C11113c0.m49616c(cls, "Null interface requested.");
        return this.f50108b.get(cls);
    }

    /* renamed from: c */
    public synchronized <T> C10581b<Set<T>> mo43406c(Class<T> cls) {
        C11139x xVar = this.f50109c.get(cls);
        if (xVar != null) {
            return xVar;
        }
        return f50106g;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Set mo43390d(Class cls) {
        return super.mo43390d(cls);
    }

    /* renamed from: k */
    public void mo43410k(boolean z) {
        HashMap hashMap;
        if (this.f50112f.compareAndSet((Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f50107a);
            }
            m49666j(hashMap, z);
        }
    }

    private C11126n(Executor executor, Iterable<C10581b<C11125i>> iterable, Collection<C11114d<?>> collection) {
        this.f50107a = new HashMap();
        this.f50108b = new HashMap();
        this.f50109c = new HashMap();
        this.f50112f = new AtomicReference<>();
        C11136u uVar = new C11136u(executor);
        this.f50111e = uVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C11114d.m49626p(uVar, C11136u.class, C10507d.class, C10506c.class));
        arrayList.add(C11114d.m49626p(this, C11151a.class, new Class[0]));
        for (C11114d next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f50110d = m49667l(iterable);
        m49665i(arrayList);
    }
}
