package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.j7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9812j7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzp f46384b;

    /* renamed from: c */
    final /* synthetic */ boolean f46385c;

    /* renamed from: d */
    final /* synthetic */ zzab f46386d;

    /* renamed from: e */
    final /* synthetic */ zzab f46387e;

    /* renamed from: f */
    final /* synthetic */ C9918t7 f46388f;

    C9812j7(C9918t7 t7Var, boolean z, zzp zzp, boolean z2, zzab zzab, zzab zzab2) {
        this.f46388f = t7Var;
        this.f46384b = zzp;
        this.f46385c = z2;
        this.f46386d = zzab;
        this.f46387e = zzab2;
    }

    public final void run() {
        zzab zzab;
        C9918t7 t7Var = this.f46388f;
        C11030e H = t7Var.f46763d;
        if (H == null) {
            t7Var.f21269a.mo19276j().mo19282q().mo38856a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C4604n.m20098k(this.f46384b);
        C9918t7 t7Var2 = this.f46388f;
        if (this.f46385c) {
            zzab = null;
        } else {
            zzab = this.f46386d;
        }
        t7Var2.mo39220q(H, zzab, this.f46384b);
        this.f46388f.m45383E();
    }
}
