package p335w7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.C12485b;
import com.unity3d.scar.adapter.common.C12487d;
import com.unity3d.scar.adapter.common.C12490g;
import p323q7.C12865b;
import p323q7.C12866c;
import p337x7.C12949b;

/* renamed from: w7.b */
/* compiled from: ScarInterstitialAd */
public class C12935b extends C12934a {

    /* renamed from: e */
    private InterstitialAd f55632e;

    /* renamed from: f */
    private C12936c f55633f;

    public C12935b(Context context, C12949b bVar, C12866c cVar, C12487d dVar, C12490g gVar) {
        super(context, cVar, bVar, dVar);
        InterstitialAd interstitialAd = new InterstitialAd(this.f55628a);
        this.f55632e = interstitialAd;
        interstitialAd.setAdUnitId(this.f55629b.mo48009b());
        this.f55633f = new C12936c(this.f55632e, gVar);
    }

    /* renamed from: a */
    public void mo48006a(Activity activity) {
        if (this.f55632e.isLoaded()) {
            this.f55632e.show();
        } else {
            this.f55631d.handleError(C12485b.m53822a(this.f55629b));
        }
    }

    /* renamed from: c */
    public void mo48102c(C12865b bVar, AdRequest adRequest) {
        this.f55632e.setAdListener(this.f55633f.mo48103c());
        this.f55633f.mo48104d(bVar);
        this.f55632e.loadAd(adRequest);
    }
}
