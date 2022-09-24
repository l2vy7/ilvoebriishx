package p106l1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l1.a */
/* compiled from: Trace */
public final class C5650a {

    /* renamed from: a */
    private static long f24217a;

    /* renamed from: b */
    private static Method f24218b;

    /* renamed from: a */
    public static void m24972a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C5651b.m24977a(str);
        }
    }

    /* renamed from: b */
    public static void m24973b() {
        if (Build.VERSION.SDK_INT >= 18) {
            C5651b.m24978b();
        }
    }

    /* renamed from: c */
    private static void m24974c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m24975d() {
        try {
            if (f24218b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m24976e();
    }

    /* renamed from: e */
    private static boolean m24976e() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f24218b == null) {
                    f24217a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                    f24218b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                }
                return ((Boolean) f24218b.invoke((Object) null, new Object[]{Long.valueOf(f24217a)})).booleanValue();
            } catch (Exception e) {
                m24974c("isTagEnabled", e);
            }
        }
        return false;
    }
}
