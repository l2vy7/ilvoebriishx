package com.google.ads.interactivemedia.p039v3.internal;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wr */
/* compiled from: IMASDK */
public final class C4457wr {

    /* renamed from: a */
    private final List<C4120ke> f19476a;

    /* renamed from: b */
    private final C4327rw[] f19477b;

    public C4457wr(List<C4120ke> list) {
        this.f19476a = list;
        this.f19477b = new C4327rw[list.size()];
    }

    /* renamed from: a */
    public final void mo16757a(C4309re reVar, C4469xc xcVar) {
        String str;
        for (int i = 0; i < this.f19477b.length; i++) {
            xcVar.mo16763a();
            C4327rw ba = reVar.mo13362ba(xcVar.mo16764b(), 3);
            C4120ke keVar = this.f19476a.get(i);
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
            String str3 = keVar.f17670a;
            if (str3 == null) {
                str3 = xcVar.mo16765c();
            }
            C4119kd kdVar = new C4119kd();
            kdVar.mo16107S(str3);
            kdVar.mo16120ae(str2);
            kdVar.mo16122ag(keVar.f17673d);
            kdVar.mo16110V(keVar.f17672c);
            kdVar.mo16094F(keVar.f17667D);
            kdVar.mo16108T(keVar.f17683n);
            ba.mo13403a(kdVar.mo16115a());
            this.f19477b[i] = ba;
        }
    }

    /* renamed from: b */
    public final void mo16758b(long j, alw alw) {
        C4038hd.m17327m(j, alw, this.f19477b);
    }
}
