package com.google.ads.interactivemedia.p039v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfw */
/* compiled from: IMASDK */
final class bfw extends bfi {

    /* renamed from: a */
    final /* synthetic */ boolean f16256a;

    /* renamed from: b */
    final /* synthetic */ boolean f16257b;

    /* renamed from: c */
    final /* synthetic */ bet f16258c;

    /* renamed from: d */
    final /* synthetic */ biu f16259d;

    /* renamed from: e */
    final /* synthetic */ bfx f16260e;

    /* renamed from: f */
    private bfi f16261f;

    bfw(bfx bfx, boolean z, boolean z2, bet bet, biu biu) {
        this.f16260e = bfx;
        this.f16256a = z;
        this.f16257b = z2;
        this.f16258c = bet;
        this.f16259d = biu;
    }

    /* renamed from: a */
    private final bfi m15832a() {
        bfi bfi = this.f16261f;
        if (bfi != null) {
            return bfi;
        }
        bfi c = this.f16258c.mo14966c(this.f16260e, this.f16259d);
        this.f16261f = c;
        return c;
    }

    public final Object read(biw biw) throws IOException {
        if (!this.f16256a) {
            return m15832a().read(biw);
        }
        biw.mo15098m();
        return null;
    }

    public final void write(biy biy, Object obj) throws IOException {
        if (this.f16257b) {
            biy.mo15114g();
        } else {
            m15832a().write(biy, obj);
        }
    }
}
