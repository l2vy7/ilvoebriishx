package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import javax.annotation.ParametersAreNonnullByDefault;
import p199d5.C10489b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class vk0 extends RewardedInterstitialAd {

    /* renamed from: a */
    private final String f20927a;

    /* renamed from: b */
    private final bk0 f20928b;

    /* renamed from: c */
    private final Context f20929c;

    /* renamed from: d */
    private final tk0 f20930d = new tk0();

    /* renamed from: e */
    private FullScreenContentCallback f20931e;

    /* renamed from: f */
    private OnAdMetadataChangedListener f20932f;

    /* renamed from: g */
    private OnPaidEventListener f20933g;

    public vk0(Context context, String str) {
        this.f20927a = str;
        this.f20929c = context.getApplicationContext();
        this.f20928b = C8241uv.m38462a().mo34801p(context, str, new qc0());
    }

    /* renamed from: a */
    public final void mo18899a(C4618oy oyVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            bk0 bk0 = this.f20928b;
            if (bk0 != null) {
                bk0.mo30684D2(C8134ru.f38776a.mo34626a(this.f20929c, oyVar), new uk0(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final Bundle getAdMetadata() {
        try {
            bk0 bk0 = this.f20928b;
            if (bk0 != null) {
                return bk0.zzb();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        return this.f20927a;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f20931e;
    }

    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f20932f;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f20933g;
    }

    public final ResponseInfo getResponseInfo() {
        C7663ey eyVar = null;
        try {
            bk0 bk0 = this.f20928b;
            if (bk0 != null) {
                eyVar = bk0.zzc();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(eyVar);
    }

    public final RewardItem getRewardItem() {
        try {
            bk0 bk0 = this.f20928b;
            yj0 zzd = bk0 != null ? bk0.zzd() : null;
            if (zzd != null) {
                return new mk0(zzd);
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f20931e = fullScreenContentCallback;
        this.f20930d.mo34968n6(fullScreenContentCallback);
    }

    public final void setImmersiveMode(boolean z) {
        try {
            bk0 bk0 = this.f20928b;
            if (bk0 != null) {
                bk0.mo30686Q(z);
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f20932f = onAdMetadataChangedListener;
        try {
            bk0 bk0 = this.f20928b;
            if (bk0 != null) {
                bk0.mo30689f5(new C8103qz(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f20933g = onPaidEventListener;
        try {
            bk0 bk0 = this.f20928b;
            if (bk0 != null) {
                bk0.mo30690j3(new C8139rz(onPaidEventListener));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            bk0 bk0 = this.f20928b;
            if (bk0 != null) {
                bk0.mo30687W0(new zzcfn(serverSideVerificationOptions));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f20930d.mo34969o6(onUserEarnedRewardListener);
        try {
            bk0 bk0 = this.f20928b;
            if (bk0 != null) {
                bk0.mo30688Y2(this.f20930d);
                this.f20928b.mo30692p0(C10489b.m48195m6(activity));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
