package p303e8;

import java.util.Arrays;

/* renamed from: e8.c */
/* compiled from: Intrinsics */
public class C12691c {
    private C12691c() {
    }

    /* renamed from: a */
    public static boolean m53982a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m53983b(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m53986e(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: c */
    public static void m53984c(Object obj, String str) {
        if (obj == null) {
            m53988g(str);
        }
    }

    /* renamed from: d */
    private static String m53985d(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: e */
    private static <T extends Throwable> T m53986e(T t) {
        return m53987f(t, C12691c.class.getName());
    }

    /* renamed from: f */
    static <T extends Throwable> T m53987f(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: g */
    private static void m53988g(String str) {
        throw ((NullPointerException) m53986e(new NullPointerException(m53985d(str))));
    }
}
