package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import p006a5.C6492o;
import p134q.C5918d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcaf implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f43018a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public MediationInterstitialListener f43019b;

    /* renamed from: c */
    private Uri f43020c;

    public final void onDestroy() {
        co0.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        co0.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        co0.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f43019b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            co0.zzj("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            co0.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f43019b.onAdFailedToLoad((MediationInterstitialAdapter) this, 0);
        } else if (!C6492o.m28279b() || !o10.m20748g(context)) {
            co0.zzj("Default browser does not support custom tabs. Bailing out.");
            this.f43019b.onAdFailedToLoad((MediationInterstitialAdapter) this, 0);
        } else {
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                co0.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f43019b.onAdFailedToLoad((MediationInterstitialAdapter) this, 0);
                return;
            }
            this.f43018a = (Activity) context;
            this.f43020c = Uri.parse(string);
            this.f43019b.onAdLoaded(this);
        }
    }

    public final void showInterstitial() {
        C5918d a = new C5918d.C5919a().mo22909a();
        a.f24786a.setData(this.f43020c);
        zzt.zza.post(new kf0(this, new AdOverlayInfoParcel(new zzc(a.f24786a, (zzu) null), (C7659eu) null, new jf0(this), (zzw) null, new zzcjf(0, 0, false, false, false), (xt0) null, (gi1) null)));
        com.google.android.gms.ads.internal.zzt.zzo().mo18587n();
    }
}
