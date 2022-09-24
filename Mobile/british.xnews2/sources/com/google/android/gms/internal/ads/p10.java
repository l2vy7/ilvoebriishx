package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p10 {

    /* renamed from: a */
    private MotionEvent f37274a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b */
    private MotionEvent f37275b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c */
    private final Context f37276c;

    /* renamed from: d */
    private final ScheduledExecutorService f37277d;

    /* renamed from: e */
    private final r10 f37278e;

    public p10(Context context, ScheduledExecutorService scheduledExecutorService, r10 r10, byte[] bArr) {
        this.f37276c = context;
        this.f37277d = scheduledExecutorService;
        this.f37278e = r10;
    }

    /* renamed from: a */
    public final mb3<String> mo34035a() {
        return (sa3) bb3.m30655o(sa3.m37369D(bb3.m30649i(null)), d20.f30597c.mo34648e().longValue(), TimeUnit.MILLISECONDS, this.f37277d);
    }

    /* renamed from: b */
    public final void mo34036b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f37274a.getEventTime()) {
            this.f37274a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.f37275b.getEventTime()) {
            this.f37275b = MotionEvent.obtain(motionEvent);
        }
    }
}
