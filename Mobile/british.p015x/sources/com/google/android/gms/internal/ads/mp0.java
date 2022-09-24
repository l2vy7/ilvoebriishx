package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mp0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ int f35596b;

    /* renamed from: c */
    final /* synthetic */ int f35597c;

    /* renamed from: d */
    final /* synthetic */ qp0 f35598d;

    mp0(qp0 qp0, int i, int i2) {
        this.f35598d = qp0;
        this.f35596b = i;
        this.f35597c = i2;
    }

    public final void run() {
        if (this.f35598d.f38237s != null) {
            this.f35598d.f38237s.mo18700e(this.f35596b, this.f35597c);
        }
    }
}
