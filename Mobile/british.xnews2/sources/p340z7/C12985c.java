package p340z7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.unity3d.scar.adapter.common.C12485b;
import com.unity3d.scar.adapter.common.C12487d;
import com.unity3d.scar.adapter.common.C12490g;
import p269a8.C11153b;
import p322q7.C12865b;
import p322q7.C12866c;

/* renamed from: z7.c */
/* compiled from: ScarInterstitialAd */
public class C12985c extends C12983a<InterstitialAd> {
    public C12985c(Context context, C11153b bVar, C12866c cVar, C12487d dVar, C12490g gVar) {
        super(context, cVar, bVar, dVar);
        this.f55728e = new C12986d(gVar, this);
    }

    /* renamed from: a */
    public void mo48006a(Activity activity) {
        T t = this.f55724a;
        if (t != null) {
            ((InterstitialAd) t).show(activity);
        } else {
            this.f55729f.handleError(C12485b.m53822a(this.f55726c));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo48160c(AdRequest adRequest, C12865b bVar) {
        InterstitialAd.load(this.f55725b, this.f55726c.mo48009b(), adRequest, ((C12986d) this.f55728e).mo48163e());
    }
}
