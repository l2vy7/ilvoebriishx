package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w62 implements r42<zi1> {

    /* renamed from: a */
    private final Context f40710a;

    /* renamed from: b */
    private final vs1 f40711b;

    /* renamed from: c */
    private final xj1 f40712c;

    /* renamed from: d */
    private final bs2 f40713d;

    /* renamed from: e */
    private final Executor f40714e;

    /* renamed from: f */
    private final zzcjf f40715f;

    /* renamed from: g */
    private final h70 f40716g;

    /* renamed from: h */
    private final boolean f40717h = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37264z6)).booleanValue();

    public w62(Context context, zzcjf zzcjf, bs2 bs2, Executor executor, xj1 xj1, vs1 vs1, h70 h70) {
        this.f40710a = context;
        this.f40713d = bs2;
        this.f40712c = xj1;
        this.f40714e = executor;
        this.f40715f = zzcjf;
        this.f40711b = vs1;
        this.f40716g = h70;
    }

    /* renamed from: a */
    public final boolean mo31509a(ur2 ur2, ir2 ir2) {
        nr2 nr2 = ir2.f33494t;
        return (nr2 == null || nr2.f36095a == null) ? false : true;
    }

    /* renamed from: b */
    public final mb3<zi1> mo31510b(ur2 ur2, ir2 ir2) {
        zs1 zs1 = new zs1();
        mb3<zi1> n = bb3.m30654n(bb3.m30649i(null), new t62(this, ir2, ur2, zs1), this.f40714e);
        n.zzc(new u62(zs1), this.f40714e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo35561c(ir2 ir2, ur2 ur2, zs1 zs1, Object obj) throws Exception {
        ir2 ir22 = ir2;
        ur2 ur22 = ur2;
        xt0 a = this.f40711b.mo35491a(this.f40713d.f30088e, ir22, ur22.f39937b.f39519b);
        a.mo18738Y(ir22.f33457T);
        zs1.mo36129a(this.f40710a, (View) a);
        uo0 uo0 = new uo0();
        xj1 xj1 = this.f40712c;
        e71 e71 = new e71(ur22, ir22, (String) null);
        v62 v62 = r1;
        v62 v622 = new v62(this.f40710a, this.f40715f, uo0, ir2, a, this.f40713d, this.f40717h, this.f40716g);
        aj1 c = xj1.mo35762c(e71, new ej1(v62, a));
        uo0.zzd(c);
        c.mo30387b().mo30921s0(new r62(a), po0.f37727f);
        c.mo30391k().mo35267i(a, true, this.f40717h ? this.f40716g : null);
        c.mo30391k();
        ir2 ir23 = ir2;
        nr2 nr2 = ir23.f33494t;
        return bb3.m30653m(us1.m38435j(a, nr2.f36096b, nr2.f36095a), new s62(this, a, ir23, c), this.f40714e);
    }
}
