package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class gu0 implements n43 {

    /* renamed from: b */
    public final /* synthetic */ Context f32451b;

    /* renamed from: c */
    public final /* synthetic */ ov0 f32452c;

    /* renamed from: d */
    public final /* synthetic */ String f32453d;

    /* renamed from: e */
    public final /* synthetic */ boolean f32454e;

    /* renamed from: f */
    public final /* synthetic */ boolean f32455f;

    /* renamed from: g */
    public final /* synthetic */ C7497ab f32456g;

    /* renamed from: h */
    public final /* synthetic */ p10 f32457h;

    /* renamed from: i */
    public final /* synthetic */ zzcjf f32458i;

    /* renamed from: j */
    public final /* synthetic */ zzl f32459j;

    /* renamed from: k */
    public final /* synthetic */ zza f32460k;

    /* renamed from: l */
    public final /* synthetic */ C7728gq f32461l;

    /* renamed from: m */
    public final /* synthetic */ ir2 f32462m;

    /* renamed from: n */
    public final /* synthetic */ lr2 f32463n;

    public /* synthetic */ gu0(Context context, ov0 ov0, String str, boolean z, boolean z2, C7497ab abVar, p10 p10, zzcjf zzcjf, e10 e10, zzl zzl, zza zza, C7728gq gqVar, ir2 ir2, lr2 lr2) {
        this.f32451b = context;
        this.f32452c = ov0;
        this.f32453d = str;
        this.f32454e = z;
        this.f32455f = z2;
        this.f32456g = abVar;
        this.f32457h = p10;
        this.f32458i = zzcjf;
        this.f32459j = zzl;
        this.f32460k = zza;
        this.f32461l = gqVar;
        this.f32462m = ir2;
        this.f32463n = lr2;
    }

    public final Object zza() {
        Context context = this.f32451b;
        ov0 ov0 = this.f32452c;
        String str = this.f32453d;
        boolean z = this.f32454e;
        boolean z2 = this.f32455f;
        C7497ab abVar = this.f32456g;
        p10 p10 = this.f32457h;
        zzcjf zzcjf = this.f32458i;
        zzl zzl = this.f32459j;
        zza zza = this.f32460k;
        C7728gq gqVar = this.f32461l;
        ir2 ir2 = this.f32462m;
        lr2 lr2 = this.f32463n;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = ru0.f20701m0;
            nu0 nu0 = new nu0(new ru0(new nv0(context), ov0, str, z, z2, abVar, p10, zzcjf, (e10) null, zzl, zza, gqVar, ir2, lr2));
            nu0.setWebViewClient(zzt.zzq().zzn(nu0, gqVar, z2));
            nu0.setWebChromeClient(new wt0(nu0));
            return nu0;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
