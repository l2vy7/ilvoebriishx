package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yp0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ boolean f41947b;

    /* renamed from: c */
    final /* synthetic */ zp0 f41948c;

    yp0(zp0 zp0, boolean z) {
        this.f41948c = zp0;
        this.f41947b = z;
    }

    public final void run() {
        this.f41948c.m21295k("windowVisibilityChanged", "isVisible", String.valueOf(this.f41947b));
    }
}
