package p087h2;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p004a3.C0065j;

/* renamed from: h2.j */
/* compiled from: LruArrayPool */
public final class C5393j implements C5382b {

    /* renamed from: a */
    private final C5390h<C5394a, Object> f23681a = new C5390h<>();

    /* renamed from: b */
    private final C5395b f23682b = new C5395b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f23683c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C5381a<?>> f23684d = new HashMap();

    /* renamed from: e */
    private final int f23685e;

    /* renamed from: f */
    private int f23686f;

    /* renamed from: h2.j$a */
    /* compiled from: LruArrayPool */
    private static final class C5394a implements C5400m {

        /* renamed from: a */
        private final C5395b f23687a;

        /* renamed from: b */
        int f23688b;

        /* renamed from: c */
        private Class<?> f23689c;

        C5394a(C5395b bVar) {
            this.f23687a = bVar;
        }

        /* renamed from: a */
        public void mo21815a() {
            this.f23687a.mo21824c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo21841b(int i, Class<?> cls) {
            this.f23688b = i;
            this.f23689c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5394a)) {
                return false;
            }
            C5394a aVar = (C5394a) obj;
            if (this.f23688b == aVar.f23688b && this.f23689c == aVar.f23689c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f23688b * 31;
            Class<?> cls = this.f23689c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f23688b + "array=" + this.f23689c + '}';
        }
    }

    /* renamed from: h2.j$b */
    /* compiled from: LruArrayPool */
    private static final class C5395b extends C5386d<C5394a> {
        C5395b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C5394a mo21820a() {
            return new C5394a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C5394a mo21846e(int i, Class<?> cls) {
            C5394a aVar = (C5394a) mo21823b();
            aVar.mo21841b(i, cls);
            return aVar;
        }
    }

    public C5393j(int i) {
        this.f23685e = i;
    }

    /* renamed from: e */
    private void m24257e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> l = m24264l(cls);
        Integer num = (Integer) l.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            l.remove(Integer.valueOf(i));
        } else {
            l.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: f */
    private void m24258f() {
        m24259g(this.f23685e);
    }

    /* renamed from: g */
    private void m24259g(int i) {
        while (this.f23686f > i) {
            Object f = this.f23681a.mo21834f();
            C0065j.m247d(f);
            C5381a h = m24260h(f);
            this.f23686f -= h.mo21800b(f) * h.mo21799a();
            m24257e(h.mo21800b(f), f.getClass());
            if (Log.isLoggable(h.getTag(), 2)) {
                Log.v(h.getTag(), "evicted: " + h.mo21800b(f));
            }
        }
    }

    /* renamed from: h */
    private <T> C5381a<T> m24260h(T t) {
        return m24261i(t.getClass());
    }

    /* renamed from: i */
    private <T> C5381a<T> m24261i(Class<T> cls) {
        C5381a<T> aVar = this.f23684d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C5392i();
            } else if (cls.equals(byte[].class)) {
                aVar = new C5389g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f23684d.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: j */
    private <T> T m24262j(C5394a aVar) {
        return this.f23681a.mo21832a(aVar);
    }

    /* renamed from: k */
    private <T> T m24263k(C5394a aVar, Class<T> cls) {
        C5381a<T> i = m24261i(cls);
        T j = m24262j(aVar);
        if (j != null) {
            this.f23686f -= i.mo21800b(j) * i.mo21799a();
            m24257e(i.mo21800b(j), cls);
        }
        if (j != null) {
            return j;
        }
        if (Log.isLoggable(i.getTag(), 2)) {
            Log.v(i.getTag(), "Allocated " + aVar.f23688b + " bytes");
        }
        return i.newArray(aVar.f23688b);
    }

    /* renamed from: l */
    private NavigableMap<Integer, Integer> m24264l(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f23683c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f23683c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: m */
    private boolean m24265m() {
        int i = this.f23686f;
        return i == 0 || this.f23685e / i >= 2;
    }

    /* renamed from: n */
    private boolean m24266n(int i) {
        return i <= this.f23685e / 2;
    }

    /* renamed from: o */
    private boolean m24267o(int i, Integer num) {
        return num != null && (m24265m() || num.intValue() <= i * 8);
    }

    /* renamed from: a */
    public synchronized void mo21803a(int i) {
        if (i >= 40) {
            try {
                mo21804b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m24259g(this.f23685e / 2);
        }
    }

    /* renamed from: b */
    public synchronized void mo21804b() {
        m24259g(0);
    }

    /* renamed from: c */
    public synchronized <T> T mo21805c(int i, Class<T> cls) {
        return m24263k(this.f23682b.mo21846e(i, cls), cls);
    }

    /* renamed from: d */
    public synchronized <T> T mo21806d(int i, Class<T> cls) {
        C5394a aVar;
        Integer ceilingKey = m24264l(cls).ceilingKey(Integer.valueOf(i));
        if (m24267o(i, ceilingKey)) {
            aVar = this.f23682b.mo21846e(ceilingKey.intValue(), cls);
        } else {
            aVar = this.f23682b.mo21846e(i, cls);
        }
        return m24263k(aVar, cls);
    }

    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        C5381a<?> i = m24261i(cls);
        int b = i.mo21800b(t);
        int a = i.mo21799a() * b;
        if (m24266n(a)) {
            C5394a e = this.f23682b.mo21846e(b, cls);
            this.f23681a.mo21833d(e, t);
            NavigableMap<Integer, Integer> l = m24264l(cls);
            Integer num = (Integer) l.get(Integer.valueOf(e.f23688b));
            Integer valueOf = Integer.valueOf(e.f23688b);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            l.put(valueOf, Integer.valueOf(i2));
            this.f23686f += a;
            m24258f();
        }
    }
}
