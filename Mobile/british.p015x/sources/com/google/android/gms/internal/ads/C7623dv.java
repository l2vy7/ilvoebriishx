package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.p196h5.OnH5AdsEventListener;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.dv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C7623dv extends C8205tv<d80> {

    /* renamed from: b */
    final /* synthetic */ Context f31008b;

    /* renamed from: c */
    final /* synthetic */ tc0 f31009c;

    /* renamed from: d */
    final /* synthetic */ OnH5AdsEventListener f31010d;

    C7623dv(C8169sv svVar, Context context, tc0 tc0, OnH5AdsEventListener onH5AdsEventListener) {
        this.f31008b = context;
        this.f31009c = tc0;
        this.f31010d = onH5AdsEventListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo30801a() {
        return new k80();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzj(C10489b.m48195m6(this.f31008b), this.f31009c, 214106000, new x70(this.f31010d));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        try {
            return ((g80) ho0.m32903b(this.f31008b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", C7588cv.f30497a)).mo31502s2(C10489b.m48195m6(this.f31008b), this.f31009c, 214106000, new x70(this.f31010d));
        } catch (RemoteException | go0 | NullPointerException unused) {
            return null;
        }
    }
}
