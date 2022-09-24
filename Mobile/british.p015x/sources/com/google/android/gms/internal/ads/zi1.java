package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zi1 extends o61 {

    /* renamed from: i */
    private final Context f21051i;

    /* renamed from: j */
    private final WeakReference<xt0> f21052j;

    /* renamed from: k */
    private final ph1 f21053k;

    /* renamed from: l */
    private final gk1 f21054l;

    /* renamed from: m */
    private final j71 f21055m;

    /* renamed from: n */
    private final v03 f21056n;

    /* renamed from: o */
    private final ab1 f21057o;

    /* renamed from: p */
    private boolean f21058p = false;

    zi1(n61 n61, Context context, @Nullable xt0 xt0, ph1 ph1, gk1 gk1, j71 j71, v03 v03, ab1 ab1) {
        super(n61);
        this.f21051i = context;
        this.f21052j = new WeakReference<>(xt0);
        this.f21053k = ph1;
        this.f21054l = gk1;
        this.f21055m = j71;
        this.f21056n = v03;
        this.f21057o = ab1;
    }

    public final void finalize() throws Throwable {
        try {
            xt0 xt0 = (xt0) this.f21052j.get();
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37099g5)).booleanValue()) {
                if (!this.f21058p && xt0 != null) {
                    po0.f37726e.execute(new yi1(xt0));
                }
            } else if (xt0 != null) {
                xt0.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: h */
    public final boolean mo19061h() {
        return this.f21055m.mo32863a();
    }

    /* renamed from: i */
    public final boolean mo19062i(boolean z, @Nullable Activity activity) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37218u0)).booleanValue()) {
            zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzK(this.f21051i)) {
                co0.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f21057o.zzb();
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37226v0)).booleanValue()) {
                    this.f21056n.mo35344a(this.f36293a.f39937b.f39519b.f35215b);
                }
                return false;
            }
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37119i7)).booleanValue() && this.f21058p) {
            co0.zzj("The interstitial ad has been showed.");
            this.f21057o.mo30337d(us2.m38446d(10, (String) null, (zzbew) null));
        }
        if (!this.f21058p) {
            this.f21053k.zzb();
            Context context = activity;
            if (activity == null) {
                context = this.f21051i;
            }
            try {
                this.f21054l.mo32020a(z, context, this.f21057o);
                this.f21053k.zza();
                this.f21058p = true;
                return true;
            } catch (fk1 e) {
                this.f21057o.mo30338j0(e);
            }
        }
        return false;
    }
}
