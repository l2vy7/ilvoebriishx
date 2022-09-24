package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jp2 implements tc2<zi1> {

    /* renamed from: a */
    private final Context f33965a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f33966b;

    /* renamed from: c */
    private final uv0 f33967c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final cc2 f33968d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final kq2 f33969e;

    /* renamed from: f */
    private l10 f33970f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final gx2 f33971g;
    @GuardedBy("this")

    /* renamed from: h */
    private final zr2 f33972h;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: i */
    public mb3<zi1> f33973i;

    public jp2(Context context, Executor executor, uv0 uv0, cc2 cc2, kq2 kq2, zr2 zr2) {
        this.f33965a = context;
        this.f33966b = executor;
        this.f33967c = uv0;
        this.f33968d = cc2;
        this.f33972h = zr2;
        this.f33969e = kq2;
        this.f33971g = uv0.mo35283b();
    }

    /* renamed from: a */
    public final boolean mo18423a(zzbfd zzbfd, String str, rc2 rc2, sc2<? super zi1> sc2) {
        xj1 xj1;
        ex2 p = ex2.m31961p(this.f33965a, 7, 4, zzbfd);
        if (str == null) {
            co0.zzg("Ad unit ID should not be null for interstitial ad.");
            this.f33966b.execute(new dp2(this));
            if (p != null) {
                gx2 gx2 = this.f33971g;
                p.mo31676g(false);
                gx2.mo32302a(p.mo31678i());
            }
            return false;
        } else if (zza()) {
            if (p != null) {
                gx2 gx22 = this.f33971g;
                p.mo31676g(false);
                gx22.mo32302a(p.mo31678i());
            }
            return false;
        } else {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36838A6)).booleanValue() && zzbfd.f42945g) {
                this.f33967c.mo35297s().mo33432l(true);
            }
            zzbfi zzbfi = ((cp2) rc2).f30451a;
            zr2 zr2 = this.f33972h;
            zr2.mo36103H(str);
            zr2.mo36102G(zzbfi);
            zr2.mo36114d(zzbfd);
            bs2 f = zr2.mo36116f();
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37021X5)).booleanValue()) {
                wj1 n = this.f33967c.mo35292n();
                w91 w91 = new w91();
                w91.mo35591c(this.f33965a);
                w91.mo35594f(f);
                n.mo35514o(w91.mo35595g());
                dg1 dg1 = new dg1();
                dg1.mo31250m(this.f33968d, this.f33966b);
                dg1.mo31251n(this.f33968d, this.f33966b);
                n.mo35512e(dg1.mo31254q());
                n.mo35513f(new la2(this.f33970f));
                xj1 = n.zzf();
            } else {
                dg1 dg12 = new dg1();
                kq2 kq2 = this.f33969e;
                if (kq2 != null) {
                    dg12.mo31245h(kq2, this.f33966b);
                    dg12.mo31246i(this.f33969e, this.f33966b);
                    dg12.mo31242e(this.f33969e, this.f33966b);
                }
                wj1 n2 = this.f33967c.mo35292n();
                w91 w912 = new w91();
                w912.mo35591c(this.f33965a);
                w912.mo35594f(f);
                n2.mo35514o(w912.mo35595g());
                dg12.mo31250m(this.f33968d, this.f33966b);
                dg12.mo31245h(this.f33968d, this.f33966b);
                dg12.mo31246i(this.f33968d, this.f33966b);
                dg12.mo31242e(this.f33968d, this.f33966b);
                dg12.mo31241d(this.f33968d, this.f33966b);
                dg12.mo31252o(this.f33968d, this.f33966b);
                dg12.mo31251n(this.f33968d, this.f33966b);
                dg12.mo31249l(this.f33968d, this.f33966b);
                dg12.mo31243f(this.f33968d, this.f33966b);
                n2.mo35512e(dg12.mo31254q());
                n2.mo35513f(new la2(this.f33970f));
                xj1 = n2.zzf();
            }
            s71<zi1> a = xj1.mo35760a();
            mb3<zi1> h = a.mo34673h(a.mo34674i());
            this.f33973i = h;
            bb3.m30658r(h, new ip2(this, sc2, p, xj1), this.f33966b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo32920g() {
        this.f33968d.mo18436d(us2.m38446d(6, (String) null, (zzbew) null));
    }

    /* renamed from: h */
    public final void mo32921h(l10 l10) {
        this.f33970f = l10;
    }

    public final boolean zza() {
        mb3<zi1> mb3 = this.f33973i;
        return mb3 != null && !mb3.isDone();
    }
}
