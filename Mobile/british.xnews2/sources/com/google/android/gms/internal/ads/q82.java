package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q82 implements a52<yr1, rs2, p62> {

    /* renamed from: a */
    private final Context f37936a;

    /* renamed from: b */
    private final Executor f37937b;

    /* renamed from: c */
    private final ds1 f37938c;

    public q82(Context context, Executor executor, ds1 ds1) {
        this.f37936a = context;
        this.f37937b = executor;
        this.f37938c = ds1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30307a(ur2 ur2, ir2 ir2, u42 u42) throws gs2, l82 {
        zr1 b = this.f37938c.mo31406b(new e71(ur2, ir2, u42.f39762a), new as1(new p82(u42)));
        b.mo32496c().mo30921s0(new z11((rs2) u42.f39763b), this.f37937b);
        ((p62) u42.f39764c).mo34075o6(b.mo32503m());
        return b.mo32501k();
    }

    /* renamed from: b */
    public final void mo30308b(ur2 ur2, ir2 ir2, u42<rs2, p62> u42) throws gs2 {
        try {
            bs2 bs2 = ur2.f39936a.f38765a;
            if (bs2.f30098o.f38265a == 3) {
                ((rs2) u42.f39763b).mo34616t(this.f37936a, bs2.f30087d, ir2.f33497w.toString(), (zc0) u42.f39764c);
            } else {
                ((rs2) u42.f39763b).mo34615s(this.f37936a, bs2.f30087d, ir2.f33497w.toString(), (zc0) u42.f39764c);
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(u42.f39762a);
            co0.zzk(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }
}
