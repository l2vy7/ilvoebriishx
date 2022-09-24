package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ia1 implements uu3<hl0> {

    /* renamed from: a */
    private final ha1 f33161a;

    /* renamed from: b */
    private final iv3<Context> f33162b;

    /* renamed from: c */
    private final iv3<zzcjf> f33163c;

    /* renamed from: d */
    private final iv3<ir2> f33164d;

    /* renamed from: e */
    private final iv3<el0> f33165e;

    public ia1(ha1 ha1, iv3<Context> iv3, iv3<zzcjf> iv32, iv3<ir2> iv33, iv3<el0> iv34) {
        this.f33161a = ha1;
        this.f33162b = iv3;
        this.f33163c = iv32;
        this.f33164d = iv33;
        this.f33165e = iv34;
    }

    public final /* synthetic */ Object zzb() {
        Context zzb = this.f33162b.zzb();
        zzcjf a = ((kw0) this.f33163c).mo33191a();
        ir2 a2 = ((f71) this.f33164d).mo31778a();
        el0 el0 = new el0();
        zzcgc zzcgc = a2.f33439B;
        if (zzcgc != null) {
            return new bl0(zzb, a, zzcgc, a2.f33494t.f36096b, el0, (byte[]) null);
        }
        return null;
    }
}
