package com.startapp.networkTest.threads;

import android.os.Build;
import com.startapp.C11804b9;
import com.startapp.C12469z8;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
public class ThreadManager {

    /* renamed from: d */
    private static final ThreadManager f53923d = new ThreadManager();

    /* renamed from: a */
    private final ScheduledExecutorService f53924a = new C11804b9(m52678a(1, 60, TimeUnit.SECONDS, true));

    /* renamed from: b */
    private final ExecutorService f53925b;

    /* renamed from: c */
    private final ExecutorService f53926c;

    /* renamed from: com.startapp.networkTest.threads.ThreadManager$a */
    /* compiled from: Sta */
    public class C12098a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f53927a = new AtomicInteger();

        /* renamed from: b */
        public final /* synthetic */ String f53928b;

        public C12098a(String str) {
            this.f53928b = str;
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f53928b + "-" + this.f53927a.incrementAndGet());
        }
    }

    /* renamed from: com.startapp.networkTest.threads.ThreadManager$b */
    /* compiled from: Sta */
    public class C12099b implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                threadPoolExecutor.getQueue().put(runnable);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private ThreadManager() {
        Class<ThreadManager> cls = ThreadManager.class;
        this.f53925b = new C12469z8(m52677a(0, 1, 30, cls.getSimpleName() + "-Single"));
        this.f53926c = new C12469z8(m52677a(0, 4, 30, cls.getSimpleName() + "-Cached"));
    }

    /* renamed from: b */
    public static ThreadManager m52679b() {
        return f53923d;
    }

    /* renamed from: a */
    public ExecutorService mo45624a() {
        return this.f53926c;
    }

    /* renamed from: c */
    public ExecutorService mo45625c() {
        return this.f53925b;
    }

    /* renamed from: d */
    public ScheduledExecutorService mo45626d() {
        return this.f53924a;
    }

    /* renamed from: a */
    private static ExecutorService m52677a(int i, int i2, long j, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, j, TimeUnit.SECONDS, new LinkedTransferQueue<Runnable>() {
                /* renamed from: a */
                public boolean offer(Runnable runnable) {
                    return tryTransfer(runnable);
                }
            }, new C12098a(str), new C12099b());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        } else if (i2 < 2) {
            return Executors.newSingleThreadExecutor();
        } else {
            return Executors.newCachedThreadPool();
        }
    }

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor m52678a(int i, long j, TimeUnit timeUnit, boolean z) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i);
        scheduledThreadPoolExecutor.setKeepAliveTime(j, timeUnit);
        if (Build.VERSION.SDK_INT >= 9) {
            scheduledThreadPoolExecutor.allowCoreThreadTimeOut(z);
        }
        return scheduledThreadPoolExecutor;
    }
}
