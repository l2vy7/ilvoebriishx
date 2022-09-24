package androidx.lifecycle;

import androidx.lifecycle.C0769d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a */
/* compiled from: ClassesInfoCache */
final class C0764a {

    /* renamed from: c */
    static C0764a f3825c = new C0764a();

    /* renamed from: a */
    private final Map<Class<?>, C0765a> f3826a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f3827b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a */
    /* compiled from: ClassesInfoCache */
    static class C0765a {

        /* renamed from: a */
        final Map<C0769d.C0771b, List<C0766b>> f3828a = new HashMap();

        /* renamed from: b */
        final Map<C0766b, C0769d.C0771b> f3829b;

        C0765a(Map<C0766b, C0769d.C0771b> map) {
            this.f3829b = map;
            for (Map.Entry next : map.entrySet()) {
                C0769d.C0771b bVar = (C0769d.C0771b) next.getValue();
                List list = this.f3828a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3828a.put(bVar, list);
                }
                list.add(next.getKey());
            }
        }

        /* renamed from: b */
        private static void m4256b(List<C0766b> list, C0775g gVar, C0769d.C0771b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).mo3974a(gVar, bVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3973a(C0775g gVar, C0769d.C0771b bVar, Object obj) {
            m4256b(this.f3828a.get(bVar), gVar, bVar, obj);
            m4256b(this.f3828a.get(C0769d.C0771b.ON_ANY), gVar, bVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.a$b */
    /* compiled from: ClassesInfoCache */
    static final class C0766b {

        /* renamed from: a */
        final int f3830a;

        /* renamed from: b */
        final Method f3831b;

        C0766b(int i, Method method) {
            this.f3830a = i;
            this.f3831b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3974a(C0775g gVar, C0769d.C0771b bVar, Object obj) {
            try {
                int i = this.f3830a;
                if (i == 0) {
                    this.f3831b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f3831b.invoke(obj, new Object[]{gVar});
                } else if (i == 2) {
                    this.f3831b.invoke(obj, new Object[]{gVar, bVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0766b)) {
                return false;
            }
            C0766b bVar = (C0766b) obj;
            if (this.f3830a != bVar.f3830a || !this.f3831b.getName().equals(bVar.f3831b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f3830a * 31) + this.f3831b.getName().hashCode();
        }
    }

    C0764a() {
    }

    /* renamed from: a */
    private C0765a m4251a(Class<?> cls, Method[] methodArr) {
        int i;
        C0765a c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo3971c(superclass)) == null)) {
            hashMap.putAll(c.f3829b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry next : mo3971c(c2).f3829b.entrySet()) {
                m4253e(hashMap, (C0766b) next.getKey(), (C0769d.C0771b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m4252b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0783n nVar = (C0783n) method.getAnnotation(C0783n.class);
            if (nVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0775g.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0769d.C0771b value = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0769d.C0771b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0769d.C0771b.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m4253e(hashMap, new C0766b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0765a aVar = new C0765a(hashMap);
        this.f3826a.put(cls, aVar);
        this.f3827b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m4252b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m4253e(Map<C0766b, C0769d.C0771b> map, C0766b bVar, C0769d.C0771b bVar2, Class<?> cls) {
        C0769d.C0771b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f3831b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0765a mo3971c(Class<?> cls) {
        C0765a aVar = this.f3826a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m4251a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3972d(Class<?> cls) {
        Boolean bool = this.f3827b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m4252b(cls);
        for (Method annotation : b) {
            if (((C0783n) annotation.getAnnotation(C0783n.class)) != null) {
                m4251a(cls, b);
                return true;
            }
        }
        this.f3827b.put(cls, Boolean.FALSE);
        return false;
    }
}
