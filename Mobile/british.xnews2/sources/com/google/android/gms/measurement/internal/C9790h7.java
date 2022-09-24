package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import p255u5.C11030e;

/* renamed from: com.google.android.gms.measurement.internal.h7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9790h7 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzp f46332b;

    /* renamed from: c */
    final /* synthetic */ boolean f46333c;

    /* renamed from: d */
    final /* synthetic */ zzau f46334d;

    /* renamed from: e */
    final /* synthetic */ String f46335e;

    /* renamed from: f */
    final /* synthetic */ C9918t7 f46336f;

    C9790h7(C9918t7 t7Var, boolean z, zzp zzp, boolean z2, zzau zzau, String str) {
        this.f46336f = t7Var;
        this.f46332b = zzp;
        this.f46333c = z2;
        this.f46334d = zzau;
        this.f46335e = str;
    }

    public final void run() {
        zzau zzau;
        C9918t7 t7Var = this.f46336f;
        C11030e H = t7Var.f46763d;
        if (H == null) {
            t7Var.f21269a.mo19276j().mo19282q().mo38856a("Discarding data. Failed to send event to service");
            return;
        }
        C4604n.m20098k(this.f46332b);
        C9918t7 t7Var2 = this.f46336f;
        if (this.f46333c) {
            zzau = null;
        } else {
            zzau = this.f46334d;
        }
        t7Var2.mo39220q(H, zzau, this.f46332b);
        this.f46336f.m45383E();
    }
}
