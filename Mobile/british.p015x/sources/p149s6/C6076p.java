package p149s6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: s6.p */
/* compiled from: Throwables */
public final class C6076p {
    @NullableDecl

    /* renamed from: a */
    private static final Object f25260a;
    @NullableDecl

    /* renamed from: b */
    private static final Method f25261b;
    @NullableDecl

    /* renamed from: c */
    private static final Method f25262c;

    static {
        Method method;
        Object b = m26699b();
        f25260a = b;
        Method method2 = null;
        if (b == null) {
            method = null;
        } else {
            method = m26698a();
        }
        f25261b = method;
        if (b != null) {
            method2 = m26701d();
        }
        f25262c = method2;
    }

    @NullableDecl
    /* renamed from: a */
    private static Method m26698a() {
        return m26700c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @NullableDecl
    /* renamed from: b */
    private static Object m26699b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    /* renamed from: c */
    private static Method m26700c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    /* renamed from: d */
    private static Method m26701d() {
        try {
            Method c = m26700c("getStackTraceDepth", Throwable.class);
            if (c == null) {
                return null;
            }
            c.invoke(m26699b(), new Object[]{new Throwable()});
            return c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m26702e(Throwable th) {
        C6073k.m26688k(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
