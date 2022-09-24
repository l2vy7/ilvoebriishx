package p171x0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: x0.d */
/* compiled from: ModernAsyncTask */
abstract class C6343d<Params, Progress, Result> {

    /* renamed from: g */
    private static final ThreadFactory f26180g;

    /* renamed from: h */
    private static final BlockingQueue<Runnable> f26181h;

    /* renamed from: i */
    public static final Executor f26182i;

    /* renamed from: j */
    private static C6349f f26183j;

    /* renamed from: k */
    private static volatile Executor f26184k;

    /* renamed from: b */
    private final C6351h<Params, Result> f26185b;

    /* renamed from: c */
    private final FutureTask<Result> f26186c;

    /* renamed from: d */
    private volatile C6350g f26187d = C6350g.PENDING;

    /* renamed from: e */
    final AtomicBoolean f26188e = new AtomicBoolean();

    /* renamed from: f */
    final AtomicBoolean f26189f = new AtomicBoolean();

    /* renamed from: x0.d$a */
    /* compiled from: ModernAsyncTask */
    static class C6344a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f26190a = new AtomicInteger(1);

        C6344a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f26190a.getAndIncrement());
        }
    }

    /* renamed from: x0.d$b */
    /* compiled from: ModernAsyncTask */
    class C6345b extends C6351h<Params, Result> {
        C6345b() {
        }

        public Result call() throws Exception {
            C6343d.this.f26189f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = C6343d.this.mo24127b(this.f26200a);
                Binder.flushPendingCommands();
                C6343d.this.mo24169l(result);
                return result;
            } catch (Throwable th) {
                C6343d.this.mo24169l(result);
                throw th;
            }
        }
    }

    /* renamed from: x0.d$c */
    /* compiled from: ModernAsyncTask */
    class C6346c extends FutureTask<Result> {
        C6346c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                C6343d.this.mo24170m(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                C6343d.this.mo24170m(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: x0.d$d */
    /* compiled from: ModernAsyncTask */
    static /* synthetic */ class C6347d {

        /* renamed from: a */
        static final /* synthetic */ int[] f26193a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                x0.d$g[] r0 = p171x0.C6343d.C6350g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26193a = r0
                x0.d$g r1 = p171x0.C6343d.C6350g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26193a     // Catch:{ NoSuchFieldError -> 0x001d }
                x0.d$g r1 = p171x0.C6343d.C6350g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p171x0.C6343d.C6347d.<clinit>():void");
        }
    }

    /* renamed from: x0.d$e */
    /* compiled from: ModernAsyncTask */
    private static class C6348e<Data> {

        /* renamed from: a */
        final C6343d f26194a;

        /* renamed from: b */
        final Data[] f26195b;

        C6348e(C6343d dVar, Data... dataArr) {
            this.f26194a = dVar;
            this.f26195b = dataArr;
        }
    }

    /* renamed from: x0.d$f */
    /* compiled from: ModernAsyncTask */
    private static class C6349f extends Handler {
        C6349f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C6348e eVar = (C6348e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f26194a.mo24164d(eVar.f26195b[0]);
            } else if (i == 2) {
                eVar.f26194a.mo24168k(eVar.f26195b);
            }
        }
    }

    /* renamed from: x0.d$g */
    /* compiled from: ModernAsyncTask */
    public enum C6350g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: x0.d$h */
    /* compiled from: ModernAsyncTask */
    private static abstract class C6351h<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        Params[] f26200a;

        C6351h() {
        }
    }

    static {
        C6344a aVar = new C6344a();
        f26180g = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f26181h = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f26182i = threadPoolExecutor;
        f26184k = threadPoolExecutor;
    }

    C6343d() {
        C6345b bVar = new C6345b();
        this.f26185b = bVar;
        this.f26186c = new C6346c(bVar);
    }

    /* renamed from: e */
    private static Handler m27961e() {
        C6349f fVar;
        synchronized (C6343d.class) {
            if (f26183j == null) {
                f26183j = new C6349f();
            }
            fVar = f26183j;
        }
        return fVar;
    }

    /* renamed from: a */
    public final boolean mo24162a(boolean z) {
        this.f26188e.set(true);
        return this.f26186c.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Result mo24127b(Params... paramsArr);

    /* renamed from: c */
    public final C6343d<Params, Progress, Result> mo24163c(Executor executor, Params... paramsArr) {
        if (this.f26187d != C6350g.PENDING) {
            int i = C6347d.f26193a[this.f26187d.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f26187d = C6350g.RUNNING;
            mo24167j();
            this.f26185b.f26200a = paramsArr;
            executor.execute(this.f26186c);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24164d(Result result) {
        if (mo24165f()) {
            mo24128h(result);
        } else {
            mo24129i(result);
        }
        this.f26187d = C6350g.FINISHED;
    }

    /* renamed from: f */
    public final boolean mo24165f() {
        return this.f26188e.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo24166g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo24128h(Result result) {
        mo24166g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo24129i(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo24167j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo24168k(Progress... progressArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Result mo24169l(Result result) {
        m27961e().obtainMessage(1, new C6348e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo24170m(Result result) {
        if (!this.f26189f.get()) {
            mo24169l(result);
        }
    }
}
