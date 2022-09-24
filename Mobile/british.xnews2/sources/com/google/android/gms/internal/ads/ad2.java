package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ad2 implements tc2<o61> {
    @GuardedBy("this")

    /* renamed from: a */
    private final zr2 f29606a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final uv0 f29607b;

    /* renamed from: c */
    private final Context f29608c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final qc2 f29609d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final gx2 f29610e;
    @GuardedBy("this")

    /* renamed from: f */
    private d71 f29611f;

    public ad2(uv0 uv0, Context context, qc2 qc2, zr2 zr2) {
        this.f29607b = uv0;
        this.f29608c = context;
        this.f29609d = qc2;
        this.f29606a = zr2;
        this.f29610e = uv0.mo35283b();
        zr2.mo36105J(qc2.mo34315d());
    }

    /* renamed from: a */
    public final boolean mo18423a(zzbfd zzbfd, String str, rc2 rc2, sc2<? super o61> sc2) throws RemoteException {
        ex2 p = ex2.m31961p(this.f29608c, 7, 8, zzbfd);
        zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzL(this.f29608c) && zzbfd.f42958t == null) {
            co0.zzg("Failed to load the ad because app ID is missing.");
            this.f29607b.mo35285d().execute(new vc2(this));
            if (p != null) {
                gx2 gx2 = this.f29610e;
                p.mo31676g(false);
                gx2.mo32302a(p.mo31678i());
            }
            return false;
        } else if (str == null) {
            co0.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.f29607b.mo35285d().execute(new wc2(this));
            if (p != null) {
                gx2 gx22 = this.f29610e;
                p.mo31676g(false);
                gx22.mo32302a(p.mo31678i());
            }
            return false;
        } else {
            qs2.m36699a(this.f29608c, zzbfd.f42945g);
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36838A6)).booleanValue() && zzbfd.f42945g) {
                this.f29607b.mo35297s().mo33432l(true);
            }
            int i = ((uc2) rc2).f39822a;
            zr2 zr2 = this.f29606a;
            zr2.mo36114d(zzbfd);
            zr2.mo36109N(i);
            bs2 f = zr2.mo36116f();
            if (f.f30097n != null) {
                this.f29609d.mo34315d().mo30877C(f.f30097n);
            }
            tk1 o = this.f29607b.mo35293o();
            w91 w91 = new w91();
            w91.mo35591c(this.f29608c);
            w91.mo35594f(f);
            o.mo34972j(w91.mo35595g());
            dg1 dg1 = new dg1();
            dg1.mo31251n(this.f29609d.mo34315d(), this.f29607b.mo35285d());
            o.mo34973m(dg1.mo31254q());
            o.mo34971d(this.f29609d.mo34314c());
            o.mo34970c(new j41((ViewGroup) null));
            uk1 zzg = o.zzg();
            this.f29607b.mo35281C().mo34785c(1);
            nb3 nb3 = po0.f37722a;
            cv3.m31156b(nb3);
            ScheduledExecutorService e = this.f29607b.mo35286e();
            s71<w61> a = zzg.mo35198a();
            d71 d71 = new d71(nb3, e, a.mo34673h(a.mo34674i()));
            this.f29611f = d71;
            d71.mo31126e(new zc2(this, sc2, p, zzg));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo30352e() {
        this.f29609d.mo34312a().mo18436d(us2.m38446d(4, (String) null, (zzbew) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo30353f() {
        this.f29609d.mo34312a().mo18436d(us2.m38446d(6, (String) null, (zzbew) null));
    }

    public final boolean zza() {
        d71 d71 = this.f29611f;
        return d71 != null && d71.mo31127f();
    }
}
