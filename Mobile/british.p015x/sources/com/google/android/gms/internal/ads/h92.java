package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h92 implements r42<yr1> {

    /* renamed from: a */
    private final Context f32677a;

    /* renamed from: b */
    private final vs1 f32678b;

    /* renamed from: c */
    private final ds1 f32679c;

    /* renamed from: d */
    private final bs2 f32680d;

    /* renamed from: e */
    private final Executor f32681e;

    /* renamed from: f */
    private final zzcjf f32682f;

    /* renamed from: g */
    private final h70 f32683g;

    /* renamed from: h */
    private final boolean f32684h = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37264z6)).booleanValue();

    public h92(Context context, zzcjf zzcjf, bs2 bs2, Executor executor, ds1 ds1, vs1 vs1, h70 h70) {
        this.f32677a = context;
        this.f32680d = bs2;
        this.f32679c = ds1;
        this.f32681e = executor;
        this.f32682f = zzcjf;
        this.f32678b = vs1;
        this.f32683g = h70;
    }

    /* renamed from: a */
    public final boolean mo31509a(ur2 ur2, ir2 ir2) {
        nr2 nr2 = ir2.f33494t;
        return (nr2 == null || nr2.f36095a == null) ? false : true;
    }

    /* renamed from: b */
    public final mb3<yr1> mo31510b(ur2 ur2, ir2 ir2) {
        zs1 zs1 = new zs1();
        mb3<yr1> n = bb3.m30654n(bb3.m30649i(null), new b92(this, ir2, ur2, zs1), this.f32681e);
        n.zzc(new d92(zs1), this.f32681e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo32374c(ir2 ir2, ur2 ur2, zs1 zs1, Object obj) throws Exception {
        ir2 ir22 = ir2;
        ur2 ur22 = ur2;
        xt0 a = this.f32678b.mo35491a(this.f32680d.f30088e, ir22, ur22.f39937b.f39519b);
        a.mo18738Y(ir22.f33457T);
        zs1.mo36129a(this.f32677a, (View) a);
        uo0 uo0 = new uo0();
        ds1 ds1 = this.f32679c;
        e71 e71 = new e71(ur22, ir22, (String) null);
        g92 g92 = r1;
        g92 g922 = new g92(this.f32677a, this.f32678b, this.f32680d, this.f32682f, ir2, uo0, a, this.f32683g, this.f32684h);
        zr1 b = ds1.mo31406b(e71, new as1(g92, a));
        uo0.zzd(b);
        v70.m38737b(a, b.mo32499i());
        b.mo30387b().mo30921s0(new z82(a), po0.f37727f);
        b.mo32502l().mo35267i(a, true, this.f32684h ? this.f32683g : null);
        b.mo32502l();
        ir2 ir23 = ir2;
        nr2 nr2 = ir23.f33494t;
        return bb3.m30653m(us1.m38435j(a, nr2.f36096b, nr2.f36095a), new a92(this, a, ir23, b), this.f32681e);
    }
}
