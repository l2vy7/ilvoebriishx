package p335w7;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.scar.adapter.common.C12490g;
import p323q7.C12865b;

/* renamed from: w7.c */
/* compiled from: ScarInterstitialAdListener */
public class C12936c {

    /* renamed from: a */
    private InterstitialAd f55634a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C12490g f55635b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C12865b f55636c;

    /* renamed from: d */
    private AdListener f55637d = new C12937a();

    /* renamed from: w7.c$a */
    /* compiled from: ScarInterstitialAdListener */
    class C12937a extends AdListener {
        C12937a() {
        }

        public void onAdClicked() {
            C12936c.this.f55635b.onAdClicked();
        }

        public void onAdClosed() {
            C12936c.this.f55635b.onAdClosed();
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            C12936c.this.f55635b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        public void onAdLoaded() {
            C12936c.this.f55635b.onAdLoaded();
            if (C12936c.this.f55636c != null) {
                C12936c.this.f55636c.onAdLoaded();
            }
        }

        public void onAdOpened() {
            C12936c.this.f55635b.onAdOpened();
        }
    }

    public C12936c(InterstitialAd interstitialAd, C12490g gVar) {
        this.f55634a = interstitialAd;
        this.f55635b = gVar;
    }

    /* renamed from: c */
    public AdListener mo48103c() {
        return this.f55637d;
    }

    /* renamed from: d */
    public void mo48104d(C12865b bVar) {
        this.f55636c = bVar;
    }
}
