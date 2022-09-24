package p110m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m.b */
/* compiled from: DefaultTaskExecutor */
public class C5679b extends C5681c {

    /* renamed from: a */
    private final Object f24288a = new Object();

    /* renamed from: b */
    private final ExecutorService f24289b = Executors.newFixedThreadPool(4, new C5680a());

    /* renamed from: c */
    private volatile Handler f24290c;

    /* renamed from: m.b$a */
    /* compiled from: DefaultTaskExecutor */
    class C5680a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f24291a = new AtomicInteger(0);

        C5680a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f24291a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m25082d(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    /* renamed from: a */
    public void mo22373a(Runnable runnable) {
        this.f24289b.execute(runnable);
    }

    /* renamed from: b */
    public boolean mo22374b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public void mo22375c(Runnable runnable) {
        if (this.f24290c == null) {
            synchronized (this.f24288a) {
                if (this.f24290c == null) {
                    this.f24290c = m25082d(Looper.getMainLooper());
                }
            }
        }
        this.f24290c.post(runnable);
    }
}
