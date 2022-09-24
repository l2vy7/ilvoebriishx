package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9809j4 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzab f46375b;

    /* renamed from: c */
    final /* synthetic */ zzp f46376c;

    /* renamed from: d */
    final /* synthetic */ C9716a5 f46377d;

    C9809j4(C9716a5 a5Var, zzab zzab, zzp zzp) {
        this.f46377d = a5Var;
        this.f46375b = zzab;
        this.f46376c = zzp;
    }

    public final void run() {
        this.f46377d.f46149b.mo39285a();
        if (this.f46375b.f46927d.mo39366C0() == null) {
            this.f46377d.f46149b.mo39306s(this.f46375b, this.f46376c);
        } else {
            this.f46377d.f46149b.mo39312y(this.f46375b, this.f46376c);
        }
    }
}
