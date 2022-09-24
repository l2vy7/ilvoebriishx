package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rw2 implements nw2 {

    /* renamed from: a */
    private final nw2 f38790a;

    /* renamed from: b */
    private final Queue<mw2> f38791b = new LinkedBlockingQueue();

    /* renamed from: c */
    private final int f38792c = ((Integer) C8311wv.m39277c().mo18570b(p00.f37216t6)).intValue();

    /* renamed from: d */
    private final AtomicBoolean f38793d = new AtomicBoolean(false);

    public rw2(nw2 nw2, ScheduledExecutorService scheduledExecutorService) {
        this.f38790a = nw2;
        long intValue = (long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37208s6)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new qw2(this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public static /* synthetic */ void m37263c(rw2 rw2) {
        while (!rw2.f38791b.isEmpty()) {
            rw2.f38790a.mo31048a(rw2.f38791b.remove());
        }
    }

    /* renamed from: a */
    public final void mo31048a(mw2 mw2) {
        if (this.f38791b.size() < this.f38792c) {
            this.f38791b.offer(mw2);
        } else if (!this.f38793d.getAndSet(true)) {
            Queue<mw2> queue = this.f38791b;
            mw2 b = mw2.m34936b("dropped_event");
            Map<String, String> j = mw2.mo33610j();
            if (j.containsKey("action")) {
                b.mo33603a("dropped_action", j.get("action"));
            }
            queue.offer(b);
        }
    }

    /* renamed from: b */
    public final String mo31049b(mw2 mw2) {
        return this.f38790a.mo31049b(mw2);
    }
}
