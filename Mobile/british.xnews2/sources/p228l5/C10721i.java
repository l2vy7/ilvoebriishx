package p228l5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: l5.i */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C10721i implements C10719g {
    /* synthetic */ C10721i(C10720h hVar) {
    }

    /* renamed from: a */
    public final ExecutorService mo42874a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: b */
    public final ExecutorService mo42875b(ThreadFactory threadFactory, int i) {
        return mo42874a(1, threadFactory, 1);
    }
}
