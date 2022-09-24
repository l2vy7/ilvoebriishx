package p102k2;

import com.bumptech.glide.C3327h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p004a3.C0065j;
import p065d2.C5163h;
import p102k2.C5596n;
import p105l0.C5645e;

/* renamed from: k2.r */
/* compiled from: MultiModelLoaderFactory */
public class C5604r {

    /* renamed from: e */
    private static final C5607c f24143e = new C5607c();

    /* renamed from: f */
    private static final C5596n<Object, Object> f24144f = new C5605a();

    /* renamed from: a */
    private final List<C5606b<?, ?>> f24145a;

    /* renamed from: b */
    private final C5607c f24146b;

    /* renamed from: c */
    private final Set<C5606b<?, ?>> f24147c;

    /* renamed from: d */
    private final C5645e<List<Throwable>> f24148d;

    /* renamed from: k2.r$a */
    /* compiled from: MultiModelLoaderFactory */
    private static class C5605a implements C5596n<Object, Object> {
        C5605a() {
        }

        /* renamed from: a */
        public C5596n.C5597a<Object> mo22113a(Object obj, int i, int i2, C5163h hVar) {
            return null;
        }

        /* renamed from: b */
        public boolean mo22114b(Object obj) {
            return false;
        }
    }

    /* renamed from: k2.r$b */
    /* compiled from: MultiModelLoaderFactory */
    private static class C5606b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f24149a;

        /* renamed from: b */
        final Class<Data> f24150b;

        /* renamed from: c */
        final C5598o<? extends Model, ? extends Data> f24151c;

        public C5606b(Class<Model> cls, Class<Data> cls2, C5598o<? extends Model, ? extends Data> oVar) {
            this.f24149a = cls;
            this.f24150b = cls2;
            this.f24151c = oVar;
        }

        /* renamed from: a */
        public boolean mo22175a(Class<?> cls) {
            return this.f24149a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo22176b(Class<?> cls, Class<?> cls2) {
            return mo22175a(cls) && this.f24150b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: k2.r$c */
    /* compiled from: MultiModelLoaderFactory */
    static class C5607c {
        C5607c() {
        }

        /* renamed from: a */
        public <Model, Data> C5602q<Model, Data> mo22177a(List<C5596n<Model, Data>> list, C5645e<List<Throwable>> eVar) {
            return new C5602q<>(list, eVar);
        }
    }

    public C5604r(C5645e<List<Throwable>> eVar) {
        this(eVar, f24143e);
    }

    /* renamed from: a */
    private <Model, Data> void m24872a(Class<Model> cls, Class<Data> cls2, C5598o<? extends Model, ? extends Data> oVar, boolean z) {
        C5606b bVar = new C5606b(cls, cls2, oVar);
        List<C5606b<?, ?>> list = this.f24145a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* renamed from: e */
    private <Model, Data> C5596n<Model, Data> m24873e(C5606b<?, ?> bVar) {
        return (C5596n) C0065j.m247d(bVar.f24151c.mo22118a(this));
    }

    /* renamed from: f */
    private static <Model, Data> C5596n<Model, Data> m24874f() {
        return f24144f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized <Model, Data> void mo22171b(Class<Model> cls, Class<Data> cls2, C5598o<? extends Model, ? extends Data> oVar) {
        m24872a(cls, cls2, oVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized <Model> List<C5596n<Model, ?>> mo22172c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C5606b next : this.f24145a) {
                if (!this.f24147c.contains(next)) {
                    if (next.mo22175a(cls)) {
                        this.f24147c.add(next);
                        arrayList.add(m24873e(next));
                        this.f24147c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f24147c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized <Model, Data> C5596n<Model, Data> mo22173d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C5606b next : this.f24145a) {
                if (this.f24147c.contains(next)) {
                    z = true;
                } else if (next.mo22176b(cls, cls2)) {
                    this.f24147c.add(next);
                    arrayList.add(m24873e(next));
                    this.f24147c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f24146b.mo22177a(arrayList, this.f24148d);
            } else if (arrayList.size() == 1) {
                return (C5596n) arrayList.get(0);
            } else if (z) {
                return m24874f();
            } else {
                throw new C3327h.C3330c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f24147c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized List<Class<?>> mo22174g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C5606b next : this.f24145a) {
            if (!arrayList.contains(next.f24150b) && next.mo22175a(cls)) {
                arrayList.add(next.f24150b);
            }
        }
        return arrayList;
    }

    C5604r(C5645e<List<Throwable>> eVar, C5607c cVar) {
        this.f24145a = new ArrayList();
        this.f24147c = new HashSet();
        this.f24148d = eVar;
        this.f24146b = cVar;
    }
}
