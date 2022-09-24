package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzby;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q72 implements a52<dm1, rs2, p62> {

    /* renamed from: a */
    private final Context f37921a;

    /* renamed from: b */
    private final uk1 f37922b;

    /* renamed from: c */
    private final Executor f37923c;

    public q72(Context context, uk1 uk1, Executor executor) {
        this.f37921a = context;
        this.f37922b = uk1;
        this.f37923c = executor;
    }

    /* renamed from: c */
    private static final boolean m36362c(ur2 ur2, int i) {
        return ur2.f39936a.f38765a.f30090g.contains(Integer.toString(i));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30307a(ur2 ur2, ir2 ir2, u42 u42) throws gs2, l82 {
        im1 im1;
        ed0 b = ((rs2) u42.f39763b).mo34598b();
        fd0 c = ((rs2) u42.f39763b).mo34599c();
        id0 g = ((rs2) u42.f39763b).mo34603g();
        if (g != null && m36362c(ur2, 6)) {
            im1 = im1.m33256a0(g);
        } else if (b != null && m36362c(ur2, 6)) {
            im1 = im1.m33251E(b);
        } else if (b != null && m36362c(ur2, 2)) {
            im1 = im1.m33249C(b);
        } else if (c != null && m36362c(ur2, 6)) {
            im1 = im1.m33252F(c);
        } else if (c == null || !m36362c(ur2, 1)) {
            throw new l82(1, "No native ad mappers");
        } else {
            im1 = im1.m33250D(c);
        }
        if (ur2.f39936a.f38765a.f30090g.contains(Integer.toString(im1.mo32651K()))) {
            km1 d = this.f37922b.mo35201d(new e71(ur2, ir2, u42.f39762a), new um1(im1), new jo1(c, b, g, (byte[]) null));
            ((p62) u42.f39764c).mo34075o6(d.mo32806g());
            d.mo32496c().mo30921s0(new z11((rs2) u42.f39763b), this.f37923c);
            return d.mo32807h();
        }
        throw new l82(1, "No corresponding native ad listener");
    }

    /* renamed from: b */
    public final void mo30308b(ur2 ur2, ir2 ir2, u42<rs2, p62> u42) throws gs2 {
        bs2 bs2 = ur2.f39936a.f38765a;
        ((rs2) u42.f39763b).mo34614r(this.f37921a, ur2.f39936a.f38765a.f30087d, ir2.f33497w.toString(), zzby.zzl(ir2.f33494t), (zc0) u42.f39764c, bs2.f30092i, bs2.f30090g);
    }
}
