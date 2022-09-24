package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.bv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C7552bv extends C8205tv<mg0> {

    /* renamed from: b */
    final /* synthetic */ Context f30116b;

    /* renamed from: c */
    final /* synthetic */ tc0 f30117c;

    C7552bv(C8169sv svVar, Context context, tc0 tc0) {
        this.f30116b = context;
        this.f30117c = tc0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzk(C10489b.m48195m6(this.f30116b), this.f30117c, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        try {
            return ((pg0) ho0.m32903b(this.f30116b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", C7517av.f29770a)).mo33694d0(C10489b.m48195m6(this.f30116b), this.f30117c, 214106000);
        } catch (RemoteException | go0 | NullPointerException unused) {
            return null;
        }
    }
}
