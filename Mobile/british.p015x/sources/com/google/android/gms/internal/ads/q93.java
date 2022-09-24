package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class q93<V> extends ec3 implements mb3<V> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final boolean f20658e;

    /* renamed from: f */
    private static final Logger f20659f = Logger.getLogger(q93.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final f93 f20660g;

    /* renamed from: h */
    private static final Object f20661h = new Object();
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: b */
    public volatile Object f20662b;
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: c */
    public volatile i93 f20663c;
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: d */
    public volatile p93 f20664d;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        f93 f93;
        Class<p93> cls = p93.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f20658e = z;
        try {
            f93 = new o93((s93) null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            f93 = new l93((r93) null);
        }
        f20660g = f93;
        if (th != null) {
            Logger logger = f20659f;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected q93() {
    }

    /* renamed from: A */
    private final void m20839A(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f20662b;
        if (obj instanceof k93) {
            sb.append(", setFuture=[");
            m20840B(sb, ((k93) obj).f34203c);
            sb.append("]");
        } else {
            try {
                str = m43.m20694a(mo18119h());
            } catch (RuntimeException | StackOverflowError e) {
                str = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m20857z(sb);
        }
    }

    /* renamed from: B */
    private final void m20840B(StringBuilder sb, @CheckForNull Object obj) {
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

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static void m20841C(q93<?> q93) {
        q93<V> q932;
        i93 i93;
        i93 i932;
        i93 i933 = null;
        q93<?> q933 = q93;
        while (true) {
            p93 p93 = q933.f20664d;
            if (f20660g.mo18314e(q933, p93, p93.f20650c)) {
                while (p93 != null) {
                    Thread thread = p93.f20651a;
                    if (thread != null) {
                        p93.f20651a = null;
                        LockSupport.unpark(thread);
                    }
                    p93 = p93.f20652b;
                }
                q933.mo18120i();
                do {
                    i93 = q933.f20663c;
                } while (!f20660g.mo18312c(q933, i93, i93.f20388d));
                while (true) {
                    i932 = i933;
                    i933 = i93;
                    if (i933 == null) {
                        break;
                    }
                    i93 = i933.f20391c;
                    i933.f20391c = i932;
                }
                while (i932 != null) {
                    i933 = i932.f20391c;
                    Runnable runnable = i932.f20389a;
                    runnable.getClass();
                    if (runnable instanceof k93) {
                        k93 k93 = (k93) runnable;
                        q93<V> q934 = k93.f34202b;
                        if (q934.f20662b == k93) {
                            if (f20660g.mo18313d(q934, k93, m20845f(k93.f34203c))) {
                                q932 = q934;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = i932.f20390b;
                        executor.getClass();
                        m20842c(runnable, executor);
                    }
                    i932 = i933;
                }
                return;
            }
            q932 = q933;
            q933 = q932;
        }
    }

    /* renamed from: c */
    private static void m20842c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f20659f;
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

    /* renamed from: d */
    private final void m20843d(p93 p93) {
        p93.f20651a = null;
        while (true) {
            p93 p932 = this.f20664d;
            if (p932 != p93.f20650c) {
                p93 p933 = null;
                while (p932 != null) {
                    p93 p934 = p932.f20652b;
                    if (p932.f20651a != null) {
                        p933 = p932;
                    } else if (p933 != null) {
                        p933.f20652b = p934;
                        if (p933.f20651a == null) {
                        }
                    } else if (!f20660g.mo18314e(this, p932, p934)) {
                    }
                    p932 = p934;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: e */
    private static final V m20844e(Object obj) throws ExecutionException {
        if (obj instanceof g93) {
            Throwable th = ((g93) obj).f20343b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof h93) {
            throw new ExecutionException(((h93) obj).f32686a);
        } else if (obj == f20661h) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static Object m20845f(mb3<?> mb3) {
        Throwable b;
        if (mb3 instanceof m93) {
            Object obj = ((q93) mb3).f20662b;
            if (obj instanceof g93) {
                g93 g93 = (g93) obj;
                if (g93.f20342a) {
                    Throwable th = g93.f20343b;
                    obj = th != null ? new g93(false, th) : g93.f20341d;
                }
            }
            obj.getClass();
            return obj;
        } else if ((mb3 instanceof ec3) && (b = ((ec3) mb3).mo18655b()) != null) {
            return new h93(b);
        } else {
            boolean isCancelled = mb3.isCancelled();
            if ((!f20658e) && isCancelled) {
                g93 g932 = g93.f20341d;
                g932.getClass();
                return g932;
            }
            try {
                Object g = m20846g(mb3);
                if (!isCancelled) {
                    return g == null ? f20661h : g;
                }
                String valueOf = String.valueOf(mb3);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new g93(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e) {
                if (isCancelled) {
                    return new g93(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(mb3)), e));
                }
                return new h93(e.getCause());
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new h93(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(mb3)), e2));
                }
                return new g93(false, e2);
            } catch (Throwable th2) {
                return new h93(th2);
            }
        }
    }

    /* renamed from: g */
    private static <V> V m20846g(Future<V> future) throws ExecutionException {
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

    /* renamed from: z */
    private final void m20857z(StringBuilder sb) {
        try {
            Object g = m20846g(this);
            sb.append("SUCCESS, result=[");
            if (g == null) {
                sb.append("null");
            } else if (g == this) {
                sb.append("this future");
            } else {
                sb.append(g.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(g)));
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

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: b */
    public final Throwable mo18655b() {
        if (!(this instanceof m93)) {
            return null;
        }
        Object obj = this.f20662b;
        if (obj instanceof h93) {
            return ((h93) obj).f32686a;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.android.gms.internal.ads.mb3<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f20662b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.k93
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0064
            boolean r3 = f20658e
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.g93 r3 = new com.google.android.gms.internal.ads.g93
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.g93 r3 = com.google.android.gms.internal.ads.g93.f20340c
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.g93 r3 = com.google.android.gms.internal.ads.g93.f20341d
        L_0x0026:
            r3.getClass()
        L_0x0029:
            r5 = 0
            r4 = r7
        L_0x002b:
            com.google.android.gms.internal.ads.f93 r6 = f20660g
            boolean r6 = r6.mo18313d(r4, r0, r3)
            if (r6 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x0038
            r4.mo18605s()
        L_0x0038:
            m20841C(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.k93
            if (r4 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.k93 r0 = (com.google.android.gms.internal.ads.k93) r0
            com.google.android.gms.internal.ads.mb3<? extends V> r0 = r0.f34203c
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.m93
            if (r4 == 0) goto L_0x0058
            r4 = r0
            com.google.android.gms.internal.ads.q93 r4 = (com.google.android.gms.internal.ads.q93) r4
            java.lang.Object r0 = r4.f20662b
            if (r0 != 0) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.k93
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005b
            r5 = 1
            goto L_0x002b
        L_0x0058:
            r0.cancel(r8)
        L_0x005b:
            r1 = 1
            goto L_0x0064
        L_0x005d:
            java.lang.Object r0 = r4.f20662b
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.k93
            if (r6 != 0) goto L_0x002b
            r1 = r5
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q93.cancel(boolean):boolean");
    }

    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f20662b;
            if ((obj2 != null) && (!(obj2 instanceof k93))) {
                return m20844e(obj2);
            }
            p93 p93 = this.f20664d;
            if (p93 != p93.f20650c) {
                p93 p932 = new p93();
                do {
                    f93 f93 = f20660g;
                    f93.mo18310a(p932, p93);
                    if (f93.mo18314e(this, p93, p932)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f20662b;
                            } else {
                                m20843d(p932);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof k93))));
                        return m20844e(obj);
                    }
                    p93 = this.f20664d;
                } while (p93 != p93.f20650c);
            }
            Object obj3 = this.f20662b;
            obj3.getClass();
            return m20844e(obj3);
        }
        throw new InterruptedException();
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: h */
    public String mo18119h() {
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

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo18120i() {
    }

    public boolean isCancelled() {
        return this.f20662b instanceof g93;
    }

    public boolean isDone() {
        Object obj = this.f20662b;
        return (!(obj instanceof k93)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo18605s() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo18661t(@CheckForNull Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(mo18666y());
        }
    }

    public String toString() {
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
            m20857z(sb);
        } else {
            m20839A(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo18663v(V v) {
        if (v == null) {
            v = f20661h;
        }
        if (!f20660g.mo18313d(this, (Object) null, v)) {
            return false;
        }
        m20841C(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo18664w(Throwable th) {
        Objects.requireNonNull(th);
        if (!f20660g.mo18313d(this, (Object) null, new h93(th))) {
            return false;
        }
        m20841C(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo18665x(mb3<? extends V> mb3) {
        k93 k93;
        h93 h93;
        Objects.requireNonNull(mb3);
        Object obj = this.f20662b;
        if (obj == null) {
            if (mb3.isDone()) {
                if (!f20660g.mo18313d(this, (Object) null, m20845f(mb3))) {
                    return false;
                }
                m20841C(this);
                return true;
            }
            k93 = new k93(this, mb3);
            if (f20660g.mo18313d(this, (Object) null, k93)) {
                try {
                    mb3.zzc(k93, pa3.INSTANCE);
                } catch (Throwable unused) {
                    h93 = h93.f32685b;
                }
                return true;
            }
            obj = this.f20662b;
        }
        if (obj instanceof g93) {
            mb3.cancel(((g93) obj).f20342a);
        }
        return false;
        f20660g.mo18313d(this, k93, h93);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo18666y() {
        Object obj = this.f20662b;
        return (obj instanceof g93) && ((g93) obj).f20342a;
    }

    public void zzc(Runnable runnable, Executor executor) {
        i93 i93;
        b43.m20206c(runnable, "Runnable was null.");
        b43.m20206c(executor, "Executor was null.");
        if (isDone() || (i93 = this.f20663c) == i93.f20388d) {
            m20842c(runnable, executor);
        }
        i93 i932 = new i93(runnable, executor);
        do {
            i932.f20391c = i93;
            if (!f20660g.mo18312c(this, i93, i932)) {
                i93 = this.f20663c;
            } else {
                return;
            }
        } while (i93 != i93.f20388d);
        m20842c(runnable, executor);
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f20662b;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof k93))) {
                return m20844e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                p93 p93 = this.f20664d;
                if (p93 != p93.f20650c) {
                    p93 p932 = new p93();
                    do {
                        f93 f93 = f20660g;
                        f93.mo18310a(p932, p93);
                        if (f93.mo18314e(this, p93, p932)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f20662b;
                                    if ((obj2 != null) && (!(obj2 instanceof k93))) {
                                        return m20844e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m20843d(p932);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m20843d(p932);
                        } else {
                            p93 = this.f20664d;
                        }
                    } while (p93 != p93.f20650c);
                }
                Object obj3 = this.f20662b;
                obj3.getClass();
                return m20844e(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f20662b;
                if ((obj4 != null) && (!(obj4 instanceof k93))) {
                    return m20844e(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String q93 = toString();
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
                String concat = sb2.concat(" (plus ");
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
                        sb4 = sb4.concat(",");
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
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(q93).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(q93);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }
}
