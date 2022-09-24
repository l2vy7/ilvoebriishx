package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.h4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7743h4 {

    /* renamed from: a */
    private final List<C8281w> f32604a;

    /* renamed from: b */
    private final ad4[] f32605b;

    public C7743h4(List<C8281w> list) {
        this.f32604a = list;
        this.f32605b = new ad4[list.size()];
    }

    /* renamed from: a */
    public final void mo32328a(long j, uq2 uq2) {
        if (uq2.mo35239i() >= 9) {
            int m = uq2.mo35243m();
            int m2 = uq2.mo35243m();
            int s = uq2.mo35249s();
            if (m == 434 && m2 == 1195456820 && s == 3) {
                nb4.m35125b(j, uq2, this.f32605b);
            }
        }
    }

    /* renamed from: b */
    public final void mo32329b(yb4 yb4, C7633e4 e4Var) {
        String str;
        for (int i = 0; i < this.f32605b.length; i++) {
            e4Var.mo31471c();
            ad4 m = yb4.mo18211m(e4Var.mo31469a(), 3);
            C8281w wVar = this.f32604a.get(i);
            String str2 = wVar.f40619l;
            boolean z = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str2) && !MimeTypes.APPLICATION_CEA708.equals(str2)) {
                z = false;
            }
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str = "Invalid closed caption mime type provided: ".concat(valueOf);
            } else {
                str = new String("Invalid closed caption mime type provided: ");
            }
            nu1.m20746e(z, str);
            ge4 ge4 = new ge4();
            ge4.mo32081h(e4Var.mo31470b());
            ge4.mo32093s(str2);
            ge4.mo32095u(wVar.f40611d);
            ge4.mo32085k(wVar.f40610c);
            ge4.mo32072c0(wVar.f40605D);
            ge4.mo32083i(wVar.f40621n);
            m.mo30354a(ge4.mo32099y());
            this.f32605b[i] = m;
        }
    }
}
