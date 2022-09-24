package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.gv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C7733gv extends C8205tv<C8136rw> {

    /* renamed from: b */
    final /* synthetic */ Context f32471b;

    /* renamed from: c */
    final /* synthetic */ zzbfi f32472c;

    /* renamed from: d */
    final /* synthetic */ String f32473d;

    /* renamed from: e */
    final /* synthetic */ tc0 f32474e;

    /* renamed from: f */
    final /* synthetic */ C8169sv f32475f;

    C7733gv(C8169sv svVar, Context context, zzbfi zzbfi, String str, tc0 tc0) {
        this.f32475f = svVar;
        this.f32471b = context;
        this.f32472c = zzbfi;
        this.f32473d = str;
        this.f32474e = tc0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        C8169sv.m37563s(this.f32471b, "app_open");
        return new C7848jz();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzc(C10489b.m48195m6(this.f32471b), this.f32472c, this.f32473d, this.f32474e, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        return this.f32475f.f39070a.mo33762c(this.f32471b, this.f32472c, this.f32473d, this.f32474e, 4);
    }
}
