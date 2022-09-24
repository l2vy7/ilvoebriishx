package p097j2;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: j2.a */
/* compiled from: GlideExecutor */
public final class C5502a implements ExecutorService {

    /* renamed from: c */
    private static final long f23911c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d */
    private static volatile int f23912d;

    /* renamed from: b */
    private final ExecutorService f23913b;

    /* renamed from: j2.a$a */
    /* compiled from: GlideExecutor */
    public static final class C5503a {

        /* renamed from: a */
        private final boolean f23914a;

        /* renamed from: b */
        private int f23915b;

        /* renamed from: c */
        private int f23916c;

        /* renamed from: d */
        private C5506c f23917d = C5506c.f23928d;

        /* renamed from: e */
        private String f23918e;

        /* renamed from: f */
        private long f23919f;

        C5503a(boolean z) {
            this.f23914a = z;
        }

        /* renamed from: a */
        public C5502a mo21993a() {
            if (!TextUtils.isEmpty(this.f23918e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f23915b, this.f23916c, this.f23919f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C5504b(this.f23918e, this.f23917d, this.f23914a));
                if (this.f23919f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new C5502a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f23918e);
        }

        /* renamed from: b */
        public C5503a mo21994b(String str) {
            this.f23918e = str;
            return this;
        }

        /* renamed from: c */
        public C5503a mo21995c(int i) {
            this.f23915b = i;
            this.f23916c = i;
            return this;
        }
    }

    /* renamed from: j2.a$b */
    /* compiled from: GlideExecutor */
    private static final class C5504b implements ThreadFactory {

        /* renamed from: a */
        private final String f23920a;

        /* renamed from: b */
        final C5506c f23921b;

        /* renamed from: c */
        final boolean f23922c;

        /* renamed from: d */
        private int f23923d;

        /* renamed from: j2.a$b$a */
        /* compiled from: GlideExecutor */
        class C5505a extends Thread {
            C5505a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C5504b.this.f23922c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C5504b.this.f23921b.mo21998a(th);
                }
            }
        }

        C5504b(String str, C5506c cVar, boolean z) {
            this.f23920a = str;
            this.f23921b = cVar;
            this.f23922c = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C5505a aVar;
            aVar = new C5505a(runnable, "glide-" + this.f23920a + "-thread-" + this.f23923d);
            this.f23923d = this.f23923d + 1;
            return aVar;
        }
    }

    /* renamed from: j2.a$c */
    /* compiled from: GlideExecutor */
    public interface C5506c {

        /* renamed from: a */
        public static final C5506c f23925a = new C5507a();

        /* renamed from: b */
        public static final C5506c f23926b;

        /* renamed from: c */
        public static final C5506c f23927c = new C5509c();

        /* renamed from: d */
        public static final C5506c f23928d;

        /* renamed from: j2.a$c$a */
        /* compiled from: GlideExecutor */
        class C5507a implements C5506c {
            C5507a() {
            }

            /* renamed from: a */
            public void mo21998a(Throwable th) {
            }
        }

        /* renamed from: j2.a$c$b */
        /* compiled from: GlideExecutor */
        class C5508b implements C5506c {
            C5508b() {
            }

            /* renamed from: a */
            public void mo21998a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: j2.a$c$c */
        /* compiled from: GlideExecutor */
        class C5509c implements C5506c {
            C5509c() {
            }

            /* renamed from: a */
            public void mo21998a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C5508b bVar = new C5508b();
            f23926b = bVar;
            f23928d = bVar;
        }

        /* renamed from: a */
        void mo21998a(Throwable th);
    }

    C5502a(ExecutorService executorService) {
        this.f23913b = executorService;
    }

    /* renamed from: a */
    public static int m24551a() {
        if (f23912d == 0) {
            f23912d = Math.min(4, C5510b.m24566a());
        }
        return f23912d;
    }

    /* renamed from: d */
    public static C5503a m24552d() {
        return new C5503a(true).mo21995c(m24551a() >= 4 ? 2 : 1).mo21994b("animation");
    }

    /* renamed from: e */
    public static C5502a m24553e() {
        return m24552d().mo21993a();
    }

    /* renamed from: f */
    public static C5503a m24554f() {
        return new C5503a(true).mo21995c(1).mo21994b("disk-cache");
    }

    /* renamed from: g */
    public static C5502a m24555g() {
        return m24554f().mo21993a();
    }

    /* renamed from: h */
    public static C5503a m24556h() {
        return new C5503a(false).mo21995c(m24551a()).mo21994b("source");
    }

    /* renamed from: i */
    public static C5502a m24557i() {
        return m24556h().mo21993a();
    }

    /* renamed from: j */
    public static C5502a m24558j() {
        return new C5502a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f23911c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C5504b("source-unlimited", C5506c.f23928d, false)));
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f23913b.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f23913b.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f23913b.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f23913b.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f23913b.isShutdown();
    }

    public boolean isTerminated() {
        return this.f23913b.isTerminated();
    }

    public void shutdown() {
        this.f23913b.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f23913b.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f23913b.submit(runnable);
    }

    public String toString() {
        return this.f23913b.toString();
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f23913b.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f23913b.invokeAny(collection, j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f23913b.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f23913b.submit(callable);
    }
}
