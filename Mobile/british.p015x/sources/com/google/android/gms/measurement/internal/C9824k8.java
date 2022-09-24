package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import p006a5.C6483e;

/* renamed from: com.google.android.gms.measurement.internal.k8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9824k8 {

    /* renamed from: a */
    private final C6483e f46411a;

    /* renamed from: b */
    private long f46412b;

    public C9824k8(C6483e eVar) {
        C4604n.m20098k(eVar);
        this.f46411a = eVar;
    }

    /* renamed from: a */
    public final void mo39043a() {
        this.f46412b = 0;
    }

    /* renamed from: b */
    public final void mo39044b() {
        this.f46412b = this.f46411a.elapsedRealtime();
    }

    /* renamed from: c */
    public final boolean mo39045c(long j) {
        return this.f46412b == 0 || this.f46411a.elapsedRealtime() - this.f46412b >= 3600000;
    }
}
