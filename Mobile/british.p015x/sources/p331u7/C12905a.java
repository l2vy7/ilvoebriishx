package p331u7;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.C12484a;

/* renamed from: u7.a */
/* compiled from: QueryInfoCallback */
public class C12905a extends QueryInfoGenerationCallback {

    /* renamed from: a */
    private C12484a f55596a;

    /* renamed from: b */
    private C12906b f55597b;

    public C12905a(C12906b bVar, C12484a aVar) {
        this.f55596a = aVar;
        this.f55597b = bVar;
    }

    public void onFailure(String str) {
        this.f55597b.mo48082e(str);
        this.f55596a.mo46890b();
    }

    public void onSuccess(QueryInfo queryInfo) {
        this.f55597b.mo48083f(queryInfo);
        this.f55596a.mo46890b();
    }
}
