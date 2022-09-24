package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x72 extends z72<w61> {

    /* renamed from: a */
    private final uv0 f41064a;

    /* renamed from: b */
    private final pk1 f41065b;

    /* renamed from: c */
    private final w91 f41066c;

    /* renamed from: d */
    private final fg1 f41067d;

    public x72(uv0 uv0, pk1 pk1, w91 w91, fg1 fg1) {
        this.f41064a = uv0;
        this.f41065b = pk1;
        this.f41066c = w91;
        this.f41067d = fg1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final mb3<w61> mo30323c(bs2 bs2, Bundle bundle) {
        tk1 o = this.f41064a.mo35293o();
        w91 w91 = this.f41066c;
        w91.mo35594f(bs2);
        w91.mo35592d(bundle);
        o.mo34972j(w91.mo35595g());
        o.mo34973m(this.f41067d);
        o.mo34971d(this.f41065b);
        o.mo34970c(new j41((ViewGroup) null));
        s71<w61> a = o.zzg().mo35198a();
        return a.mo34673h(a.mo34674i());
    }
}
