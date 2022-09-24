package com.google.android.gms.internal.ads;

import p149t.C6077a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class eo1 implements hb1 {

    /* renamed from: b */
    private final im1 f31442b;

    /* renamed from: c */
    private final nm1 f31443c;

    public eo1(im1 im1, nm1 nm1) {
        this.f31442b = im1;
        this.f31443c = nm1;
    }

    public final void zzl() {
        if (this.f31442b.mo32671c0() != null) {
            xt0 Y = this.f31442b.mo32665Y();
            xt0 Z = this.f31442b.mo32666Z();
            if (Y == null) {
                Y = Z != null ? Z : null;
            }
            if (this.f31443c.mo33564c() && Y != null) {
                Y.mo18321Z("onSdkImpression", new C6077a());
            }
        }
    }
}
