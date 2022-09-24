package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.f5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7671f5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C8215u5 f31632b;

    /* renamed from: c */
    final /* synthetic */ C7708g5 f31633c;

    C7671f5(C7708g5 g5Var, C8215u5 u5Var) {
        this.f31633c = g5Var;
        this.f31632b = u5Var;
    }

    public final void run() {
        try {
            this.f31633c.f32143c.put(this.f31632b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
