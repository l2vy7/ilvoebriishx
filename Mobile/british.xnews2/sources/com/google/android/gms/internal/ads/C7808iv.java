package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p198d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.iv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C7808iv extends C8205tv<C8136rw> {

    /* renamed from: b */
    final /* synthetic */ Context f33529b;

    /* renamed from: c */
    final /* synthetic */ zzbfi f33530c;

    /* renamed from: d */
    final /* synthetic */ String f33531d;

    /* renamed from: e */
    final /* synthetic */ tc0 f33532e;

    /* renamed from: f */
    final /* synthetic */ C8169sv f33533f;

    C7808iv(C8169sv svVar, Context context, zzbfi zzbfi, String str, tc0 tc0) {
        this.f33533f = svVar;
        this.f33529b = context;
        this.f33530c = zzbfi;
        this.f33531d = str;
        this.f33532e = tc0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30801a() {
        C8169sv.m37563s(this.f33529b, IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
        return new C7848jz();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30802b(C7554bx bxVar) throws RemoteException {
        return bxVar.zze(C10489b.m48195m6(this.f33529b), this.f33530c, this.f33531d, this.f33532e, 214106000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30803c() throws RemoteException {
        return this.f33533f.f39070a.mo33762c(this.f33529b, this.f33530c, this.f33531d, this.f33532e, 2);
    }
}
