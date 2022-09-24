package p090i0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p105l0.C5648h;

/* renamed from: i0.d */
/* compiled from: ExecutorCompat */
public final class C5424d {

    /* renamed from: i0.d$a */
    /* compiled from: ExecutorCompat */
    private static class C5425a implements Executor {

        /* renamed from: b */
        private final Handler f23775b;

        C5425a(Handler handler) {
            this.f23775b = (Handler) C5648h.m24964c(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f23775b.post((Runnable) C5648h.m24964c(runnable))) {
                throw new RejectedExecutionException(this.f23775b + " is shutting down");
            }
        }
    }

    /* renamed from: a */
    public static Executor m24377a(Handler handler) {
        return new C5425a(handler);
    }
}
