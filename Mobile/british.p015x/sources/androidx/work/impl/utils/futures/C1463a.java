package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.C10412b;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.work.impl.utils.futures.a */
/* compiled from: AbstractFuture */
public abstract class C1463a<V> implements C10412b<V> {

    /* renamed from: e */
    static final boolean f6451e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    private static final Logger f6452f = Logger.getLogger(C1463a.class.getName());

    /* renamed from: g */
    static final C1465b f6453g;

    /* renamed from: h */
    private static final Object f6454h = new Object();

    /* renamed from: b */
    volatile Object f6455b;

    /* renamed from: c */
    volatile C1469e f6456c;

    /* renamed from: d */
    volatile C1473i f6457d;

    /* renamed from: androidx.work.impl.utils.futures.a$b */
    /* compiled from: AbstractFuture */
    private static abstract class C1465b {
        private C1465b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo6993a(C1463a<?> aVar, C1469e eVar, C1469e eVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo6994b(C1463a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo6995c(C1463a<?> aVar, C1473i iVar, C1473i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo6996d(C1473i iVar, C1473i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo6997e(C1473i iVar, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.a$c */
    /* compiled from: AbstractFuture */
    private static final class C1466c {

        /* renamed from: c */
        static final C1466c f6458c;

        /* renamed from: d */
        static final C1466c f6459d;

        /* renamed from: a */
        final boolean f6460a;

        /* renamed from: b */
        final Throwable f6461b;

        static {
            if (C1463a.f6451e) {
                f6459d = null;
                f6458c = null;
                return;
            }
            f6459d = new C1466c(false, (Throwable) null);
            f6458c = new C1466c(true, (Throwable) null);
        }

        C1466c(boolean z, Throwable th) {
            this.f6460a = z;
            this.f6461b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$d */
    /* compiled from: AbstractFuture */
    private static final class C1467d {

        /* renamed from: b */
        static final C1467d f6462b = new C1467d(new C1468a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f6463a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a */
        /* compiled from: AbstractFuture */
        class C1468a extends Throwable {
            C1468a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C1467d(Throwable th) {
            this.f6463a = (Throwable) C1463a.m7717e(th);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$e */
    /* compiled from: AbstractFuture */
    private static final class C1469e {

        /* renamed from: d */
        static final C1469e f6464d = new C1469e((Runnable) null, (Executor) null);

        /* renamed from: a */
        final Runnable f6465a;

        /* renamed from: b */
        final Executor f6466b;

        /* renamed from: c */
        C1469e f6467c;

        C1469e(Runnable runnable, Executor executor) {
            this.f6465a = runnable;
            this.f6466b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$f */
    /* compiled from: AbstractFuture */
    private static final class C1470f extends C1465b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C1473i, Thread> f6468a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C1473i, C1473i> f6469b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C1463a, C1473i> f6470c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C1463a, C1469e> f6471d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C1463a, Object> f6472e;

        C1470f(AtomicReferenceFieldUpdater<C1473i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1473i, C1473i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C1463a, C1473i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C1463a, C1469e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C1463a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f6468a = atomicReferenceFieldUpdater;
            this.f6469b = atomicReferenceFieldUpdater2;
            this.f6470c = atomicReferenceFieldUpdater3;
            this.f6471d = atomicReferenceFieldUpdater4;
            this.f6472e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6993a(C1463a<?> aVar, C1469e eVar, C1469e eVar2) {
            return C1474b.m7751a(this.f6471d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6994b(C1463a<?> aVar, Object obj, Object obj2) {
            return C1474b.m7751a(this.f6472e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6995c(C1463a<?> aVar, C1473i iVar, C1473i iVar2) {
            return C1474b.m7751a(this.f6470c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6996d(C1473i iVar, C1473i iVar2) {
            this.f6469b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6997e(C1473i iVar, Thread thread) {
            this.f6468a.lazySet(iVar, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$g */
    /* compiled from: AbstractFuture */
    private static final class C1471g<V> implements Runnable {

        /* renamed from: b */
        final C1463a<V> f6473b;

        /* renamed from: c */
        final C10412b<? extends V> f6474c;

        C1471g(C1463a<V> aVar, C10412b<? extends V> bVar) {
            this.f6473b = aVar;
            this.f6474c = bVar;
        }

        public void run() {
            if (this.f6473b.f6455b == this) {
                if (C1463a.f6453g.mo6994b(this.f6473b, this, C1463a.m7722j(this.f6474c))) {
                    C1463a.m7719g(this.f6473b);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$h */
    /* compiled from: AbstractFuture */
    private static final class C1472h extends C1465b {
        C1472h() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6993a(C1463a<?> aVar, C1469e eVar, C1469e eVar2) {
            synchronized (aVar) {
                if (aVar.f6456c != eVar) {
                    return false;
                }
                aVar.f6456c = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6994b(C1463a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f6455b != obj) {
                    return false;
                }
                aVar.f6455b = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6995c(C1463a<?> aVar, C1473i iVar, C1473i iVar2) {
            synchronized (aVar) {
                if (aVar.f6457d != iVar) {
                    return false;
                }
                aVar.f6457d = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6996d(C1473i iVar, C1473i iVar2) {
            iVar.f6477b = iVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6997e(C1473i iVar, Thread thread) {
            iVar.f6476a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$i */
    /* compiled from: AbstractFuture */
    private static final class C1473i {

        /* renamed from: c */
        static final C1473i f6475c = new C1473i(false);

        /* renamed from: a */
        volatile Thread f6476a;

        /* renamed from: b */
        volatile C1473i f6477b;

        C1473i(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7000a(C1473i iVar) {
            C1463a.f6453g.mo6996d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7001b() {
            Thread thread = this.f6476a;
            if (thread != null) {
                this.f6476a = null;
                LockSupport.unpark(thread);
            }
        }

        C1473i() {
            C1463a.f6453g.mo6997e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.a$i> r0 = androidx.work.impl.utils.futures.C1463a.C1473i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f6451e = r1
            java.lang.Class<androidx.work.impl.utils.futures.a> r1 = androidx.work.impl.utils.futures.C1463a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f6452f = r1
            androidx.work.impl.utils.futures.a$f r1 = new androidx.work.impl.utils.futures.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r2 = androidx.work.impl.utils.futures.C1463a.class
            java.lang.String r5 = "d"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.C1463a.class
            java.lang.Class<androidx.work.impl.utils.futures.a$e> r2 = androidx.work.impl.utils.futures.C1463a.C1469e.class
            java.lang.String r6 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.C1463a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.futures.a$h r1 = new androidx.work.impl.utils.futures.a$h
            r1.<init>()
        L_0x0054:
            f6453g = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f6452f
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f6454h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.C1463a.<clinit>():void");
    }

    protected C1463a() {
    }

    /* renamed from: b */
    private void m7715b(StringBuilder sb) {
        try {
            Object k = m7723k(this);
            sb.append("SUCCESS, result=[");
            sb.append(m7726s(k));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: d */
    private static CancellationException m7716d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: e */
    static <T> T m7717e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: f */
    private C1469e m7718f(C1469e eVar) {
        C1469e eVar2;
        do {
            eVar2 = this.f6456c;
        } while (!f6453g.mo6993a(this, eVar2, C1469e.f6464d));
        C1469e eVar3 = eVar2;
        C1469e eVar4 = eVar;
        C1469e eVar5 = eVar3;
        while (eVar5 != null) {
            C1469e eVar6 = eVar5.f6467c;
            eVar5.f6467c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: g */
    static void m7719g(C1463a<?> aVar) {
        C1469e eVar = null;
        C1463a<V> aVar2 = aVar;
        while (true) {
            aVar2.m7724n();
            aVar2.mo6981c();
            C1469e f = aVar2.m7718f(eVar);
            while (true) {
                if (f != null) {
                    eVar = f.f6467c;
                    Runnable runnable = f.f6465a;
                    if (runnable instanceof C1471g) {
                        C1471g gVar = (C1471g) runnable;
                        C1463a<V> aVar3 = gVar.f6473b;
                        if (aVar3.f6455b == gVar) {
                            if (f6453g.mo6994b(aVar3, gVar, m7722j(gVar.f6474c))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m7720h(runnable, f.f6466b);
                    }
                    f = eVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private static void m7720h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f6452f;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: i */
    private V m7721i(Object obj) throws ExecutionException {
        if (obj instanceof C1466c) {
            throw m7716d("Task was cancelled.", ((C1466c) obj).f6461b);
        } else if (obj instanceof C1467d) {
            throw new ExecutionException(((C1467d) obj).f6463a);
        } else if (obj == f6454h) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: j */
    static Object m7722j(C10412b<?> bVar) {
        if (bVar instanceof C1463a) {
            Object obj = ((C1463a) bVar).f6455b;
            if (!(obj instanceof C1466c)) {
                return obj;
            }
            C1466c cVar = (C1466c) obj;
            if (!cVar.f6460a) {
                return obj;
            }
            if (cVar.f6461b != null) {
                return new C1466c(false, cVar.f6461b);
            }
            return C1466c.f6459d;
        }
        boolean isCancelled = bVar.isCancelled();
        if ((!f6451e) && isCancelled) {
            return C1466c.f6459d;
        }
        try {
            Object k = m7723k(bVar);
            return k == null ? f6454h : k;
        } catch (ExecutionException e) {
            return new C1467d(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C1466c(false, e2);
            }
            return new C1467d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e2));
        } catch (Throwable th) {
            return new C1467d(th);
        }
    }

    /* renamed from: k */
    private static <V> V m7723k(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: n */
    private void m7724n() {
        C1473i iVar;
        do {
            iVar = this.f6457d;
        } while (!f6453g.mo6995c(this, iVar, C1473i.f6475c));
        while (iVar != null) {
            iVar.mo7001b();
            iVar = iVar.f6477b;
        }
    }

    /* renamed from: o */
    private void m7725o(C1473i iVar) {
        iVar.f6476a = null;
        while (true) {
            C1473i iVar2 = this.f6457d;
            if (iVar2 != C1473i.f6475c) {
                C1473i iVar3 = null;
                while (iVar2 != null) {
                    C1473i iVar4 = iVar2.f6477b;
                    if (iVar2.f6476a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f6477b = iVar4;
                        if (iVar3.f6476a == null) {
                        }
                    } else if (!f6453g.mo6995c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: s */
    private String m7726s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: a */
    public final void mo6980a(Runnable runnable, Executor executor) {
        m7717e(runnable);
        m7717e(executor);
        C1469e eVar = this.f6456c;
        if (eVar != C1469e.f6464d) {
            C1469e eVar2 = new C1469e(runnable, executor);
            do {
                eVar2.f6467c = eVar;
                if (!f6453g.mo6993a(this, eVar, eVar2)) {
                    eVar = this.f6456c;
                } else {
                    return;
                }
            } while (eVar != C1469e.f6464d);
        }
        m7720h(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6981c() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.b<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6455b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C1463a.C1471g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f6451e
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.a$c r3 = new androidx.work.impl.utils.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.C1463a.C1466c.f6458c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.C1463a.C1466c.f6459d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.work.impl.utils.futures.a$b r6 = f6453g
            boolean r6 = r6.mo6994b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo6987l()
        L_0x0035:
            m7719g(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C1463a.C1471g
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.a$g r0 = (androidx.work.impl.utils.futures.C1463a.C1471g) r0
            com.google.common.util.concurrent.b<? extends V> r0 = r0.f6474c
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C1463a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.a r4 = (androidx.work.impl.utils.futures.C1463a) r4
            java.lang.Object r0 = r4.f6455b
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.C1463a.C1471g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f6455b
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.C1463a.C1471g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.C1463a.cancel(boolean):boolean");
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f6455b;
            if ((obj != null) && (!(obj instanceof C1471g))) {
                return m7721i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C1473i iVar = this.f6457d;
                if (iVar != C1473i.f6475c) {
                    C1473i iVar2 = new C1473i();
                    do {
                        iVar2.mo7000a(iVar);
                        if (f6453g.mo6995c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f6455b;
                                    if ((obj2 != null) && (!(obj2 instanceof C1471g))) {
                                        return m7721i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m7725o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m7725o(iVar2);
                        } else {
                            iVar = this.f6457d;
                        }
                    } while (iVar != C1473i.f6475c);
                }
                return m7721i(this.f6455b);
            }
            while (nanos > 0) {
                Object obj3 = this.f6455b;
                if ((obj3 != null) && (!(obj3 instanceof C1471g))) {
                    return m7721i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f6455b instanceof C1466c;
    }

    public final boolean isDone() {
        Object obj = this.f6455b;
        return (!(obj instanceof C1471g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6987l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo6988m() {
        Object obj = this.f6455b;
        if (obj instanceof C1471g) {
            return "setFuture=[" + m7726s(((C1471g) obj).f6474c) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo6989p(V v) {
        if (v == null) {
            v = f6454h;
        }
        if (!f6453g.mo6994b(this, (Object) null, v)) {
            return false;
        }
        m7719g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo6990q(Throwable th) {
        if (!f6453g.mo6994b(this, (Object) null, new C1467d((Throwable) m7717e(th)))) {
            return false;
        }
        m7719g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo6991r(C10412b<? extends V> bVar) {
        C1471g gVar;
        C1467d dVar;
        m7717e(bVar);
        Object obj = this.f6455b;
        if (obj == null) {
            if (bVar.isDone()) {
                if (!f6453g.mo6994b(this, (Object) null, m7722j(bVar))) {
                    return false;
                }
                m7719g(this);
                return true;
            }
            gVar = new C1471g(this, bVar);
            if (f6453g.mo6994b(this, (Object) null, gVar)) {
                try {
                    bVar.mo6980a(gVar, C1475c.INSTANCE);
                } catch (Throwable unused) {
                    dVar = C1467d.f6462b;
                }
                return true;
            }
            obj = this.f6455b;
        }
        if (obj instanceof C1466c) {
            bVar.cancel(((C1466c) obj).f6460a);
        }
        return false;
        f6453g.mo6994b(this, gVar, dVar);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m7715b(sb);
        } else {
            try {
                str = mo6988m();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m7715b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6455b;
            if ((obj2 != null) && (!(obj2 instanceof C1471g))) {
                return m7721i(obj2);
            }
            C1473i iVar = this.f6457d;
            if (iVar != C1473i.f6475c) {
                C1473i iVar2 = new C1473i();
                do {
                    iVar2.mo7000a(iVar);
                    if (f6453g.mo6995c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6455b;
                            } else {
                                m7725o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C1471g))));
                        return m7721i(obj);
                    }
                    iVar = this.f6457d;
                } while (iVar != C1473i.f6475c);
            }
            return m7721i(this.f6455b);
        }
        throw new InterruptedException();
    }
}
