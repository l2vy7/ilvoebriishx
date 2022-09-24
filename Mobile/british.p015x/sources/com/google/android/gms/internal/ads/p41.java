package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class p41 extends m41 {

    /* renamed from: i */
    private final Context f37324i;

    /* renamed from: j */
    private final View f37325j;

    /* renamed from: k */
    private final xt0 f37326k;

    /* renamed from: l */
    private final jr2 f37327l;

    /* renamed from: m */
    private final m61 f37328m;

    /* renamed from: n */
    private final tm1 f37329n;

    /* renamed from: o */
    private final ii1 f37330o;

    /* renamed from: p */
    private final ou3<db2> f37331p;

    /* renamed from: q */
    private final Executor f37332q;

    /* renamed from: r */
    private zzbfi f37333r;

    p41(n61 n61, Context context, jr2 jr2, View view, xt0 xt0, m61 m61, tm1 tm1, ii1 ii1, ou3<db2> ou3, Executor executor) {
        super(n61);
        this.f37324i = context;
        this.f37325j = view;
        this.f37326k = xt0;
        this.f37327l = jr2;
        this.f37328m = m61;
        this.f37329n = tm1;
        this.f37330o = ii1;
        this.f37331p = ou3;
        this.f37332q = executor;
    }

    /* renamed from: o */
    public static /* synthetic */ void m35951o(p41 p41) {
        if (p41.f37329n.mo34983e() != null) {
            try {
                p41.f37329n.mo34983e().mo30306A3(p41.f37331p.zzb(), C10489b.m48195m6(p41.f37324i));
            } catch (RemoteException e) {
                co0.zzh("RemoteException when notifyAdLoad is called", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo31311b() {
        this.f37332q.execute(new o41(this));
        super.mo31311b();
    }

    /* renamed from: h */
    public final int mo33468h() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36901I5)).booleanValue() && this.f36294b.f33473e0) {
            if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36909J5)).booleanValue()) {
                return 0;
            }
        }
        return this.f36293a.f39937b.f39519b.f35216c;
    }

    /* renamed from: i */
    public final View mo33469i() {
        return this.f37325j;
    }

    /* renamed from: j */
    public final C7774hy mo33470j() {
        try {
            return this.f37328m.zza();
        } catch (gs2 unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final jr2 mo33471k() {
        zzbfi zzbfi = this.f37333r;
        if (zzbfi != null) {
            return fs2.m32245c(zzbfi);
        }
        ir2 ir2 = this.f36294b;
        if (ir2.f33463Z) {
            for (String next : ir2.f33464a) {
                if (next == null || !next.contains("FirstParty")) {
                }
            }
            return new jr2(this.f37325j.getWidth(), this.f37325j.getHeight(), false);
        }
        return fs2.m32244b(this.f36294b.f33493s, this.f37327l);
    }

    /* renamed from: l */
    public final jr2 mo33472l() {
        return this.f37327l;
    }

    /* renamed from: m */
    public final void mo33473m() {
        this.f37330o.zza();
    }

    /* renamed from: n */
    public final void mo33474n(ViewGroup viewGroup, zzbfi zzbfi) {
        xt0 xt0;
        if (viewGroup != null && (xt0 = this.f37326k) != null) {
            xt0.mo18759k0(ov0.m35842c(zzbfi));
            viewGroup.setMinimumHeight(zzbfi.f42966d);
            viewGroup.setMinimumWidth(zzbfi.f42969g);
            this.f37333r = zzbfi;
        }
    }
}
