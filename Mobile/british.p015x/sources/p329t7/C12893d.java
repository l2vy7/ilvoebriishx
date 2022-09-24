package p329t7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.C12485b;
import com.unity3d.scar.adapter.common.C12487d;
import com.unity3d.scar.adapter.common.C12491h;
import p323q7.C12865b;
import p323q7.C12866c;
import p331u7.C12906b;

/* renamed from: t7.d */
/* compiled from: ScarRewardedAd */
public class C12893d extends C12889a {

    /* renamed from: e */
    private RewardedAd f55578e;

    /* renamed from: f */
    private C12894e f55579f;

    public C12893d(Context context, C12906b bVar, C12866c cVar, C12487d dVar, C12491h hVar) {
        super(context, cVar, bVar, dVar);
        RewardedAd rewardedAd = new RewardedAd(this.f55567a, this.f55568b.mo48009b());
        this.f55578e = rewardedAd;
        this.f55579f = new C12894e(rewardedAd, hVar);
    }

    /* renamed from: a */
    public void mo48006a(Activity activity) {
        if (this.f55578e.isLoaded()) {
            this.f55578e.show(activity, this.f55579f.mo48063a());
        } else {
            this.f55570d.handleError(C12485b.m53822a(this.f55568b));
        }
    }

    /* renamed from: c */
    public void mo48060c(C12865b bVar, AdRequest adRequest) {
        this.f55579f.mo48065c(bVar);
        this.f55578e.loadAd(adRequest, this.f55579f.mo48064b());
    }
}
