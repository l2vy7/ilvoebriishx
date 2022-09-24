package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yc1 extends cg1<ad1> implements hb1, nc1 {

    /* renamed from: c */
    private final ir2 f41782c;

    /* renamed from: d */
    private final AtomicBoolean f41783d = new AtomicBoolean();

    public yc1(Set<yh1<ad1>> set, ir2 ir2) {
        super(set);
        this.f41782c = ir2;
    }

    private final void zzb() {
        zzbfk zzbfk;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36893H5)).booleanValue() && this.f41783d.compareAndSet(false, true) && (zzbfk = this.f41782c.f33469c0) != null && zzbfk.f21077b == 3) {
            mo30919B0(new wc1(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public final /* synthetic */ void mo35909E0(ad1 ad1) throws Exception {
        ad1.mo18104g(this.f41782c.f33469c0);
    }

    public final void zzh() {
        if (this.f41782c.f33466b == 1) {
            zzb();
        }
    }

    public final void zzl() {
        int i = this.f41782c.f33466b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
