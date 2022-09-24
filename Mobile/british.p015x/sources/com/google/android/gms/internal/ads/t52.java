package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzaw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t52 implements r42<m41> {

    /* renamed from: a */
    private final k51 f39277a;

    /* renamed from: b */
    private final Context f39278b;

    /* renamed from: c */
    private final vs1 f39279c;

    /* renamed from: d */
    private final bs2 f39280d;

    /* renamed from: e */
    private final Executor f39281e;

    /* renamed from: f */
    private final p33<ir2, zzaw> f39282f;

    public t52(k51 k51, Context context, Executor executor, vs1 vs1, bs2 bs2, p33<ir2, zzaw> p33) {
        this.f39278b = context;
        this.f39277a = k51;
        this.f39281e = executor;
        this.f39279c = vs1;
        this.f39280d = bs2;
        this.f39282f = p33;
    }

    /* renamed from: a */
    public final boolean mo31509a(ur2 ur2, ir2 ir2) {
        nr2 nr2 = ir2.f33494t;
        return (nr2 == null || nr2.f36095a == null) ? false : true;
    }

    /* renamed from: b */
    public final mb3<m41> mo31510b(ur2 ur2, ir2 ir2) {
        return bb3.m30654n(bb3.m30649i(null), new q52(this, ur2, ir2), this.f39281e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo34855c(ur2 ur2, ir2 ir2, Object obj) throws Exception {
        View view;
        zzbfi a = fs2.m32243a(this.f39278b, ir2.f33496v);
        xt0 a2 = this.f39279c.mo35491a(a, ir2, ur2.f39937b.f39519b);
        a2.mo18738Y(ir2.f33457T);
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36901I5)).booleanValue() || !ir2.f33473e0) {
            view = new ys1(this.f39278b, (View) a2, this.f39282f.apply(ir2));
        } else {
            view = d61.m31252a(this.f39278b, (View) a2, ir2);
        }
        n41 a3 = this.f39277a.mo33031a(new e71(ur2, ir2, (String) null), new u41(view, a2, new n52(a2), fs2.m32245c(a)));
        a3.mo33629j().mo35267i(a2, false, (h70) null);
        fb1 b = a3.mo30387b();
        o52 o52 = new o52(a2);
        nb3 nb3 = po0.f37727f;
        b.mo30921s0(o52, nb3);
        a3.mo33629j();
        nr2 nr2 = ir2.f33494t;
        mb3<?> j = us1.m38435j(a2, nr2.f36096b, nr2.f36095a);
        if (ir2.f33447J) {
            j.zzc(new r52(a2), this.f39281e);
        }
        j.zzc(new s52(this, a2), this.f39281e);
        return bb3.m30653m(j, new p52(a3), nb3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo34856d(xt0 xt0) {
        xt0.mo18796w0();
        uu0 zzs = xt0.zzs();
        zzbkq zzbkq = this.f39280d.f30084a;
        if (zzbkq != null && zzs != null) {
            zzs.mo35276r6(zzbkq);
        }
    }
}
