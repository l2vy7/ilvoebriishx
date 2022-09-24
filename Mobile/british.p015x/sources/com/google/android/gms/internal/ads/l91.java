package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l91 implements ma1, qh1, mf1, db1 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final fb1 f34951b;

    /* renamed from: c */
    private final ir2 f34952c;

    /* renamed from: d */
    private final ScheduledExecutorService f34953d;

    /* renamed from: e */
    private final Executor f34954e;

    /* renamed from: f */
    private final ub3<Boolean> f34955f = ub3.m38262D();

    /* renamed from: g */
    private ScheduledFuture<?> f34956g;

    public l91(fb1 fb1, ir2 ir2, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f34951b = fb1;
        this.f34952c = ir2;
        this.f34953d = scheduledExecutorService;
        this.f34954e = executor;
    }

    /* renamed from: N */
    public final synchronized void mo18122N(zzbew zzbew) {
        if (!this.f34955f.isDone()) {
            ScheduledFuture<?> scheduledFuture = this.f34956g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f34955f.mo18664w(new Exception());
        }
    }

    /* renamed from: a */
    public final void mo18123a(kj0 kj0, String str, String str2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo33292c() {
        synchronized (this) {
            if (!this.f34955f.isDone()) {
                this.f34955f.mo18663v(Boolean.TRUE);
            }
        }
    }

    /* renamed from: w */
    public final void mo18127w() {
    }

    public final void zzc() {
    }

    public final synchronized void zzd() {
        if (!this.f34955f.isDone()) {
            ScheduledFuture<?> scheduledFuture = this.f34956g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f34955f.mo18663v(Boolean.TRUE);
        }
    }

    public final void zze() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37095g1)).booleanValue()) {
            ir2 ir2 = this.f34952c;
            if (ir2.f33459V != 2) {
                return;
            }
            if (ir2.f33492r == 0) {
                this.f34951b.zza();
                return;
            }
            bb3.m30658r(this.f34955f, new k91(this), this.f34954e);
            this.f34956g = this.f34953d.schedule(new j91(this), (long) this.f34952c.f33492r, TimeUnit.MILLISECONDS);
        }
    }

    public final void zzf() {
    }

    public final void zzj() {
    }

    public final void zzm() {
    }

    public final void zzo() {
        int i = this.f34952c.f33459V;
        if (i == 0 || i == 1) {
            this.f34951b.zza();
        }
    }

    public final void zzr() {
    }
}
