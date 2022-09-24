package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C1476d;
import com.google.common.util.concurrent.C10412b;

public abstract class Worker extends ListenableWorker {
    C1476d<ListenableWorker.C1412a> mFuture;

    /* renamed from: androidx.work.Worker$a */
    class C1416a implements Runnable {
        C1416a() {
        }

        public void run() {
            try {
                Worker.this.mFuture.mo6989p(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.mo6990q(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.C1412a doWork();

    public final C10412b<ListenableWorker.C1412a> startWork() {
        this.mFuture = C1476d.m7752t();
        getBackgroundExecutor().execute(new C1416a());
        return this.mFuture;
    }
}
