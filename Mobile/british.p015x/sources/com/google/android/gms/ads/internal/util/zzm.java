package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zzm implements Runnable {

    /* renamed from: b */
    final /* synthetic */ Context f27933b;

    /* renamed from: c */
    final /* synthetic */ zzt f27934c;

    zzm(zzt zzt, Context context) {
        this.f27934c = zzt;
        this.f27933b = context;
    }

    public final void run() {
        synchronized (this.f27934c.f27942d) {
            this.f27934c.f27943e = zzt.m28842a(this.f27933b);
            this.f27934c.f27942d.notifyAll();
        }
    }
}
