package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xq2 extends e03 {

    /* renamed from: a */
    final /* synthetic */ C8386yx f41261a;

    /* renamed from: b */
    final /* synthetic */ zq2 f41262b;

    xq2(zq2 zq2, C8386yx yxVar) {
        this.f41262b = zq2;
        this.f41261a = yxVar;
    }

    /* renamed from: l */
    public final void mo18124l() {
        if (this.f41262b.f42556g != null) {
            try {
                this.f41261a.zze();
            } catch (RemoteException e) {
                co0.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
