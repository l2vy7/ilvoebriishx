package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7377d;
import p186z4.C6469a;
import p256u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.s7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9908s7 implements ServiceConnection, C7377d.C7378a, C7377d.C7379b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f46735b;

    /* renamed from: c */
    private volatile C9972z2 f46736c;

    /* renamed from: d */
    final /* synthetic */ C9918t7 f46737d;

    protected C9908s7(C9918t7 t7Var) {
        this.f46737d = t7Var;
    }

    /* renamed from: b */
    public final void mo39186b(Intent intent) {
        this.f46737d.mo19272b();
        Context r = this.f46737d.f21269a.mo19277r();
        C6469a b = C6469a.m28199b();
        synchronized (this) {
            if (this.f46735b) {
                this.f46737d.f21269a.mo19276j().mo19286v().mo38856a("Connection attempt already in progress");
                return;
            }
            this.f46737d.f21269a.mo19276j().mo19286v().mo38856a("Using local app measurement service");
            this.f46735b = true;
            b.mo24298a(r, intent, this.f46737d.f46762c, TsExtractor.TS_STREAM_TYPE_AC3);
        }
    }

    /* renamed from: c */
    public final void mo39187c() {
        this.f46737d.mo19272b();
        Context r = this.f46737d.f21269a.mo19277r();
        synchronized (this) {
            if (this.f46735b) {
                this.f46737d.f21269a.mo19276j().mo19286v().mo38856a("Connection attempt already in progress");
            } else if (this.f46736c == null || (!this.f46736c.isConnecting() && !this.f46736c.isConnected())) {
                this.f46736c = new C9972z2(r, Looper.getMainLooper(), this, this);
                this.f46737d.f21269a.mo19276j().mo19286v().mo38856a("Connecting to remote service");
                this.f46735b = true;
                C4604n.m20098k(this.f46736c);
                this.f46736c.checkAvailabilityAndConnect();
            } else {
                this.f46737d.f21269a.mo19276j().mo19286v().mo38856a("Already awaiting connection attempt");
            }
        }
    }

    /* renamed from: d */
    public final void mo39188d() {
        if (this.f46736c != null && (this.f46736c.isConnected() || this.f46736c.isConnecting())) {
            this.f46736c.disconnect();
        }
        this.f46736c = null;
    }

    public final void onConnected(Bundle bundle) {
        C4604n.m20093f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C4604n.m20098k(this.f46736c);
                this.f46737d.f21269a.mo19273e().mo38909z(new C9878p7(this, (C11030e) this.f46736c.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f46736c = null;
                this.f46735b = false;
            }
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        C4604n.m20093f("MeasurementServiceConnection.onConnectionFailed");
        C4667d3 E = this.f46737d.f21269a.mo19364E();
        if (E != null) {
            E.mo19287w().mo38857b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f46735b = false;
            this.f46736c = null;
        }
        this.f46737d.f21269a.mo19273e().mo38909z(new C9898r7(this));
    }

    public final void onConnectionSuspended(int i) {
        C4604n.m20093f("MeasurementServiceConnection.onConnectionSuspended");
        this.f46737d.f21269a.mo19276j().mo19281p().mo38856a("Service connection suspended");
        this.f46737d.f21269a.mo19273e().mo38909z(new C9888q7(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f46737d.f21269a.mo19276j().mo19282q().mo38856a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C4604n.m20093f(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f46735b = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.t7 r4 = r3.f46737d     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.h4 r4 = r4.f21269a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19282q()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo38856a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof p256u5.C11030e     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            u5.e r1 = (p256u5.C11030e) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            com.google.android.gms.measurement.internal.t2 r1 = new com.google.android.gms.measurement.internal.t2     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            com.google.android.gms.measurement.internal.t7 r5 = r3.f46737d     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.h4 r5 = r5.f21269a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19286v()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo38856a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            com.google.android.gms.measurement.internal.t7 r5 = r3.f46737d     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.h4 r5 = r5.f21269a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo38857b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            com.google.android.gms.measurement.internal.t7 r5 = r3.f46737d     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.h4 r5 = r5.f21269a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo38856a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f46735b = r4     // Catch:{ all -> 0x0063 }
            z4.a r4 = p186z4.C6469a.m28199b()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.t7 r5 = r3.f46737d     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.h4 r5 = r5.f21269a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.mo19277r()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.t7 r0 = r3.f46737d     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.s7 r0 = r0.f46762c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.mo24299c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            com.google.android.gms.measurement.internal.t7 r4 = r3.f46737d     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.h4 r4 = r4.f21269a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.f4 r4 = r4.mo19273e()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.n7 r5 = new com.google.android.gms.measurement.internal.n7     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.mo38909z(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            goto L_0x00a5
        L_0x00a4:
            throw r4
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9908s7.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C4604n.m20093f("MeasurementServiceConnection.onServiceDisconnected");
        this.f46737d.f21269a.mo19276j().mo19281p().mo38856a("Service disconnected");
        this.f46737d.f21269a.mo19273e().mo38909z(new C9867o7(this, componentName));
    }
}
