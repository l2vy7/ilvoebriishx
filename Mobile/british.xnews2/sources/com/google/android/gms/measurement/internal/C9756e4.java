package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.e4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9756e4 extends Thread {

    /* renamed from: b */
    private final Object f46230b;

    /* renamed from: c */
    private final BlockingQueue f46231c;

    /* renamed from: d */
    private boolean f46232d = false;

    /* renamed from: e */
    final /* synthetic */ C9766f4 f46233e;

    public C9756e4(C9766f4 f4Var, String str, BlockingQueue blockingQueue) {
        this.f46233e = f4Var;
        C4604n.m20098k(str);
        C4604n.m20098k(blockingQueue);
        this.f46230b = new Object();
        this.f46231c = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m45045b() {
        synchronized (this.f46233e.f46257i) {
            if (!this.f46232d) {
                this.f46233e.f46258j.release();
                this.f46233e.f46257i.notifyAll();
                C9766f4 f4Var = this.f46233e;
                if (this == f4Var.f46251c) {
                    f4Var.f46251c = null;
                } else if (this == f4Var.f46252d) {
                    f4Var.f46252d = null;
                } else {
                    f4Var.f21269a.mo19276j().mo19282q().mo38856a("Current scheduler thread is neither worker nor network");
                }
                this.f46232d = true;
            }
        }
    }

    /* renamed from: c */
    private final void m45046c(InterruptedException interruptedException) {
        this.f46233e.f21269a.mo19276j().mo19287w().mo38857b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void mo38895a() {
        synchronized (this.f46230b) {
            this.f46230b.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
        m45045b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x0014
            com.google.android.gms.measurement.internal.f4 r2 = r6.f46233e     // Catch:{ InterruptedException -> 0x000f }
            java.util.concurrent.Semaphore r2 = r2.f46258j     // Catch:{ InterruptedException -> 0x000f }
            r2.acquire()     // Catch:{ InterruptedException -> 0x000f }
            r1 = 1
            goto L_0x0002
        L_0x000f:
            r2 = move-exception
            r6.m45046c(r2)
            goto L_0x0002
        L_0x0014:
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x0082 }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x0082 }
        L_0x001c:
            java.util.concurrent.BlockingQueue r2 = r6.f46231c     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.measurement.internal.d4 r2 = (com.google.android.gms.measurement.internal.C9746d4) r2     // Catch:{ all -> 0x0082 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.f46208c     // Catch:{ all -> 0x0082 }
            if (r0 == r3) goto L_0x002d
            r3 = 10
            goto L_0x002e
        L_0x002d:
            r3 = r1
        L_0x002e:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x0082 }
            r2.run()     // Catch:{ all -> 0x0082 }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r6.f46230b     // Catch:{ all -> 0x0082 }
            monitor-enter(r2)     // Catch:{ all -> 0x0082 }
            java.util.concurrent.BlockingQueue r3 = r6.f46231c     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x007f }
            if (r3 != 0) goto L_0x0051
            com.google.android.gms.measurement.internal.f4 r3 = r6.f46233e     // Catch:{ all -> 0x007f }
            boolean unused = r3.f46259k     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r6.f46230b     // Catch:{ InterruptedException -> 0x004d }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r3 = move-exception
            r6.m45046c(r3)     // Catch:{ all -> 0x007f }
        L_0x0051:
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            com.google.android.gms.measurement.internal.f4 r2 = r6.f46233e     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.f46257i     // Catch:{ all -> 0x0082 }
            monitor-enter(r2)     // Catch:{ all -> 0x0082 }
            java.util.concurrent.BlockingQueue r3 = r6.f46231c     // Catch:{ all -> 0x007c }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x007a
            com.google.android.gms.measurement.internal.f4 r0 = r6.f46233e     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.f r0 = r0.mo19392z()     // Catch:{ all -> 0x007c }
            com.google.android.gms.measurement.internal.r2 r1 = com.google.android.gms.measurement.internal.C9903s2.f46689g0     // Catch:{ all -> 0x007c }
            r3 = 0
            boolean r0 = r0.mo19337B(r3, r1)     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0075
            r6.m45045b()     // Catch:{ all -> 0x007c }
        L_0x0075:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            r6.m45045b()
            return
        L_0x007a:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            goto L_0x001c
        L_0x007c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x007f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            r6.m45045b()
            goto L_0x0088
        L_0x0087:
            throw r0
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9756e4.run():void");
    }
}
