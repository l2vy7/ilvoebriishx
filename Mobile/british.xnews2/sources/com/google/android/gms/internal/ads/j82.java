package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j82 {

    /* renamed from: a */
    private final ns2 f20457a;

    /* renamed from: b */
    private final ft1 f20458b;

    /* renamed from: c */
    private final nv1 f20459c;

    /* renamed from: d */
    private final nw2 f20460d;

    public j82(ns2 ns2, ft1 ft1, nv1 nv1, nw2 nw2) {
        this.f20457a = ns2;
        this.f20458b = ft1;
        this.f20459c = nv1;
        this.f20460d = nw2;
    }

    /* renamed from: a */
    public final void mo18449a(lr2 lr2, ir2 ir2, int i, @Nullable v42 v42, long j) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37190q6)).booleanValue()) {
            mw2 b = mw2.m34936b("adapter_status");
            b.mo33607g(lr2);
            b.mo33606f(ir2);
            b.mo33603a("adapter_l", String.valueOf(j));
            b.mo33603a("sc", Integer.toString(i));
            if (v42 != null) {
                b.mo33603a("arec", Integer.toString(v42.mo35367b().f42935b));
                String a = this.f20457a.mo33737a(v42.getMessage());
                if (a != null) {
                    b.mo33603a("areec", a);
                }
            }
            et1 b2 = this.f20458b.mo18338b(ir2.f33495u);
            if (b2 != null) {
                b.mo33603a("ancn", b2.f20287a);
                zzcab zzcab = b2.f20288b;
                if (zzcab != null) {
                    b.mo33603a("adapter_v", zzcab.toString());
                }
                zzcab zzcab2 = b2.f20289c;
                if (zzcab2 != null) {
                    b.mo33603a("adapter_sv", zzcab2.toString());
                }
            }
            this.f20460d.mo31048a(b);
            return;
        }
        mv1 a2 = this.f20459c.mo33772a();
        a2.mo33599d(lr2);
        a2.mo33598c(ir2);
        a2.mo33597b("action", "adapter_status");
        a2.mo33597b("adapter_l", String.valueOf(j));
        a2.mo33597b("sc", Integer.toString(i));
        if (v42 != null) {
            a2.mo33597b("arec", Integer.toString(v42.mo35367b().f42935b));
            String a3 = this.f20457a.mo33737a(v42.getMessage());
            if (a3 != null) {
                a2.mo33597b("areec", a3);
            }
        }
        et1 b3 = this.f20458b.mo18338b(ir2.f33495u);
        if (b3 != null) {
            a2.mo33597b("ancn", b3.f20287a);
            zzcab zzcab3 = b3.f20288b;
            if (zzcab3 != null) {
                a2.mo33597b("adapter_v", zzcab3.toString());
            }
            zzcab zzcab4 = b3.f20289c;
            if (zzcab4 != null) {
                a2.mo33597b("adapter_sv", zzcab4.toString());
            }
        }
        a2.mo33601f();
    }
}
