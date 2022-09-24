package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.C4604n;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fr2 extends mj0 {

    /* renamed from: b */
    private final vq2 f31857b;

    /* renamed from: c */
    private final kq2 f31858c;

    /* renamed from: d */
    private final wr2 f31859d;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: e */
    public yr1 f31860e;
    @GuardedBy("this")

    /* renamed from: f */
    private boolean f31861f = false;

    public fr2(vq2 vq2, kq2 kq2, wr2 wr2) {
        this.f31857b = vq2;
        this.f31858c = kq2;
        this.f31859d = wr2;
    }

    /* renamed from: p6 */
    private final synchronized boolean m32228p6() {
        yr1 yr1;
        yr1 = this.f31860e;
        return yr1 != null && !yr1.mo35962j();
    }

    /* renamed from: B2 */
    public final synchronized void mo31900B2(zzcen zzcen) throws RemoteException {
        C4604n.m20093f("loadAd must be called on the main UI thread.");
        String str = zzcen.f43025c;
        String str2 = (String) C8311wv.m39277c().mo18570b(p00.f36963Q3);
        if (!(str2 == null || str == null)) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                zzt.zzo().mo18592s(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (m32228p6()) {
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36979S3)).booleanValue()) {
                return;
            }
        }
        mq2 mq2 = new mq2((String) null);
        this.f31860e = null;
        this.f31857b.mo35462i(1);
        this.f31857b.mo18423a(zzcen.f43024b, zzcen.f43025c, mq2, new dr2(this));
    }

    /* renamed from: G */
    public final synchronized void mo31901G(C10487a aVar) {
        Context context;
        C4604n.m20093f("resume must be called on the main UI thread.");
        if (this.f31860e != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) C10489b.m48194f3(aVar);
            }
            this.f31860e.mo33839d().mo33519H0(context);
        }
    }

    /* renamed from: K1 */
    public final synchronized void mo31902K1(boolean z) {
        C4604n.m20093f("setImmersiveMode must be called on the main UI thread.");
        this.f31861f = z;
    }

    /* renamed from: P */
    public final synchronized void mo31903P(String str) throws RemoteException {
        C4604n.m20093f("#008 Must be called on the main UI thread.: setCustomData");
        this.f31859d.f40859b = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.app.Activity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31904R(p198d5.C10487a r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showAd must be called on the main UI thread."
            com.google.android.gms.common.internal.C4604n.m20093f(r0)     // Catch:{ all -> 0x0024 }
            com.google.android.gms.internal.ads.yr1 r0 = r2.f31860e     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            if (r3 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            java.lang.Object r3 = p198d5.C10489b.m48194f3(r3)     // Catch:{ all -> 0x0024 }
            boolean r1 = r3 instanceof android.app.Activity     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x0024 }
        L_0x0019:
            com.google.android.gms.internal.ads.yr1 r3 = r2.f31860e     // Catch:{ all -> 0x0024 }
            boolean r1 = r2.f31861f     // Catch:{ all -> 0x0024 }
            r3.mo35965m(r1, r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0022:
            monitor-exit(r2)
            return
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fr2.mo31904R(d5.a):void");
    }

    /* renamed from: g2 */
    public final void mo31905g2(lj0 lj0) {
        C4604n.m20093f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f31858c.mo33161I(lj0);
    }

    /* renamed from: j */
    public final synchronized void mo31906j(String str) throws RemoteException {
        C4604n.m20093f("setUserId must be called on the main UI thread.");
        this.f31859d.f40858a = str;
    }

    /* renamed from: o3 */
    public final void mo31907o3(qj0 qj0) throws RemoteException {
        C4604n.m20093f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f31858c.mo33160G(qj0);
    }

    /* renamed from: q3 */
    public final void mo31908q3(C8279vw vwVar) {
        C4604n.m20093f("setAdMetadataListener can only be called from the UI thread.");
        if (vwVar == null) {
            this.f31858c.mo33164n((e03) null);
        } else {
            this.f31858c.mo33164n(new er2(this, vwVar));
        }
    }

    /* renamed from: v */
    public final synchronized void mo31909v(C10487a aVar) {
        Context context;
        C4604n.m20093f("pause must be called on the main UI thread.");
        if (this.f31860e != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) C10489b.m48194f3(aVar);
            }
            this.f31860e.mo33839d().mo33518G0(context);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31910y(p198d5.C10487a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.C4604n.m20093f(r0)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.kq2 r0 = r2.f31858c     // Catch:{ all -> 0x0027 }
            r1 = 0
            r0.mo33164n(r1)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.yr1 r0 = r2.f31860e     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            if (r3 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.Object r3 = p198d5.C10489b.m48194f3(r3)     // Catch:{ all -> 0x0027 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0027 }
        L_0x001a:
            com.google.android.gms.internal.ads.yr1 r3 = r2.f31860e     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.mb1 r3 = r3.mo33839d()     // Catch:{ all -> 0x0027 }
            r3.mo33517E0(r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0025:
            monitor-exit(r2)
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fr2.mo31910y(d5.a):void");
    }

    public final Bundle zzb() {
        C4604n.m20093f("getAdMetadata can only be called from the UI thread.");
        yr1 yr1 = this.f31860e;
        return yr1 != null ? yr1.mo35960h() : new Bundle();
    }

    public final synchronized C7663ey zzc() throws RemoteException {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37117i5)).booleanValue()) {
            return null;
        }
        yr1 yr1 = this.f31860e;
        if (yr1 == null) {
            return null;
        }
        return yr1.mo33838c();
    }

    public final synchronized String zzd() throws RemoteException {
        yr1 yr1 = this.f31860e;
        if (yr1 == null || yr1.mo33838c() == null) {
            return null;
        }
        return this.f31860e.mo33838c().zze();
    }

    public final void zze() throws RemoteException {
        mo31910y((C10487a) null);
    }

    public final void zzh() {
        mo31909v((C10487a) null);
    }

    public final void zzj() {
        mo31901G((C10487a) null);
    }

    public final synchronized void zzq() throws RemoteException {
        mo31904R((C10487a) null);
    }

    public final boolean zzs() throws RemoteException {
        C4604n.m20093f("isLoaded must be called on the main UI thread.");
        return m32228p6();
    }

    public final boolean zzt() {
        yr1 yr1 = this.f31860e;
        return yr1 != null && yr1.mo35964l();
    }
}
