package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class s90<AdT> extends AdManagerInterstitialAd {

    /* renamed from: a */
    private final Context f20815a;

    /* renamed from: b */
    private final C8134ru f20816b = C8134ru.f38776a;

    /* renamed from: c */
    private final C8136rw f20817c;

    /* renamed from: d */
    private final String f20818d;

    /* renamed from: e */
    private final qc0 f20819e;

    /* renamed from: f */
    private AppEventListener f20820f;

    /* renamed from: g */
    private FullScreenContentCallback f20821g;

    /* renamed from: h */
    private OnPaidEventListener f20822h;

    public s90(Context context, String str) {
        qc0 qc0 = new qc0();
        this.f20819e = qc0;
        this.f20815a = context;
        this.f20818d = str;
        this.f20817c = C8241uv.m38462a().mo34795e(context, new zzbfi(), str, qc0);
    }

    /* renamed from: a */
    public final void mo18828a(C4618oy oyVar, AdLoadCallback<AdT> adLoadCallback) {
        try {
            if (this.f20817c != null) {
                this.f20819e.mo34310o6(oyVar.mo18637r());
                this.f20817c.zzy(this.f20816b.mo34626a(this.f20815a, oyVar), new C7843ju(adLoadCallback, this));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, (AdError) null, (ResponseInfo) null));
        }
    }

    public final String getAdUnitId() {
        return this.f20818d;
    }

    public final AppEventListener getAppEventListener() {
        return this.f20820f;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f20821g;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f20822h;
    }

    public final ResponseInfo getResponseInfo() {
        C7663ey eyVar = null;
        try {
            C8136rw rwVar = this.f20817c;
            if (rwVar != null) {
                eyVar = rwVar.zzk();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(eyVar);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f20820f = appEventListener;
            C8136rw rwVar = this.f20817c;
            if (rwVar != null) {
                rwVar.zzG(appEventListener != null ? new C8270vn(appEventListener) : null);
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.f20821g = fullScreenContentCallback;
            C8136rw rwVar = this.f20817c;
            if (rwVar != null) {
                rwVar.zzJ(new C8347xv(fullScreenContentCallback));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setImmersiveMode(boolean z) {
        try {
            C8136rw rwVar = this.f20817c;
            if (rwVar != null) {
                rwVar.zzL(z);
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f20822h = onPaidEventListener;
            C8136rw rwVar = this.f20817c;
            if (rwVar != null) {
                rwVar.zzP(new C8139rz(onPaidEventListener));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity) {
        if (activity == null) {
            co0.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            C8136rw rwVar = this.f20817c;
            if (rwVar != null) {
                rwVar.zzW(C10489b.m48195m6(activity));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
