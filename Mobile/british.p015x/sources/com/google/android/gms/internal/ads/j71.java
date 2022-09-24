package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j71 implements zzo {

    /* renamed from: b */
    private final ub1 f33792b;

    /* renamed from: c */
    private final AtomicBoolean f33793c = new AtomicBoolean(false);

    /* renamed from: d */
    private final AtomicBoolean f33794d = new AtomicBoolean(false);

    public j71(ub1 ub1) {
        this.f33792b = ub1;
    }

    /* renamed from: b */
    private final void m33565b() {
        if (!this.f33794d.get()) {
            this.f33794d.set(true);
            this.f33792b.zza();
        }
    }

    /* renamed from: a */
    public final boolean mo32863a() {
        return this.f33793c.get();
    }

    public final void zzb() {
        this.f33792b.zzc();
    }

    public final void zzbK() {
        m33565b();
    }

    public final void zzbS() {
    }

    public final void zzbz() {
    }

    public final void zze() {
    }

    public final void zzf(int i) {
        this.f33793c.set(true);
        m33565b();
    }
}
