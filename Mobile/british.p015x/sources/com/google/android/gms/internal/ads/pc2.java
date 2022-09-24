package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class pc2 implements pa1 {

    /* renamed from: b */
    public final /* synthetic */ cc2 f37580b;

    /* renamed from: c */
    public final /* synthetic */ r90 f37581c;

    public /* synthetic */ pc2(cc2 cc2, r90 r90) {
        this.f37580b = cc2;
        this.f37581c = r90;
    }

    /* renamed from: d */
    public final void mo18436d(zzbew zzbew) {
        cc2 cc2 = this.f37580b;
        r90 r90 = this.f37581c;
        cc2.mo18436d(zzbew);
        if (r90 != null) {
            try {
                r90.mo34097m(zzbew);
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
        if (r90 != null) {
            try {
                r90.mo34096l(zzbew.f42935b);
            } catch (RemoteException e2) {
                co0.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
