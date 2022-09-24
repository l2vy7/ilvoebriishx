package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import com.google.android.gms.common.C7190a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7210g;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4603f0;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7385e0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C6482d;
import p259w4.C11067a;
import p263x5.C11095a;
import p263x5.C11100f;

/* renamed from: com.google.android.gms.common.api.internal.a1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7217a1 extends C7206f implements C7312t1 {

    /* renamed from: b */
    private final Lock f28938b;

    /* renamed from: c */
    private final C4603f0 f28939c;

    /* renamed from: d */
    private C7322v1 f28940d = null;

    /* renamed from: e */
    private final int f28941e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f28942f;

    /* renamed from: g */
    private final Looper f28943g;

    /* renamed from: h */
    final Queue<C7231d<?, ?>> f28944h = new LinkedList();

    /* renamed from: i */
    private volatile boolean f28945i;

    /* renamed from: j */
    private long f28946j;

    /* renamed from: k */
    private long f28947k;

    /* renamed from: l */
    private final C7333y0 f28948l;

    /* renamed from: m */
    private final C7190a f28949m;

    /* renamed from: n */
    zabx f28950n;

    /* renamed from: o */
    final Map<C7191a.C7194c<?>, C7191a.C7201f> f28951o;

    /* renamed from: p */
    Set<Scope> f28952p;

    /* renamed from: q */
    final C4601e f28953q;

    /* renamed from: r */
    final Map<C7191a<?>, Boolean> f28954r;

    /* renamed from: s */
    final C7191a.C7192a<? extends C11100f, C11095a> f28955s;

    /* renamed from: t */
    private final C7266k f28956t;

    /* renamed from: u */
    private final ArrayList<C7270k3> f28957u;

    /* renamed from: v */
    private Integer f28958v;

    /* renamed from: w */
    Set<C7308s2> f28959w;

    /* renamed from: x */
    final C7318u2 f28960x;

    /* renamed from: y */
    private final C7385e0 f28961y;

    public C7217a1(Context context, Lock lock, Looper looper, C4601e eVar, C7190a aVar, C7191a.C7192a<? extends C11100f, C11095a> aVar2, Map<C7191a<?>, Boolean> map, List<C7206f.C7208b> list, List<C7206f.C7209c> list2, Map<C7191a.C7194c<?>, C7191a.C7201f> map2, int i, int i2, ArrayList<C7270k3> arrayList) {
        Looper looper2 = looper;
        int i3 = i;
        this.f28946j = true != C6482d.m28249a() ? 120000 : ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS;
        this.f28947k = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.f28952p = new HashSet();
        this.f28956t = new C7266k();
        this.f28958v = null;
        this.f28959w = null;
        C7316u0 u0Var = new C7316u0(this);
        this.f28961y = u0Var;
        this.f28942f = context;
        this.f28938b = lock;
        this.f28939c = new C4603f0(looper, u0Var);
        this.f28943g = looper2;
        this.f28948l = new C7333y0(this, looper);
        this.f28949m = aVar;
        this.f28941e = i3;
        if (i3 >= 0) {
            this.f28958v = Integer.valueOf(i2);
        }
        this.f28954r = map;
        this.f28951o = map2;
        this.f28957u = arrayList;
        this.f28960x = new C7318u2();
        for (C7206f.C7208b f : list) {
            this.f28939c.mo17999f(f);
        }
        for (C7206f.C7209c g : list2) {
            this.f28939c.mo18000g(g);
        }
        this.f28953q = eVar;
        this.f28955s = aVar2;
    }

    /* renamed from: B */
    private final void m29571B(int i) {
        Integer num = this.f28958v;
        if (num == null) {
            this.f28958v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String w = m29576w(i);
            String w2 = m29576w(this.f28958v.intValue());
            StringBuilder sb = new StringBuilder(w.length() + 51 + w2.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(w);
            sb.append(". Mode was already set to ");
            sb.append(w2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f28940d == null) {
            boolean z = false;
            boolean z2 = false;
            for (C7191a.C7201f next : this.f28951o.values()) {
                z |= next.requiresSignIn();
                z2 |= next.providesSignIn();
            }
            int intValue = this.f28958v.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    this.f28940d = C7324w.m29857p(this.f28942f, this, this.f28938b, this.f28943g, this.f28949m, this.f28951o, this.f28953q, this.f28954r, this.f28955s, this.f28957u);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.f28940d = new C4594e1(this.f28942f, this, this.f28938b, this.f28943g, this.f28949m, this.f28951o, this.f28953q, this.f28954r, this.f28955s, this.f28957u, this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m29572C(C7206f fVar, C7305s sVar, boolean z) {
        C11067a.f50015d.mo43350a(fVar).mo29786d(new C7329x0(this, sVar, z, fVar));
    }

    @GuardedBy("mLock")
    /* renamed from: D */
    private final void m29573D() {
        this.f28939c.mo17995b();
        ((C7322v1) C4604n.m20098k(this.f28940d)).mo17909c();
    }

    /* renamed from: t */
    public static int m29574t(Iterable<C7191a.C7201f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C7191a.C7201f next : iterable) {
            z2 |= next.requiresSignIn();
            z3 |= next.providesSignIn();
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: w */
    static String m29576w(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ void m29578y(C7217a1 a1Var) {
        a1Var.f28938b.lock();
        try {
            if (a1Var.f28945i) {
                a1Var.m29573D();
            }
        } finally {
            a1Var.f28938b.unlock();
        }
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ void m29579z(C7217a1 a1Var) {
        a1Var.f28938b.lock();
        try {
            if (a1Var.mo29810A()) {
                a1Var.m29573D();
            }
        } finally {
            a1Var.f28938b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    @GuardedBy("mLock")
    /* renamed from: A */
    public final boolean mo29810A() {
        if (!this.f28945i) {
            return false;
        }
        this.f28945i = false;
        this.f28948l.removeMessages(2);
        this.f28948l.removeMessages(1);
        zabx zabx = this.f28950n;
        if (zabx != null) {
            zabx.mo29960b();
            this.f28950n = null;
        }
        return true;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo29811a(Bundle bundle) {
        while (!this.f28944h.isEmpty()) {
            mo17960i(this.f28944h.remove());
        }
        this.f28939c.mo17997d(bundle);
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final void mo29812b(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f28945i) {
                this.f28945i = true;
                if (this.f28950n == null && !C6482d.m28249a()) {
                    try {
                        this.f28950n = this.f28949m.mo29717v(this.f28942f.getApplicationContext(), new C7337z0(this));
                    } catch (SecurityException unused) {
                    }
                }
                C7333y0 y0Var = this.f28948l;
                y0Var.sendMessageDelayed(y0Var.obtainMessage(1), this.f28946j);
                C7333y0 y0Var2 = this.f28948l;
                y0Var2.sendMessageDelayed(y0Var2.obtainMessage(2), this.f28947k);
            }
            i = 1;
        }
        for (BasePendingResult f : (BasePendingResult[]) this.f28960x.f29151a.toArray(new BasePendingResult[0])) {
            f.mo29788f(C7318u2.f29150c);
        }
        this.f28939c.mo17998e(i);
        this.f28939c.mo17994a();
        if (i == 2) {
            m29573D();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo29813c(ConnectionResult connectionResult) {
        if (!this.f28949m.mo29976k(this.f28942f, connectionResult.mo29682C0())) {
            mo29810A();
        }
        if (!this.f28945i) {
            this.f28939c.mo17996c(connectionResult);
            this.f28939c.mo17994a();
        }
    }

    /* renamed from: d */
    public final ConnectionResult mo29768d() {
        boolean z = true;
        C4604n.m20102o(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f28938b.lock();
        try {
            if (this.f28941e >= 0) {
                if (this.f28958v == null) {
                    z = false;
                }
                C4604n.m20102o(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f28958v;
                if (num == null) {
                    this.f28958v = Integer.valueOf(m29574t(this.f28951o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            m29571B(((Integer) C4604n.m20098k(this.f28958v)).intValue());
            this.f28939c.mo17995b();
            return ((C7322v1) C4604n.m20098k(this.f28940d)).mo17908b();
        } finally {
            this.f28938b.unlock();
        }
    }

    /* renamed from: e */
    public final C7210g<Status> mo29769e() {
        C4604n.m20102o(mo29814s(), "GoogleApiClient is not connected yet.");
        Integer num = this.f28958v;
        boolean z = true;
        if (num != null && num.intValue() == 2) {
            z = false;
        }
        C4604n.m20102o(z, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C7305s sVar = new C7305s(this);
        if (this.f28951o.containsKey(C11067a.f50012a)) {
            m29572C(this, sVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C7321v0 v0Var = new C7321v0(this, atomicReference, sVar);
            C7325w0 w0Var = new C7325w0(this, sVar);
            C7206f.C7207a aVar = new C7206f.C7207a(this.f28942f);
            aVar.mo29777a(C11067a.f50013b);
            aVar.mo29779c(v0Var);
            aVar.mo29780d(w0Var);
            aVar.mo29782f(this.f28948l);
            C7206f e = aVar.mo29781e();
            atomicReference.set(e);
            e.mo29770f();
        }
        return sVar;
    }

    /* renamed from: f */
    public final void mo29770f() {
        this.f28938b.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.f28941e >= 0) {
                C4604n.m20102o(this.f28958v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f28958v;
                if (num == null) {
                    this.f28958v = Integer.valueOf(m29574t(this.f28951o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) C4604n.m20098k(this.f28958v)).intValue();
            this.f28938b.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Illegal sign-in mode: ");
                sb.append(i);
                C4604n.m20089b(z, sb.toString());
                m29571B(i);
                m29573D();
            }
            z = true;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i);
            C4604n.m20089b(z, sb2.toString());
            m29571B(i);
            m29573D();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f28938b.unlock();
        }
    }

    /* renamed from: g */
    public final void mo29771g() {
        Lock lock;
        this.f28938b.lock();
        try {
            this.f28960x.mo29947b();
            C7322v1 v1Var = this.f28940d;
            if (v1Var != null) {
                v1Var.mo17914h();
            }
            this.f28956t.mo29884b();
            for (C7231d dVar : this.f28944h) {
                dVar.mo29794p((C7313t2) null);
                dVar.mo29785c();
            }
            this.f28944h.clear();
            if (this.f28940d == null) {
                lock = this.f28938b;
            } else {
                mo29810A();
                this.f28939c.mo17994a();
                lock = this.f28938b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f28938b.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    public final void mo29772h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f28942f);
        printWriter.append(str).append("mResuming=").print(this.f28945i);
        printWriter.append(" mWorkQueue.size()=").print(this.f28944h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f28960x.f29151a.size());
        C7322v1 v1Var = this.f28940d;
        if (v1Var != null) {
            v1Var.mo17916j(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: i */
    public final <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T mo17960i(T t) {
        Lock lock;
        C7191a<?> r = t.mo29844r();
        boolean containsKey = this.f28951o.containsKey(t.mo29845s());
        String d = r != null ? r.mo29744d() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d);
        sb.append(" required for this call.");
        C4604n.m20089b(containsKey, sb.toString());
        this.f28938b.lock();
        try {
            C7322v1 v1Var = this.f28940d;
            if (v1Var != null) {
                if (this.f28945i) {
                    this.f28944h.add(t);
                    while (!this.f28944h.isEmpty()) {
                        C7231d remove = this.f28944h.remove();
                        this.f28960x.mo29946a(remove);
                        remove.mo29848w(Status.f28884i);
                    }
                    lock = this.f28938b;
                } else {
                    t = v1Var.mo17911e(t);
                    lock = this.f28938b;
                }
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f28938b.unlock();
            throw th;
        }
    }

    /* renamed from: k */
    public final Context mo17961k() {
        return this.f28942f;
    }

    /* renamed from: l */
    public final Looper mo17962l() {
        return this.f28943g;
    }

    /* renamed from: m */
    public final boolean mo29773m(C7296q qVar) {
        C7322v1 v1Var = this.f28940d;
        return v1Var != null && v1Var.mo17915i(qVar);
    }

    /* renamed from: n */
    public final void mo29774n() {
        C7322v1 v1Var = this.f28940d;
        if (v1Var != null) {
            v1Var.mo17913g();
        }
    }

    /* renamed from: o */
    public final void mo29775o(C7206f.C7209c cVar) {
        this.f28939c.mo18000g(cVar);
    }

    /* renamed from: p */
    public final void mo29776p(C7206f.C7209c cVar) {
        this.f28939c.mo18001h(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17963q(com.google.android.gms.common.api.internal.C7308s2 r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f28938b
            r0.lock()
            java.util.Set<com.google.android.gms.common.api.internal.s2> r0 = r2.f28959w     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L_0x0016
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0016:
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x0027
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0027:
            java.util.concurrent.locks.Lock r3 = r2.f28938b     // Catch:{ all -> 0x0057 }
            r3.lock()     // Catch:{ all -> 0x0057 }
            java.util.Set<com.google.android.gms.common.api.internal.s2> r3 = r2.f28959w     // Catch:{ all -> 0x0050 }
            if (r3 != 0) goto L_0x0036
            java.util.concurrent.locks.Lock r3 = r2.f28938b     // Catch:{ all -> 0x0057 }
            r3.unlock()     // Catch:{ all -> 0x0057 }
            goto L_0x0043
        L_0x0036:
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0050 }
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.f28938b     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x004a
        L_0x0043:
            com.google.android.gms.common.api.internal.v1 r3 = r2.f28940d     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x004a
            r3.mo17912f()     // Catch:{ all -> 0x0057 }
        L_0x004a:
            java.util.concurrent.locks.Lock r3 = r2.f28938b
            r3.unlock()
            return
        L_0x0050:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f28938b     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            throw r3     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f28938b
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C7217a1.mo17963q(com.google.android.gms.common.api.internal.s2):void");
    }

    /* renamed from: s */
    public final boolean mo29814s() {
        C7322v1 v1Var = this.f28940d;
        return v1Var != null && v1Var.mo17910d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final String mo29815v() {
        StringWriter stringWriter = new StringWriter();
        mo29772h("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }
}
