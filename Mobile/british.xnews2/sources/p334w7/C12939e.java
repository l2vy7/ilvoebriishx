package p334w7;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.C12491h;
import p322q7.C12865b;

/* renamed from: w7.e */
/* compiled from: ScarRewardedAdListener */
public class C12939e {

    /* renamed from: a */
    private RewardedAd f55641a;

    /* renamed from: b */
    private C12491h f55642b;

    /* renamed from: c */
    private C12865b f55643c;

    /* renamed from: d */
    private RewardedAdLoadCallback f55644d = new C12940a();

    /* renamed from: e */
    private RewardedAdCallback f55645e = new C12941b();

    /* renamed from: w7.e$a */
    /* compiled from: ScarRewardedAdListener */
    class C12940a extends RewardedAdLoadCallback {
        C12940a() {
        }
    }

    /* renamed from: w7.e$b */
    /* compiled from: ScarRewardedAdListener */
    class C12941b extends RewardedAdCallback {
        C12941b() {
        }
    }

    public C12939e(RewardedAd rewardedAd, C12491h hVar) {
        this.f55641a = rewardedAd;
        this.f55642b = hVar;
    }

    /* renamed from: a */
    public RewardedAdCallback mo48105a() {
        return this.f55645e;
    }

    /* renamed from: b */
    public RewardedAdLoadCallback mo48106b() {
        return this.f55644d;
    }

    /* renamed from: c */
    public void mo48107c(C12865b bVar) {
        this.f55643c = bVar;
    }
}
