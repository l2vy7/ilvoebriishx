package com.google.ads.interactivemedia.p038v3.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arw */
/* compiled from: IMASDK */
public final class arw {

    /* renamed from: a */
    private static final Object f15621a;

    static {
        Object b = m14644b();
        f15621a = b;
        if (b != null) {
            m14645c("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (b != null) {
            m14646d();
        }
    }

    /* renamed from: a */
    public static void m14643a(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* renamed from: b */
    private static Object m14644b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m14645c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static void m14646d() {
        try {
            Method c = m14645c("getStackTraceDepth", Throwable.class);
            if (c != null) {
                c.invoke(m14644b(), new Object[]{new Throwable()});
            }
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
