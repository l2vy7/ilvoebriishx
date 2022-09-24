package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9944w4 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzks f46826b;

    /* renamed from: c */
    final /* synthetic */ zzp f46827c;

    /* renamed from: d */
    final /* synthetic */ C9716a5 f46828d;

    C9944w4(C9716a5 a5Var, zzks zzks, zzp zzp) {
        this.f46828d = a5Var;
        this.f46826b = zzks;
        this.f46827c = zzp;
    }

    public final void run() {
        this.f46828d.f46149b.mo39285a();
        if (this.f46826b.mo39366C0() == null) {
            this.f46828d.f46149b.mo39307t(this.f46826b, this.f46827c);
        } else {
            this.f46828d.f46149b.mo39271A(this.f46826b, this.f46827c);
        }
    }
}
