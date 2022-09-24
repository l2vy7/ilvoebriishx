package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.ov */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C8028ov extends C8205tv<u30> {

    /* renamed from: b */
    final /* synthetic */ FrameLayout f36601b;

    /* renamed from: c */
    final /* synthetic */ FrameLayout f36602c;

    /* renamed from: d */
    final /* synthetic */ Context f36603d;

    /* renamed from: e */
    final /* synthetic */ C8169sv f36604e;

    C8028ov(C8169sv svVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f36604e = svVar;
        this.f36601b = frameLayout;
        this.f36602c = frameLayout2;
        this.f36603d = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        C8169sv.m37563s(this.f36603d, "native_ad_view_delegate");
        return new C7960mz();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzh(C10489b.m48195m6(this.f36601b), C10489b.m48195m6(this.f36602c));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        p00.m35913c(this.f36603d);
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37110h7)).booleanValue()) {
            return this.f36604e.f39073d.mo34500c(this.f36603d, this.f36601b, this.f36602c);
        }
        try {
            return t30.m37668n6(((x30) ho0.m32903b(this.f36603d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", C7992nv.f36152a)).mo35355Y3(C10489b.m48195m6(this.f36603d), C10489b.m48195m6(this.f36601b), C10489b.m48195m6(this.f36602c), 214106000));
        } catch (RemoteException | go0 | NullPointerException e) {
            this.f36604e.f39077h = zh0.m21287c(this.f36603d);
            this.f36604e.f39077h.mo19058b(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
