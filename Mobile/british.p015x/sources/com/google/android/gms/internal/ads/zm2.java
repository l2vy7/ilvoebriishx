package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zm2 implements pa1, nc1, ro2, zzo, ad1, db1, gi1 {

    /* renamed from: b */
    private final gt2 f42509b;

    /* renamed from: c */
    private final AtomicReference<C7654ep> f42510c = new AtomicReference<>();

    /* renamed from: d */
    private final AtomicReference<C7691fp> f42511d = new AtomicReference<>();

    /* renamed from: e */
    private final AtomicReference<C7875kp> f42512e = new AtomicReference<>();

    /* renamed from: f */
    private final AtomicReference<nc1> f42513f = new AtomicReference<>();

    /* renamed from: g */
    private final AtomicReference<zzo> f42514g = new AtomicReference<>();

    /* renamed from: h */
    private final AtomicReference<C7555by> f42515h = new AtomicReference<>();

    /* renamed from: i */
    private zm2 f42516i = null;

    public zm2(gt2 gt2) {
        this.f42509b = gt2;
    }

    /* renamed from: a */
    public static zm2 m40383a(zm2 zm2) {
        zm2 zm22 = new zm2(zm2.f42509b);
        zm22.f42516i = zm2;
        return zm22;
    }

    /* renamed from: C */
    public final void mo36076C(C7691fp fpVar) {
        this.f42511d.set(fpVar);
    }

    /* renamed from: N */
    public final void mo18122N(zzbew zzbew) {
        zm2 zm2 = this.f42516i;
        if (zm2 != null) {
            zm2.mo18122N(zzbew);
        } else {
            io2.m33342a(this.f42512e, new sm2(zzbew));
        }
    }

    /* renamed from: c */
    public final void mo33163c(ro2 ro2) {
        this.f42516i = (zm2) ro2;
    }

    /* renamed from: d */
    public final void mo18436d(zzbew zzbew) {
        zm2 zm2 = this.f42516i;
        if (zm2 != null) {
            zm2.mo18436d(zzbew);
            return;
        }
        io2.m33342a(this.f42510c, new qm2(zzbew));
        io2.m33342a(this.f42510c, new rm2(zzbew));
    }

    /* renamed from: g */
    public final void mo18104g(zzbfk zzbfk) {
        zm2 zm2 = this.f42516i;
        if (zm2 != null) {
            zm2.mo18104g(zzbfk);
        } else {
            io2.m33342a(this.f42515h, new tm2(zzbfk));
        }
    }

    /* renamed from: l */
    public final void mo36077l(C7546bp bpVar) {
        zm2 zm2 = this.f42516i;
        if (zm2 != null) {
            zm2.mo36077l(bpVar);
        } else {
            io2.m33342a(this.f42510c, new jm2(bpVar));
        }
    }

    /* renamed from: n */
    public final void mo36078n(nc1 nc1) {
        this.f42513f.set(nc1);
    }

    /* renamed from: r */
    public final void mo36079r(zzo zzo) {
        this.f42514g.set(zzo);
    }

    /* renamed from: w */
    public final void mo36080w(C7555by byVar) {
        this.f42515h.set(byVar);
    }

    /* renamed from: x */
    public final void mo36081x(C7654ep epVar) {
        this.f42510c.set(epVar);
    }

    /* renamed from: z */
    public final void mo36082z(C7875kp kpVar) {
        this.f42512e.set(kpVar);
    }

    public final void zzb() {
        zm2 zm2 = this.f42516i;
        if (zm2 != null) {
            zm2.zzb();
            return;
        }
        io2.m33342a(this.f42514g, mm2.f35562a);
        io2.m33342a(this.f42512e, km2.f34374a);
        io2.m33342a(this.f42512e, ym2.f41929a);
    }

    public final void zzbK() {
        zm2 zm2 = this.f42516i;
        if (zm2 != null) {
            zm2.zzbK();
        } else {
            io2.m33342a(this.f42514g, lm2.f35136a);
        }
    }

    public final void zzbS() {
    }

    public final void zzbz() {
    }

    public final void zze() {
        zm2 zm2 = this.f42516i;
        if (zm2 != null) {
            zm2.zze();
        } else {
            io2.m33342a(this.f42514g, nm2.f36047a);
        }
    }

    public final void zzf(int i) {
        zm2 zm2 = this.f42516i;
        if (zm2 != null) {
            zm2.zzf(i);
        } else {
            io2.m33342a(this.f42514g, new um2(i));
        }
    }

    public final void zzh() {
        zm2 zm2 = this.f42516i;
        if (zm2 != null) {
            zm2.zzh();
        } else {
            io2.m33342a(this.f42513f, om2.f36537a);
        }
    }

    public final void zzj() {
        zm2 zm2 = this.f42516i;
        if (zm2 != null) {
            zm2.zzj();
            return;
        }
        this.f42509b.mo32286a();
        io2.m33342a(this.f42511d, vm2.f40469a);
        io2.m33342a(this.f42512e, xm2.f41223a);
    }

    public final void zzq() {
        zm2 zm2 = this.f42516i;
        if (zm2 != null) {
            zm2.zzq();
        } else {
            io2.m33342a(this.f42512e, wm2.f40824a);
        }
    }
}
