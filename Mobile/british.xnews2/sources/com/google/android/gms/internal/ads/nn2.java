package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nn2 implements tc2<m41> {

    /* renamed from: a */
    private final Context f36050a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f36051b;

    /* renamed from: c */
    private final uv0 f36052c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final cc2 f36053d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final hc2 f36054e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ViewGroup f36055f;

    /* renamed from: g */
    private l10 f36056g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ed1 f36057h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final gx2 f36058i;
    @GuardedBy("this")

    /* renamed from: j */
    private final zr2 f36059j;
    /* access modifiers changed from: private */
    @GuardedBy("this")

    /* renamed from: k */
    public mb3<m41> f36060k;

    public nn2(Context context, Executor executor, zzbfi zzbfi, uv0 uv0, cc2 cc2, hc2 hc2, zr2 zr2) {
        this.f36050a = context;
        this.f36051b = executor;
        this.f36052c = uv0;
        this.f36053d = cc2;
        this.f36054e = hc2;
        this.f36059j = zr2;
        this.f36057h = uv0.mo35291m();
        this.f36058i = uv0.mo35283b();
        this.f36055f = new FrameLayout(context);
        zr2.mo36102G(zzbfi);
    }

    /* renamed from: a */
    public final boolean mo18423a(zzbfd zzbfd, String str, rc2 rc2, sc2<? super m41> sc2) throws RemoteException {
        k51 k51;
        ex2 p = ex2.m31961p(this.f36050a, 7, 3, zzbfd);
        if (str == null) {
            co0.zzg("Ad unit ID should not be null for banner ad.");
            this.f36051b.execute(new jn2(this));
            if (p != null) {
                gx2 gx2 = this.f36058i;
                p.mo31676g(false);
                gx2.mo32302a(p.mo31678i());
            }
            return false;
        } else if (zza()) {
            if (p != null) {
                gx2 gx22 = this.f36058i;
                p.mo31676g(false);
                gx22.mo32302a(p.mo31678i());
            }
            return false;
        } else {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36838A6)).booleanValue() && zzbfd.f42945g) {
                this.f36052c.mo35297s().mo33432l(true);
            }
            zr2 zr2 = this.f36059j;
            zr2.mo36103H(str);
            zr2.mo36114d(zzbfd);
            bs2 f = zr2.mo36116f();
            if (!j20.f33714c.mo34648e().booleanValue() || !this.f36059j.mo36121v().f42974l) {
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37005V5)).booleanValue()) {
                    j51 l = this.f36052c.mo35290l();
                    w91 w91 = new w91();
                    w91.mo35591c(this.f36050a);
                    w91.mo35594f(f);
                    l.mo32854h(w91.mo35595g());
                    dg1 dg1 = new dg1();
                    dg1.mo31250m(this.f36053d, this.f36051b);
                    dg1.mo31251n(this.f36053d, this.f36051b);
                    l.mo32857n(dg1.mo31254q());
                    l.mo32856l(new la2(this.f36056g));
                    l.mo32853d(new pk1(tm1.f39461h, (C7624dw) null));
                    l.mo32855i(new i61(this.f36057h));
                    l.mo32852c(new j41(this.f36055f));
                    k51 = l.zzj();
                } else {
                    j51 l2 = this.f36052c.mo35290l();
                    w91 w912 = new w91();
                    w912.mo35591c(this.f36050a);
                    w912.mo35594f(f);
                    l2.mo32854h(w912.mo35595g());
                    dg1 dg12 = new dg1();
                    dg12.mo31250m(this.f36053d, this.f36051b);
                    dg12.mo31241d(this.f36053d, this.f36051b);
                    dg12.mo31241d(this.f36054e, this.f36051b);
                    dg12.mo31252o(this.f36053d, this.f36051b);
                    dg12.mo31244g(this.f36053d, this.f36051b);
                    dg12.mo31245h(this.f36053d, this.f36051b);
                    dg12.mo31246i(this.f36053d, this.f36051b);
                    dg12.mo31242e(this.f36053d, this.f36051b);
                    dg12.mo31251n(this.f36053d, this.f36051b);
                    dg12.mo31249l(this.f36053d, this.f36051b);
                    l2.mo32857n(dg12.mo31254q());
                    l2.mo32856l(new la2(this.f36056g));
                    l2.mo32853d(new pk1(tm1.f39461h, (C7624dw) null));
                    l2.mo32855i(new i61(this.f36057h));
                    l2.mo32852c(new j41(this.f36055f));
                    k51 = l2.zzj();
                }
                s71<m41> d = k51.mo33034d();
                mb3<m41> h = d.mo34673h(d.mo34674i());
                this.f36060k = h;
                bb3.m30658r(h, new mn2(this, sc2, p, k51), this.f36051b);
                return true;
            }
            cc2 cc2 = this.f36053d;
            if (cc2 != null) {
                cc2.mo18436d(us2.m38446d(7, (String) null, (zzbew) null));
            }
            if (p != null) {
                gx2 gx23 = this.f36058i;
                p.mo31676g(false);
                gx23.mo32302a(p.mo31678i());
            }
            return false;
        }
    }

    /* renamed from: c */
    public final ViewGroup mo33719c() {
        return this.f36055f;
    }

    /* renamed from: g */
    public final zr2 mo33720g() {
        return this.f36059j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo33721k() {
        this.f36053d.mo18436d(us2.m38446d(6, (String) null, (zzbew) null));
    }

    /* renamed from: l */
    public final void mo33722l() {
        this.f36057h.mo31543E0(60);
    }

    /* renamed from: m */
    public final void mo33723m(C7518aw awVar) {
        this.f36054e.mo32383a(awVar);
    }

    /* renamed from: n */
    public final void mo33724n(fd1 fd1) {
        this.f36057h.mo30921s0(fd1, this.f36051b);
    }

    /* renamed from: o */
    public final void mo33725o(l10 l10) {
        this.f36056g = l10;
    }

    /* renamed from: p */
    public final boolean mo33726p() {
        ViewParent parent = this.f36055f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzaa(view, view.getContext());
    }

    public final boolean zza() {
        mb3<m41> mb3 = this.f36060k;
        return mb3 != null && !mb3.isDone();
    }
}
