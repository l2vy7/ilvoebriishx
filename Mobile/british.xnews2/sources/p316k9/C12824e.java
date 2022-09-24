package p316k9;

import java.lang.reflect.Method;

/* renamed from: k9.e */
/* compiled from: ExceptionUtils */
public final class C12824e {

    /* renamed from: a */
    private static final Method f55491a = m54375b();

    /* renamed from: b */
    static /* synthetic */ Class f55492b;

    /* renamed from: a */
    static /* synthetic */ Class m54374a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* renamed from: b */
    private static Method m54375b() {
        try {
            Class[] clsArr = new Class[1];
            Class cls = f55492b;
            if (cls == null) {
                cls = m54374a("java.lang.Throwable");
                f55492b = cls;
            }
            clsArr[0] = cls;
            Class cls2 = f55492b;
            if (cls2 == null) {
                cls2 = m54374a("java.lang.Throwable");
                f55492b = cls2;
            }
            return cls2.getMethod("initCause", clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m54376c(Throwable th, Throwable th2) {
        Method method = f55491a;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        }
    }
}
