package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p263x5.C11095a;
import p263x5.C11100f;

/* renamed from: com.google.android.gms.common.api.internal.e1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4594e1 implements C7322v1, C7275l3 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f19975b;

    /* renamed from: c */
    private final Condition f19976c;

    /* renamed from: d */
    private final Context f19977d;

    /* renamed from: e */
    private final C7353b f19978e;

    /* renamed from: f */
    private final C7233d1 f19979f;

    /* renamed from: g */
    final Map<C7191a.C7194c<?>, C7191a.C7201f> f19980g;

    /* renamed from: h */
    final Map<C7191a.C7194c<?>, ConnectionResult> f19981h = new HashMap();

    /* renamed from: i */
    final C4601e f19982i;

    /* renamed from: j */
    final Map<C7191a<?>, Boolean> f19983j;

    /* renamed from: k */
    final C7191a.C7192a<? extends C11100f, C11095a> f19984k;
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: l */
    public volatile C7222b1 f19985l;

    /* renamed from: m */
    private ConnectionResult f19986m = null;

    /* renamed from: n */
    int f19987n;

    /* renamed from: o */
    final C7217a1 f19988o;

    /* renamed from: p */
    final C7312t1 f19989p;

    public C4594e1(Context context, C7217a1 a1Var, Lock lock, Looper looper, C7353b bVar, Map<C7191a.C7194c<?>, C7191a.C7201f> map, C4601e eVar, Map<C7191a<?>, Boolean> map2, C7191a.C7192a<? extends C11100f, C11095a> aVar, ArrayList<C7270k3> arrayList, C7312t1 t1Var) {
        this.f19977d = context;
        this.f19975b = lock;
        this.f19978e = bVar;
        this.f19980g = map;
        this.f19982i = eVar;
        this.f19983j = map2;
        this.f19984k = aVar;
        this.f19988o = a1Var;
        this.f19989p = t1Var;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo29888a(this);
        }
        this.f19979f = new C7233d1(this, looper);
        this.f19976c = lock.newCondition();
        this.f19985l = new C4598t0(this);
    }

    @GuardedBy("mLock")
    /* renamed from: b */
    public final ConnectionResult mo17908b() {
        mo17909c();
        while (this.f19985l instanceof C7306s0) {
            try {
                this.f19976c.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            }
        }
        if (this.f19985l instanceof C7241f0) {
            return ConnectionResult.f28862f;
        }
        ConnectionResult connectionResult = this.f19986m;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo17909c() {
        this.f19985l.mo17965b();
    }

    /* renamed from: d */
    public final boolean mo17910d() {
        return this.f19985l instanceof C7241f0;
    }

    @GuardedBy("mLock")
    /* renamed from: e */
    public final <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T mo17911e(T t) {
        t.mo29792m();
        return this.f19985l.mo17970g(t);
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    public final void mo17912f() {
        if (this.f19985l instanceof C7241f0) {
            ((C7241f0) this.f19985l).mo29855i();
        }
    }

    /* renamed from: g */
    public final void mo17913g() {
    }

    @GuardedBy("mLock")
    /* renamed from: h */
    public final void mo17914h() {
        if (this.f19985l.mo17969f()) {
            this.f19981h.clear();
        }
    }

    /* renamed from: i */
    public final boolean mo17915i(C7296q qVar) {
        return false;
    }

    /* renamed from: j */
    public final void mo17916j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f19985l);
        for (C7191a next : this.f19983j.keySet()) {
            printWriter.append(str).append(next.mo29744d()).println(":");
            ((C7191a.C7201f) C4604n.m20098k(this.f19980g.get(next.mo29742b()))).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo17917l() {
        this.f19975b.lock();
        try {
            this.f19988o.mo29810A();
            this.f19985l = new C7241f0(this);
            this.f19985l.mo17968e();
            this.f19976c.signalAll();
        } finally {
            this.f19975b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo17918m() {
        this.f19975b.lock();
        try {
            this.f19985l = new C7306s0(this, this.f19982i, this.f19983j, this.f19978e, this.f19984k, this.f19975b, this.f19977d);
            this.f19985l.mo17968e();
            this.f19976c.signalAll();
        } finally {
            this.f19975b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo17919n(ConnectionResult connectionResult) {
        this.f19975b.lock();
        try {
            this.f19986m = connectionResult;
            this.f19985l = new C4598t0(this);
            this.f19985l.mo17968e();
            this.f19976c.signalAll();
        } finally {
            this.f19975b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo17920o(C7228c1 c1Var) {
        this.f19979f.sendMessage(this.f19979f.obtainMessage(1, c1Var));
    }

    public final void onConnected(Bundle bundle) {
        this.f19975b.lock();
        try {
            this.f19985l.mo17964a(bundle);
        } finally {
            this.f19975b.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
        this.f19975b.lock();
        try {
            this.f19985l.mo17967d(i);
        } finally {
            this.f19975b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo17923p(RuntimeException runtimeException) {
        this.f19979f.sendMessage(this.f19979f.obtainMessage(2, runtimeException));
    }

    /* renamed from: x */
    public final void mo17924x(ConnectionResult connectionResult, C7191a<?> aVar, boolean z) {
        this.f19975b.lock();
        try {
            this.f19985l.mo17966c(connectionResult, aVar, z);
        } finally {
            this.f19975b.unlock();
        }
    }
}
