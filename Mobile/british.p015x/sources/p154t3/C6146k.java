package p154t3;

import java.util.concurrent.Executor;
import p170w3.C6315a;

/* renamed from: t3.k */
/* compiled from: SafeLoggingExecutor */
class C6146k implements Executor {

    /* renamed from: b */
    private final Executor f25425b;

    /* renamed from: t3.k$a */
    /* compiled from: SafeLoggingExecutor */
    static class C6147a implements Runnable {

        /* renamed from: b */
        private final Runnable f25426b;

        C6147a(Runnable runnable) {
            this.f25426b = runnable;
        }

        public void run() {
            try {
                this.f25426b.run();
            } catch (Exception e) {
                C6315a.m27822c("Executor", "Background execution failure.", e);
            }
        }
    }

    C6146k(Executor executor) {
        this.f25425b = executor;
    }

    public void execute(Runnable runnable) {
        this.f25425b.execute(new C6147a(runnable));
    }
}
