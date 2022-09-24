package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yr1 extends o61 {

    /* renamed from: i */
    private final Context f41974i;

    /* renamed from: j */
    private final WeakReference<xt0> f41975j;

    /* renamed from: k */
    private final gk1 f41976k;

    /* renamed from: l */
    private final ph1 f41977l;

    /* renamed from: m */
    private final ab1 f41978m;

    /* renamed from: n */
    private final ic1 f41979n;

    /* renamed from: o */
    private final j71 f41980o;

    /* renamed from: p */
    private final yj0 f41981p;

    /* renamed from: q */
    private final v03 f41982q;

    /* renamed from: r */
    private boolean f41983r = false;

    yr1(n61 n61, Context context, xt0 xt0, gk1 gk1, ph1 ph1, ab1 ab1, ic1 ic1, j71 j71, ir2 ir2, v03 v03) {
        super(n61);
        this.f41974i = context;
        this.f41976k = gk1;
        this.f41975j = new WeakReference<>(xt0);
        this.f41977l = ph1;
        this.f41978m = ab1;
        this.f41979n = ic1;
        this.f41980o = j71;
        this.f41982q = v03;
        zzces zzces = ir2.f33487m;
        this.f41981p = new sk0(zzces != null ? zzces.f43026b : "", zzces != null ? zzces.f43027c : 1);
    }

    public final void finalize() throws Throwable {
        try {
            xt0 xt0 = (xt0) this.f41975j.get();
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37099g5)).booleanValue()) {
                if (!this.f41983r && xt0 != null) {
                    po0.f37726e.execute(new xr1(xt0));
                }
            } else if (xt0 != null) {
                xt0.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: h */
    public final Bundle mo35960h() {
        return this.f41979n.mo32614E0();
    }

    /* renamed from: i */
    public final yj0 mo35961i() {
        return this.f41981p;
    }

    /* renamed from: j */
    public final boolean mo35962j() {
        return this.f41980o.mo32863a();
    }

    /* renamed from: k */
    public final boolean mo35963k() {
        return this.f41983r;
    }

    /* renamed from: l */
    public final boolean mo35964l() {
        xt0 xt0 = (xt0) this.f41975j.get();
        return xt0 != null && !xt0.mo18737X();
    }

    /* renamed from: m */
    public final boolean mo35965m(boolean z, Activity activity) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37218u0)).booleanValue()) {
            zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzK(this.f41974i)) {
                co0.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f41978m.zzb();
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37226v0)).booleanValue()) {
                    this.f41982q.mo35344a(this.f36293a.f39937b.f39519b.f35215b);
                }
                return false;
            }
        }
        if (this.f41983r) {
            co0.zzj("The rewarded ad have been showed.");
            this.f41978m.mo30337d(us2.m38446d(10, (String) null, (zzbew) null));
            return false;
        }
        this.f41983r = true;
        this.f41977l.zzb();
        Context context = activity;
        if (activity == null) {
            context = this.f41974i;
        }
        try {
            this.f41976k.mo32020a(z, context, this.f41978m);
            this.f41977l.zza();
            return true;
        } catch (fk1 e) {
            this.f41978m.mo30338j0(e);
            return false;
        }
    }
}
