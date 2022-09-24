package p328t7;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.C12491h;
import p322q7.C12865b;

/* renamed from: t7.e */
/* compiled from: ScarRewardedAdListener */
public class C12894e {

    /* renamed from: a */
    private RewardedAd f55580a;

    /* renamed from: b */
    private C12491h f55581b;

    /* renamed from: c */
    private C12865b f55582c;

    /* renamed from: d */
    private RewardedAdLoadCallback f55583d = new C12895a();

    /* renamed from: e */
    private RewardedAdCallback f55584e = new C12896b();

    /* renamed from: t7.e$a */
    /* compiled from: ScarRewardedAdListener */
    class C12895a extends RewardedAdLoadCallback {
        C12895a() {
        }
    }

    /* renamed from: t7.e$b */
    /* compiled from: ScarRewardedAdListener */
    class C12896b extends RewardedAdCallback {
        C12896b() {
        }
    }

    public C12894e(RewardedAd rewardedAd, C12491h hVar) {
        this.f55580a = rewardedAd;
        this.f55581b = hVar;
    }

    /* renamed from: a */
    public RewardedAdCallback mo48063a() {
        return this.f55584e;
    }

    /* renamed from: b */
    public RewardedAdLoadCallback mo48064b() {
        return this.f55583d;
    }

    /* renamed from: c */
    public void mo48065c(C12865b bVar) {
        this.f55582c = bVar;
    }
}
