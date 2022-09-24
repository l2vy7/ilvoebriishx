package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C7206f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p228l5.C10723k;

/* renamed from: com.google.android.gms.common.internal.f0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4603f0 implements Handler.Callback {
    @NotOnlyInitialized

    /* renamed from: b */
    private final C7385e0 f20046b;

    /* renamed from: c */
    private final ArrayList<C7206f.C7208b> f20047c = new ArrayList<>();

    /* renamed from: d */
    final ArrayList<C7206f.C7208b> f20048d = new ArrayList<>();

    /* renamed from: e */
    private final ArrayList<C7206f.C7209c> f20049e = new ArrayList<>();

    /* renamed from: f */
    private volatile boolean f20050f = false;

    /* renamed from: g */
    private final AtomicInteger f20051g = new AtomicInteger(0);

    /* renamed from: h */
    private boolean f20052h = false;

    /* renamed from: i */
    private final Handler f20053i;

    /* renamed from: j */
    private final Object f20054j = new Object();

    public C4603f0(Looper looper, C7385e0 e0Var) {
        this.f20046b = e0Var;
        this.f20053i = new C10723k(looper, this);
    }

    /* renamed from: a */
    public final void mo17994a() {
        this.f20050f = false;
        this.f20051g.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo17995b() {
        this.f20050f = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17996c(com.google.android.gms.common.ConnectionResult r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.f20053i
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.C4604n.m20092e(r0, r1)
            android.os.Handler r0 = r5.f20053i
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.f20054j
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            java.util.ArrayList<com.google.android.gms.common.api.f$c> r2 = r5.f20049e     // Catch:{ all -> 0x004a }
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.f20051g     // Catch:{ all -> 0x004a }
            int r2 = r2.get()     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004a }
            com.google.android.gms.common.api.f$c r3 = (com.google.android.gms.common.api.C7206f.C7209c) r3     // Catch:{ all -> 0x004a }
            boolean r4 = r5.f20050f     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f20051g     // Catch:{ all -> 0x004a }
            int r4 = r4.get()     // Catch:{ all -> 0x004a }
            if (r4 == r2) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            java.util.ArrayList<com.google.android.gms.common.api.f$c> r4 = r5.f20049e     // Catch:{ all -> 0x004a }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            r3.onConnectionFailed(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            goto L_0x004e
        L_0x004d:
            throw r6
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C4603f0.mo17996c(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: d */
    public final void mo17997d(Bundle bundle) {
        C4604n.m20092e(this.f20053i, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f20054j) {
            C4604n.m20101n(!this.f20052h);
            this.f20053i.removeMessages(1);
            this.f20052h = true;
            C4604n.m20101n(this.f20048d.isEmpty());
            ArrayList arrayList = new ArrayList(this.f20047c);
            int i = this.f20051g.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7206f.C7208b bVar = (C7206f.C7208b) it.next();
                if (!this.f20050f || !this.f20046b.isConnected()) {
                    break;
                } else if (this.f20051g.get() != i) {
                    break;
                } else if (!this.f20048d.contains(bVar)) {
                    bVar.onConnected(bundle);
                }
            }
            this.f20048d.clear();
            this.f20052h = false;
        }
    }

    /* renamed from: e */
    public final void mo17998e(int i) {
        C4604n.m20092e(this.f20053i, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f20053i.removeMessages(1);
        synchronized (this.f20054j) {
            this.f20052h = true;
            ArrayList arrayList = new ArrayList(this.f20047c);
            int i2 = this.f20051g.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7206f.C7208b bVar = (C7206f.C7208b) it.next();
                if (!this.f20050f) {
                    break;
                } else if (this.f20051g.get() != i2) {
                    break;
                } else if (this.f20047c.contains(bVar)) {
                    bVar.onConnectionSuspended(i);
                }
            }
            this.f20048d.clear();
            this.f20052h = false;
        }
    }

    /* renamed from: f */
    public final void mo17999f(C7206f.C7208b bVar) {
        C4604n.m20098k(bVar);
        synchronized (this.f20054j) {
            if (this.f20047c.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f20047c.add(bVar);
            }
        }
        if (this.f20046b.isConnected()) {
            Handler handler = this.f20053i;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: g */
    public final void mo18000g(C7206f.C7209c cVar) {
        C4604n.m20098k(cVar);
        synchronized (this.f20054j) {
            if (this.f20049e.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f20049e.add(cVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo18001h(C7206f.C7209c cVar) {
        C4604n.m20098k(cVar);
        synchronized (this.f20054j) {
            if (!this.f20049e.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C7206f.C7208b bVar = (C7206f.C7208b) message.obj;
            synchronized (this.f20054j) {
                if (this.f20050f && this.f20046b.isConnected() && this.f20047c.contains(bVar)) {
                    bVar.onConnected((Bundle) null);
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
