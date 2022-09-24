package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9766f4 extends C9737c5 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicLong f46250l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9756e4 f46251c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C9756e4 f46252d;

    /* renamed from: e */
    private final PriorityBlockingQueue f46253e = new PriorityBlockingQueue();

    /* renamed from: f */
    private final BlockingQueue f46254f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f46255g = new C9736c4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f46256h = new C9736c4(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f46257i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Semaphore f46258j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f46259k;

    C9766f4(C4670h4 h4Var) {
        super(h4Var);
    }

    /* renamed from: D */
    private final void m45053D(C9746d4 d4Var) {
        synchronized (this.f46257i) {
            this.f46253e.add(d4Var);
            C9756e4 e4Var = this.f46251c;
            if (e4Var == null) {
                C9756e4 e4Var2 = new C9756e4(this, "Measurement Worker", this.f46253e);
                this.f46251c = e4Var2;
                e4Var2.setUncaughtExceptionHandler(this.f46255g);
                this.f46251c.start();
            } else {
                e4Var.mo38895a();
            }
        }
    }

    /* renamed from: A */
    public final void mo38903A(Runnable runnable) throws IllegalStateException {
        mo38880i();
        C4604n.m20098k(runnable);
        m45053D(new C9746d4(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean mo38904C() {
        return Thread.currentThread() == this.f46251c;
    }

    /* renamed from: a */
    public final void mo19271a() {
        if (Thread.currentThread() != this.f46252d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: b */
    public final void mo19272b() {
        if (Thread.currentThread() != this.f46251c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo19280h() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.mo38856a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.f21269a.mo19276j().mo19287w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r5.length() != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r3.mo38856a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r3 = r1.f21269a.mo19276j().mo19287w();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38905q(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.h4 r0 = r1.f21269a     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.f4 r0 = r0.mo19273e()     // Catch:{ all -> 0x0058 }
            r0.mo38909z(r6)     // Catch:{ all -> 0x0058 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.h4 r3 = r1.f21269a
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19287w()
            java.lang.String r4 = "Timed out waiting for "
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002b
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0031
        L_0x002b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0031:
            r3.mo38856a(r4)
        L_0x0034:
            return r2
        L_0x0035:
            com.google.android.gms.measurement.internal.h4 r3 = r1.f21269a     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ all -> 0x0058 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19287w()     // Catch:{ all -> 0x0058 }
            java.lang.String r4 = "Interrupted waiting for "
            int r6 = r5.length()     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x004c
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0058 }
            goto L_0x0052
        L_0x004c:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0058 }
            r5.<init>(r4)     // Catch:{ all -> 0x0058 }
            r4 = r5
        L_0x0052:
            r3.mo38856a(r4)     // Catch:{ all -> 0x0058 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            r2 = 0
            return r2
        L_0x0058:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9766f4.mo38905q(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: s */
    public final Future mo38906s(Callable callable) throws IllegalStateException {
        mo38880i();
        C4604n.m20098k(callable);
        C9746d4 d4Var = new C9746d4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f46251c) {
            if (!this.f46253e.isEmpty()) {
                this.f21269a.mo19276j().mo19287w().mo38856a("Callable skipped the worker queue.");
            }
            d4Var.run();
        } else {
            m45053D(d4Var);
        }
        return d4Var;
    }

    /* renamed from: t */
    public final Future mo38907t(Callable callable) throws IllegalStateException {
        mo38880i();
        C4604n.m20098k(callable);
        C9746d4 d4Var = new C9746d4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f46251c) {
            d4Var.run();
        } else {
            m45053D(d4Var);
        }
        return d4Var;
    }

    /* renamed from: y */
    public final void mo38908y(Runnable runnable) throws IllegalStateException {
        mo38880i();
        C4604n.m20098k(runnable);
        C9746d4 d4Var = new C9746d4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f46257i) {
            this.f46254f.add(d4Var);
            C9756e4 e4Var = this.f46252d;
            if (e4Var == null) {
                C9756e4 e4Var2 = new C9756e4(this, "Measurement Network", this.f46254f);
                this.f46252d = e4Var2;
                e4Var2.setUncaughtExceptionHandler(this.f46256h);
                this.f46252d.start();
            } else {
                e4Var.mo38895a();
            }
        }
    }

    /* renamed from: z */
    public final void mo38909z(Runnable runnable) throws IllegalStateException {
        mo38880i();
        C4604n.m20098k(runnable);
        m45053D(new C9746d4(this, runnable, false, "Task exception on worker thread"));
    }
}
