package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i21 implements ma1, cc1, hb1, C7659eu, db1 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f33038b;

    /* renamed from: c */
    private final Executor f33039c;

    /* renamed from: d */
    private final Executor f33040d;

    /* renamed from: e */
    private final ScheduledExecutorService f33041e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ur2 f33042f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ir2 f33043g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final px2 f33044h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ks2 f33045i;

    /* renamed from: j */
    private final C7497ab f33046j;

    /* renamed from: k */
    private final p10 f33047k;

    /* renamed from: l */
    private final WeakReference<View> f33048l;
    @GuardedBy("this")

    /* renamed from: m */
    private boolean f33049m;

    /* renamed from: n */
    private final AtomicBoolean f33050n = new AtomicBoolean();

    /* renamed from: o */
    private final r10 f33051o;

    public i21(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, ur2 ur2, ir2 ir2, px2 px2, ks2 ks2, View view, C7497ab abVar, p10 p10, r10 r10, byte[] bArr) {
        this.f33038b = context;
        this.f33039c = executor;
        this.f33040d = executor2;
        this.f33041e = scheduledExecutorService;
        this.f33042f = ur2;
        this.f33043g = ir2;
        this.f33044h = px2;
        this.f33045i = ks2;
        this.f33046j = abVar;
        this.f33048l = new WeakReference<>(view);
        this.f33047k = p10;
        this.f33051o = r10;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m33028G() {
        String zzh = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37105h2)).booleanValue() ? this.f33046j.mo30331c().zzh(this.f33038b, (View) this.f33048l.get(), (Activity) null) : null;
        if ((!((Boolean) C8311wv.m39277c().mo18570b(p00.f37112i0)).booleanValue() || !this.f33042f.f39937b.f39519b.f35220g) && d20.f30602h.mo34648e().booleanValue()) {
            bb3.m30658r((sa3) bb3.m30655o(sa3.m37369D(bb3.m30649i(null)), ((Long) C8311wv.m39277c().mo18570b(p00.f36904J0)).longValue(), TimeUnit.MILLISECONDS, this.f33041e), new h21(this, zzh), this.f33039c);
            return;
        }
        ks2 ks2 = this.f33045i;
        px2 px2 = this.f33044h;
        ur2 ur2 = this.f33042f;
        ir2 ir2 = this.f33043g;
        ks2.mo33170a(px2.mo34216b(ur2, ir2, false, zzh, (String) null, ir2.f33470d));
    }

    /* renamed from: I */
    private final void m33029I(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.f33048l.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            m33028G();
        } else {
            this.f33041e.schedule(new f21(this, i, i2), (long) i2, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final /* synthetic */ void mo32526C(int i, int i2) {
        this.f33039c.execute(new e21(this, i, i2));
    }

    /* renamed from: N */
    public final void mo18122N(zzbew zzbew) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37086f1)).booleanValue()) {
            this.f33045i.mo33170a(this.f33044h.mo34215a(this.f33042f, this.f33043g, px2.m36241d(2, zzbew.f42935b, this.f33043g.f33490p)));
        }
    }

    /* renamed from: a */
    public final void mo18123a(kj0 kj0, String str, String str2) {
        ks2 ks2 = this.f33045i;
        px2 px2 = this.f33044h;
        ir2 ir2 = this.f33043g;
        ks2.mo33170a(px2.mo34217c(ir2, ir2.f33480i, kj0));
    }

    public final void onAdClicked() {
        if ((!((Boolean) C8311wv.m39277c().mo18570b(p00.f37112i0)).booleanValue() || !this.f33042f.f39937b.f39519b.f35220g) && d20.f30598d.mo34648e().booleanValue()) {
            bb3.m30658r(bb3.m30646f(sa3.m37369D(this.f33047k.mo34035a()), Throwable.class, b21.f29870a, po0.f37727f), new g21(this), this.f33039c);
            return;
        }
        ks2 ks2 = this.f33045i;
        px2 px2 = this.f33044h;
        ur2 ur2 = this.f33042f;
        ir2 ir2 = this.f33043g;
        List<String> a = px2.mo34215a(ur2, ir2, ir2.f33468c);
        zzt.zzp();
        int i = 1;
        if (true == com.google.android.gms.ads.internal.util.zzt.zzJ(this.f33038b)) {
            i = 2;
        }
        ks2.mo33172c(a, i);
    }

    /* renamed from: w */
    public final void mo18127w() {
        ks2 ks2 = this.f33045i;
        px2 px2 = this.f33044h;
        ur2 ur2 = this.f33042f;
        ir2 ir2 = this.f33043g;
        ks2.mo33170a(px2.mo34215a(ur2, ir2, ir2.f33482j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final /* synthetic */ void mo32527x() {
        this.f33039c.execute(new d21(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ void mo32528z(int i, int i2) {
        m33029I(i - 1, i2);
    }

    public final void zzj() {
    }

    public final void zzl() {
        if (this.f33050n.compareAndSet(false, true)) {
            int intValue = ((Integer) C8311wv.m39277c().mo18570b(p00.f37132k2)).intValue();
            if (intValue > 0) {
                m33029I(intValue, ((Integer) C8311wv.m39277c().mo18570b(p00.f37141l2)).intValue());
                return;
            }
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37123j2)).booleanValue()) {
                this.f33040d.execute(new c21(this));
            } else {
                m33028G();
            }
        }
    }

    public final void zzm() {
    }

    public final synchronized void zzn() {
        if (this.f33049m) {
            ArrayList arrayList = new ArrayList(this.f33043g.f33470d);
            arrayList.addAll(this.f33043g.f33476g);
            this.f33045i.mo33170a(this.f33044h.mo34216b(this.f33042f, this.f33043g, true, (String) null, (String) null, arrayList));
        } else {
            ks2 ks2 = this.f33045i;
            px2 px2 = this.f33044h;
            ur2 ur2 = this.f33042f;
            ir2 ir2 = this.f33043g;
            ks2.mo33170a(px2.mo34215a(ur2, ir2, ir2.f33488n));
            ks2 ks22 = this.f33045i;
            px2 px22 = this.f33044h;
            ur2 ur22 = this.f33042f;
            ir2 ir22 = this.f33043g;
            ks22.mo33170a(px22.mo34215a(ur22, ir22, ir22.f33476g));
        }
        this.f33049m = true;
    }

    public final void zzo() {
    }

    public final void zzr() {
        ks2 ks2 = this.f33045i;
        px2 px2 = this.f33044h;
        ur2 ur2 = this.f33042f;
        ir2 ir2 = this.f33043g;
        ks2.mo33170a(px2.mo34215a(ur2, ir2, ir2.f33478h));
    }
}
