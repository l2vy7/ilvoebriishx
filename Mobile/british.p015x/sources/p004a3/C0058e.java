package p004a3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: a3.e */
/* compiled from: Executors */
public final class C0058e {

    /* renamed from: a */
    private static final Executor f179a = new C0059a();

    /* renamed from: b */
    private static final Executor f180b = new C0060b();

    /* renamed from: a3.e$a */
    /* compiled from: Executors */
    class C0059a implements Executor {

        /* renamed from: b */
        private final Handler f181b = new Handler(Looper.getMainLooper());

        C0059a() {
        }

        public void execute(Runnable runnable) {
            this.f181b.post(runnable);
        }
    }

    /* renamed from: a3.e$b */
    /* compiled from: Executors */
    class C0060b implements Executor {
        C0060b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m228a() {
        return f180b;
    }

    /* renamed from: b */
    public static Executor m229b() {
        return f179a;
    }
}
