package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.mv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C7956mv extends C8205tv<C7846jx> {

    /* renamed from: b */
    final /* synthetic */ Context f35625b;

    /* renamed from: c */
    final /* synthetic */ C8169sv f35626c;

    C7956mv(C8169sv svVar, Context context) {
        this.f35626c = svVar;
        this.f35625b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        C8169sv.m37563s(this.f35625b, "mobile_ads_settings");
        return new C7922lz();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzg(C10489b.m48195m6(this.f35625b), 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        p00.m35913c(this.f35625b);
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37110h7)).booleanValue()) {
            return this.f35626c.f39072c.mo31056c(this.f35625b);
        }
        try {
            IBinder n6 = ((C7883kx) ho0.m32903b(this.f35625b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", C7918lv.f35268a)).mo33206n6(C10489b.m48195m6(this.f35625b), 214106000);
            if (n6 == null) {
                return null;
            }
            IInterface queryLocalInterface = n6.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof C7846jx ? (C7846jx) queryLocalInterface : new C7735gx(n6);
        } catch (RemoteException | go0 | NullPointerException e) {
            this.f35626c.f39077h = zh0.m21287c(this.f35625b);
            this.f35626c.f39077h.mo19058b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
