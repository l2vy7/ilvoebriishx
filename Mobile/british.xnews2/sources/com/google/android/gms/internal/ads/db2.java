package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.C4604n;
import java.util.Collections;
import p198d5.C10487a;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class db2 extends C8101qw {

    /* renamed from: b */
    private final Context f30700b;

    /* renamed from: c */
    private final C7624dw f30701c;

    /* renamed from: d */
    private final bs2 f30702d;

    /* renamed from: e */
    private final m41 f30703e;

    /* renamed from: f */
    private final ViewGroup f30704f;

    public db2(Context context, C7624dw dwVar, bs2 bs2, m41 m41) {
        this.f30700b = context;
        this.f30701c = dwVar;
        this.f30702d = bs2;
        this.f30703e = m41;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        frameLayout.addView(m41.mo33469i(), zzt.zzq().zzj());
        frameLayout.setMinimumHeight(zzg().f42966d);
        frameLayout.setMinimumWidth(zzg().f42969g);
        this.f30704f = frameLayout;
    }

    public final void zzA() throws RemoteException {
        this.f30703e.mo33473m();
    }

    public final void zzB() throws RemoteException {
        C4604n.m20093f("destroy must be called on the main UI thread.");
        this.f30703e.mo33839d().mo33519H0((Context) null);
    }

    public final void zzC(C7518aw awVar) throws RemoteException {
        co0.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzD(C7624dw dwVar) throws RemoteException {
        co0.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzE(C8279vw vwVar) throws RemoteException {
        co0.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzF(zzbfi zzbfi) throws RemoteException {
        C4604n.m20093f("setAdSize must be called on the main UI thread.");
        m41 m41 = this.f30703e;
        if (m41 != null) {
            m41.mo33474n(this.f30704f, zzbfi);
        }
    }

    public final void zzG(C8385yw ywVar) throws RemoteException {
        cc2 cc2 = this.f30702d.f30086c;
        if (cc2 != null) {
            cc2.mo30877C(ywVar);
        }
    }

    public final void zzH(C7654ep epVar) throws RemoteException {
    }

    public final void zzI(zzbfo zzbfo) throws RemoteException {
    }

    public final void zzJ(C7699fx fxVar) {
    }

    public final void zzK(zzbjd zzbjd) throws RemoteException {
    }

    public final void zzL(boolean z) throws RemoteException {
    }

    public final void zzM(ih0 ih0) throws RemoteException {
    }

    public final void zzN(boolean z) throws RemoteException {
        co0.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzO(l10 l10) throws RemoteException {
        co0.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzP(C7555by byVar) {
        co0.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzQ(lh0 lh0, String str) throws RemoteException {
    }

    public final void zzR(String str) throws RemoteException {
    }

    public final void zzS(qj0 qj0) throws RemoteException {
    }

    public final void zzT(String str) throws RemoteException {
    }

    public final void zzU(zzbkq zzbkq) throws RemoteException {
        co0.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzW(C10487a aVar) {
    }

    public final void zzX() throws RemoteException {
    }

    public final boolean zzY() throws RemoteException {
        return false;
    }

    public final boolean zzZ() throws RemoteException {
        return false;
    }

    public final boolean zzaa(zzbfd zzbfd) throws RemoteException {
        co0.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    public final void zzab(C7590cx cxVar) throws RemoteException {
        co0.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final Bundle zzd() throws RemoteException {
        co0.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    public final zzbfi zzg() {
        C4604n.m20093f("getAdSize must be called on the main UI thread.");
        return fs2.m32243a(this.f30700b, Collections.singletonList(this.f30703e.mo33471k()));
    }

    public final C7624dw zzi() throws RemoteException {
        return this.f30701c;
    }

    public final C8385yw zzj() throws RemoteException {
        return this.f30702d.f30097n;
    }

    public final C7663ey zzk() {
        return this.f30703e.mo33838c();
    }

    public final C7774hy zzl() throws RemoteException {
        return this.f30703e.mo33470j();
    }

    public final C10487a zzn() throws RemoteException {
        return C10489b.m48195m6(this.f30704f);
    }

    public final String zzr() throws RemoteException {
        return this.f30702d.f30089f;
    }

    public final String zzs() throws RemoteException {
        if (this.f30703e.mo33838c() != null) {
            return this.f30703e.mo33838c().zze();
        }
        return null;
    }

    public final String zzt() throws RemoteException {
        if (this.f30703e.mo33838c() != null) {
            return this.f30703e.mo33838c().zze();
        }
        return null;
    }

    public final void zzx() throws RemoteException {
        C4604n.m20093f("destroy must be called on the main UI thread.");
        this.f30703e.mo31310a();
    }

    public final void zzy(zzbfd zzbfd, C7772hw hwVar) {
    }

    public final void zzz() throws RemoteException {
        C4604n.m20093f("destroy must be called on the main UI thread.");
        this.f30703e.mo33839d().mo33518G0((Context) null);
    }
}
