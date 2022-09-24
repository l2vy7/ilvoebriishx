package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ca2 implements zzf {

    /* renamed from: a */
    private final ka1 f30301a;

    /* renamed from: b */
    private final fb1 f30302b;

    /* renamed from: c */
    private final ii1 f30303c;

    /* renamed from: d */
    private final ai1 f30304d;

    /* renamed from: e */
    private final u21 f30305e;

    /* renamed from: f */
    final AtomicBoolean f30306f = new AtomicBoolean(false);

    ca2(ka1 ka1, fb1 fb1, ii1 ii1, ai1 ai1, u21 u21) {
        this.f30301a = ka1;
        this.f30302b = fb1;
        this.f30303c = ii1;
        this.f30304d = ai1;
        this.f30305e = u21;
    }

    public final synchronized void zza(View view) {
        if (this.f30306f.compareAndSet(false, true)) {
            this.f30305e.zzl();
            this.f30304d.mo30383E0(view);
        }
    }

    public final void zzb() {
        if (this.f30306f.get()) {
            this.f30301a.onAdClicked();
        }
    }

    public final void zzc() {
        if (this.f30306f.get()) {
            this.f30302b.zza();
            this.f30303c.zza();
        }
    }
}
