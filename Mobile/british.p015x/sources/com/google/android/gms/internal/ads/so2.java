package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class so2 {

    /* renamed from: e */
    private static so2 f39018e;

    /* renamed from: a */
    private final Handler f39019a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList<WeakReference<p84>> f39020b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Object f39021c = new Object();

    /* renamed from: d */
    private int f39022d = 0;

    private so2(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new ol2(this, (nk2) null), intentFilter);
    }

    /* renamed from: b */
    public static synchronized so2 m37463b(Context context) {
        so2 so2;
        synchronized (so2.class) {
            if (f39018e == null) {
                f39018e = new so2(context);
            }
            so2 = f39018e;
        }
        return so2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (com.google.android.gms.internal.ads.p84) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.f37357a.m36996h(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r3.f39020b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f39020b.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m37464c(com.google.android.gms.internal.ads.so2 r3, int r4) {
        /*
            java.lang.Object r0 = r3.f39021c
            monitor-enter(r0)
            int r1 = r3.f39022d     // Catch:{ all -> 0x0033 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0009:
            r3.f39022d = r4     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.gms.internal.ads.p84>> r0 = r3.f39020b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            com.google.android.gms.internal.ads.p84 r2 = (com.google.android.gms.internal.ads.p84) r2
            if (r2 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.r84 r1 = r2.f37357a
            r1.m36996h(r4)
            goto L_0x0012
        L_0x002c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.gms.internal.ads.p84>> r2 = r3.f39020b
            r2.remove(r1)
            goto L_0x0012
        L_0x0032:
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0036:
            throw r3
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.so2.m37464c(com.google.android.gms.internal.ads.so2, int):void");
    }

    /* renamed from: a */
    public final int mo34731a() {
        int i;
        synchronized (this.f39021c) {
            i = this.f39022d;
        }
        return i;
    }

    /* renamed from: d */
    public final void mo34732d(p84 p84) {
        Iterator<WeakReference<p84>> it = this.f39020b.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == null) {
                this.f39020b.remove(next);
            }
        }
        this.f39020b.add(new WeakReference(p84));
        this.f39019a.post(new li2(this, p84, (byte[]) null));
    }
}
