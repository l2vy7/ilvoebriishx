package p337x7;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.C12484a;

/* renamed from: x7.a */
/* compiled from: QueryInfoCallback */
public class C12948a extends QueryInfoGenerationCallback {

    /* renamed from: a */
    private C12484a f55656a;

    /* renamed from: b */
    private C12949b f55657b;

    public C12948a(C12949b bVar, C12484a aVar) {
        this.f55656a = aVar;
        this.f55657b = bVar;
    }

    public void onFailure(String str) {
        this.f55657b.mo48119e(str);
        this.f55656a.mo46890b();
    }

    public void onSuccess(QueryInfo queryInfo) {
        this.f55657b.mo48120f(queryInfo);
        this.f55656a.mo46890b();
    }
}
