package p177y1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p172x1.C6361g;

/* renamed from: y1.b */
/* compiled from: WorkManagerTaskExecutor */
public class C6401b implements C6400a {

    /* renamed from: a */
    private final C6361g f26320a;

    /* renamed from: b */
    private final Handler f26321b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Executor f26322c = new C6402a();

    /* renamed from: y1.b$a */
    /* compiled from: WorkManagerTaskExecutor */
    class C6402a implements Executor {
        C6402a() {
        }

        public void execute(Runnable runnable) {
            C6401b.this.mo24235d(runnable);
        }
    }

    public C6401b(Executor executor) {
        this.f26320a = new C6361g(executor);
    }

    /* renamed from: a */
    public Executor mo24232a() {
        return this.f26322c;
    }

    /* renamed from: b */
    public void mo24233b(Runnable runnable) {
        this.f26320a.execute(runnable);
    }

    /* renamed from: c */
    public C6361g mo24234c() {
        return this.f26320a;
    }

    /* renamed from: d */
    public void mo24235d(Runnable runnable) {
        this.f26321b.post(runnable);
    }
}
