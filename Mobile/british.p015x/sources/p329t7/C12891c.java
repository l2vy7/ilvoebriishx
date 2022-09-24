package p329t7;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.C12490g;
import p323q7.C12865b;

/* renamed from: t7.c */
/* compiled from: ScarInterstitialAdListener */
public class C12891c {

    /* renamed from: a */
    private InterstitialAd f55573a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C12490g f55574b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C12865b f55575c;

    /* renamed from: d */
    private AdListener f55576d = new C12892a();

    /* renamed from: t7.c$a */
    /* compiled from: ScarInterstitialAdListener */
    class C12892a extends AdListener {
        C12892a() {
        }

        public void onAdClicked() {
            C12891c.this.f55574b.onAdClicked();
        }

        public void onAdClosed() {
            C12891c.this.f55574b.onAdClosed();
        }

        public void onAdLoaded() {
            C12891c.this.f55574b.onAdLoaded();
            if (C12891c.this.f55575c != null) {
                C12891c.this.f55575c.onAdLoaded();
            }
        }

        public void onAdOpened() {
            C12891c.this.f55574b.onAdOpened();
        }
    }

    public C12891c(InterstitialAd interstitialAd, C12490g gVar) {
        this.f55573a = interstitialAd;
        this.f55574b = gVar;
    }

    /* renamed from: c */
    public AdListener mo48061c() {
        return this.f55576d;
    }

    /* renamed from: d */
    public void mo48062d(C12865b bVar) {
        this.f55575c = bVar;
    }
}
