package p238o5;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: o5.d */
public final class C10856d {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static <T> T m48866a(Callable<T> callable) throws Exception {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
