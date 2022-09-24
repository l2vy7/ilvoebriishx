package com.google.ads.interactivemedia.p038v3.internal;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xe */
/* compiled from: IMASDK */
final class C4471xe {

    /* renamed from: a */
    private final List<C4120ke> f19535a;

    /* renamed from: b */
    private final C4327rw[] f19536b;

    public C4471xe(List<C4120ke> list) {
        this.f19535a = list;
        this.f19536b = new C4327rw[list.size()];
    }

    /* renamed from: a */
    public final void mo16766a(C4309re reVar, C4469xc xcVar) {
        String str;
        for (int i = 0; i < this.f19536b.length; i++) {
            xcVar.mo16763a();
            C4327rw ba = reVar.mo13362ba(xcVar.mo16764b(), 3);
            C4120ke keVar = this.f19535a.get(i);
            String str2 = keVar.f17681l;
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
            aup.m14886q(z, str);
            C4119kd kdVar = new C4119kd();
            kdVar.mo16107S(xcVar.mo16765c());
            kdVar.mo16120ae(str2);
            kdVar.mo16122ag(keVar.f17673d);
            kdVar.mo16110V(keVar.f17672c);
            kdVar.mo16094F(keVar.f17667D);
            kdVar.mo16108T(keVar.f17683n);
            ba.mo13403a(kdVar.mo16115a());
            this.f19536b[i] = ba;
        }
    }

    /* renamed from: b */
    public final void mo16767b(long j, alw alw) {
        if (alw.mo13947e() >= 9) {
            int w = alw.mo13965w();
            int w2 = alw.mo13965w();
            int o = alw.mo13957o();
            if (w == 434 && w2 == 1195456820 && o == 3) {
                C4038hd.m17328n(j, alw, this.f19536b);
            }
        }
    }
}
