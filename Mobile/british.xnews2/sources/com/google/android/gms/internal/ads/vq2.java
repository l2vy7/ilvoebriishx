package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vq2 implements tc2<yr1> {

    /* renamed from: a */
    private final Context f40515a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f40516b;

    /* renamed from: c */
    private final uv0 f40517c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final kq2 f40518d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final vo2<ds1, yr1> f40519e;

    /* renamed from: f */
    private final wr2 f40520f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final gx2 f40521g;
    @GuardedBy("this")

    /* renamed from: h */
    private final zr2 f40522h;
    @GuardedBy("this")

    /* renamed from: i */
    private mb3<yr1> f40523i;

    public vq2(Context context, Executor executor, uv0 uv0, vo2<ds1, yr1> vo2, kq2 kq2, zr2 zr2, wr2 wr2) {
        this.f40515a = context;
        this.f40516b = executor;
        this.f40517c = uv0;
        this.f40519e = vo2;
        this.f40518d = kq2;
        this.f40522h = zr2;
        this.f40520f = wr2;
        this.f40521g = uv0.mo35283b();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final cs1 m38878j(to2 to2) {
        cs1 p = this.f40517c.mo35294p();
        w91 w91 = new w91();
        w91.mo35591c(this.f40515a);
        w91.mo35594f(((tq2) to2).f39493a);
        w91.mo35593e(this.f40520f);
        p.mo31019a(w91.mo35595g());
        p.mo31020b(new dg1().mo31254q());
        return p;
    }

    /* renamed from: a */
    public final boolean mo18423a(zzbfd zzbfd, String str, rc2 rc2, sc2<? super yr1> sc2) throws RemoteException {
        zzcen zzcen = new zzcen(zzbfd, str);
        ex2 p = ex2.m31961p(this.f40515a, 7, 5, zzcen.f43024b);
        if (zzcen.f43025c == null) {
            co0.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.f40516b.execute(new oq2(this));
            if (p != null) {
                gx2 gx2 = this.f40521g;
                p.mo31676g(false);
                gx2.mo32302a(p.mo31678i());
                return false;
            }
        } else {
            mb3<yr1> mb3 = this.f40523i;
            if (mb3 == null || mb3.isDone()) {
                qs2.m36699a(this.f40515a, zzcen.f43024b.f42945g);
                if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36838A6)).booleanValue() && zzcen.f43024b.f42945g) {
                    this.f40517c.mo35297s().mo33432l(true);
                }
                zr2 zr2 = this.f40522h;
                zr2.mo36103H(zzcen.f43025c);
                zr2.mo36102G(zzbfi.m40644F0());
                zr2.mo36114d(zzcen.f43024b);
                bs2 f = zr2.mo36116f();
                tq2 tq2 = new tq2((sq2) null);
                tq2.f39493a = f;
                tq2.f39494b = null;
                mb3<yr1> a = this.f40519e.mo30442a(new wo2(tq2, (zzcdq) null), new nq2(this), null);
                this.f40523i = a;
                bb3.m30658r(a, new rq2(this, sc2, p, tq2), this.f40516b);
                return true;
            } else if (p != null) {
                gx2 gx22 = this.f40521g;
                p.mo31676g(false);
                gx22.mo32302a(p.mo31678i());
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo35461h() {
        this.f40518d.mo18436d(us2.m38446d(6, (String) null, (zzbew) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo35462i(int i) {
        this.f40522h.mo36099D().mo33995a(i);
    }

    public final boolean zza() {
        throw null;
    }
}
