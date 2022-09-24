package p173x1;

import androidx.work.C1483m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: x1.o */
/* compiled from: WorkTimer */
public class C6375o {

    /* renamed from: f */
    private static final String f26261f = C1483m.m7773f("WorkTimer");

    /* renamed from: a */
    private final ThreadFactory f26262a;

    /* renamed from: b */
    private final ScheduledExecutorService f26263b;

    /* renamed from: c */
    final Map<String, C6378c> f26264c = new HashMap();

    /* renamed from: d */
    final Map<String, C6377b> f26265d = new HashMap();

    /* renamed from: e */
    final Object f26266e = new Object();

    /* renamed from: x1.o$a */
    /* compiled from: WorkTimer */
    class C6376a implements ThreadFactory {

        /* renamed from: a */
        private int f26267a = 0;

        C6376a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f26267a);
            this.f26267a = this.f26267a + 1;
            return newThread;
        }
    }

    /* renamed from: x1.o$b */
    /* compiled from: WorkTimer */
    public interface C6377b {
        /* renamed from: a */
        void mo6936a(String str);
    }

    /* renamed from: x1.o$c */
    /* compiled from: WorkTimer */
    public static class C6378c implements Runnable {

        /* renamed from: b */
        private final C6375o f26269b;

        /* renamed from: c */
        private final String f26270c;

        C6378c(C6375o oVar, String str) {
            this.f26269b = oVar;
            this.f26270c = str;
        }

        public void run() {
            synchronized (this.f26269b.f26266e) {
                if (this.f26269b.f26264c.remove(this.f26270c) != null) {
                    C6377b remove = this.f26269b.f26265d.remove(this.f26270c);
                    if (remove != null) {
                        remove.mo6936a(this.f26270c);
                    }
                } else {
                    C1483m.m7771c().mo7013a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f26270c}), new Throwable[0]);
                }
            }
        }
    }

    public C6375o() {
        C6376a aVar = new C6376a();
        this.f26262a = aVar;
        this.f26263b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public void mo24204a() {
        if (!this.f26263b.isShutdown()) {
            this.f26263b.shutdownNow();
        }
    }

    /* renamed from: b */
    public void mo24205b(String str, long j, C6377b bVar) {
        synchronized (this.f26266e) {
            C1483m.m7771c().mo7013a(f26261f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            mo24206c(str);
            C6378c cVar = new C6378c(this, str);
            this.f26264c.put(str, cVar);
            this.f26265d.put(str, bVar);
            this.f26263b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public void mo24206c(String str) {
        synchronized (this.f26266e) {
            if (this.f26264c.remove(str) != null) {
                C1483m.m7771c().mo7013a(f26261f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f26265d.remove(str);
            }
        }
    }
}
