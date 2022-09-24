package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a82 extends z72<m41> {

    /* renamed from: a */
    private final uv0 f29555a;

    /* renamed from: b */
    private final w91 f29556b;

    /* renamed from: c */
    private final la2 f29557c;

    /* renamed from: d */
    private final fg1 f29558d;

    /* renamed from: e */
    private final pk1 f29559e;

    /* renamed from: f */
    private final ed1 f29560f;

    /* renamed from: g */
    private final ViewGroup f29561g;

    public a82(uv0 uv0, w91 w91, la2 la2, fg1 fg1, pk1 pk1, ed1 ed1, ViewGroup viewGroup) {
        this.f29555a = uv0;
        this.f29556b = w91;
        this.f29557c = la2;
        this.f29558d = fg1;
        this.f29559e = pk1;
        this.f29560f = ed1;
        this.f29561g = viewGroup;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final mb3<m41> mo30323c(bs2 bs2, Bundle bundle) {
        j51 l = this.f29555a.mo35290l();
        w91 w91 = this.f29556b;
        w91.mo35594f(bs2);
        w91.mo35592d(bundle);
        l.mo32854h(w91.mo35595g());
        l.mo32857n(this.f29558d);
        l.mo32856l(this.f29557c);
        l.mo32853d(this.f29559e);
        l.mo32855i(new i61(this.f29560f));
        l.mo32852c(new j41(this.f29561g));
        s71<m41> d = l.zzj().mo33034d();
        return d.mo34673h(d.mo34674i());
    }
}
