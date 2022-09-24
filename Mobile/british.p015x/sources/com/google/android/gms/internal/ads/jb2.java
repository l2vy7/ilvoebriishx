package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.C4604n;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jb2 extends C8101qw implements fd1 {

    /* renamed from: b */
    private final Context f33833b;

    /* renamed from: c */
    private final nn2 f33834c;

    /* renamed from: d */
    private final String f33835d;

    /* renamed from: e */
    private final cc2 f33836e;

    /* renamed from: f */
    private zzbfi f33837f;
    @GuardedBy("this")

    /* renamed from: g */
    private final zr2 f33838g;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: h */
    public m41 f33839h;

    public jb2(Context context, zzbfi zzbfi, String str, nn2 nn2, cc2 cc2) {
        this.f33833b = context;
        this.f33834c = nn2;
        this.f33837f = zzbfi;
        this.f33835d = str;
        this.f33836e = cc2;
        this.f33838g = nn2.mo33720g();
        nn2.mo33724n(this);
    }

    /* renamed from: p6 */
    private final synchronized void m33586p6(zzbfi zzbfi) {
        this.f33838g.mo36102G(zzbfi);
        this.f33838g.mo36107L(this.f33837f.f42977o);
    }

    /* renamed from: q6 */
    private final synchronized boolean m33587q6(zzbfd zzbfd) throws RemoteException {
        C4604n.m20093f("loadAd must be called on the main UI thread.");
        zzt.zzp();
        if (!com.google.android.gms.ads.internal.util.zzt.zzL(this.f33833b) || zzbfd.f42958t != null) {
            qs2.m36699a(this.f33833b, zzbfd.f42945g);
            return this.f33834c.mo18423a(zzbfd, this.f33835d, (rc2) null, new ib2(this));
        }
        co0.zzg("Failed to load the ad because app ID is missing.");
        cc2 cc2 = this.f33836e;
        if (cc2 != null) {
            cc2.mo18436d(us2.m38446d(4, (String) null, (zzbew) null));
        }
        return false;
    }

    public final synchronized void zzA() {
        C4604n.m20093f("recordManualImpression must be called on the main UI thread.");
        m41 m41 = this.f33839h;
        if (m41 != null) {
            m41.mo33473m();
        }
    }

    public final synchronized void zzB() {
        C4604n.m20093f("resume must be called on the main UI thread.");
        m41 m41 = this.f33839h;
        if (m41 != null) {
            m41.mo33839d().mo33519H0((Context) null);
        }
    }

    public final void zzC(C7518aw awVar) {
        C4604n.m20093f("setAdListener must be called on the main UI thread.");
        this.f33834c.mo33723m(awVar);
    }

    public final void zzD(C7624dw dwVar) {
        C4604n.m20093f("setAdListener must be called on the main UI thread.");
        this.f33836e.mo30881n(dwVar);
    }

    public final void zzE(C8279vw vwVar) {
        C4604n.m20093f("setAdMetadataListener must be called on the main UI thread.");
    }

    public final synchronized void zzF(zzbfi zzbfi) {
        C4604n.m20093f("setAdSize must be called on the main UI thread.");
        this.f33838g.mo36102G(zzbfi);
        this.f33837f = zzbfi;
        m41 m41 = this.f33839h;
        if (m41 != null) {
            m41.mo33474n(this.f33834c.mo33719c(), zzbfi);
        }
    }

    public final void zzG(C8385yw ywVar) {
        C4604n.m20093f("setAppEventListener must be called on the main UI thread.");
        this.f33836e.mo30877C(ywVar);
    }

    public final void zzH(C7654ep epVar) {
    }

    public final void zzI(zzbfo zzbfo) {
    }

    public final void zzJ(C7699fx fxVar) {
    }

    public final void zzK(zzbjd zzbjd) {
    }

    public final void zzL(boolean z) {
    }

    public final void zzM(ih0 ih0) {
    }

    public final synchronized void zzN(boolean z) {
        C4604n.m20093f("setManualImpressionsEnabled must be called from the main thread.");
        this.f33838g.mo36108M(z);
    }

    public final synchronized void zzO(l10 l10) {
        C4604n.m20093f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f33834c.mo33725o(l10);
    }

    public final void zzP(C7555by byVar) {
        C4604n.m20093f("setPaidEventListener must be called on the main UI thread.");
        this.f33836e.mo30883z(byVar);
    }

    public final void zzQ(lh0 lh0, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(qj0 qj0) {
    }

    public final void zzT(String str) {
    }

    public final synchronized void zzU(zzbkq zzbkq) {
        C4604n.m20093f("setVideoOptions must be called on the main UI thread.");
        this.f33838g.mo36115e(zzbkq);
    }

    public final void zzW(C10487a aVar) {
    }

    public final void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.f33834c.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final synchronized void zza() {
        if (this.f33834c.mo33726p()) {
            zzbfi v = this.f33838g.mo36121v();
            m41 m41 = this.f33839h;
            if (!(m41 == null || m41.mo33472l() == null || !this.f33838g.mo36118m())) {
                v = fs2.m32243a(this.f33833b, Collections.singletonList(this.f33839h.mo33472l()));
            }
            m33586p6(v);
            try {
                m33587q6(this.f33838g.mo36120t());
            } catch (RemoteException unused) {
                co0.zzj("Failed to refresh the banner ad.");
            }
        } else {
            this.f33834c.mo33722l();
        }
    }

    public final synchronized boolean zzaa(zzbfd zzbfd) throws RemoteException {
        m33586p6(this.f33837f);
        return m33587q6(zzbfd);
    }

    public final synchronized void zzab(C7590cx cxVar) {
        C4604n.m20093f("setCorrelationIdProvider must be called on the main UI thread");
        this.f33838g.mo36119o(cxVar);
    }

    public final Bundle zzd() {
        C4604n.m20093f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    public final synchronized zzbfi zzg() {
        C4604n.m20093f("getAdSize must be called on the main UI thread.");
        m41 m41 = this.f33839h;
        if (m41 != null) {
            return fs2.m32243a(this.f33833b, Collections.singletonList(m41.mo33471k()));
        }
        return this.f33838g.mo36121v();
    }

    public final C7624dw zzi() {
        return this.f33836e.mo30879c();
    }

    public final C8385yw zzj() {
        return this.f33836e.mo30880l();
    }

    public final synchronized C7663ey zzk() {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37117i5)).booleanValue()) {
            return null;
        }
        m41 m41 = this.f33839h;
        if (m41 == null) {
            return null;
        }
        return m41.mo33838c();
    }

    public final synchronized C7774hy zzl() {
        C4604n.m20093f("getVideoController must be called from the main thread.");
        m41 m41 = this.f33839h;
        if (m41 == null) {
            return null;
        }
        return m41.mo33470j();
    }

    public final C10487a zzn() {
        C4604n.m20093f("destroy must be called on the main UI thread.");
        return C10489b.m48195m6(this.f33834c.mo33719c());
    }

    public final synchronized String zzr() {
        return this.f33835d;
    }

    public final synchronized String zzs() {
        m41 m41 = this.f33839h;
        if (m41 == null || m41.mo33838c() == null) {
            return null;
        }
        return this.f33839h.mo33838c().zze();
    }

    public final synchronized String zzt() {
        m41 m41 = this.f33839h;
        if (m41 == null || m41.mo33838c() == null) {
            return null;
        }
        return this.f33839h.mo33838c().zze();
    }

    public final synchronized void zzx() {
        C4604n.m20093f("destroy must be called on the main UI thread.");
        m41 m41 = this.f33839h;
        if (m41 != null) {
            m41.mo31310a();
        }
    }

    public final void zzy(zzbfd zzbfd, C7772hw hwVar) {
    }

    public final synchronized void zzz() {
        C4604n.m20093f("pause must be called on the main UI thread.");
        m41 m41 = this.f33839h;
        if (m41 != null) {
            m41.mo33839d().mo33518G0((Context) null);
        }
    }
}
