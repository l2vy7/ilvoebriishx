package p268y6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p201d7.C10506c;
import p216h7.C10581b;

/* renamed from: y6.d0 */
/* compiled from: RestrictedComponentContainer */
final class C11117d0 extends C11111a {

    /* renamed from: a */
    private final Set<Class<?>> f50094a;

    /* renamed from: b */
    private final Set<Class<?>> f50095b;

    /* renamed from: c */
    private final Set<Class<?>> f50096c;

    /* renamed from: d */
    private final Set<Class<?>> f50097d;

    /* renamed from: e */
    private final Set<Class<?>> f50098e;

    /* renamed from: f */
    private final Set<Class<?>> f50099f;

    /* renamed from: g */
    private final C11119e f50100g;

    /* renamed from: y6.d0$a */
    /* compiled from: RestrictedComponentContainer */
    private static class C11118a implements C10506c {

        /* renamed from: a */
        private final Set<Class<?>> f50101a;

        /* renamed from: b */
        private final C10506c f50102b;

        public C11118a(Set<Class<?>> set, C10506c cVar) {
            this.f50101a = set;
            this.f50102b = cVar;
        }
    }

    C11117d0(C11114d<?> dVar, C11119e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C11133q next : dVar.mo43392e()) {
            if (next.mo43426d()) {
                if (next.mo43429f()) {
                    hashSet4.add(next.mo43424b());
                } else {
                    hashSet.add(next.mo43424b());
                }
            } else if (next.mo43425c()) {
                hashSet3.add(next.mo43424b());
            } else if (next.mo43429f()) {
                hashSet5.add(next.mo43424b());
            } else {
                hashSet2.add(next.mo43424b());
            }
        }
        if (!dVar.mo43395h().isEmpty()) {
            hashSet.add(C10506c.class);
        }
        this.f50094a = Collections.unmodifiableSet(hashSet);
        this.f50095b = Collections.unmodifiableSet(hashSet2);
        this.f50096c = Collections.unmodifiableSet(hashSet3);
        this.f50097d = Collections.unmodifiableSet(hashSet4);
        this.f50098e = Collections.unmodifiableSet(hashSet5);
        this.f50099f = dVar.mo43395h();
        this.f50100g = eVar;
    }

    /* renamed from: a */
    public <T> T mo43389a(Class<T> cls) {
        if (this.f50094a.contains(cls)) {
            T a = this.f50100g.mo43389a(cls);
            if (!cls.equals(C10506c.class)) {
                return a;
            }
            return new C11118a(this.f50099f, (C10506c) a);
        }
        throw new C11135s(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> C10581b<T> mo43405b(Class<T> cls) {
        if (this.f50095b.contains(cls)) {
            return this.f50100g.mo43405b(cls);
        }
        throw new C11135s(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> C10581b<Set<T>> mo43406c(Class<T> cls) {
        if (this.f50098e.contains(cls)) {
            return this.f50100g.mo43406c(cls);
        }
        throw new C11135s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> Set<T> mo43390d(Class<T> cls) {
        if (this.f50097d.contains(cls)) {
            return this.f50100g.mo43390d(cls);
        }
        throw new C11135s(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
