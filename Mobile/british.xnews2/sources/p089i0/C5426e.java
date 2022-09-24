package p089i0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* renamed from: i0.e */
/* compiled from: HandlerCompat */
public final class C5426e {

    /* renamed from: i0.e$a */
    /* compiled from: HandlerCompat */
    private static class C5427a {
        /* renamed from: a */
        public static Handler m24379a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: a */
    public static Handler m24378a(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return C5427a.m24379a(looper);
        }
        if (i >= 17) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e) {
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException(cause);
                }
            }
        }
        return new Handler(looper);
    }
}
