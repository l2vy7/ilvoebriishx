package p341z7;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.C12491h;
import p323q7.C12865b;

/* renamed from: z7.f */
/* compiled from: ScarRewardedAdListener */
public class C12990f extends C12984b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12989e f55737b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C12491h f55738c;

    /* renamed from: d */
    private final RewardedAdLoadCallback f55739d = new C12991a();

    /* renamed from: e */
    private final OnUserEarnedRewardListener f55740e = new C12992b();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final FullScreenContentCallback f55741f = new C12993c();

    /* renamed from: z7.f$a */
    /* compiled from: ScarRewardedAdListener */
    class C12991a extends RewardedAdLoadCallback {
        C12991a() {
        }

        /* renamed from: a */
        public void onAdLoaded(RewardedAd rewardedAd) {
            super.onAdLoaded(rewardedAd);
            C12990f.this.f55738c.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(C12990f.this.f55741f);
            C12990f.this.f55737b.mo48161d(rewardedAd);
            C12865b bVar = C12990f.this.f55730a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            C12990f.this.f55738c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    /* renamed from: z7.f$b */
    /* compiled from: ScarRewardedAdListener */
    class C12992b implements OnUserEarnedRewardListener {
        C12992b() {
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            C12990f.this.f55738c.onUserEarnedReward();
        }
    }

    /* renamed from: z7.f$c */
    /* compiled from: ScarRewardedAdListener */
    class C12993c extends FullScreenContentCallback {
        C12993c() {
        }

        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            C12990f.this.f55738c.onAdClosed();
        }

        public void onAdFailedToShowFullScreenContent(AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            C12990f.this.f55738c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        public void onAdImpression() {
            super.onAdImpression();
            C12990f.this.f55738c.onAdImpression();
        }

        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            C12990f.this.f55738c.onAdOpened();
        }
    }

    public C12990f(C12491h hVar, C12989e eVar) {
        this.f55738c = hVar;
        this.f55737b = eVar;
    }

    /* renamed from: e */
    public RewardedAdLoadCallback mo48165e() {
        return this.f55739d;
    }

    /* renamed from: f */
    public OnUserEarnedRewardListener mo48166f() {
        return this.f55740e;
    }
}
