package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class op0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ qp0 f36568b;

    op0(qp0 qp0) {
        this.f36568b = qp0;
    }

    public final void run() {
        if (this.f36568b.f38237s != null) {
            if (!this.f36568b.f38238t) {
                this.f36568b.f38237s.zzg();
                this.f36568b.f38238t = true;
            }
            this.f36568b.f38237s.zze();
        }
    }
}
