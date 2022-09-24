package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import p199d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u82 implements a52<yr1, te0, p62> {

    /* renamed from: a */
    private final Context f39807a;

    /* renamed from: b */
    private final ds1 f39808b;

    public u82(Context context, ds1 ds1) {
        this.f39807a = context;
        this.f39808b = ds1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30307a(ur2 ur2, ir2 ir2, u42 u42) throws gs2, l82 {
        y62 y62 = new y62(ir2, (te0) u42.f39763b, true);
        zr1 b = this.f39808b.mo31406b(new e71(ur2, ir2, u42.f39762a), new as1(y62));
        y62.mo35883b(b.mo30387b());
        ((p62) u42.f39764c).mo34075o6(b.mo32504n());
        return b.mo32501k();
    }

    /* renamed from: b */
    public final void mo30308b(ur2 ur2, ir2 ir2, u42<te0, p62> u42) throws gs2 {
        try {
            ((te0) u42.f39763b).mo31560j(ir2.f33460W);
            if (ur2.f39936a.f38765a.f30098o.f38265a == 3) {
                ((te0) u42.f39763b).mo31556Q2(ir2.f33455R, ir2.f33497w.toString(), ur2.f39936a.f38765a.f30087d, C10489b.m48195m6(this.f39807a), new t82(this, u42, (s82) null), (zc0) u42.f39764c);
            } else {
                ((te0) u42.f39763b).mo31559h2(ir2.f33455R, ir2.f33497w.toString(), ur2.f39936a.f38765a.f30087d, C10489b.m48195m6(this.f39807a), new t82(this, u42, (s82) null), (zc0) u42.f39764c);
            }
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
