package p109m;

import java.util.concurrent.Executor;

/* renamed from: m.a */
/* compiled from: ArchTaskExecutor */
public class C5676a extends C5681c {

    /* renamed from: c */
    private static volatile C5676a f24283c;

    /* renamed from: d */
    private static final Executor f24284d = new C5677a();

    /* renamed from: e */
    private static final Executor f24285e = new C5678b();

    /* renamed from: a */
    private C5681c f24286a;

    /* renamed from: b */
    private C5681c f24287b;

    /* renamed from: m.a$a */
    /* compiled from: ArchTaskExecutor */
    static class C5677a implements Executor {
        C5677a() {
        }

        public void execute(Runnable runnable) {
            C5676a.m25078e().mo22375c(runnable);
        }
    }

    /* renamed from: m.a$b */
    /* compiled from: ArchTaskExecutor */
    static class C5678b implements Executor {
        C5678b() {
        }

        public void execute(Runnable runnable) {
            C5676a.m25078e().mo22373a(runnable);
        }
    }

    private C5676a() {
        C5679b bVar = new C5679b();
        this.f24287b = bVar;
        this.f24286a = bVar;
    }

    /* renamed from: d */
    public static Executor m25077d() {
        return f24285e;
    }

    /* renamed from: e */
    public static C5676a m25078e() {
        if (f24283c != null) {
            return f24283c;
        }
        synchronized (C5676a.class) {
            if (f24283c == null) {
                f24283c = new C5676a();
            }
        }
        return f24283c;
    }

    /* renamed from: a */
    public void mo22373a(Runnable runnable) {
        this.f24286a.mo22373a(runnable);
    }

    /* renamed from: b */
    public boolean mo22374b() {
        return this.f24286a.mo22374b();
    }

    /* renamed from: c */
    public void mo22375c(Runnable runnable) {
        this.f24286a.mo22375c(runnable);
    }
}
