package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7377d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w03 implements C7377d.C7378a, C7377d.C7379b {

    /* renamed from: b */
    private final r13 f40649b;

    /* renamed from: c */
    private final m13 f40650c;

    /* renamed from: d */
    private final Object f40651d = new Object();

    /* renamed from: e */
    private boolean f40652e = false;

    /* renamed from: f */
    private boolean f40653f = false;

    w03(Context context, Looper looper, m13 m13) {
        this.f40650c = m13;
        this.f40649b = new r13(context, looper, this, this, 12800000);
    }

    /* renamed from: b */
    private final void m39006b() {
        synchronized (this.f40651d) {
            if (this.f40649b.isConnected() || this.f40649b.isConnecting()) {
                this.f40649b.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35536a() {
        synchronized (this.f40651d) {
            if (!this.f40652e) {
                this.f40652e = true;
                this.f40649b.checkAvailabilityAndConnect();
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConnected(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.Object r4 = r3.f40651d
            monitor-enter(r4)
            boolean r0 = r3.f40653f     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x0009:
            r0 = 1
            r3.f40653f = r0     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.r13 r0 = r3.f40649b     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.u13 r0 = r0.mo34473e()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.zzfnm r1 = new com.google.android.gms.internal.ads.zzfnm     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            com.google.android.gms.internal.ads.m13 r2 = r3.f40650c     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            byte[] r2 = r2.mo33365g()     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
            r0.mo35085p6(r1)     // Catch:{ Exception -> 0x0020, all -> 0x0024 }
        L_0x0020:
            r3.m39006b()     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x0024:
            r0 = move-exception
            r3.m39006b()     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w03.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    public final void onConnectionSuspended(int i) {
    }
}
