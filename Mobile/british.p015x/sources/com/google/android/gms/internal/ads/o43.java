package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class o43 {
    @CheckForNull

    /* renamed from: a */
    private static final Object f20600a;
    @CheckForNull

    /* renamed from: b */
    private static final Method f20601b;
    @CheckForNull

    /* renamed from: c */
    private static final Method f20602c;

    static {
        Method method;
        Object c = m20757c();
        f20600a = c;
        Method method2 = null;
        if (c == null) {
            method = null;
        } else {
            method = m20758d("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f20601b = method;
        if (c != null) {
            method2 = m20759e(c);
        }
        f20602c = method2;
    }

    /* renamed from: a */
    public static String m20755a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static void m20756b(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @CheckForNull
    /* renamed from: c */
    private static Object m20757c() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    /* renamed from: d */
    private static Method m20758d(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    /* renamed from: e */
    private static Method m20759e(Object obj) {
        try {
            Method d = m20758d("getStackTraceDepth", Throwable.class);
            if (d == null) {
                return null;
            }
            d.invoke(obj, new Object[]{new Throwable()});
            return d;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
