package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cq1 {

    /* renamed from: a */
    private final bs2 f30462a;

    /* renamed from: b */
    private final Executor f30463b;

    /* renamed from: c */
    private final vs1 f30464c;

    /* renamed from: d */
    private final pr1 f30465d;

    /* renamed from: e */
    private final Context f30466e;

    /* renamed from: f */
    private final nv1 f30467f;

    /* renamed from: g */
    private final nw2 f30468g;

    /* renamed from: h */
    private final sx2 f30469h;

    /* renamed from: i */
    private final f42 f30470i;

    public cq1(bs2 bs2, Executor executor, vs1 vs1, Context context, nv1 nv1, nw2 nw2, sx2 sx2, f42 f42, pr1 pr1) {
        this.f30462a = bs2;
        this.f30463b = executor;
        this.f30464c = vs1;
        this.f30466e = context;
        this.f30467f = nv1;
        this.f30468g = nw2;
        this.f30469h = sx2;
        this.f30470i = f42;
        this.f30465d = pr1;
    }

    /* renamed from: h */
    private final void m31116h(xt0 xt0) {
        m31117i(xt0);
        xt0.mo18726O("/video", d70.f30665l);
        xt0.mo18726O("/videoMeta", d70.f30666m);
        xt0.mo18726O("/precache", new ns0());
        xt0.mo18726O("/delayPageLoaded", d70.f30669p);
        xt0.mo18726O("/instrument", d70.f30667n);
        xt0.mo18726O("/log", d70.f30660g);
        xt0.mo18726O("/click", d70.m31258a((gi1) null));
        if (this.f30462a.f30085b != null) {
            xt0.mo18793u0().mo18255J(true);
            xt0.mo18726O("/open", new q70((zzb) null, (pf0) null, (f42) null, (nv1) null, (nw2) null));
        } else {
            xt0.mo18793u0().mo18255J(false);
        }
        if (zzt.zzn().mo18501z(xt0.getContext())) {
            xt0.mo18726O("/logScionEvent", new k70(xt0.getContext()));
        }
    }

    /* renamed from: i */
    private static final void m31117i(xt0 xt0) {
        xt0.mo18726O("/videoClicked", d70.f30661h);
        xt0.mo18793u0().mo18246A0(true);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37195r2)).booleanValue()) {
            xt0.mo18726O("/getNativeAdViewSignals", d70.f30672s);
        }
        xt0.mo18726O("/getNativeClickMeta", d70.f30673t);
    }

    /* renamed from: a */
    public final mb3<xt0> mo31008a(JSONObject jSONObject) {
        return bb3.m30654n(bb3.m30654n(bb3.m30649i(null), new up1(this), this.f30463b), new wp1(this, jSONObject), this.f30463b);
    }

    /* renamed from: b */
    public final mb3<xt0> mo31009b(String str, String str2, ir2 ir2, lr2 lr2, zzbfi zzbfi) {
        return bb3.m30654n(bb3.m30649i(null), new vp1(this, zzbfi, ir2, lr2, str, str2), this.f30463b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo31010c(JSONObject jSONObject, xt0 xt0) throws Exception {
        to0 c = to0.m37927c(xt0);
        if (this.f30462a.f30085b != null) {
            xt0.mo18759k0(ov0.m35843d());
        } else {
            xt0.mo18759k0(ov0.m35844e());
        }
        xt0.mo18793u0().mo18251F0(new rp1(this, xt0, c));
        xt0.mo18317E0("google.afma.nativeAds.renderVideo", jSONObject);
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ mb3 mo31011d(zzbfi zzbfi, ir2 ir2, lr2 lr2, String str, String str2, Object obj) throws Exception {
        xt0 a = this.f30464c.mo35491a(zzbfi, ir2, lr2);
        to0 c = to0.m37927c(a);
        if (this.f30462a.f30085b != null) {
            m31116h(a);
            a.mo18759k0(ov0.m35843d());
        } else {
            mr1 b = this.f30465d.mo34168b();
            mr1 mr1 = b;
            mv0 u0 = a.mo18793u0();
            zzb zzb = r3;
            zzb zzb2 = new zzb(this.f30466e, (hl0) null, (zzcde) null);
            u0.mo18249E(b, mr1, b, b, b, false, (h70) null, zzb, (wf0) null, (hl0) null, this.f30470i, this.f30469h, this.f30467f, this.f30468g, (f70) null, b);
            m31117i(a);
        }
        a.mo18793u0().mo18251F0(new sp1(this, a, c));
        a.mo18744d0(str, str2, (String) null);
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ mb3 mo31012e(Object obj) throws Exception {
        xt0 a = this.f30464c.mo35491a(zzbfi.m40643E0(), (ir2) null, (lr2) null);
        to0 c = to0.m37927c(a);
        m31116h(a);
        a.mo18793u0().mo18248D0(new tp1(c));
        a.loadUrl((String) C8311wv.m39277c().mo18570b(p00.f37186q2));
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo31013f(xt0 xt0, to0 to0, boolean z) {
        if (!(this.f30462a.f30084a == null || xt0.zzs() == null)) {
            xt0.zzs().mo35276r6(this.f30462a.f30084a);
        }
        to0.mo34995d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo31014g(xt0 xt0, to0 to0, boolean z) {
        if (z) {
            if (!(this.f30462a.f30084a == null || xt0.zzs() == null)) {
                xt0.zzs().mo35276r6(this.f30462a.f30084a);
            }
            to0.mo34995d();
            return;
        }
        to0.zze(new l82(1, "Html video Web View failed to load."));
    }
}
