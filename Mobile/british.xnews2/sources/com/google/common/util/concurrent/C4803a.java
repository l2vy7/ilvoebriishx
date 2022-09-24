package com.google.common.util.concurrent;

import androidx.work.impl.utils.futures.C1474b;
import com.google.ads.interactivemedia.p038v3.internal.C3828a0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.j2objc.annotations.ReflectionSupport;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
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
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p148s6.C6073k;
import p258v6.C11065a;
import p258v6.C11066b;
import sun.misc.Unsafe;

@ReflectionSupport(ReflectionSupport.Level.FULL)
/* renamed from: com.google.common.util.concurrent.a */
/* compiled from: AbstractFuture */
public abstract class C4803a<V> extends C11065a implements C10412b<V> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f21587e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f */
    private static final Logger f21588f = Logger.getLogger(C4803a.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C4808b f21589g;

    /* renamed from: h */
    private static final Object f21590h = new Object();
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: b */
    public volatile Object f21591b;
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: c */
    public volatile C4805e f21592c;
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: d */
    public volatile C4806l f21593d;

    /* renamed from: com.google.common.util.concurrent.a$c */
    /* compiled from: AbstractFuture */
    private static final class C4804c {

        /* renamed from: c */
        static final C4804c f21594c;

        /* renamed from: d */
        static final C4804c f21595d;

        /* renamed from: a */
        final boolean f21596a;
        @NullableDecl

        /* renamed from: b */
        final Throwable f21597b;

        static {
            if (C4803a.f21587e) {
                f21595d = null;
                f21594c = null;
                return;
            }
            f21595d = new C4804c(false, (Throwable) null);
            f21594c = new C4804c(true, (Throwable) null);
        }

        C4804c(boolean z, @NullableDecl Throwable th) {
            this.f21596a = z;
            this.f21597b = th;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$e */
    /* compiled from: AbstractFuture */
    private static final class C4805e {

        /* renamed from: d */
        static final C4805e f21598d = new C4805e((Runnable) null, (Executor) null);

        /* renamed from: a */
        final Runnable f21599a;

        /* renamed from: b */
        final Executor f21600b;
        @NullableDecl

        /* renamed from: c */
        C4805e f21601c;

        C4805e(Runnable runnable, Executor executor) {
            this.f21599a = runnable;
            this.f21600b = executor;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$l */
    /* compiled from: AbstractFuture */
    private static final class C4806l {

        /* renamed from: c */
        static final C4806l f21602c = new C4806l(false);
        @NullableDecl

        /* renamed from: a */
        volatile Thread f21603a;
        @NullableDecl

        /* renamed from: b */
        volatile C4806l f21604b;

        C4806l(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20022a(C4806l lVar) {
            C4803a.f21589g.mo20027d(this, lVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo20023b() {
            Thread thread = this.f21603a;
            if (thread != null) {
                this.f21603a = null;
                LockSupport.unpark(thread);
            }
        }

        C4806l() {
            C4803a.f21589g.mo20028e(this, Thread.currentThread());
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$b */
    /* compiled from: AbstractFuture */
    private static abstract class C4808b {
        private C4808b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo20024a(C4803a<?> aVar, C4805e eVar, C4805e eVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo20025b(C4803a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo20026c(C4803a<?> aVar, C4806l lVar, C4806l lVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo20027d(C4806l lVar, C4806l lVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo20028e(C4806l lVar, Thread thread);
    }

    /* renamed from: com.google.common.util.concurrent.a$d */
    /* compiled from: AbstractFuture */
    private static final class C4809d {

        /* renamed from: b */
        static final C4809d f21605b = new C4809d(new C4810a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f21606a;

        /* renamed from: com.google.common.util.concurrent.a$d$a */
        /* compiled from: AbstractFuture */
        static class C4810a extends Throwable {
            C4810a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C4809d(Throwable th) {
            this.f21606a = (Throwable) C6073k.m26688k(th);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$f */
    /* compiled from: AbstractFuture */
    private static final class C4811f extends C4808b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C4806l, Thread> f21607a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C4806l, C4806l> f21608b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C4803a, C4806l> f21609c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C4803a, C4805e> f21610d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C4803a, Object> f21611e;

        C4811f(AtomicReferenceFieldUpdater<C4806l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C4806l, C4806l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C4803a, C4806l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C4803a, C4805e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C4803a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f21607a = atomicReferenceFieldUpdater;
            this.f21608b = atomicReferenceFieldUpdater2;
            this.f21609c = atomicReferenceFieldUpdater3;
            this.f21610d = atomicReferenceFieldUpdater4;
            this.f21611e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo20024a(C4803a<?> aVar, C4805e eVar, C4805e eVar2) {
            return C1474b.m7751a(this.f21610d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo20025b(C4803a<?> aVar, Object obj, Object obj2) {
            return C1474b.m7751a(this.f21611e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo20026c(C4803a<?> aVar, C4806l lVar, C4806l lVar2) {
            return C1474b.m7751a(this.f21609c, aVar, lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo20027d(C4806l lVar, C4806l lVar2) {
            this.f21608b.lazySet(lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo20028e(C4806l lVar, Thread thread) {
            this.f21607a.lazySet(lVar, thread);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$g */
    /* compiled from: AbstractFuture */
    private static final class C4812g<V> implements Runnable {

        /* renamed from: b */
        final C4803a<V> f21612b;

        /* renamed from: c */
        final C10412b<? extends V> f21613c;

        public void run() {
            if (this.f21612b.f21591b == this) {
                if (C4803a.f21589g.mo20025b(this.f21612b, this, C4803a.m22183t(this.f21613c))) {
                    C4803a.m22180q(this.f21612b);
                }
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$h */
    /* compiled from: AbstractFuture */
    private static final class C4813h extends C4808b {
        private C4813h() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo20024a(C4803a<?> aVar, C4805e eVar, C4805e eVar2) {
            synchronized (aVar) {
                if (aVar.f21592c != eVar) {
                    return false;
                }
                C4805e unused = aVar.f21592c = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo20025b(C4803a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f21591b != obj) {
                    return false;
                }
                Object unused = aVar.f21591b = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo20026c(C4803a<?> aVar, C4806l lVar, C4806l lVar2) {
            synchronized (aVar) {
                if (aVar.f21593d != lVar) {
                    return false;
                }
                C4806l unused = aVar.f21593d = lVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo20027d(C4806l lVar, C4806l lVar2) {
            lVar.f21604b = lVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo20028e(C4806l lVar, Thread thread) {
            lVar.f21603a = thread;
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$i */
    /* compiled from: AbstractFuture */
    interface C4814i<V> extends C10412b<V> {
    }

    /* renamed from: com.google.common.util.concurrent.a$j */
    /* compiled from: AbstractFuture */
    static abstract class C4815j<V> extends C4803a<V> implements C4814i<V> {
        C4815j() {
        }

        /* renamed from: a */
        public final void mo6980a(Runnable runnable, Executor executor) {
            C4803a.super.mo6980a(runnable, executor);
        }

        @CanIgnoreReturnValue
        public final boolean cancel(boolean z) {
            return C4803a.super.cancel(z);
        }

        @CanIgnoreReturnValue
        public final V get() throws InterruptedException, ExecutionException {
            return C4803a.super.get();
        }

        public final boolean isCancelled() {
            return C4803a.super.isCancelled();
        }

        public final boolean isDone() {
            return C4803a.super.isDone();
        }

        @CanIgnoreReturnValue
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return C4803a.super.get(j, timeUnit);
        }
    }

    /* renamed from: com.google.common.util.concurrent.a$k */
    /* compiled from: AbstractFuture */
    private static final class C4816k extends C4808b {

        /* renamed from: a */
        static final Unsafe f21614a;

        /* renamed from: b */
        static final long f21615b;

        /* renamed from: c */
        static final long f21616c;

        /* renamed from: d */
        static final long f21617d;

        /* renamed from: e */
        static final long f21618e;

        /* renamed from: f */
        static final long f21619f;

        /* renamed from: com.google.common.util.concurrent.a$k$a */
        /* compiled from: AbstractFuture */
        static class C4817a implements PrivilegedExceptionAction<Unsafe> {
            C4817a() {
            }

            /* renamed from: a */
            public Unsafe run() throws Exception {
                Class<Unsafe> cls = Unsafe.class;
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get((Object) null);
                    if (cls.isInstance(obj)) {
                        return cls.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.util.concurrent.C4803a.C4816k.C4817a());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.common.util.concurrent.a$l> r0 = com.google.common.util.concurrent.C4803a.C4806l.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.common.util.concurrent.a$k$a r1 = new com.google.common.util.concurrent.a$k$a     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<com.google.common.util.concurrent.a> r2 = com.google.common.util.concurrent.C4803a.class
                java.lang.String r3 = "d"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f21616c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "c"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f21615b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "b"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f21617d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f21618e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f21619f = r2     // Catch:{ Exception -> 0x0053 }
                f21614a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                p148s6.C6076p.m26702e(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C4803a.C4816k.<clinit>():void");
        }

        private C4816k() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo20024a(C4803a<?> aVar, C4805e eVar, C4805e eVar2) {
            return C3828a0.m12686a(f21614a, aVar, f21615b, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo20025b(C4803a<?> aVar, Object obj, Object obj2) {
            return C3828a0.m12686a(f21614a, aVar, f21617d, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo20026c(C4803a<?> aVar, C4806l lVar, C4806l lVar2) {
            return C3828a0.m12686a(f21614a, aVar, f21616c, lVar, lVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo20027d(C4806l lVar, C4806l lVar2) {
            f21614a.putObject(lVar, f21619f, lVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo20028e(C4806l lVar, Thread thread) {
            f21614a.putObject(lVar, f21618e, thread);
        }
    }

    static {
        C4808b bVar;
        Class<C4806l> cls = C4806l.class;
        Throwable th = null;
        try {
            bVar = new C4816k();
            th = null;
        } catch (Throwable th2) {
            bVar = new C4813h();
            th = th2;
        }
        f21589g = bVar;
        Class<LockSupport> cls2 = LockSupport.class;
        if (th != null) {
            Logger logger = f21588f;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    protected C4803a() {
    }

    /* renamed from: B */
    private String m22166B(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: m */
    private void m22177m(StringBuilder sb) {
        try {
            Object u = m22184u(this);
            sb.append("SUCCESS, result=[");
            sb.append(m22166B(u));
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

    /* renamed from: o */
    private static CancellationException m22178o(@NullableDecl String str, @NullableDecl Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: p */
    private C4805e m22179p(C4805e eVar) {
        C4805e eVar2;
        do {
            eVar2 = this.f21592c;
        } while (!f21589g.mo20024a(this, eVar2, C4805e.f21598d));
        C4805e eVar3 = eVar2;
        C4805e eVar4 = eVar;
        C4805e eVar5 = eVar3;
        while (eVar5 != null) {
            C4805e eVar6 = eVar5.f21601c;
            eVar5.f21601c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static void m22180q(C4803a<?> aVar) {
        C4805e eVar = null;
        C4803a<V> aVar2 = aVar;
        while (true) {
            aVar2.m22185x();
            aVar2.mo20017n();
            C4805e p = aVar2.m22179p(eVar);
            while (true) {
                if (p != null) {
                    eVar = p.f21601c;
                    Runnable runnable = p.f21599a;
                    if (runnable instanceof C4812g) {
                        C4812g gVar = (C4812g) runnable;
                        C4803a<V> aVar3 = gVar.f21612b;
                        if (aVar3.f21591b == gVar) {
                            if (f21589g.mo20025b(aVar3, gVar, m22183t(gVar.f21613c))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m22181r(runnable, p.f21600b);
                    }
                    p = eVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    private static void m22181r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f21588f;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: s */
    private V m22182s(Object obj) throws ExecutionException {
        if (obj instanceof C4804c) {
            throw m22178o("Task was cancelled.", ((C4804c) obj).f21597b);
        } else if (obj instanceof C4809d) {
            throw new ExecutionException(((C4809d) obj).f21606a);
        } else if (obj == f21590h) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static Object m22183t(C10412b<?> bVar) {
        Throwable a;
        if (bVar instanceof C4814i) {
            Object obj = ((C4803a) bVar).f21591b;
            if (!(obj instanceof C4804c)) {
                return obj;
            }
            C4804c cVar = (C4804c) obj;
            if (cVar.f21596a) {
                return cVar.f21597b != null ? new C4804c(false, cVar.f21597b) : C4804c.f21595d;
            }
            return obj;
        } else if ((bVar instanceof C11065a) && (a = C11066b.m49543a((C11065a) bVar)) != null) {
            return new C4809d(a);
        } else {
            boolean isCancelled = bVar.isCancelled();
            if ((!f21587e) && isCancelled) {
                return C4804c.f21595d;
            }
            try {
                Object u = m22184u(bVar);
                if (!isCancelled) {
                    return u == null ? f21590h : u;
                }
                return new C4804c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + bVar));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new C4809d(e.getCause());
                }
                return new C4804c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + bVar, e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new C4804c(false, e2);
                }
                return new C4809d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e2));
            } catch (Throwable th) {
                return new C4809d(th);
            }
        }
    }

    /* renamed from: u */
    private static <V> V m22184u(Future<V> future) throws ExecutionException {
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

    /* renamed from: x */
    private void m22185x() {
        C4806l lVar;
        do {
            lVar = this.f21593d;
        } while (!f21589g.mo20026c(this, lVar, C4806l.f21602c));
        while (lVar != null) {
            lVar.mo20023b();
            lVar = lVar.f21604b;
        }
    }

    /* renamed from: y */
    private void m22186y(C4806l lVar) {
        lVar.f21603a = null;
        while (true) {
            C4806l lVar2 = this.f21593d;
            if (lVar2 != C4806l.f21602c) {
                C4806l lVar3 = null;
                while (lVar2 != null) {
                    C4806l lVar4 = lVar2.f21604b;
                    if (lVar2.f21603a != null) {
                        lVar3 = lVar2;
                    } else if (lVar3 != null) {
                        lVar3.f21604b = lVar4;
                        if (lVar3.f21603a == null) {
                        }
                    } else if (!f21589g.mo20026c(this, lVar2, lVar4)) {
                    }
                    lVar2 = lVar4;
                }
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: A */
    public boolean mo20010A(Throwable th) {
        if (!f21589g.mo20025b(this, (Object) null, new C4809d((Throwable) C6073k.m26688k(th)))) {
            return false;
        }
        m22180q(this);
        return true;
    }

    /* renamed from: a */
    public void mo6980a(Runnable runnable, Executor executor) {
        C4805e eVar;
        C6073k.m26689l(runnable, "Runnable was null.");
        C6073k.m26689l(executor, "Executor was null.");
        if (isDone() || (eVar = this.f21592c) == C4805e.f21598d) {
            m22181r(runnable, executor);
        }
        C4805e eVar2 = new C4805e(runnable, executor);
        do {
            eVar2.f21601c = eVar;
            if (!f21589g.mo20024a(this, eVar, eVar2)) {
                eVar = this.f21592c;
            } else {
                return;
            }
        } while (eVar != C4805e.f21598d);
        m22181r(runnable, executor);
    }

    /* access modifiers changed from: protected */
    @NullableDecl
    /* renamed from: b */
    public final Throwable mo20011b() {
        if (!(this instanceof C4814i)) {
            return null;
        }
        Object obj = this.f21591b;
        if (obj instanceof C4809d) {
            return ((C4809d) obj).f21606a;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.b<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f21591b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.common.util.concurrent.C4803a.C4812g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f21587e
            if (r3 == 0) goto L_0x001f
            com.google.common.util.concurrent.a$c r3 = new com.google.common.util.concurrent.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.common.util.concurrent.a$c r3 = com.google.common.util.concurrent.C4803a.C4804c.f21594c
            goto L_0x0026
        L_0x0024:
            com.google.common.util.concurrent.a$c r3 = com.google.common.util.concurrent.C4803a.C4804c.f21595d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            com.google.common.util.concurrent.a$b r6 = f21589g
            boolean r6 = r6.mo20025b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo20019v()
        L_0x0035:
            m22180q(r4)
            boolean r4 = r0 instanceof com.google.common.util.concurrent.C4803a.C4812g
            if (r4 == 0) goto L_0x0062
            com.google.common.util.concurrent.a$g r0 = (com.google.common.util.concurrent.C4803a.C4812g) r0
            com.google.common.util.concurrent.b<? extends V> r0 = r0.f21613c
            boolean r4 = r0 instanceof com.google.common.util.concurrent.C4803a.C4814i
            if (r4 == 0) goto L_0x0055
            r4 = r0
            com.google.common.util.concurrent.a r4 = (com.google.common.util.concurrent.C4803a) r4
            java.lang.Object r0 = r4.f21591b
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof com.google.common.util.concurrent.C4803a.C4812g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f21591b
            boolean r6 = r0 instanceof com.google.common.util.concurrent.C4803a.C4812g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C4803a.cancel(boolean):boolean");
    }

    @CanIgnoreReturnValue
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f21591b;
            if ((obj != null) && (!(obj instanceof C4812g))) {
                return m22182s(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C4806l lVar = this.f21593d;
                if (lVar != C4806l.f21602c) {
                    C4806l lVar2 = new C4806l();
                    do {
                        lVar2.mo20022a(lVar);
                        if (f21589g.mo20026c(this, lVar, lVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f21591b;
                                    if ((obj2 != null) && (!(obj2 instanceof C4812g))) {
                                        return m22182s(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m22186y(lVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m22186y(lVar2);
                        } else {
                            lVar = this.f21593d;
                        }
                    } while (lVar != C4806l.f21602c);
                }
                return m22182s(this.f21591b);
            }
            while (nanos > 0) {
                Object obj3 = this.f21591b;
                if ((obj3 != null) && (!(obj3 instanceof C4812g))) {
                    return m22182s(obj3);
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

    public boolean isCancelled() {
        return this.f21591b instanceof C4804c;
    }

    public boolean isDone() {
        Object obj = this.f21591b;
        return (!(obj instanceof C4812g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    @ForOverride
    /* renamed from: n */
    public void mo20017n() {
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m22177m(sb);
        } else {
            try {
                str = mo20020w();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m22177m(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo20019v() {
    }

    /* access modifiers changed from: protected */
    @NullableDecl
    /* renamed from: w */
    public String mo20020w() {
        Object obj = this.f21591b;
        if (obj instanceof C4812g) {
            return "setFuture=[" + m22166B(((C4812g) obj).f21613c) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: z */
    public boolean mo20021z(@NullableDecl V v) {
        if (v == null) {
            v = f21590h;
        }
        if (!f21589g.mo20025b(this, (Object) null, v)) {
            return false;
        }
        m22180q(this);
        return true;
    }

    @CanIgnoreReturnValue
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f21591b;
            if ((obj2 != null) && (!(obj2 instanceof C4812g))) {
                return m22182s(obj2);
            }
            C4806l lVar = this.f21593d;
            if (lVar != C4806l.f21602c) {
                C4806l lVar2 = new C4806l();
                do {
                    lVar2.mo20022a(lVar);
                    if (f21589g.mo20026c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f21591b;
                            } else {
                                m22186y(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C4812g))));
                        return m22182s(obj);
                    }
                    lVar = this.f21593d;
                } while (lVar != C4806l.f21602c);
            }
            return m22182s(this.f21591b);
        }
        throw new InterruptedException();
    }
}
