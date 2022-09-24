package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gb2 extends C7957mw {

    /* renamed from: b */
    private final Context f32217b;

    /* renamed from: c */
    private final uv0 f32218c;

    /* renamed from: d */
    final zr2 f32219d;

    /* renamed from: e */
    final rm1 f32220e = new rm1();

    /* renamed from: f */
    private C7624dw f32221f;

    public gb2(uv0 uv0, Context context, String str) {
        zr2 zr2 = new zr2();
        this.f32219d = zr2;
        this.f32218c = uv0;
        zr2.mo36103H(str);
        this.f32217b = context;
    }

    /* renamed from: H3 */
    public final void mo32037H3(c50 c50, zzbfi zzbfi) {
        this.f32220e.mo34562e(c50);
        this.f32219d.mo36102G(zzbfi);
    }

    /* renamed from: N5 */
    public final void mo32038N5(C7624dw dwVar) {
        this.f32221f = dwVar;
    }

    /* renamed from: P2 */
    public final void mo32039P2(f50 f50) {
        this.f32220e.mo34563f(f50);
    }

    /* renamed from: R2 */
    public final void mo32040R2(s40 s40) {
        this.f32220e.mo34559b(s40);
    }

    /* renamed from: S5 */
    public final void mo32041S5(C7590cx cxVar) {
        this.f32219d.mo36119o(cxVar);
    }

    /* renamed from: U1 */
    public final void mo32042U1(r90 r90) {
        this.f32220e.mo34561d(r90);
    }

    /* renamed from: U5 */
    public final void mo32043U5(PublisherAdViewOptions publisherAdViewOptions) {
        this.f32219d.mo36113c(publisherAdViewOptions);
    }

    /* renamed from: Y5 */
    public final void mo32044Y5(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f32219d.mo36101F(adManagerAdViewOptions);
    }

    /* renamed from: a1 */
    public final void mo32045a1(zzbtz zzbtz) {
        this.f32219d.mo36106K(zzbtz);
    }

    /* renamed from: d6 */
    public final void mo32046d6(p40 p40) {
        this.f32220e.mo34558a(p40);
    }

    /* renamed from: r2 */
    public final void mo32047r2(String str, y40 y40, v40 v40) {
        this.f32220e.mo34560c(str, y40, v40);
    }

    /* renamed from: y2 */
    public final void mo32048y2(zzbnw zzbnw) {
        this.f32219d.mo36110O(zzbnw);
    }

    public final C7882kw zze() {
        tm1 g = this.f32220e.mo34564g();
        this.f32219d.mo36111a(g.mo34987i());
        this.f32219d.mo36112b(g.mo34986h());
        zr2 zr2 = this.f32219d;
        if (zr2.mo36121v() == null) {
            zr2.mo36102G(zzbfi.m40643E0());
        }
        return new hb2(this.f32217b, this.f32218c, this.f32219d, g, this.f32221f);
    }
}
