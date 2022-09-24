package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v62 implements gk1 {

    /* renamed from: a */
    private final Context f40315a;

    /* renamed from: b */
    private final zzcjf f40316b;

    /* renamed from: c */
    private final mb3<aj1> f40317c;

    /* renamed from: d */
    private final ir2 f40318d;

    /* renamed from: e */
    private final xt0 f40319e;

    /* renamed from: f */
    private final bs2 f40320f;

    /* renamed from: g */
    private final h70 f40321g;

    /* renamed from: h */
    private final boolean f40322h;

    v62(Context context, zzcjf zzcjf, mb3<aj1> mb3, ir2 ir2, xt0 xt0, bs2 bs2, boolean z, h70 h70) {
        this.f40315a = context;
        this.f40316b = zzcjf;
        this.f40317c = mb3;
        this.f40318d = ir2;
        this.f40319e = xt0;
        this.f40320f = bs2;
        this.f40321g = h70;
        this.f40322h = z;
    }

    /* renamed from: a */
    public final void mo32020a(boolean z, Context context, ab1 ab1) {
        aj1 aj1 = (aj1) bb3.m30657q(this.f40317c);
        this.f40319e.mo18755i0(true);
        boolean e = this.f40322h ? this.f40321g.mo32359e(false) : false;
        zzt.zzp();
        zzj zzj = new zzj(e, com.google.android.gms.ads.internal.util.zzt.zzM(this.f40315a), this.f40322h ? this.f40321g.mo32358d() : false, this.f40322h ? this.f40321g.mo32355a() : 0.0f, -1, z, this.f40318d.f33449L, false);
        if (ab1 != null) {
            ab1.mo30336E0();
        }
        zzt.zzj();
        uj1 j = aj1.mo30390j();
        xt0 xt0 = this.f40319e;
        ir2 ir2 = this.f40318d;
        int i = ir2.f33451N;
        zzcjf zzcjf = this.f40316b;
        String str = ir2.f33440C;
        nr2 nr2 = ir2.f33494t;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((C7659eu) null, (zzo) j, (zzw) null, xt0, i, zzcjf, str, zzj, nr2.f36096b, nr2.f36095a, this.f40320f.f30089f, ab1);
        zzm.zza(context, adOverlayInfoParcel, true);
    }
}
