package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o92 implements uu3<n92> {

    /* renamed from: a */
    private final iv3<Context> f36345a;

    /* renamed from: b */
    private final iv3<Executor> f36346b;

    /* renamed from: c */
    private final iv3<ds1> f36347c;

    public o92(iv3<Context> iv3, iv3<Executor> iv32, iv3<ds1> iv33) {
        this.f36345a = iv3;
        this.f36346b = iv32;
        this.f36347c = iv33;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new n92(this.f36345a.zzb(), this.f36346b.zzb(), this.f36347c.zzb());
    }
}
