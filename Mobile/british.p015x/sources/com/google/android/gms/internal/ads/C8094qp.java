package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.C7377d;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.internal.ads.qp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8094qp {

    /* renamed from: a */
    private final Runnable f38216a = new C7949mp(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f38217b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: c */
    public C8163sp f38218c;
    @GuardedBy("lock")

    /* renamed from: d */
    private Context f38219d;
    /* access modifiers changed from: private */
    @GuardedBy("lock")

    /* renamed from: e */
    public C8235up f38220e;

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m36567h(C8094qp qpVar) {
        synchronized (qpVar.f38217b) {
            C8163sp spVar = qpVar.f38218c;
            if (spVar != null) {
                if (spVar.isConnected() || qpVar.f38218c.isConnecting()) {
                    qpVar.f38218c.disconnect();
                }
                qpVar.f38218c = null;
                qpVar.f38220e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m36569l() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f38217b
            monitor-enter(r0)
            android.content.Context r1 = r3.f38219d     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.sp r1 = r3.f38218c     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.op r1 = new com.google.android.gms.internal.ads.op     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.pp r2 = new com.google.android.gms.internal.ads.pp     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.sp r1 = r3.mo34376d(r1, r2)     // Catch:{ all -> 0x0023 }
            r3.f38218c = r1     // Catch:{ all -> 0x0023 }
            r1.checkAvailabilityAndConnect()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8094qp.m36569l():void");
    }

    /* renamed from: a */
    public final long mo34374a(zzbak zzbak) {
        synchronized (this.f38217b) {
            if (this.f38220e == null) {
                return -2;
            }
            if (this.f38218c.mo34769e()) {
                try {
                    long n6 = this.f38220e.mo35217n6(zzbak);
                    return n6;
                } catch (RemoteException e) {
                    co0.zzh("Unable to call into cache service.", e);
                    return -2;
                }
            }
        }
    }

    /* renamed from: b */
    public final zzbah mo34375b(zzbak zzbak) {
        synchronized (this.f38217b) {
            if (this.f38220e == null) {
                zzbah zzbah = new zzbah();
                return zzbah;
            }
            try {
                if (this.f38218c.mo34769e()) {
                    zzbah p6 = this.f38220e.mo35219p6(zzbak);
                    return p6;
                }
                zzbah o6 = this.f38220e.mo35218o6(zzbak);
                return o6;
            } catch (RemoteException e) {
                co0.zzh("Unable to call into cache service.", e);
                return new zzbah();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final synchronized C8163sp mo34376d(C7377d.C7378a aVar, C7377d.C7379b bVar) {
        return new C8163sp(this.f38219d, zzt.zzt().zzb(), aVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34377i(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f38217b
            monitor-enter(r0)
            android.content.Context r1 = r2.f38219d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f38219d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.p00.f36922L2     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo18570b(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.m36569l()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.h00<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.p00.f36914K2     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.n00 r1 = com.google.android.gms.internal.ads.C8311wv.m39277c()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo18570b(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.np r3 = new com.google.android.gms.internal.ads.np     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.bo r1 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch:{ all -> 0x0048 }
            r1.mo18170c(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8094qp.mo34377i(android.content.Context):void");
    }

    /* renamed from: j */
    public final void mo34378j() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36930M2)).booleanValue()) {
            synchronized (this.f38217b) {
                m36569l();
                d33 d33 = com.google.android.gms.ads.internal.util.zzt.zza;
                d33.removeCallbacks(this.f38216a);
                d33.postDelayed(this.f38216a, ((Long) C8311wv.m39277c().mo18570b(p00.f36938N2)).longValue());
            }
        }
    }
}
