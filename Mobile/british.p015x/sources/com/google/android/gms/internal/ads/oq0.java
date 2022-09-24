package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class oq0 implements Runnable {

    /* renamed from: b */
    private final zp0 f36575b;

    /* renamed from: c */
    private boolean f36576c = false;

    oq0(zp0 zp0) {
        this.f36575b = zp0;
    }

    /* renamed from: c */
    private final void m35793c() {
        d33 d33 = zzt.zza;
        d33.removeCallbacks(this);
        d33.postDelayed(this, 250);
    }

    /* renamed from: a */
    public final void mo33979a() {
        this.f36576c = true;
        this.f36575b.mo19078s();
    }

    /* renamed from: b */
    public final void mo33980b() {
        this.f36576c = false;
        m35793c();
    }

    public final void run() {
        if (!this.f36576c) {
            this.f36575b.mo19078s();
            m35793c();
        }
    }
}
