package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ab1 extends cg1<qa1> implements qa1 {

    /* renamed from: c */
    private final ScheduledExecutorService f29582c;

    /* renamed from: d */
    private ScheduledFuture<?> f29583d;

    /* renamed from: e */
    private boolean f29584e = false;

    /* renamed from: f */
    private final boolean f29585f;

    public ab1(za1 za1, Set<yh1<qa1>> set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f29582c = scheduledExecutorService;
        this.f29585f = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37119i7)).booleanValue();
        mo30921s0(za1, executor);
    }

    /* renamed from: E0 */
    public final void mo30336E0() {
        if (this.f29585f) {
            this.f29583d = this.f29582c.schedule(new ua1(this), (long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37128j7)).intValue(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: d */
    public final void mo30337d(zzbew zzbew) {
        mo30919B0(new ra1(zzbew));
    }

    /* renamed from: j0 */
    public final void mo30338j0(fk1 fk1) {
        if (this.f29585f) {
            if (!this.f29584e) {
                ScheduledFuture<?> scheduledFuture = this.f29583d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
            } else {
                return;
            }
        }
        mo30919B0(new sa1(fk1));
    }

    public final void zzb() {
        mo30919B0(ta1.f39362a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        synchronized (this) {
            co0.zzg("Timeout waiting for show call succeed to be called.");
            mo30338j0(new fk1("Timeout for show call succeed."));
            this.f29584e = true;
        }
    }

    public final synchronized void zzd() {
        if (this.f29585f) {
            ScheduledFuture<?> scheduledFuture = this.f29583d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }
}
