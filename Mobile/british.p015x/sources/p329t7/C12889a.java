package p329t7;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.C12485b;
import com.unity3d.scar.adapter.common.C12487d;
import p323q7.C12864a;
import p323q7.C12865b;
import p323q7.C12866c;
import p331u7.C12906b;

/* renamed from: t7.a */
/* compiled from: ScarAdBase */
public abstract class C12889a implements C12864a {

    /* renamed from: a */
    protected Context f55567a;

    /* renamed from: b */
    protected C12866c f55568b;

    /* renamed from: c */
    protected C12906b f55569c;

    /* renamed from: d */
    protected C12487d f55570d;

    public C12889a(Context context, C12866c cVar, C12906b bVar, C12487d dVar) {
        this.f55567a = context;
        this.f55568b = cVar;
        this.f55569c = bVar;
        this.f55570d = dVar;
    }

    /* renamed from: b */
    public void mo48059b(C12865b bVar) {
        C12906b bVar2 = this.f55569c;
        if (bVar2 != null) {
            mo48060c(bVar, new AdRequest.Builder().setAdInfo(new AdInfo(bVar2.mo48080c(), this.f55568b.mo48008a())).build());
            return;
        }
        this.f55570d.handleError(C12485b.m53828g(this.f55568b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo48060c(C12865b bVar, AdRequest adRequest);
}
