package com.google.ads.interactivemedia.p038v3.internal;

import androidx.work.impl.utils.futures.C1474b;
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
import sun.misc.Unsafe;

/* renamed from: com.google.ads.interactivemedia.v3.internal.awb */
/* compiled from: IMASDK */
public abstract class awb<V> extends awq implements awk<V> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final boolean f15821a;

    /* renamed from: b */
    private static final Logger f15822b = Logger.getLogger(awb.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C3856a f15823c;

    /* renamed from: d */
    private static final Object f15824d = new Object();
    /* access modifiers changed from: private */
    public volatile C3860d listeners;
    /* access modifiers changed from: private */
    public volatile Object value;
    /* access modifiers changed from: private */
    public volatile C3868k waiters;

    /* renamed from: com.google.ads.interactivemedia.v3.internal.awb$a */
    /* compiled from: IMASDK */
    abstract class C3856a {
        /* synthetic */ C3856a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo14667a(C3868k kVar, Thread thread);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo14668b(C3868k kVar, C3868k kVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo14669c(awb<?> awb, C3868k kVar, C3868k kVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract boolean mo14670d(awb<?> awb, C3860d dVar, C3860d dVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract boolean mo14671e(awb<?> awb, Object obj, Object obj2);
    }

    /* renamed from: com.google.ads.interactivemedia.v3.internal.awb$b */
    /* compiled from: IMASDK */
    final class C3857b {

        /* renamed from: a */
        static final C3857b f15825a;

        /* renamed from: b */
        static final C3857b f15826b;

        /* renamed from: c */
        final boolean f15827c;

        /* renamed from: d */
        final Throwable f15828d;

        static {
            if (awb.f15821a) {
                f15826b = null;
                f15825a = null;
                return;
            }
            f15826b = new C3857b(false, (Throwable) null);
            f15825a = new C3857b(true, (Throwable) null);
        }

        C3857b(boolean z, Throwable th) {
            this.f15827c = z;
            this.f15828d = th;
        }
    }

    /* renamed from: com.google.ads.interactivemedia.v3.internal.awb$c */
    /* compiled from: IMASDK */
    final class C3858c {

        /* renamed from: a */
        static final C3858c f15829a = new C3858c(new Throwable() {
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: b */
        final Throwable f15830b;

        C3858c(Throwable th) {
            ars.m14627g(th);
            this.f15830b = th;
        }
    }

    /* renamed from: com.google.ads.interactivemedia.v3.internal.awb$d */
    /* compiled from: IMASDK */
    final class C3860d {

        /* renamed from: a */
        static final C3860d f15831a = new C3860d((Runnable) null, (Executor) null);

        /* renamed from: b */
        final Runnable f15832b;

        /* renamed from: c */
        final Executor f15833c;
        C3860d next;

        C3860d(Runnable runnable, Executor executor) {
            this.f15832b = runnable;
            this.f15833c = executor;
        }
    }

    /* renamed from: com.google.ads.interactivemedia.v3.internal.awb$e */
    /* compiled from: IMASDK */
    final class C3861e extends C3856a {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C3868k, Thread> f15834a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C3868k, C3868k> f15835b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<awb, C3868k> f15836c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<awb, C3860d> f15837d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<awb, Object> f15838e;

        C3861e(AtomicReferenceFieldUpdater<C3868k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C3868k, C3868k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<awb, C3868k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<awb, C3860d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<awb, Object> atomicReferenceFieldUpdater5) {
            this.f15834a = atomicReferenceFieldUpdater;
            this.f15835b = atomicReferenceFieldUpdater2;
            this.f15836c = atomicReferenceFieldUpdater3;
            this.f15837d = atomicReferenceFieldUpdater4;
            this.f15838e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo14667a(C3868k kVar, Thread thread) {
            this.f15834a.lazySet(kVar, thread);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo14668b(C3868k kVar, C3868k kVar2) {
            this.f15835b.lazySet(kVar, kVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo14669c(awb<?> awb, C3868k kVar, C3868k kVar2) {
            return C1474b.m7751a(this.f15836c, awb, kVar, kVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo14670d(awb<?> awb, C3860d dVar, C3860d dVar2) {
            return C1474b.m7751a(this.f15837d, awb, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final boolean mo14671e(awb<?> awb, Object obj, Object obj2) {
            return C1474b.m7751a(this.f15838e, awb, obj, obj2);
        }
    }

    /* renamed from: com.google.ads.interactivemedia.v3.internal.awb$f */
    /* compiled from: IMASDK */
    final class C3862f<V> implements Runnable {

        /* renamed from: a */
        final awb<V> f15839a;

        /* renamed from: b */
        final awk<? extends V> f15840b;

        public final void run() {
            throw null;
        }
    }

    /* renamed from: com.google.ads.interactivemedia.v3.internal.awb$g */
    /* compiled from: IMASDK */
    final class C3863g extends C3856a {
        private C3863g() {
        }

        /* synthetic */ C3863g(byte[] bArr) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo14667a(C3868k kVar, Thread thread) {
            kVar.thread = thread;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo14668b(C3868k kVar, C3868k kVar2) {
            kVar.next = kVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo14669c(awb<?> awb, C3868k kVar, C3868k kVar2) {
            synchronized (awb) {
                if (awb.waiters != kVar) {
                    return false;
                }
                awb.waiters = kVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo14670d(awb<?> awb, C3860d dVar, C3860d dVar2) {
            synchronized (awb) {
                if (awb.listeners != dVar) {
                    return false;
                }
                awb.listeners = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final boolean mo14671e(awb<?> awb, Object obj, Object obj2) {
            synchronized (awb) {
                if (awb.value != obj) {
                    return false;
                }
                awb.value = obj2;
                return true;
            }
        }
    }

    /* renamed from: com.google.ads.interactivemedia.v3.internal.awb$h */
    /* compiled from: IMASDK */
    interface C3864h<V> extends awk<V> {
    }

    /* renamed from: com.google.ads.interactivemedia.v3.internal.awb$i */
    /* compiled from: IMASDK */
    abstract class C3865i<V> extends awb<V> implements C3864h<V> {
        C3865i() {
        }
    }

    /* renamed from: com.google.ads.interactivemedia.v3.internal.awb$j */
    /* compiled from: IMASDK */
    final class C3866j extends C3856a {

        /* renamed from: a */
        static final Unsafe f15841a;

        /* renamed from: b */
        static final long f15842b;

        /* renamed from: c */
        static final long f15843c;

        /* renamed from: d */
        static final long f15844d;

        /* renamed from: e */
        static final long f15845e;

        /* renamed from: f */
        static final long f15846f;

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.ads.interactivemedia.p038v3.internal.awb.C3866j.C38671());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.ads.interactivemedia.v3.internal.awb$k> r0 = com.google.ads.interactivemedia.p038v3.internal.awb.C3868k.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.ads.interactivemedia.v3.internal.awb$j$1 r1 = new com.google.ads.interactivemedia.v3.internal.awb$j$1     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<com.google.ads.interactivemedia.v3.internal.awb> r2 = com.google.ads.interactivemedia.p038v3.internal.awb.class
                java.lang.String r3 = "waiters"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f15843c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "listeners"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f15842b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "value"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f15844d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f15845e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "next"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f15846f = r2     // Catch:{ Exception -> 0x0053 }
                f15841a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                com.google.ads.interactivemedia.p038v3.internal.arw.m14643a(r0)
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.awb.C3866j.<clinit>():void");
        }

        private C3866j() {
        }

        /* synthetic */ C3866j(byte[] bArr) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo14667a(C3868k kVar, Thread thread) {
            f15841a.putObject(kVar, f15845e, thread);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo14668b(C3868k kVar, C3868k kVar2) {
            f15841a.putObject(kVar, f15846f, kVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final boolean mo14669c(awb<?> awb, C3868k kVar, C3868k kVar2) {
            return C3828a0.m12686a(f15841a, awb, f15843c, kVar, kVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final boolean mo14670d(awb<?> awb, C3860d dVar, C3860d dVar2) {
            return C3828a0.m12686a(f15841a, awb, f15842b, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final boolean mo14671e(awb<?> awb, Object obj, Object obj2) {
            return C3828a0.m12686a(f15841a, awb, f15844d, obj, obj2);
        }
    }

    /* renamed from: com.google.ads.interactivemedia.v3.internal.awb$k */
    /* compiled from: IMASDK */
    final class C3868k {

        /* renamed from: a */
        static final C3868k f15847a = new C3868k((byte[]) null);
        volatile C3868k next;
        volatile Thread thread;

        C3868k() {
            awb.f15823c.mo14667a(this, Thread.currentThread());
        }

        C3868k(byte[] bArr) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo14675a(C3868k kVar) {
            awb.f15823c.mo14668b(this, kVar);
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        C3856a aVar;
        Class<C3868k> cls = C3868k.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f15821a = z;
        try {
            aVar = new C3866j((byte[]) null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            aVar = new C3863g((byte[]) null);
        }
        f15823c = aVar;
        if (th != null) {
            Logger logger = f15822b;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected awb() {
    }

    /* renamed from: p */
    private final void m15001p(C3868k kVar) {
        kVar.thread = null;
        while (true) {
            C3868k kVar2 = this.waiters;
            if (kVar2 != C3868k.f15847a) {
                C3868k kVar3 = null;
                while (kVar2 != null) {
                    C3868k kVar4 = kVar2.next;
                    if (kVar2.thread != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.next = kVar4;
                        if (kVar3.thread == null) {
                        }
                    } else if (!f15823c.mo14669c(this, kVar2, kVar4)) {
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: q */
    private static Object m15002q(awk<?> awk) {
        Throwable d;
        if (awk instanceof C3864h) {
            Object obj = ((awb) awk).value;
            if (!(obj instanceof C3857b)) {
                return obj;
            }
            C3857b bVar = (C3857b) obj;
            if (!bVar.f15827c) {
                return obj;
            }
            Throwable th = bVar.f15828d;
            return th != null ? new C3857b(false, th) : C3857b.f15826b;
        } else if ((awk instanceof awq) && (d = ((awq) awk).mo14658d()) != null) {
            return new C3858c(d);
        } else {
            boolean isCancelled = awk.isCancelled();
            if ((!f15821a) && isCancelled) {
                return C3857b.f15826b;
            }
            try {
                Object r = m15003r(awk);
                if (!isCancelled) {
                    return r == null ? f15824d : r;
                }
                String valueOf = String.valueOf(awk);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new C3857b(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new C3858c(e.getCause());
                }
                String valueOf2 = String.valueOf(awk);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new C3857b(false, new IllegalArgumentException(sb2.toString(), e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new C3857b(false, e2);
                }
                String valueOf3 = String.valueOf(awk);
                StringBuilder sb3 = new StringBuilder(valueOf3.length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new C3858c(new IllegalArgumentException(sb3.toString(), e2));
            } catch (Throwable th2) {
                return new C3858c(th2);
            }
        }
    }

    /* renamed from: r */
    private static <V> V m15003r(Future<V> future) throws ExecutionException {
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

    /* renamed from: s */
    private static void m15004s(awb<?> awb) {
        awb<V> awb2;
        C3860d dVar;
        C3860d dVar2;
        C3860d dVar3 = null;
        awb<?> awb3 = awb;
        while (true) {
            C3868k kVar = awb3.waiters;
            if (f15823c.mo14669c(awb3, kVar, C3868k.f15847a)) {
                while (kVar != null) {
                    Thread thread = kVar.thread;
                    if (thread != null) {
                        kVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    kVar = kVar.next;
                }
                awb3.mo14656c();
                do {
                    dVar = awb3.listeners;
                } while (!f15823c.mo14670d(awb3, dVar, C3860d.f15831a));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.next;
                    dVar3.next = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.next;
                    Runnable runnable = dVar2.f15832b;
                    if (runnable instanceof C3862f) {
                        C3862f fVar = (C3862f) runnable;
                        awb<V> awb4 = fVar.f15839a;
                        if (awb4.value == fVar) {
                            if (f15823c.mo14671e(awb4, fVar, m15002q(fVar.f15840b))) {
                                awb2 = awb4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m15008w(runnable, dVar2.f15833c);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
            awb2 = awb3;
            awb3 = awb2;
        }
    }

    /* renamed from: t */
    private final void m15005t(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof C3862f) {
            sb.append(", setFuture=[");
            m15007v(sb, ((C3862f) obj).f15840b);
            sb.append("]");
        } else {
            try {
                str = aru.m14635a(mo14659e());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(valueOf);
                str = sb2.toString();
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m15006u(sb);
        }
    }

    /* renamed from: u */
    private final void m15006u(StringBuilder sb) {
        try {
            Object r = m15003r(this);
            sb.append("SUCCESS, result=[");
            if (r == null) {
                sb.append("null");
            } else if (r == this) {
                sb.append("this future");
            } else {
                sb.append(r.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(r)));
            }
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

    /* renamed from: v */
    private final void m15007v(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* renamed from: w */
    private static void m15008w(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f15822b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), e);
        }
    }

    /* renamed from: x */
    private static final V m15009x(Object obj) throws ExecutionException {
        if (obj instanceof C3857b) {
            Throwable th = ((C3857b) obj).f15828d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C3858c) {
            throw new ExecutionException(((C3858c) obj).f15830b);
        } else if (obj == f15824d) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14654a() {
        Object obj = this.value;
        return (obj instanceof C3857b) && ((C3857b) obj).f15827c;
    }

    /* renamed from: b */
    public void mo14655b(Runnable runnable, Executor executor) {
        C3860d dVar;
        Objects.requireNonNull(executor, "Executor was null.");
        if (isDone() || (dVar = this.listeners) == C3860d.f15831a) {
            m15008w(runnable, executor);
        }
        C3860d dVar2 = new C3860d(runnable, executor);
        do {
            dVar2.next = dVar;
            if (!f15823c.mo14670d(this, dVar, dVar2)) {
                dVar = this.listeners;
            } else {
                return;
            }
        } while (dVar != C3860d.f15831a);
        m15008w(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14656c() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.ads.interactivemedia.v3.internal.awk<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.ads.interactivemedia.p038v3.internal.awb.C3862f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005c
            boolean r3 = f15821a
            if (r3 == 0) goto L_0x001f
            com.google.ads.interactivemedia.v3.internal.awb$b r3 = new com.google.ads.interactivemedia.v3.internal.awb$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.ads.interactivemedia.v3.internal.awb$b r3 = com.google.ads.interactivemedia.p038v3.internal.awb.C3857b.f15825a
            goto L_0x0026
        L_0x0024:
            com.google.ads.interactivemedia.v3.internal.awb$b r3 = com.google.ads.interactivemedia.p038v3.internal.awb.C3857b.f15826b
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            com.google.ads.interactivemedia.v3.internal.awb$a r6 = f15823c
            boolean r6 = r6.mo14671e(r4, r0, r3)
            if (r6 == 0) goto L_0x0055
            m15004s(r4)
            boolean r4 = r0 instanceof com.google.ads.interactivemedia.p038v3.internal.awb.C3862f
            if (r4 == 0) goto L_0x0053
            com.google.ads.interactivemedia.v3.internal.awb$f r0 = (com.google.ads.interactivemedia.p038v3.internal.awb.C3862f) r0
            com.google.ads.interactivemedia.v3.internal.awk<? extends V> r0 = r0.f15840b
            boolean r4 = r0 instanceof com.google.ads.interactivemedia.p038v3.internal.awb.C3864h
            if (r4 == 0) goto L_0x0050
            r4 = r0
            com.google.ads.interactivemedia.v3.internal.awb r4 = (com.google.ads.interactivemedia.p038v3.internal.awb) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            boolean r6 = r0 instanceof com.google.ads.interactivemedia.p038v3.internal.awb.C3862f
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0053
            r5 = 1
            goto L_0x0028
        L_0x0050:
            r0.cancel(r8)
        L_0x0053:
            r1 = 1
            goto L_0x005c
        L_0x0055:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.ads.interactivemedia.p038v3.internal.awb.C3862f
            if (r6 != 0) goto L_0x0028
            r1 = r5
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p038v3.internal.awb.cancel(boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Throwable mo14658d() {
        if (!(this instanceof C3864h)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof C3858c) {
            return ((C3858c) obj).f15830b;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo14659e() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof C3862f))) {
                return m15009x(obj2);
            }
            C3868k kVar = this.waiters;
            if (kVar != C3868k.f15847a) {
                C3868k kVar2 = new C3868k();
                do {
                    kVar2.mo14675a(kVar);
                    if (f15823c.mo14669c(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                m15001p(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C3862f))));
                        return m15009x(obj);
                    }
                    kVar = this.waiters;
                } while (kVar != C3868k.f15847a);
            }
            return m15009x(this.value);
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.value instanceof C3857b;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof C3862f)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo14664n(V v) {
        if (v == null) {
            v = f15824d;
        }
        if (f15823c.mo14671e(this, (Object) null, v)) {
            m15004s(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo14665o(Throwable th) {
        if (f15823c.mo14671e(this, (Object) null, new C3858c(th))) {
            m15004s(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m15006u(sb);
        } else {
            m15005t(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof C3862f))) {
                return m15009x(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C3868k kVar = this.waiters;
                if (kVar != C3868k.f15847a) {
                    C3868k kVar2 = new C3868k();
                    do {
                        kVar2.mo14675a(kVar);
                        if (f15823c.mo14669c(this, kVar, kVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof C3862f))) {
                                        return m15009x(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m15001p(kVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m15001p(kVar2);
                        } else {
                            kVar = this.waiters;
                        }
                    } while (kVar != C3868k.f15847a);
                }
                return m15009x(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) && (!(obj3 instanceof C3862f))) {
                    return m15009x(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String awb = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(awb).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(awb);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }
}
