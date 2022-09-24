package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import p199d5.C10487a;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class z50 extends b50 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final OnAdManagerAdViewLoadedListener f42325b;

    public z50(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.f42325b = onAdManagerAdViewLoadedListener;
    }

    /* renamed from: A3 */
    public final void mo30306A3(C8136rw rwVar, C10487a aVar) {
        if (rwVar != null && aVar != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) C10489b.m48194f3(aVar));
            AppEventListener appEventListener = null;
            try {
                if (rwVar.zzi() instanceof C7807iu) {
                    C7807iu iuVar = (C7807iu) rwVar.zzi();
                    adManagerAdView.setAdListener(iuVar != null ? iuVar.mo32767n6() : null);
                }
            } catch (RemoteException e) {
                co0.zzh("", e);
            }
            try {
                if (rwVar.zzj() instanceof C8270vn) {
                    C8270vn vnVar = (C8270vn) rwVar.zzj();
                    if (vnVar != null) {
                        appEventListener = vnVar.mo35446o6();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e2) {
                co0.zzh("", e2);
            }
            vn0.f40472b.post(new y50(this, adManagerAdView, rwVar));
        }
    }
}
