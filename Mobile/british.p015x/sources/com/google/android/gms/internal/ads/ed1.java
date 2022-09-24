package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ed1 extends cg1<fd1> {

    /* renamed from: c */
    private final ScheduledExecutorService f31311c;

    /* renamed from: d */
    private final C6483e f31312d;
    @GuardedBy("this")

    /* renamed from: e */
    private long f31313e = -1;
    @GuardedBy("this")

    /* renamed from: f */
    private long f31314f = -1;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f31315g = false;
    @GuardedBy("this")

    /* renamed from: h */
    private ScheduledFuture<?> f31316h;

    public ed1(ScheduledExecutorService scheduledExecutorService, C6483e eVar) {
        super(Collections.emptySet());
        this.f31311c = scheduledExecutorService;
        this.f31312d = eVar;
    }

    /* renamed from: G0 */
    private final synchronized void m31787G0(long j) {
        ScheduledFuture<?> scheduledFuture = this.f31316h;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f31316h.cancel(true);
        }
        this.f31313e = this.f31312d.elapsedRealtime() + j;
        this.f31316h = this.f31311c.schedule(new dd1(this, (cd1) null), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: E0 */
    public final synchronized void mo31543E0(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis((long) i);
            if (this.f31315g) {
                long j = this.f31314f;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.f31314f = millis;
                return;
            }
            long elapsedRealtime = this.f31312d.elapsedRealtime();
            long j2 = this.f31313e;
            if (elapsedRealtime > j2 || j2 - this.f31312d.elapsedRealtime() > millis) {
                m31787G0(millis);
            }
        }
    }

    public final synchronized void zza() {
        this.f31315g = false;
        m31787G0(0);
    }

    public final synchronized void zzb() {
        if (!this.f31315g) {
            ScheduledFuture<?> scheduledFuture = this.f31316h;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.f31314f = -1;
            } else {
                this.f31316h.cancel(true);
                this.f31314f = this.f31313e - this.f31312d.elapsedRealtime();
            }
            this.f31315g = true;
        }
    }

    public final synchronized void zzc() {
        if (this.f31315g) {
            if (this.f31314f > 0 && this.f31316h.isCancelled()) {
                m31787G0(this.f31314f);
            }
            this.f31315g = false;
        }
    }
}
