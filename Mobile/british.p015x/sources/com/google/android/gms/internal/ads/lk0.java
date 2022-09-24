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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import javax.annotation.ParametersAreNonnullByDefault;
import p199d5.C10489b;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class lk0 extends RewardedAd {

    /* renamed from: a */
    private final String f20529a;

    /* renamed from: b */
    private final bk0 f20530b;

    /* renamed from: c */
    private final Context f20531c;

    /* renamed from: d */
    private final tk0 f20532d = new tk0();

    /* renamed from: e */
    private OnAdMetadataChangedListener f20533e;

    /* renamed from: f */
    private OnPaidEventListener f20534f;

    /* renamed from: g */
    private FullScreenContentCallback f20535g;

    public lk0(Context context, String str) {
        this.f20531c = context.getApplicationContext();
        this.f20529a = str;
        this.f20530b = C8241uv.m38462a().mo34801p(context, str, new qc0());
    }

    /* renamed from: a */
    public final void mo18521a(C4618oy oyVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            bk0 bk0 = this.f20530b;
            if (bk0 != null) {
                bk0.mo30685G1(C8134ru.f38776a.mo34626a(this.f20531c, oyVar), new pk0(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final Bundle getAdMetadata() {
        try {
            bk0 bk0 = this.f20530b;
            if (bk0 != null) {
                return bk0.zzb();
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        return this.f20529a;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f20535g;
    }

    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f20533e;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f20534f;
    }

    public final ResponseInfo getResponseInfo() {
        C7663ey eyVar = null;
        try {
            bk0 bk0 = this.f20530b;
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
            bk0 bk0 = this.f20530b;
            yj0 zzd = bk0 != null ? bk0.zzd() : null;
            if (zzd == null) {
                return RewardItem.DEFAULT_REWARD;
            }
            return new mk0(zzd);
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f20535g = fullScreenContentCallback;
        this.f20532d.mo34968n6(fullScreenContentCallback);
    }

    public final void setImmersiveMode(boolean z) {
        try {
            bk0 bk0 = this.f20530b;
            if (bk0 != null) {
                bk0.mo30686Q(z);
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f20533e = onAdMetadataChangedListener;
            bk0 bk0 = this.f20530b;
            if (bk0 != null) {
                bk0.mo30689f5(new C8103qz(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f20534f = onPaidEventListener;
            bk0 bk0 = this.f20530b;
            if (bk0 != null) {
                bk0.mo30690j3(new C8139rz(onPaidEventListener));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                bk0 bk0 = this.f20530b;
                if (bk0 != null) {
                    bk0.mo30687W0(new zzcfn(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f20532d.mo34969o6(onUserEarnedRewardListener);
        if (activity == null) {
            co0.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            bk0 bk0 = this.f20530b;
            if (bk0 != null) {
                bk0.mo30688Y2(this.f20532d);
                this.f20530b.mo30692p0(C10489b.m48195m6(activity));
            }
        } catch (RemoteException e) {
            co0.zzl("#007 Could not call remote method.", e);
        }
    }
}
