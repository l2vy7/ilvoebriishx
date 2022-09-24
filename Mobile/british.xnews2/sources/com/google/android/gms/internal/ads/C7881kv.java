package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.kv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C7881kv extends C8205tv<C7993nw> {

    /* renamed from: b */
    final /* synthetic */ Context f34486b;

    /* renamed from: c */
    final /* synthetic */ String f34487c;

    /* renamed from: d */
    final /* synthetic */ tc0 f34488d;

    /* renamed from: e */
    final /* synthetic */ C8169sv f34489e;

    C7881kv(C8169sv svVar, Context context, String str, tc0 tc0) {
        this.f34489e = svVar;
        this.f34486b = context;
        this.f34487c = str;
        this.f34488d = tc0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        C8169sv.m37563s(this.f34486b, "native_ad");
        return new C7737gz();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzb(C10489b.m48195m6(this.f34486b), this.f34487c, this.f34488d, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        p00.m35913c(this.f34486b);
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37110h7)).booleanValue()) {
            return this.f34489e.f39071b.mo33403c(this.f34486b, this.f34487c, this.f34488d);
        }
        try {
            IBinder n6 = ((C8029ow) ho0.m32903b(this.f34486b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", C7844jv.f34051a)).mo34016n6(C10489b.m48195m6(this.f34486b), this.f34487c, this.f34488d, 214106000);
            if (n6 == null) {
                return null;
            }
            IInterface queryLocalInterface = n6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof C7993nw ? (C7993nw) queryLocalInterface : new C7919lw(n6);
        } catch (RemoteException | go0 | NullPointerException e) {
            this.f34489e.f39077h = zh0.m21287c(this.f34486b);
            this.f34489e.f39077h.mo19058b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
