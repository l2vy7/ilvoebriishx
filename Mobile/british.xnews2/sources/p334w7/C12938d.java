package p334w7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.C12485b;
import com.unity3d.scar.adapter.common.C12487d;
import com.unity3d.scar.adapter.common.C12491h;
import p322q7.C12865b;
import p322q7.C12866c;
import p336x7.C12949b;

/* renamed from: w7.d */
/* compiled from: ScarRewardedAd */
public class C12938d extends C12934a {

    /* renamed from: e */
    private RewardedAd f55639e;

    /* renamed from: f */
    private C12939e f55640f;

    public C12938d(Context context, C12949b bVar, C12866c cVar, C12487d dVar, C12491h hVar) {
        super(context, cVar, bVar, dVar);
        RewardedAd rewardedAd = new RewardedAd(this.f55628a, this.f55629b.mo48009b());
        this.f55639e = rewardedAd;
        this.f55640f = new C12939e(rewardedAd, hVar);
    }

    /* renamed from: a */
    public void mo48006a(Activity activity) {
        if (this.f55639e.isLoaded()) {
            this.f55639e.show(activity, this.f55640f.mo48105a());
        } else {
            this.f55631d.handleError(C12485b.m53822a(this.f55629b));
        }
    }

    /* renamed from: c */
    public void mo48102c(C12865b bVar, AdRequest adRequest) {
        this.f55640f.mo48107c(bVar);
        this.f55639e.loadAd(adRequest, this.f55640f.mo48106b());
    }
}
