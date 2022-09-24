package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class st1 implements uu3<C7728gq> {

    /* renamed from: a */
    private final iv3<Context> f39055a;

    /* renamed from: b */
    private final iv3<String> f39056b;

    /* renamed from: c */
    private final iv3<zzcjf> f39057c;

    /* renamed from: d */
    private final iv3<C8059pq> f39058d;

    /* renamed from: e */
    private final iv3<String> f39059e;

    public st1(iv3<Context> iv3, iv3<String> iv32, iv3<zzcjf> iv33, iv3<C8059pq> iv34, iv3<String> iv35) {
        this.f39055a = iv3;
        this.f39056b = iv32;
        this.f39057c = iv33;
        this.f39058d = iv34;
        this.f39059e = iv35;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = ((zv0) this.f39055a).mo36135a();
        String a2 = ((oz1) this.f39056b).zzb();
        zzcjf a3 = ((kw0) this.f39057c).mo33191a();
        C8059pq zzb = this.f39058d.zzb();
        String zzb2 = this.f39059e.zzb();
        C7728gq gqVar = new C7728gq(new C7913lq(a));
        C7731gt E = C7769ht.m32940E();
        E.mo32285y(a3.f43037c);
        E.mo32284C(a3.f43038d);
        E.mo32283B(true != a3.f43039e ? 2 : 0);
        gqVar.mo32216b(new rt1(zzb, a2, (C7769ht) E.mo32424p(), zzb2));
        return gqVar;
    }
}
