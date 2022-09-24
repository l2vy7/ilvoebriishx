package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s71<T> {

    /* renamed from: a */
    private final g02 f38887a;

    /* renamed from: b */
    private final bs2 f38888b;

    /* renamed from: c */
    private final dw2 f38889c;

    /* renamed from: d */
    private final c11 f38890d;

    /* renamed from: e */
    private final n82<T> f38891e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final wf1 f38892f;

    /* renamed from: g */
    private ur2 f38893g;

    /* renamed from: h */
    private final l12 f38894h;

    /* renamed from: i */
    private final r91 f38895i;

    /* renamed from: j */
    private final Executor f38896j;

    /* renamed from: k */
    private final y02 f38897k;

    /* renamed from: l */
    private final w42 f38898l;

    s71(g02 g02, bs2 bs2, dw2 dw2, c11 c11, n82<T> n82, wf1 wf1, ur2 ur2, l12 l12, r91 r91, Executor executor, y02 y02, w42 w42) {
        this.f38887a = g02;
        this.f38888b = bs2;
        this.f38889c = dw2;
        this.f38890d = c11;
        this.f38891e = n82;
        this.f38892f = wf1;
        this.f38893g = ur2;
        this.f38894h = l12;
        this.f38895i = r91;
        this.f38896j = executor;
        this.f38897k = y02;
        this.f38898l = w42;
    }

    /* renamed from: a */
    public final zzbew mo34667a(Throwable th) {
        return us2.m38444b(th, this.f38898l);
    }

    /* renamed from: c */
    public final wf1 mo34668c() {
        return this.f38892f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ ur2 mo34669d(ur2 ur2) throws Exception {
        this.f38890d.mo30841a(ur2);
        return ur2;
    }

    /* renamed from: e */
    public final mb3<zzcdq> mo34670e(zzffu zzffu) {
        hv2 a = this.f38889c.mo35307b(wv2.GET_CACHE_KEY, this.f38895i.mo34521c()).mo35047f(new o71(this, zzffu)).mo35042a();
        bb3.m30658r(a, new q71(this), this.f38896j);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ mb3 mo34671f(zzffu zzffu, zzcdq zzcdq) throws Exception {
        zzcdq.f21158j = zzffu;
        return this.f38894h.mo33227a(zzcdq);
    }

    /* renamed from: g */
    public final mb3<Void> mo34672g(zzcdq zzcdq) {
        hv2 a = this.f38889c.mo35307b(wv2.NOTIFY_CACHE_HIT, this.f38894h.mo33232f(zzcdq)).mo35042a();
        bb3.m30658r(a, new r71(this), this.f38896j);
        return a;
    }

    /* renamed from: h */
    public final mb3<T> mo34673h(mb3<ur2> mb3) {
        tv2<O2> f = this.f38889c.mo35307b(wv2.RENDERER, mb3).mo35046e(new n71(this)).mo35047f(this.f38891e);
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37003V3)).booleanValue()) {
            f = f.mo35050i((long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37011W3)).intValue(), TimeUnit.SECONDS);
        }
        return f.mo35042a();
    }

    /* renamed from: i */
    public final mb3<ur2> mo34674i() {
        zzbfd zzbfd = this.f38888b.f30087d;
        if (zzbfd.f42963y == null && zzbfd.f42958t == null) {
            return mo34675j(this.f38895i.mo34521c());
        }
        dw2 dw2 = this.f38889c;
        return mv2.m34932c(this.f38887a.mo31992c(), wv2.SERVER_TRANSACTION, dw2).mo35042a();
    }

    /* renamed from: j */
    public final mb3<ur2> mo34675j(mb3<zzcdq> mb3) {
        ur2 ur2 = this.f38893g;
        if (ur2 != null) {
            dw2 dw2 = this.f38889c;
            return mv2.m34932c(bb3.m30649i(ur2), wv2.SERVER_TRANSACTION, dw2).mo35042a();
        }
        zzt.zzc().mo34378j();
        return this.f38889c.mo35307b(wv2.SERVER_TRANSACTION, mb3).mo35047f(new p71(this.f38897k)).mo35042a();
    }

    /* renamed from: k */
    public final void mo34676k(ur2 ur2) {
        this.f38893g = ur2;
    }
}
