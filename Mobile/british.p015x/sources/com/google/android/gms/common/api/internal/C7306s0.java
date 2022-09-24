package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7395i;
import com.google.android.gms.common.internal.C7439x;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p264x5.C11095a;
import p264x5.C11100f;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7306s0 implements C7222b1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4594e1 f29106a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f29107b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f29108c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7353b f29109d;

    /* renamed from: e */
    private ConnectionResult f29110e;

    /* renamed from: f */
    private int f29111f;

    /* renamed from: g */
    private int f29112g = 0;

    /* renamed from: h */
    private int f29113h;

    /* renamed from: i */
    private final Bundle f29114i = new Bundle();

    /* renamed from: j */
    private final Set<C7191a.C7194c> f29115j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C11100f f29116k;

    /* renamed from: l */
    private boolean f29117l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f29118m;

    /* renamed from: n */
    private boolean f29119n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C7395i f29120o;

    /* renamed from: p */
    private boolean f29121p;

    /* renamed from: q */
    private boolean f29122q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C4601e f29123r;

    /* renamed from: s */
    private final Map<C7191a<?>, Boolean> f29124s;

    /* renamed from: t */
    private final C7191a.C7192a<? extends C11100f, C11095a> f29125t;

    /* renamed from: u */
    private final ArrayList<Future<?>> f29126u = new ArrayList<>();

    public C7306s0(C4594e1 e1Var, C4601e eVar, Map<C7191a<?>, Boolean> map, C7353b bVar, C7191a.C7192a<? extends C11100f, C11095a> aVar, Lock lock, Context context) {
        this.f29106a = e1Var;
        this.f29123r = eVar;
        this.f29124s = map;
        this.f29109d = bVar;
        this.f29125t = aVar;
        this.f29107b = lock;
        this.f29108c = context;
    }

    /* renamed from: A */
    static /* bridge */ /* synthetic */ void m29749A(C7306s0 s0Var, zak zak) {
        if (s0Var.m29764n(0)) {
            ConnectionResult C0 = zak.mo39397C0();
            if (C0.mo29686G0()) {
                zav zav = (zav) C4604n.m20098k(zak.mo39398D0());
                ConnectionResult C02 = zav.mo30179C0();
                if (!C02.mo29686G0()) {
                    String valueOf = String.valueOf(C02);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    s0Var.m29761k(C02);
                    return;
                }
                s0Var.f29119n = true;
                s0Var.f29120o = (C7395i) C4604n.m20098k(zav.mo30180D0());
                s0Var.f29121p = zav.mo30181E0();
                s0Var.f29122q = zav.mo30182F0();
                s0Var.m29763m();
            } else if (s0Var.m29766p(C0)) {
                s0Var.m29758h();
                s0Var.m29763m();
            } else {
                s0Var.m29761k(C0);
            }
        }
    }

    /* renamed from: I */
    private final void m29757I() {
        ArrayList<Future<?>> arrayList = this.f29126u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        this.f29126u.clear();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: h */
    public final void m29758h() {
        this.f29118m = false;
        this.f29106a.f19988o.f28952p = Collections.emptySet();
        for (C7191a.C7194c next : this.f29115j) {
            if (!this.f29106a.f19981h.containsKey(next)) {
                this.f29106a.f19981h.put(next, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    private final void m29759i(boolean z) {
        C11100f fVar = this.f29116k;
        if (fVar != null) {
            if (fVar.isConnected() && z) {
                fVar.mo39384d();
            }
            fVar.disconnect();
            C4601e eVar = (C4601e) C4604n.m20098k(this.f29123r);
            this.f29120o = null;
        }
    }

    @GuardedBy("mLock")
    /* renamed from: j */
    private final void m29760j() {
        Bundle bundle;
        this.f29106a.mo17917l();
        C7242f1.m29658a().execute(new C7245g0(this));
        C11100f fVar = this.f29116k;
        if (fVar != null) {
            if (this.f29121p) {
                fVar.mo39383c((C7395i) C4604n.m20098k(this.f29120o), this.f29122q);
            }
            m29759i(false);
        }
        for (C7191a.C7194c<?> cVar : this.f29106a.f19981h.keySet()) {
            ((C7191a.C7201f) C4604n.m20098k(this.f29106a.f19980g.get(cVar))).disconnect();
        }
        if (this.f29114i.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f29114i;
        }
        this.f29106a.f19989p.mo29811a(bundle);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: k */
    public final void m29761k(ConnectionResult connectionResult) {
        m29757I();
        m29759i(!connectionResult.mo29685F0());
        this.f29106a.mo17919n(connectionResult);
        this.f29106a.f19989p.mo29813c(connectionResult);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: l */
    public final void m29762l(ConnectionResult connectionResult, C7191a<?> aVar, boolean z) {
        int priority = aVar.mo29743c().getPriority();
        if ((!z || connectionResult.mo29685F0() || this.f29109d.mo29974c(connectionResult.mo29682C0()) != null) && (this.f29110e == null || priority < this.f29111f)) {
            this.f29110e = connectionResult;
            this.f29111f = priority;
        }
        this.f29106a.f19981h.put(aVar.mo29742b(), connectionResult);
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: m */
    public final void m29763m() {
        if (this.f29113h == 0) {
            if (!this.f29118m || this.f29119n) {
                ArrayList arrayList = new ArrayList();
                this.f29112g = 1;
                this.f29113h = this.f29106a.f19980g.size();
                for (C7191a.C7194c next : this.f29106a.f19980g.keySet()) {
                    if (!this.f29106a.f19981h.containsKey(next)) {
                        arrayList.add(this.f29106a.f19980g.get(next));
                    } else if (m29765o()) {
                        m29760j();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f29126u.add(C7242f1.m29658a().submit(new C7272l0(this, arrayList)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: n */
    public final boolean m29764n(int i) {
        if (this.f29112g == i) {
            return true;
        }
        Log.w("GACConnecting", this.f29106a.f19988o.mo29815v());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.f29113h;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i2);
        Log.w("GACConnecting", sb.toString());
        String q = m29767q(this.f29112g);
        String q2 = m29767q(i);
        StringBuilder sb2 = new StringBuilder(q.length() + 70 + q2.length());
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(q);
        sb2.append(" but received callback for step ");
        sb2.append(q2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        m29761k(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: o */
    public final boolean m29765o() {
        int i = this.f29113h - 1;
        this.f29113h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.f29106a.f19988o.mo29815v());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m29761k(new ConnectionResult(8, (PendingIntent) null));
            return false;
        }
        ConnectionResult connectionResult = this.f29110e;
        if (connectionResult == null) {
            return true;
        }
        this.f29106a.f19987n = this.f29111f;
        m29761k(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    /* renamed from: p */
    public final boolean m29766p(ConnectionResult connectionResult) {
        return this.f29117l && !connectionResult.mo29685F0();
    }

    /* renamed from: q */
    private static final String m29767q(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* renamed from: x */
    static /* bridge */ /* synthetic */ Set m29774x(C7306s0 s0Var) {
        C4601e eVar = s0Var.f29123r;
        if (eVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(eVar.mo17983g());
        Map<C7191a<?>, C7439x> k = s0Var.f29123r.mo17987k();
        for (C7191a next : k.keySet()) {
            if (!s0Var.f29106a.f19981h.containsKey(next.mo29742b())) {
                hashSet.addAll(k.get(next).f29368a);
            }
        }
        return hashSet;
    }

    @GuardedBy("mLock")
    /* renamed from: a */
    public final void mo17964a(Bundle bundle) {
        if (m29764n(1)) {
            if (bundle != null) {
                this.f29114i.putAll(bundle);
            }
            if (m29765o()) {
                m29760j();
            }
        }
    }

    /* renamed from: b */
    public final void mo17965b() {
    }

    @GuardedBy("mLock")
    /* renamed from: c */
    public final void mo17966c(ConnectionResult connectionResult, C7191a<?> aVar, boolean z) {
        if (m29764n(1)) {
            m29762l(connectionResult, aVar, z);
            if (m29765o()) {
                m29760j();
            }
        }
    }

    @GuardedBy("mLock")
    /* renamed from: d */
    public final void mo17967d(int i) {
        m29761k(new ConnectionResult(8, (PendingIntent) null));
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [com.google.android.gms.common.api.a$f, x5.f] */
    @GuardedBy("mLock")
    /* renamed from: e */
    public final void mo17968e() {
        this.f29106a.f19981h.clear();
        this.f29118m = false;
        this.f29110e = null;
        this.f29112g = 0;
        this.f29117l = true;
        this.f29119n = false;
        this.f29121p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C7191a next : this.f29124s.keySet()) {
            C7191a.C7201f fVar = (C7191a.C7201f) C4604n.m20098k(this.f29106a.f19980g.get(next.mo29742b()));
            z |= next.mo29743c().getPriority() == 1;
            boolean booleanValue = this.f29124s.get(next).booleanValue();
            if (fVar.requiresSignIn()) {
                this.f29118m = true;
                if (booleanValue) {
                    this.f29115j.add(next.mo29742b());
                } else {
                    this.f29117l = false;
                }
            }
            hashMap.put(fVar, new C7250h0(this, next, booleanValue));
        }
        if (z) {
            this.f29118m = false;
        }
        if (this.f29118m) {
            C4604n.m20098k(this.f29123r);
            C4604n.m20098k(this.f29125t);
            this.f29123r.mo17988l(Integer.valueOf(System.identityHashCode(this.f29106a.f19988o)));
            C7292p0 p0Var = new C7292p0(this, (C7287o0) null);
            C7191a.C7192a aVar = this.f29125t;
            Context context = this.f29108c;
            Looper l = this.f29106a.f19988o.mo17962l();
            C4601e eVar = this.f29123r;
            this.f29116k = aVar.buildClient(context, l, eVar, eVar.mo17984h(), (C7206f.C7208b) p0Var, (C7206f.C7209c) p0Var);
        }
        this.f29113h = this.f29106a.f19980g.size();
        this.f29126u.add(C7242f1.m29658a().submit(new C7267k0(this, hashMap)));
    }

    @GuardedBy("mLock")
    /* renamed from: f */
    public final boolean mo17969f() {
        m29757I();
        m29759i(true);
        this.f29106a.mo17919n((ConnectionResult) null);
        return true;
    }

    /* renamed from: g */
    public final <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T mo17970g(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
