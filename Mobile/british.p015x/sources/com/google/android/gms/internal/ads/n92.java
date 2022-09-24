package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n92 implements a52<yr1, rs2, q62> {

    /* renamed from: a */
    private final Context f35954a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f35955b;

    /* renamed from: c */
    private final ds1 f35956c;

    public n92(Context context, Executor executor, ds1 ds1) {
        this.f35954a = context;
        this.f35955b = executor;
        this.f35956c = ds1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m35111e(ur2 ur2, ir2 ir2, u42<rs2, q62> u42) {
        try {
            ((rs2) u42.f39763b).mo34610n(ur2.f39936a.f38765a.f30087d, ir2.f33497w.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(u42.f39762a);
            co0.zzk(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30307a(ur2 ur2, ir2 ir2, u42 u42) throws gs2, l82 {
        zr1 b = this.f35956c.mo31406b(new e71(ur2, ir2, u42.f39762a), new as1(new j92(u42)));
        b.mo32496c().mo30921s0(new z11((rs2) u42.f39763b), this.f35955b);
        ub1 d = b.mo32497d();
        ka1 a = b.mo32495a();
        ((q62) u42.f39764c).mo34236o6(new m92(this, b.mo32498h(), a, d, b.mo32499i()));
        return b.mo32501k();
    }

    /* renamed from: b */
    public final void mo30308b(ur2 ur2, ir2 ir2, u42<rs2, q62> u42) throws gs2 {
        if (!((rs2) u42.f39763b).mo34597a()) {
            ((q62) u42.f39764c).mo34237p6(new l92(this, ur2, ir2, u42));
            ((rs2) u42.f39763b).mo34607k(this.f35954a, ur2.f39936a.f38765a.f30087d, (String) null, (uj0) u42.f39764c, ir2.f33497w.toString());
            return;
        }
        m35111e(ur2, ir2, u42);
    }
}
