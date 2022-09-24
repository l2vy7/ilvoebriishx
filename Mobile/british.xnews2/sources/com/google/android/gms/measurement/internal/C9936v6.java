package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.v6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9936v6 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzp f46805b;

    /* renamed from: c */
    final /* synthetic */ boolean f46806c;

    /* renamed from: d */
    final /* synthetic */ zzks f46807d;

    /* renamed from: e */
    final /* synthetic */ C9918t7 f46808e;

    C9936v6(C9918t7 t7Var, zzp zzp, boolean z, zzks zzks) {
        this.f46808e = t7Var;
        this.f46805b = zzp;
        this.f46806c = z;
        this.f46807d = zzks;
    }

    public final void run() {
        zzks zzks;
        C9918t7 t7Var = this.f46808e;
        C11030e H = t7Var.f46763d;
        if (H == null) {
            t7Var.f21269a.mo19276j().mo19282q().mo38856a("Discarding data. Failed to set user property");
            return;
        }
        C4604n.m20098k(this.f46805b);
        C9918t7 t7Var2 = this.f46808e;
        if (this.f46806c) {
            zzks = null;
        } else {
            zzks = this.f46807d;
        }
        t7Var2.mo39220q(H, zzks, this.f46805b);
        this.f46808e.m45383E();
    }
}
