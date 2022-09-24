package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ir1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final cr1 f33425a = new cr1((br1) null);

    /* renamed from: b */
    private final zza f33426b;

    /* renamed from: c */
    private final ku0 f33427c;

    /* renamed from: d */
    private final Context f33428d;

    /* renamed from: e */
    private final nv1 f33429e;

    /* renamed from: f */
    private final nw2 f33430f;

    /* renamed from: g */
    private final Executor f33431g;

    /* renamed from: h */
    private final C7497ab f33432h;

    /* renamed from: i */
    private final zzcjf f33433i;

    /* renamed from: j */
    private final t70 f33434j;

    /* renamed from: k */
    private final f42 f33435k;

    /* renamed from: l */
    private final sx2 f33436l;

    /* renamed from: m */
    private mb3<xt0> f33437m;

    ir1(fr1 fr1) {
        this.f33428d = fr1.f31849c;
        this.f33431g = fr1.f31853g;
        this.f33432h = fr1.f31854h;
        this.f33433i = fr1.f31855i;
        this.f33426b = fr1.f31847a;
        this.f33427c = fr1.f31848b;
        this.f33434j = new t70();
        this.f33435k = fr1.f31852f;
        this.f33436l = fr1.f31856j;
        this.f33429e = fr1.f31850d;
        this.f33430f = fr1.f31851e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ xt0 mo32751a(xt0 xt0) {
        xt0 xt02 = xt0;
        xt02.mo18726O("/result", this.f33434j);
        mv0 u0 = xt0.mo18793u0();
        cr1 cr1 = this.f33425a;
        zzb zzb = r2;
        zzb zzb2 = new zzb(this.f33428d, (hl0) null, (zzcde) null);
        u0.mo18249E((C7659eu) null, cr1, cr1, cr1, cr1, false, (h70) null, zzb, (wf0) null, (hl0) null, this.f33435k, this.f33436l, this.f33429e, this.f33430f, (f70) null, (gi1) null);
        return xt02;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo32752c(String str, JSONObject jSONObject, xt0 xt0) throws Exception {
        return this.f33434j.mo18855b(xt0, str, jSONObject);
    }

    /* renamed from: d */
    public final synchronized mb3<JSONObject> mo32753d(String str, JSONObject jSONObject) {
        mb3<xt0> mb3 = this.f33437m;
        if (mb3 == null) {
            return bb3.m30649i(null);
        }
        return bb3.m30654n(mb3, new vq1(this, str, jSONObject), this.f33431g);
    }

    /* renamed from: e */
    public final synchronized void mo32754e(ir2 ir2, lr2 lr2) {
        mb3<xt0> mb3 = this.f33437m;
        if (mb3 != null) {
            bb3.m30658r(mb3, new ar1(this, ir2, lr2), this.f33431g);
        }
    }

    /* renamed from: f */
    public final synchronized void mo32755f() {
        mb3<xt0> mb3 = this.f33437m;
        if (mb3 != null) {
            bb3.m30658r(mb3, new wq1(this), this.f33431g);
            this.f33437m = null;
        }
    }

    /* renamed from: g */
    public final synchronized void mo32756g(String str, Map<String, ?> map) {
        mb3<xt0> mb3 = this.f33437m;
        if (mb3 != null) {
            bb3.m30658r(mb3, new zq1(this, "sendMessageToNativeJs", map), this.f33431g);
        }
    }

    /* renamed from: h */
    public final synchronized void mo32757h() {
        Context context = this.f33428d;
        zzcjf zzcjf = this.f33433i;
        h00 h00 = p00.f37177p2;
        mb3<xt0> m = bb3.m30653m(bb3.m30652l(new hu0(context, this.f33432h, zzcjf, this.f33426b, (String) C8311wv.m39277c().mo18570b(h00)), po0.f37726e), new uq1(this), this.f33431g);
        this.f33437m = m;
        so0.m37458a(m, "NativeJavascriptExecutor.initializeEngine");
    }

    /* renamed from: i */
    public final synchronized void mo32758i(String str, e70<Object> e70) {
        mb3<xt0> mb3 = this.f33437m;
        if (mb3 != null) {
            bb3.m30658r(mb3, new xq1(this, str, e70), this.f33431g);
        }
    }

    /* renamed from: j */
    public final <T> void mo32759j(WeakReference<T> weakReference, String str, e70<T> e70) {
        mo32758i(str, new hr1(this, weakReference, str, e70, (gr1) null));
    }

    /* renamed from: k */
    public final synchronized void mo32760k(String str, e70<Object> e70) {
        mb3<xt0> mb3 = this.f33437m;
        if (mb3 != null) {
            bb3.m30658r(mb3, new yq1(this, str, e70), this.f33431g);
        }
    }
}
