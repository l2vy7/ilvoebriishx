package p172x1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: x1.g */
/* compiled from: SerialExecutor */
public class C6361g implements Executor {

    /* renamed from: b */
    private final ArrayDeque<C6362a> f26216b = new ArrayDeque<>();

    /* renamed from: c */
    private final Executor f26217c;

    /* renamed from: d */
    private final Object f26218d = new Object();

    /* renamed from: e */
    private volatile Runnable f26219e;

    /* renamed from: x1.g$a */
    /* compiled from: SerialExecutor */
    static class C6362a implements Runnable {

        /* renamed from: b */
        final C6361g f26220b;

        /* renamed from: c */
        final Runnable f26221c;

        C6362a(C6361g gVar, Runnable runnable) {
            this.f26220b = gVar;
            this.f26221c = runnable;
        }

        public void run() {
            try {
                this.f26221c.run();
            } finally {
                this.f26220b.mo24189d();
            }
        }
    }

    public C6361g(Executor executor) {
        this.f26217c = executor;
    }

    /* renamed from: a */
    public boolean mo24188a() {
        boolean z;
        synchronized (this.f26218d) {
            z = !this.f26216b.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo24189d() {
        synchronized (this.f26218d) {
            Runnable poll = this.f26216b.poll();
            this.f26219e = poll;
            if (poll != null) {
                this.f26217c.execute(this.f26219e);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f26218d) {
            this.f26216b.add(new C6362a(this, runnable));
            if (this.f26219e == null) {
                mo24189d();
            }
        }
    }
}
