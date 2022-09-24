package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7191a.C7195d;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.C7346p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7259j;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p006a5.C6480b;
import p149t.C6077a;
import p259w4.C11083q;

/* renamed from: com.google.android.gms.common.api.internal.m1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4596m1<O extends C7191a.C7195d> implements C7206f.C7208b, C7206f.C7209c, C7275l3 {

    /* renamed from: b */
    private final Queue<C7339z2> f20011b = new LinkedList();
    /* access modifiers changed from: private */
    @NotOnlyInitialized

    /* renamed from: c */
    public final C7191a.C7201f f20012c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7220b<O> f20013d;

    /* renamed from: e */
    private final C7336z f20014e;

    /* renamed from: f */
    private final Set<C7230c3> f20015f = new HashSet();

    /* renamed from: g */
    private final Map<C7259j.C7260a<?>, C7229c2> f20016g = new HashMap();

    /* renamed from: h */
    private final int f20017h;

    /* renamed from: i */
    private final C7278m2 f20018i;

    /* renamed from: j */
    private boolean f20019j;

    /* renamed from: k */
    private final List<C7288o1> f20020k = new ArrayList();

    /* renamed from: l */
    private ConnectionResult f20021l = null;

    /* renamed from: m */
    private int f20022m = 0;

    /* renamed from: n */
    final /* synthetic */ C4595g f20023n;

    public C4596m1(C4595g gVar, C4591e<O> eVar) {
        this.f20023n = gVar;
        C7191a.C7201f zab = eVar.zab(gVar.f20009q.getLooper(), this);
        this.f20012c = zab;
        this.f20013d = eVar.getApiKey();
        this.f20014e = new C7336z();
        this.f20017h = eVar.zaa();
        if (zab.requiresSignIn()) {
            this.f20018i = eVar.zac(gVar.f20000h, gVar.f20009q);
        } else {
            this.f20018i = null;
        }
    }

    /* renamed from: A */
    static /* bridge */ /* synthetic */ void m20000A(C4596m1 m1Var, C7288o1 o1Var) {
        Feature[] g;
        if (m1Var.f20020k.remove(o1Var)) {
            m1Var.f20023n.f20009q.removeMessages(15, o1Var);
            m1Var.f20023n.f20009q.removeMessages(16, o1Var);
            Feature a = o1Var.f29087b;
            ArrayList arrayList = new ArrayList(m1Var.f20011b.size());
            for (C7339z2 z2Var : m1Var.f20011b) {
                if ((z2Var instanceof C7317u1) && (g = ((C7317u1) z2Var).mo29945g(m1Var)) != null && C6480b.m28238c(g, a)) {
                    arrayList.add(z2Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C7339z2 z2Var2 = (C7339z2) arrayList.get(i);
                m1Var.f20011b.remove(z2Var2);
                z2Var2.mo29921b(new C7346p(a));
            }
        }
    }

    /* renamed from: b */
    private final Feature m20002b(Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] availableFeatures = this.f20012c.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            C6077a aVar = new C6077a(r3);
            for (Feature feature : availableFeatures) {
                aVar.put(feature.mo29691C0(), Long.valueOf(feature.mo29692D0()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) aVar.get(feature2.mo29691C0());
                if (l == null || l.longValue() < feature2.mo29692D0()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private final void m20003c(ConnectionResult connectionResult) {
        for (C7230c3 b : this.f20015f) {
            b.mo29841b(this.f20013d, connectionResult, C7408m.m30028a(connectionResult, ConnectionResult.f28862f) ? this.f20012c.getEndpointPackageName() : null);
        }
        this.f20015f.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m20004d(Status status) {
        C4604n.m20091d(this.f20023n.f20009q);
        m20005e(status, (Exception) null, false);
    }

    /* renamed from: e */
    private final void m20005e(Status status, Exception exc, boolean z) {
        C4604n.m20091d(this.f20023n.f20009q);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.f20011b.iterator();
            while (it.hasNext()) {
                C7339z2 z2Var = (C7339z2) it.next();
                if (!z || z2Var.f29206a == 2) {
                    if (status != null) {
                        z2Var.mo29920a(status);
                    } else {
                        z2Var.mo29921b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: f */
    private final void m20006f() {
        ArrayList arrayList = new ArrayList(this.f20011b);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C7339z2 z2Var = (C7339z2) arrayList.get(i);
            if (this.f20012c.isConnected()) {
                if (m20012l(z2Var)) {
                    this.f20011b.remove(z2Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m20007g() {
        mo17941B();
        m20003c(ConnectionResult.f28862f);
        m20011k();
        Iterator<C7229c2> it = this.f20016g.values().iterator();
        while (it.hasNext()) {
            C7229c2 next = it.next();
            if (m20002b(next.f28985a.mo29903c()) != null) {
                it.remove();
            } else {
                try {
                    next.f28985a.mo29853d(this.f20012c, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f20012c.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m20006f();
        m20009i();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m20008h(int i) {
        mo17941B();
        this.f20019j = true;
        this.f20014e.mo29955e(i, this.f20012c.getLastDisconnectMessage());
        C4595g gVar = this.f20023n;
        gVar.f20009q.sendMessageDelayed(Message.obtain(gVar.f20009q, 9, this.f20013d), this.f20023n.f19994b);
        C4595g gVar2 = this.f20023n;
        gVar2.f20009q.sendMessageDelayed(Message.obtain(gVar2.f20009q, 11, this.f20013d), this.f20023n.f19995c);
        this.f20023n.f20002j.mo30100c();
        for (C7229c2 c2Var : this.f20016g.values()) {
            c2Var.f28987c.run();
        }
    }

    /* renamed from: i */
    private final void m20009i() {
        this.f20023n.f20009q.removeMessages(12, this.f20013d);
        C4595g gVar = this.f20023n;
        gVar.f20009q.sendMessageDelayed(gVar.f20009q.obtainMessage(12, this.f20013d), this.f20023n.f19996d);
    }

    /* renamed from: j */
    private final void m20010j(C7339z2 z2Var) {
        z2Var.mo29949d(this.f20014e, mo17952N());
        try {
            z2Var.mo29922c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f20012c.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: k */
    private final void m20011k() {
        if (this.f20019j) {
            this.f20023n.f20009q.removeMessages(11, this.f20013d);
            this.f20023n.f20009q.removeMessages(9, this.f20013d);
            this.f20019j = false;
        }
    }

    /* renamed from: l */
    private final boolean m20012l(C7339z2 z2Var) {
        if (!(z2Var instanceof C7317u1)) {
            m20010j(z2Var);
            return true;
        }
        C7317u1 u1Var = (C7317u1) z2Var;
        Feature b = m20002b(u1Var.mo29945g(this));
        if (b == null) {
            m20010j(z2Var);
            return true;
        }
        String name = this.f20012c.getClass().getName();
        String C0 = b.mo29691C0();
        long D0 = b.mo29692D0();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(C0).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(C0);
        sb.append(", ");
        sb.append(D0);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f20023n.f20010r || !u1Var.mo29944f(this)) {
            u1Var.mo29921b(new C7346p(b));
            return true;
        }
        C7288o1 o1Var = new C7288o1(this.f20013d, b, (C7282n1) null);
        int indexOf = this.f20020k.indexOf(o1Var);
        if (indexOf >= 0) {
            C7288o1 o1Var2 = this.f20020k.get(indexOf);
            this.f20023n.f20009q.removeMessages(15, o1Var2);
            C4595g gVar = this.f20023n;
            gVar.f20009q.sendMessageDelayed(Message.obtain(gVar.f20009q, 15, o1Var2), this.f20023n.f19994b);
            return false;
        }
        this.f20020k.add(o1Var);
        C4595g gVar2 = this.f20023n;
        gVar2.f20009q.sendMessageDelayed(Message.obtain(gVar2.f20009q, 15, o1Var), this.f20023n.f19994b);
        C4595g gVar3 = this.f20023n;
        gVar3.f20009q.sendMessageDelayed(Message.obtain(gVar3.f20009q, 16, o1Var), this.f20023n.f19995c);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (m20013m(connectionResult)) {
            return false;
        }
        this.f20023n.mo17937h(connectionResult, this.f20017h);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m20013m(com.google.android.gms.common.ConnectionResult r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C4595g.f19992u
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.g r1 = r3.f20023n     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.a0 r2 = r1.f20006n     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f20007o     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.b<O> r2 = r3.f20013d     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.g r1 = r3.f20023n     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.a0 r1 = r1.f20006n     // Catch:{ all -> 0x002a }
            int r2 = r3.f20017h     // Catch:{ all -> 0x002a }
            r1.mo29860h(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C4596m1.m20013m(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m20014n(boolean z) {
        C4604n.m20091d(this.f20023n.f20009q);
        if (!this.f20012c.isConnected() || this.f20016g.size() != 0) {
            return false;
        }
        if (this.f20014e.mo29957g()) {
            if (z) {
                m20009i();
            }
            return false;
        }
        this.f20012c.disconnect("Timing out service connection.");
        return true;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ void m20020z(C4596m1 m1Var, C7288o1 o1Var) {
        if (!m1Var.f20020k.contains(o1Var) || m1Var.f20019j) {
            return;
        }
        if (!m1Var.f20012c.isConnected()) {
            m1Var.mo17942C();
        } else {
            m1Var.m20006f();
        }
    }

    /* renamed from: B */
    public final void mo17941B() {
        C4604n.m20091d(this.f20023n.f20009q);
        this.f20021l = null;
    }

    /* renamed from: C */
    public final void mo17942C() {
        C4604n.m20091d(this.f20023n.f20009q);
        if (!this.f20012c.isConnected() && !this.f20012c.isConnecting()) {
            try {
                C4595g gVar = this.f20023n;
                int b = gVar.f20002j.mo30099b(gVar.f20000h, this.f20012c);
                if (b != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(b, (PendingIntent) null);
                    String name = this.f20012c.getClass().getName();
                    String obj = connectionResult.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    mo17945F(connectionResult, (Exception) null);
                    return;
                }
                C4595g gVar2 = this.f20023n;
                C7191a.C7201f fVar = this.f20012c;
                C7298q1 q1Var = new C7298q1(gVar2, fVar, this.f20013d);
                if (fVar.requiresSignIn()) {
                    ((C7278m2) C4604n.m20098k(this.f20018i)).mo29898n6(q1Var);
                }
                try {
                    this.f20012c.connect(q1Var);
                } catch (SecurityException e) {
                    mo17945F(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                mo17945F(new ConnectionResult(10), e2);
            }
        }
    }

    /* renamed from: D */
    public final void mo17943D(C7339z2 z2Var) {
        C4604n.m20091d(this.f20023n.f20009q);
        if (!this.f20012c.isConnected()) {
            this.f20011b.add(z2Var);
            ConnectionResult connectionResult = this.f20021l;
            if (connectionResult == null || !connectionResult.mo29685F0()) {
                mo17942C();
            } else {
                mo17945F(this.f20021l, (Exception) null);
            }
        } else if (m20012l(z2Var)) {
            m20009i();
        } else {
            this.f20011b.add(z2Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo17944E() {
        this.f20022m++;
    }

    /* renamed from: F */
    public final void mo17945F(ConnectionResult connectionResult, Exception exc) {
        C4604n.m20091d(this.f20023n.f20009q);
        C7278m2 m2Var = this.f20018i;
        if (m2Var != null) {
            m2Var.mo29899o6();
        }
        mo17941B();
        this.f20023n.f20002j.mo30100c();
        m20003c(connectionResult);
        if ((this.f20012c instanceof C11083q) && connectionResult.mo29682C0() != 24) {
            this.f20023n.f19997e = true;
            C4595g gVar = this.f20023n;
            gVar.f20009q.sendMessageDelayed(gVar.f20009q.obtainMessage(19), DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS);
        }
        if (connectionResult.mo29682C0() == 4) {
            m20004d(C4595g.f19991t);
        } else if (this.f20011b.isEmpty()) {
            this.f20021l = connectionResult;
        } else if (exc != null) {
            C4604n.m20091d(this.f20023n.f20009q);
            m20005e((Status) null, exc, false);
        } else if (this.f20023n.f20010r) {
            m20005e(C4595g.m19969i(this.f20013d, connectionResult), (Exception) null, true);
            if (!this.f20011b.isEmpty() && !m20013m(connectionResult) && !this.f20023n.mo17937h(connectionResult, this.f20017h)) {
                if (connectionResult.mo29682C0() == 18) {
                    this.f20019j = true;
                }
                if (this.f20019j) {
                    C4595g gVar2 = this.f20023n;
                    gVar2.f20009q.sendMessageDelayed(Message.obtain(gVar2.f20009q, 9, this.f20013d), this.f20023n.f19994b);
                    return;
                }
                m20004d(C4595g.m19969i(this.f20013d, connectionResult));
            }
        } else {
            m20004d(C4595g.m19969i(this.f20013d, connectionResult));
        }
    }

    /* renamed from: G */
    public final void mo17946G(ConnectionResult connectionResult) {
        C4604n.m20091d(this.f20023n.f20009q);
        C7191a.C7201f fVar = this.f20012c;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.disconnect(sb.toString());
        mo17945F(connectionResult, (Exception) null);
    }

    /* renamed from: H */
    public final void mo17947H(C7230c3 c3Var) {
        C4604n.m20091d(this.f20023n.f20009q);
        this.f20015f.add(c3Var);
    }

    /* renamed from: I */
    public final void mo17948I() {
        C4604n.m20091d(this.f20023n.f20009q);
        if (this.f20019j) {
            mo17942C();
        }
    }

    /* renamed from: J */
    public final void mo17949J() {
        C4604n.m20091d(this.f20023n.f20009q);
        m20004d(C4595g.f19990s);
        this.f20014e.mo29956f();
        for (C7259j.C7260a y2Var : (C7259j.C7260a[]) this.f20016g.keySet().toArray(new C7259j.C7260a[0])) {
            mo17943D(new C7335y2(y2Var, new TaskCompletionSource()));
        }
        m20003c(new ConnectionResult(4));
        if (this.f20012c.isConnected()) {
            this.f20012c.onUserSignOut(new C7273l1(this));
        }
    }

    /* renamed from: K */
    public final void mo17950K() {
        Status status;
        C4604n.m20091d(this.f20023n.f20009q);
        if (this.f20019j) {
            m20011k();
            C4595g gVar = this.f20023n;
            if (gVar.f20001i.mo29708i(gVar.f20000h) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m20004d(status);
            this.f20012c.disconnect("Timing out connection while resuming.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo17951M() {
        return this.f20012c.isConnected();
    }

    /* renamed from: N */
    public final boolean mo17952N() {
        return this.f20012c.requiresSignIn();
    }

    /* renamed from: a */
    public final boolean mo17953a() {
        return m20014n(true);
    }

    /* renamed from: o */
    public final int mo17954o() {
        return this.f20017h;
    }

    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f20023n.f20009q.getLooper()) {
            m20007g();
        } else {
            this.f20023n.f20009q.post(new C7256i1(this));
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        mo17945F(connectionResult, (Exception) null);
    }

    public final void onConnectionSuspended(int i) {
        if (Looper.myLooper() == this.f20023n.f20009q.getLooper()) {
            m20008h(i);
        } else {
            this.f20023n.f20009q.post(new C7263j1(this, i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final int mo17956p() {
        return this.f20022m;
    }

    /* renamed from: q */
    public final ConnectionResult mo17957q() {
        C4604n.m20091d(this.f20023n.f20009q);
        return this.f20021l;
    }

    /* renamed from: s */
    public final C7191a.C7201f mo17958s() {
        return this.f20012c;
    }

    /* renamed from: u */
    public final Map<C7259j.C7260a<?>, C7229c2> mo17959u() {
        return this.f20016g;
    }

    /* renamed from: x */
    public final void mo17924x(ConnectionResult connectionResult, C7191a<?> aVar, boolean z) {
        throw null;
    }
}
