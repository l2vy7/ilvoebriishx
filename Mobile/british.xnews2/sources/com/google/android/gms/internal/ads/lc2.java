package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4604n;
import javax.annotation.concurrent.GuardedBy;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lc2 extends C8101qw {

    /* renamed from: b */
    private final zzbfi f34985b;

    /* renamed from: c */
    private final Context f34986c;

    /* renamed from: d */
    private final jp2 f34987d;

    /* renamed from: e */
    private final String f34988e;

    /* renamed from: f */
    private final cc2 f34989f;

    /* renamed from: g */
    private final kq2 f34990g;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: h */
    public zi1 f34991h;
    @GuardedBy("this")

    /* renamed from: i */
    private boolean f34992i = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37234w0)).booleanValue();

    public lc2(Context context, zzbfi zzbfi, String str, jp2 jp2, cc2 cc2, kq2 kq2) {
        this.f34985b = zzbfi;
        this.f34988e = str;
        this.f34986c = context;
        this.f34987d = jp2;
        this.f34989f = cc2;
        this.f34990g = kq2;
    }

    /* renamed from: p6 */
    private final synchronized boolean m34423p6() {
        zi1 zi1;
        zi1 = this.f34991h;
        return zi1 != null && !zi1.mo19061h();
    }

    public final void zzA() {
    }

    public final synchronized void zzB() {
        C4604n.m20093f("resume must be called on the main UI thread.");
        zi1 zi1 = this.f34991h;
        if (zi1 != null) {
            zi1.mo33839d().mo33519H0((Context) null);
        }
    }

    public final void zzC(C7518aw awVar) {
    }

    public final void zzD(C7624dw dwVar) {
        C4604n.m20093f("setAdListener must be called on the main UI thread.");
        this.f34989f.mo30881n(dwVar);
    }

    public final void zzE(C8279vw vwVar) {
        C4604n.m20093f("setAdMetadataListener must be called on the main UI thread.");
    }

    public final void zzF(zzbfi zzbfi) {
    }

    public final void zzG(C8385yw ywVar) {
        C4604n.m20093f("setAppEventListener must be called on the main UI thread.");
        this.f34989f.mo30877C(ywVar);
    }

    public final void zzH(C7654ep epVar) {
    }

    public final void zzI(zzbfo zzbfo) {
    }

    public final void zzJ(C7699fx fxVar) {
        this.f34989f.mo30878I(fxVar);
    }

    public final void zzK(zzbjd zzbjd) {
    }

    public final synchronized void zzL(boolean z) {
        C4604n.m20093f("setImmersiveMode must be called on the main UI thread.");
        this.f34992i = z;
    }

    public final void zzM(ih0 ih0) {
    }

    public final void zzN(boolean z) {
    }

    public final synchronized void zzO(l10 l10) {
        C4604n.m20093f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f34987d.mo32921h(l10);
    }

    public final void zzP(C7555by byVar) {
        C4604n.m20093f("setPaidEventListener must be called on the main UI thread.");
        this.f34989f.mo30883z(byVar);
    }

    public final void zzQ(lh0 lh0, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(qj0 qj0) {
        this.f34990g.mo33160G(qj0);
    }

    public final void zzT(String str) {
    }

    public final void zzU(zzbkq zzbkq) {
    }

    public final synchronized void zzW(C10487a aVar) {
        if (this.f34991h == null) {
            co0.zzj("Interstitial can not be shown before loaded.");
            this.f34989f.mo18122N(us2.m38446d(9, (String) null, (zzbew) null));
            return;
        }
        this.f34991h.mo19062i(this.f34992i, (Activity) C10489b.m48194f3(aVar));
    }

    public final synchronized void zzX() {
        C4604n.m20093f("showInterstitial must be called on the main UI thread.");
        zi1 zi1 = this.f34991h;
        if (zi1 == null) {
            co0.zzj("Interstitial can not be shown before loaded.");
            this.f34989f.mo18122N(us2.m38446d(9, (String) null, (zzbew) null));
            return;
        }
        zi1.mo19062i(this.f34992i, (Activity) null);
    }

    public final synchronized boolean zzY() {
        return this.f34987d.zza();
    }

    public final synchronized boolean zzZ() {
        C4604n.m20093f("isLoaded must be called on the main UI thread.");
        return m34423p6();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzaa(com.google.android.gms.internal.ads.zzbfd r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.C4604n.m20093f(r0)     // Catch:{ all -> 0x0051 }
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch:{ all -> 0x0051 }
            android.content.Context r0 = r4.f34986c     // Catch:{ all -> 0x0051 }
            boolean r0 = com.google.android.gms.ads.internal.util.zzt.zzL(r0)     // Catch:{ all -> 0x0051 }
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.zzbeu r0 = r5.f42958t     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x002a
            java.lang.String r5 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.co0.zzg(r5)     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.cc2 r5 = r4.f34989f     // Catch:{ all -> 0x0051 }
            if (r5 == 0) goto L_0x0028
            r0 = 4
            com.google.android.gms.internal.ads.zzbew r0 = com.google.android.gms.internal.ads.us2.m38446d(r0, r2, r2)     // Catch:{ all -> 0x0051 }
            r5.mo18436d(r0)     // Catch:{ all -> 0x0051 }
        L_0x0028:
            monitor-exit(r4)
            return r1
        L_0x002a:
            boolean r0 = r4.m34423p6()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0032
            monitor-exit(r4)
            return r1
        L_0x0032:
            android.content.Context r0 = r4.f34986c     // Catch:{ all -> 0x0051 }
            boolean r1 = r5.f42945g     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.qs2.m36699a(r0, r1)     // Catch:{ all -> 0x0051 }
            r4.f34991h = r2     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.jp2 r0 = r4.f34987d     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = r4.f34988e     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.cp2 r2 = new com.google.android.gms.internal.ads.cp2     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.zzbfi r3 = r4.f34985b     // Catch:{ all -> 0x0051 }
            r2.<init>(r3)     // Catch:{ all -> 0x0051 }
            com.google.android.gms.internal.ads.kc2 r3 = new com.google.android.gms.internal.ads.kc2     // Catch:{ all -> 0x0051 }
            r3.<init>(r4)     // Catch:{ all -> 0x0051 }
            boolean r5 = r0.mo18423a(r5, r1, r2, r3)     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)
            return r5
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lc2.zzaa(com.google.android.gms.internal.ads.zzbfd):boolean");
    }

    public final void zzab(C7590cx cxVar) {
    }

    public final Bundle zzd() {
        C4604n.m20093f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final zzbfi zzg() {
        return null;
    }

    public final C7624dw zzi() {
        return this.f34989f.mo30879c();
    }

    public final C8385yw zzj() {
        return this.f34989f.mo30880l();
    }

    public final synchronized C7663ey zzk() {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37117i5)).booleanValue()) {
            return null;
        }
        zi1 zi1 = this.f34991h;
        if (zi1 == null) {
            return null;
        }
        return zi1.mo33838c();
    }

    public final C7774hy zzl() {
        return null;
    }

    public final C10487a zzn() {
        return null;
    }

    public final synchronized String zzr() {
        return this.f34988e;
    }

    public final synchronized String zzs() {
        zi1 zi1 = this.f34991h;
        if (zi1 == null || zi1.mo33838c() == null) {
            return null;
        }
        return this.f34991h.mo33838c().zze();
    }

    public final synchronized String zzt() {
        zi1 zi1 = this.f34991h;
        if (zi1 == null || zi1.mo33838c() == null) {
            return null;
        }
        return this.f34991h.mo33838c().zze();
    }

    public final synchronized void zzx() {
        C4604n.m20093f("destroy must be called on the main UI thread.");
        zi1 zi1 = this.f34991h;
        if (zi1 != null) {
            zi1.mo33839d().mo33517E0((Context) null);
        }
    }

    public final void zzy(zzbfd zzbfd, C7772hw hwVar) {
        this.f34989f.mo30882x(hwVar);
        zzaa(zzbfd);
    }

    public final synchronized void zzz() {
        C4604n.m20093f("pause must be called on the main UI thread.");
        zi1 zi1 = this.f34991h;
        if (zi1 != null) {
            zi1.mo33839d().mo33518G0((Context) null);
        }
    }
}
