package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p149t.C6077a;
import p228l5.C10718f;
import p228l5.C10723k;
import p263x5.C11095a;
import p263x5.C11100f;

/* renamed from: com.google.android.gms.common.api.internal.w */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7324w implements C7322v1 {

    /* renamed from: b */
    private final Context f29162b;

    /* renamed from: c */
    private final C7217a1 f29163c;

    /* renamed from: d */
    private final Looper f29164d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4594e1 f29165e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4594e1 f29166f;

    /* renamed from: g */
    private final Map<C7191a.C7194c<?>, C4594e1> f29167g;

    /* renamed from: h */
    private final Set<C7296q> f29168h = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    private final C7191a.C7201f f29169i;

    /* renamed from: j */
    private Bundle f29170j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ConnectionResult f29171k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ConnectionResult f29172l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f29173m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Lock f29174n;
    @GuardedBy("mLock")

    /* renamed from: o */
    private int f29175o = 0;

    private C7324w(Context context, C7217a1 a1Var, Lock lock, Looper looper, C7353b bVar, Map<C7191a.C7194c<?>, C7191a.C7201f> map, Map<C7191a.C7194c<?>, C7191a.C7201f> map2, C4601e eVar, C7191a.C7192a<? extends C11100f, C11095a> aVar, C7191a.C7201f fVar, ArrayList<C7270k3> arrayList, ArrayList<C7270k3> arrayList2, Map<C7191a<?>, Boolean> map3, Map<C7191a<?>, Boolean> map4) {
        this.f29162b = context;
        this.f29163c = a1Var;
        this.f29174n = lock;
        this.f29164d = looper;
        this.f29169i = fVar;
        Context context2 = context;
        C7217a1 a1Var2 = a1Var;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C7353b bVar2 = bVar;
        C4594e1 e1Var = r3;
        C4594e1 e1Var2 = new C4594e1(context2, a1Var2, lock2, looper2, bVar2, map2, (C4601e) null, map4, (C7191a.C7192a<? extends C11100f, C11095a>) null, arrayList2, new C7290o3(this, (C7284n3) null));
        this.f29165e = e1Var;
        this.f29166f = new C4594e1(context2, a1Var2, lock2, looper2, bVar2, map, eVar, map3, aVar, arrayList, new C7300q3(this, (C7295p3) null));
        C6077a aVar2 = new C6077a();
        for (C7191a.C7194c<?> put : map2.keySet()) {
            aVar2.put(put, this.f29165e);
        }
        for (C7191a.C7194c<?> put2 : map.keySet()) {
            aVar2.put(put2, this.f29166f);
        }
        this.f29167g = Collections.unmodifiableMap(aVar2);
    }

    /* renamed from: B */
    private final PendingIntent m29850B() {
        if (this.f29169i == null) {
            return null;
        }
        return C10718f.m48550a(this.f29162b, System.identityHashCode(this.f29163c), this.f29169i.getSignInIntent(), C10718f.f49345a | 134217728);
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    private final void m29851a(ConnectionResult connectionResult) {
        int i = this.f29175o;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f29175o = 0;
            }
            this.f29163c.mo29813c(connectionResult);
        }
        m29852k();
        this.f29175o = 0;
    }

    @GuardedBy("mLock")
    /* renamed from: k */
    private final void m29852k() {
        for (C7296q a : this.f29168h) {
            a.mo29918a();
        }
        this.f29168h.clear();
    }

    @GuardedBy("mLock")
    /* renamed from: l */
    private final boolean m29853l() {
        ConnectionResult connectionResult = this.f29172l;
        return connectionResult != null && connectionResult.mo29682C0() == 4;
    }

    /* renamed from: m */
    private final boolean m29854m(C7231d<? extends C7341k, ? extends C7191a.C7193b> dVar) {
        C4594e1 e1Var = this.f29167g.get(dVar.mo29845s());
        C4604n.m20099l(e1Var, "GoogleApiClient is not configured to use the API required for this call.");
        return e1Var.equals(this.f29166f);
    }

    /* renamed from: n */
    private static boolean m29855n(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo29686G0();
    }

    /* renamed from: p */
    public static C7324w m29857p(Context context, C7217a1 a1Var, Lock lock, Looper looper, C7353b bVar, Map<C7191a.C7194c<?>, C7191a.C7201f> map, C4601e eVar, Map<C7191a<?>, Boolean> map2, C7191a.C7192a<? extends C11100f, C11095a> aVar, ArrayList<C7270k3> arrayList) {
        Map<C7191a<?>, Boolean> map3 = map2;
        C6077a aVar2 = new C6077a();
        C6077a aVar3 = new C6077a();
        C7191a.C7201f fVar = null;
        for (Map.Entry next : map.entrySet()) {
            C7191a.C7201f fVar2 = (C7191a.C7201f) next.getValue();
            if (true == fVar2.providesSignIn()) {
                fVar = fVar2;
            }
            if (fVar2.requiresSignIn()) {
                aVar2.put((C7191a.C7194c) next.getKey(), fVar2);
            } else {
                aVar3.put((C7191a.C7194c) next.getKey(), fVar2);
            }
        }
        C4604n.m20102o(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C6077a aVar4 = new C6077a();
        C6077a aVar5 = new C6077a();
        for (C7191a next2 : map2.keySet()) {
            C7191a.C7194c<?> b = next2.mo29742b();
            if (aVar2.containsKey(b)) {
                aVar4.put(next2, map3.get(next2));
            } else if (aVar3.containsKey(b)) {
                aVar5.put(next2, map3.get(next2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7270k3 k3Var = arrayList.get(i);
            if (aVar4.containsKey(k3Var.f29041b)) {
                arrayList2.add(k3Var);
            } else if (aVar5.containsKey(k3Var.f29041b)) {
                arrayList3.add(k3Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C7324w(context, a1Var, lock, looper, bVar, aVar2, aVar3, eVar, aVar, fVar, arrayList2, arrayList3, aVar4, aVar5);
    }

    /* renamed from: w */
    static /* bridge */ /* synthetic */ void m29864w(C7324w wVar, int i, boolean z) {
        wVar.f29163c.mo29812b(i, z);
        wVar.f29172l = null;
        wVar.f29171k = null;
    }

    /* renamed from: x */
    static /* bridge */ /* synthetic */ void m29865x(C7324w wVar, Bundle bundle) {
        Bundle bundle2 = wVar.f29170j;
        if (bundle2 == null) {
            wVar.f29170j = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ void m29866y(C7324w wVar) {
        ConnectionResult connectionResult;
        if (m29855n(wVar.f29171k)) {
            if (m29855n(wVar.f29172l) || wVar.m29853l()) {
                int i = wVar.f29175o;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        wVar.f29175o = 0;
                        return;
                    }
                    ((C7217a1) C4604n.m20098k(wVar.f29163c)).mo29811a(wVar.f29170j);
                }
                wVar.m29852k();
                wVar.f29175o = 0;
                return;
            }
            ConnectionResult connectionResult2 = wVar.f29172l;
            if (connectionResult2 == null) {
                return;
            }
            if (wVar.f29175o == 1) {
                wVar.m29852k();
                return;
            }
            wVar.m29851a(connectionResult2);
            wVar.f29165e.mo17914h();
        } else if (wVar.f29171k == null || !m29855n(wVar.f29172l)) {
            ConnectionResult connectionResult3 = wVar.f29171k;
            if (connectionResult3 != null && (connectionResult = wVar.f29172l) != null) {
                if (wVar.f29166f.f19987n < wVar.f29165e.f19987n) {
                    connectionResult3 = connectionResult;
                }
                wVar.m29851a(connectionResult3);
            }
        } else {
            wVar.f29166f.mo17914h();
            wVar.m29851a((ConnectionResult) C4604n.m20098k(wVar.f29171k));
        }
    }

    /* renamed from: A */
    public final boolean mo29950A() {
        this.f29174n.lock();
        try {
            return this.f29175o == 2;
        } finally {
            this.f29174n.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final ConnectionResult mo17908b() {
        throw new UnsupportedOperationException();
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo17909c() {
        this.f29175o = 2;
        this.f29173m = false;
        this.f29172l = null;
        this.f29171k = null;
        this.f29165e.mo17909c();
        this.f29166f.mo17909c();
    }

    /* renamed from: d */
    public final boolean mo17910d() {
        this.f29174n.lock();
        try {
            boolean z = false;
            if (this.f29165e.mo17910d() && (this.f29166f.mo17910d() || m29853l() || this.f29175o == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.f29174n.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: e */
    public final <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T mo17911e(T t) {
        if (!m29854m(t)) {
            return this.f29165e.mo17911e(t);
        }
        if (!m29853l()) {
            return this.f29166f.mo17911e(t);
        }
        t.mo29848w(new Status(4, (String) null, m29850B()));
        return t;
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    public final void mo17912f() {
        this.f29165e.mo17912f();
        this.f29166f.mo17912f();
    }

    /* renamed from: g */
    public final void mo17913g() {
        this.f29174n.lock();
        try {
            boolean A = mo29950A();
            this.f29166f.mo17914h();
            this.f29172l = new ConnectionResult(4);
            if (A) {
                new C10723k(this.f29164d).post(new C7279m3(this));
            } else {
                m29852k();
            }
        } finally {
            this.f29174n.unlock();
        }
    }

    @GuardedBy("mLock")
    /* renamed from: h */
    public final void mo17914h() {
        this.f29172l = null;
        this.f29171k = null;
        this.f29175o = 0;
        this.f29165e.mo17914h();
        this.f29166f.mo17914h();
        m29852k();
    }

    /* renamed from: i */
    public final boolean mo17915i(C7296q qVar) {
        this.f29174n.lock();
        try {
            if ((mo29950A() || mo17910d()) && !this.f29166f.mo17910d()) {
                this.f29168h.add(qVar);
                if (this.f29175o == 0) {
                    this.f29175o = 1;
                }
                this.f29172l = null;
                this.f29166f.mo17909c();
                return true;
            }
            this.f29174n.unlock();
            return false;
        } finally {
            this.f29174n.unlock();
        }
    }

    /* renamed from: j */
    public final void mo17916j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f29166f.mo17916j(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f29165e.mo17916j(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
