package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f72 implements a52<zi1, te0, p62> {

    /* renamed from: a */
    private final Context f31660a;

    /* renamed from: b */
    private final xj1 f31661b;

    public f72(Context context, xj1 xj1) {
        this.f31660a = context;
        this.f31661b = xj1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30307a(ur2 ur2, ir2 ir2, u42 u42) throws gs2, l82 {
        y62 y62 = new y62(ir2, (te0) u42.f39763b, false);
        aj1 c = this.f31661b.mo35762c(new e71(ur2, ir2, u42.f39762a), new ej1(y62, (xt0) null));
        y62.mo35883b(c.mo30387b());
        ((p62) u42.f39764c).mo34075o6(c.mo32805f());
        return c.mo30389i();
    }

    /* renamed from: b */
    public final void mo30308b(ur2 ur2, ir2 ir2, u42<te0, p62> u42) throws gs2 {
        try {
            ((te0) u42.f39763b).mo31560j(ir2.f33460W);
            ((te0) u42.f39763b).mo31555Q1(ir2.f33455R, ir2.f33497w.toString(), ur2.f39936a.f38765a.f30087d, C10489b.m48195m6(this.f31660a), new e72(this, u42, (d72) null), (zc0) u42.f39764c);
        } catch (RemoteException e) {
            throw new gs2(e);
        }
    }
}
