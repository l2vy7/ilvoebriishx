package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.s3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8142s3 {

    /* renamed from: a */
    private final List<C8281w> f38860a;

    /* renamed from: b */
    private final ad4[] f38861b;

    public C8142s3(List<C8281w> list) {
        this.f38860a = list;
        this.f38861b = new ad4[list.size()];
    }

    /* renamed from: a */
    public final void mo34654a(long j, uq2 uq2) {
        nb4.m35124a(j, uq2, this.f38861b);
    }

    /* renamed from: b */
    public final void mo34655b(yb4 yb4, C7633e4 e4Var) {
        String str;
        for (int i = 0; i < this.f38861b.length; i++) {
            e4Var.mo31471c();
            ad4 m = yb4.mo18211m(e4Var.mo31469a(), 3);
            C8281w wVar = this.f38860a.get(i);
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
            String str3 = wVar.f40608a;
            if (str3 == null) {
                str3 = e4Var.mo31470b();
            }
            ge4 ge4 = new ge4();
            ge4.mo32081h(str3);
            ge4.mo32093s(str2);
            ge4.mo32095u(wVar.f40611d);
            ge4.mo32085k(wVar.f40610c);
            ge4.mo32072c0(wVar.f40605D);
            ge4.mo32083i(wVar.f40621n);
            m.mo30354a(ge4.mo32099y());
            this.f38861b[i] = m;
        }
    }
}
