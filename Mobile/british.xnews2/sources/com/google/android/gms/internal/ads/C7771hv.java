package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.hv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C7771hv extends C8205tv<C8136rw> {

    /* renamed from: b */
    final /* synthetic */ Context f32852b;

    /* renamed from: c */
    final /* synthetic */ zzbfi f32853c;

    /* renamed from: d */
    final /* synthetic */ String f32854d;

    /* renamed from: e */
    final /* synthetic */ C8169sv f32855e;

    C7771hv(C8169sv svVar, Context context, zzbfi zzbfi, String str) {
        this.f32855e = svVar;
        this.f32852b = context;
        this.f32853c = zzbfi;
        this.f32854d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        C8169sv.m37563s(this.f32852b, "search");
        return new C7848jz();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzf(C10489b.m48195m6(this.f32852b), this.f32853c, this.f32854d, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        return this.f32855e.f39070a.mo33762c(this.f32852b, this.f32853c, this.f32854d, (tc0) null, 3);
    }
}
