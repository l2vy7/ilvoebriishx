package p270a8;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.C12484a;

/* renamed from: a8.a */
/* compiled from: QueryInfoCallback */
public class C11152a extends QueryInfoGenerationCallback {

    /* renamed from: a */
    private C12484a f50164a;

    /* renamed from: b */
    private C11153b f50165b;

    public C11152a(C11153b bVar, C12484a aVar) {
        this.f50164a = aVar;
        this.f50165b = bVar;
    }

    public void onFailure(String str) {
        this.f50165b.mo43454e(str);
        this.f50164a.mo46890b();
    }

    public void onSuccess(QueryInfo queryInfo) {
        this.f50165b.mo43455f(queryInfo);
        this.f50164a.mo46890b();
    }
}
