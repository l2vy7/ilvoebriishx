package p341z7;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.unity3d.scar.adapter.common.C12490g;
import p323q7.C12865b;

/* renamed from: z7.d */
/* compiled from: ScarInterstitialAdListener */
public class C12986d extends C12984b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12985c f55731b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12490g f55732c;

    /* renamed from: d */
    private final InterstitialAdLoadCallback f55733d = new C12987a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final FullScreenContentCallback f55734e = new C12988b();

    /* renamed from: z7.d$a */
    /* compiled from: ScarInterstitialAdListener */
    class C12987a extends InterstitialAdLoadCallback {
        C12987a() {
        }

        /* renamed from: a */
        public void onAdLoaded(InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            C12986d.this.f55732c.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(C12986d.this.f55734e);
            C12986d.this.f55731b.mo48161d(interstitialAd);
            C12865b bVar = C12986d.this.f55730a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            C12986d.this.f55732c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    /* renamed from: z7.d$b */
    /* compiled from: ScarInterstitialAdListener */
    class C12988b extends FullScreenContentCallback {
        C12988b() {
        }

        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            C12986d.this.f55732c.onAdClosed();
        }

        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            C12986d.this.f55732c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        public void onAdImpression() {
            super.onAdImpression();
            C12986d.this.f55732c.onAdImpression();
        }

        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            C12986d.this.f55732c.onAdOpened();
        }
    }

    public C12986d(C12490g gVar, C12985c cVar) {
        this.f55732c = gVar;
        this.f55731b = cVar;
    }

    /* renamed from: e */
    public InterstitialAdLoadCallback mo48163e() {
        return this.f55733d;
    }
}
