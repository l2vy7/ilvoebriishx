package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.yi2;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class df2<S extends yi2<?>> {

    /* renamed from: a */
    public final mb3<S> f30733a;

    /* renamed from: b */
    private final long f30734b;

    /* renamed from: c */
    private final C6483e f30735c;

    public df2(mb3<S> mb3, long j, C6483e eVar) {
        this.f30733a = mb3;
        this.f30735c = eVar;
        this.f30734b = eVar.elapsedRealtime() + j;
    }

    /* renamed from: a */
    public final boolean mo31230a() {
        return this.f30734b < this.f30735c.elapsedRealtime();
    }
}
