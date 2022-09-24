package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.rv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C8135rv extends C8205tv<bk0> {

    /* renamed from: b */
    final /* synthetic */ Context f38779b;

    /* renamed from: c */
    final /* synthetic */ String f38780c;

    /* renamed from: d */
    final /* synthetic */ tc0 f38781d;

    /* renamed from: e */
    final /* synthetic */ C8169sv f38782e;

    C8135rv(C8169sv svVar, Context context, String str, tc0 tc0) {
        this.f38782e = svVar;
        this.f38779b = context;
        this.f38780c = str;
        this.f38781d = tc0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        C8169sv.m37563s(this.f38779b, "rewarded");
        return new C8068pz();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzn(C10489b.m48195m6(this.f38779b), this.f38780c, this.f38781d, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        return ok0.m35746a(this.f38779b, this.f38780c, this.f38781d);
    }
}
