package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u72 implements a52<dm1, te0, p62> {

    /* renamed from: a */
    private final Context f39799a;

    /* renamed from: b */
    private final uk1 f39800b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public id0 f39801c;

    /* renamed from: d */
    private final zzcjf f39802d;

    public u72(Context context, uk1 uk1, zzcjf zzcjf) {
        this.f39799a = context;
        this.f39800b = uk1;
        this.f39802d = zzcjf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30307a(ur2 ur2, ir2 ir2, u42 u42) throws gs2, l82 {
        if (ur2.f39936a.f38765a.f30090g.contains(Integer.toString(6))) {
            im1 a0 = im1.m33256a0(this.f39801c);
            if (ur2.f39936a.f38765a.f30090g.contains(Integer.toString(a0.mo32651K()))) {
                km1 d = this.f39800b.mo35201d(new e71(ur2, ir2, u42.f39762a), new um1(a0), new jo1((fd0) null, (ed0) null, this.f39801c, (byte[]) null));
                ((p62) u42.f39764c).mo34075o6(d.mo32805f());
                return d.mo32807h();
            }
            throw new l82(1, "No corresponding native ad listener");
        }
        throw new l82(2, "Unified must be used for RTB.");
    }

    /* renamed from: b */
    public final void mo30308b(ur2 ur2, ir2 ir2, u42<te0, p62> u42) throws gs2 {
        try {
            ((te0) u42.f39763b).mo31560j(ir2.f33460W);
            if (this.f39802d.f43038d < ((Integer) C8311wv.m39277c().mo18570b(p00.f37122j1)).intValue()) {
                ((te0) u42.f39763b).mo31554N1(ir2.f33455R, ir2.f33497w.toString(), ur2.f39936a.f38765a.f30087d, C10489b.m48195m6(this.f39799a), new t72(this, u42, (s72) null), (zc0) u42.f39764c);
            } else {
                ((te0) u42.f39763b).mo31553M4(ir2.f33455R, ir2.f33497w.toString(), ur2.f39936a.f38765a.f30087d, C10489b.m48195m6(this.f39799a), new t72(this, u42, (s72) null), (zc0) u42.f39764c, ur2.f39936a.f38765a.f30092i);
            }
        } catch (RemoteException e) {
            throw new gs2(e);
        }
    }
}
