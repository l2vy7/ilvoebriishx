package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.p */
/* compiled from: TransactionExecutor */
class C1212p implements Executor {

    /* renamed from: b */
    private final Executor f5529b;

    /* renamed from: c */
    private final ArrayDeque<Runnable> f5530c = new ArrayDeque<>();

    /* renamed from: d */
    private Runnable f5531d;

    /* renamed from: androidx.room.p$a */
    /* compiled from: TransactionExecutor */
    class C1213a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Runnable f5532b;

        C1213a(Runnable runnable) {
            this.f5532b = runnable;
        }

        public void run() {
            try {
                this.f5532b.run();
            } finally {
                C1212p.this.mo5964a();
            }
        }
    }

    C1212p(Executor executor) {
        this.f5529b = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo5964a() {
        Runnable poll = this.f5530c.poll();
        this.f5531d = poll;
        if (poll != null) {
            this.f5529b.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f5530c.offer(new C1213a(runnable));
        if (this.f5531d == null) {
            mo5964a();
        }
    }
}
