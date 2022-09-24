package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class h52 implements gk1 {

    /* renamed from: a */
    private final zzcjf f32617a;

    /* renamed from: b */
    private final mb3<x31> f32618b;

    /* renamed from: c */
    private final ir2 f32619c;

    /* renamed from: d */
    private final xt0 f32620d;

    /* renamed from: e */
    private final bs2 f32621e;

    /* renamed from: f */
    private final h70 f32622f;

    /* renamed from: g */
    private final boolean f32623g;

    h52(zzcjf zzcjf, mb3<x31> mb3, ir2 ir2, xt0 xt0, bs2 bs2, boolean z, h70 h70) {
        this.f32617a = zzcjf;
        this.f32618b = mb3;
        this.f32619c = ir2;
        this.f32620d = xt0;
        this.f32621e = bs2;
        this.f32623g = z;
        this.f32622f = h70;
    }

    /* renamed from: a */
    public final void mo32020a(boolean z, Context context, ab1 ab1) {
        int i;
        x31 x31 = (x31) bb3.m30657q(this.f32618b);
        this.f32620d.mo18755i0(true);
        zzj zzj = new zzj(this.f32623g ? this.f32622f.mo32359e(true) : true, true, this.f32623g ? this.f32622f.mo32358d() : false, this.f32623g ? this.f32622f.mo32355a() : 0.0f, -1, z, this.f32619c.f33449L, false);
        if (ab1 != null) {
            ab1.mo30336E0();
        }
        zzt.zzj();
        uj1 i2 = x31.mo31938i();
        xt0 xt0 = this.f32620d;
        int i3 = this.f32619c.f33451N;
        if (i3 == -1) {
            zzbfo zzbfo = this.f32621e.f30093j;
            if (zzbfo != null) {
                int i4 = zzbfo.f42983b;
                if (i4 == 1) {
                    i = 7;
                } else if (i4 == 2) {
                    i = 6;
                }
                zzcjf zzcjf = this.f32617a;
                ir2 ir2 = this.f32619c;
                String str = ir2.f33440C;
                nr2 nr2 = ir2.f33494t;
                AdOverlayInfoParcel adOverlayInfoParcel = r4;
                AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((C7659eu) null, (zzo) i2, (zzw) null, xt0, i, zzcjf, str, zzj, nr2.f36096b, nr2.f36095a, this.f32621e.f30089f, ab1);
                zzm.zza(context, adOverlayInfoParcel, true);
            }
            co0.zze("Error setting app open orientation; no targeting orientation available.");
            i3 = this.f32619c.f33451N;
        }
        i = i3;
        zzcjf zzcjf2 = this.f32617a;
        ir2 ir22 = this.f32619c;
        String str2 = ir22.f33440C;
        nr2 nr22 = ir22.f33494t;
        AdOverlayInfoParcel adOverlayInfoParcel3 = adOverlayInfoParcel2;
        AdOverlayInfoParcel adOverlayInfoParcel22 = new AdOverlayInfoParcel((C7659eu) null, (zzo) i2, (zzw) null, xt0, i, zzcjf2, str2, zzj, nr22.f36096b, nr22.f36095a, this.f32621e.f30089f, ab1);
        zzm.zza(context, adOverlayInfoParcel3, true);
    }
}
