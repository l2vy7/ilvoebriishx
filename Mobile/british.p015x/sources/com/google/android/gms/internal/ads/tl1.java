package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tl1 implements uu3<e31> {

    /* renamed from: a */
    private final iv3<C7580cn> f39443a;

    /* renamed from: b */
    private final iv3<Executor> f39444b;

    /* renamed from: c */
    private final iv3<Context> f39445c;

    /* renamed from: d */
    private final iv3<C6483e> f39446d;

    public tl1(iv3<C7580cn> iv3, iv3<Executor> iv32, iv3<Context> iv33, iv3<C6483e> iv34) {
        this.f39443a = iv3;
        this.f39444b = iv32;
        this.f39445c = iv33;
        this.f39446d = iv34;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new e31(this.f39444b.zzb(), new q21(this.f39445c.zzb(), this.f39443a.zzb()), this.f39446d.zzb());
    }
}
