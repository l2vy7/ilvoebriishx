package p340z7;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.C12485b;
import com.unity3d.scar.adapter.common.C12487d;
import p269a8.C11153b;
import p322q7.C12864a;
import p322q7.C12865b;
import p322q7.C12866c;

/* renamed from: z7.a */
/* compiled from: ScarAdBase */
public abstract class C12983a<T> implements C12864a {

    /* renamed from: a */
    protected T f55724a;

    /* renamed from: b */
    protected Context f55725b;

    /* renamed from: c */
    protected C12866c f55726c;

    /* renamed from: d */
    protected C11153b f55727d;

    /* renamed from: e */
    protected C12984b f55728e;

    /* renamed from: f */
    protected C12487d f55729f;

    public C12983a(Context context, C12866c cVar, C11153b bVar, C12487d dVar) {
        this.f55725b = context;
        this.f55726c = cVar;
        this.f55727d = bVar;
        this.f55729f = dVar;
    }

    /* renamed from: b */
    public void mo48159b(C12865b bVar) {
        C11153b bVar2 = this.f55727d;
        if (bVar2 != null) {
            AdRequest build = new AdRequest.Builder().setAdInfo(new AdInfo(bVar2.mo43452c(), this.f55726c.mo48008a())).build();
            this.f55728e.mo48162a(bVar);
            mo48160c(build, bVar);
            return;
        }
        this.f55729f.handleError(C12485b.m53828g(this.f55726c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo48160c(AdRequest adRequest, C12865b bVar);

    /* renamed from: d */
    public void mo48161d(T t) {
        this.f55724a = t;
    }
}
