package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.ev */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C7660ev extends C8205tv<C8136rw> {

    /* renamed from: b */
    final /* synthetic */ Context f31501b;

    /* renamed from: c */
    final /* synthetic */ zzbfi f31502c;

    /* renamed from: d */
    final /* synthetic */ String f31503d;

    /* renamed from: e */
    final /* synthetic */ tc0 f31504e;

    /* renamed from: f */
    final /* synthetic */ C8169sv f31505f;

    C7660ev(C8169sv svVar, Context context, zzbfi zzbfi, String str, tc0 tc0) {
        this.f31505f = svVar;
        this.f31501b = context;
        this.f31502c = zzbfi;
        this.f31503d = str;
        this.f31504e = tc0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        C8169sv.m37563s(this.f31501b, "banner");
        return new C7848jz();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zzd(C10489b.m48195m6(this.f31501b), this.f31502c, this.f31503d, this.f31504e, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        return this.f31505f.f39070a.mo33762c(this.f31501b, this.f31502c, this.f31503d, this.f31504e, 1);
    }
}
