package p341z7;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.C12485b;
import com.unity3d.scar.adapter.common.C12487d;
import com.unity3d.scar.adapter.common.C12491h;
import p270a8.C11153b;
import p323q7.C12865b;
import p323q7.C12866c;

/* renamed from: z7.e */
/* compiled from: ScarRewardedAd */
public class C12989e extends C12983a<RewardedAd> {
    public C12989e(Context context, C11153b bVar, C12866c cVar, C12487d dVar, C12491h hVar) {
        super(context, cVar, bVar, dVar);
        this.f55728e = new C12990f(hVar, this);
    }

    /* renamed from: a */
    public void mo48006a(Activity activity) {
        T t = this.f55724a;
        if (t != null) {
            ((RewardedAd) t).show(activity, ((C12990f) this.f55728e).mo48166f());
        } else {
            this.f55729f.handleError(C12485b.m53822a(this.f55726c));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo48160c(AdRequest adRequest, C12865b bVar) {
        RewardedAd.load(this.f55725b, this.f55726c.mo48009b(), adRequest, ((C12990f) this.f55728e).mo48165e());
    }
}
