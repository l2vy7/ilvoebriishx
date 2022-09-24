package p082g2;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p004a3.C0065j;
import p065d2.C5159f;
import p082g2.C5314p;

/* renamed from: g2.a */
/* compiled from: ActiveResources */
final class C5268a {

    /* renamed from: a */
    private final boolean f23288a;

    /* renamed from: b */
    private final Executor f23289b;

    /* renamed from: c */
    final Map<C5159f, C5273d> f23290c;

    /* renamed from: d */
    private final ReferenceQueue<C5314p<?>> f23291d;

    /* renamed from: e */
    private C5314p.C5315a f23292e;

    /* renamed from: f */
    private volatile boolean f23293f;

    /* renamed from: g */
    private volatile C5272c f23294g;

    /* renamed from: g2.a$a */
    /* compiled from: ActiveResources */
    class C5269a implements ThreadFactory {

        /* renamed from: g2.a$a$a */
        /* compiled from: ActiveResources */
        class C5270a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ Runnable f23295b;

            C5270a(Runnable runnable) {
                this.f23295b = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f23295b.run();
            }
        }

        C5269a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C5270a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: g2.a$b */
    /* compiled from: ActiveResources */
    class C5271b implements Runnable {
        C5271b() {
        }

        public void run() {
            C5268a.this.mo21485b();
        }
    }

    /* renamed from: g2.a$c */
    /* compiled from: ActiveResources */
    interface C5272c {
        /* renamed from: a */
        void mo21493a();
    }

    /* renamed from: g2.a$d */
    /* compiled from: ActiveResources */
    static final class C5273d extends WeakReference<C5314p<?>> {

        /* renamed from: a */
        final C5159f f23298a;

        /* renamed from: b */
        final boolean f23299b;

        /* renamed from: c */
        C5323v<?> f23300c;

        C5273d(C5159f fVar, C5314p<?> pVar, ReferenceQueue<? super C5314p<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            this.f23298a = (C5159f) C0065j.m247d(fVar);
            this.f23300c = (!pVar.mo21596f() || !z) ? null : (C5323v) C0065j.m247d(pVar.mo21595e());
            this.f23299b = pVar.mo21596f();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo21494a() {
            this.f23300c = null;
            clear();
        }
    }

    C5268a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C5269a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo21484a(C5159f fVar, C5314p<?> pVar) {
        C5273d put = this.f23290c.put(fVar, new C5273d(fVar, pVar, this.f23291d, this.f23288a));
        if (put != null) {
            put.mo21494a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21485b() {
        while (!this.f23293f) {
            try {
                mo21486c((C5273d) this.f23291d.remove());
                C5272c cVar = this.f23294g;
                if (cVar != null) {
                    cVar.mo21493a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo21486c(C5273d dVar) {
        synchronized (this) {
            this.f23290c.remove(dVar.f23298a);
            if (dVar.f23299b) {
                C5323v<?> vVar = dVar.f23300c;
                if (vVar != null) {
                    this.f23292e.mo21553a(dVar.f23298a, new C5314p(vVar, true, false, dVar.f23298a, this.f23292e));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo21487d(C5159f fVar) {
        C5273d remove = this.f23290c.remove(fVar);
        if (remove != null) {
            remove.mo21494a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p082g2.C5314p<?> mo21488e(p065d2.C5159f r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<d2.f, g2.a$d> r0 = r1.f23290c     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            g2.a$d r2 = (p082g2.C5268a.C5273d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            g2.p r0 = (p082g2.C5314p) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo21486c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p082g2.C5268a.mo21488e(d2.f):g2.p");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo21489f(C5314p.C5315a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f23292e = aVar;
            }
        }
    }

    C5268a(boolean z, Executor executor) {
        this.f23290c = new HashMap();
        this.f23291d = new ReferenceQueue<>();
        this.f23288a = z;
        this.f23289b = executor;
        executor.execute(new C5271b());
    }
}
