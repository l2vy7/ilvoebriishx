package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g31 implements C7510ao {

    /* renamed from: a */
    private final ScheduledExecutorService f32123a;

    /* renamed from: b */
    private final C6483e f32124b;
    @GuardedBy("this")

    /* renamed from: c */
    private ScheduledFuture<?> f32125c;
    @GuardedBy("this")

    /* renamed from: d */
    private long f32126d = -1;
    @GuardedBy("this")

    /* renamed from: e */
    private long f32127e = -1;
    @GuardedBy("this")

    /* renamed from: f */
    private Runnable f32128f = null;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f32129g = false;

    public g31(ScheduledExecutorService scheduledExecutorService, C6483e eVar) {
        this.f32123a = scheduledExecutorService;
        this.f32124b = eVar;
        zzt.zzb().mo18170c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo32004a() {
        if (!this.f32129g) {
            ScheduledFuture<?> scheduledFuture = this.f32125c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f32127e = -1;
            } else {
                this.f32125c.cancel(true);
                this.f32127e = this.f32126d - this.f32124b.elapsedRealtime();
            }
            this.f32129g = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo32005b() {
        ScheduledFuture<?> scheduledFuture;
        if (this.f32129g) {
            if (this.f32127e > 0 && (scheduledFuture = this.f32125c) != null && scheduledFuture.isCancelled()) {
                this.f32125c = this.f32123a.schedule(this.f32128f, this.f32127e, TimeUnit.MILLISECONDS);
            }
            this.f32129g = false;
        }
    }

    /* renamed from: c */
    public final synchronized void mo32006c(int i, Runnable runnable) {
        this.f32128f = runnable;
        long j = (long) i;
        this.f32126d = this.f32124b.elapsedRealtime() + j;
        this.f32125c = this.f32123a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public final void zza(boolean z) {
        if (z) {
            mo32005b();
        } else {
            mo32004a();
        }
    }
}
