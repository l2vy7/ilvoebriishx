package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f52 implements r42<f41> {

    /* renamed from: a */
    private final a41 f31637a;

    /* renamed from: b */
    private final Context f31638b;

    /* renamed from: c */
    private final vs1 f31639c;

    /* renamed from: d */
    private final bs2 f31640d;

    /* renamed from: e */
    private final Executor f31641e;

    /* renamed from: f */
    private final zzcjf f31642f;

    /* renamed from: g */
    private final h70 f31643g;

    /* renamed from: h */
    private final boolean f31644h = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37264z6)).booleanValue();

    public f52(a41 a41, Context context, Executor executor, vs1 vs1, bs2 bs2, zzcjf zzcjf, h70 h70) {
        this.f31638b = context;
        this.f31637a = a41;
        this.f31641e = executor;
        this.f31639c = vs1;
        this.f31640d = bs2;
        this.f31642f = zzcjf;
        this.f31643g = h70;
    }

    /* renamed from: a */
    public final boolean mo31509a(ur2 ur2, ir2 ir2) {
        nr2 nr2 = ir2.f33494t;
        return (nr2 == null || nr2.f36095a == null) ? false : true;
    }

    /* renamed from: b */
    public final mb3<f41> mo31510b(ur2 ur2, ir2 ir2) {
        zs1 zs1 = new zs1();
        mb3<f41> n = bb3.m30654n(bb3.m30649i(null), new d52(this, ir2, ur2, zs1), this.f31641e);
        n.zzc(new e52(zs1), this.f31641e);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo31774c(ir2 ir2, ur2 ur2, zs1 zs1, Object obj) throws Exception {
        ir2 ir22 = ir2;
        ur2 ur22 = ur2;
        xt0 a = this.f31639c.mo35491a(this.f31640d.f30088e, ir22, ur22.f39937b.f39519b);
        a.mo18738Y(ir22.f33457T);
        zs1.mo36129a(this.f31638b, (View) a);
        uo0 uo0 = new uo0();
        a41 a41 = this.f31637a;
        e71 e71 = new e71(ur22, ir22, (String) null);
        h52 h52 = r1;
        h52 h522 = new h52(this.f31642f, uo0, ir2, a, this.f31640d, this.f31644h, this.f31643g);
        x31 a2 = a41.mo30304a(e71, new ej1(h52, a), new y31(ir22.f33461X));
        a2.mo31939j().mo35267i(a, false, this.f31644h ? this.f31643g : null);
        uo0.zzd(a2);
        a2.mo30387b().mo30921s0(new b52(a), po0.f37727f);
        a2.mo31939j();
        nr2 nr2 = ir22.f33494t;
        return bb3.m30653m(us1.m38435j(a, nr2.f36096b, nr2.f36095a), new c52(this, a, ir22, a2), this.f31641e);
    }
}
