package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class hu0 implements ga3 {

    /* renamed from: a */
    public final /* synthetic */ Context f32843a;

    /* renamed from: b */
    public final /* synthetic */ C7497ab f32844b;

    /* renamed from: c */
    public final /* synthetic */ zzcjf f32845c;

    /* renamed from: d */
    public final /* synthetic */ zza f32846d;

    /* renamed from: e */
    public final /* synthetic */ String f32847e;

    public /* synthetic */ hu0(Context context, C7497ab abVar, zzcjf zzcjf, zza zza, String str) {
        this.f32843a = context;
        this.f32844b = abVar;
        this.f32845c = zzcjf;
        this.f32846d = zza;
        this.f32847e = str;
    }

    public final mb3 zza() {
        Context context = this.f32843a;
        C7497ab abVar = this.f32844b;
        zzcjf zzcjf = this.f32845c;
        zza zza = this.f32846d;
        String str = this.f32847e;
        zzt.zzz();
        xt0 a = ku0.m20660a(context, ov0.m35840a(), "", false, false, abVar, (p10) null, zzcjf, (e10) null, (zzl) null, zza, C7728gq.m32636a(), (ir2) null, (lr2) null);
        to0 c = to0.m37927c(a);
        a.mo18793u0().mo18251F0(new fu0(c));
        a.loadUrl(str);
        return c;
    }
}
