package p268y6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: y6.d */
/* compiled from: Component */
public final class C11114d<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f50082a;

    /* renamed from: b */
    private final Set<C11133q> f50083b;

    /* renamed from: c */
    private final int f50084c;

    /* renamed from: d */
    private final int f50085d;

    /* renamed from: e */
    private final C11124h<T> f50086e;

    /* renamed from: f */
    private final Set<Class<?>> f50087f;

    /* renamed from: y6.d$b */
    /* compiled from: Component */
    public static class C11116b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f50088a;

        /* renamed from: b */
        private final Set<C11133q> f50089b;

        /* renamed from: c */
        private int f50090c;

        /* renamed from: d */
        private int f50091d;

        /* renamed from: e */
        private C11124h<T> f50092e;

        /* renamed from: f */
        private Set<Class<?>> f50093f;

        /* access modifiers changed from: private */
        /* renamed from: g */
        public C11116b<T> m49635g() {
            this.f50091d = 1;
            return this;
        }

        /* renamed from: h */
        private C11116b<T> m49636h(int i) {
            C11113c0.m49617d(this.f50090c == 0, "Instantiation type has already been set.");
            this.f50090c = i;
            return this;
        }

        /* renamed from: i */
        private void m49637i(Class<?> cls) {
            C11113c0.m49614a(!this.f50088a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C11116b<T> mo43400b(C11133q qVar) {
            C11113c0.m49616c(qVar, "Null dependency");
            m49637i(qVar.mo43424b());
            this.f50089b.add(qVar);
            return this;
        }

        /* renamed from: c */
        public C11116b<T> mo43401c() {
            return m49636h(1);
        }

        /* renamed from: d */
        public C11114d<T> mo43402d() {
            C11113c0.m49617d(this.f50092e != null, "Missing required property: factory.");
            return new C11114d(new HashSet(this.f50088a), new HashSet(this.f50089b), this.f50090c, this.f50091d, this.f50092e, this.f50093f);
        }

        /* renamed from: e */
        public C11116b<T> mo43403e() {
            return m49636h(2);
        }

        /* renamed from: f */
        public C11116b<T> mo43404f(C11124h<T> hVar) {
            this.f50092e = (C11124h) C11113c0.m49616c(hVar, "Null factory");
            return this;
        }

        @SafeVarargs
        private C11116b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f50088a = hashSet;
            this.f50089b = new HashSet();
            this.f50090c = 0;
            this.f50091d = 0;
            this.f50093f = new HashSet();
            C11113c0.m49616c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> c : clsArr) {
                C11113c0.m49616c(c, "Null interface");
            }
            Collections.addAll(this.f50088a, clsArr);
        }
    }

    /* renamed from: c */
    public static <T> C11116b<T> m49620c(Class<T> cls) {
        return new C11116b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> C11116b<T> m49621d(Class<T> cls, Class<? super T>... clsArr) {
        return new C11116b<>(cls, clsArr);
    }

    /* renamed from: i */
    public static <T> C11114d<T> m49622i(T t, Class<T> cls) {
        return m49623j(cls).mo43404f(new C12962b(t)).mo43402d();
    }

    /* renamed from: j */
    public static <T> C11116b<T> m49623j(Class<T> cls) {
        return m49620c(cls).m49635g();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ Object m49624n(Object obj, C11119e eVar) {
        return obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Object m49625o(Object obj, C11119e eVar) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: p */
    public static <T> C11114d<T> m49626p(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m49621d(cls, clsArr).mo43404f(new C12963c(t)).mo43402d();
    }

    /* renamed from: e */
    public Set<C11133q> mo43392e() {
        return this.f50083b;
    }

    /* renamed from: f */
    public C11124h<T> mo43393f() {
        return this.f50086e;
    }

    /* renamed from: g */
    public Set<Class<? super T>> mo43394g() {
        return this.f50082a;
    }

    /* renamed from: h */
    public Set<Class<?>> mo43395h() {
        return this.f50087f;
    }

    /* renamed from: k */
    public boolean mo43396k() {
        return this.f50084c == 1;
    }

    /* renamed from: l */
    public boolean mo43397l() {
        return this.f50084c == 2;
    }

    /* renamed from: m */
    public boolean mo43398m() {
        return this.f50085d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f50082a.toArray()) + ">{" + this.f50084c + ", type=" + this.f50085d + ", deps=" + Arrays.toString(this.f50083b.toArray()) + "}";
    }

    private C11114d(Set<Class<? super T>> set, Set<C11133q> set2, int i, int i2, C11124h<T> hVar, Set<Class<?>> set3) {
        this.f50082a = Collections.unmodifiableSet(set);
        this.f50083b = Collections.unmodifiableSet(set2);
        this.f50084c = i;
        this.f50085d = i2;
        this.f50086e = hVar;
        this.f50087f = Collections.unmodifiableSet(set3);
    }
}
