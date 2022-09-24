package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.xu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C8346xu extends C8205tv<yg0> {

    /* renamed from: b */
    final /* synthetic */ Activity f41329b;

    /* renamed from: c */
    final /* synthetic */ C8169sv f41330c;

    C8346xu(C8169sv svVar, Activity activity) {
        this.f41330c = svVar;
        this.f41329b = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        C8169sv.m37563s(this.f41329b, "ad_overlay");
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzl(C10489b.m48195m6(this.f41329b));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        p00.m35913c(this.f41329b);
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37110h7)).booleanValue()) {
            return this.f41330c.f39075f.mo35424c(this.f41329b);
        }
        try {
            return xg0.zzF(((bh0) ho0.m32903b(this.f41329b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", C8310wu.f40902a)).zze(C10489b.m48195m6(this.f41329b)));
        } catch (RemoteException | go0 | NullPointerException e) {
            this.f41330c.f39077h = zh0.m21287c(this.f41329b.getApplicationContext());
            this.f41330c.f39077h.mo19058b(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
