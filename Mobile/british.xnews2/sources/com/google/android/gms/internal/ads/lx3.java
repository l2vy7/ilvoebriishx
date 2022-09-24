package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lx3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f35279a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ov1 f35280b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public y74 f35281c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final o54 f35282d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public nw3 f35283e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final i84 f35284f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final a04 f35285g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Looper f35286h = d13.m20296a();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final oe3 f35287i = oe3.f36450c;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final kx3 f35288j = kx3.f34733g;

    /* renamed from: k */
    private boolean f35289k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final it0 f35290l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final qf3 f35291m = new qf3(0.97f, 1.03f, 1000, 1.0E-7f, xy3.m39691c(20), xy3.m39691c(500), 0.999f, (pe3) null);

    @Deprecated
    public lx3(Context context, it0 it0, byte[] bArr) {
        Context context2 = context;
        rb4 rb4 = new rb4();
        s74 s74 = new s74(context2);
        q44 q44 = new q44(context2, rb4);
        rg3 rg3 = new rg3();
        r84 d = r84.m36992d(context);
        ov1 ov1 = ov1.f36608a;
        a04 a04 = new a04(ov1);
        this.f35279a = context2;
        this.f35290l = it0;
        this.f35281c = s74;
        this.f35282d = q44;
        this.f35283e = rg3;
        this.f35284f = d;
        this.f35285g = a04;
        this.f35280b = ov1;
    }

    @Deprecated
    /* renamed from: g */
    public final lx3 mo33415g(nw3 nw3) {
        nu1.m20747f(!this.f35289k);
        this.f35283e = nw3;
        return this;
    }

    @Deprecated
    /* renamed from: h */
    public final lx3 mo33416h(y74 y74) {
        nu1.m20747f(!this.f35289k);
        this.f35281c = y74;
        return this;
    }

    @Deprecated
    /* renamed from: i */
    public final qx3 mo33417i() {
        nu1.m20747f(!this.f35289k);
        this.f35289k = true;
        return new qx3(this);
    }
}
