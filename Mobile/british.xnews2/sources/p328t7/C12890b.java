package p328t7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.C12485b;
import com.unity3d.scar.adapter.common.C12487d;
import com.unity3d.scar.adapter.common.C12490g;
import p322q7.C12865b;
import p322q7.C12866c;
import p330u7.C12906b;

/* renamed from: t7.b */
/* compiled from: ScarInterstitialAd */
public class C12890b extends C12889a {

    /* renamed from: e */
    private InterstitialAd f55571e;

    /* renamed from: f */
    private C12891c f55572f;

    public C12890b(Context context, C12906b bVar, C12866c cVar, C12487d dVar, C12490g gVar) {
        super(context, cVar, bVar, dVar);
        InterstitialAd interstitialAd = new InterstitialAd(this.f55567a);
        this.f55571e = interstitialAd;
        interstitialAd.setAdUnitId(this.f55568b.mo48009b());
        this.f55572f = new C12891c(this.f55571e, gVar);
    }

    /* renamed from: a */
    public void mo48006a(Activity activity) {
        if (this.f55571e.isLoaded()) {
            this.f55571e.show();
        } else {
            this.f55570d.handleError(C12485b.m53822a(this.f55568b));
        }
    }

    /* renamed from: c */
    public void mo48060c(C12865b bVar, AdRequest adRequest) {
        this.f55571e.setAdListener(this.f55572f.mo48061c());
        this.f55572f.mo48062d(bVar);
        this.f55571e.loadAd(adRequest);
    }
}
