package p334w7;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.C12485b;
import com.unity3d.scar.adapter.common.C12487d;
import p322q7.C12864a;
import p322q7.C12865b;
import p322q7.C12866c;
import p336x7.C12949b;

/* renamed from: w7.a */
/* compiled from: ScarAdBase */
public abstract class C12934a implements C12864a {

    /* renamed from: a */
    protected Context f55628a;

    /* renamed from: b */
    protected C12866c f55629b;

    /* renamed from: c */
    protected C12949b f55630c;

    /* renamed from: d */
    protected C12487d f55631d;

    public C12934a(Context context, C12866c cVar, C12949b bVar, C12487d dVar) {
        this.f55628a = context;
        this.f55629b = cVar;
        this.f55630c = bVar;
        this.f55631d = dVar;
    }

    /* renamed from: b */
    public void mo48101b(C12865b bVar) {
        C12949b bVar2 = this.f55630c;
        if (bVar2 != null) {
            mo48102c(bVar, new AdRequest.Builder().setAdInfo(new AdInfo(bVar2.mo48117c(), this.f55629b.mo48008a())).build());
            return;
        }
        this.f55631d.handleError(C12485b.m53828g(this.f55629b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo48102c(C12865b bVar, AdRequest adRequest);
}
