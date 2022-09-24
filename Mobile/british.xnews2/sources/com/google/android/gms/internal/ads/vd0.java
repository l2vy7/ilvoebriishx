package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.C4604n;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class vd0 implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {

    /* renamed from: a */
    private final zc0 f40390a;

    /* renamed from: b */
    private UnifiedNativeAdMapper f40391b;

    /* renamed from: c */
    private NativeCustomTemplateAd f40392c;

    public vd0(zc0 zc0) {
        this.f40390a = zc0;
    }

    /* renamed from: a */
    public final NativeCustomTemplateAd mo35412a() {
        return this.f40392c;
    }

    /* renamed from: b */
    public final UnifiedNativeAdMapper mo35413b() {
        return this.f40391b;
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdClicked.");
        try {
            this.f40390a.zze();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdClosed.");
        try {
            this.f40390a.zzf();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        co0.zze(sb.toString());
        try {
            this.f40390a.mo34073k(i);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f40391b;
        if (this.f40392c == null) {
            if (unifiedNativeAdMapper == null) {
                co0.zzl("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                co0.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        co0.zze("Adapter called onAdImpression.");
        try {
            this.f40390a.zzm();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdLeftApplication.");
        try {
            this.f40390a.zzn();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdLoaded.");
        try {
            this.f40390a.zzo();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdOpened.");
        try {
            this.f40390a.zzp();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onVideoEnd.");
        try {
            this.f40390a.zzv();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        String str;
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        if (valueOf.length() != 0) {
            str = "Adapter called onAdLoaded with template id ".concat(valueOf);
        } else {
            str = new String("Adapter called onAdLoaded with template id ");
        }
        co0.zze(str);
        this.f40392c = nativeCustomTemplateAd;
        try {
            this.f40390a.zzo();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzd(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAppEvent.");
        try {
            this.f40390a.mo34066P4(str, str2);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zze(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof m40) {
            try {
                this.f40390a.mo34077w1(((m40) nativeCustomTemplateAd).mo33467a(), str);
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        } else {
            co0.zzj("Unexpected native custom template ad type.");
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdClicked.");
        try {
            this.f40390a.zze();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdClosed.");
        try {
            this.f40390a.zzf();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 97 + String.valueOf(domain).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(code);
        sb.append(". ErrorMessage: ");
        sb.append(message);
        sb.append(". ErrorDomain: ");
        sb.append(domain);
        co0.zze(sb.toString());
        try {
            this.f40390a.mo34071e5(adError.zza());
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdLeftApplication.");
        try {
            this.f40390a.zzn();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdLoaded.");
        try {
            this.f40390a.zzo();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdOpened.");
        try {
            this.f40390a.zzp();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f40391b;
        if (this.f40392c == null) {
            if (unifiedNativeAdMapper == null) {
                co0.zzl("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                co0.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        co0.zze("Adapter called onAdClicked.");
        try {
            this.f40390a.zze();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdClosed.");
        try {
            this.f40390a.zzf();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdLeftApplication.");
        try {
            this.f40390a.zzn();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdLoaded.");
        this.f40391b = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zzb(new jd0());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zze(videoController);
            }
        }
        try {
            this.f40390a.zzo();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        co0.zze("Adapter called onAdOpened.");
        try {
            this.f40390a.zzp();
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        co0.zze(sb.toString());
        try {
            this.f40390a.mo34073k(i);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 97 + String.valueOf(domain).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(code);
        sb.append(". ErrorMessage: ");
        sb.append(message);
        sb.append(". ErrorDomain: ");
        sb.append(domain);
        co0.zze(sb.toString());
        try {
            this.f40390a.mo34071e5(adError.zza());
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        co0.zze(sb.toString());
        try {
            this.f40390a.mo34073k(i);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        C4604n.m20093f("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 97 + String.valueOf(domain).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(code);
        sb.append(". ErrorMessage: ");
        sb.append(message);
        sb.append(". ErrorDomain: ");
        sb.append(domain);
        co0.zze(sb.toString());
        try {
            this.f40390a.mo34071e5(adError.zza());
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
