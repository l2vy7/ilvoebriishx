package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.yi2;
import java.util.concurrent.atomic.AtomicReference;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ef2<S extends yi2> implements zi2<S> {

    /* renamed from: a */
    private final AtomicReference<df2<S>> f31348a = new AtomicReference<>();

    /* renamed from: b */
    private final C6483e f31349b;

    /* renamed from: c */
    private final zi2<S> f31350c;

    /* renamed from: d */
    private final long f31351d;

    public ef2(zi2<S> zi2, long j, C6483e eVar) {
        this.f31349b = eVar;
        this.f31350c = zi2;
        this.f31351d = j;
    }

    public final mb3<S> zzb() {
        df2 df2 = this.f31348a.get();
        if (df2 == null || df2.mo31230a()) {
            df2 = new df2(this.f31350c.zzb(), this.f31351d, this.f31349b);
            this.f31348a.set(df2);
        }
        return df2.f30733a;
    }
}
