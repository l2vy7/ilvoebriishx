package p094j0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p104l0.C5641a;

/* renamed from: j0.g */
/* compiled from: RequestExecutor */
class C5488g {

    /* renamed from: j0.g$a */
    /* compiled from: RequestExecutor */
    private static class C5489a implements ThreadFactory {

        /* renamed from: a */
        private String f23881a;

        /* renamed from: b */
        private int f23882b;

        /* renamed from: j0.g$a$a */
        /* compiled from: RequestExecutor */
        private static class C5490a extends Thread {

            /* renamed from: b */
            private final int f23883b;

            C5490a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f23883b = i;
            }

            public void run() {
                Process.setThreadPriority(this.f23883b);
                super.run();
            }
        }

        C5489a(String str, int i) {
            this.f23881a = str;
            this.f23882b = i;
        }

        public Thread newThread(Runnable runnable) {
            return new C5490a(runnable, this.f23881a, this.f23882b);
        }
    }

    /* renamed from: j0.g$b */
    /* compiled from: RequestExecutor */
    private static class C5491b<T> implements Runnable {

        /* renamed from: b */
        private Callable<T> f23884b;

        /* renamed from: c */
        private C5641a<T> f23885c;

        /* renamed from: d */
        private Handler f23886d;

        /* renamed from: j0.g$b$a */
        /* compiled from: RequestExecutor */
        class C5492a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C5641a f23887b;

            /* renamed from: c */
            final /* synthetic */ Object f23888c;

            C5492a(C5641a aVar, Object obj) {
                this.f23887b = aVar;
                this.f23888c = obj;
            }

            public void run() {
                this.f23887b.accept(this.f23888c);
            }
        }

        C5491b(Handler handler, Callable<T> callable, C5641a<T> aVar) {
            this.f23884b = callable;
            this.f23885c = aVar;
            this.f23886d = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f23884b.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f23886d.post(new C5492a(this.f23885c, t));
        }
    }

    /* renamed from: a */
    static ThreadPoolExecutor m24522a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C5489a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    static <T> void m24523b(Executor executor, Callable<T> callable, C5641a<T> aVar) {
        executor.execute(new C5491b(C5474b.m24485a(), callable, aVar));
    }

    /* renamed from: c */
    static <T> T m24524c(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
