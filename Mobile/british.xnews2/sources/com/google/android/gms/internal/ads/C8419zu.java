package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.zu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C8419zu extends C8205tv<wm0> {

    /* renamed from: b */
    final /* synthetic */ Context f42591b;

    /* renamed from: c */
    final /* synthetic */ tc0 f42592c;

    C8419zu(C8169sv svVar, Context context, tc0 tc0) {
        this.f42591b = context;
        this.f42592c = tc0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzo(C10489b.m48195m6(this.f42591b), this.f42592c, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        try {
            return ((zm0) ho0.m32903b(this.f42591b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", C8383yu.f41996a)).mo35770d0(C10489b.m48195m6(this.f42591b), this.f42592c, 214106000);
        } catch (RemoteException | go0 | NullPointerException unused) {
            return null;
        }
    }
}
