package p089i0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: i0.k */
/* compiled from: TraceCompat */
public final class C5433k {

    /* renamed from: a */
    private static long f23785a;

    /* renamed from: b */
    private static Method f23786b;

    /* renamed from: c */
    private static Method f23787c;

    /* renamed from: d */
    private static Method f23788d;

    /* renamed from: e */
    private static Method f23789e;

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                f23785a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f23786b = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f23787c = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f23788d = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f23789e = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m24388a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static void m24389b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
