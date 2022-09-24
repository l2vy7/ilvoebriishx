package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9820k4 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ zzab f46403b;

    /* renamed from: c */
    final /* synthetic */ C9716a5 f46404c;

    C9820k4(C9716a5 a5Var, zzab zzab) {
        this.f46404c = a5Var;
        this.f46403b = zzab;
    }

    public final void run() {
        this.f46404c.f46149b.mo39285a();
        if (this.f46403b.f46927d.mo39366C0() == null) {
            this.f46404c.f46149b.mo39305q(this.f46403b);
        } else {
            this.f46404c.f46149b.mo39311x(this.f46403b);
        }
    }
}
