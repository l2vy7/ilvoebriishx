package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ea2 implements r42<m41> {

    /* renamed from: a */
    private final Context f31286a;

    /* renamed from: b */
    private final k51 f31287b;

    /* renamed from: c */
    private final l10 f31288c;

    /* renamed from: d */
    private final nb3 f31289d;

    /* renamed from: e */
    private final dw2 f31290e;

    public ea2(Context context, k51 k51, dw2 dw2, nb3 nb3, l10 l10) {
        this.f31286a = context;
        this.f31287b = k51;
        this.f31290e = dw2;
        this.f31289d = nb3;
        this.f31288c = l10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f33494t;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo31509a(com.google.android.gms.internal.ads.ur2 r1, com.google.android.gms.internal.ads.ir2 r2) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.l10 r1 = r0.f31288c
            if (r1 == 0) goto L_0x000e
            com.google.android.gms.internal.ads.nr2 r1 = r2.f33494t
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.f36095a
            if (r1 == 0) goto L_0x000e
            r1 = 1
            return r1
        L_0x000e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ea2.mo31509a(com.google.android.gms.internal.ads.ur2, com.google.android.gms.internal.ads.ir2):boolean");
    }

    /* renamed from: b */
    public final mb3<m41> mo31510b(ur2 ur2, ir2 ir2) {
        n41 a = this.f31287b.mo33031a(new e71(ur2, ir2, (String) null), new ba2(this, new View(this.f31286a), (xt0) null, z92.f42351a, ir2.f33496v.get(0)));
        ca2 k = a.mo33630k();
        nr2 nr2 = ir2.f33494t;
        f10 f10 = new f10(k, nr2.f36096b, nr2.f36095a);
        dw2 dw2 = this.f31290e;
        return mv2.m34933d(new aa2(this, f10), this.f31289d, wv2.CUSTOM_RENDER_SYN, dw2).mo35043b(wv2.CUSTOM_RENDER_ACK).mo35045d(bb3.m30649i(a.mo33627h())).mo35042a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo31511c(f10 f10) throws Exception {
        this.f31288c.mo32818h4(f10);
    }
}
