package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.qv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C8100qv extends C8205tv<a40> {

    /* renamed from: b */
    final /* synthetic */ View f38286b;

    /* renamed from: c */
    final /* synthetic */ HashMap f38287c;

    /* renamed from: d */
    final /* synthetic */ HashMap f38288d;

    /* renamed from: e */
    final /* synthetic */ C8169sv f38289e;

    C8100qv(C8169sv svVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.f38289e = svVar;
        this.f38286b = view;
        this.f38287c = hashMap;
        this.f38288d = hashMap2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        C8169sv.m37563s(this.f38286b.getContext(), "native_ad_view_holder_delegate");
        return new C7996nz();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzi(C10489b.m48195m6(this.f38286b), C10489b.m48195m6(this.f38287c), C10489b.m48195m6(this.f38288d));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        p00.m35913c(this.f38286b.getContext());
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37110h7)).booleanValue()) {
            return this.f38289e.f39076g.mo34662c(this.f38286b, this.f38287c, this.f38288d);
        }
        try {
            return z30.m40156n6(((d40) ho0.m32903b(this.f38286b.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", C8064pv.f37772a)).mo30620z4(C10489b.m48195m6(this.f38286b), C10489b.m48195m6(this.f38287c), C10489b.m48195m6(this.f38288d)));
        } catch (RemoteException | go0 | NullPointerException e) {
            this.f38289e.f39077h = zh0.m21287c(this.f38286b.getContext());
            this.f38289e.f39077h.mo19058b(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
