package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.C4549c;
import com.google.ads.mediation.C4552d;
import com.google.ads.mediation.C4553e;
import com.google.ads.mediation.C4556f;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import p131p3.C5902a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class be0<NETWORK_EXTRAS extends C4556f, SERVER_PARAMETERS extends C4553e> implements C4549c, C4552d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zc0 f29979a;

    public be0(zc0 zc0) {
        this.f29979a = zc0;
    }

    /* renamed from: a */
    public final void mo16975a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, C5902a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        co0.zze(sb.toString());
        C8241uv.m38463b();
        if (!vn0.m38857p()) {
            co0.zzl("#008 Must be called on the main UI thread.", (Throwable) null);
            vn0.f40472b.post(new ae0(this, aVar));
            return;
        }
        try {
            this.f29979a.mo34073k(ce0.m30976a(aVar));
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo16967b(MediationBannerAdapter<?, ?> mediationBannerAdapter, C5902a aVar) {
        co0.zze("Adapter called onFailedToReceiveAd with error. ".concat(String.valueOf(aVar)));
        C8241uv.m38463b();
        if (!vn0.m38857p()) {
            co0.zzl("#008 Must be called on the main UI thread.", (Throwable) null);
            vn0.f40472b.post(new zd0(this, aVar));
            return;
        }
        try {
            this.f29979a.mo34073k(ce0.m30976a(aVar));
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
