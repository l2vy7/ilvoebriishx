package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class us1 {

    /* renamed from: a */
    private final ka1 f39950a;

    /* renamed from: b */
    private final ei1 f39951b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ub1 f39952c;

    /* renamed from: d */
    private final ic1 f39953d;

    /* renamed from: e */
    private final uc1 f39954e;

    /* renamed from: f */
    private final of1 f39955f;

    /* renamed from: g */
    private final Executor f39956g;

    /* renamed from: h */
    private final ai1 f39957h;

    /* renamed from: i */
    private final u21 f39958i;

    /* renamed from: j */
    private final zzb f39959j;

    /* renamed from: k */
    private final hl0 f39960k;

    /* renamed from: l */
    private final C7497ab f39961l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final ff1 f39962m;

    /* renamed from: n */
    private final f42 f39963n;

    /* renamed from: o */
    private final sx2 f39964o;

    /* renamed from: p */
    private final nv1 f39965p;

    /* renamed from: q */
    private final nw2 f39966q;

    public us1(ka1 ka1, ub1 ub1, ic1 ic1, uc1 uc1, of1 of1, Executor executor, ai1 ai1, u21 u21, zzb zzb, hl0 hl0, C7497ab abVar, ff1 ff1, f42 f42, sx2 sx2, nv1 nv1, nw2 nw2, ei1 ei1) {
        this.f39950a = ka1;
        this.f39952c = ub1;
        this.f39953d = ic1;
        this.f39954e = uc1;
        this.f39955f = of1;
        this.f39956g = executor;
        this.f39957h = ai1;
        this.f39958i = u21;
        this.f39959j = zzb;
        this.f39960k = hl0;
        this.f39961l = abVar;
        this.f39962m = ff1;
        this.f39963n = f42;
        this.f39964o = sx2;
        this.f39965p = nv1;
        this.f39966q = nw2;
        this.f39951b = ei1;
    }

    /* renamed from: j */
    public static final mb3<?> m38435j(xt0 xt0, String str, String str2) {
        uo0 uo0 = new uo0();
        xt0.mo18793u0().mo18251F0(new ss1(uo0));
        xt0.mo18744d0(str, str2, (String) null);
        return uo0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo35261c() {
        this.f39950a.onAdClicked();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo35262d(String str, String str2) {
        this.f39955f.mo18309M(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo35263e() {
        this.f39952c.zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo35264f(View view) {
        this.f39959j.zza();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo35265g(xt0 xt0, xt0 xt02, Map map) {
        this.f39958i.mo35094d(xt0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ boolean mo35266h(View view, MotionEvent motionEvent) {
        this.f39959j.zza();
        return false;
    }

    /* renamed from: i */
    public final void mo35267i(xt0 xt0, boolean z, h70 h70) {
        C8291wa c;
        xt0 xt02 = xt0;
        mv0 u0 = xt0.mo18793u0();
        os1 os1 = r4;
        os1 os12 = new os1(this);
        ic1 ic1 = this.f39953d;
        uc1 uc1 = this.f39954e;
        ps1 ps1 = r7;
        ps1 ps12 = new ps1(this);
        rs1 rs1 = r10;
        rs1 rs12 = new rs1(this);
        zzb zzb = this.f39959j;
        ts1 ts1 = r12;
        ts1 ts12 = new ts1(this);
        u0.mo18249E(os1, ic1, uc1, ps1, rs1, z, h70, zzb, ts1, this.f39960k, this.f39963n, this.f39964o, this.f39965p, this.f39966q, (f70) null, this.f39951b);
        xt0 xt03 = xt0;
        xt03.setOnTouchListener(new ms1(this));
        xt03.setOnClickListener(new ks1(this));
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36961Q1)).booleanValue() && (c = this.f39961l.mo30331c()) != null) {
            c.zzn((View) xt03);
        }
        this.f39957h.mo30921s0(xt03, this.f39956g);
        this.f39957h.mo30921s0(new ns1(xt03), this.f39956g);
        this.f39957h.mo30383E0((View) xt03);
        xt03.mo18726O("/trackActiveViewUnit", new qs1(this, xt03));
        this.f39958i.mo35095f(xt03);
    }
}
