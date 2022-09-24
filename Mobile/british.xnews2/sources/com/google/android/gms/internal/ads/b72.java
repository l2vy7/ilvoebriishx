package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzby;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b72 implements a52<zi1, rs2, p62> {

    /* renamed from: a */
    private final Context f29920a;

    /* renamed from: b */
    private final xj1 f29921b;

    /* renamed from: c */
    private final zzcjf f29922c;

    /* renamed from: d */
    private final Executor f29923d;

    public b72(Context context, zzcjf zzcjf, xj1 xj1, Executor executor) {
        this.f29920a = context;
        this.f29922c = zzcjf;
        this.f29921b = xj1;
        this.f29923d = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30307a(ur2 ur2, ir2 ir2, u42 u42) throws gs2, l82 {
        aj1 c = this.f29921b.mo35762c(new e71(ur2, ir2, u42.f39762a), new ej1(new z62(this, u42), (xt0) null));
        c.mo32496c().mo30921s0(new z11((rs2) u42.f39763b), this.f29923d);
        ((p62) u42.f39764c).mo34075o6(c.mo32806g());
        return c.mo30389i();
    }

    /* renamed from: b */
    public final void mo30308b(ur2 ur2, ir2 ir2, u42<rs2, p62> u42) throws gs2 {
        ((rs2) u42.f39763b).mo34613q(this.f29920a, ur2.f39936a.f38765a.f30087d, ir2.f33497w.toString(), zzby.zzl(ir2.f33494t), (zc0) u42.f39764c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo30632c(u42 u42, boolean z, Context context, ab1 ab1) throws fk1 {
        try {
            ((rs2) u42.f39763b).mo34620x(z);
            if (this.f29922c.f43038d < ((Integer) C8311wv.m39277c().mo18570b(p00.f37242x0)).intValue()) {
                ((rs2) u42.f39763b).mo34621y();
            } else {
                ((rs2) u42.f39763b).mo34622z(context);
            }
        } catch (gs2 e) {
            co0.zzi("Cannot show interstitial.");
            throw new fk1(e.getCause());
        }
    }
}
