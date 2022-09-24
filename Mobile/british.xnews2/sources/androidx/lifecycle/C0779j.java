package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.j */
/* compiled from: Lifecycling */
public class C0779j {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f3851a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends C0768c>>> f3852b = new HashMap();

    /* renamed from: a */
    private static C0768c m4293a(Constructor<? extends C0768c> constructor, Object obj) {
        try {
            return (C0768c) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends C0768c> m4294b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c = m4295c(canonicalName);
            if (!name.isEmpty()) {
                c = name + "." + c;
            }
            Constructor<?> declaredConstructor = Class.forName(c).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m4295c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m4296d(Class<?> cls) {
        Integer num = f3851a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m4299g(cls);
        f3851a.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private static boolean m4297e(Class<?> cls) {
        return cls != null && C0774f.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    static C0773e m4298f(Object obj) {
        boolean z = obj instanceof C0773e;
        boolean z2 = obj instanceof C0767b;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C0767b) obj, (C0773e) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C0767b) obj, (C0773e) null);
        }
        if (z) {
            return (C0773e) obj;
        }
        Class<?> cls = obj.getClass();
        if (m4296d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f3852b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m4293a((Constructor) list.get(0), obj));
        }
        C0768c[] cVarArr = new C0768c[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cVarArr[i] = m4293a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    /* renamed from: g */
    private static int m4299g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0768c> b = m4294b(cls);
        if (b != null) {
            f3852b.put(cls, Collections.singletonList(b));
            return 2;
        } else if (C0764a.f3825c.mo3972d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m4297e(superclass)) {
                if (m4296d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f3852b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m4297e(cls2)) {
                    if (m4296d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f3852b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3852b.put(cls, arrayList);
            return 2;
        }
    }
}
