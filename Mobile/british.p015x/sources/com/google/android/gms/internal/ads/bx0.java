package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bx0 extends sj2 {

    /* renamed from: a */
    private final al2 f30124a;

    /* renamed from: b */
    private final uz0 f30125b;

    /* renamed from: c */
    private final bx0 f30126c = this;

    /* renamed from: d */
    private final iv3<Integer> f30127d;

    /* renamed from: e */
    private final iv3<pj2> f30128e;

    /* renamed from: f */
    private final iv3<String> f30129f;

    /* renamed from: g */
    private final iv3<yj2> f30130g;

    /* renamed from: h */
    private final iv3<ek2> f30131h;

    /* renamed from: i */
    private final iv3<ik2> f30132i;

    /* renamed from: j */
    private final iv3<qk2> f30133j;

    /* renamed from: k */
    private final iv3<xk2> f30134k;

    /* renamed from: l */
    private final iv3<pl2> f30135l;

    /* renamed from: m */
    private final iv3<Boolean> f30136m;

    /* renamed from: n */
    private final iv3<kl2> f30137n;

    /* renamed from: o */
    private final iv3<String> f30138o;

    /* renamed from: p */
    private final iv3<vu1> f30139p;

    /* renamed from: q */
    private final iv3<vu1> f30140q;

    /* renamed from: r */
    private final iv3<vu1> f30141r;

    /* renamed from: s */
    private final iv3<vu1> f30142s;

    /* renamed from: t */
    private final iv3<Map<wv2, vu1>> f30143t;

    /* renamed from: u */
    private final iv3<Set<yh1<ew2>>> f30144u;

    /* renamed from: v */
    private final iv3<Set<yh1<ew2>>> f30145v;

    /* renamed from: w */
    private final iv3 f30146w;

    /* renamed from: x */
    private final iv3<dw2> f30147x;

    /* synthetic */ bx0(uz0 uz0, al2 al2, ax0 ax0) {
        al2 al22 = al2;
        this.f30125b = uz0;
        this.f30124a = al22;
        cl2 cl2 = new cl2(al22);
        this.f30127d = cl2;
        this.f30128e = new rj2(w01.f40646a, uz0.f40175i, uz0.f40187o, wu2.m39274a(), cl2);
        bl2 bl2 = new bl2(al22);
        this.f30129f = bl2;
        this.f30130g = new ak2(mw0.f35631a, uz0.f40175i, bl2, wu2.m39274a());
        this.f30131h = new gk2(w01.f40646a, cl2, uz0.f40175i, uz0.f40162b0, uz0.f40187o, wu2.m39274a(), bl2);
        this.f30132i = new kk2(q01.f37821a, wu2.m39274a(), uz0.f40175i);
        this.f30133j = new sk2(s01.f38829a, wu2.m39274a(), bl2);
        this.f30134k = new zk2(u01.f39705a, uz0.f40187o, uz0.f40175i);
        this.f30135l = new rl2(wu2.m39274a());
        dl2 dl2 = new dl2(al22);
        this.f30136m = dl2;
        bl2 bl22 = bl2;
        this.f30137n = new ml2(uz0.f40162b0, dl2, y01.f41627a, wu2.m39274a(), bl22, uz0.f40187o);
        el2 el2 = new el2(al22);
        this.f30138o = el2;
        iv3<vu1> b = tu3.m38017b(ou1.m35835a());
        this.f30139p = b;
        iv3<vu1> b2 = tu3.m38017b(lu1.m34558a());
        this.f30140q = b2;
        iv3<vu1> b3 = tu3.m38017b(qu1.m36744a());
        this.f30141r = b3;
        iv3<vu1> b4 = tu3.m38017b(su1.m37552a());
        this.f30142s = b4;
        xu3 b5 = yu3.m40028b(4);
        b5.mo35801b(wv2.GMS_SIGNALS, b);
        b5.mo35801b(wv2.BUILD_URL, b2);
        b5.mo35801b(wv2.HTTP, b3);
        b5.mo35801b(wv2.PRE_PROCESS, b4);
        yu3 c = b5.mo35802c();
        this.f30143t = c;
        iv3<Set<yh1<ew2>>> b6 = tu3.m38017b(new tu1(el2, uz0.f40175i, wu2.m39274a(), c));
        this.f30144u = b6;
        fv3 a = gv3.m32718a(0, 1);
        a.mo31934a(b6);
        gv3 c2 = a.mo31936c();
        this.f30145v = c2;
        gw2 gw2 = new gw2(c2);
        this.f30146w = gw2;
        this.f30147x = tu3.m38017b(new fw2(wu2.m39274a(), uz0.f40187o, gw2));
    }

    /* renamed from: d */
    private final vj2 m30851d() {
        fn0 fn0 = new fn0();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        String d = this.f30124a.mo30414d();
        cv3.m31156b(d);
        return new vj2(fn0, nb3, d, this.f30124a.mo30412b(), this.f30124a.mo30411a(), (byte[]) null);
    }

    /* renamed from: e */
    private final uk2 m30852e() {
        C8424zz zzVar = new C8424zz();
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        List<String> f = this.f30124a.mo30416f();
        cv3.m31156b(f);
        return new uk2(zzVar, nb3, f, (List<String>) null);
    }

    /* renamed from: a */
    public final cj2<JSONObject> mo30808a() {
        bn0 bn0 = new bn0();
        dn0 dn0 = new dn0();
        Object zzb = this.f30125b.f40210z0.zzb();
        vj2 d = m30851d();
        uk2 e = m30852e();
        ou3<pj2> a = tu3.m38016a(this.f30128e);
        ou3<yj2> a2 = tu3.m38016a(this.f30130g);
        ou3<ek2> a3 = tu3.m38016a(this.f30131h);
        ou3<ik2> a4 = tu3.m38016a(this.f30132i);
        ou3<qk2> a5 = tu3.m38016a(this.f30133j);
        ou3<xk2> a6 = tu3.m38016a(this.f30134k);
        ou3<pl2> a7 = tu3.m38016a(this.f30135l);
        ou3<kl2> a8 = tu3.m38016a(this.f30137n);
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        return hl2.m32884a(bn0, dn0, zzb, d, e, a, a2, a3, a4, a5, a6, a7, a8, nb3, (ScheduledExecutorService) this.f30125b.f40187o.zzb());
    }

    /* renamed from: b */
    public final cj2<JSONObject> mo30809b() {
        nb3 nb3 = po0.f37722a;
        cv3.m31156b(nb3);
        bn0 bn0 = new bn0();
        cv3.m31156b(nb3);
        String c = this.f30124a.mo30413c();
        cv3.m31156b(c);
        hh2 hh2 = new hh2(new qk2(bn0, nb3, c, (byte[]) null), 0, (ScheduledExecutorService) this.f30125b.f40187o.zzb());
        Context a = this.f30125b.f40161b.mo35803a();
        cv3.m31156b(a);
        hh2 hh22 = new hh2(new xk2(new ch0(), (ScheduledExecutorService) this.f30125b.f40187o.zzb(), a, (byte[]) null), ((Long) C8311wv.m39277c().mo18570b(p00.f36874F2)).longValue(), (ScheduledExecutorService) this.f30125b.f40187o.zzb());
        fn0 fn0 = new fn0();
        Context a2 = this.f30125b.f40161b.mo35803a();
        cv3.m31156b(a2);
        cv3.m31156b(nb3);
        hh2 hh23 = new hh2(new pj2(fn0, a2, (ScheduledExecutorService) this.f30125b.f40187o.zzb(), nb3, this.f30124a.mo30411a(), (byte[]) null), 0, (ScheduledExecutorService) this.f30125b.f40187o.zzb());
        cv3.m31156b(nb3);
        hh2 hh24 = new hh2(new pl2(nb3), 0, (ScheduledExecutorService) this.f30125b.f40187o.zzb());
        gl2 gl2 = gl2.f32361a;
        Context a3 = this.f30125b.f40161b.mo35803a();
        cv3.m31156b(a3);
        String c2 = this.f30124a.mo30413c();
        cv3.m31156b(c2);
        cv3.m31156b(nb3);
        yj2 yj2 = new yj2((vi0) null, a3, c2, nb3);
        C8272vp vpVar = new C8272vp();
        cv3.m31156b(nb3);
        Context a4 = this.f30125b.f40161b.mo35803a();
        cv3.m31156b(a4);
        fn0 fn02 = new fn0();
        int a5 = this.f30124a.mo30411a();
        Context a6 = this.f30125b.f40161b.mo35803a();
        cv3.m31156b(a6);
        cv3.m31156b(nb3);
        String c3 = this.f30124a.mo30413c();
        cv3.m31156b(c3);
        hh2 hh25 = hh23;
        Object[] objArr = {new ik2(vpVar, nb3, a4, (byte[]) null), m30852e(), m30851d(), new ek2(fn02, a5, a6, (nn0) this.f30125b.f40162b0.zzb(), (ScheduledExecutorService) this.f30125b.f40187o.zzb(), nb3, c3, (byte[]) null), (zi2) this.f30125b.f40210z0.zzb()};
        return new cj2<>(nb3, a73.m20185y(hh2, hh22, hh25, hh24, gl2, yj2, objArr));
    }

    /* renamed from: c */
    public final dw2 mo30810c() {
        return this.f30147x.zzb();
    }
}
