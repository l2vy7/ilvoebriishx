package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alu */
/* compiled from: IMASDK */
public final class alu {

    /* renamed from: a */
    private static alu f15240a;

    /* renamed from: b */
    private final Handler f15241b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final CopyOnWriteArrayList<WeakReference<als>> f15242c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private final Object f15243d = new Object();

    /* renamed from: e */
    private int f15244e = 0;

    private alu(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new alt(this), intentFilter);
    }

    /* renamed from: a */
    public static synchronized alu m14054a(Context context) {
        alu alu;
        synchronized (alu.class) {
            if (f15240a == null) {
                f15240a = new alu(context);
            }
            alu = f15240a;
        }
        return alu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (com.google.ads.interactivemedia.p039v3.internal.als) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.mo13822a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.f15242c.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f15242c.iterator();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m14055d(com.google.ads.interactivemedia.p039v3.internal.alu r3, int r4) {
        /*
            java.lang.Object r0 = r3.f15243d
            monitor-enter(r0)
            int r1 = r3.f15244e     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0009:
            r3.f15244e = r4     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.ads.interactivemedia.v3.internal.als>> r0 = r3.f15242c
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            com.google.ads.interactivemedia.v3.internal.als r2 = (com.google.ads.interactivemedia.p039v3.internal.als) r2
            if (r2 == 0) goto L_0x002a
            r2.mo13822a(r4)
            goto L_0x0012
        L_0x002a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.ads.interactivemedia.v3.internal.als>> r2 = r3.f15242c
            r2.remove(r1)
            goto L_0x0012
        L_0x0030:
            return
        L_0x0031:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            goto L_0x0035
        L_0x0034:
            throw r3
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.alu.m14055d(com.google.ads.interactivemedia.v3.internal.alu, int):void");
    }

    /* renamed from: b */
    public final void mo13917b(als als) {
        Iterator<WeakReference<als>> it = this.f15242c.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == null) {
                this.f15242c.remove(next);
            }
        }
        this.f15242c.add(new WeakReference(als));
        this.f15241b.post(new alr(this, als));
    }

    /* renamed from: c */
    public final int mo13918c() {
        int i;
        synchronized (this.f15243d) {
            i = this.f15244e;
        }
        return i;
    }
}
