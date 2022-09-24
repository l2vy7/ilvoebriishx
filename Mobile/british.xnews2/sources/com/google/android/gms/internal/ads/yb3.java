package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yb3<V> extends ra3<V> {
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: i */
    public mb3<V> f21019i;
    /* access modifiers changed from: private */
    @CheckForNull

    /* renamed from: j */
    public ScheduledFuture<?> f21020j;

    private yb3(mb3<V> mb3) {
        Objects.requireNonNull(mb3);
        this.f21019i = mb3;
    }

    /* renamed from: F */
    static <V> mb3<V> m21223F(mb3<V> mb3, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        yb3 yb3 = new yb3(mb3);
        vb3 vb3 = new vb3(yb3);
        yb3.f21020j = scheduledExecutorService.schedule(vb3, j, timeUnit);
        mb3.zzc(vb3, pa3.INSTANCE);
        return yb3;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: h */
    public final String mo18119h() {
        mb3<V> mb3 = this.f21019i;
        ScheduledFuture<?> scheduledFuture = this.f21020j;
        if (mb3 == null) {
            return null;
        }
        String obj = mb3.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 14);
        sb.append("inputFuture=[");
        sb.append(obj);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 43);
        sb3.append(sb2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo18120i() {
        mo18661t(this.f21019i);
        ScheduledFuture<?> scheduledFuture = this.f21020j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f21019i = null;
        this.f21020j = null;
    }
}
