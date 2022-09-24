package com.google.android.gms.internal.ads;

import android.content.Context;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class y62 implements gk1 {

    /* renamed from: a */
    private final ir2 f41717a;

    /* renamed from: b */
    private final te0 f41718b;

    /* renamed from: c */
    private final boolean f41719c;

    /* renamed from: d */
    private fb1 f41720d = null;

    y62(ir2 ir2, te0 te0, boolean z) {
        this.f41717a = ir2;
        this.f41718b = te0;
        this.f41719c = z;
    }

    /* renamed from: a */
    public final void mo32020a(boolean z, Context context, ab1 ab1) throws fk1 {
        boolean z2;
        try {
            if (this.f41719c) {
                z2 = this.f41718b.mo31557R(C10489b.m48195m6(context));
            } else {
                z2 = this.f41718b.mo31558W(C10489b.m48195m6(context));
            }
            if (!z2) {
                throw new fk1("Adapter failed to show.");
            } else if (this.f41720d != null) {
                if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37095g1)).booleanValue() && this.f41717a.f33459V == 2) {
                    this.f41720d.zza();
                }
            }
        } catch (Throwable th) {
            throw new fk1(th);
        }
    }

    /* renamed from: b */
    public final void mo35883b(fb1 fb1) {
        this.f41720d = fb1;
    }
}
