package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7210g;
import com.google.android.gms.common.api.C7213i;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.C7342l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7399j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p228l5.C10723k;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class BasePendingResult<R extends C7341k> extends C7210g<R> {

    /* renamed from: p */
    static final ThreadLocal<Boolean> f28919p = new C7253h3();

    /* renamed from: q */
    public static final /* synthetic */ int f28920q = 0;

    /* renamed from: a */
    private final Object f28921a;

    /* renamed from: b */
    protected final C7214a<R> f28922b;

    /* renamed from: c */
    protected final WeakReference<C7206f> f28923c;

    /* renamed from: d */
    private final CountDownLatch f28924d;

    /* renamed from: e */
    private final ArrayList<C7210g.C7211a> f28925e;

    /* renamed from: f */
    private C7342l<? super R> f28926f;

    /* renamed from: g */
    private final AtomicReference<C7313t2> f28927g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public R f28928h;

    /* renamed from: i */
    private Status f28929i;

    /* renamed from: j */
    private volatile boolean f28930j;

    /* renamed from: k */
    private boolean f28931k;

    /* renamed from: l */
    private boolean f28932l;

    /* renamed from: m */
    private C7399j f28933m;
    @KeepName
    private C7265j3 mResultGuardian;

    /* renamed from: n */
    private volatile C7308s2<R> f28934n;

    /* renamed from: o */
    private boolean f28935o;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C7214a<R extends C7341k> extends C10723k {
        public C7214a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo29795a(C7342l<? super R> lVar, R r) {
            int i = BasePendingResult.f28920q;
            sendMessage(obtainMessage(1, new Pair((C7342l) C4604n.m20098k(lVar), r)));
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C7342l lVar = (C7342l) pair.first;
                C7341k kVar = (C7341k) pair.second;
                try {
                    lVar.mo29606a(kVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m29552n(kVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo29788f(Status.f28885j);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f28921a = new Object();
        this.f28924d = new CountDownLatch(1);
        this.f28925e = new ArrayList<>();
        this.f28927g = new AtomicReference<>();
        this.f28935o = false;
        this.f28922b = new C7214a<>(Looper.getMainLooper());
        this.f28923c = new WeakReference<>((Object) null);
    }

    /* renamed from: j */
    private final R m29549j() {
        R r;
        synchronized (this.f28921a) {
            C4604n.m20102o(!this.f28930j, "Result has already been consumed.");
            C4604n.m20102o(mo29790h(), "Result is not ready.");
            r = this.f28928h;
            this.f28928h = null;
            this.f28926f = null;
            this.f28930j = true;
        }
        C7313t2 andSet = this.f28927g.getAndSet((Object) null);
        if (andSet != null) {
            andSet.f29145a.f29151a.remove(this);
        }
        return (C7341k) C4604n.m20098k(r);
    }

    /* renamed from: k */
    private final void m29550k(R r) {
        this.f28928h = r;
        this.f28929i = r.mo29527p0();
        this.f28933m = null;
        this.f28924d.countDown();
        if (this.f28931k) {
            this.f28926f = null;
        } else {
            C7342l<? super R> lVar = this.f28926f;
            if (lVar != null) {
                this.f28922b.removeMessages(2);
                this.f28922b.mo29795a(lVar, m29549j());
            } else if (this.f28928h instanceof C7213i) {
                this.mResultGuardian = new C7265j3(this, (C7258i3) null);
            }
        }
        ArrayList<C7210g.C7211a> arrayList = this.f28925e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo29787a(this.f28929i);
        }
        this.f28925e.clear();
    }

    /* renamed from: n */
    public static void m29552n(C7341k kVar) {
        if (kVar instanceof C7213i) {
            try {
                ((C7213i) kVar).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(kVar)), e);
            }
        }
    }

    /* renamed from: b */
    public final void mo29784b(C7210g.C7211a aVar) {
        C4604n.m20089b(aVar != null, "Callback cannot be null.");
        synchronized (this.f28921a) {
            if (mo29790h()) {
                aVar.mo29787a(this.f28929i);
            } else {
                this.f28925e.add(aVar);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29785c() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f28921a
            monitor-enter(r0)
            boolean r1 = r2.f28931k     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.f28930j     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            com.google.android.gms.common.internal.j r1 = r2.f28933m     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.cancel()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            R r1 = r2.f28928h     // Catch:{ all -> 0x0028 }
            m29552n(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.f28931k = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f28886k     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.k r1 = r2.mo29539e(r1)     // Catch:{ all -> 0x0028 }
            r2.m29550k(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo29785c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29786d(com.google.android.gms.common.api.C7342l<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f28921a
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.f28926f = r5     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x000a:
            boolean r1 = r4.f28930j     // Catch:{ all -> 0x003a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.C4604n.m20102o(r1, r3)     // Catch:{ all -> 0x003a }
            com.google.android.gms.common.api.internal.s2<R> r1 = r4.f28934n     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C4604n.m20102o(r2, r1)     // Catch:{ all -> 0x003a }
            boolean r1 = r4.mo29789g()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x0026:
            boolean r1 = r4.mo29790h()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r4.f28922b     // Catch:{ all -> 0x003a }
            com.google.android.gms.common.api.k r2 = r4.m29549j()     // Catch:{ all -> 0x003a }
            r1.mo29795a(r5, r2)     // Catch:{ all -> 0x003a }
            goto L_0x0038
        L_0x0036:
            r4.f28926f = r5     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo29786d(com.google.android.gms.common.api.l):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract R mo29539e(Status status);

    @Deprecated
    /* renamed from: f */
    public final void mo29788f(Status status) {
        synchronized (this.f28921a) {
            if (!mo29790h()) {
                mo29791i(mo29539e(status));
                this.f28932l = true;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo29789g() {
        boolean z;
        synchronized (this.f28921a) {
            z = this.f28931k;
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo29790h() {
        return this.f28924d.getCount() == 0;
    }

    /* renamed from: i */
    public final void mo29791i(R r) {
        synchronized (this.f28921a) {
            if (this.f28932l || this.f28931k) {
                m29552n(r);
                return;
            }
            mo29790h();
            C4604n.m20102o(!mo29790h(), "Results have already been set");
            C4604n.m20102o(!this.f28930j, "Result has already been consumed");
            m29550k(r);
        }
    }

    /* renamed from: m */
    public final void mo29792m() {
        boolean z = true;
        if (!this.f28935o && !f28919p.get().booleanValue()) {
            z = false;
        }
        this.f28935o = z;
    }

    /* renamed from: o */
    public final boolean mo29793o() {
        boolean g;
        synchronized (this.f28921a) {
            if (((C7206f) this.f28923c.get()) == null || !this.f28935o) {
                mo29785c();
            }
            g = mo29789g();
        }
        return g;
    }

    /* renamed from: p */
    public final void mo29794p(C7313t2 t2Var) {
        this.f28927g.set(t2Var);
    }

    protected BasePendingResult(C7206f fVar) {
        this.f28921a = new Object();
        this.f28924d = new CountDownLatch(1);
        this.f28925e = new ArrayList<>();
        this.f28927g = new AtomicReference<>();
        this.f28935o = false;
        this.f28922b = new C7214a<>(fVar != null ? fVar.mo17962l() : Looper.getMainLooper());
        this.f28923c = new WeakReference<>(fVar);
    }
}
